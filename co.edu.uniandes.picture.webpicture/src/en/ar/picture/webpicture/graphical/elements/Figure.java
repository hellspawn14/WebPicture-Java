package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Representa la especificación de una Figura con icono (imagen interna) para el
 * modelo
 * @author hellspawn
 */
public abstract class Figure extends Shape {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Ruta a la imagen del icono
	 */
	private String iconPath;

	/**
	 * Ancho del icono
	 */
	private int iconWidth;

	/**
	 * Alto del icono
	 */
	private int iconHeight;

	/**
	 * Posición del icono en X con respecto al contenedor
	 */
	private double iconRefX;

	/**
	 * Posición del icono en Y con respecto al contenedor
	 */
	private double iconRefY;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una figura con imagen para representar el elemento
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param color - Color del elemento
	 * @param border - Borde del elemento
	 * @param iconPath - Ruta al icono
	 * @param iconWidth- Ancho del icono
	 * @param iconHeight - Alto del icono
	 * @param iconRefX - Posición en X con respecto al contenedor
	 * @param iconRefY - Posición en Y con respecto al contenedor
	 */
	public Figure(int height, int width, String type, String label, String labelPlacement, boolean phantom, Color color, Border border, String iconPath, int iconWidth, int iconHeight, double iconRefX, double iconRefY) {
		super(height, width, type, label, labelPlacement, phantom, color, border);
		this.iconPath = iconPath;
		this.iconWidth = iconWidth;
		this.iconHeight = iconHeight;
		this.iconRefX = iconRefX/this.getWidth();
		this.iconRefY = iconRefY/this.getHeight();
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the iconPath
	 */
	public String getIconPath() {
		return iconPath;
	}

	/**
	 * @param iconPath the iconPath to set
	 */
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	/**
	 * @return the iconWidth
	 */
	public int getIconWidth() {
		return iconWidth;
	}

	/**
	 * @param iconWidth the iconWidth to set
	 */
	public void setIconWidth(int iconWidth) {
		this.iconWidth = iconWidth;
	}

	/**
	 * @return the iconHeight
	 */
	public int getIconHeight() {
		return iconHeight;
	}

	/**
	 * @param iconHeight the iconHeight to set
	 */
	public void setIconHeight(int iconHeight) {
		this.iconHeight = iconHeight;
	}

	/**
	 * @return the iconRefX
	 */
	public double getIconRefX() {
		return iconRefX;
	}

	/**
	 * @param iconRefX the iconRefX to set
	 */
	public void setIconRefX(double iconRefX) {
		this.iconRefX = iconRefX;
	}

	/**
	 * @return the iconRefY
	 */
	public double getIconRefY() {
		return iconRefY;
	}

	/**
	 * @param iconRefY the iconRefY to set
	 */
	public void setIconRefY(double iconRefY) {
		this.iconRefY = iconRefY;
	}
}
