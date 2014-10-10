package Entities;

import java.util.ArrayList;

/**
 * Representa una entidad del modelo 
 * @author hellspawn
 */
public class Entity 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Representa las referencias a otras entidades
	 */
	private ArrayList <Reference> referencias;
	
	/**
	 * Representa los atributos de la entidad
	 */
	private ArrayList <Attribute> atributos;
	
	/**
	 * Es el nombre de la entidad 
	 */
	private String EntityName;

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea una nueva entidad sin atributos y sin referencias 
	 * @param entityName - Es el nombre de la entidad
	 */
	public Entity(String entityName) 
	{
		EntityName = entityName;
		referencias = new ArrayList <Reference>();
		atributos = new ArrayList <Attribute>();
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Agrega un nuevo atributo a la entidad
	 * @param A - Atributo por agregar
	 */
	public void addAtribute(Attribute A)
	{
		atributos.add(A);
	}
	
	/**
	 * Agrega una nueva relacion a la entidad
	 * @param R - Es la relacion por agregar 
	 */
	public void addReference(Reference R)
	{
		referencias.add(R);
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * Retorna las referencias que salen desde esta entidad 
	 * @return referencias
	 */
	public ArrayList<Reference> getReferencias() 
	{
		return referencias;
	}

	/**
	 * Retorna los atributos de la entidad
	 * @return atributos
	 */
	public ArrayList<Attribute> getAtributos() 
	{
		return atributos;
	}

	/**
	 * Retorna el nombre de la entidad 
	 * @return EntityName
	 */
	public String getEntityName() 
	{
		return EntityName;
	}
}
