package en.ar.picture.webpicture.graphical.paper;

import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;

/**
 * Genera el codigo de los elementos graficos (Graph) del metamodelo
 * @author hellspawn
 */
public class GraphicalDefinition {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Metamodelo construido a partir del ecore
	 */
	private Metamodel metamodel;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva definicion de elementos graficos
	 * @param metamodel - Metamodelo construido
	 */
	public GraphicalDefinition(Metamodel metamodel) {
		this.metamodel = metamodel;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera el codigo JS de la declaración de los elementos graficos
	 * @return - Codigo JS de los elementos graficos
	 */
	public String generateElementsDeclaration() {
		String ans = "";
		Metaelement element = null;
		for (int i = 0; i < metamodel.getModelElements().size(); i++) {
			element = metamodel.getModelElements().get(i);
			if (element.getIcon() != null && element.getGhaph() != null) {
				ans += element.getGhaph().generateScript();
			}
		}
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

}
