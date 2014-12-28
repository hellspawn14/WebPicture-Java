package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

public abstract class Shape extends Graph{
	// ------------------------------------------------------------------
	// Atributos 
	// ------------------------------------------------------------------

	/**
	 * Color del elemento
	 */
	private Color color;
	
	/**
	 * Borde del elemento 
	 */
	private Border border;
	
	// ------------------------------------------------------------------
	// Constructores 
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva forma para representar el elemento 
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 */
	public Shape(int height, int width, String type, String label, String labelPlacement, boolean phantom, Color color, Border border){
		super(height, width, type, label, labelPlacement, phantom);
		this.setColor(color);
		this.setBorder(border);
	}

	// ------------------------------------------------------------------
	// Getters & Setters 
	// ------------------------------------------------------------------
	
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
