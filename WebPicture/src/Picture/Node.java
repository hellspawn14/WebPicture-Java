package Picture;


/**
 * Es la representacion grafica de una entidad
 * @author hellspawn
 */
public abstract class Node extends GraphicalResource
{
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * represent if we want to show a little icon with the representation.
	 */
	private boolean labelIcon;
	
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * @param labelIcon
	 * @param resourceName
	 * @param labelCaption
	 * @param labelPlacement
	 * @param toolGroup
	 * @param width
	 * @param height
	 * @param elementDescription
	 * @param resourceBorder
	 * @param resourceColor
	 */
	public Node(boolean labelIcon, String resourceName, String labelCaption,String labelPlacement, ToolGroup toolGroup, int width, int height,String elementDescription, Border resourceBorder,Color resourceColor)
	{
		super(resourceName, labelCaption, labelPlacement, toolGroup, width, height,elementDescription, resourceBorder, resourceColor);
		this.labelIcon = labelIcon;
	}
		
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * @return the labelIcon
	 */
	public boolean hasLabelIcon() 
	{
		return labelIcon;
	}
	
	/**
	 * @param labelIcon the labelIcon to set
	 */
	public void setLabelIcon(boolean labelIcon) 
	{
		this.labelIcon = labelIcon;
	}
	

}