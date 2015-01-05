package en.ar.picture.webpicture.graphical.rules.estructural.containtment;

import java.util.ArrayList;

import en.ar.picture.webpicture.core.build.metamodel.Metamodel;

/**
 * Generador de la regla de validacion de las conexiones con relacion de contenencia
 * @author hellspawn 
 */
public class ContaintmentRulesGenerator {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Reglas estructurales de contenencia
	 */
	private ArrayList<ContaintmentRuleDefinition> hierarchicalRules;

	/**
	 * Metamodelo generado a partir del ecore
	 */
	private Metamodel metamodel;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de reglas estructurales de contenencia
	 * @param metamodel - Metamodelo creado a partir del ecore
	 */
	public ContaintmentRulesGenerator(Metamodel metamodel) {
		this.metamodel = metamodel;
		this.hierarchicalRules = new ArrayList<ContaintmentRuleDefinition>();
		for (int i = 0; i < metamodel.getModelElements().size(); i++) {
			for (int k = 0; k < metamodel.getModelElements().get(i)
					.getReferences().size(); k++) {
				if (metamodel.getModelElements().get(i).getReferences().get(k)
						.isContaintment() == true) {
					ContaintmentRuleDefinition C = new ContaintmentRuleDefinition(
							metamodel.getModelElements().get(i).getReferences()
									.get(k));
					getHierarchicalRules().add(C);
				}
			}
		}
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera el codigo de la funcion paper.on(.... segun la especificacion del
	 * metamodelo intermedio y el picture para la validacion de relaciones de
	 * contenencia
	 * @return - Codifo JS funcion paper.on(...
	 */
	public String generateHierarchicalRulesScript() {
		String ans = "paper.on('cell:pointerup', function (cellView, evt, x, y) { if (cellView.model instanceof joint.dia.Link) { updateDiagram(); } else { var cell = cellView.model; var cellViewsBelow = paper.findViewsFromPoint(cell.getBBox().center());if (cellViewsBelow.length) {var cellViewBelow = _.find(cellViewsBelow, function (c) {return c.model.id !== cell.id});if (cellViewBelow && cellViewBelow.model.get('parent') !== cell.id) {var father = graph.getCell(cellViewBelow.model.id);var son = graph.getCell(cell.id);var child = son.attr(getElementInstance(son));var parent = father.attr(getElementInstance(father));"
				+ "\n";
		ContaintmentRuleDefinition rule = null;
		for (int i = 0; i < getHierarchicalRules().size(); i++) {
			// Genera las declaraciones
			rule = getHierarchicalRules().get(i);
			ans += rule.generateRule() + "\n";
		}
		if (!getHierarchicalRules().isEmpty()) {
			ans += "if(" + getHierarchicalRules().get(0).getDeclaration();
			for (int i = 1; i < getHierarchicalRules().size(); i++) {
				rule = getHierarchicalRules().get(i);
				ans += "||" + rule.getDeclaration();
			}
			ans += "){cellViewBelow.model.embed(cell);}}} updateDiagram();}});";
		}
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the hierarchicalRules
	 */
	public ArrayList<ContaintmentRuleDefinition> getHierarchicalRules() {
		return hierarchicalRules;
	}

	/**
	 * @param hierarchicalRules the hierarchicalRules to set
	 */
	public void setHierarchicalRules(
			ArrayList<ContaintmentRuleDefinition> hierarchicalRules) {
		this.hierarchicalRules = hierarchicalRules;
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
