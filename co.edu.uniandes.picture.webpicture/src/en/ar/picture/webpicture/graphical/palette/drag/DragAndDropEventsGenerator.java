package en.ar.picture.webpicture.graphical.palette.drag;

import java.util.ArrayList;

import en.ar.picture.webpicture.graphical.palette.Palette;
import en.ar.picture.webpicture.graphical.palette.Toolgroup;

/**
 * Generador de declaraciones de eventos de drag and drop para la paleta de
 * elementos del editor
 * @author hellspawn
 */
public class DragAndDropEventsGenerator {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Paleta de elementos del editor
	 */
	private Palette palette;

	/**
	 * Lista de eventos (depende de los papers)
	 */
	private ArrayList<DragAndDropEventDefinition> events;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo generador de eventos de drag and drop
	 * @param palette - Paleta del editor
	 */
	public DragAndDropEventsGenerator(Palette palette) {
		this.palette = palette;
		this.events = new ArrayList<DragAndDropEventDefinition>();

		DragAndDropEventDefinition event = null;
		for (int i = 0; i < palette.getToolgroups().size(); i++) {
			event = new DragAndDropEventDefinition(palette.getToolgroups().get(
					i));
			events.add(event);
		}
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera todas las reglas de drag and drop para los grupos de elementos en
	 * la paleta
	 * @return - Codigo JS del evento drag and drop para grupos de elementos de
	 * la paleta
	 */
	public String generateEventScript() {
		String ans = "";
		for (int i = 0; i < palette.getToolgroups().size(); i++) {
			ans += events.get(i).generateEvent();
		}
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the palette
	 */
	public Palette getPalette() {
		return palette;
	}

	/**
	 * @param palette
	 *            the palette to set
	 */
	public void setPalette(Palette palette) {
		this.palette = palette;
	}

	/**
	 * @return the events
	 */
	public ArrayList<DragAndDropEventDefinition> getEvents() {
		return events;
	}

	/**
	 * @param events
	 *            the events to set
	 */
	public void setEvents(ArrayList<DragAndDropEventDefinition> events) {
		this.events = events;
	}
}
