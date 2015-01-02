package en.ar.picture.webpicture.core;

import java.util.Date;
import java.util.ArrayList;

/**
 * Representa un editor creado
 * @author hellspawn
 */
public class Editor {
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
	public final static String EDITOR = "editor_";

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
	 * Diagramas del editor
	 */
	private ArrayList<Diagram> diagrams;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------


	/**
	 * Crea un nuevo editor
	 * @param id - Identificador del editor
	 * @param name - Nombre del editor
	 * @param description - Descripcion del editor
	 * @param author - Autor/Responsable
	 * @param path - Ruta del editor
	 * @param created - Fecha de creacion del editor
	 */
	public Editor(int id, String name, String description, String author, String path, Date created) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.author = author;
		this.path = path;
		this.created = created;
		diagrams = new ArrayList<Diagram>();
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
	 * @return the diagrams
	 */
	public ArrayList<Diagram> getDiagrams() {
		return diagrams;
	}

	/**
	 * @param diagrams
	 *            the diagrams to set
	 */
	public void setDiagrams(ArrayList<Diagram> diagrams) {
		this.diagrams = diagrams;
	}

	/**
	 * Retorna el codigo HTML para representar la información del editor en el
	 * navegador
	 * @param strDate - Fecha de creación en String
	 * @return - Codigo HTML del editor
	 */
	public String toString(String strDate) {
		String ans = "<div id='"
				+ EDITOR
				+ this.getId()
				+ "' class='pure-g' style='border-top: 1px solid #808080; border-bottom: 1px solid #808080'> <div class='pure-u-1-6' style='text-align: center'> <img class='pure-img-responsive' src='resources/res/basic.png' style='width: 120px; height: 120px' /> </div> <div class='pure-u-5-6' style='text-align: left'> <div class='pure-g'> <div class='pure-u-5-6' style='text-align: left'> <i class='fa fa-bookmark-o' style='margin-left: 10px'></i> Name: "
				+ this.getName()
				+ "<br> <i class='fa fa-user' style='margin-left: 10px'></i> Author: "
				+ this.getAuthor()
				+ "<br> <i class='fa fa-ellipsis-h' style='margin-left: 10px'></i> Description: "
				+ this.getDescription()
				+ "<br> <i class='fa fa-calendar' style='margin-left: 10px'></i> Created: "
				+ strDate
				+ "</div> <div class='pure-u-1-6' style='text-align: left'> <button type='button' class='button-secondary pure-button' style='width: 100%; height: 40px' onclick="
				+ '"'
				+ "getSelectedActionForEditor('newModel', "
				+ this.getId()
				+ ")"
				+ '"'
				+ "> <i class='fa fa-file' style='margin-left: 10px'></i> </button> <button type='button' class='pure-button pure-button-primary' style='width: 100%; height: 40px' onclick="
				+ '"'
				+ "getSelectedActionForEditor('review', "
				+ this.getId()
				+ ")"
				+ '"'
				+ "><i class='fa fa-bars' style='margin-left: 10px'></i> </button> <button type='button' class='button-error pure-button' style='width: 100%; height: 40px' onclick="
				+ '"'
				+ "getSelectedActionForEditor('delete', "
				+ this.id
				+ ")"
				+ '"'
				+ "> <i class='fa fa-times' style='margin-left: 10px'></i> </button> </div> </div> </div> </div> <div id='"
				+ PAD + this.id + "' style='height: 2px'></div>";
		return ans;
	}

	/**
	 * Retorna el codigo HTML para representar la información basica del editor 
	 * @param strDate - Fecha de creación en String 
	 * @return - Codigo HTML del editor
	 */
	public String dataToString(String strDate) {
		String ans = "<div class='pure-u-1-3' style='text-align:center;border-right:1px solid #808080; height:100%; background-color: #F0F0F0 ;'> <div class='hero-titles'> <h3 class='hero-tagline' style='text-align:center; margin-top:50px'>"
				+ this.getName()
				+ "</h3> <img class='pure-img-responsive' src='resources/res/basic.png' style='width:auto;height:auto' /> </div> <div style='text-align:justify'> <i class='fa fa-user' style='margin-left:20px'></i> Author: "
				+ this.getAuthor()
				+ "<br> <i class='fa fa-ellipsis-h' style='margin-left:20px'></i> Description: "
				+ this.getDescription()
				+ "<br> <i class='fa fa-calendar' style='margin-left:20px'></i> Created: "
				+ strDate
				+ "</div> <div style='margin-top:50px'> <button type='button' class='button-secondary pure-button pure-input-1-2' onclick="
				+ '"'
				+ "getSelectedActionForEditor('newModel', "
				+ this.getId()
				+ ")"
				+ '"'
				+ "><i class='fa fa-file'></i> New diagram</button> <button type='button' class='button-error pure-button pure-input-1-2' onclick="
				+ '"'
				+ "getSelectedActionForEditor('deleteEditor', "
				+ this.getId()
				+ ")"
				+ '"'
				+ "><i class='fa fa-times'></i> Delete editor</button> </div></div>";
		return ans;
	}
	
	/**
	 * Retorna el codigo HTML para representar la información basica del editor para la creacion de diagramas
	 * @param strDate - Fecha de creación en String 
	 * @return - Codigo HTML del editor
	 */
	public String dataToNewDiagram(String strDate) {
		String ans = "<div class='pure-u-1-2' style='text-align:center;border-right:1px solid #808080; height:100%; background-color: #F0F0F0 ;'><div class='hero-titles'> <h3 class='hero-tagline' style='text-align:center; margin-top:50px'>Create new diagram</h3> <img class='pure-img-responsive' src='resources/res/nwDiagram.png' style='width:auto;height:auto;text-align:center; ' /> </div> <div style='text-align:justify'><i class='fa fa-bookmark-o' style='margin-left:150px'></i> Name: "
				+ this.getName()
				+ " <br><i class='fa fa-user' style='margin-left:150px'></i> Author: "
				+ this.getAuthor()
				+ " <br><i class='fa fa-ellipsis-h' style='margin-left:150px'></i> Description: "
				+ this.getDescription()
				+ "<br> <i class='fa fa-calendar' style='margin-left:150px'></i> Created: "
				+ strDate + "</div></div>";
		return ans;
	}
}
