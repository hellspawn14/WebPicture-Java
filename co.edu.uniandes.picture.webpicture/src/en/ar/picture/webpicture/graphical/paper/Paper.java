package en.ar.picture.webpicture.graphical.paper;

import en.ar.picture.webpicture.graphical.rules.estructural.connection.LinkingRulesGenerator;

/**
 * Definicion del paper principal para generar el script 
 * @author hellspawn
 */
public class Paper {
	// ------------------------------------------------------------------
	// Atributos 
	// ------------------------------------------------------------------

	/**
	 * Reglas de validacion de conexion
	 */
	private LinkingRulesGenerator validationRules;

	// ------------------------------------------------------------------
	// Constructores 
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva definición para el paper principal 
	 * @param validationRules - Reglas validación de conexion 
	 */
	public Paper (LinkingRulesGenerator validationRules){
		this.validationRules = validationRules;
	}
	
	// ------------------------------------------------------------------
	// Metodos 
	// ------------------------------------------------------------------

	/**
	 * Genera el script del paper principal con las reglas de validacion 
	 * @return - Codigo JS para crear el paper principal 
	 */
	public String generateScript(){
		String ans = "var graph = new joint.dia.Graph;var paper = new joint.dia.Paper({ el: $('#modelCanvas'), gridSize: 10,height: $('#modelCanvas').height(),width: $('#modelCanvas').width(),gridSize: 1,model: graph,";
		ans += validationRules.generateLinkingRulesScript();
		ans += "});";
		return ans; 
	}
	
	// ------------------------------------------------------------------
	// Getters & Setters 
	// ------------------------------------------------------------------
	
	/**
	 * @return the validationRules
	 */
	public LinkingRulesGenerator getValidationRules() {
		return validationRules;
	}

	/**
	 * @param validationRules the validationRules to set
	 */
	public void setValidationRules(LinkingRulesGenerator validationRules) {
		this.validationRules = validationRules;
	}
}
