package en.ar.picture.webpicture.core;

import en.ar.picture.webpicture.core.build.metamodel.Metamodel;
import en.ar.picture.webpicture.graphical.palette.Palette;
import en.ar.picture.webpicture.graphical.palette.drag.events.DragAndDropEventsGenerator;
import en.ar.picture.webpicture.graphical.palette.drag.rules.DragAndDropElementRulesGenerator;

/**
 * Modelador de un editor
 * @author hellspawn
 */
public class Modeler {
	//------------------------------------------------------------------
	//Constantes 
	//------------------------------------------------------------------

	
	//------------------------------------------------------------------
	//Atributos 
	//------------------------------------------------------------------

	/**
	 * Paleta del editor 
	 */
	private Palette palette;
	
	/**
	 * Metamodelo completo 
	 */
	private Metamodel metamodel;

	/**
	 * Eventos de drag and drop 
	 */
	private DragAndDropEventsGenerator dragAndDropEvents; 
	
	/**
	 * Reglas de sustitucion de elementos por iconos 
	 */
	private DragAndDropElementRulesGenerator dragAndDropRules;
	
	
	
	
	
	//------------------------------------------------------------------
	//Constructores 
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Metodos  
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------
	
	/**
	 * @return the palette
	 */
	public Palette getPalette() {
		return palette;
	}

	/**
	 * @param palette the palette to set
	 */
	public void setPalette(Palette palette) {
		this.palette = palette;
	}

	/**
	 * @return the metamodel
	 */
	public Metamodel getMetamodel() {
		return metamodel;
	}

	/**
	 * @param metamodel the metamodel to set
	 */
	public void setMetamodel(Metamodel metamodel) {
		this.metamodel = metamodel;
	}

	/**
	 * @return the dragAndDropEvents
	 */
	public DragAndDropEventsGenerator getDragAndDropEvents() {
		return dragAndDropEvents;
	}

	/**
	 * @param dragAndDropEvents the dragAndDropEvents to set
	 */
	public void setDragAndDropEvents(DragAndDropEventsGenerator dragAndDropEvents) {
		this.dragAndDropEvents = dragAndDropEvents;
	}

	/**
	 * @return the dragAndDropRules
	 */
	public DragAndDropElementRulesGenerator getDragAndDropRules() {
		return dragAndDropRules;
	}

	/**
	 * @param dragAndDropRules the dragAndDropRules to set
	 */
	public void setDragAndDropRules(DragAndDropElementRulesGenerator dragAndDropRules) {
		this.dragAndDropRules = dragAndDropRules;
	} 
}
