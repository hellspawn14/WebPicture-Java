package en.ar.picture.webpicture.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Webpicture;

/**
 * Servlet para recibir las solicitudes de información creacion de diagramas 
 * @author hellspawn
 */
@SuppressWarnings("serial")
public class NewDiagramServlet extends HttpServlet{
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Relacion con la instancia de la clase principal
	 */
	private Webpicture webpicture;

	/**
	 * Flujo de datos para enviar la respuesta
	 */
	private PrintWriter out;
	
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
		System.out.println(editorId);
		Editor E = webpicture.getEditorById(editorId);
		response.setContentType("text/html");
		out = response.getWriter();
		//Enviar el contenido 
		
		out.close();

	}	
}
