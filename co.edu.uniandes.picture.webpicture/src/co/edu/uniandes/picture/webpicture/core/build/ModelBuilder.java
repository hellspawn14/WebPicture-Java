package co.edu.uniandes.picture.webpicture.core.build;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.enar.picture.GraphicalRepresentation;
import co.edu.uniandes.enar.picture.Import;
import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.picture.webpicture.metamodel.Metaelement;
import co.edu.uniandes.picture.webpicture.metamodel.Metamodel;
import co.edu.uniandes.picture.webpicture.util.metamodel.XMIMetamodelLoader;
import co.edu.uniandes.picture.webpicture.util.picture.DSLLoader;

/**
 * Valida y construye el metamodelo intermedio del editor 
 * utilizando como base el contenido del modelo del lenguaje y el 
 * metamodelogo generado a partir del ecore 
 * @author hellspawn
 */
public class ModelBuilder 
{
	//------------------------------------------------------------------
	//Constantes 
	//------------------------------------------------------------------
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Valida que el contenido del archivo .picture y el .ecore correspondan 
	 * @param model - Es el modelo generado a partir del picture
	 * @param metamodel - Es el metamodelo construido a partir del .ecore
	 * @return true/false
	 */
	public boolean validate(Model model, Metamodel metamodel, String directory)
	{
		boolean ans = false;
		
		//TODO -> Cada elemento del metamodelo tiene un nombre unico OK
		//No todo lo que esta en el metamodelo debe ir en el picture
		//2. Validar que las clases coincidan 
		//4. Validar que todas las relaciones tengan nombre en especial las de contenencia 
		//5. Dos relaciones de contenencia no pueden ir en doble sentido? CRC-LR-3 
		//7 Validar recursos de imagen
		model.getGraphicalREpresentation().getGraphicalDefinition().toString();
		return ans;
	}
	
	/**
	 * Valida los elementos provistos por el modelo generado del script picture y los elementos del metamodelo generado 
	 * A medida que hace validaciones enriquese el metamodelo intermedio
	 * @param model - Modelo generado del picture script
	 * @param metamodel - Metamodelo intermedio 
	 * @param directory - Directorio base del editor 
	 * @return Metamodelo validado y listo para generar el editor web 
	 * @throws Exception - En el caso de que exista algun error 
	 */
	public Metamodel buildMetamodel(Model model, Metamodel metamodel, String directory) throws Exception
	{
		//Representacion grafica del modelo 
		GraphicalRepresentation graphicalRepresentation = model.getGraphicalREpresentation();
		//----------------Validaciones iniciales----------------
		//1. Verificar que el picture referencie el metamodelo
		EList<Import> classFiles = model.getImports();
		String gReferencedModel = "";
		for (Import classFile : classFiles) 
		{
			int importedNameSpaceSize = classFile.getImportedNamespace().split("/").length;
			gReferencedModel = classFile.getImportedNamespace().split("/")[importedNameSpaceSize - 1];
	    }
		if (!gReferencedModel.equals(metamodel.getReferencedModel()))
		{
			throw new Exception ("The referenced metamodel is not referenced in the picture script");
		}
		//2. Verificar que el root exista y corresponda a un elemento del metamodelo
		Metaelement root = null;
		String rootElement = graphicalRepresentation.getRoot().getName().trim();
		root = metamodel.getMetaelementByName(rootElement);
		if (root == null)
		{
			throw new Exception ("There's no valid root element");
		}
		//3. Insertar elemento root en el metamodelo 
		metamodel.setRoot(root);
		//4. Validar que los elementos de la paleta estan en el metamodelo
		//4.1 Validar los recursos de imagen de la paleta
		//4.2 Crear los elementos de la paleta 
		System.out.println(model.getGraphicalREpresentation().getToolsDefinition().getToolGroups().get(0));
		
		//5. Crea los elementos graficos del modelo 
		//5.1 Cada elemento solo tiene una representacion a nivel de elemento 
		//5.1 Crea los elementos internos 
		//5.2 Crea las relaciones 
		//6. Agregar relaciones 
		//7. Genera las reglas de union 
		//7. Wizards  
		return metamodel;
	}
	
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	public static void main (String args[])
	{
		//APPLayerGromp.picture
		//ApplicationLayerArch.ecore
		try 
	    {
			DSLLoader dslLoader = new DSLLoader();
			XMIMetamodelLoader metamodelLoader = new XMIMetamodelLoader();
			ModelBuilder builder = new ModelBuilder();
			Metamodel metamodel = metamodelLoader.load("./WebContent/samples/ApplicationLayerArch.ecore");
			Model M = dslLoader.loadPicture("./WebContent/samples/APPLayerGromp.picture");
			String dir = "";
			metamodel = builder.buildMetamodel(M, metamodel, dir);
	    } 
	    catch (Exception e) 
	    {
	      e.printStackTrace();
	    }
	  }
	
}
