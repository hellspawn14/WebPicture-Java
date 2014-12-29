package en.ar.picture.webpicture.graphical.util;

import java.util.ArrayList;

/**
 * Generador de SVG path para poligonos lineales 
 * - No genera poligonos con curvas - 
 * - No se controla el tamaño del poligono generado - 
 * - Los poligonos generados tienen un tamaño base de 500 x 500 px - 
 * @author hellspawn 
 */
public class SVGPathCreator {

	// ------------------------------------------------------------------
	// Constantes 
	// ------------------------------------------------------------------

	/**
	 * Mover trazo a 
	 */
	public final static String MOVE_TO = "M";
	
	/**
	 * Linea a 
	 */
	public final static String LINE_TO = "L";
	
	/**
	 * Cerrar path 
	 */
	public final static String CLOSE_PATH = "Z";
	
	/**
	 * Radio base 
	 */
	public final static int R = 250;
	
	/**
	 * Centro en X
	 */
	public final static int CENTER_X = 250;
	
	/**
	 * Centro en y
	 */
	public final static int CENTER_Y = 250;
	
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------
	
	/**
	 * Angulo de inicio 
	 */
	private double startAngle;
	
	/**
	 * Numero de vertices 
	 */
	private int vertex;
	
	// ------------------------------------------------------------------
	// Constructores 
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de paths SVG 
	 * @param startAngle - Angulo de inicio 
	 * @param vertex - Numero de vertices 
	 */
	public SVGPathCreator(double startAngle, int vertex) {
		this.startAngle = startAngle;
		this.vertex = vertex;
	}
	
	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera el SVG path para crear el elemento 
	 * @return SVG para crear el elemento 
	 */
	public String generatePath()
	{
		ArrayList <SVGCoordinate> coordinates = new ArrayList <SVGCoordinate> ();
		double desp = 360/vertex;
		double rec = 0;
		SVGCoordinate initial = this.getCoordinateByAngle(startAngle);
		coordinates.add(initial);
		for (int i = 1; i < this.getVertex(); i++)
		{
			rec = desp * i;
			initial = this.getCoordinateByAngle(rec + startAngle);
			coordinates.add(initial);
		}
		String ans = MOVE_TO + coordinates.get(0).toString();
		for (int i = 1; i < coordinates.size(); i++)
		{
			ans += LINE_TO + coordinates.get(i).toString();
		}
		ans += CLOSE_PATH;
		return ans; 
	}
	
	/**
	 * Calcula las coordenadas XY de acuerdo a un angulo dado 
	 * @param angle - Angulo 
	 * @return Coordenadas XY del angulo
	 */
	public SVGCoordinate getCoordinateByAngle(double angle)
	{
		double X = CENTER_X + (R * Math.cos(Math.toRadians(-angle)));
		double Y = CENTER_Y + (R * Math.sin(Math.toRadians(-angle)));
		return new SVGCoordinate(X,Y);
	}

	// ------------------------------------------------------------------
	// Getters & Setters 
	// ------------------------------------------------------------------
	
	/**
	 * @return the startAngle
	 */
	public double getStartAngle() {
		return startAngle;
	}

	/**
	 * @param startAngle the startAngle to set
	 */
	public void setStartAngle(double startAngle) {
		this.startAngle = startAngle;
	}

	/**
	 * @return the vertex
	 */
	public int getVertex() {
		return vertex;
	}

	/**
	 * @param vertex the vertex to set
	 */
	public void setVertex(int vertex) {
		this.vertex = vertex;
	}
}
