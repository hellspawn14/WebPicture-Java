package en.ar.picture.webpicture.graphical.rules.estructural.connection.style;

import java.util.ArrayList;

import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metalink;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;
import en.ar.picture.webpicture.graphical.elements.Ellipse;
import en.ar.picture.webpicture.graphical.links.Decoration;
import en.ar.picture.webpicture.graphical.links.Link;
import en.ar.picture.webpicture.graphical.rules.estructural.connection.LinkingRuleDefinition;
import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Generador de las reglas de sustitución de conexiones 
 * @author hellspawn
 */
public class LinkStylingGenerator {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	// ------------------------------------------------------------------
	// Atributos 
	// ------------------------------------------------------------------

	/**
	 * Metamodelo generado 
	 */
	private Metamodel metamodel;
	
	/**
	 * Reglas simples
	 */
	private ArrayList <SimpleLinkStylingRuleDefinition> simpleRules;
	
	/**
	 * Reglas multiples 
	 */
	private ArrayList <MultipleLinkStylingRuleDefinition> complexRules;

	
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de reglas de sustitución de conexiones para el editor actual 
	 * @param metamodel - Metamodelo generado a partir del ecore 
	 */
	public LinkStylingGenerator(Metamodel metamodel) {
		this.metamodel = metamodel;
		this.simpleRules = new ArrayList <SimpleLinkStylingRuleDefinition>();
		this.complexRules = new ArrayList <MultipleLinkStylingRuleDefinition>();
		
		for (int i = 0; i < metamodel.getModelElements().size(); i++)
		{
			Metaelement E = metamodel.getModelElements().get(i);
			//Obtiene los que tienen relaciones repetidas
			for (int k = 0; k < E.getReferences().size(); k++)
			{
				Metalink L = E.getReferences().get(k);
				if (L.isContaintment() == false)
				{
					ArrayList <Metalink> toCmp = E.getMultipleReferences(L);
					if (toCmp.isEmpty() == false)
					{
						MultipleLinkStylingRuleDefinition mutiple = new MultipleLinkStylingRuleDefinition(toCmp);
						complexRules.add(mutiple);
					}
				}
			}
			//Obtiene las relaciones simples
			for (int j = 0; j < E.getReferences().size(); j++)
			{
				Metalink L = E.getReferences().get(j);
				if (L.isContaintment() == false)
				{
					SimpleLinkStylingRuleDefinition simple = new SimpleLinkStylingRuleDefinition(L);
					simpleRules.add(simple);
				}
			}
		}
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	public String generateLinkStylingRulesScript()
	{
		String ans = "function replaceLink(oldLink, src, trg) {"; 
		
		for (int i = 0; i < simpleRules.size(); i++)
		{
			ans += simpleRules.get(i).generateRule(); 
		}
		for (int i = 0; i < complexRules.size(); i++)
		{
			ans += complexRules.get(i).generateRule();
		}
		ans += "}";
		return ans; 
	}
	
	public static void main (String args[])
	{
		Metamodel MM = new Metamodel("MM");
		Metaelement A = new Metaelement("A", null);
		
		Color Color = new Color (25,14,14, "Prueba");
		Border Borde = new Border (Color, 1, "solid", "Prueba");
		
		//Link(Border border, String label, Decoration srcDecoration,Decoration trgDecoration) {
		// Decoration(Border border, String decorationType)
		
		Decoration Dec = new Decoration (Borde,"none");
		Link L_AB = new Link (Borde, "AB", Dec, Dec);
		Link L_CD = new Link (Borde, "CD", Dec, Dec);
		Link L_KH = new Link (Borde, "KH", Dec, Dec);
		Link L_ABX = new Link (Borde, "AB_X", Dec, Dec);
		
		
		Metaelement B = new Metaelement("B", null);
		Metalink AB = new Metalink("AB", A, B, false, 0, 0);
		AB.setGrpLink(L_AB);
		Metalink ABX = new Metalink("AB", A, B, false, 0, 0);
		ABX.setGrpLink(L_ABX);
		A.getReferences().add(AB);
		A.getReferences().add(ABX);
		Metaelement C = new Metaelement("C", A);
		Metaelement D = new Metaelement("D", null);
		Metalink CD = new Metalink("CD", C, D, false, 0, 0);
		CD.setGrpLink(L_CD);
		C.getReferences().add(CD);
		Metaelement K = new Metaelement("K", C);
		Metaelement E = new Metaelement("E", C);
		Metaelement H = new Metaelement("H", null);
		Metaelement I = new Metaelement("I", K);
		Metalink KH = new Metalink("KH", K, H, false, 0, 0);
		KH.setGrpLink(L_KH);
		K.getReferences().add(KH);
		
		MM.getModelElements().add(A);
		MM.getModelElements().add(B);
		MM.getModelElements().add(C);
		MM.getModelElements().add(D);
		MM.getModelElements().add(K);
		MM.getModelElements().add(E);
		MM.getModelElements().add(H);
		MM.getModelElements().add(I);
		MM.consolidateMetamodel();
		
		Ellipse EA = new Ellipse (10, 10, "A", "label", "internal", false, Color, Borde);
		A.setGhaph(EA);
		Ellipse EB = new Ellipse (10, 10, "B", "label", "internal", false, Color, Borde);
		B.setGhaph(EB);
		Ellipse EC = new Ellipse (10, 10, "C", "label", "internal", false, Color, Borde);
		C.setGhaph(EC);
		Ellipse ED = new Ellipse (10, 10, "D", "label", "internal", false, Color, Borde);
		D.setGhaph(ED);
		Ellipse EE = new Ellipse (10, 10, "E", "label", "internal", false, Color, Borde);
		E.setGhaph(EE);
		Ellipse EK = new Ellipse (10, 10, "K", "label", "internal", false, Color, Borde);
		K.setGhaph(EK);
		Ellipse EH = new Ellipse (10, 10, "H", "label", "internal", false, Color, Borde);
		H.setGhaph(EH);
		Ellipse EI = new Ellipse (10, 10, "I", "label", "internal", false, Color, Borde);
		I.setGhaph(EI);
		
		LinkStylingGenerator gen = new LinkStylingGenerator(MM);
		
		
		
		System.out.println(gen.generateLinkStylingRulesScript());
		
		
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
	 * @param metamodel the metamodel to set
	 */
	public void setMetamodel(Metamodel metamodel) {
		this.metamodel = metamodel;
	}

	/**
	 * @return the simpleRules
	 */
	public ArrayList <SimpleLinkStylingRuleDefinition> getSimpleRules() {
		return simpleRules;
	}

	/**
	 * @param simpleRules the simpleRules to set
	 */
	public void setSimpleRules(ArrayList <SimpleLinkStylingRuleDefinition> simpleRules) {
		this.simpleRules = simpleRules;
	}

	/**
	 * @return the complexRules
	 */
	public ArrayList <MultipleLinkStylingRuleDefinition> getComplexRules() {
		return complexRules;
	}

	/**
	 * @param complexRules the complexRules to set
	 */
	public void setComplexRules(ArrayList <MultipleLinkStylingRuleDefinition> complexRules) {
		this.complexRules = complexRules;
	}
}
