package enar.picture.webpicture.graphical.palette;

import java.util.ArrayList;

/**
 * Representa la paleta de elementos del editor
 * @author hellspawn
 */
public class Palette 
{
	//------------------------------------------------------------------
	//Constantes 
	//------------------------------------------------------------------
	
	/**
	 * Indicador de no generación 
	 */
	private final static String NO_SCRIPT = "No script"; 
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Nombre de la paleta de elementos 
	 */
	private String name;
	
	/**
	 * Descripcion de la paleta 
	 */
	private String description; 
	
	/**
	 * Grupo de elementos de la paleta
	 */
	private ArrayList <ToolGroup> toolGroups;
	
	/**
	 * Script de generación de la paleta 
	 */
	private String genScript; 
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea una nueva paleta a partir de la especificación del metamodelo y el archivo picture
	 * @param name - Nombre de la paleta 
	 * @param description - Descripcion de la paleta 
	 */
	private Palette(String name, String description)
	{
		//Inicializa los atributos basicos 
		this.name = name;
		this.description = description; 
		this.genScript = NO_SCRIPT;
		//Inicializa el arreglo vacio 
		toolGroups = new ArrayList <ToolGroup>();
	}
	
	//------------------------------------------------------------------
	//Metodos 
	//------------------------------------------------------------------

	/**
	 * Genera el script para la creación de la paleta y los grupos de elementos de la paleta
	 */
	public void generateScript()
	{
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
	 * @return the toolGroups
	 */
	public ArrayList<ToolGroup> getToolGroups() {
		return toolGroups;
	}

	/**
	 * @param toolGroups the toolGroups to set
	 */
	public void setToolGroups(ArrayList<ToolGroup> toolGroups) {
		this.toolGroups = toolGroups;
	}

	/**
	 * @return the genScript
	 */
	public String getGenScript() {
		return genScript;
	}

	/**
	 * @param genScript the genScript to set
	 */
	public void setGenScript(String genScript) {
		this.genScript = genScript;
	}
}
