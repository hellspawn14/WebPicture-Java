package co.edu.uniandes.picture.webpicture.graphical.shapes;

import co.edu.uniandes.picture.webpicture.graphical.style.Border;
import co.edu.uniandes.picture.webpicture.graphical.style.Color;

public class RoundedRectangle extends Basic
{

	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	/**
	 * The x-axis radius of the ellipse that is used to round the corners of a rectangle. 
	 */
	private int rx; 
	
	/**
	 * The y-axis radius of the ellipse that is used to round the corners of a rectangle. 
	 */
	private int ry;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea una nueva forma basica con los parametros dados 
	 * @param height - Alto 
	 * @param width - Ancho 
	 * @param x - Posicion inicial en X
	 * @param y - Posicion inicial en Y
	 * @param label - Label para mostrar 
	 * @param color - Color de la forma (fondo)
	 * @param border - Borde de la forma
	 * @param rx - Radio x 
	 * @param ry - Radio y
	 */
	public RoundedRectangle(int height, int width, int x, int y, String label, Color color, Border border, int rx, int ry) 
	{
		super(height, width, x, y, label, color, border);
		this.setRx(rx);
		this.setRy(ry);
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	@Override
	public String generateScript() 
	{

		String varId = "Rect" + this.toString().split("@")[this.toString().split("@").length - 1];
		this.setShapeId(varId);
		String script = "var " + varId + " = new joint.shapes.basic.Rect({" + "\n" + 
						"position: { x: " + this.getX() + ", y:" +  this.getY() + " }," + "\n" + 
						"size: { width:" + this.getWidth() + ", height: " + this.getHeight() + " }," + "\n" + 
						"attrs: { rect: { width: " + this.getWidth() + ", height: " + this.getHeight() + ", fill: '" + this.getColor().getHex() + "', rx: " + this.getRx() + ", ry: " + this.getRy() + "," + this.getBorder().generateScript() + "},  text: {text: '" + this.getLabel() + "', fill: 'black', 'font-size': 14, 'font-weight': 'normal'}}" + "\n" + 
		    			"});";
		return script;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------

	public static void main (String args[])
	{
		Color filler = new Color (0,255,255,"Cyan");
		Color lines = new Color (0,0,0,"White");
		Border B = new Border(lines, 1, "dot");
		RoundedRectangle R = new RoundedRectangle(100, 100, 10 , 70, "Ola ke ase", filler, B, 20, 20);
		System.out.println(R.generateScript());
	}
	
	/**
	 * @return the rx
	 */
	public int getRx() {
		return rx;
	}

	/**
	 * @param rx the rx to set
	 */
	public void setRx(int rx) {
		this.rx = rx;
	}

	/**
	 * @return the ry
	 */
	public int getRy() {
		return ry;
	}

	/**
	 * @param ry the ry to set
	 */
	public void setRy(int ry) {
		this.ry = ry;
	}

}
