package Picture;

public class Ellipse extends RegularFigure
{


	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

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
	public Ellipse(boolean labelIcon, String resourceName, String labelCaption,String labelPlacement, ToolGroup toolGroup, int width, int height,String elementDescription, Border resourceBorder,Color resourceColor) 
	{
		super(labelIcon, resourceName, labelCaption, labelPlacement, toolGroup, width,height, elementDescription, resourceBorder, resourceColor);
		// TODO Auto-generated constructor stub
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
		String gen = "var " + this.getVarNameID() + "= new joint.shapes.basic.Circle({" + "\n" +"	position: { x: 335, y: 50 }," + "\n" + "	size: { width:" + super.getWidth() + ", height:" + super.getHeight() + "}," + "\n" + "	attrs: {" + "\n" + "		circle: {fill:'" + super.getResourceColor().rgbToHex() + "'}," + "\n" + "		text: {text:'" +  super.getLabelCaption() + "'}" + "\n" + "	}" + "\n" + "});" + "\n" + "graph.addCell(" + this.getVarNameID() + ");";
		return gen;
	}

	@Override
	public String getVarNameID() 
	{
		return this.toString().replace("@", "X").replace(".", "Q");
	}

	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	

	public final static void main (String [] args)
	{
		Color C = new Color (245,20,13);
		Ellipse E = new Ellipse(false,"Elipse", "Elipse", "internal", null, 100, 100, "Solo ola ke ase", null, C);
		System.out.println(E.drawForCanvas());
	}

}
