package MetamodelUtility;

import java.util.ArrayList;
import java.util.Iterator;

import Entities.Attribute;
import Entities.Entity;
import Entities.Metamodel;
import Entities.Reference;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * Modulo encargado de cargar el metamodelo 
 * @author hellspawn
 */
public class EcoreLoader 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Referencia al directorio del modelo
	 */
	private String modelURL;
	
	/**
	 * Referencia al metamodelo creado
	 */
	private Metamodel MM;
	
	/**
	 * Instancia del loader
	 */
	private EcoreLoader instancia;	
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	/**
	 * Carga el metamodelo desde el .ecore
	 * @return - El metamodelo cargado
	 */
	public Metamodel loadModel()
	{
		ArrayList<Entity> result = new ArrayList<Entity>();
		ResourceSet metaResourceSet = new ResourceSetImpl();
		metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource metaResource = metaResourceSet.getResource(URI.createFileURI(modelURL), true);
			
		Iterator<EObject> iterator = metaResource.getAllContents();
		Entity E;
		 
		String basePack = "";
		while (iterator.hasNext()) 
		{
			EObject classObject = iterator.next();
			//Identifica los objetos EClass
			
			if(classObject.eClass().getName().equals("EPackage"))
			{
				basePack = (String) classObject.eGet(classObject.eClass().getEAllAttributes().get(0));
				//System.out.println("BasePackage ->" + basePack);
			}
			
			
			if (classObject.eClass().getName().equals("EClass"))
			{
				//Obtiene el nombre del EClass
				String name = "NONE";
				if (classObject.eClass().getEAllAttributes().size() > 0)
				{
					name = (String) classObject.eGet(classObject.eClass().getEAllAttributes().get(0));
				}
				 
				//System.out.println("EClass ->" + name);
				//Crea la nueva entidad
				E = new Entity(name);
				result.add(E);
				Attribute A = null;
				 
				//Obtiene los elementos estructurales de la entidad 
				for (EStructuralFeature reference : classObject.eClass().getEAllReferences()) 
				{
					//Obtiene el nombre de los atributos
					if(reference.getName().equals("eAllAttributes"))
					{
						String element_properties = classObject.eGet(reference).toString();
						String[] elements = element_properties.split("org.eclipse.emf.ecore.impl.EAttributeImpl");
						for (int i = 1; i < elements.length; i++)
						{
							String atrName = elements[i].split(" ")[2].substring(0,elements[i].split(" ")[2].length()-1);
							A = new Attribute(atrName);
							E.addAtribute(A);
							//System.out.println("      	EAttribute->" + atrName);		
						} 
					}
						
					//Obtiene las references
					if(reference.getName().equals("eAllReferences"))
					{
						String element_properties = classObject.eGet(reference).toString();
						String[] elements = element_properties.split("org.eclipse.emf.ecore.impl.EReferenceImpl");
						for (int i = 1; i < elements.length; i++)
						{
							if (elements[i].length() > 10)
							{
								 //Nombre de la referencia
								 String referenceName = elements[i].split(" ")[2].substring(0,elements[i].split(" ")[2].length() - 1);
								 //Cardinalidad de la referencia 
								 int lowBound = Integer.parseInt(elements[i].split(" ")[8].substring(0,elements[i].split(" ")[8].length() - 1));
								 int upBound = Integer.parseInt(elements[i].split(" ")[10].substring(0,elements[i].split(" ")[10].length() - 1));
								 String containment = elements[i].split(" ")[24].substring(0,elements[i].split(" ")[24].length() - 1);
								 boolean isContainment = false;
								 if (containment.equals("true"))
								 {
									 isContainment = true;
								 }
								 //System.out.println("      	EReference->" + referenceName);
								 Reference R = new Reference(E, upBound, lowBound, referenceName, isContainment);
								 E.addReference(R);
							}				
						}				
					}	
				}		
			}
		}
		//Genera el metamodelo
		MM = new Metamodel(basePack, modelURL);
		MM.setEntities(result);
		MM.endLoad();
		return MM;
	}
	
	
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * Retorna el directorio del modelo 
	 * @return
	 */
	public String getModelURL() 
	{
		return modelURL;
	}

	/**
	 * Inicializa el directorio del modelo
	 * @param modelURL
	 */
	public void setModelURL(String modelURL) 
	{
		this.modelURL = modelURL;
	}
	
	/**
	 * Retorna la instancia
	 * @return instancia
	 */
	public EcoreLoader getInstancia() 
	{
		return instancia;
	}
	
	/**
	 * Modifica la instancia
	 * @param instancia
	 */
	public void setInstancia(EcoreLoader instancia) 
	{
		this.instancia = instancia;
	}
	
	public static void main (String args[])
	{
		EcoreLoader loader = new EcoreLoader();
		String modelURL = "./data/organizationalStructure2.ecore";
		loader.setModelURL(modelURL);
		Metamodel MM = loader.loadModel();	
	}


}
