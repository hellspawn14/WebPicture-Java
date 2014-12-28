package en.ar.picture.webpicture.graphical.elements;

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
	 * Crea una nueva forma basica para representar el elemento 
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 */
	public Basic(int height, int width, String type, String label, String labelPlacement, boolean phantom) {
		super(height, width, type, label, labelPlacement, phantom);
	}
}
