package en.ar.picture.webpicture.core.build.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.enar.picture.StyleElement;
import co.edu.uniandes.enar.picture.ToolGroup;
import co.edu.uniandes.enar.picture.impl.ColorImpl;
import co.edu.uniandes.enar.picture.impl.FigureStyleImpl;
import co.edu.uniandes.enar.picture.impl.LineStyleImpl;
import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Modeler;
import en.ar.picture.webpicture.core.build.dsl.util.DSLLoader;
import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metalink;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;
import en.ar.picture.webpicture.core.build.metamodel.util.XMIMetamodelLoader;
import en.ar.picture.webpicture.graphical.palette.Palette;
import en.ar.picture.webpicture.graphical.palette.Toolgroup;
import en.ar.picture.webpicture.graphical.style.Color;
import en.ar.picture.webpicture.graphical.style.Border;

/**
 * Componente responsable de construir 
 * @author hellspawn
 */
public class ModelBuilder {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	/**
	 * Declaracion de color en Picture
	 */
	public final static String COLOR = "Color";
	
	/**
	 * Declaracion del linestyle en picture
	 */
	public final static String LINE_STYLE = "LineStyle";
	
	
	// ------------------------------------------------------------------
	// Declaracion de formas basicas 
	// ------------------------------------------------------------------

	/**
	 * Declaracion de forma ellipse
	 */
	public final static String ELLIPSE = "Ellipse";
	
	/**
	 * Declaración de rectangulo con bordes biselados
	 */
	public final static String ROUNDED = "Rounded";
	
	/**
	 * Declaracion de poligono regular 
	 */
	public final static String REGULAR_POLYGON = "RegularPolygon";
	
	/**
	 * Declaración de una figura personalizada 
	 */
	public final static String CUSTOM_FIGURE = "CustomFigure";
	
	// ------------------------------------------------------------------
	// Atributos 
	// ------------------------------------------------------------------

	// ------------------------------------------------------------------
	// Atributos de estilo 
	// ------------------------------------------------------------------
	
	/**
	 * Colores 
	 */
	private Hashtable <String, Color> colors;
	
	/**
	 * Bordes
	 */
	private Hashtable <String, Border> borders; 
	
	/**
	 * Formas basicas 
	 */
	private Hashtable <String, FigureStyleImpl> basicShapes;
		
	/**
	 * Metamodelo (incompleto)
	 */
	private Metamodel metamodel; 
	
	/**
	 * Modelo del lenguaje 
	 */
	private Model langModel;
	
	/**
	 * Editor referenciado 
	 */
	private Editor editor;
	
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	public ModelBuilder (Metamodel metamodel, Model langModel, Editor editor)
	{
		this.metamodel = metamodel;
		this.langModel = langModel;
		this.editor = editor;
		colors = new Hashtable<String, Color>();
		borders = new Hashtable <String, Border>();
		basicShapes = new Hashtable <String, FigureStyleImpl>();
	}
	
	
	
	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	
	/**
	 * Alimenta el metamodelo intermedio con el contenido del archivo picture
	 * @return - Metamodelo completo con la especificación del picture
	 * @throws Exception - En el caso de: No se encuentra alguno de los archivos descritos en el picture 
	 */
	private Modeler buildEditorMetamodel() throws Exception{
		//1. Verificar que el metamodelo y el picture se referencien 
		String mmRefModel = metamodel.getReferencedModel();
		String langRefModel = langModel.getGraphicalREpresentation().getReferencePackage();
		if (!mmRefModel.equals(langRefModel))
		{
			throw new Exception ("Metamodel not referenced in picture");
		}
		//2. Identificar el elemento root del metamodelo 
		String rootElement = langModel.getGraphicalREpresentation().getRoot().getName().trim();
		Metaelement root = metamodel.getMetaelementByName(rootElement);
		if (root == null)
		{
			throw new Exception ("Referenced root element does not correspond to metamodel");
		}
		//2.1 Identificar el root y limpiar las relaciones que vengan o vayan hacia el 
		metamodel.setRootElement(root);
		metamodel.getModelElements().remove(root);
		root.getReferences().clear();
		Metaelement el = null; 
		Metalink link = null;
		for (int i = 0; i < metamodel.getModelElements().size(); i++)
		{
			el = metamodel.getModelElements().get(i);
			for (int k = 0; k < el.getReferences().size(); k++)
			{
				link = el.getReferences().get(k);
				if (link.getTrg().equals(root))
				{
					el.getReferences().remove(link);
				}
			}
		}
		
		//3. Crear una paleta de elementos 
		Palette palette = buildEditorPalette();
		
		
		//4. Obtiene los elementos de estilo del picture 
		buildStyleForModel();
		
		
		
		
		return null;
	}

	/**
	 * Crea una paleta de elementos lista para generar el codigo 
	 * @return - Paleta de elementos lista para generar el codigo 
	 * @throws Exception - En el caso de que no haya una imagen faltante 
	 */
	public Palette buildEditorPalette() throws Exception
	{
		String paletteName = langModel.getGraphicalREpresentation().getToolsDefinition().getName().getName();
		Palette P = new Palette(paletteName);
		
		ToolGroup TPicture = null; 
		Toolgroup T = null;
		EList<ToolGroup> groups = langModel.getGraphicalREpresentation().getToolsDefinition().getToolGroups();
		//Construye una lista de todos los grupos sin subgrupos
		EList <ToolGroup> plainGroups = langModel.getGraphicalREpresentation().getToolsDefinition().getToolGroups(); 
		for (int i = 0; i < groups.size(); i++)
		{
			TPicture = groups.get(i);
			EList <ToolGroup> internalGroups = getSubToolgroupsFor(TPicture);
			if (internalGroups != null)
			{
				plainGroups.addAll(getSubToolgroupsFor(TPicture));
			}
		}
		System.out.println(groups.size());
		System.out.println(plainGroups.size());
		if(plainGroups.size() > groups.size())
		{
			groups.addAll(plainGroups);
		}
		//Construye los grupos de herramientas del editor web 
		for (int i = 0; i < groups.size(); i++)
		{
			TPicture = groups.get(i);
			T = new Toolgroup(TPicture.getName(), TPicture.getDescription());
			//Construir los iconos que componen el toolgroup 
		}
		
		
		
		return P;
	}
	
