package en.ar.picture.webpicture.core.build.generator;


import java.util.Date;
import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.enar.picture.Figure;
import co.edu.uniandes.enar.picture.GraphicalElement;
import co.edu.uniandes.enar.picture.InterNodeDef;
import co.edu.uniandes.enar.picture.LineDecoration;
import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.enar.picture.NodeElementDef;
import co.edu.uniandes.enar.picture.NodeLineDef;
import co.edu.uniandes.enar.picture.NodeLinkDef;
import co.edu.uniandes.enar.picture.StyleElement;
import co.edu.uniandes.enar.picture.ToolGroup;
import co.edu.uniandes.enar.picture.impl.ColorImpl;
import co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl;
import co.edu.uniandes.enar.picture.impl.FigureStyleImpl;
import co.edu.uniandes.enar.picture.impl.ImageFigureImpl;
import co.edu.uniandes.enar.picture.impl.LineStyleImpl;
import co.edu.uniandes.enar.picture.impl.RegularFigureImpl;
import co.edu.uniandes.enar.picture.impl.RegularPolygonImpl;
import co.edu.uniandes.enar.picture.impl.RoundedImpl;
import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Modeler;
import en.ar.picture.webpicture.core.build.dsl.util.DSLLoader;
import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metalink;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;
import en.ar.picture.webpicture.core.build.metamodel.util.XMIMetamodelLoader;
import en.ar.picture.webpicture.graphical.elements.Ellipse;
import en.ar.picture.webpicture.graphical.elements.Graph;
import en.ar.picture.webpicture.graphical.elements.IconEllipse;
import en.ar.picture.webpicture.graphical.elements.IconPolygon;
import en.ar.picture.webpicture.graphical.elements.IconRectangle;
import en.ar.picture.webpicture.graphical.elements.Image;
import en.ar.picture.webpicture.graphical.elements.Polygon;
import en.ar.picture.webpicture.graphical.elements.Rectangle;
import en.ar.picture.webpicture.graphical.links.Decoration;
import en.ar.picture.webpicture.graphical.links.Link;
import en.ar.picture.webpicture.graphical.palette.Palette;
import en.ar.picture.webpicture.graphical.palette.Toolgroup;
import en.ar.picture.webpicture.graphical.style.Color;
import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.util.SVGPathCreator;

/**
 * Componente responsable de construir 
 * @author hellspawn
 */
public class ModelBuilder {
	// ------------------------------------------------------------------
	// Declaración de elementos de estilo 
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
	// Declaracion de definiciones de elementos graficos  
	// ------------------------------------------------------------------

	/**
	 * Declaracion de un elemento como nodo 
	 */
	public final static String NODE_ELEMENT = "NodeElementDef";
	
	/***
	 * Declaración de un elemento como referencia 
	 */
	public final static String NODE_LINK = "NodeLinkDef";
	
	/**
	 * Declaracion de contenencia 
	 */
	public final static String INTERNAL_NODE = "InterNodeDef";
	
	/**
	 * Declaración de una referencia 
	 */
	public final static String NODE_LINE = "NodeLineDef";
	
	/**
	 * Declaración de un nodo externo (No disponible en ejemplos) 
	 */
	public final static String EXTERNAL_NODE = "ExternalNodeDef";
	
	// ------------------------------------------------------------------
	// Declaracion de figuras  
	// ------------------------------------------------------------------

	/**
	 * Declaracion de una figura regular 
	 */
	public final static String REGULAR_FIGURE = "RegularFigureImpl";
	
	/**
	 * Declaracion de una figura compleja 
	 */
	public final static String COMPLEX_FIGURE = "ComplexFigureImpl";
	
	/**
	 * Declaracion de una figura con imagen 
	 */
	public final static String IMAGE_FIGURE = "ImageFigureImpl";
	
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
		
	// ------------------------------------------------------------------
	// Atributos 
	// ------------------------------------------------------------------
	
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
		//3 Identificar el root y limpiar las relaciones que vengan o vayan hacia el 
		metamodel.setRootElement(root);
		removeElementFromMetamodel(root);
		//4. Obtiene los elementos de estilo del picture 
		buildStyleForModel();
		//5. Crear las representaciones graficas de los elementos 
		buildGraphicalRepresentation();
		
