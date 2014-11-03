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
		RuleDefinition R1 = new RuleDefinition("attributes");
		RuleDefinition R2 = new RuleDefinition("XY");
		StructuralRulesGenerator gen = new StructuralRulesGenerator();
		gen.getDefinitions().add(R1);
		gen.getDefinitions().add(R2);
		System.out.println(gen.generateRule());	
	}

}
