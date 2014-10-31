package Entities;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Representa el metamodelo del editor (Ecore)
 * @author hellspawn
 */
public class Metamodel 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Nombre del model
	 */
	private String modelName;
	
	/**
	 * Directorio del modelo
	 */
	private String modelDir;
	
	/**
	 * Entidades del metamodelo
	 */
	private ArrayList <Entity> entities;

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	public Metamodel(String modelName, String modelDir) 
	{
		this.modelName = modelName;
		this.modelDir = modelDir;
		entities = new ArrayList<Entity>();
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Finaliza la carga del metamodelo cargando los targets
	 */
	public void endLoad()
	{
		String srcName = "";
		Entity src;
		Entity des;
		String desName = "";
		Reference ref;
		String refName = "";
		
		for (int i = 0; i < entities.size(); i++)
		{
			src = entities.get(i);
			srcName = src.getEntityName();
			//System.out.println("SRC: " + srcName);
			for (int k = 0; k < src.getReferencias().size(); k++)
			{
				ref = src.getReferencias().get(k);
				refName = ref.getRefName();
				//System.out.println("REF: " + refName);
				desName = loadTargets(srcName, refName);
				des = getEntityByName(desName);
				if (des != null)
				{
					ref.setTarget(des);
				}
				//System.out.println(ref.getSource().getEntityName() + "->" + ref.getRefName() + "->" + ref.getTarget().getEntityName());
			}
		}
	}

	
	/**
	 * Retorna una entidad dada su nombre 
	 * @param name - Es el nombre de la entidad
	 * @return - Null/Entidad encontrada
	 */
	public Entity getEntityByName(String name)
	{
		Entity E = null;
		for (int i = 0; i < entities.size(); i++)
		{
			E = entities.get(i);
			if (E.getEntityName().equals(name))
			{
				return E;
			}
		}
		return E;
	}
	
	
	/**
	 * Carga los los targets de las relacione s
	 * @param source - Es la clase origen
	 * @param refName - Es el nombre de la referencia 
	 * @return
	 */
	public String loadTargets(String source, String refName)
	{
		String ans = "";
		 try 
		 {
			 File fXmlFile = new File(modelDir);
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			 DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			 Document doc = dBuilder.parse(fXmlFile);
			 
			 //optional, but recommended
			 //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			 doc.getDocumentElement().normalize();
			 NodeList nList = doc.getElementsByTagName("eClassifiers");
			 boolean termino = false;
			 for (int temp = 0; temp < nList.getLength() && !termino; temp++) 
			 {
				 Node nNode = nList.item(temp);
				 if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				 {
					 Element eElement = (Element) nNode;
					 String eElementType = eElement.getAttribute("name");
					 if (eElementType.equals(source))
					 {
						 //System.out.println("Current Element :" + nNode.getNodeName());
						 //System.out.println("	Element name : " + eElementType);
						 
						 NodeList eList = eElement.getElementsByTagName("eStructuralFeatures");
						 //System.out.println(eList.getLength());
						 for (int i = 0; i < eList.getLength(); i++)
						 {
							 Node eNode = eList.item(i);
							 Element xElement = (Element) eNode;
							 String XTypo = xElement.getAttribute("xsi:type");
							 String nombreRef = xElement.getAttribute("name");
							 if (XTypo.equals("ecore:EReference") && nombreRef.equals(refName))
							 {
								 String link = xElement.getAttribute("eType").split("//")[1];
								 //System.out.println(link);
								 ans = link;
							 }
						 }
						 termino = true;
					 }
				 }
			 }
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return ans;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------


	/**
	 * Retorna las entidades 
	 * @return entities
	 */
	public ArrayList<Entity> getEntities() 
	{
		return entities;
	}

	/**
	 * Inicializa las entidades del metamodelo
	 * @param entities
	 */
	public void setEntities(ArrayList<Entity> entities) 
	{
		this.entities = entities;
	}

	/**
	 * Retorna el nombre del metamodelo
	 * @return modelName
	 */
	public String getModelName() 
	{
		return modelName;
	}

	/**
	 * Retorna el directorio del metamodelo 
	 * @return modelDir
	 */
	public String getModelRes() 
	{
		return modelDir;
	}
}