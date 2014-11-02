package co.edu.uniandes.picture.webpicture.graphical.shapes;

import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Border;
import co.edu.uniandes.picture.webpicture.graphical.shapes.style.Color;

/**
 * Representa una figura geometrica basica 
 * @author hellspawn
 */
public abstract class Basic extends Shape
{	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
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
	 * @param metaelementName - Nombre del elemento que representa
	 */
	public Basic(int height, int width, int x, int y, String label, Color color, Border border, String metaelementName) 
	{
		super(height, width, x, y, label, color, border, metaelementName);
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	/**
	 * Retorna el script generado para pintar la forma 
	 * @return - Script generado para pintar la forma
	 */
	public abstract String generateScript();
	
	
}
