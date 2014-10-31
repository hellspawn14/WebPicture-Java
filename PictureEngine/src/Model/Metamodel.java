package Model;

import java.util.ArrayList;

/**
 * Representa el metamodelo cargado por el usuario 
 * @author hellspawn
 */
public class Metamodel 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Contenedora de elementos del modelo 
	 */
	private ArrayList <Element> modelElements;
	
	/**
	 * Elemento raiz del modelo 
	 */
	private Element root;
	
	/**
	 * Nombre del modelo 
	 */
	private String name;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo metamodelo vacio 
	 * @param name - Nombre del metamodelo 
	 */
	public Metamodel(String name) 
	{
		this.name = name;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------


	/**
	 * @return the modelElements
	 */
	public ArrayList<Element> getModelElements() {
		return modelElements;
	}


	/**
	 * @param modelElements the modelElements to set
	 */
	public void setModelElements(ArrayList<Element> modelElements) {
		this.modelElements = modelElements;
	}

	/**
	 * @return the root
	 */
	public Element getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Element root) {
		this.root = root;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
