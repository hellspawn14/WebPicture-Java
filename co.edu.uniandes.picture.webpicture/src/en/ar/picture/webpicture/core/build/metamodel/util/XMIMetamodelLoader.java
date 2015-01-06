package en.ar.picture.webpicture.core.build.metamodel.util;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import en.ar.picture.webpicture.core.build.metamodel.Metaelement;
import en.ar.picture.webpicture.core.build.metamodel.Metalink;
import en.ar.picture.webpicture.core.build.metamodel.Metamodel;

import java.io.File;

/**
 * Carga el metamodelo construido por el usuario
 * @author hellspawn
 */
public class XMIMetamodelLoader {
	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera un metamodelo base construido a partir del metamodelo cargado
	 * @param path - Directorio en el que se encuentra el metamodelo
	 * @return Metamodel metamodelo base generado para iniciar la validacion
	 * @throws Exception - En el caso de que exista algun elemento con nombre repetido
	 * en el metamodelo 
	 */
	public Metamodel load(String path) throws Exception {
		try {
			File ecore = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(ecore);
			doc.getDocumentElement().normalize();

			// Obtiene el nombre del modelo
			String modelName = doc.getDocumentElement().getAttribute("name");
			
			// Genera el modelo vacio
			Metamodel metamodel = new Metamodel(modelName);

			// Obtiene los elementos del modelo
			NodeList eClasses = doc.getElementsByTagName("eClassifiers");
			for (int i = 0; i < eClasses.getLength(); i++) {
				Node nNode = eClasses.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					Metaelement element = new Metaelement(
							eElement.getAttribute("name"), null);
					Metaelement existing = metamodel
							.getMetaelementByName(eElement.getAttribute("name"));
					if (existing != null) {
						throw new Exception(
								"There's already an element with the name "
										+ eElement.getAttribute("name")
										+ " please review the metamodel.");
					}
					metamodel.getModelElements().add(element);
				}
			}
			// Obtiene los padres
			for (int i = 0; i < eClasses.getLength(); i++) {
				Node nNode = eClasses.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String fatherName = eElement.getAttribute("eSuperTypes")
							.trim();
					if (!fatherName.equals("")) {
						fatherName = fatherName.split("//")[1];
						Metaelement son = metamodel
								.getMetaelementByName(eElement
										.getAttribute("name"));
						Metaelement father = metamodel
								.getMetaelementByName(fatherName);
						son.setFather(father);
					}
				}
			}
			// Obtiene las referencias
			for (int i = 0; i < eClasses.getLength(); i++) {
				Node nNode = eClasses.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					Metaelement source = metamodel
							.getMetaelementByName(eElement.getAttribute("name"));

					NodeList eStructuralFeatures = eElement
							.getElementsByTagName("eStructuralFeatures");
					for (int k = 0; k < eStructuralFeatures.getLength(); k++) {
						Node nElement = eStructuralFeatures.item(k);
						if (nElement.getNodeType() == Node.ELEMENT_NODE) {
							Element xElement = (Element) nElement;
							if (xElement.getAttribute("xsi:type").equals(
									"ecore:EReference")) {
								int upperBound = 0;
								int lowerBound = 0;
								String linkName = xElement.getAttribute("name");
								// Caso I: No se pone el dato
								// upperBound/lowerBound
								if (xElement.getAttribute("upperBound").trim()
										.equals("")
										&& xElement.getAttribute("lowerBound")
												.trim().equals("")) {
									upperBound = 1;
									lowerBound = 0;
								}
								// Caso II: Solo se pone el dato de upperBound
								else if (xElement.getAttribute("lowerBound")
										.trim().equals("")) {
									lowerBound = 0;
									upperBound = Integer.parseInt(xElement
											.getAttribute("upperBound"));
								} else if (xElement.getAttribute("upperBound")
										.trim().equals("")) {
									lowerBound = Integer.parseInt(xElement
											.getAttribute("lowerBound"));
									upperBound = 1;
								}
								// Caso III: Los dos datos estan presentes
								else {
									lowerBound = Integer.parseInt(xElement
											.getAttribute("lowerBound"));
									upperBound = Integer.parseInt(xElement
											.getAttribute("upperBound"));
								}

								Metaelement target = metamodel
										.getMetaelementByName(xElement
												.getAttribute("eType").split(
														"//")[1]);
								boolean containment = false;
								if (!xElement.getAttribute("containment")
										.trim().equals("")) {
									containment = true;
								}
								Metalink link = new Metalink(linkName, source,
										target, containment, upperBound,
										lowerBound);
								source.getReferences().add(link);
							}
						}
					}
				}
			}
			// Metamodelo construido
			//No consolidar hasta tener el picture - metamodel.consolidateMetamodel();
			return metamodel;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
