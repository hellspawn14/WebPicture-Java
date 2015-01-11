package en.ar.picture.webpicture.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import en.ar.picture.webpicture.core.Diagram;
import en.ar.picture.webpicture.core.Webpicture;

/**
 * Servlet encargado de responder a las solicitudes de guardado de diagrama
 * 
 * @author hellspawn
 */
@SuppressWarnings("serial")
public class SaveDiagramServlet extends HttpServlet {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

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
		int diagramId = Integer.parseInt(request.getParameter("diagram"));
		String cnt = request.getParameter("cnt");
		Diagram D = webpicture.getDiagramById(diagramId);
		webpicture.saveDiagram(D, cnt);
	}
}
