package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Representa la especificación de un rectangulo con imagen
 * @author hellspawn
 */
public class IconRectangle extends Figure {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Radio X
	 */
	private int rx;

	/**
	 * Radio Y
	 */
	private int ry;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un rectangulo con imagen para representar el elemento
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
	 * @param rx - Radio X
	 * @param ry - Radio Y
	 */
	public IconRectangle(int height, int width, String type, String label,String labelPlacement, boolean phantom, Color color, Border border, String iconPath, int iconWidth, int iconHeight, int iconRefX, int iconRefY, int rx, int ry) {
		super(height, width, type, label, labelPlacement, phantom, color, border, iconPath, iconWidth, iconHeight, iconRefX, iconRefY);
		this.rx = rx;
		this.ry = ry;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	@Override
	public String generateScript() {
		String ans = "var "
				+ this.getId()
				+ " = new joint.shapes.org.Member({ position: { x: 100, y: 100 },size: { width: "
				+ this.getWidth() + ", height: " + this.getHeight()
				+ "}, attrs: { '.card': { fill: '" + this.getColor().getHex()
				+ "', magnet: true, type: '" + this.getType() + "', rx: "
				+ this.getRx() + ", ry: " + this.getRy() + ","
				+ this.getBorder().getGenScript()
				+ "}, image: {'xlink:href': '" + this.getIconPath()
				+ "', 'width': " + this.getIconWidth() + ", 'height': "
				+ this.getIconHeight() + ", 'ref-x': " + this.getIconRefX()
				+ ", 'ref-y': " + this.getIconRefY() + "},'.name': { text: '"
				+ this.getLabel() + "', 'ref-y': " + this.getRefY() + "},}});";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the rx
	 */
	public int getRx() {
		return rx;
	}

	/**
	 * @param rx the rx to set
	 */
	public void setRx(int rx) {
		this.rx = rx;
	}

	/**
	 * @return the ry
	 */
	public int getRy() {
		return ry;
	}

	/**
	 * @param ry the ry to set
	 */
	public void setRy(int ry) {
		this.ry = ry;
	}
}
