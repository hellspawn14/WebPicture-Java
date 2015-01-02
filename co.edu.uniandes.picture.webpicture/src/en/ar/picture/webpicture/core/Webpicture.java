package en.ar.picture.webpicture.core;

import java.util.ArrayList;
import java.util.Date;

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
	public synchronized void createEditor(String name, String description, String author, String path)
	{
		Date created = new Date();
		Editor E = new Editor(0, name, description, author, path, created);
		this.registerEditorInDB(E);
	}
	
	public synchronized void createDiagram(Editor E)
	{
		
	}
	
	
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
	
	public synchronized ArrayList <Diagram> getAllDiagrams()
	{
		return null;
	}
	
	/**
	 * Retorna una lista con todos los diagramas de un editor 
	 * @param E - Editor seleccionado 
	 * @return Lista con todos los diagramas de un editor
	 */
	public synchronized ArrayList <Diagram> getAllDiagramsForEditor(Editor E)
	{
		return E.getDiagrams();
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
}
