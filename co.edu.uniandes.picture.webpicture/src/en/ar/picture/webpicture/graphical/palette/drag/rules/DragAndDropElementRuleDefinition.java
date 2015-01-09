package en.ar.picture.webpicture.graphical.palette.drag.rules;

import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.graphical.elements.Graph;
import en.ar.picture.webpicture.graphical.icons.Icon;

/**
 * Define una regla de sustitución de icono por el elemento en el drag and drop
 * @author hellspawn
 */
public class DragAndDropElementRuleDefinition {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Metaelemento referenciado
	 */
	private Metaelement metaelement;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva definición para la regla de drag and drop para cambio de
	 * icono por elemento
	 * @param metaelement - Metaelemento referenciado
	 */
	public DragAndDropElementRuleDefinition(Metaelement metaelement) {
		this.metaelement = metaelement;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera la regla de sustitución de icono por elemento en el drag and drop
	 * @return - Fragmento de codigo JS con la regla de sustitución del elemento
	 */
	public String generateRule() {
		String ans = "";
		Icon icn = metaelement.getIcon();
		Graph grp = metaelement.getGhaph();
		if(icn == null || grp == null)
		{
			ans = "";
		}
		else
		{
			ans = "if (elType == '" + icn.getType() + "') {"
					+ "elementClone = " + grp.getId() + ".clone(); cloneBBox = "
					+ grp.getId() + ".getBBox();}";
		}
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the metaelement
	 */
	public Metaelement getMetaelement() {
		return metaelement;
	}

	/**
	 * @param metaelement the metaelement to set
	 */
	public void setMetaelement(Metaelement metaelement) {
		this.metaelement = metaelement;
	}
}
