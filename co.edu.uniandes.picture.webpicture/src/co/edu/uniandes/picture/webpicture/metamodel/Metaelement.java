package co.edu.uniandes.picture.webpicture.metamodel;

import java.util.ArrayList;

/**
 * Representa un elemento de la paleta del editor generado 
 * @author hellspawn
 */
public class Metaelement 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Nombre para mostrar del elemento 
	 */
	private String name; 
	
	/**
	 * Descripcion del elemento en la paleta 
	 */
	private String description;
	
	/**
	 * Script generado para crear el elemento 
	 */
	private String script;
	
	/**
	 * Nombre base para pintar en el canvas en la creacion 
	 */
	private String baseLabel;
	
	/**
	 * Referencia al elemento padre del que hereda 
	 */
	private Metaelement father;

	/**
	 * Lista con las referencias del elemento 
	 */
	private ArrayList <Metalink> references;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo elemento de la paleta 
	 * @param name - Nombre de la clase que referencia 
	 */
	public Metaelement(String name) 
	{
		this.name = name;
		references = new ArrayList<Metalink>();
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	public String toString()
	{
		String fatherName = "No father";
		if (this.father != null)
		{
			fatherName = this.father.getName(); 
		}
		String ans = "Element name: " + this.getName() + "\n" + 
					 "Father: " + fatherName + "\n";
		for (int i = 0; i < this.references.size(); i++)
		{
			ans += this.references.get(i).toString() + "\n";
		}
		return ans;
	}
	
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the script
	 */
	public String getScript() {
		return script;
	}

	/**
	 * @param script the script to set
	 */
	public void setScript(String script) {
		this.script = script;
	}

	/**
	 * @return the baseLabel
	 */
	public String getBaseLabel() {
		return baseLabel;
	}

	/**
	 * @param baseLabel the baseLabel to set
	 */
	public void setBaseLabel(String baseLabel) {
		this.baseLabel = baseLabel;
	}

	/**
	 * @return the father
	 */
	public Metaelement getFather() {
		return father;
	}

	/**
	 * @param father the father to set
	 */
	public void setFather(Metaelement father) {
		this.father = father;
	}

	/**
	 * @return the references
	 */
	public ArrayList<Metalink> getReferences() {
		return references;
	}

	/**
	 * @param references the references to set
	 */
	public void setReferences(ArrayList<Metalink> references) {
		this.references = references;
	}	
}
