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
	
	public static void main (String args[])
	{
		Palette P = new Palette("Batman");
		Toolgroup T = new Toolgroup("Batman costumes", "A set of Batman costumes");
		Icon I1 = new Icon("A", "Adam West", "http://static.tvtropes.org/pmwiki/pub/images/batman60s.jpg");
		Icon I2 = new Icon("B", "Nolan", "http://cdn-static.denofgeek.com/sites/denofgeek/files/styles/article_main_half/public/rises-main.jpg?itok=aYAmDbuM");
		T.getIcons().add(I1);
		T.getIcons().add(I2);
		P.getToolgroups().add(T);
		System.out.println(P.generateScript());
		//public Icon(String type, String label, String path) {
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