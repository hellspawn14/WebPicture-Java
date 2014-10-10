package Picture;

/**
 * Representa una figura regular (Ellipse, Rounded, Rectangle)
 * @author hellspawn
 */
public abstract class RegularFigure extends Node
{
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
	public RegularFigure(boolean labelIcon, String resourceName, String labelCaption, String labelPlacement, ToolGroup toolGroup,int width, int height, String elementDescription, Border resourceBorder, Color resourceColor) 
	{
		super(labelIcon, resourceName, labelCaption, labelPlacement, toolGroup, width,height, elementDescription, resourceBorder, resourceColor);
		// TODO Auto-generated constructor stub
	}
}
