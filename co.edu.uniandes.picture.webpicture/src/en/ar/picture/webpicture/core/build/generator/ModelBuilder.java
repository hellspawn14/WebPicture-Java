package en.ar.picture.webpicture.core.build.generator;

import java.util.Hashtable;

import co.edu.uniandes.enar.picture.Model;
import en.ar.picture.webpicture.core.Modeler;
import en.ar.picture.webpicture.core.build.dsl.style.BasicShape;
import en.ar.picture.webpicture.core.build.dsl.util.DSLLoader;
import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metalink;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;
import en.ar.picture.webpicture.core.build.metamodel.util.XMIMetamodelLoader;
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

	// ------------------------------------------------------------------
	// Atributos 
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
	private Hashtable <String, BasicShape> basicShapes; 
	
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	
	
	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	
	/**
	 * Alimenta el metamodelo intermedio con el contenido del archivo picture 
	 * @param metamodel - Metamodelo intermedio creado a partir del ecore 
	 * @param langModel - Modelo del lenguaje con el contenido del archivo picture
	 * @return - Metamodelo completo con la especificación del picture
	 * @throws Exception - En el caso de: No se encuentra alguno de los archivos descritos en el picture 
	 */
	private Modeler buildEditorMetamodel(Metamodel metamodel, Model langModel) throws Exception{
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
		//3. Completar el metamodelo 
		
		
		
		//3. Crear una paleta de elementos 
		
		
		return null;
	}
	
	public static void main (String args[])
	{
		String mmPath = "./WebContent/samples/modelAppLayer/ApplicationLayerArch.ecore";
		String picPath = "./WebContent/samples/modelAppLayer/APPLayerGromp.picture";
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
		ModelBuilder MB = new ModelBuilder();
		try {
			MB.buildEditorMetamodel(MM, langModel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	/**
	 * Obtiene elementos de Color referenciados en el modelo del lenguaje y los inserta en la tabla de colores
	 */
	public void buildColorsForModel()
	{
		
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
	 * @return the basicShapes
	 */
	public Hashtable <String, BasicShape> getBasicShapes() {
		return basicShapes;
	}

	/**
	 * @param basicShapes the basicShapes to set
	 */
	public void setBasicShapes(Hashtable <String, BasicShape> basicShapes) {
		this.basicShapes = basicShapes;
	}

	

}
