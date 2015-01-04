package en.ar.picture.webpicture.core.build.metamodel;

import en.ar.picture.webpicture.graphical.links.Link;

/**
 * Representa una relación entre dos elementos del metamodelo
 * @author hellspawn
 */
public class Metalink {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Nombre de la relación
	 */
	private String name;

	/**
	 * Elemento origen
	 */
	private Metaelement scr;

	/**
	 * Elemento objetivo
	 */
	private Metaelement trg;

	/**
	 * Indicador de contenencia
	 */
	private boolean isContaintment;

	/**
	 * Limite superior de la relación
	 */
	private int upperBound;

	/**
	 * Limite inferior de la relación
	 */
	private int lowerBound;

	// ------------------------------------------------------------------
	// Atributos graficos
	// ------------------------------------------------------------------

	/**
	 * Representación grafica de la relación
	 */
	private Link grpLink;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo metalink
	 * @param name - Nombre de la relación
	 * @param scr - Elemento origen
	 * @param trg - Elemento objetivo
	 * @param isContaintment - Indicador de contenencia
	 * @param upperBound - Limite superior
	 * @param lowerBound - Limite inferior
	 */
	public Metalink(String name, Metaelement scr, Metaelement trg, boolean isContaintment, int upperBound, int lowerBound) {
		this.name = name;
		this.scr = scr;
		this.trg = trg;
		this.isContaintment = isContaintment;
		this.upperBound = upperBound;
		this.lowerBound = lowerBound;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

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
	 * @return the scr
	 */
	public Metaelement getScr() {
		return scr;
	}

	/**
	 * @param scr the scr to set
	 */
	public void setScr(Metaelement scr) {
		this.scr = scr;
	}

	/**
	 * @return the trg
	 */
	public Metaelement getTrg() {
		return trg;
	}

	/**
	 * @param trg the trg to set
	 */
	public void setTrg(Metaelement trg) {
		this.trg = trg;
	}

	/**
	 * @return the isContaintment
	 */
	public boolean isContaintment() {
		return isContaintment;
	}

	/**
	 * @param isContaintment the isContaintment to set
	 */
	public void setContaintment(boolean isContaintment) {
		this.isContaintment = isContaintment;
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
	 * @return the grpLink
	 */
	public Link getGrpLink() {
		return grpLink;
	}

	/**
	 * @param grpLink the grpLink to set
	 */
	public void setGrpLink(Link grpLink) {
		this.grpLink = grpLink;
	}
}
