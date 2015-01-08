package en.ar.picture.webpicture.graphical.icons;

/**
 * Representa el creation element para un elemento
 * @author hellspawn
 */
public class Icon {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	/**
	 * Encabezado del identificador de la variable en JS
	 */
	public final static String DEFAULT_ID = "ICON_";

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Identificador del elemento
	 */
	private String id;

	/**
	 * Clase que representa el elemento
	 */
	private String type;

	/**
	 * Etiqueta del elemento
	 */
	private String label;

	/**
	 * Ruta a la imagen del icono
	 */
	private String path;
	
	/**
	 * Posición inicial en Y
	 */
	private int Y;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo icono de creación
	 * @param type - Clase representada
	 * @param label - Etiqueta del elemento
	 * @param path - Ruta a la imagen
	 */
	public Icon(String type, String label, String path) {
		this.type = type;
		this.label = label;
		this.path = path;
		this.id = DEFAULT_ID + this.toString().split("@")[this.toString().split("@").length - 1];
		this.setY(0);
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Retorna el codigo JavaScript para crear el icono en el paper
	 * @param posY - Posicion en Y del elemento
	 * @return Codigo JavaScript para crear el icono en el paper
	 */
	public String generateScript(int posY) {
		setY(posY);
		String ans = "var "
				+ this.getId()
				+ " = new joint.shapes.basic.Image({ position: { x: 10, y: "
				+ posY
				+ " }, size: { width: 50,height: 50 }, attrs: { text: { text: '"
				+ this.getLabel() + "', 'ref-y': 0.5, 'ref-x': 150 }, image: { type: '" + this.getType() + "'" + ", 'xlink:href': '" 
				+ this.getPath() + 
				"', width: 100, height: 100,}, },});";
		return ans;
	}
	

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

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

	/**
	 * @return the y
	 */
	public int getY() {
		return Y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		Y = y;
	}
}
