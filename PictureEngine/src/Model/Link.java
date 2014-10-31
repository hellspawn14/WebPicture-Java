package Model;

/**
 * Representa un enlace entre dos elementos de la paleta 
 * @author hellspawn
 */
public class Link 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Limite inferior
	 */
	private int lowerBound;
	
	/**
	 * Limite superior
	 */
	private int upperBound;
	
	/**
	 * Nombre de la referencia
	 */
	private String name;
	
	/**
	 * Indicador de contenencia 
	 */
	private boolean containment;
	
	/**
	 * Elemento target
	 */
	private Element target;
	
	/**
	 * Elemento origen
	 */
	private Element source;
	
	/**
	 * Script generado para crear el elemento 
	 */
	private String script;


	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------
	
	/**
	 * Crea un nuevo link con los parametros dados 
	 * @param lowerBound
	 * @param upperBound
	 * @param name
	 * @param containment
	 * @param target
	 * @param source
	 */
	public Link(int lowerBound, int upperBound, String name, boolean containment, Element target, Element source) 
	{
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.name = name;
		this.containment = containment;
		this.target = target;
		this.source = source;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------

	/**
	 * @return the lowerBound
	 */
	public int getLowerBound() {
		return lowerBound;
	}


	/**
	 * @param lowerBound the lowerBound to set
	 */
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}

	/**
	 * @return the upperBound
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * @param upperBound the upperBound to set
	 */
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the containment
	 */
	public boolean isContainment() {
		return containment;
	}

	/**
	 * @param containment the containment to set
	 */
	public void setContainment(boolean containment) {
		this.containment = containment;
	}

	/**
	 * @return the target
	 */
	public Element getTarget() {
		return target;
	}

	/**
	 * @param target the target to set
	 */
	public void setTarget(Element target) {
		this.target = target;
	}

	/**
	 * @return the source
	 */
	public Element getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(Element source) {
		this.source = source;
	}

	/**
	 * @return the script
	 */
	public String getScript() {
		return script;
	}

	/**
	 * @param script the script to set
	 */
	public void setScript(String script) {
		this.script = script;
	}
	
}
