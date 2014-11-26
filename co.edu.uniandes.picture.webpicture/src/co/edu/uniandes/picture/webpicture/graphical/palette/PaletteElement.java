package co.edu.uniandes.picture.webpicture.graphical.palette;

/**
 * Representa un elemento de creación de un elemento del editor
 * @author hellspawn
 */
public class PaletteElement 
{
	//------------------------------------------------------------------
	//Constantes 
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Nombre del elemento 
	 */
	private String name;
	
	/**
	 * Descripcion del elemento 
	 */
	private String description;
	
	/**
	 * Ruta del icono
	 */
	private String iconPath;

	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo elemento de la paleta 
	 * @param name - Nombre del elemento 
	 * @param description - Descripcion del elemento 
	 * @param iconPath - Ruta del icono
	 */
	public PaletteElement(String name, String description, String iconPath) {
		this.name = name;
		this.description = description;
		this.iconPath = iconPath;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera y retorna el sript JS para crear el elemento en la paleta 
	 * @return - Script de creación del elemento
	 */
	public String generateScript()
	{
		return null;
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
	 * @return the iconPath
	 */
	public String getIconPath() {
		return iconPath;
	}

	/**
	 * @param iconPath the iconPath to set
	 */
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

}
