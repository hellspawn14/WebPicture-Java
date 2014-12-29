package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;


/**
 * Representa la especificación de un poligono regular para el modelo
 * @author hellspawn
 */
public class Polygon extends Basic {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * SVG path para crear el elemento
	 */
	private String SVGPath;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un poligono regular para representar el elemento
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param color - Color del elemento
	 * @param border - Borde del elemento
	 */
	public Polygon(int height, int width, String type, String label, String labelPlacement, boolean phantom, Color color, Border border, String SVGPath) {
		super(height, width, type, label, labelPlacement, phantom, color, border);
		this.setSVGPath(SVGPath);
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	@Override
	public String generateScript() {
		String ans = "var "
				+ this.getId()
				+ " = new joint.shapes.basic.Path({ position: { x: 100, y: 100 }, size: { width: "
				+ this.getWidth() + ",  height: " + this.getHeight()
				+ "}, attrs: { path: { d: '" + this.getSVGPath()
				+ "', magnet: true, type: '" + this.getType() + "', fill: '"
				+ this.getColor().getHex() + "', opacity: " + this.getOpacity()
				+ ", " + this.getBorder().getGenScript()
				+ " }, text: { text: '" + this.getLabel() + "', 'ref-y': "
				+ this.getRefY() + ", }}});";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the sVGPath
	 */
	public String getSVGPath() {
		return SVGPath;
	}

	/**
	 * @param sVGPath the sVGPath to set
	 */
	public void setSVGPath(String sVGPath) {
		SVGPath = sVGPath;
	}
}
