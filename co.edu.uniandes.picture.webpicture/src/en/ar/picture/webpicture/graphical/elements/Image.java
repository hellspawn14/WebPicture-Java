package en.ar.picture.webpicture.graphical.elements;

/**
 * Representa una imagen cargada desde el picture como un elemento del modelo
 * @author hellspawn
 */
public class Image extends Graph {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Ruta a la imagen
	 */
	private String path;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva imagen para representar un elemento
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param path - Ruta a la imagen
	 */
	public Image(int height, int width, String type, String label,String labelPlacement, boolean phantom, String path) {
		super(height, width, type, label, labelPlacement, phantom);
		this.path = path;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	@Override
	public String generateScript() {
		String ans = "var "
				+ this.getId()
				+ " = new joint.shapes.basic.Image({ position: { x: 100, y: 100 }, size: { width: "
				+ this.getWidth() + ", " + "height: " + this.getHeight()
				+ "}, attrs: { text: { text: '" + this.getLabel()
				+ "', 'ref-y': " + this.getRefY()
				+ ", 'ref-x': 0.5, }, image: { magnet: true, type: '"
				+ this.getType() + "', opacity: " + this.getOpacity()
				+ ",'xlink:href': '" + this.getPath()
				+ "', width: 50, height: 50, }, },});";
		return ans;
	}
	
	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
}
