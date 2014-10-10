package Picture;

/**
 * Representa el conjunto de recursos del editor
 * @author hellspawn
 */
public abstract class GraphicalResource 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Es el nombre del recurso
	 */
	private String resourceName;
	
	/**
	 * Es el texto que llevara el label del elemento
	 */
	private String labelCaption;
	
	/**
	 * Es la posicion en la que se pondra el label (internal | external)
	 */
	private String labelPlacement;
	
	/**
	 * Es el grupo al que pertenece el recurso
	 */
	private ToolGroup toolGroup;
	
	/**
	 * Es el ancho del elemento 
	 */
	private int width;
	
	/**
	 * Es el alto del elemento
	 */
	private int height;
	
	/**
	 * Descripcion del elemento
	 */
	private String elementDescription;
	
	/**
	 * Es el borde del elemento
	 */
	private Border resourceBorder;
	
	/**
	 * Es el color del elemento
	 */
	private Color resourceColor;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
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
	public GraphicalResource(String resourceName, String labelCaption,String labelPlacement, ToolGroup toolGroup, int width, int height,String elementDescription, Border resourceBorder,Color resourceColor) 
	{
		this.resourceName = resourceName;
		this.labelCaption = labelCaption;
		this.labelPlacement = labelPlacement;
		this.toolGroup = toolGroup;
		this.width = width;
		this.height = height;
		this.elementDescription = elementDescription;
		this.resourceBorder = resourceBorder;
		this.resourceColor = resourceColor;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Retorna el codigo en JS para dibujar el elemento en la paleta
	 * @return
	 */
	public abstract String drawForPalette();
	
	/**
	 * Retorna el codigo en JS para dibujar el elemento en el canvas 
	 * @return
	 */
	public abstract String drawForCanvas();
	
	/**
	 * Retorna un id unico para el objeto
	 * @return
	 */
	public abstract String getVarNameID();
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * @return the resourceName
	 */
	public String getResourceName() 
	{
		return resourceName;
	}

	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName) 
	{
		this.resourceName = resourceName;
	}

	/**
	 * @return the labelCaption
	 */
	public String getLabelCaption() 
	{
		return labelCaption;
	}

	/**
	 * @param labelCaption the labelCaption to set
	 */
	public void setLabelCaption(String labelCaption) 
	{
		this.labelCaption = labelCaption;
	}

	/**
	 * @return the labelPlacement
	 */
	public String getLabelPlacement() 
	{
		return labelPlacement;
	}

	/**
	 * @param labelPlacement the labelPlacement to set
	 */
	public void setLabelPlacement(String labelPlacement) 
	{
		this.labelPlacement = labelPlacement;
	}

	/**
	 * @return the toolGroup
	 */
	public ToolGroup getToolGroup() 
	{
		return toolGroup;
	}

	/**
	 * @param toolGroup the toolGroup to set
	 */
	public void setToolGroup(ToolGroup toolGroup) 
	{
		this.toolGroup = toolGroup;
	}

	/**
	 * @return the elementDescription
	 */
	public String getElementDescription() 
	{
		return elementDescription;
	}

	/**
	 * @param elementDescription the elementDescription to set
	 */
	public void setElementDescription(String elementDescription) 
	{
		this.elementDescription = elementDescription;
	}

	/**
	 * @return the resourceBorder
	 */
	public Border getResourceBorder() 
	{
		return resourceBorder;
	}

	/**
	 * @param resourceBorder the resourceBorder to set
	 */
	public void setResourceBorder(Border resourceBorder) 
	{
		this.resourceBorder = resourceBorder;
	}

	/**
	 * @return the resourceColor
	 */
	public Color getResourceColor() 
	{
		return resourceColor;
	}

	/**
	 * @param resourceColor the resourceColor to set
	 */
	public void setResourceColor(Color resourceColor) 
	{
		this.resourceColor = resourceColor;
	}

	/**
	 * @return the width
	 */
	public int getWidth() 
	{
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) 
	{
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() 
	{
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) 
	{
		this.height = height;
	}
}