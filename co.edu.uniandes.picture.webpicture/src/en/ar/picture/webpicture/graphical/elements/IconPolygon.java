package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Representa la especificación de un poligono SVG con imagen
 * @author hellspawn
 */
public class IconPolygon extends Figure {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * SVG path del elemento
	 */
	private String svgPath;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una elipse con imagen para representar el elemento
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param color - Color del elemento
	 * @param border - Borde del elemento
	 * @param iconPath - Ruta al icono
	 * @param iconWidth - Ancho del icono
	 * @param iconHeight - Alto del icono
	 * @param iconRefX - Posición en X con respecto al contenedor
	 * @param iconRefY - Posición en Y con respecto al contenedor
	 * @param svgPath - SVG path del elemento
	 */
	public IconPolygon(int height, int width, String type, String label,
			String labelPlacement, boolean phantom, Color color, Border border,
			String iconPath, int iconWidth, int iconHeight, double iconRefX,
			double iconRefY, String svgPath) {
		super(height, width, type, label, labelPlacement, phantom, color,
				border, iconPath, iconWidth, iconHeight, iconRefX, iconRefY);
		this.setSvgPath(svgPath);
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	@Override
	public String generateScript() {
		String ans = "var "
				+ this.getId()
				+ " = new joint.shapes.poly.Polygon({ position: { x: 100, y: 100 }, size: { width: "
				+ this.getWidth() + ", height: " + this.getHeight()
				+ "}, attrs: { '.contenedor': { fill: '"
				+ this.getColor().getHex() + "', magnet: true, type: '"
				+ this.getType() + "', d: '" + this.getSvgPath() + "', "
				+ this.getBorder().getGenScript()
				+ "}, image: { 'xlink:href': '" + this.getIconPath()
				+ "', 'ref-x': " + this.getIconRefX() + ", 'ref-y': "
				+ this.getIconRefY() + ", 'width': " + this.getIconWidth()
				+ ", 'height': " + this.getIconHeight()
				+ ", }, '.name': { text: '" + this.getLabel() + "', 'ref-y': "
				+ this.getRefY() + "},}});";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the svgPath
	 */
	public String getSvgPath() {
		return svgPath;
	}

	/**
	 * @param svgPath the svgPath to set
	 */
	public void setSvgPath(String svgPath) {
		this.svgPath = svgPath;
	}
}
