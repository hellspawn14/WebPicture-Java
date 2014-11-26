package co.edu.uniandes.picture.webpicture.graphical.palette;

import java.util.ArrayList;

/**
 * Representa la paleta de un editor
 * @author hellspawn
 */
public class Palette 
{
	//------------------------------------------------------------------
	//Constantes 
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Lista grupos de elementos de la paleta
	 */
	private ArrayList <ToolGroup> toolGroups;
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea una nueva paleta para el editor
	 */
	public Palette()
	{
		setToolGroups(new ArrayList<ToolGroup>());
	}

	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera y retorna el sript JS para crear la paleta 
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
	 * @return the toolGroups
	 */
	public ArrayList <ToolGroup> getToolGroups() {
		return toolGroups;
	}

	/**
	 * @param toolGroups the toolGroups to set
	 */
	public void setToolGroups(ArrayList <ToolGroup> toolGroups) {
		this.toolGroups = toolGroups;
	}	
}
