package Picture;

public class PictureFigure extends Node
{

	
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Es la ruta de la imagen del recurso
	 */
	private String imagePath;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * @param imagePath
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
	public PictureFigure(String imagePath, boolean labelIcon, String resourceName, String labelCaption, String labelPlacement, ToolGroup toolGroup, int width, int height, String elementDescription, Border resourceBorder, Color resourceColor) 
	{
		super(labelIcon, resourceName, labelCaption, labelPlacement, toolGroup, width,height, elementDescription, resourceBorder, resourceColor);
		this.setImagePath(imagePath);
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
		String gen = "var " + this.getVarNameID() + "= new joint.shapes.basic.Image({" + "\n" +"	position: { x: 335, y: 50 }," + "\n" + "	size: { width:" + super.getWidth() + ", height:" + super.getHeight() + "}," + "\n" + "	attrs: {" + "\n" + "		" + "image: { 'xlink:href': '" + this.getImagePath() + "', width:" + super.getWidth() + ", height:"+ super.getHeight() + "}," + "\n" + "		text: {text:'" +  super.getLabelCaption() + "'}" + "\n" + "	}" + "\n" + "});" + "\n" + "graph.addCell(" + this.getVarNameID() + ");";
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
	
	/**
	 * @return the imagePath
	 */
	public String getImagePath() 
	{
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) 
	{
		this.imagePath = imagePath;
	}
	public static void main (String args[])
	{
		String imgPath = "../res/who.jpg";
		PictureFigure F = new PictureFigure(imgPath,false,"Foto", "Foto", "internal", null, 100, 100, "Solo ola ke ase", null, null);
		System.out.println(F.drawForCanvas());	
	}

	

}
