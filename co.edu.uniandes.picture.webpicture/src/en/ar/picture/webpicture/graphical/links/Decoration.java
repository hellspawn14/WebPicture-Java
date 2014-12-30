package en.ar.picture.webpicture.graphical.links;

import en.ar.picture.webpicture.graphical.style.Border;

/**
 * Representa la especificación de la terminación de un link 
 * @author hellspawn
 */
public class Decoration {
	// ------------------------------------------------------------------
	// Constantes  
	// ------------------------------------------------------------------

	/**
	 * No decoración
	 */
	public final static String NONE = "none";
	
	/**
	 * Flecha abierta
	 */
	public final static String ARROW = "arrow";
	
	/**
	 * SVG Path para crear una flecha abierta
	 */
	public final static String ARROW_SVG = "M10 0 L0 5 L10 10 L0 4.5 Z";
	
	/**
	 * Rombo sin relleno de color 
	 */
	public final static String RHOMB = "rhomb";
	
	/**
	 * Rombo con relleno de color 
	 */
	public final static String FILLED_RHOMB = "filledrhomb";
	
	/**
	 * SVG Path para crear un rombo 
	 */
	public final static String RHOMB_SVG = "M10.0 5.0 L5.0 0.0 L0.0 4.999999999999999 L4.999999999999999 10.0 Z";
	
	/**
	 * Cuadrado sin relleno de color
	 */
	public final static String SQUARE = "square";
	
	/**
	 * Cuadrado con relleno de color
	 */
	public final static String FILLED_SQUARE = "filledsquare";
	
	/**
	 * SVG Path para crear un cuadrado
	 */
	public final static String SQUARE_SVG = "M8.535533905932738 1.4644660940672627 L1.4644660940672627 1.4644660940672622 L1.4644660940672614 8.535533905932738 L8.535533905932738 8.535533905932738 Z";
	/**
	 * Flecha cerrada 
	 */
	public final static String CLOSED_ARROW = "closedarrow";
	
	/**
	 * Flecha cerrada con relleno de color 
	 */
	public final static String FILLED_CLOSED_ARROW = "filledclosedarrow";
	
	/**
	 * SVG Path para crear una flecha cerrada 
	 */
	public final static String CLOSED_ARROW_SVG = "M0.0 4.999999999999999 L7.5 9.330127018922193 L7.499999999999998 0.6698729810778055 Z";
	
	
	// ------------------------------------------------------------------
	// Atributos  
	// ------------------------------------------------------------------
	
	/**
	 * Borde del elemento
	 */
	private Border border;
	
	/**
	 * Tipo de decoración 
	 */
	private String decorationType;

	/**
	 * Script generado para crear el elemento 
	 */
	private String genScript;

	// ------------------------------------------------------------------
	// Constructores  
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo marcador de linea
	 * @param color - Color del elemento 
	 * @param border - Borde del elemento 
	 */
	public Decoration(Border border, String decorationType) {
		this.border = border;
		this.setDecorationType(decorationType);
		genScript = this.generateScript();
	}
	
	// ------------------------------------------------------------------
	// Metodos  
	// ------------------------------------------------------------------

	public String generateScript()
	{
		String ans = "";
		if (this.decorationType.equals(NONE))
		{
			ans = "";
		}
		else if (this.decorationType.equals(ARROW))
		{
			ans = "d: '" + ARROW_SVG + "',fill: '" + this.border.getBorderColor().getHex() + "', " + this.getBorder().getGenScript();
		}
		else if (this.decorationType.equals(RHOMB))
		{
			ans = "d: '" + RHOMB_SVG + "',fill: '#FFFFFF' , " + this.getBorder().getGenScript();
		}
		else if (this.decorationType.equals(FILLED_RHOMB))
		{
			ans = "d: '" + RHOMB_SVG + "',fill: '" + this.border.getBorderColor().getHex() + "', " + this.getBorder().getGenScript();
		}
		else if (this.decorationType.equals(SQUARE))
		{
			ans = "d: '" + SQUARE_SVG + "',fill: '#FFFFFF' , " + this.getBorder().getGenScript();
		}
		else if (this.decorationType.equals(FILLED_SQUARE))
		{
			ans = "d: '" + SQUARE_SVG + "',fill: '" + this.border.getBorderColor().getHex() + "', " + this.getBorder().getGenScript();
		}
		else if (this.decorationType.equals(CLOSED_ARROW))
		{
			ans = "d: '" + CLOSED_ARROW_SVG + "',fill: '#FFFFFF' , " + this.getBorder().getGenScript();
		}
		else if (this.decorationType.equals(FILLED_CLOSED_ARROW))
		{
			ans = "d: '" + CLOSED_ARROW_SVG + "',fill: '" + this.border.getBorderColor().getHex() + "', " + this.getBorder().getGenScript();
		}		
		return ans;
	}
	
	// ------------------------------------------------------------------
	// Getters & Setters  
	// ------------------------------------------------------------------

	/**
	 * @return the border
	 */
	public Border getBorder() {
		return border;
	}

	/**
	 * @param border the border to set
	 */
	public void setBorder(Border border) {
		this.border = border;
	}

	/**
	 * @return the genScript
	 */
	public String getGenScript() {
		return genScript;
	}

	/**
	 * @param genScript the genScript to set
	 */
	public void setGenScript(String genScript) {
		this.genScript = genScript;
	}

	/**
	 * @return the decorationType
	 */
	public String getDecorationType() {
		return decorationType;
	}

	/**
	 * @param decorationType the decorationType to set
	 */
	public void setDecorationType(String decorationType) {
		this.decorationType = decorationType;
	}
}
