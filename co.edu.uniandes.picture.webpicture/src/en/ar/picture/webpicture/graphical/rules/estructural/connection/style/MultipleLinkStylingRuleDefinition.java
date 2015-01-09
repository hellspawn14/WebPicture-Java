package en.ar.picture.webpicture.graphical.rules.estructural.connection.style;

import java.util.ArrayList;

import en.ar.picture.webpicture.core.build.metamodel.Metalink;

/**
 * Definición para una regla multiple de conexion cuando un par de elementos tiene
 * mas de una relación 
 * @author hellspawn
 */
public class MultipleLinkStylingRuleDefinition {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Coleccion con relaciones multiples de un mismo elemento par de elementos 
	 */
	private ArrayList<Metalink> links;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva instancia del objeto para crear una definicion de estilo
	 * multiple
	 * @param links - Grupo de enlaces
	 */
	public MultipleLinkStylingRuleDefinition(ArrayList<Metalink> links) {
		this.links = links;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera la regla para cambiar el estilo de un link creado y conectado en
	 * el caso de que un par de elementos tengan mas de una relación
	 * @return - Definición de la regla de cambio de estilo multiple
	 */
	public String generateRule() {
		String ans = "if (src == '" + links.get(0).getScr().getGhaph().getType() + "' && trg == '" + links.get(0).getTrg().getGhaph().getType() + "'){var msg = 'Select the link to display'; bootbox.dialog({ message: msg, buttons: {";
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getGrpLink() != null)
			{
				ans += links.get(i).getGrpLink().getLabel() + ": { label: '"
						+ links.get(i).getGrpLink().getLabel()
						+ "', className: 'btn-primary', callback: function () {"
						+ links.get(i).getGrpLink().getGenScript() + "}}," + "\n";
			}/*
			ans += links.get(i).getGrpLink().getLabel() + ": { label: '"
					+ links.get(i).getGrpLink().getLabel()
					+ "', className: 'btn-primary', callback: function () {"
					+ links.get(i).getGrpLink().getGenScript() + "}}," + "\n";*/
		}
		ans += "}});}";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the links
	 */
	public ArrayList<Metalink> getLinks() {
		return links;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(ArrayList<Metalink> links) {
		this.links = links;
	}
}
