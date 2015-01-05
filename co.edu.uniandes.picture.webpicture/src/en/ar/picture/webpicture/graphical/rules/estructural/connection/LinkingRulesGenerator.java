package en.ar.picture.webpicture.graphical.rules.estructural.connection;

import java.util.ArrayList;

import en.ar.picture.webpicture.core.build.metamodel.Metamodel;


/**
 * Generador de la regla de validacion de las conexiones entre los elementos del
 * editor
 * @author hellspawn
 */
public class LinkingRulesGenerator {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Reglas estructurales de conexion del editor
	 */
	private ArrayList<LinkingRuleDefinition> linkingRules;
	
	/**
	 * Metamodelo generado a partir del ecore 
	 */
	private Metamodel metamodel;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de reglas estructurales 
	 * Ignora los elementos que tienen relacion de contenencia 
	 */
	public LinkingRulesGenerator(Metamodel metamodel) {
		linkingRules = new ArrayList<LinkingRuleDefinition>();
		this.setMetamodel(metamodel);
		for (int i = 0; i < metamodel.getModelElements().size(); i++)
		{
			for (int k = 0; k < metamodel.getModelElements().get(i).getReferences().size(); k++)
			{
				if (metamodel.getModelElements().get(i).getReferences().get(k).isContaintment() == false)
				{
					LinkingRuleDefinition L = new LinkingRuleDefinition(metamodel.getModelElements().get(i).getReferences().get(k));
					getLinkingRules().add(L);
				}
			}
		}
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

	/**
	 * @return the metamodel
	 */
	public Metamodel getMetamodel() {
		return metamodel;
	}

	/**
	 * @param metamodel the metamodel to set
	 */
	public void setMetamodel(Metamodel metamodel) {
		this.metamodel = metamodel;
	}

}
