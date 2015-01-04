package co.edu.uniandes.picture.webpicture.util.metamodel;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import co.edu.uniandes.picture.webpicture.metamodel.Metaelement;
import co.edu.uniandes.picture.webpicture.metamodel.Metalink;
import co.edu.uniandes.picture.webpicture.metamodel.Metamodel;

import java.io.File;

/**
 * Carga el metamodelo construido por el usuario 
 * @author hellspawn
 */
public class XMIMetamodelLoader 
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
	 * Genera un metamodelo base construido a partir del metamodelo cargado 
	 * @param path - Directorio en el que se encuentra el metamodelo 
	 * @return Metamodel metamodelo base generado para iniciar la validacion 
	 */
	public Metamodel load(String path) throws Exception
	{
		try 
		{
			File ecore = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(ecore);
			doc.getDocumentElement().normalize();
			
			//Obtiene el nombre del modelo
			String modelName = doc.getDocumentElement().getAttribute("name");
			System.out.println(modelName);
			System.out.println(ecore.getName());
			//Genera el modelo vacio 
			Metamodel metamodel = new Metamodel(modelName, ecore.getName());
			
			//Obtiene los elementos del modelo
			NodeList eClasses = doc.getElementsByTagName("eClassifiers");
			for (int i = 0; i < eClasses.getLength(); i++) 
			{
				Node nNode = eClasses.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					Metaelement element = new Metaelement(eElement.getAttribute("name"));
					//System.out.println(eElement.getAttribute("name"));
					Metaelement existing = metamodel.getMetaelementByName(eElement.getAttribute("name"));
					if (existing != null)
					{
						throw new Exception ("There's already an element with the name " + eElement.getAttribute("name")  + " please review the metamodel.");
					}
					element.setFather(null);
					metamodel.getModelElements().add(element);
				}
			}
			//Obtiene los padres 
			for (int i = 0; i < eClasses.getLength(); i++) 
			{
				Node nNode = eClasses.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					String fatherName = eElement.getAttribute("eSuperTypes").trim();
					if(!fatherName.equals(""))
					{
						fatherName = fatherName.split("//")[1];
						Metaelement son = metamodel.getMetaelementByName(eElement.getAttribute("name"));
						Metaelement father = metamodel.getMetaelementByName(fatherName);
						son.setFather(father);
					}
				}
			}
			//Obtiene las referencias 
			for (int i = 0; i < eClasses.getLength(); i++) 
			{
				Node nNode = eClasses.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					Metaelement source = metamodel.getMetaelementByName(eElement.getAttribute("name"));
					
					NodeList eStructuralFeatures = eElement.getElementsByTagName("eStructuralFeatures");
					for (int k = 0; k < eStructuralFeatures.getLength(); k++)
					{
						Node nElement = eStructuralFeatures.item(k);
						if(nElement.getNodeType() == Node.ELEMENT_NODE)
						{
							Element xElement = (Element) nElement;
							if (xElement.getAttribute("xsi:type").equals("ecore:EReference"))
							{
								int upperBound = 0;
								int lowerBound = 0;
								String linkName = xElement.getAttribute("name");
								//Caso I: No se pone el dato upperBound/lowerBound
								if (xElement.getAttribute("upperBound").trim().equals("") && xElement.getAttribute("lowerBound").trim().equals(""))
								{
									upperBound = 1;
									lowerBound = 0;
								}
								//Caso II: Solo se pone el dato de upperBound
								else if (xElement.getAttribute("lowerBound").trim().equals(""))
								{
									lowerBound = 0;
									upperBound = Integer.parseInt(xElement.getAttribute("upperBound"));
								}
								else if(xElement.getAttribute("upperBound").trim().equals(""))
								{
									lowerBound = Integer.parseInt(xElement.getAttribute("lowerBound"));
									upperBound = 1;
								}
								//Caso III: Los dos datos estan presentes
								else
								{
									lowerBound = Integer.parseInt(xElement.getAttribute("lowerBound"));
									upperBound = Integer.parseInt(xElement.getAttribute("upperBound"));
								}
								
								Metaelement target = metamodel.getMetaelementByName(xElement.getAttribute("eType").split("//")[1]);
								boolean containment = false;
								if (!xElement.getAttribute("containment").trim().equals(""))
								{
									containment = true;
								}
								Metalink link = new Metalink(lowerBound, upperBound, linkName, containment, target, source);
								source.getReferences().add(link);
							}
						}
						
					}
				}
			}
			//Metamodelo construido
			return metamodel;
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------

	public static void main (String args[])
	{
		try
		{//Archimate.ecore
			XMIMetamodelLoader loader = new XMIMetamodelLoader();
			Metamodel MM = loader.load("./WebContent/samples/modelAppLayer/ApplicationLayerArch.ecore");
			if (MM != null)
			{
				System.out.println(MM.getReferencedModel());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