	/**
	 * Retorna una lista con los subgrupos contenidos dentro de un mismo grupo 
	 * Puede obtener subgrupos recursivos dentro de un mismo grupo 
	 * @param toolgroup - Grupo a revisar 
	 * @return - Lista todos los subgrupos dentro de un mismo grupo 
	 */
	public EList <ToolGroup> getSubToolgroupsFor(ToolGroup toolgroup)
	{
		if (!toolgroup.getToolGroups().isEmpty())
		{
			ToolGroup in = null;
			EList <ToolGroup> subGroups = toolgroup.getToolGroups();
			for (int i = 0; i < toolgroup.getToolGroups().size(); i++)
			{
				in = toolgroup.getToolGroups().get(i);
				EList <ToolGroup> inSubGroups = getSubToolgroupsFor(in);
				if (inSubGroups != null )
				{
					subGroups.addAll(getSubToolgroupsFor(in));
				}
			}
			return subGroups;
		}
		else
		{
			return null;
		}
	}

	/**
	 * Toma los elementos de estilo definidos en el picture para utilizarlos 
	 * como referencia en declaraciones posteriores 
	 */
	public void buildStyleForModel() {
		EList<StyleElement> styleElements = langModel
				.getGraphicalREpresentation().getStyleDefinition()
				.getStyleElements();
		StyleElement element = null;
		String elementType = "";
		Color color = null;
		Border border = null;

		// Elementos de picture a traducir
		ColorImpl colorImpl = null;
		FigureStyleImpl figStyleImpl = null;
		LineStyleImpl lineImpl = null;
		for (int i = 0; i < styleElements.size(); i++) {
			element = styleElements.get(i);
			elementType = element.eClass().getName();
			if (elementType.equals(COLOR)) {
				colorImpl = (ColorImpl) element;
				color = new Color(colorImpl.getRed(), colorImpl.getGreen(),
						colorImpl.getBlue(), colorImpl.getName());
				colors.put(color.getcName(), color);
			} else if (elementType.equals(ELLIPSE)
					|| elementType.equals(ROUNDED)
					|| elementType.equals(REGULAR_POLYGON)
					|| elementType.equals(CUSTOM_FIGURE)) {
				figStyleImpl = (FigureStyleImpl) element;
				basicShapes.put(figStyleImpl.getName(), figStyleImpl);
			} else if (elementType.equals(LINE_STYLE)) {
				lineImpl = (LineStyleImpl) element;
				border = new Border(colors.get(lineImpl.getColor().getName()),
						lineImpl.getWidth(), lineImpl.getLineType().getName(),
						lineImpl.getName());
				borders.put(border.getName(), border);
			}
			// Ignora los elementos de decoration (No disponibles en los
			// ejemplos)
		}
	}
	

	
	public static void main (String args[])
	{
		String mmPath = "./WebContent/samples/modelAppLayer/ApplicationLayerArch.ecore";
		String picPath = "./WebContent/samples/APPLayerGromp.picture";
		XMIMetamodelLoader metaLoader = new XMIMetamodelLoader();
		Metamodel MM = null;
		DSLLoader dslLoader = new DSLLoader();
		Model langModel = null;
		try{
			MM = metaLoader.load(mmPath);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		try{
			langModel = dslLoader.loadPicture(picPath);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//public Editor(int id, String name, String description, String author, String path, Date created)
		Editor E = new Editor(0, "Prueba", "Prueba", "Yo", "", new Date());
		ModelBuilder MB = new ModelBuilder(MM, langModel, E);
		try {
			MB.buildEditorMetamodel();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	// ------------------------------------------------------------------
	// Getters & Setters 
	// ------------------------------------------------------------------

	/**
	 * @return the colors
	 */
	public Hashtable <String, Color> getColors() {
		return colors;
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(Hashtable <String, Color> colors) {
		this.colors = colors;
	}

	/**
	 * @return the borders
	 */
	public Hashtable <String, Border> getBorders() {
		return borders;
	}

	/**
	 * @param borders the borders to set
	 */
	public void setBorders(Hashtable <String, Border> borders) {
		this.borders = borders;
	}

	/**
	 * @return the metamodel
	 */
	public Metamodel getMetamodel() {
		return metamodel;
	}

	/**
	 * @param metamodel the metamodel to set
	 */
	public void setMetamodel(Metamodel metamodel) {
		this.metamodel = metamodel;
	}

	/**
	 * @return the basicShapes
	 */
	public Hashtable <String, FigureStyleImpl> getBasicShapes() {
		return basicShapes;
	}
	
	/**
	 * @param basicShapes the basicShapes to set
	 */
	public void setBasicShapes(Hashtable <String, FigureStyleImpl> basicShapes) {
		this.basicShapes = basicShapes;
	}



	/**
	 * @return the editor
	 */
	public Editor getEditor() {
		return editor;
	}



	/**
	 * @param editor the editor to set
	 */
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
}
