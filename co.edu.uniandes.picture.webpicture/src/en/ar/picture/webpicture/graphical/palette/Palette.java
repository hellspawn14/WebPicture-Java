package en.ar.picture.webpicture.graphical.palette;

import java.util.ArrayList;

/**
 * Representa la paleta de elementos del editor 
 * @author hellspawn
 */
public class Palette {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Nombre de la paleta
	 */
	private String name;

	/**
	 * Grupos de herramientas de la paleta
	 */
	private ArrayList<Toolgroup> toolgroups;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva paleta de elementos para el editor
	 * 
	 * @param name - Nombre de la paleta
	 */
	public Palette(String name) {
		this.name = name;
		this.toolgroups = new ArrayList<Toolgroup>();
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Retorna el codigo JavaScript para crear la paleta de elementos para el
	 * editor
	 * @return Codigo JavaScript para crear la paleta
	 */
	public String generateScript() {
		String ans = "$('#paletteName').text(" + '"' + this.getName() + '"' + ");";
		for (int i = 0; i < toolgroups.size(); i++) {
			ans += toolgroups.get(i).generateScript();
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
	 * @return the toolgroups
	 */
	public ArrayList<Toolgroup> getToolgroups() {
		return toolgroups;
	}

	/**
	 * @param toolgroups the toolgroups to set
	 */
	public void setToolgroups(ArrayList<Toolgroup> toolgroups) {
		this.toolgroups = toolgroups;
	}

}