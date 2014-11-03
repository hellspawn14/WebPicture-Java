package co.edu.uniandes.picture.webpicture.graphical.shapes;

import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Border;
import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Color;

/**
 * Representa una figura compleja 
 * @author hellspawn
 * No soporta magnet
 */
public class Complex extends Shape
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Numero de vertices 
	 */
	private int vertices; 
	
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
	 * @param vertices - Numero de vertices 
	 * @param metaelementName - Nombre del meta elemento que representa
	 */
	public Complex(int height, int width, int x, int y, String label, Color color, Border border, int vertices, String metaelementName) 
	{
		super(height, width, x, y, label, color, border, metaelementName);
		this.setVertices(vertices);
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	@Override
	public String generateScript() 
	{
		if (vertices == 3)
		{
			String varId = "Comp" + this.toString().split("@")[this.toString().split("@").length - 1];
			this.setShapeId(varId);
			String ans = "var "  + varId + " = new joint.shapes.basic.Path({" + "\n" + 
						 "position: { x: " + this.getX() + ", y: " + this.getY() + " }, size: { width: " + this.getWidth() + ", height: " + this.getHeight() + " }," + "\n" + 
						 "attrs: {path: { d: 'M 100 100 L 300 100 L 200 50 z'," + this.getBorder().generateScript() + ", fill: '" + this.getColor().getHex() + "',magnet: true, type: '" + this.getMetaelementName() +"'}" + ", text: { text: '" + this.getLabel() + "', fill: 'black', 'font-size': 14, 'font-weight': 'normal'}}" + "\n" + 
						 "});";
			return ans;
		}
		else
		{
			Rectangle R = new Rectangle(this.getHeight(), this.getWidth(), this.getX(), this.getY(), this.getLabel(), this.getColor(), this.getBorder(), this.getMetaelementName());
			return R.generateScript();
		}
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * @return the vertices
	 */
	public int getVertices() {
		return vertices;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(int vertices) {
		this.vertices = vertices;
	}

	

	public static void main(String args[])
	{
		Color bCol = new Color(10,25,15, "Ola ke ase");
		Color fColo = new Color(45,43,244, "Ola ke ase");
		Border B = new Border(bCol, 1, "dash");
		Complex C = new Complex(100, 100, 0, 0, "Ola ke ase", fColo, B, 7, "EClass");
		System.out.println(C.generateScript());
	}
	
}
