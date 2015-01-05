package en.ar.picture.webpicture.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import en.ar.picture.webpicture.core.Diagram;
import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Webpicture;

/**
 * Servlet para recibir las solicitudes de creacion de diagramas
 * @author hellspawn 
 */
@SuppressWarnings("serial")
public class CreateDiagramServlet extends HttpServlet {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Relacion con la instancia de la clase principal
	 */
	private Webpicture webpicture;

	
	// ------------------------------------------------------------------
	// Inicialización 
	// ------------------------------------------------------------------

	/**
	 * Inicializa el servlet
	 */
	public void init() throws ServletException {
		webpicture = Webpicture.getInstance();
	}
	
	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Responde las llamadas desde el JSP
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int editorId = Integer.parseInt(request.getParameter("editor"));
		Editor E = webpicture.getEditorById(editorId);
		String dName = request.getParameter("dName");
		String dAuthor = request.getParameter("dAuthor");
		String dDescription = request.getParameter("dDescription");
		Diagram toCreate = new Diagram(0, dName, dDescription, dAuthor, "", new Date(), new Date());
		webpicture.createDiagram(toCreate, E);
		//Redireccionar a la pagina del editor para el diagrama
	}


}
