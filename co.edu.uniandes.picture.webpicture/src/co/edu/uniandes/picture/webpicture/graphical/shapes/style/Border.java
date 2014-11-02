package co.edu.uniandes.picture.webpicture.graphical.shapes.style;

/**
 * Representa el borde/linea de un elemento 
 * @author hellspawn
 */
public class Border 
{
	//------------------------------------------------------------------
	//Constantes 
	//------------------------------------------------------------------
	
	/**
	 * Linea solida 
	 */
	public final static String SOLID_LINE = "'stroke-dasharray': '0,0'";
	public final static String SOLID = "solid";
	
	/**
	 * Linea punteada
	 * Muestra -> .............. 
	 */
	public final static String DOT_LINE = "'stroke-dasharray': '1,1'";
	public final static String DOT = "dot";
	
	/**
	 * Linea con dash
	 * Muestra -> --------------
	 */
	public final static String DASH_LINE = "'stroke-dasharray': '10,2'";
	public final static String DASH = "dash";
	
	/**
	 * Linea punteada con dashes
	 * Muestra -> -.-.-.-.-.-.-.-.-.-.-.-.-
	 */
	public final static String DASH_DOT_LINE = "stroke-dasharray='10,2,5,2,10,2'";
	public final static String DASH_DOT = "dashdot";
	
	/**
	 * Linea punteada con dashes 
	 * Muestra -> -..-..-..-..-..-
	 */
	public final static String DASH_DOT_DOT_LINE = "stroke-dasharray='10,2,5,2,5,2'";
	public final static String DASH_DOT_DOT = "dashdotdot";

	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Color del borde
	 */
	private Color borderColor;
	
	/**
	 * Grosor del borde 
	 */
	private int width;
	
	/**
	 * Estilo de borde
	 */
	private String borderStyle;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------
	

	/**
	 * Crea un nuevo borde 
	 * @param borderColor - Color del borde
	 * @param width - Grosor del borde 
	 * @param borderStyle - Estilo del borde 
	 */
	public Border(Color borderColor, int width, String borderStyle) {
		this.borderColor = borderColor;
		this.width = width;
		this.borderStyle = borderStyle;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Retorna el codigo en JavaScript para generar el borde 
	 * @return 
	 */
	public String generateScript()
	{
		//'stroke-width': 1, stroke: 'black', 'stroke-dasharray': '10,2' 
		String color = borderColor.getHex();
		if (borderStyle.equals(SOLID))
		{
			return "'stroke-width': " + this.getWidth() + " ," + "stroke: '" + color + "' , " + SOLID_LINE; 
		}
		else if (borderStyle.equals(DOT))
		{
			return "'stroke-width': " + this.getWidth() + " ," + "stroke: '" + color + "' , " + DOT_LINE;
		}
		else if (borderStyle.equals(DASH))
		{
			return "'stroke-width': " + this.getWidth() + " ," + "stroke: '" + color + "' , " + DASH_LINE;
		}
		else if (borderStyle.equals(DASH_DOT))
		{
			return "'stroke-width': " + this.getWidth() + " ," + "stroke: '" + color + "' , " + DASH_DOT_LINE;
		}
		else if (borderStyle.equals(DASH_DOT_DOT))
		{
			return "'stroke-width': " + this.getWidth() + " ," + "stroke: '" + color + "'s , " + DASH_DOT_DOT_LINE;
		}
		
		return null;
	}
	
	public static void main (String args[])
	{
		Color C = new Color (10, 100,10, "Verde");
		Border B = new Border(C, 1, "dash");
		System.out.println(B.generateScript());
	}
	
	


	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------

	
	/**
	 * @return the borderColor
	 */
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * @param borderColor the borderColor to set
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the borderStyle
	 */
	public String getBorderStyle() {
		return borderStyle;
	}

	/**
	 * @param borderStyle the borderStyle to set
	 */
	public void setBorderStyle(String borderStyle) {
		this.borderStyle = borderStyle;
	}
	
}