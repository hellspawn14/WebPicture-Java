package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Representa la especificación de un Rectangulo para el modelo
 * @author hellspawn
 */
public class Rectangle extends Basic {
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
	 * Crea un rectangulo para representar el elemento
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param color - Color del elemento 
	 * @param border - Borde del elemento 
	 * @param rx - Radio X
	 * @param ry - Radio Y
	 */
	public Rectangle(int height, int width, String type, String label,String labelPlacement, boolean phantom, Color color, Border border,int rx, int ry) {
		super(height, width, type, label, labelPlacement, phantom, color,border);
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
				+ " = new joint.shapes.basic.Rect({ position: { x: 100, y: 100 }, size: { width: "
				+ this.getWidth() + ", height: " + this.getHeight()
				+ "}, attrs: { text: { text: '" + this.getLabel()
				+ "', 'ref-y': " + this.getRefY() + "}, rect: { fill: '"
				+ this.getColor().getHex() + "', opacity: " + this.getOpacity()
				+ ", magnet: true, type: '" + this.getType() + "', rx: "
				+ this.getRx() + ", ry: " + this.getRy() + ", "
				+ this.getBorder().getGenScript() + "},}});";
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
