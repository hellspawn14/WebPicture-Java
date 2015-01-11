package en.ar.picture.webpicture.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import en.ar.picture.webpicture.core.Diagram;
import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Webpicture;
import en.ar.picture.webpicture.core.util.DateParser;

/**
 * Servlet para recibir las solicitudes de información de editores
 * @author hellspawn
 */
@SuppressWarnings("serial")
public class EditorInformationServlet extends HttpServlet {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Relacion con la instancia de la clase principal
	 */
	private Webpicture webpicture;

	/**
	 * Relacion con dateparser
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
		ArrayList<Diagram> diagrams = webpicture.getAllDiagramsForEditor(E);
		Diagram current = null;
		String strDiagrams = "";
		
		if (diagrams.isEmpty()) {
			strDiagrams = "<div class=" + '"' + "hero-titles" + '"' + ">" + "\n" + "<h3 class=" + '"' + "marketing-header" + '"' + " style=" + '"' + "text-align:center; margin-top:50px" + '"' + ">" + "There's no available diagrams to display" + "</h3>" + "\n" + "</div>";
			
		} else {
			for (int i = 0; i < diagrams.size(); i++) {
				current = diagrams.get(i);
				strDiagrams += current.toString(
						dateParser.dateToString(current.getCreated()),
						dateParser.dateToString(current.getLastModified()));
			}
		}
		response.setContentType("text/html");
		out = response.getWriter();
		String html = "<! DOCTYPE html><meta charset='UTF-8'><html lang='en'><link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <meta name='description' content='Index web site for WebPicture online DSL model editor'> <head><title>WebPicture</title><link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'><!-- JQuery --><script src='http://code.jquery.com/jquery-2.1.1.js'></script> <script src='http://code.jquery.com/ui/jquery-ui-git.js'></script><!-- Bootstrap --> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <!-- Bootbox --> <script src='resources/bootbox/bootbox.js'></script> <!-- Hojas de estilo --> <link rel='stylesheet' href='http://yui.yahooapis.com/pure//pure.css'> <link rel='stylesheet' href='http://yui.yahooapis.com/pure/0.5.0/pure-min.css'> <link rel='stylesheet' href='http://yui.yahooapis.com/pure//grids-responsive.css'> <link rel='stylesheet' href='resources/pure-css/css/layouts/marketing.css'> <link rel='stylesheet' href='http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'> <link rel='stylesheet' href='resources/pure-css/css/layouts/headers.css'></head> <body> <div class='header'> <div class='home-menu pure-menu pure-menu-open pure-menu-horizontal pure-menu-fixed' style='background-color:#181818'> <a class='pure-menu-heading' href='welcome'> <img src='resources/res/logo.png' class='pure-img' /> </a> </div> </div> <div class='pure-g'><!-- Informacion del editor -->"
				+ E.dataToString(dateParser.dateToString(E.getCreated()))
				+ "<div id='diagrams' class='pure-u-2-3' style='text-align:center; height:100%; overflow-y: auto'> <div class='hero-titles'><h3 class='hero-tagline' style='text-align:center; margin-top:50px'>Available diagrams</h3> </div> <form id='editorDetailForm' name='editorDetailForm' method='post' action='review_models_for_editor'><!-- Inicio plantilla de celda de tabla para un editor-->" 
				+ strDiagrams 
				+ "<!-- Fin plantilla--> <!-- Fin acceso a diagramas existentes --> </div>"
				+ "<input id='editorModel' type='hidden' value='' name='editor' /></form>"
				+ "</div><div class='footer l-box is-center' style='background-color:#181818; margin-top:0px'><p>All rights reserved Uniandes 2014</p><p>Universidad de los Andes - Computer engineering department - Engineering Faculty</p></div>"
				+ "<!-- Script de referencia para llamar la funcion de acuerdo al comando y al editor seleccionado-->"
				+ "<script> "
				+ "var form = $('#editorDetailForm'); "
				+ "function getSelectedActionForEditor(action, editor) {if (action == 'delete') {bootbox.dialog({message: 'Current editor will be deleted, would you like to continue?',buttons: {success: {label: 'Yes',className: 'btn-primary',callback: function () { $('#editorModel').val(editor);form.attr('action', 'available_editors');console.log('entro');form.on('submit', function (e) {$.ajax({url: form.attr('action'),type: form.attr('method'),data: form.serialize(),success: function (data) {},error: function (jXHR, textStatus, errorThrown) {alert(errorThrown);}});return false;});form.submit();window.location = 'all_editors';}},danger: {label: 'No',className: 'btn-danger',callback: function () {}}}});}else if (action == 'newModel') {$('#editorModel').val(editor);form.attr('action', 'new_diagram');form.on('submit', function (e) {$.ajax({url: $(this).attr('action'),type: $(this).attr('method'),data: $(this).serialize(),success: function (data) {},error: function (jXHR, textStatus, errorThrown) {alert(errorThrown);}});return true;});form.submit();}}"
				+ "function getSelectedActionForModel(action, model) { if (action == 'delete') {bootbox.dialog({message: 'Selected item will be deleted, would you like to continue?',buttons: {success: {label: 'Yes',className: 'btn-primary',callback: function () {$('#diagram_' + model).fadeOut(500, function () {$(this).remove();});$('#pad_' + model).fadeOut(500, function () {$(this).remove();});$('#editorModel').val(model);console.log($('#editorModel').val());form.attr('action', 'review_models_for_editor');form.on('submit', function (e) {$.ajax({url: form.attr('action'),type: form.attr('method'),data: form.serialize(),success: function (data) {},error: function (jXHR, textStatus, errorThrown) {alert(errorThrown);}});});form.submit();checkState();form.attr('action','editor_information');$('#editorModel').val(" + E.getId() + ");form.submit();}},danger: {label: 'No',className: 'btn-danger',callback: function () {}}}});}else if (action == 'editDiagram') {$('#editorModel').val(model);console.log('new model');form.attr('action', 'get_diagram');form.on('submit', function (e) {$.ajax({url: $(this).attr('action'),type: $(this).attr('method'),data: $(this).serialize(),success: function (data) {},error: function (jXHR, textStatus, errorThrown) {alert(errorThrown);}});return true;});form.submit();}} "
				+ "function checkState() { "
				+ "var elements = $('#diagrams > div').length;var elements = $('#diagrams > div').length;"
				+ "var msg = \"<div class=\" + '\"' + \"hero-titles\" + '\"' + \">\" + \"<h3 class=\" + '\"' + \"marketing-header\" + '\"' + \" style=\" + '\"' + \"text-align:center; margin-top:50px\" + '\"' + \">\" + \"There's no available diagrams to display\" + \"</h3>\" + \"</div>\";"
				+ "if (elements == 3) {$('#diagrams').append(msg);}"
				+ "}"
				+ "</script>"
				+ "</body></html>";
		out.println(html);
		out.close();
	}	
}
