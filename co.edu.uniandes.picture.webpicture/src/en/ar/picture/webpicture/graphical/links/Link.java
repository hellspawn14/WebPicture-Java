package en.ar.picture.webpicture.graphical.links;

import en.ar.picture.webpicture.graphical.style.Border;

/**
 * Representa la especificación grafica de un link
 * @author hellspawn
 */
public class Link {
	// ------------------------------------------------------------------
	// Atributos   
	// ------------------------------------------------------------------
	
	/**
	 * Borde del link 
	 */
	private Border border;
	
	/**
	 * Texto/etiqueta del link 
	 */
	private String label; 
	
	/**
	 * Terminación del origen
	 */
	private Decoration srcDecoration;
	
	/**
	 * Terminación del objetivo 
	 */
	private Decoration trgDecoration;
	
	/**
	 * Script generado para crear el link 
	 */
	private String genScript;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo enlace para los elementos del modelo 
	 * @param border - Borde del link 
	 * @param label - Texto/etiqueta  
	 * @param srcDecoration - Decoración del origen 
	 * @param trgDecoration - Decoración del objetivo
	 */
	public Link(Border border, String label, Decoration srcDecoration, Decoration trgDecoration) {
		this.border = border;
		this.label = label;
		this.srcDecoration = srcDecoration;
		this.trgDecoration = trgDecoration;
		this.genScript = generateScript();
	}
	
	// ------------------------------------------------------------------
	// Metodos   
	// ------------------------------------------------------------------

	/**
	 * Retorna el script de creación del elemento segun la especificación del Picture
	 * @return - Script de creación del elemento 
	 */
	public String generateScript()
	{
		String ans = "oldLink.attr({'.connection': {" + this.getBorder().getGenScript() + " }, '.marker-source': { " + this.getSrcDecoration().getGenScript() + "},'.marker-target': {" + this.getTrgDecoration().getGenScript() + "},}); oldLink.label(0, { position: .5, attrs: { text: { text: '" + this.getLabel() + "', 'font-family': 'Arial, helvetica, sans-serif', 'font-size': 14, }}});";
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
	 * @return the srcDecoration
	 */
	public Decoration getSrcDecoration() {
		return srcDecoration;
	}

	/**
	 * @param srcDecoration the srcDecoration to set
	 */
	public void setSrcDecoration(Decoration srcDecoration) {
		this.srcDecoration = srcDecoration;
	}

	/**
	 * @return the trgDecoration
	 */
	public Decoration getTrgDecoration() {
		return trgDecoration;
	}

	/**
	 * @param trgDecoration the trgDecoration to set
	 */
	public void setTrgDecoration(Decoration trgDecoration) {
		this.trgDecoration = trgDecoration;
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
}
