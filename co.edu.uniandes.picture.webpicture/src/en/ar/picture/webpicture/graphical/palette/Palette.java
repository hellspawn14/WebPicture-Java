package en.ar.picture.webpicture.graphical.palette;

import java.util.ArrayList;

import en.ar.picture.webpicture.graphical.icons.Icon;

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
	
	public static void main(String args[])
	{
		Palette P = new Palette ("Eras de batman");
		Toolgroup T = new Toolgroup("Disfraces", "Disfraces de batman");
		Icon I1 = new Icon ("A", "West", "http://www.blastr.com/sites/blastr/files/Adam%20West%20Batman.jpg");
		Icon I2 = new Icon ("A", "Nolan", "http://static.comicvine.com/uploads/original/11119/111199816/4274393-4228925-4165782-5825568197-rumor.jpg");
		Icon I3 = new Icon ("A", "Affleck", "http://cdn.bleedingcool.net/wp-content/uploads/2013/09/batman-affleck-600x860.jpg");
		T.getIcons().add(I1);
		T.getIcons().add(I2);
		T.getIcons().add(I3);
		P.getToolgroups().add(T);
		Toolgroup T2 = new Toolgroup("Disfraces", "Disfraces de batman");
		Icon I12 = new Icon ("A", "West", "http://www.blastr.com/sites/blastr/files/Adam%20West%20Batman.jpg");
		Icon I22 = new Icon ("A", "Nolan", "http://static.comicvine.com/uploads/original/11119/111199816/4274393-4228925-4165782-5825568197-rumor.jpg");
		Icon I32 = new Icon ("A", "Affleck", "http://cdn.bleedingcool.net/wp-content/uploads/2013/09/batman-affleck-600x860.jpg");
		T2.getIcons().add(I12);
		T2.getIcons().add(I22);
		T2.getIcons().add(I32);
		P.getToolgroups().add(T2);
		System.out.println(P.generateScript());
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