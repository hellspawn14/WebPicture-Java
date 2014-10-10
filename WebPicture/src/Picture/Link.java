package Picture;

import Entities.Reference;

/**
 * Representacion grafica de una referencia
 * @author hellspawn
 */
public class Link extends GraphicalResource
{	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Es la referencia que representa
	 */
	private Reference reference;
	
	/**
	 * Punta de la linea para el lado de origen
	 */
	private String srcDecoration;

	/**
	 * Punta de la linea para el lado de destino
	 */
	private String trgDecoration;

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------
	
	public Link(Reference reference, String srcDecoration, String trgDecoration, String resourceName, String labelCaption,String labelPlacement, ToolGroup toolGroup, int width, String elementDescription, Border resourceBorder,Color resourceColor) 
	{
		super(resourceName, labelCaption,labelPlacement,toolGroup,width,1,elementDescription,resourceBorder, resourceColor);
		this.reference = reference;
		this.srcDecoration = srcDecoration;
		this.trgDecoration = trgDecoration;
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	@Override
	public String drawForPalette() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String drawForCanvas() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public String getVarNameID() 
	{
		return this.toString().replace("@", "X").replace(".", "Q");
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * @return the reference
	 */
	public Reference getReference() 
	{
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(Reference reference) 
	{
		this.reference = reference;
	}

}