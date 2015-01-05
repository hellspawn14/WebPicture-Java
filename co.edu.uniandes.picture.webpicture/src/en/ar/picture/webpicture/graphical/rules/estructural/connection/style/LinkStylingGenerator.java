package en.ar.picture.webpicture.graphical.rules.estructural.connection.style;

import java.util.ArrayList;

import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metalink;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;

/**
 * Generador de las reglas de sustitución de conexiones
 * 
 * @author hellspawn
 */
public class LinkStylingGenerator {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Metamodelo generado
	 */
	private Metamodel metamodel;

	/**
	 * Reglas simples
	 */
	private ArrayList<SimpleLinkStylingRuleDefinition> simpleRules;

	/**
	 * Reglas multiples
	 */
	private ArrayList<MultipleLinkStylingRuleDefinition> complexRules;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de reglas de sustitución de conexiones para el
	 * editor actual
	 * @param metamodel - Metamodelo generado a partir del ecore
	 */
	public LinkStylingGenerator(Metamodel metamodel) {
		this.metamodel = metamodel;
		this.simpleRules = new ArrayList<SimpleLinkStylingRuleDefinition>();
		this.complexRules = new ArrayList<MultipleLinkStylingRuleDefinition>();

		for (int i = 0; i < metamodel.getModelElements().size(); i++) {
			Metaelement E = metamodel.getModelElements().get(i);
			// Obtiene los que tienen relaciones repetidas
			for (int k = 0; k < E.getReferences().size(); k++) {
				Metalink L = E.getReferences().get(k);
				if (L.isContaintment() == false) {
					ArrayList<Metalink> toCmp = E.getMultipleReferences(L);
					if (toCmp.isEmpty() == false) {
						MultipleLinkStylingRuleDefinition mutiple = new MultipleLinkStylingRuleDefinition(
								toCmp);
						complexRules.add(mutiple);
					}
				}
			}
		}

		for (int i = 0; i < metamodel.getModelElements().size(); i++) {
			Metaelement E = metamodel.getModelElements().get(i);
			// Obtiene las relaciones simples
			for (int j = 0; j < E.getReferences().size(); j++) {
				Metalink L = E.getReferences().get(j);
				if (L.isContaintment() == false) {
					SimpleLinkStylingRuleDefinition simple = new SimpleLinkStylingRuleDefinition(
							L);
					simpleRules.add(simple);
				}
			}
		}

	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	public String generateLinkStylingRulesScript() {
		String ans = "function replaceLink(oldLink, src, trg) {";
		for (int i = 0; i < simpleRules.size(); i++) {
			ans += simpleRules.get(i).generateRule();
		}
		for (int i = 0; i < complexRules.size(); i++) {
			ans += complexRules.get(i).generateRule();
		}
		ans += "}";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the metamodel
	 */
	public Metamodel getMetamodel() {
		return metamodel;
	}

	/**
	 * @param metamodel
	 *            the metamodel to set
	 */
	public void setMetamodel(Metamodel metamodel) {
		this.metamodel = metamodel;
	}

	/**
	 * @return the simpleRules
	 */
	public ArrayList<SimpleLinkStylingRuleDefinition> getSimpleRules() {
		return simpleRules;
	}

	/**
	 * @param simpleRules
	 *            the simpleRules to set
	 */
	public void setSimpleRules(
			ArrayList<SimpleLinkStylingRuleDefinition> simpleRules) {
		this.simpleRules = simpleRules;
	}

	/**
	 * @return the complexRules
	 */
	public ArrayList<MultipleLinkStylingRuleDefinition> getComplexRules() {
		return complexRules;
	}

	/**
	 * @param complexRules
	 *            the complexRules to set
	 */
	public void setComplexRules(
			ArrayList<MultipleLinkStylingRuleDefinition> complexRules) {
		this.complexRules = complexRules;
	}
}
