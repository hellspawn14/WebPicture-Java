package co.edu.uniandes.picture.webpicture.util.generator.rules;

import java.util.ArrayList;

/**
 * Genera las reglas estructurales basicas del modelo 
 * @author hellspawn
 */
public class StructuralRulesGenerator 
{	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Reglas estructurales generadas;
	 */
	private ArrayList <RuleDefinition> definitions;
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	public StructuralRulesGenerator()
	{
		setDefinitions(new ArrayList <RuleDefinition>());
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera el script de la funcion validateConnection para validar la union entre elementos del modelo 
	 * @return Script - >
	 * //Linking basic rules definition
	 * var SRC_7f31245a = (magnetS && magnetS.getAttribute('type') === 'A');
	 * var TRG_7f31245a = (magnetT && magnetT.getAttribute('type') === 'B');
	 * var SRC_6d6f6e28 = (magnetS && magnetS.getAttribute('type') === 'B');
	 * var TRG_6d6f6e28 = (magnetT && magnetT.getAttribute('type') === 'C');
	 * return SRC_7f31245a && TRG_7f31245a || SRC_6d6f6e28 && TRG_6d6f6e28;
	 */
	public String generateRule()
	{
		//Var X1 = ....
		//Var X2 = ....
		String meta = "//Linking basic rules definition";
		String def = "";
		for (int i = 0; i < this.getDefinitions().size(); i++)
		{
			def += this.getDefinitions().get(i).generateRuleDefinition();
		}
		//X1 && X2
		String ans = "return " + this.getDefinitions().get(0).getRule() + " ";
		for (int i = 1; i < this.getDefinitions().size(); i++)
		{
			ans += "|| " + this.getDefinitions().get(i).getRule() + " ";
		}
		ans = ans.trim() + ";";
		return meta + "\n" + def + ans;
		
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------
	
	/**
	 * @return the definitions
	 */
	public ArrayList <RuleDefinition> getDefinitions() {
		return definitions;
	}

	/**
	 * @param definitions the definitions to set
	 */
	public void setDefinitions(ArrayList <RuleDefinition> definitions) {
		this.definitions = definitions;
	}
	
	public static void main (String args[])
	{
		RuleDefinition R1 = new RuleDefinition("A", "B");
		RuleDefinition R2 = new RuleDefinition("B", "C");
		StructuralRulesGenerator gen = new StructuralRulesGenerator();
		gen.getDefinitions().add(R1);
		gen.getDefinitions().add(R2);
		System.out.println(gen.generateRule());	
	}

}
