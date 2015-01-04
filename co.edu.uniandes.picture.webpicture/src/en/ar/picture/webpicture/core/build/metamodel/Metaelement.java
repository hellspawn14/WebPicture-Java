package en.ar.picture.webpicture.core.build.metamodel;

import java.util.ArrayList;

import co.edu.uniandes.picture.webpicture.graphical.shapes.Graph;
import en.ar.picture.webpicture.graphical.icons.Icon;

/**
 * Representa un elemento del metamodelo
 * @author hellspawn
 */
public class Metaelement {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Nombre del elemento (estructural)
	 */
	private String name;

	/**
	 * Elemento padre (estructural) Puede ser null
	 */
	private Metaelement father;

	/**
	 * Relaciones con otros elementos
	 */
	private ArrayList<Metalink> references;

	/**
	 * Referencias heredadas del padre
	 */
	private ArrayList<Metalink> inheritedReferences;
	
	/**
	 * Lista de referencias consolidadas
	 */
	private ArrayList <Metalink> ref;
	

	// ------------------------------------------------------------------
	// Atributos graficos
	// ------------------------------------------------------------------

	/**
	 * Icono del elemento
	 */
	private Icon icon;

	/**
	 * Representación grafica del elemento
	 */
	private Graph ghaph;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo elemento del metamodelo
	 * @param name - Nombre del elemento
	 * @param father - Elemento padre
	 */
	public Metaelement(String name, Metaelement father) {
		this.name = name;
		this.father = father;
		this.references = new ArrayList<Metalink>();
		this.inheritedReferences = new ArrayList<Metalink>();
		this.ref = new ArrayList<Metalink>();
		
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Retorna las referencias heredadas del padre del elemento
	 * @return - Lista de relaciones heredadas del padre
	 */
	public ArrayList<Metalink> inheritReferences() {
		if (this.father != null) {
			ArrayList<Metalink> inheritance = this.father.inheritReferences();
			if (this.getInheritedReferences().isEmpty()) {
				this.setInheritedReferences(inheritance);
				return this.getInheritedReferences();
			} else {
				return this.getReferences();
			}
		} else {
			return this.getReferences();
		}
	}

	/**
	 * Consolida las referencias del elemento actual
	 */
	public void consolidateReferences() {
		references.addAll(inheritedReferences);
		Metalink original = null; 
		Metalink copia = null;
		for (int k = 0; k < getReferences().size(); k++){
			original = getReferences().get(k);
			copia = new Metalink("", null, null, false, 0, 0);
			copia.setContaintment(original.isContaintment());
			copia.setGrpLink(original.getGrpLink());
			copia.setLowerBound(original.getLowerBound());
			copia.setName(original.getName());
			copia.setScr(original.getScr());
			copia.setTrg(original.getTrg());
			copia.setUpperBound(original.getUpperBound());
			ref.add(copia);	
		}
		this.setReferences(ref);
	}
	
	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the father
	 */
	public Metaelement getFather() {
		return father;
	}

	/**
	 * @param father the father to set
	 */
	public void setFather(Metaelement father) {
		this.father = father;
	}

	/**
	 * @return the references
	 */
	public ArrayList<Metalink> getReferences() {
		return references;
	}

	/**
	 * @param references the references to set
	 */
	public void setReferences(ArrayList<Metalink> references) {
		this.references = references;
	}

	/**
	 * @return the icon
	 */
	public Icon getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	/**
	 * @return the ghaph
	 */
	public Graph getGhaph() {
		return ghaph;
	}

	/**
	 * @param ghaph the ghaph to set
	 */
	public void setGhaph(Graph ghaph) {
		this.ghaph = ghaph;
	}

	/**
	 * @return the inheritedReferences
	 */
	public ArrayList<Metalink> getInheritedReferences() {
		return inheritedReferences;
	}

	/**
	 * @param inheritedReferences the inheritedReferences to set
	 */
	public void setInheritedReferences(ArrayList<Metalink> inheritedReferences) {
		this.inheritedReferences = inheritedReferences;
	}

	/**
	 * @return the ref
	 */
	public ArrayList<Metalink> getRef() {
		return ref;
	}

	/**
	 * @param ref the ref to set
	 */
	public void setRef(ArrayList<Metalink> ref) {
		this.ref = ref;
	}
		
}
