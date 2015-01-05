package en.ar.picture.webpicture.graphical.rules.estructural.connection;

import java.util.ArrayList;

/**
 * Generador de la regla de validacion de las conexiones entre los elementos del
 * editor
 * @author hellspawn
 */
public class LinkingRulesGenerator {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Reglas estructurales de conexion del editor
	 */
	private ArrayList<LinkingRuleDefinition> linkingRules;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de reglas estructurales
	 */
	public LinkingRulesGenerator() {
		linkingRules = new ArrayList<LinkingRuleDefinition>();
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera el codigo de la funcion validateConnection segun la especificacion
	 * del metamodelo intermedio y el picture
	 * @return - Codigo generado para la funcion validateConnection
	 */
	public String generateLinkingRulesScript() {
		String ans = "validateConnection: function (cellViewS, magnetS, cellViewT, magnetT, end, linkView) {"
				+ "\n";
		LinkingRuleDefinition rule = null;
		for (int i = 0; i < linkingRules.size(); i++) {
			rule = linkingRules.get(i);
			// Añadir la definicion de la regla
			ans += rule.generateRule() + "\n";
		}
		ans += "return ";
		if (!linkingRules.isEmpty()) {
			ans += linkingRules.get(0).getDeclaration();
		}
		for (int i = 1; i < linkingRules.size(); i++) {
			rule = linkingRules.get(i);
			ans += " || " + rule.getDeclaration();
		}
		ans += ";" + "\n" + "}";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the linkingRules
	 */
	public ArrayList<LinkingRuleDefinition> getLinkingRules() {
		return linkingRules;
	}

	/**
	 * @param linkingRules the linkingRules to set
	 */
	public void setLinkingRules(ArrayList<LinkingRuleDefinition> linkingRules) {
		this.linkingRules = linkingRules;
	}

}
