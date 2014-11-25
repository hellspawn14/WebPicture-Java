package co.edu.uniandes.picture.webpicture.core;

import java.util.Date;
import java.util.ArrayList;

/**
 * Representa un editor creado 
 * @author hellspawn
 */
public class Editor 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------

	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Identificador del editor
	 */
	private int id;
	
	/**
	 * Nombre del editor
	 */
	private String name;
	
	/**
	 * Descripcion del editor
	 */
	private String description;
	
	/**
	 * Autor del editor
	 */
	private String author;
	
	/**
	 * Directorio del editor 
	 */
	private String path;
	
	/**
	 * Fecha de creación 
	 */
	private Date created;
	
	/**
	 * Fecha de modificación 
	 */
	private Date lastModified;
	
	/**
	 * Diagramas del editor
	 */
	private ArrayList <Diagram> diagrams;
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo editor 
	 * @param id - Identificador del editor
	 * @param name - Nombre del editor
	 * @param description - Descripcion del editor 
	 * @param author - Autor/Responsable
	 * @param path - Ruta del editor 
	 * @param created - Fecha de creacion del editor
	 * @param lastModified - Fecha de modificacion 
	 */
	public Editor(int id, String name, String description, String author, String path, Date created, Date lastModified)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.author = author;
		this.path = path;
		this.created = created;
		this.lastModified = lastModified;
		diagrams = new ArrayList <Diagram> ();
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}


	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @return the diagrams
	 */
	public ArrayList<Diagram> getDiagrams() {
		return diagrams;
	}

	/**
	 * @param diagrams the diagrams to set
	 */
	public void setDiagrams(ArrayList<Diagram> diagrams) {
		this.diagrams = diagrams;
	}
}
