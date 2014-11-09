package co.edu.uniandes.picture.webpicture.core;

import java.util.Date;

/**
 * Representa un editor creado 
 * @author hellspawn
 */
public class Editor 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Nombre del editor
	 */
	private String name;
	
	/**
	 * Autor del editor
	 */
	private String author;
	
	/**
	 * Descripcion del editor
	 */
	private String description;
	
	/**
	 * Fecha de creación 
	 */
	private Date created;
	
	/**
	 * Directorio del editor 
	 */
	private String path;

	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo editor con los parametros dados 
	 * @param name - Nombre del editor
	 * @param author - Autor del editor
	 * @param description - Descripcion del editor
	 * @param created - Fecha de creacion 
	 * @param path - Ruta de los archivos
	 */
	public Editor(String name, String author, String description, Date created, String path)
	{
		this.name = name;
		this.author = author;
		this.description = description;
		this.created = created;
		this.path = path;
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
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
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
}
