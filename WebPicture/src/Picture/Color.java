package Picture;

/**
 * Representa el color de un elemento 
 * @author hellspawn
 */
public class Color 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Value for red [0 - 255]
	 */
	private int red;
	
	/**
	 * Value for green [0 - 255]
	 */
	private int green;
	
	/**
	 * Value for blue [0 - 255]
	 */
	private int blue;
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * @param red
	 * @param green
	 * @param blue
	 */
	public Color(int red, int green, int blue) 
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	/**
	 * Transforma los colores en RGB en formato HEX 
	 * @return RGB -> HEX
	 */
	public String rgbToHex()
	{
		String hex = String.format("#%02x%02x%02x", red, green, blue).toUpperCase();
		return hex;
	}

	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * @return the red
	 */
	public int getRed() 
	{
		return red;
	}

	/**
	 * @param red the red to set
	 */
	public void setRed(int red) 
	{
		this.red = red;
	}

	/**
	 * @return the green
	 */
	public int getGreen() 
	{
		return green;
	}

	/**
	 * @param green the green to set
	 */
	public void setGreen(int green) 
	{
		this.green = green;
	}

	/**
	 * @return the blue
	 */
	public int getBlue() 
	{
		return blue;
	}

	/**
	 * @param blue the blue to set
	 */
	public void setBlue(int blue) 
	{
		this.blue = blue;
	}
}
