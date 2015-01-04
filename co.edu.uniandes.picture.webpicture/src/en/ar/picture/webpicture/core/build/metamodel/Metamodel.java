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

	public static void main(String args[]) {
		Metamodel MM = new Metamodel("MM");
		Metaelement A = new Metaelement("A", null);
		Metaelement B = new Metaelement("B", null);
		Metalink AB = new Metalink("AB", A, B, false, 0, 0);
		A.getReferences().add(AB);
		Metaelement C = new Metaelement("C", A);
		Metaelement D = new Metaelement("D", null);

		Metalink CD = new Metalink("CD", C, D, false, 0, 0);
		C.getReferences().add(CD);
		Metaelement K = new Metaelement("K", C);
		Metaelement E = new Metaelement("E", C);
		Metaelement H = new Metaelement("H", null);
		Metaelement I = new Metaelement("I", K);

		Metalink KH = new Metalink("KH", K, H, false, 0, 0);
		K.getReferences().add(KH);

		MM.modelElements.add(A);
		MM.modelElements.add(B);
		MM.modelElements.add(C);
		MM.modelElements.add(D);
		MM.modelElements.add(K);
		MM.modelElements.add(E);
		MM.modelElements.add(H);
		MM.modelElements.add(I);
		MM.consolidateMetamodel();
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
}
