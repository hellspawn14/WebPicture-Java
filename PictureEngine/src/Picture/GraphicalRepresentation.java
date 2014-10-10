package Picture;

import java.util.ArrayList;

/**
 * Representa la representacion grafica del metamodelo (Picture)
 * @author hellspawn
 */
public class GraphicalRepresentation 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Lista de los recursos graficos disponibles (nodos)
	 */
	private ArrayList <GraphicalResource> nodes;
	
	/**
	 * Lista de los recursos graficos disponibles (links)
	 */
	private ArrayList <GraphicalResource> links;

	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * @return the nodes
	 */
	public ArrayList<GraphicalResource> getNodes() 
	{
		return nodes;
	}

	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(ArrayList<GraphicalResource> nodes) 
	{
		this.nodes = nodes;
	}

	/**
	 * @return the links
	 */
	public ArrayList<GraphicalResource> getLinks() 
	{
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(ArrayList<GraphicalResource> links) 
	{
		this.links = links;
	}

	
	

}