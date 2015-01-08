package en.ar.picture.webpicture.core.build.metamodel;

import java.util.ArrayList;

import en.ar.picture.webpicture.graphical.elements.Graph;
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
	
	/**
	 * Indica si el elemento es un nodelink
	 */
	private boolean isNodeLink;
	

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
	 * Retorna un metalink dado su nombre 
	 * @param name - Nombre del metalink 
	 * @return Metalink encontrado o null 
	 */
	public Metalink getMetalinkByName(String name) {
		Metalink ans = null;
		for (int i = 0; i < references.size(); i++) {
			ans = references.get(i);
			if (ans.getName().equals(name)) {
				return ans;
			} else {
				ans = null;
			}
		}
		return ans;
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
	
	/**
	 * Retorna una lista de todas las relaciones que tienen el mismo trg de la relacion ingresada 
	 * Remueve la relación que cumpla la condición del arreglo original
	 * @param A - Relación a comparar 
	 * @return - Lista con las relaciones que cumplen la condicion 
	 */
	public ArrayList<Metalink> getMultipleReferences(Metalink A) {
		ArrayList<Metalink> ans = new ArrayList<Metalink>();
		Metalink B = null;
		for (int i = 0; i < references.size(); i++) {
			B = references.get(i);
			if (!A.equals(B)) {
				if (A.getTrg().equals(B.getTrg())) {
					ans.add(A);
					ans.add(B);
					// Remueve el elemento con la misma relacion
					references.remove(B);
				}
			}
		}
		if (ans.isEmpty() == false)
		{
			references.remove(A);
		}
		return ans;
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

	/**
	 * @return the isNodeLink
	 */
	public boolean isNodeLink() {
		return isNodeLink;
	}

	/**
	 * @param isNodeLink the isNodeLink to set
	 */
	public void setNodeLink(boolean isNodeLink) {
		this.isNodeLink = isNodeLink;
	}		
}
