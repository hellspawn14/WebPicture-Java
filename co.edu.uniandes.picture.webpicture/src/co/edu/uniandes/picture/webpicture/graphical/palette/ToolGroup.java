package co.edu.uniandes.picture.webpicture.graphical.palette;

import java.util.ArrayList;

/**
 * Representa un grupo de elementos de la paleta de un editor
 * @author hellspawn
 */
public class ToolGroup 
{
	//------------------------------------------------------------------
	//Constantes 
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Nombre del grupo 
	 */
	private String groupName;
	
	/**
	 * Descripcion del grupo 
	 */
	private String groupDescription;
	
	/**
	 * Lista de elementos que componen el grupo 
	 */
	private ArrayList <PaletteElement> paletteElements;
	
	/**
	 * Lista de subgrupos 
	 */
	private ArrayList <ToolGroup> toolGroups;

	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo grupo de herramientas de la paleta para un editor
	 * @param groupName - Nombre del grupo
	 * @param groupDescription - Descripcion del grupo 
	 */
	public ToolGroup(String groupName, String groupDescription) 
	{
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		paletteElements = new ArrayList <PaletteElement>();
		toolGroups = new ArrayList<ToolGroup>();
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera y retorna el sript JS para crear el grupo de elementos en la paleta 
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
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}


	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	/**
	 * @return the groupDescription
	 */
	public String getGroupDescription() {
		return groupDescription;
	}


	/**
	 * @param groupDescription the groupDescription to set
	 */
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}


	/**
	 * @return the paletteElements
	 */
	public ArrayList<PaletteElement> getPaletteElements() {
		return paletteElements;
	}


	/**
	 * @param paletteElements the paletteElements to set
	 */
	public void setPaletteElements(ArrayList<PaletteElement> paletteElements) {
		this.paletteElements = paletteElements;
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
}
