package co.edu.uniandes.picture.webpicture.graphical.shapes;

import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Border;
import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Color;

public class Ellipse extends Basic
{

	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

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
	 */
	public Ellipse(int height, int width, int x, int y, String label,Color color, Border border) 
	{
		super(height, width, x, y, label, color, border);
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	@Override
	public String generateScript() 
	{
		String varId = "Circ" + this.toString().split("@")[this.toString().split("@").length - 1];
		this.setShapeId(varId);
		String script = "var " +  varId + " = new joint.shapes.basic.Circle({ " + "\n" + 
						"position: { x: " + this.getX() + ", y: " + this.getY() + " }, size: { width: " + this.getWidth() + ", height: " + this.getHeight() + " }," + "\n" + 
						"attrs: { circle: { width: " + this.getWidth() + ", height: " + this.getHeight() + ", fill: '" + this.getColor().getHex() + "', rx: 0, ry: 0, " + this.getBorder().generateScript() + "},  text: {text: '" + this.getLabel() + "', fill: 'black', 'font-size': 14, 'font-weight': 'normal'}}" + "\n" + 
						"});";
		return script;
	}
	
	public static void main (String args[])
	{
		Color filler = new Color (0,255,255,"Cyan");
		Color lines = new Color (0,0,0,"White");
		Border B = new Border(lines, 1, "solid");
		Ellipse C = new Ellipse(100, 100, 10 , 70, "Ola ke ase", filler, B);
		System.out.println(C.generateScript());
	}
}
