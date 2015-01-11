package en.ar.picture.webpicture.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import co.edu.uniandes.enar.picture.Model;
import en.ar.picture.webpicture.core.build.dsl.util.DSLLoader;
import en.ar.picture.webpicture.core.build.generator.Diagrammer;
import en.ar.picture.webpicture.core.build.generator.ModelBuilder;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;
import en.ar.picture.webpicture.core.build.metamodel.util.XMIMetamodelLoader;
import en.ar.picture.webpicture.core.dao.EditorDAO;
import en.ar.picture.webpicture.core.dao.DiagramDAO;
import en.ar.picture.webpicture.core.files.FileManager;
import en.ar.picture.webpicture.core.util.DateParser;

/**
 * Clase singleton del sistema 
 * @author hellspawn
 */
public class Webpicture 
{	
	//------------------------------------------------------------------
	//Atributos 
	//------------------------------------------------------------------

	/**
	 * Instancia singleton de webpicture 
	 */
	private static Webpicture instance = null;
	
	/**
	 * Instancia de file manager 
	 */
	private FileManager fileManager;
	
	/**
	 * Instancia de dateParser
	 */
	private DateParser dateParser;
	
	/**
	 * Instancia de acceso a los editores en DB
	 */
	private EditorDAO editorDAO;
	
	/**
	 * Instancia de acceso a los diagramas en DB
	 */
	private DiagramDAO diagramDAO;
	
	/**
	 * Instancia del modulo de carga del modelo del lenguaje Picture
	 */
	private DSLLoader pictureLoader;
	
	/**
	 * Instancia del modulo de carga del metamodelo ecore
	 */
	private XMIMetamodelLoader ecoreLoader;
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea una nueva instancia de webpicture
	 */
	protected Webpicture()
	{
		fileManager = new FileManager("NO_DIR");
		dateParser = new DateParser();
		editorDAO = new EditorDAO(dateParser);
		diagramDAO = new DiagramDAO(dateParser);
		pictureLoader = new DSLLoader();
		ecoreLoader = new XMIMetamodelLoader();
	}
	
	/**
	 * @return the instance
	 */
	public static Webpicture getInstance() {
		if(instance == null) {
	         instance = new Webpicture();
	      }
	      return instance;
	}


	
	//------------------------------------------------------------------
	//Metodos 
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo editor 
	 */
	/**
	 * Crea un nuevo editor a partir de un ecore y un picture 
	 * @param name - Nombre del editor 
	 * @param description - Descripcion del editor 
	 * @param author - Autor del editor 
	 * @param path - Ruta del editor 
	 * @return Editor generado con el identificador generado en la base de datos  
	 * @throws Exception - En el caso de que ocurra algun problema en la validación de los archivos y la generación del editor 
	 */
	@SuppressWarnings("static-access")
	public synchronized Editor createEditor(String name, String description, String author, String path) throws Exception
	{
		Date created = new Date();
		Editor E = new Editor(0, name, description, author, path, created);
		//Modelo del lenguaje 
		Model langModel = null; 
		//Metamodelo intermedio 
		Metamodel metamodel = null; 
		
		//Inicializa el modelo del lenguaje 
		String picture = new File(E.getPath() + "/" + fileManager.PICTURE_LANG_DIRECTORY).listFiles()[0].getAbsolutePath();
		try
		{
			langModel = pictureLoader.loadPicture(picture);
		}
		catch(Exception e)
		{
			fileManager.deleteDir(E.getPath());
			throw e;
		}

		//Inicializa el metamodelo intermedio 
		String ecore = new File(E.getPath() + "/" + fileManager.META_MODEL_DIRECTORY).listFiles()[0].getAbsolutePath();
		try
		{
			metamodel = ecoreLoader.load(ecore);
		}
		catch(Exception e)
		{
			fileManager.deleteDir(E.getPath());
			throw e;
		}
		try
		{
			ModelBuilder builder = new ModelBuilder(metamodel, langModel, E);
			builder.buildEditorMetamodel();
		}
		catch (Exception e)
		{
			fileManager.deleteDir(E.getPath());
			throw e;
		}
		this.registerEditorInDB(E);
		fileManager.makeMeta(E.getPath(), E.getName(), E.getAuthor(), E.getDescription(), E.getCreated());
		E = editorDAO.getLastInsertedEditor();
		return E;
	}	
	
