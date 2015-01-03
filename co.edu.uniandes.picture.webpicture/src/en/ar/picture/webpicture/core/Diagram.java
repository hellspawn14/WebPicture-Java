package en.ar.picture.webpicture.core;

import java.util.Date;

/**
 * Representa un diagrama creado apartir de un editor
 * @author hellspawn
 */
public class Diagram {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	/**
	 * Encabezado del padding
	 */
	public final static String PAD = "pad_";

	/**
	 * Encabezado del contenedor
	 */
	public final static String DIAGRAM = "diagram_";

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

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

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo diagrama
	 * @param id - Identificador del diagrama
	 * @param name - Nombre del diagrama
	 * @param description - Descripción del diagrama
	 * @param author - Autor del editor
	 * @param path - Directorio del editor
	 * @param created - Fecha de creacion
	 * @param lastModified - Fecha de modificacion
	 */
	public Diagram(int id, String name, String description, String author, String path, Date created, Date lastModified) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.author = author;
		this.path = path;
		this.created = created;
		this.lastModified = lastModified;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

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
	 * Retorna el codigo HTML para representar la información del diagrama en el
	 * navegador
	 * @param strCreation - Fecha de creacion en String
	 * @param strModification - Fecha de modificación en String
	 * @return - Codigo HTML del editor
	 */
	public String toString(String strCreation, String strModification) {
		
		String ans = "<div id='"
				+ DIAGRAM
				+ this.id
				+ "' class='pure-g' style='border-top:1px solid #808080; border-bottom:1px solid #808080'> <div class='pure-u-1-6' style='text-align:center'> <img class='pure-img-responsive' src='resources/res/projectModel2.png' style='width:120px;height:120px' /> </div> <div class='pure-u-5-6' style='text-align:left'> <div class='pure-g'> <div class='pure-u-5-6' style='text-align:left'> <i class='fa fa-bookmark-o' style='margin-left:10px'></i> Name: "
				+ this.getName()
				+ " <br> <i class='fa fa-user' style='margin-left:10px'></i> Author: "
				+ this.getAuthor()
				+ "<br> <i class='fa fa-ellipsis-h' style='margin-left:10px'></i> Description: "
				+ this.getDescription()
				+ "<br> <i class='fa fa-calendar' style='margin-left:10px'></i> Created: "
				+ strCreation
				+ "<br> <i class='fa fa-calendar' style='margin-left:10px'></i> Last modified: "
				+ strModification
				+ " <br></div> <div class='pure-u-1-6' style='text-align:left'> <button type='button' class='button-secondary pure-button' style='width:100%;height:65px' onclick="
				+ '"'
				+ "getSelectedActionForModel('editDiagram', "
				+ this.getId()
				+ ")"
				+ '"'
				+ "><i class='fa fa-pencil-square-o' style='margin-left:10px'></i> </button> <button type='button' class='button-error pure-button' style='width:100%; height:65px' onclick="
				+ '"'
				+ "getSelectedActionForModel('delete', "
				+ this.getId()
				+ ")"
				+ '"'
				+ "><i class='fa fa-times' style='margin-left:10px'></i> </button></div></div></div></div> <div id='"
				+ PAD + this.id + "' style='height:2px'></div>";
		return ans;
	}
}
