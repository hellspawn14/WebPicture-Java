package co.edu.uniandes.picture.webpicture.metamodel;

import java.util.ArrayList;

/**
 * Representa el metamodelo cargado por el usuario 
 * @author hellspawn
 */
public class Metamodel 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------

	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Contenedora de elementos del modelo 
	 */
	private ArrayList <Metaelement> modelElements;
	
	/**
	 * Elemento raiz del modelo 
	 */
	private Metaelement root;
	
	/**
	 * Nombre del modelo 
	 */
	private String name;
	
	/**
	 * Nombre del metamodelo referenciado
	 */
	private String referencedModel;
	
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo metamodelo vacio 
	 * @param name - Nombre del metamodelo 
	 * @param referencedModel - Nombre del archivo .ecore
	 */
	public Metamodel(String name, String referencedModel) 
	{
		this.name = name;
		this.setReferencedModel(referencedModel);
		modelElements = new ArrayList <Metaelement> ();
	}
	
	//------------------------------------------------------------------
	//Metodos 
	//------------------------------------------------------------------

	/**
	 * Retorna un metaelemento dado su nombre
	 * @param name - Es el nombre del metaelemento
	 * @return Metaelement/null
	 */
	public Metaelement getMetaelementByName(String name)
	{
		Metaelement ans = null;
		for (int i = 0; i < modelElements.size(); i++)
		{
			ans = modelElements.get(i);
			if (ans.getName().equals(name))
			{
				return ans;
			}
			else
			{
				ans = null;
			}
		}
		return ans;
	}
	
	public String toString()
	{
		String ans = "Name: " + this.getName() + "\n" + 
					 "--------------Elements--------------" + "\n";
		for (int i = 0; i < this.modelElements.size(); i++)
		{
			ans += this.modelElements.get(i).toString() + "\n";
		}
		return ans;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------

	
	/**
	 * @return the modelElements
	 */
	public ArrayList<Metaelement> getModelElements() {
		return modelElements;
	}


	/**
	 * @param modelElements the modelElements to set
	 */
	public void setModelElements(ArrayList<Metaelement> modelElements) {
		this.modelElements = modelElements;
	}

	/**
	 * @return the root
	 */
	public Metaelement getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Metaelement root) {
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

	/**
	 * @return the referencedModel
	 */
	public String getReferencedModel() {
		return referencedModel;
	}

	/**
	 * @param referencedModel the referencedModel to set
	 */
	public void setReferencedModel(String referencedModel) {
		this.referencedModel = referencedModel;
	}
}