		//5. Crear los iconos dependiendo de las representaciones graficas (nodeElement y nodeLink) 
		
		
		
		//6. Crear una paleta de elementos 
		//Palette palette = buildEditorPalette();
		//test();
		
		
		
		
		
		//metamodel.consolidateMetamodel();
		return null;
	}

	/**
	 * Toma los elementos de estilo definidos en el picture para utilizarlos 
	 * como referencia en declaraciones posteriores 
	 */
	public void buildStyleForModel() {
		EList<StyleElement> styleElements = langModel.getGraphicalREpresentation().getStyleDefinition().getStyleElements();
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

	public void buildGraphicalRepresentation() throws Exception 
	{
		EList <GraphicalElement> graphicalElements = langModel.getGraphicalREpresentation().getGraphicalDefinition().getElements();
		//Elementos del metamodelo 
		Metaelement metaelement = null; 
		Metalink metalink = null;
		//Elementos del modelo del lenguaje 
		NodeElementDef nodeElement = null; 
		NodeLinkDef nodeLink = null; 
		InterNodeDef internalNode = null; 
		NodeLineDef nodeLine = null; 
		//ExternalNodeDef externalNode = null;
		GraphicalElement graphicalElement = null; 
		for (int i = 0; i < graphicalElements.size(); i++)
		{
			graphicalElement = graphicalElements.get(i); 
			//Determinar el tipo de elemento 
			if (graphicalElement.eClass().getName().equals(NODE_ELEMENT))
			{
				nodeElement = (NodeElementDef) graphicalElement;
				metaelement = metamodel.getMetaelementByName(nodeElement.getReferenceClass().getClass_().toString());
				if (metaelement == null)
				{
					throw new Exception ("Referenced class not found for element " + graphicalElements.get(i).getName());
				}
				createGraphicalRepresentationForMetaelement(metaelement, nodeElement);
			}
			else if (graphicalElement.eClass().getName().equals(NODE_LINK))
			{
				nodeLink = (NodeLinkDef) graphicalElement;
				metaelement = metamodel.getMetaelementByName(nodeLink.getReferenceClass().getClass_().toString());
				if (metaelement == null)
				{
					throw new Exception ("Referenced class not found for element " + graphicalElements.get(i).getName());
				}
				//Transformar el elemento y establece su representación grafica
				metaElementToMetalink(metaelement, nodeLink);
			}
			else if (graphicalElement.eClass().getName().equals(INTERNAL_NODE))
			{
				internalNode =  (InterNodeDef) graphicalElement;
				String referenceName = internalNode.getReferenceName().getClass_().trim();
				if (!referenceName.contains("."))
				{
					throw new Exception ("Reference not found for element " + internalNode.getName());
				}
				String [] references = referenceName.split("\\.");
				metaelement = metamodel.getMetaelementByName(references[0]);
				if (metaelement == null)
				{
					throw new Exception ("Reference not found for element " + internalNode.getName());
				}
				metalink = metaelement.getMetalinkByName(references[1]);
				if (metalink == null)
				{
					throw new Exception ("Reference not found for element " + internalNode.getName());
				}
				metalink.setContaintment(true);	
			}
			else if (graphicalElement.eClass().getName().equals(NODE_LINE))
			{
				nodeLine = (NodeLineDef) graphicalElement;
				String referenceName = nodeLine.getReferenceName().getClass_().trim();
				if (!referenceName.contains("."))
				{
					throw new Exception ("Reference not found for element " + internalNode.getName());
				}
				String [] references = referenceName.split("\\.");
				metaelement = metamodel.getMetaelementByName(references[0]);
				if (metaelement == null)
				{
					throw new Exception ("Reference not found for element " + internalNode.getName());
				}
				metalink = metaelement.getMetalinkByName(references[1]);
				if (metalink == null)
				{
					throw new Exception ("Reference not found for element " + internalNode.getName());
				}
				Color c = colors.get(nodeLine.getStyle().getColor().getName());
				Border b = new Border(c, nodeLine.getStyle().getWidth(), nodeLine.getStyle().getLineType().getName(), nodeLine.getStyle().getName());
				Decoration decSrc = new Decoration(b, getDecorationName(nodeLine.getSourceDecoration()));
				Decoration decTrg = new Decoration(b, getDecorationName(nodeLine.getTargetDecoration()));
				Link L = new Link(b, nodeLine.getLabel(), decSrc, decTrg);
				metalink.setGrpLink(L);
			}
			else if (graphicalElement.eClass().getName().equals(EXTERNAL_NODE))
			{
				//No disponible en los ejemplos 
			}	
		}
	}
	
	
	/**
	 * Crea la representación grafica de un elemento 
	 * @param element - Elemento a representar  
	 * @param description - Descripcion de la representación grafica
	 */
	public void createGraphicalRepresentationForMetaelement(Metaelement element, NodeElementDef description)
	{
		Graph g = buildGraphicalElementFromDescription(element, description);
		element.setGhaph(g);	
	}
	
	/**
	 * Retorna la representación grafica de un elemento 
	 * @param element - Elemento a representar 
	 * @param description - Descripcion de representación grafica
	 * @return - Representacion grafica del elemento
	 */
	public Graph buildGraphicalElementFromDescription(Metaelement element, NodeElementDef description) 
	{
		Figure figure = description.getFigure();
		String figureType = figure.getClass().getSimpleName();
		Graph graph = null;
		if (figureType.equals(REGULAR_FIGURE))
		{
			return buildGraphicalElementForRegularFigure(element, description);
		}
		else if (figureType.equals(COMPLEX_FIGURE))
		{
			//No disponible en los ejemplos 
			//ComplexFigureImpl cmp = (ComplexFigureImpl) figure;
		}
		else if ((figureType.equals(IMAGE_FIGURE)))
		{
			ImageFigureImpl img = (ImageFigureImpl) figure;
			String path = "file:///" + editor.getPath() + "/Images/" +  img.getPath(); 
			Image grpImage = new Image (description.getSize().getHeight(), description.getSize().getWidth(), element.getName(), description.getLabel(), getElementLabelPlacement(description), description.isPhantomN(), path);
			return grpImage;
		}
		return graph;
	}
	
	/**
	 * Retorna la representación grafica para un elemento 
	 * @param element - Elemento a representar 
	 * @param description - Descripcion del elemento 
	 * @return Representación grafica del elemento 
	 */
	public Graph buildGraphicalElementForRegularFigure(Metaelement element, NodeElementDef description) 
	{
		Graph graph = null; 
		RegularFigureImpl reg = (RegularFigureImpl) description.getFigure();
		String styleType = reg.getFigureStyle().eClass().getName();
		String styleName = reg.getFigureStyle().getName();
		//Propiedades genericas independientes al elemento 
		int height = description.getSize().getHeight();
		int width = description.getSize().getWidth();
		String type = element.getName();
		String label = description.getLabel();
		String labelPlacement = this.getElementLabelPlacement(description);
		boolean phantom = description.isPhantomN();
		
		//Mapeo de elementos ya creados (en.ar.picture.webpicture.graphical.style)
		Color c = colors.get(reg.getBacgroundColor().getName());
		Border b = borders.get(reg.getBorder().getName());
		
		//Propiedades no genericos descritos en el picture 
		String imgPath = reg.getPath();
		
		if (styleType.equals(ELLIPSE))
		{
			//Revisa si la forma esta tiene una imagen
			if (imgPath == null)
			{
				//Se declara una ellipse sencilla sin imagen de fondo 
				Ellipse E = new Ellipse(height, width, type, label, labelPlacement, phantom, c, b);
				return E;
			}
			else
			{
				//Se declara una ellipse con imagen de fondo 
				String iconPath = "file:///" + editor.getPath() + "/Images/" +  imgPath; 
				int iconHeight = reg.getSize().getHeight();
				int iconWidth = reg.getSize().getWidth();
				int iconRefX = reg.getPosition().getX();
				int iconRefY = reg.getPosition().getY();
				IconEllipse E = new IconEllipse(height, width, type, label, labelPlacement, phantom, c, b, iconPath, iconWidth, iconHeight,  iconRefX,  iconRefY); 
				return E;
			}
		}
		else if(styleType.equals(ROUNDED))
		{
			//Declaración del estilo del elemento 
			RoundedImpl pictureRectangle = (RoundedImpl) basicShapes.get(styleName);
			int rx = pictureRectangle.getRx();
			int ry = pictureRectangle.getRy();
			//Revisa si la forma esta tiene una imagen
			if (imgPath == null)
			{
				//Se declara un rectangulo simple 
				Rectangle R = new Rectangle (height, width, type, label, labelPlacement, phantom, c, b, rx, ry);
				return R; 
			}
			else
			{
				//Se declara un rectangulo con una imagen 
				String iconPath = "file:///" + editor.getPath() + "/Images/" +  imgPath; 
				int iconHeight = reg.getSize().getHeight();
				int iconWidth = reg.getSize().getWidth();
				int iconRefX = reg.getPosition().getX();
				int iconRefY = reg.getPosition().getY();
				IconRectangle R = new IconRectangle(height, width, type, label, labelPlacement, phantom, c, b, iconPath, iconWidth, iconHeight, iconRefX, iconRefY, rx, ry);
				return R;
			}
		}
		else if (styleType.equals(REGULAR_POLYGON))
		{
			RegularPolygonImpl picturePolygon = (RegularPolygonImpl) basicShapes.get(styleName);
			int vertex = picturePolygon.getVertexCant();
			int startAngle = picturePolygon.getStartAngle();
			SVGPathCreator svgMaker = new SVGPathCreator(startAngle, vertex);
			String svg = svgMaker.generatePath();
			//Revisa si la forma esta tiene una imagen
			if (imgPath == null)
			{
				//Se declara un poligono regular sin imagen
				Polygon P = new Polygon(height, width, type, label, labelPlacement, phantom, c, b, svg);
				return P; 
			}
			else
			{
				//Se declara un poligono regular con imagen
				String iconPath = "file:///" + editor.getPath() + "/Images/" +  imgPath; 
				int iconHeight = reg.getSize().getHeight();
				int iconWidth = reg.getSize().getWidth();
				int iconRefX = reg.getPosition().getX();
				int iconRefY = reg.getPosition().getY();
				IconPolygon P = new IconPolygon (height, width, type, label, labelPlacement, phantom, c, b, iconPath, iconWidth, iconHeight, iconRefX, iconRefY, svg);
				return P; 
			}
		}
		else if(styleType.equals(CUSTOM_FIGURE))
		{
			Rectangle R = new Rectangle (height, width, type, label, labelPlacement, phantom, c, b, 0, 0);
			return R; 
		}
		return graph;
	}
	
	/**
	 * Retorna la posicion del label en la figura 
	 * @param description - Descripcion de la representación grafica 
	 * @return internal - external
	 */
	public String getElementLabelPlacement(NodeElementDef description) {
		String external = description.getLabelPlacement().getExternal();
		String internal = description.getLabelPlacement().getInternal();
		if (external != null) {
			return external;
		}
		return internal;
	}
	
	/**
	 * Crea una paleta de elementos lista para generar el codigo 
	 * @return - Paleta de elementos lista para generar el codigo 
	 */
	public Palette buildEditorPalette()
	{
		//TODO
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
	public EList<ToolGroup> getSubToolgroupsFor(ToolGroup toolgroup) {
		if (!toolgroup.getToolGroups().isEmpty()) {
			ToolGroup in = null;
			EList<ToolGroup> subGroups = toolgroup.getToolGroups();
			for (int i = 0; i < toolgroup.getToolGroups().size(); i++) {
				in = toolgroup.getToolGroups().get(i);
				EList<ToolGroup> inSubGroups = getSubToolgroupsFor(in);
				if (inSubGroups != null) {
					subGroups.addAll(getSubToolgroupsFor(in));
				}
			}
			return subGroups;
		} else {
			return null;
		}
	}
	
	/**
	 * Remueve un elemento completamente del metamodelo asi como sus relaciones
	 *  desde y hacia otros elementos
	 * @param element - Elemento a remover
	 */
	public void removeElementFromMetamodel(Metaelement element) {
		metamodel.getModelElements().remove(element);
		element.getReferences().clear();
		Metaelement el = null;
		Metalink link = null;
		for (int i = 0; i < metamodel.getModelElements().size(); i++) {
			el = metamodel.getModelElements().get(i);
			for (int k = 0; k < el.getReferences().size(); k++) {
				link = el.getReferences().get(k);
				if (link.getTrg().equals(element)) {
					el.getReferences().remove(link);
				}
			}
		}
	}
	
	/**
	 * Transforma el metaelemento ingresado en un metalink y establece su representación 
	 * grafica de acuerdo a la descripcion en el picture
	 * @param element - Elemento a transformar 
	 * @param description - Descripcion del elemento como Nodelink
	 * @throws Exception - En el caso de que las referencias descritas para el elemento 
	 * no sean validas
	 */
	public void metaElementToMetalink(Metaelement element, NodeLinkDef description) throws Exception {
		// Obtiene los los elementos src y trg
		Metaelement src = element.getMetalinkByName(description.getSourceReference()).getTrg();
		Metaelement trg = element.getMetalinkByName(description.getTargetReference()).getTrg();
		if (src == null || trg == null) {
			throw new Exception("Referenced elements for node_link " + description.getName() + " was not found in metamodel");
		} else {
			Metalink elementAsLink = new Metalink(element.getName(), src, trg, false, -1, 0);
			//Agregar la nueva referencia al metamodelo
			src.getReferences().add(elementAsLink);
			// Construir la representación grafica del elemento
			Color c = colors.get(description.getStyle().getColor().getName());
			Border b = new Border(c, description.getStyle().getWidth(),description.getStyle().getLineType().getName(), description.getStyle().getName());
			Decoration decSrc = new Decoration(b, getDecorationName(description.getSourceDecoration()));
			Decoration decTrg = new Decoration(b, getDecorationName(description.getTargetDecoration()));
			Link L = new Link(b, description.getLabel(), decSrc, decTrg);
			elementAsLink.setGrpLink(L);
			element.setNodeLink(true);
		}
	}
	
	/**
	 * Retorna el valor de un LineDecoration 
	 * Para cualquier elemento que no sea de la clase DefaultLineDecorationImpl retorna NONE
	 * @param decoration - Decoración (Picture)
	 * @return - Valor String del decoration
	 */
	public String getDecorationName(LineDecoration decoration) {
		String ans = "";
		if (decoration
				.getClass()
				.getName()
				.toString()
				.equals("co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl")) {
			DefaultLineDecorationImpl deco = (DefaultLineDecorationImpl) decoration;
			String[] decorations = { deco.getNone(), deco.getArrow(),
					deco.getRhomb(), deco.getFilledrhomb(), deco.getSquare(),
					deco.getFilledsquare(), deco.getClosedarrow(),
					deco.getFilledclosedarrow() };
			for (int i = 0; i < decorations.length; i++) {
				ans = decorations[i];
				if (ans != null) {
					return ans;
				}
			}
		} else {
			ans = Decoration.NONE;
		}
		return ans;
	}

	public static void main (String args[])
	{
		String mmPath = "./WebContent/Ejemplos/ArchimateExtendido/Descriptors/ArchimateExtendido.ecore";
		String picPath = "./WebContent/Ejemplos/ArchimateExtendido/Descriptors/ArchimateExtendidoDefinition.picture";
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
		Editor E = new Editor(0, "Prueba", "Prueba", "Yo", "Users/hellspawn/Documents/Uniandes/Tesis/Repositorios/WebPicture-Java/co.edu.uniandes.picture.webpicture/WebContent/Ejemplos/UseCaseEditor", new Date());
		//./WebContent/Editors/8e8745eb-bb31-423d-80f4-1ae5e15fba3d
		ModelBuilder MB = new ModelBuilder(MM, langModel, E);
		try {
			MB.buildEditorMetamodel();
		} catch (Exception e) {
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
