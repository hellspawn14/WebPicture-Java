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
	 * Port typing
	 */
	private String portType;
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	/**
	 * Crea una nueva definición de una regla estructural basica 
	 * @param portType - Es el tipo de puerto 
	 */
	public RuleDefinition(String portType)
	{
		this.portType = portType;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera la definición de la regla estructural y establece la condicion
	 * @return
	 */
	public String generateRuleDefinition()
	{
		String src = "SRC_" + this.toString().split("@")[this.toString().split("@").length - 1];
		String trg = "TRG_" + this.toString().split("@")[this.toString().split("@").length - 1];
		String srcDef = "var " + src + " = (magnetS && magnetS.getAttribute('type') === '" + portType + "');" + "\n";
		String trgDef = "var " + trg + " = (magnetT && magnetT.getAttribute('type') === '" + portType + "');" + "\n";
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
	 * @return the portType
	 */
	public String getPortType() {
		return portType;
	}

	/**
	 * @param portType the portType to set
	 */
	public void setPortType(String portType) {
		this.portType = portType;
	}
}
