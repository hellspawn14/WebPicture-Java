package co.edu.uniandes.picture.webpicture.util.generator.rules;

/**
 * Definicion de las reglas estructurales basicas 
 * @author hellspawn
 */
public class RuleDefinition 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Condición de la regla 
	 * Xi && Yi 
	 */
	private String rule;
	
	/**
	 * In port typing
	 */
	private String srcMagnet;
	
	/**
	 * Out port typing
	 */
	private String trgMagnet;
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea una nueva definición de una regla estructural basica
	 * @param srcMagnet - Magnet de salida 
	 * @param trgMagnet - Magnet de entrada 
	 */
	public RuleDefinition(String srcMagnet, String trgMagnet)
	{
		this.srcMagnet = srcMagnet;
		this.trgMagnet = trgMagnet;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera la definición de la regla estructural y establece la condicion
	 * @return Script -> 
	 * var SRC_7f31245a = (magnetS && magnetS.getAttribute('type') === 'attributes');
	 * var TRG_7f31245a = (magnetT && magnetT.getAttribute('type') === 'attributes');
	 */
	public String generateRuleDefinition()
	{
		String src = "SRC_" + this.toString().split("@")[this.toString().split("@").length - 1];
		String trg = "TRG_" + this.toString().split("@")[this.toString().split("@").length - 1];
		String srcDef = "var " + src + " = (magnetS && magnetS.getAttribute('type') === '" + srcMagnet + "');" + "\n";
		String trgDef = "var " + trg + " = (magnetT && magnetT.getAttribute('type') === '" + trgMagnet + "');" + "\n";
		rule = src + " && " + trg;
		return srcDef + trgDef;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------

	/**
	 * @return the rule
	 */
	public String getRule() {
		return rule;
	}

	/**
	 * @param rule the rule to set
	 */
	public void setRule(String rule) {
		this.rule = rule;
	}

	/**
	 * @return the srcMagnet
	 */
	public String getSrcMagnet() {
		return srcMagnet;
	}

	/**
	 * @param srcMagnet the srcMagnet to set
	 */
	public void setSrcMagnet(String srcMagnet) {
		this.srcMagnet = srcMagnet;
	}

	/**
	 * @return the trgMagnet
	 */
	public String getTrgMagnet() {
		return trgMagnet;
	}

	/**
	 * @param trgMagnet the trgMagnet to set
	 */
	public void setTrgMagnet(String trgMagnet) {
		this.trgMagnet = trgMagnet;
	}	
}
