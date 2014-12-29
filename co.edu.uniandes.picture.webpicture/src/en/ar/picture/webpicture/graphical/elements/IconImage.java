package en.ar.picture.webpicture.graphical.elements;

/**
 * Representa la especificacion para construir una imagen con un icono
 * @author hellspawn
 */
public class IconImage extends Graph {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Ancho del icono
	 */
	private int icnWidth;

	/**
	 * Altura del icono
	 */
	private int icnHeight;

	/**
	 * Ruta a la imagen principal
	 */
	private String imagePath;

	/**
	 * Ruta a la imagen secundaria
	 */
	private String iconPath;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo elemento grafico del editor
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/texto del elemento
	 * @param labelPlacement - Posición del texto en el elemento
	 * @param phantom - Indicador de transparencia
	 * @param icnWidth - Ancho del icono
	 * @param icnHeight - Alto del icono
	 * @param imagePath - Ruta a la imagen principal
	 * @param iconPath - Ruta al icono
	 */
	public IconImage(int height, int width, String type, String label, String labelPlacement, boolean phantom, int icnWidth, int icnHeight, String imagePath, String iconPath) {
		super(height, width, type, label, labelPlacement, phantom);
		this.icnWidth = icnWidth;
		this.icnHeight = icnHeight;
		this.imagePath = imagePath;
		this.iconPath = iconPath;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	@Override
	public String generateScript() {
		String ans = "var "
				+ this.getId()
				+ " = new joint.shapes.iconic.icnShape({ position: { x: 100, y: 100 }, size: { width: "
				+ this.getWidth() + ", height: " + this.getHeight()
				+ "}, attrs: { '.contenedor': { magnet: true, type: '"
				+ this.getType() + "', 'xlink:href': '" + this.getImagePath()
				+ "', opacity: " + this.getOpacity()
				+ " }, image: { 'xlink:href': '" + this.getIconPath()
				+ "', 'width': " + this.getIcnWidth() + ", 'height': "
				+ this.getIcnHeight() + ", opacity: " + this.getOpacity()
				+ "}, '.name': { text: '" + this.getLabel() + "', 'ref-y': "
				+ this.getRefY() + "},}});";
		return ans;
	}


	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the icnWidth
	 */
	public int getIcnWidth() {
		return icnWidth;
	}

	/**
	 * @param icnWidth
	 *            the icnWidth to set
	 */
	public void setIcnWidth(int icnWidth) {
		this.icnWidth = icnWidth;
	}

	/**
	 * @return the icnHeight
	 */
	public int getIcnHeight() {
		return icnHeight;
	}

	/**
	 * @param icnHeight the icnHeight to set
	 */
	public void setIcnHeight(int icnHeight) {
		this.icnHeight = icnHeight;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

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
}
