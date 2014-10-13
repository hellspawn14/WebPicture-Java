package Entities;

/**
 * Representa un atributo de un elemento del modelo
 * @author hellspawn
 */
public class Attribute 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Nombre del atributo
	 */
	private String attributeName;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------
	
	/**
	 * Crea un nuevo atributo basado en los atributos de los elementos del metamodelo 
	 * @param attributeName - Es el Nombre del atributo
	 * @param attributeType - Es el tipo del atributo
	 */
	public Attribute(String attributeName) 
	{
		this.attributeName = attributeName;
	}

	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * Retorna el nombre del atributo 
	 * @return attributeName
	 */
	public String getAttributeName() 
	{
		return attributeName;
	}

	
}
