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
	
	/**
	 * Conjunto de referencias de los elementos del modelo 
	 */
	private ArrayList <Metalink> modelLinks;

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
		this.setModelLinks(new ArrayList<Metalink>());
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
	
	/**
	 * Retorna un metalink dado su nombre
	 * @param name - Nombre del metalink
	 * @return Metalink encontrado o null
	 */
	public Metalink getMetalinkByName(String name) {
		Metalink ans = null;
		Metaelement element = null;
		for (int i = 0; i < modelElements.size(); i++) {
			element = modelElements.get(i);
			for (int k = 0; k < element.getReferences().size(); k++) {
				ans = element.getReferences().get(k);
				if (ans.getName().equals(name)) {
					return ans;
				}
			}
		}
		return null;
	}
	
	/**
	 * Consolida la 
	 */
	public void consolidateInheritance()
	{
		Metaelement actual = null; 
		Metaelement father = null; 
		Metalink referenceToInherit = null;
		for (int i = 0; i < this.getModelElements().size(); i++)
		{
			actual = this.getModelElements().get(i);
			father = actual.getFather(); 
			if (father != null)
			{
				ArrayList <Metalink> referencesToFather = getMetalinkWhereTargetIs(father);
				for (int k = 0; k < referencesToFather.size(); k++)
				{
					referenceToInherit = cloneMetalink(referencesToFather.get(k));
					referenceToInherit.setTrg(actual);
					referenceToInherit.getScr().getReferences().add(referenceToInherit);
				}
			}
		}
	}
	
	/**
	 * Clona un metalink  
	 * @param toClone - metalink a clonar 
	 * @return copia del objeto ingresado como uno nuevo 
	 */
	public Metalink cloneMetalink(Metalink toClone)
	{
		Metalink copia = new Metalink("", null, null, false, 0, 0);
		copia.setContaintment(toClone.isContaintment());
		copia.setGrpLink(toClone.getGrpLink());
		copia.setLowerBound(toClone.getLowerBound());
		copia.setName(toClone.getName());
		copia.setScr(toClone.getScr());
		copia.setTrg(toClone.getTrg());
		copia.setUpperBound(toClone.getUpperBound());
		return copia;
	}
	
	
	/**
	 * Retorna una lista con los metalinks que tienen como trg al elemento ingresado 
	 * @param element - Metaelemento trg 
	 * @return - Lista con los metalinks donde el trg es el elemento ingresado 
	 */
	public ArrayList <Metalink> getMetalinkWhereTargetIs(Metaelement element)
	{
		ArrayList <Metalink> ans = new ArrayList <Metalink>();
		Metalink actual = null;
		ArrayList <Metalink> links = this.getModelLinks();
		for (int i = 0; i < links.size(); i++)
		{
			actual = links.get(i);
			if (actual.getTrg().equals(element))
			{
				ans.add(actual);
			}
		}
		return ans;
	}
	
	/**
	 * Retorna una lista con todos los metaelementos que heredan del metaelemento ingresado
	 * @param father - Metaelemento padre 
	 * @return - Lista con los metaelementos que heredan del padre
	 */
	public ArrayList <Metaelement> getChildren(Metaelement father)
	{
		ArrayList <Metaelement> children = new ArrayList <Metaelement>();
		Metaelement child = null; 
		Metaelement elFather = null;
		for (int i = 0; i < this.getModelElements().size(); i++)
		{
			child = getModelElements().get(i);
			elFather = child.getFather(); 
			if (elFather != null)
			{
				if (elFather.equals(father))
				{
					children.add(child);
				}
			}
		}
		return children;
	}
	
	/**
	 * Consolida el metamodelo con respecto a una nueva relacion 
	 * @param metalink - Nueva relacion 
	 */
	public void consolidateNewMetalink(Metalink metalink){
		Metaelement father = metalink.getScr();
		Metaelement child = null;
		Metalink copia = null;
		for (int i = 0; i < this.getModelElements().size(); i++)
		{
			child = this.getModelElements().get(i);
			if (child.getFather() != null)
			{
				if (child.getFather().equals(father))
				{
					//Hereda al src
					copia = cloneMetalink(metalink);
					copia.setScr(child);
					copia.setTrg(metalink.getTrg());
					child.getReferences().add(copia);
					
					//Heredar al trg
					/*
					trg = copia.getTrg();
					ArrayList <Metaelement> childrenTrg = getChildren(trg);
					for (int k = 0; k < childrenTrg.size(); k++)
					{
						copia = cloneMetalink(copia);
						copia.setTrg((childrenTrg.get(k)));
						child.getReferences().add(copia);
					}*/
					
				}
			}
		}
		father = metalink.getTrg();
		ArrayList <Metaelement> children = this.getChildren(father);
		for (int i = 0; i < children.size(); i++)
		{
			copia = cloneMetalink(metalink);
			copia.setScr(child);
			copia.setTrg(children.get(i));
			child.getReferences().add(copia);
		}
		
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

	/**
	 * @return the modelLinks
	 */
	public ArrayList <Metalink> getModelLinks() {
		modelLinks = new ArrayList <Metalink>();
		for (int i = 0; i < this.getModelElements().size(); i++)
		{
			modelLinks.addAll(this.getModelElements().get(i).getReferences());
		}
		return modelLinks;
	}

	/**
	 * @param modelLinks the modelLinks to set
	 */
	public void setModelLinks(ArrayList <Metalink> modelLinks) {
		this.modelLinks = modelLinks;
	}
}
