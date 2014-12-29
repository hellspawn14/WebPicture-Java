package co.edu.uniandes.picture.webpicture.graphical.shapes;

import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Border;
import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Color;

/**
 * Representa la especificacion para construir una forma  
 * @author hellspawn
 */
public abstract class Shape extends Graph 
{

	// ------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Color de la forma 
	 */
	private Color color; 
	
	/**
	 * Borde de la forma 
	 */
	private Border border;

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
	public Shape(int height, int width, int x, int y, String label, Color color, Border border, String metaelementName) 
	{
		super(height, width, x, y, label, metaelementName);
		this.color = color;
		this.border = border;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Retorna el script generado para pintar la forma 
	 * @return - Script generado para pintar la forma
	 */
	public abstract String generateScript();
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the border
	 */
	public Border getBorder() {
		return border;
	}

	/**
	 * @param border the border to set
	 */
	public void setBorder(Border border) {
		this.border = border;
	}
}
