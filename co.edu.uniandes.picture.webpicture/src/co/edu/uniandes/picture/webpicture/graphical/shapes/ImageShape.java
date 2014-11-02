package co.edu.uniandes.picture.webpicture.graphical.shapes;

import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Border;
import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Color;

/**
 * Representa una imagen rectangular
 * @author hellspawn
 * No tiene soporte de magnet
 */
public class ImageShape extends Basic
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Ruta a la imagen 
	 */
	private String imagePath;
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------
	
	/**
	 * Crea una nueva forma basica con los parametros dados 
	 * @param height - Alto 
	 * @param width - Ancho 
	 * @param x - Posicion inicial en X
	 * @param y - Posicion inicial en Y
	 * @param label - Label para mostrar 
	 * @param color - Color de la forma (fondo)
	 * @param border - Borde de la forma
	 * @param imagePath - Ruta a la imagen 
	 */
	public ImageShape(int height, int width, int x, int y, String label, Color color, Border border, String imagePath, String metaelementName) 
	{
		super(height, width, x, y, label, color, border, metaelementName);
		this.imagePath = imagePath;
	}
	//------------------------------------------------------------------
	//Metodos 
	//------------------------------------------------------------------

	@Override
	public String generateScript() 
	{
		String varId = "ImagShape" + this.toString().split("@")[this.toString().split("@").length - 1];
		this.setShapeId(varId);
		String script = "var " + "X" + varId + " = function(x, y, rank, name, image, background, border) {" + "\n" + 
						"var cell = new joint.shapes.org.Member({" + "\n" +
						"position: { x: x, y: y }," + "\n" + 
						"attrs: {" + "\n" + 
						"'.card': { fill: background, stroke: border}," + "\n" + 
						"image: { 'xlink:href': image }," + 
						"'.rank': { text: rank }, '.name': { text: name }," + "\n" +
						"magnet: true, type: '" + this.getMetaelementName() + "'" + "\n" + 
		        		"}" + "\n" + 
		    			"});" + "\n" + 
		    			"return cell;" + "\n" + 
						"};" + "\n" + 
						"var " + varId + "= X" + varId + "(" + this.getX() + "," + this.getY() +",'"+  this.getLabel() + "', '', '" + this.getImagePath() + "', '" + this.getColor().getHex() + "', '" + this.getBorder().getBorderColor().getHex() + "');";	
		return script;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters  
	//------------------------------------------------------------------
	
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

	public static void main (String args[])
	{
		Color fill = new Color(232,134,13,"relleno");
		Color bcol = new Color (102,24,244, "relleno");
		Border B = new Border (bcol, 1, "dashdot");
		String path = "http://img-9gag-lol.9cache.com/photo/aXEPjW9_700b.jpg";
		//public ImageShape(int height, int width, int x, int y, String label, Color color, Border border, String imagePath)
		ImageShape im = new ImageShape(100, 100, 0, 0, "Test", fill, B, path, "EClass");
		System.out.println(im.generateScript());
	}


}
