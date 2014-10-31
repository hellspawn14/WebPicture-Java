package Model;

import java.util.ArrayList;

/**
 * Representa un elemento de la paleta del editor generado 
 * @author hellspawn
 */
public class Element 
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
	private Element father;

	/**
	 * Lista con las referencias del elemento 
	 */
	private ArrayList <Link> references;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo elemento de la paleta 
	 * @param name - Nombre de la clase que referencia 
	 */
	public Element(String name) 
	{
		this.name = name;
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
	public Element getFather() {
		return father;
	}

	/**
	 * @param father the father to set
	 */
	public void setFather(Element father) {
		this.father = father;
	}

	/**
	 * @return the references
	 */
	public ArrayList<Link> getReferences() {
		return references;
	}

	/**
	 * @param references the references to set
	 */
	public void setReferences(ArrayList<Link> references) {
		this.references = references;
	}	
}
