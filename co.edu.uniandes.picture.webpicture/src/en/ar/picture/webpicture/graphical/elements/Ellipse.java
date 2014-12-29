package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Representa la especificación de una Elipse para el modelo
 * @author hellspawn
 */
public class Ellipse extends Basic {
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una elipse para representar el elemento
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement- Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param color - Color del elemento 
	 * @param border - Borde del elemento 
	 */
	public Ellipse(int height, int width, String type, String label, String labelPlacement, boolean phantom, Color color, Border border) {
		super(height, width, type, label, labelPlacement, phantom, color, border);
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	@Override
	public String generateScript() {
		String ans = "var "
				+ this.getId()
				+ " = new joint.shapes.basic.Circle({ position: { x: 100, y: 100 }, size: { width: "
				+ this.getWidth() + ", height: " + this.getHeight()
				+ "}, attrs: { circle: { fill: '" + this.getColor().getHex()
				+ "', opacity: " + this.getOpacity() + ",magnet: true, type: '"
				+ this.getType() + "'," + this.getBorder().getGenScript() + "}, text: { text: '" + this.getLabel()
				+ "', fill: 'black', 'ref-y': " + this.getRefY() + "},},});";
		return ans;
	}
}
