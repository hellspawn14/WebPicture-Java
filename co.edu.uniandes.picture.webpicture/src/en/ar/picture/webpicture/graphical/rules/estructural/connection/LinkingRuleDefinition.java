package en.ar.picture.webpicture.graphical.rules.estructural.connection;

import en.ar.picture.webpicture.core.build.metamodel.Metalink;

/**
 * Representa una regla de conexión entre dos elementos del metamodelo para
 * representarlo en el editor generado
 * @author hellspawn
 */
public class LinkingRuleDefinition {
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
	 * Metalink para generar la regla
	 */
	private Metalink metalink;

	/**
	 * Declaracion de la regla
	 */
	private String declaration;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva regla estructural de conexion
	 * @param metalink - Metalink referenciado
	 */
	public LinkingRuleDefinition(Metalink metalink) {
		this.setMetalink(metalink);
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
		String ans = "var " + this.declaration + " = "
				+ "(magnetS && magnetS.getAttribute('type') === '"
				+ metalink.getScr().getGhaph().getType()
				+ "') && (magnetT && magnetT.getAttribute('type') === '"
				+ metalink.getTrg().getGhaph().getType() + "');";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the declaration
	 */
	public String getDeclaration() {
		return declaration;
	}

	/**
	 * @param declaration
	 *            the declaration to set
	 */
	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

	/**
	 * @return the metalink
	 */
	public Metalink getMetalink() {
		return metalink;
	}

	/**
	 * @param metalink
	 *            the metalink to set
	 */
	public void setMetalink(Metalink metalink) {
		this.metalink = metalink;
	}
}
