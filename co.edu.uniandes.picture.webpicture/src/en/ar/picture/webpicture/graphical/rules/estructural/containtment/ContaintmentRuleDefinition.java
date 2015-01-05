package en.ar.picture.webpicture.graphical.rules.estructural.containtment;

import en.ar.picture.webpicture.core.build.metamodel.Metalink;

/**
 * Representa una regla de contenencia para elementos anidados
 * @author hellspawn
 */
public class ContaintmentRuleDefinition {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	/**
	 * Encabezado del la variable
	 */
	public final static String VALIDATE = "VAL_";

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Referencia de contenencia
	 */
	private Metalink metalink;

	/**
	 * Declaración de la regla
	 */
	private String declaration;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva regla estructural de conexion
	 * @param metalink - Metalink referenciado
	 */
	public ContaintmentRuleDefinition(Metalink metalink) {
		this.metalink = metalink;
		this.declaration = VALIDATE + this.toString().split("@")[this.toString().split("@").length - 1];
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera la declaración de la regla estructural de conexion
	 * @return - Declaración de la regla estructural de conexion en JS
	 */
	public String generateRule() {
		String ans = "var " + this.declaration + " = " + "parent == '"
				+ metalink.getScr().getGhaph().getType() + "' && child == '"
				+ metalink.getTrg().getGhaph().getType() + "';";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the metalink
	 */
	public Metalink getMetalink() {
		return metalink;
	}

	/**
	 * @param metalink the metalink to set
	 */
	public void setMetalink(Metalink metalink) {
		this.metalink = metalink;
	}

	/**
	 * @return the declaration
	 */
	public String getDeclaration() {
		return declaration;
	}

	/**
	 * @param declaration the declaration to set
	 */
	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

}
