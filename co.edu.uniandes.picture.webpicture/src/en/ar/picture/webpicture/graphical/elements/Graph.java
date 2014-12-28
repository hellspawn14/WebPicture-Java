package en.ar.picture.webpicture.graphical.elements;

/**
 * Es la representación grafica en el modelo de un elemento
 * @author hellspawn
 */
public abstract class Graph {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	/**
	 * Encabezado del identificador de la variable en JS
	 */
	public final static String DEFAULT_ID = "GRPH_";

	/**
	 * Indicador de posición interna del texto del elemento
	 */
	public final static String INTERNAL = "internal";

	/**
	 * Indicador de posición externa del texto del elemento
	 */
	public final static String EXTERNAL = "external";

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Identificador del elemento
	 */
	private String id;

	/**
	 * Alto del elemento
	 */
	private int height;

	/**
	 * Ancho del elemento
	 */
	private int width;

	/**
	 * Clase que representa el elemento
	 */
	private String type;

	/**
	 * Label del elemento
	 */
	private String label;

	/**
	 * Posición del label
	 */
	private String labelPlacement;

	/**
	 * Indicador de transparencia
	 */
	private boolean phantom;

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
	 * @param boolean - Indicador de transparencia
	 */
	public Graph(int height, int width, String type, String label, String labelPlacement, boolean phantom) {
		this.height = height;
		this.width = width;
		this.type = type;
		this.label = label;
		this.phantom = phantom;
		this.labelPlacement = labelPlacement;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Retorna el codigo JavaScript para elemento
	 * @return Codigo JavaScript para crear el elemento
	 */
	public abstract String generateScript();

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
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
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
	 * @return the labelPlacement
	 */
	public String getLabelPlacement() {
		return labelPlacement;
	}

	/**
	 * @param labelPlacement the labelPlacement to set
	 */
	public void setLabelPlacement(String labelPlacement) {
		this.labelPlacement = labelPlacement;
	}

	/**
	 * @return the phantom
	 */
	public boolean isPhantom() {
		return phantom;
	}

	/**
	 * @param phantom the phantom to set
	 */
	public void setPhantom(boolean phantom) {
		this.phantom = phantom;
	}
}
