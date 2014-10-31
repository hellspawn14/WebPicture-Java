package co.edu.uniandes.picture.webpicture.graphical.shapes;

/**
 * Representa una imagen cargada desde el picture como un elemento del modelo 
 * @author hellspawn
 */
public class Image extends Graph
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Directorio de la imagen 
	 */
	private String path;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea una nueva imagen 
	 * @param path - Ruta de la imagen 
	 * @param height - Alto 
	 * @param width - Ancho 
	 * @param x - Posición inicial en X
	 * @param y - Posición inicial en Y
	 * @param imageLabel - Etiqueta de la imagen 
	 * @param path - Ruta de la imagen 
	 */
	public Image(int height, int width, int x, int y, String label, String path) 
	{
		super(height, width, x, y, label);
		this.setPath(path);
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	

	/**
	 * Retorna el script generado para pintar la forma 
	 * @return - Script generado para pintar la forma
	 */
	public String generateScript()
	{
		String varId = "Image" + this.toString().split("@")[this.toString().split("@").length - 1];
		this.setShapeId(varId);
		String script = "var " + varId + " = new joint.shapes.basic.Image({" + "\n" + 
						"	position: { x: " + this.getX() + ", y: " + this.getY() + " }," + "\n" + 
						"	size: { width: " + this.getWidth() + ", height: " + this.getHeight() + " }," + "\n" + 
						"	attrs: { " + "text: { text: '" + this.getLabel() + "' }," + " image: { 'xlink:href': '" + this.getPath() + "', width: " + this.getWidth() + ", height: " + this.getHeight() + "}" + " }" + "\n" + 
						"});";
		return script;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	

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
	
	
	public static void main (String args[])
	{
		Image img = new Image(50, 50, 70, 10, "cosplay", "http://img-9gag-lol.9cache.com/photo/a1ZPj9R_700b.jpg");
		System.out.println(img.generateScript());
	}



}