	/**
	 * Crea un nuevo diagrama para un editor existente 
	 * @param D - Diagrama a crear 
	 * @param E - Editor del diagrama
	 * @throws IOException -  En el caso de que se produzca un error al escribir el archivo 
	 */
	public synchronized Diagram createDiagram(Diagram D, Editor E) throws IOException
	{
		//Crear el directorio del diagrama 
		String editorPath = E.getPath();
		String diagramPath = fileManager.makeDiagramDir(editorPath);
		
		D.setPath(diagramPath);
		//Crear el archivo con el contenido del diagrama (diagrama vacio) en JSON 
		String cnt = "{\"cells\":[]}";
		File diagram = new File(diagramPath + "/dia.txt");
		try {
			diagram.createNewFile();
			FileWriter fw = new FileWriter(diagram.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(cnt);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Crear en db 
		diagramDAO.insertDiagram(D, E);
		D = diagramDAO.getLastInsertedDiagram();
		return D;
	}
	
	/**
	 * Genera el script con el estado actual del diagrama  
	 * @param D - Diagrama a recuperar 
	 * @return - Ruta al script del diagrama 
	 * @throws IOException 
	 */
	public synchronized String restoreDiagram(Diagram D) throws IOException
	{
		File diagram = new File(D.getPath());
		File editor = diagram.getParentFile().getParentFile();
		//Directorio base del editor
		String baseDir = "Editors/" + editor.getName();
		//Directorio base del diagrama
		String diaDir = baseDir + "/Diagrams/" + diagram.getName() + "/dia.js";
		Diagrammer dia = new Diagrammer(D);
		dia.buildDiagramScript(dateParser.dateToString(D.getCreated()), dateParser.dateToString(D.getLastModified()));
		String coreDir = "<script src=" + '"' + baseDir + "/Scripts/editor.js" + '"' + "></script>" + "\n";
		String modelerDir = "<script src=\"resources/basic-js/modeler.js\"></script>" + "\n";
		String diagramDir = "<script src=" + '"' + diaDir + '"' + "></script>" + "\n";
		return coreDir + diagramDir + modelerDir;
	}
	
	/**
	 * Guarda el estado de un diagrama en formato JSON 
	 * @param D - Diagrama a guardar 
	 * @param cnt - JSON con el estado del diagrama a guardar 
	 */
	public synchronized void saveDiagram(Diagram D, String cnt)
	{
		String diagramPath = D.getPath();
		Date today = new Date();
		D.setLastModified(today);
		File diagram = new File(diagramPath + "/dia.txt");
		//Borrar el archivo existente 
		diagram.delete();
		try {
			diagram.createNewFile();
			FileWriter fw = new FileWriter(diagram.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(cnt);
			bw.close();
			diagramDAO.updateDiagram(D);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	/**
	 * Registra un editor en la base de datos 
	 * @param E - Editor a registrar 
	 */
	public synchronized void registerEditorInDB(Editor E)
	{
		this.getEditorDAO().insertEditor(E);
	}
	
	/**
	 * Retorna una lista con todos los editores disponibles en el sistema
	 * @return - Lista con todos los editores 
	 */
	public synchronized ArrayList <Editor> getAllEditors()
	{
		return this.getEditorDAO().getAllEditors();
	}
	
	/**
	 * Retorna una lista con todos los diagramas disponibles 
	 * @return Lista con todos los diagramas disponibles 
	 */
	public synchronized ArrayList <Diagram> getAllDiagrams()
	{
		return this.getDiagramDAO().getAllDiagrams();
	}
	
	/**
	 * Retorna una lista con todos los diagramas de un editor 
	 * @param E - Editor seleccionado 
	 * @return Lista con todos los diagramas de un editor
	 */
	public synchronized ArrayList <Diagram> getAllDiagramsForEditor(Editor E)
	{
		return diagramDAO.getDiagramByEditor(E);
	}
	
	/**
	 * Elimina un editor del sistema
	 * @param E - Editor a eliminar 
	 */
	public synchronized void deleteEditor(Editor E)
	{
		String dirToRemove = E.getPath();
		fileManager.deleteDir(dirToRemove);
		editorDAO.deleteEditor(E);
	}
	
	/**
	 * Retorna un editor dado su identificador 
	 * @param editorId - Identificador del editor 
	 * @return Editor con identificador solicitado o null 
	 */
	public synchronized Editor getEditorById(int editorId)
	{
		return editorDAO.getEditorById(editorId);
	}
	
	/**
	 * Retorna un diagrama dado su identificador 
	 * @param diagramId - Identificador del diagrama
	 * @return Diagrama con el identificador solicitado o null
	 */
	public synchronized Diagram getDiagramById(int diagramId)
	{
		return diagramDAO.getDiagramById(diagramId);
	}
	
	/**
	 * Elimina un diagrama dado su identificador 
	 * @param idDiagram - Identificador del diagrama
	 */
	public synchronized void deleteDiagram(int idDiagram)
	{
		Diagram D = diagramDAO.getDiagramById(idDiagram);
		String dPath = D.getPath();
		fileManager.deleteDir(dPath);
		diagramDAO.deleteDiagram(D);
	}

	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------

	/**
	 * Retorna la instancia del file manager
	 * @param root - Directorio base
	 * @return instancia del file manager
	 */
	public FileManager getFileManager(String root)
	{
		fileManager.setBasePath(root);
		return fileManager;
	}
	
	/**
	 * @return the dateParser
	 */
	public DateParser getDateParser() {
		return dateParser;
	}

	/**
	 * @param dateParser the dateParser to set
	 */
	public void setDateParser(DateParser dateParser) {
		this.dateParser = dateParser;
	}

	/**
	 * @return the editorDAO
	 */
	public EditorDAO getEditorDAO() {
		return editorDAO;
	}

	/**
	 * @param editorDAO the editorDAO to set
	 */
	public void setEditorDAO(EditorDAO editorDAO) {
		this.editorDAO = editorDAO;
	}

	/**
	 * @return the diagramDAO
	 */
	public DiagramDAO getDiagramDAO() {
		return diagramDAO;
	}

	/**
	 * @param diagramDAO the diagramDAO to set
	 */
	public void setDiagramDAO(DiagramDAO diagramDAO) {
		this.diagramDAO = diagramDAO;
	}

	/**
	 * @return the pictureLoader
	 */
	public DSLLoader getPictureLoader() {
		return pictureLoader;
	}

	/**
	 * @param pictureLoader the pictureLoader to set
	 */
	public void setPictureLoader(DSLLoader pictureLoader) {
		this.pictureLoader = pictureLoader;
	}

	/**
	 * @return the ecoreLoader
	 */
	public XMIMetamodelLoader getEcoreLoader() {
		return ecoreLoader;
	}

	/**
	 * @param ecoreLoader the ecoreLoader to set
	 */
	public void setEcoreLoader(XMIMetamodelLoader ecoreLoader) {
		this.ecoreLoader = ecoreLoader;
	}	
}
