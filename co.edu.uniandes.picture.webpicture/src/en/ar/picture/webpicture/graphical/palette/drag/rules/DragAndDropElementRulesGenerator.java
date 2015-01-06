package en.ar.picture.webpicture.graphical.palette.drag.rules;

import java.util.ArrayList;

import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metalink;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;
import en.ar.picture.webpicture.graphical.elements.Ellipse;
import en.ar.picture.webpicture.graphical.icons.Icon;
import en.ar.picture.webpicture.graphical.links.Decoration;
import en.ar.picture.webpicture.graphical.links.Link;
import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Generador de la regla de sustitución de iconos por elementos 
 * @author hellspawn
 */
public class DragAndDropElementRulesGenerator 
{
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Metamodelo referenciado 
	 */
	private Metamodel metamodel;
	
	/**
	 * Reglas de sustitución de icono por elemento 
	 */
	private ArrayList <DragAndDropElementRuleDefinition> rules;
	
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de reglas de sustitución de drag and drop
	 * @param metamodel - Metamodelo creado a partir del ecore 
	 */
	public DragAndDropElementRulesGenerator(Metamodel metamodel) {
		this.metamodel = metamodel;
		this.rules = new ArrayList <DragAndDropElementRuleDefinition>();
		DragAndDropElementRuleDefinition rule = null; 
		for (int i = 0; i < metamodel.getModelElements().size(); i++)
		{
			rule = new DragAndDropElementRuleDefinition(metamodel.getModelElements().get(i));
			rules.add(rule);
		}
	}

	
	
	// ------------------------------------------------------------------
	// Metodos 
	// ------------------------------------------------------------------

	/**
	 * Genera el codigo JS para hacer el reemplazo de los iconos por elementos en el drag and drop 
	 * @return Codigo JS para el cambio de iconos en el drag and drop
	 */
	public String generateDragAndDropRules()
	{
		String ans = "function elementOnDragStart(cellView, event) { $('.paper-drag').show(); $('tools').addClass('dragging'); flyPaper.$el.addClass('dragging'); $(document.body).append(flyPaper.$el); var elType = cellView.model.attr(getElementInstance(cellView.model));";
		for (int i = 0; i < rules.size(); i++)
		{
			ans += rules.get(i).generateRule();
		}
		ans += "var padding = 10; var shift = g.point(cloneBBox.x - elementClone.get('position').x, cloneBBox.y - elementClone.get('position').y); elementClone.set('position', { x: -shift.x + padding, y: -shift.y + padding }); flyGraph.addCell(elementClone); flyPaper.setDimensions(cloneBBox.width + 2 * padding, cloneBBox.height + 2 * padding); var scrollTop = document.body.scrollTop || document.documentElement.scrollTop; flyPaper.$el.offset({ left: event.clientX - cloneBBox.width / 2, top: event.clientY + scrollTop - cloneBBox.height / 2 });}";
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
		Icon IA = new Icon("A", "label", "path");
		A.setIcon(IA);
		//public Icon(String type, String label, String path) {

		Ellipse EB = new Ellipse (10, 10, "B", "label", "internal", false, Color, Borde);
		Icon IB = new Icon("B", "label", "path");
		B.setIcon(IB);
		B.setGhaph(EB);
		B.setIcon(IB);
		Ellipse EC = new Ellipse (10, 10, "C", "label", "internal", false, Color, Borde);
		C.setGhaph(EC);
		Icon IC = new Icon("C", "label", "path");
		C.setIcon(IC);
		Ellipse ED = new Ellipse (10, 10, "D", "label", "internal", false, Color, Borde);
		D.setGhaph(ED);
		Icon ID = new Icon("D", "label", "path");
		D.setIcon(ID);
		Ellipse EE = new Ellipse (10, 10, "E", "label", "internal", false, Color, Borde);
		E.setGhaph(EE);
		Icon IE = new Icon("E", "label", "path");
		E.setIcon(IE);
		Ellipse EK = new Ellipse (10, 10, "K", "label", "internal", false, Color, Borde);
		K.setGhaph(EK);
		Icon IK = new Icon("K", "label", "path");
		K.setIcon(IK);
		Ellipse EH = new Ellipse (10, 10, "H", "label", "internal", false, Color, Borde);
		H.setGhaph(EH);
		Icon IH = new Icon("H", "label", "path");
		H.setIcon(IH);
		Ellipse EI = new Ellipse (10, 10, "I", "label", "internal", false, Color, Borde);
		I.setGhaph(EI);
		Icon II = new Icon("I", "label", "path");
		I.setIcon(II);
		
		DragAndDropElementRulesGenerator gen = new DragAndDropElementRulesGenerator(MM);
		System.out.println(gen.generateDragAndDropRules());
		
		
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
	 * @return the rules
	 */
	public ArrayList<DragAndDropElementRuleDefinition> getRules() {
		return rules;
	}

	/**
	 * @param rules the rules to set
	 */
	public void setRules(ArrayList<DragAndDropElementRuleDefinition> rules) {
		this.rules = rules;
	}

	/**
	 * @param metamodel the metamodel to set
	 */
	public void setMetamodel(Metamodel metamodel) {
		this.metamodel = metamodel;
	}
}
