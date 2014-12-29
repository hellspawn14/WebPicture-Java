package en.ar.picture.webpicture.graphical.util;

/**
 * Representa un punto XY de un SVG path 
 * @author hellspawn
 */
public class SVGCoordinate {
	// ------------------------------------------------------------------
	// Atributos 
	// ------------------------------------------------------------------

	/**
	 * Punto en el eje X
	 */
	private double X; 
	
	/**
	 * Punto en el eje Y
	 */
	private double Y;

	// ------------------------------------------------------------------
	// Constructores 
	// ------------------------------------------------------------------
	
	/**
	 * Crea un nuevo punto SVG 
	 * @param x - Coordenada en X
	 * @param y - Coordenada en Y 
	 */
	public SVGCoordinate(double x, double y) {
		X = x;
		Y = y;
	}
	
	/**
	 * Retorna la representación a String de las coordenadas
	 */
	public String toString(){
		return this.getX() + " " + this.getY() + " ";
	}
	
	// ------------------------------------------------------------------
	// Getters & Setters 
	// ------------------------------------------------------------------

	/**
	 * @return the x
	 */
	public double getX() {
		return X;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		X = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return Y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		Y = y;
	} 

}
