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
		else if (vertices == 4)
		{
			Rectangle R = new Rectangle(this.getHeight(), this.getWidth(), this.getX(), this.getY(), this.getLabel(), this.getColor(), this.getBorder(), this.getMetaelementName());
			return R.generateScript();
		}
		else 
		{

			String varId = "Comp" + this.toString().split("@")[this.toString().split("@").length - 1];
			this.setShapeId(varId);
			String ans = "var "  + varId + " = new joint.shapes.basic.Path({" + "\n" + 
					 "position: { x: " + this.getX() + ", y: " + this.getY() + " }, size: { width: " + this.getWidth() + ", height: " + this.getHeight() + " }," + "\n" + 
					 "attrs: {path: { d: 'M28.631,12.359c-0.268-0.826-1.036-1.382-1.903-1.382h-0.015l-7.15,0.056l-2.155-6.816c-0.262-0.831-1.035-1.397-1.906-1.397s-1.645,0.566-1.906,1.397l-2.157,6.816l-7.15-0.056H4.273c-0.868,0-1.636,0.556-1.904,1.382c-0.27,0.831,0.029,1.737,0.74,2.246l5.815,4.158l-2.26,6.783c-0.276,0.828,0.017,1.739,0.723,2.25c0.351,0.256,0.763,0.384,1.175,0.384c0.418,0,0.834-0.132,1.189-0.392l5.751-4.247l5.751,4.247c0.354,0.26,0.771,0.392,1.189,0.392c0.412,0,0.826-0.128,1.177-0.384c0.704-0.513,0.997-1.424,0.721-2.25l-2.263-6.783l5.815-4.158C28.603,14.097,28.901,13.19,28.631,12.359zM19.712,17.996l2.729,8.184l-6.94-5.125L8.56,26.18l2.729-8.184l-7.019-5.018l8.627,0.066L15.5,4.82l2.603,8.225l8.627-0.066L19.712,17.996z'" + ", fill: '" + this.getColor().getHex() + "'," +  this.getBorder().generateScript() + "}, text: { text: '" + this.getLabel() + "', fill: 'black', 'font-size': 14, 'font-weight': 'normal'}}" + "\n" + 
					 "});";
			return ans;
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
		//public Complex(int height, int width, int x, int y, String label, Color color, Border border, int vertices)
		Color bCol = new Color(10,25,15, "Ola ke ase");
		Color fColo = new Color(45,43,244, "Ola ke ase");
		Border B = new Border(bCol, 1, "dash");
		Complex C = new Complex(100, 100, 0, 0, "Ola ke ase", fColo, B, 5, "EClass");
		System.out.println(C.generateScript());
	}
	
}
