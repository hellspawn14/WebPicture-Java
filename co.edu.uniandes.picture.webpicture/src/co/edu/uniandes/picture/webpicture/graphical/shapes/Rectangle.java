package co.edu.uniandes.picture.webpicture.graphical.shapes;

import co.edu.uniandes.picture.webpicture.graphical.style.Border;
import co.edu.uniandes.picture.webpicture.graphical.style.Color;

/**
 * Representa un rectangulo 
 * @author hellspawn
 */
public class Rectangle extends Basic
{

	//------------------------------------------------------------------
	//Atributos
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
	 */
	public Rectangle(int height, int width, int x, int y, String label, Color color, Border border) 
	{
		super(height, width, x, y, label, color, border);
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
						"attrs: { rect: { width: " + this.getWidth() + ", height: " + this.getHeight() + ", fill: '" + this.getColor().getHex() + "', rx: 0, ry: 0, " + this.getBorder().generateScript() + "},  text: {text: '" + this.getLabel() + "', fill: 'black', 'font-size': 14, 'font-weight': 'normal'}}" + "\n" + 
		    			"});";
		return script;
	}
	
	public static void main (String args[])
	{
		Color filler = new Color (0,255,255,"Cyan");
		Color lines = new Color (0,0,0,"White");
		Border B = new Border(lines, 1, "dot");
		Rectangle R = new Rectangle(100, 100, 10 , 70, "Ola ke ase", filler, B);
		System.out.println(R.generateScript());
	}
}
