package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Representa la especificacion para construir una forma
 * Las formas basicas no tienen una imagen 
 * @author hellspawn
 */
public abstract class Basic extends Shape{
	// ------------------------------------------------------------------
	// Constructores  
	// ------------------------------------------------------------------

	/**
	 * Crea un elemento basico para representar el elemento 
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param color - Color de fondo del elemento 
	 * @param border - Borde del elemento
	 */
	public Basic(int height, int width, String type, String label, String labelPlacement, boolean phantom, Color color, Border border) {
		super(height, width, type, label, labelPlacement, phantom, color, border);
	}
}
