package en.ar.picture.webpicture.graphical.elements;

import en.ar.picture.webpicture.graphical.style.Border;
import en.ar.picture.webpicture.graphical.style.Color;

/**
 * Representa la especificación de una elipse con imagen
 * @author hellspawn
 */
public class IconEllipse extends Figure
{
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------
	
	/**
	 * Crea una elipse con imagen para representar el elemento
	 * @param height - Alto del elemento
	 * @param width - Ancho del elemento
	 * @param type - Clase representada
	 * @param label - Etiqueta/Texto del elemento
	 * @param labelPlacement - Posición del texto
	 * @param phantom - Indicador de transparencia
	 * @param color - Color del elemento
	 * @param border - Borde del elemento
	 * @param iconPath - Ruta al icono
	 * @param iconWidth - Ancho del icono
	 * @param iconHeight - Alto del icono
	 * @param iconRefX - Posición en X con respecto al contenedor
	 * @param iconRefY - Posición en Y con respecto al contenedor
	 */
	public IconEllipse(int height, int width, String type, String label, String labelPlacement, boolean phantom, Color color, Border border, String iconPath, int iconWidth, int iconHeight, int iconRefX, int iconRefY) {
		super(height, width, type, label, labelPlacement, phantom, color, border, iconPath, iconWidth, iconHeight, iconRefX, iconRefY);
	}
	
	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	@Override
	public String generateScript() {
		String ans = "var " + this.getId() + " = new joint.shapes.img.ImageShape({ position: { x: 100, y: 100 }, size: { width: " + this.getWidth() + ", height: " + this.getHeight() + "},	attrs: { '.contenedor': { fill: '" + this.getColor().getHex() + "', magnet: true, type: '" + this.getType() + "', " + this.getBorder().getGenScript() + "},image: { 'xlink:href':'" + this.getIconPath() + "', 'ref-x': " + this.getIconRefX() + ", 'ref-y': " + this.getIconRefY() + ", 'width': " + this.getIconWidth() + ",'height': " + this.getIconWidth() + ",}, '.name': { text: '" + this.getLabel() + "','ref-y': " + this.getRefY() + ",},}});";		
		return ans;
	}
	
	public static void main(String args[]) {
		Color fondo = new Color(234, 14, 22, "?");
		Color bod = new Color(0, 234, 255, "T");
		Border B = new Border(bod, 2, "dashdotdot", "borde");
		IconEllipse I = new IconEllipse(500, 500, "A", "Prueba", "external", false, fondo, B, "https://cdn3.iconfinder.com/data/icons/business-101-1/512/Pie-2-512.png", 100, 100, 250, 250);
		System.out.println(I.generateScript());
	}

}
