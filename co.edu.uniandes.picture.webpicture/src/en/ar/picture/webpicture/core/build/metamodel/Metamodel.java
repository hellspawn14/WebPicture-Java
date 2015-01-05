package en.ar.picture.webpicture.core.build.metamodel;

import java.util.ArrayList;


/**
 * Representa el metamodelo intermedio creado a partir del metamodelo cargado
 * por el usuario
 * @author hellspawn
 */
public class Metamodel {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Elemento raiz del metamodelo
	 */
	private Metaelement rootElement;

	/**
	 * Conjunto de elementos del metamodelo
	 */
	private ArrayList<Metaelement> modelElements;

	/**
	 * Nombre del modelo referenciado
	 */
	private String referencedModel;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo metamodelo creado a partir del metamodelo cargado
	 * @param referencedModel
	 */
	public Metamodel(String referencedModel) {
		this.setReferencedModel(referencedModel);
		this.modelElements = new ArrayList<Metaelement>();
		setRootElement(null);
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Consolida los elementos estructurales del modelo Estructura las
	 * relaciones de herencia
	 */
	public void consolidateMetamodel() {
		for (int i = 0; i < modelElements.size(); i++) {
			modelElements.get(i).inheritReferences();
		}

		for (int i = 0; i < modelElements.size(); i++) {
			modelElements.get(i).consolidateReferences();
		}

		Metaelement actual = null;
		for (int i = 0; i < modelElements.size(); i++) {
			actual = modelElements.get(i);
			for (int k = 0; k < modelElements.get(i).getRef().size(); k++) {
				actual.getReferences().get(k).setScr(actual);
			}
		}
	}
	
	/**
	 * Retorna un metaelemento dado su nombre
	 * @param name - Es el nombre del metaelemento
	 * @return Metaelement/null
	 */
	public Metaelement getMetaelementByName(String name) {
		Metaelement ans = null;
		for (int i = 0; i < modelElements.size(); i++) {
			ans = modelElements.get(i);
			if (ans.getName().equals(name)) {
				return ans;
			} else {
				ans = null;
			}
		}
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the rootElement
	 */
	public Metaelement getRootElement() {
		return rootElement;
	}

	/**
	 * @param rootElement the rootElement to set
	 */
	public void setRootElement(Metaelement rootElement) {
		this.rootElement = rootElement;
	}

	/**
	 * @return the referencedModel
	 */
	public String getReferencedModel() {
		return referencedModel;
	}

	/**
	 * @param referencedModel the referencedModel to set
	 */
	public void setReferencedModel(String referencedModel) {
		this.referencedModel = referencedModel;
	}

	/**
	 * @return the modelElements
	 */
	public ArrayList<Metaelement> getModelElements() {
		return modelElements;
	}

	/**
	 * @param modelElements the modelElements to set
	 */
	public void setModelElements(ArrayList<Metaelement> modelElements) {
		this.modelElements = modelElements;
	}
}
