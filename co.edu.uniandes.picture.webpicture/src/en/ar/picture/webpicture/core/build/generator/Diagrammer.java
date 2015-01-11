package en.ar.picture.webpicture.core.build.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import en.ar.picture.webpicture.core.Diagram;

/**
 * Genera el codigo JS con la información del editor y el diagrama Utiliza el
 * JSON obtenido del modelador para restaurar el diagrama
 * @author hellspawn
 */
public class Diagrammer {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Diagrama creado
	 */
	private Diagram diagram;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo diagramador
	 * @param diagram - Diagrama para generar el archivo JS
	 */
	public Diagrammer(Diagram diagram) {
		this.diagram = diagram;
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Crea el archivo JS con la información del diagrama
	 * @param strCreationDate - Fecha de creación en String
	 * @param strLastModified - Fecha de modificación en String
	 * @return - Ruta del archivo dia.js
	 * @throws IOException - En el caso de que se produzca un error al escribir el archivo
	 */
	public void buildDiagramScript(String strCreationDate, String strLastModified) throws IOException {
		String lastModified = "var lastModified = " + '"' + strLastModified + '"' + ";";
		String diagramId = "var diagramId = " + diagram.getId() + ";";
		String diagramInformation = "function getDiagraminformation() { var diagramName = "
				+ '"'
				+ diagram.getName()
				+ '"'
				+ "; var diagramDescription = "
				+ '"'
				+ diagram.getDescription()
				+ '"'
				+ "; var created = "
				+ '"'
				+ strCreationDate
				+ '"'
				+ "; var author = "
				+ '"'
				+ diagram.getAuthor()
				+ '"'
				+ "; var inf = '<div class=\"pure-u-5-6\" style=\"text-align:left\">' + '<i class=\"fa fa-bookmark-o\" style=\"margin-left:10px\"></i> Diagram name: ' + diagramName + '<br>' + '<i class=\"fa fa-user\" style=\"margin-left:10px\"></i> Author: ' + author + '<br>' + '<i class=\"fa fa-ellipsis-h\" style=\"margin-left:10px\"></i> Description: ' + diagramDescription + '<br>' + '<i class=\"fa fa-calendar\" style=\"margin-left:10px\"></i> Created: ' + created + '<br>' + '<i class=\"fa fa-calendar\" style=\"margin-left:10px\"></i> Last modified: ' + lastModified + '<br>' + '</div>'; bootbox.dialog({ title: 'Diagram information', message: inf });}";
		String estadoActual = "var estadoActual = " +  "'" + getDiagramState() + "'" + ";";
		String diagramInfo = lastModified + "\n" + diagramId + "\n"
				+ diagramInformation + "\n" + estadoActual;
		File dia = new File(diagram.getPath() + "/dia.js");
		dia.createNewFile();
		FileWriter fw = new FileWriter(dia.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(diagramInfo);
		bw.close();
	}

	/**
	 * Retorna el estado actual de un diagrama a partir del archivo dia.txt
	 * @return - Contenido del archivo dia.txt
	 */
	public String getDiagramState() {
		String ans = "";
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(diagram.getPath() + "/dia.txt");
			ans = IOUtils.toString(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the diagram
	 */
	public Diagram getDiagram() {
		return diagram;
	}

	/**
	 * @param diagram the diagram to set
	 */
	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;
	}
}
