package en.ar.picture.webpicture.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Webpicture;

/**
 * Servlet para atender las solicitudes de control de editores
 * @author hellspawn
 */
@SuppressWarnings("serial")
public class ReviewEditorsServlet extends HttpServlet {
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
		System.out.println("Eliminar");
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Responde las llamadas desde el JSP
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int editorId = Integer.parseInt(request.getParameter("editor"));
		Editor toDelete = webpicture.getEditorById(editorId);
		if (toDelete != null) {
			webpicture.deleteEditor(toDelete);
		}
	}
}
