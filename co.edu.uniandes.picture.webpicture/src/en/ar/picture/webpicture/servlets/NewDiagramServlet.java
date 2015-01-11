package en.ar.picture.webpicture.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Webpicture;
import en.ar.picture.webpicture.core.util.DateParser;

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
	 * Relacion con date parser
	 */
	private DateParser dateParser;

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
		dateParser = webpicture.getDateParser();
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
		response.setContentType("text/html");
		out = response.getWriter();
		String html = "<! DOCTYPE html> <meta charset='UTF-8'> <html lang='en'> <link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <meta name='description' content='Index web site for WebPicture online DSL model editor'><head> <title>WebPicture</title> <link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'> <!-- JQuery --> <script src='http://code.jquery.com/jquery-2.1.1.js'></script> <script src='http://code.jquery.com/ui/jquery-ui-git.js'></script> <!-- Bootstrap --> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <!-- Bootbox --> <script src='resources/bootbox/bootbox.js'></script><!-- Hojas de estilo --> <link rel='stylesheet' href='http://yui.yahooapis.com/pure//pure.css'> <link rel='stylesheet' href='http://yui.yahooapis.com/pure/0.5.0/pure-min.css'> <link rel='stylesheet' href='http://yui.yahooapis.com/pure//grids-responsive.css'> <link rel='stylesheet' href='resources/pure-css/css/layouts/marketing.css'> <link rel='stylesheet' href='http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'> <link rel='stylesheet' href='resources/pure-css/css/layouts/headers.css'></head> <body><div class='header'><div class='home-menu pure-menu pure-menu-open pure-menu-horizontal pure-menu-fixed' style='background-color:#181818'> <a class='pure-menu-heading' href='welcome'> <img src='resources/res/logo.png' class='pure-img' /></a></div></div> <div class='pure-g'> <!-- Informacion basica del editor -->"
				+ E.dataToNewDiagram(dateParser.dateToString(E.getCreated()))
				+ "<!-- Nuevo diagrama --> <div class='pure-u-1-2' style='text-align:center; height:100%; overflow-y: auto'> <div class='hero-titles'> <h3 class='hero-tagline' style='text-align:center; margin-top:50px'>Diagram information</h3>  </div> <form id='newDiagramForm' name='newDiagramForm' method='post' class='pure-form pure-form-aligned'> <fieldset> <div class='pure-control-group'><legend style='text-align:left; margin-left:10px'>Name</legend><input id='dName' name='dName' type='text' placeholder='Diagram name'></div> <div class='pure-control-group'><legend style='text-align:left; margin-left:10px'>Author</legend><input id='dAuthor' name='dAuthor' type='text' placeholder='Author'></div> <div class='pure-control-group'><legend style='text-align:left; margin-left:10px'>Description</legend><textArea id='dDescription' name='dDescription' type='text' placeholder='Description' class='pure-input-1'></textArea> </div><input id='editor' type='hidden' value='' name='editor' /> </fieldset> </form><button id='createDiagram' type='button' class='pure-button pure-button-primary' style='margin-top:10px' onclick='createDiagram()'>Create diagram</button></div></div> <div class='footer l-box is-center' style='background-color:#181818; margin-top:0px'><p>All rights reserved Uniandes 2014</p><p>Universidad de los Andes - Computer engineering department - Engineering Faculty</p></div> <script>function createDiagram(){var idEditor ="  + E.getId() + ";var dName = $('#dName').val().trim();var dAuthor = $('#dAuthor').val().trim();var dDescription = $('#dDescription').val().trim();if (dName == ' ' || dName == '' || dName == null || dDescription == ' ' || dDescription == '' || dDescription == null || dAuthor == ' ' || dAuthor == '' || dAuthor == null) {bootbox.alert('All fields are mandatory', function () {});}else{$('#editor').val(idEditor);var form = $('#newDiagramForm');form.attr('action','create_diagram');form.submit();}}</script></body></html>";
		out.println(html);
		out.close();
	}	
}
