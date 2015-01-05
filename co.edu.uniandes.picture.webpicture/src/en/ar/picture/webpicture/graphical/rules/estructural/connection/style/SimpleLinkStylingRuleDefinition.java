package en.ar.picture.webpicture.graphical.rules.estructural.connection.style;

import en.ar.picture.webpicture.core.build.metamodel.Metalink;

/**
 * Representa una regla de reemplazo de link cuando se conectan dos elementos Al
 * hacer y validar la conexion el link se reemplaza automaticamente por el link
 * especifico (una sola conexion)
 * @author hellspawn
 */
public class SimpleLinkStylingRuleDefinition {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Metalink de cambio
	 */
	private Metalink metalink;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva regla de reemplazo de link
	 * @param metalink - Metalink referenciado para generar la regla
	 */
	public SimpleLinkStylingRuleDefinition(Metalink metalink) {
		this.metalink = metalink;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera la regla para un metalink simple (Una pareja de elementos solo
	 * tiene un tipo de relación)
	 * @return Regla de sustitución de link
	 */
	public String generateRule() {
		String src = metalink.getScr().getGhaph().getType();
		String trg = metalink.getTrg().getGhaph().getType();
		String ans = "if (src == '" + src + "' && trg == '" + trg + "'){"
				+ metalink.getGrpLink().generateScript() + "}";
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
}
