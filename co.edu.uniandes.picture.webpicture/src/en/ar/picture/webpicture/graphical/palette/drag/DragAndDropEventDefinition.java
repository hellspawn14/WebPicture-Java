package en.ar.picture.webpicture.graphical.palette.drag;

import en.ar.picture.webpicture.graphical.palette.Toolgroup;

/**
 * Representa la definicion de un evento de drag and drop para un toolgroup
 * @author hellspawn
 */
public class DragAndDropEventDefinition {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Grupo para construir la regla
	 */
	private Toolgroup toolGroup;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una nueva definición para la regla de drag and drop
	 * @param toolGroup - Grupo para construir la regla
	 */
	public DragAndDropEventDefinition(Toolgroup toolGroup) {
		this.toolGroup = toolGroup;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Genera la regla para iniciar el clonado del elemento selecionado en el
	 * paper seleccionado
	 * @return - Fragmento de codigo
	 */
	public String generateEvent() {
		String ans = toolGroup.getPaperId()
				+ ".on('cell:pointerdown', function (cell, evt) {elementOnDragStart(cell, evt);});";
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the toolGroup
	 */
	public Toolgroup getToolGroup() {
		return toolGroup;
	}

	/**
	 * @param toolGroup the toolGroup to set
	 */
	public void setToolGroup(Toolgroup toolGroup) {
		this.toolGroup = toolGroup;
	}
}
