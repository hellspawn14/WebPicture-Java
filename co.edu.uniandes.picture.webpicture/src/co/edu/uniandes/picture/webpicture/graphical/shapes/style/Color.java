package co.edu.uniandes.picture.webpicture.graphical.shapes.style;

public class Color 
{
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Valor para color rojo 
	 * [0 - 255]
	 */
	private int red;
	
	/**
	 * Valor para color verde 
	 * [0 - 255]
	 */
	private int green;
	
	/**
	 * Valor para color azul 
	 * [0 - 255]
	 */
	private int blue;
	
	/**
	 * Nombre del color 
	 */
	private String cName;
	
	private String hex;

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Genera un nuevo color 
	 * @param red - Color rojo 
	 * @param green - Color verde 
	 * @param blue - Color azul
	 * @param cName - Nombre del color 
	 */
	public Color(int red, int green, int blue, String cName) 
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.cName = cName;
		generateHex();
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera el hex code para el color
	 */
	public void generateHex()
	{
		String hex = String.format("#%02x%02x%02x", red, green, blue).toUpperCase();
		this.setHex(hex);
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------
	

	/**
	 * @return the red
	 */
	public int getRed() {
		return red;
	}

	/**
	 * @param red the red to set
	 */
	public void setRed(int red) {
		this.red = red;
	}

	/**
	 * @return the green
	 */
	public int getGreen() {
		return green;
	}

	/**
	 * @param green the green to set
	 */
	public void setGreen(int green) {
		this.green = green;
	}

	/**
	 * @return the blue
	 */
	public int getBlue() {
		return blue;
	}

	/**
	 * @param blue the blue to set
	 */
	public void setBlue(int blue) {
		this.blue = blue;
	}

	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}

	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}

	/**
	 * @return the hex
	 */
	public String getHex() {
		return hex;
	}

	/**
	 * @param hex the hex to set
	 */
	public void setHex(String hex) {
		this.hex = hex;
	}
	
	public static void main (String args[])
	{
		Color C = new Color(255,255,255,"Col");
		System.out.println(C.getHex());
	}
}
