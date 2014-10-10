package Entities;

/**
 * Representa el elemento Root del modelo 
 * @author hellspawn
 */
public class Root 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Elemento raiz 
	 */
	private Entity rootElement;

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo elemento raiz 
	 * @param rootElement - Es el elemento raiz a asignar
	 */
	public Root(Entity rootElement) 
	{
		this.rootElement = rootElement;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * Retorna el elemento raiz 
	 * @return rootElement
	 */
	public Entity getRootElement() 
	{
		return rootElement;
	}
	

}
