package en.ar.picture.webpicture.graphical.shapes;


/**
 * Definicion de un elemento grafico del editor 
 * @author hellspawn
 */
public abstract class GraphicalElement {
	//------------------------------------------------------------------
	// Atributos
	//------------------------------------------------------------------

	/**
	 * Tipo de elemento (Clase representada)
	 */
	private String type;
	
	/**
	 * Texto del elemento 
	 */
	private String label;
	
	/**
	 * Alto del elemento 
	 */
	private int height; 
	
	/**
	 * Ancho del elemento 
	 */
	private int width; 
	
	/**
	 * Posición inicial del elemento en X
	 */
	private int xPosition; 
	
	/**
	 * Posición inicial del elemento en Y
	 */
	private int yPosition;
	
	
	//------------------------------------------------------------------
	// Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo elemento grafico a partir de la especificación del picture
	 * @param type - Tipo del elemento 
	 * @param label - Etiqueta 
	 * @param height - Alto  
	 * @param width - Ancho 
	 * @param xPosition - Posición en X
	 * @param yPosition - Posición en Y
	 */
	public GraphicalElement(String type, String label, int height, int width,int xPosition, int yPosition) {
		this.type = type;
		this.label = label;
		this.height = height;
		this.width = width;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	} 
	
	//------------------------------------------------------------------
	// Metodos
	//------------------------------------------------------------------

	/**
	 * Genera el codigo JavaScript para construir el elemento 
	 * @return - Codigo JavaScript para construir el elemento 
	 */
	public abstract String generateScript();
	
	//------------------------------------------------------------------
	// Getters & Setters 
	//------------------------------------------------------------------
	
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
	 * @return the xPosition
	 */
	public int getxPosition() {
		return xPosition;
	}

	/**
	 * @param xPosition the xPosition to set
	 */
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	/**
	 * @return the yPosition
	 */
	public int getyPosition() {
		return yPosition;
	}

	/**
	 * @param yPosition the yPosition to set
	 */
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

}
