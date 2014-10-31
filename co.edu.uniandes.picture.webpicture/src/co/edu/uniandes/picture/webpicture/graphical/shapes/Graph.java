package co.edu.uniandes.picture.webpicture.graphical.shapes;

/**
 * Representa una forma generica
 * @author hellspawn
 */
public abstract class Graph 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Alto 
	 */
	private int height;
	
	/**
	 * Ancho
	 */
	private int width;
	
	/**
	 * Posición inicial en X
	 */
	private int X;
	
	/**
	 * Posicion inicial en Y
	 */
	private int Y;
	
	/**
	 * Label de la forma 
	 */
	private String label;
	
	/**
	 * Identificador de la forma 
	 */
	private String shapeId;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea una nueva grafica basica 
	 * @param height - Alto 
	 * @param width - Ancho 
	 * @param x - Posición inicial en X
	 * @param y - Posición inicial en Y
	 * @param label - Label de la grafica 
	 */
	public Graph(int height, int width, int x, int y, String label) 
	{
		this.height = height;
		this.width = width;
		X = x;
		Y = y;
		this.label = label;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Retorna el script generado para pintar la forma 
	 * @return - Script generado para pintar la forma
	 */
	public abstract String generateScript();
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------
	
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
	 * @return the x
	 */
	public int getX() {
		return X;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		X = x;
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
	 * @return the shapeId
	 */
	public String getShapeId() {
		return shapeId;
	}

	/**
	 * @param shapeId the shapeId to set
	 */
	public void setShapeId(String shapeId) {
		this.shapeId = shapeId;
	}
	
	
}
