package en.ar.picture.webpicture.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import en.ar.picture.webpicture.core.Diagram;
import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.Webpicture;
import en.ar.picture.webpicture.core.files.FileManager;
import en.ar.picture.webpicture.core.util.DateParser;

/**
 * Servlet para atender las solicitudes de creación de editores
 * @author hellspawn
 */
@SuppressWarnings("serial")
public class NewEditorServlet extends HttpServlet {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	/**
	 * Indicador archivo del metamodelo
	 */
	public final static String ECORE = ".ecore";

	/**
	 * Indicador archivo picture
	 */
	public final static String PICTURE = ".picture";

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Relacion con la instancia de la clase principal
	 */
	private Webpicture webpicture;

	/**
	 * Instancia del Filemanager
	 */
	private FileManager fileManager;
	
	/**
	 * Instancia de dateparser
	 */
	private DateParser dateParser;

	/**
	 * Relación con file upload
	 */
	private ServletFileUpload uploader = null;

	/**
	 * Campo con el nombre del editor
	 */
	private String dName;

	/**
	 * Campo con la descripcion del editor
	 */
	private String dDescription;

	/**
	 * Campo con el autor del editor
	 */
	private String dAuthor;

	/**
	 * Directorio del editor
	 */
	private String dir;
	
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
		DiskFileItemFactory fileFactory = new DiskFileItemFactory();
		File filesDir = (File) getServletContext().getAttribute("FILES_DIR_FILE");
		fileFactory.setRepository(filesDir);
		this.uploader = new ServletFileUpload(fileFactory);
		System.out.println("Init");
		
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Responde las llamadas desde el JSP
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		fileManager = webpicture.getFileManager(request.getServletContext().getRealPath("/"));
		dir = fileManager.makeDir();
		getParameters(request, dir);
		
		response.setContentType("text/html");
		out = response.getWriter();
		
		try
		{
			Editor E = webpicture.createEditor(dName, dDescription, dAuthor, dir);
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
					+ "function getSelectedActionForModel(action, model) { if (action == 'delete') {bootbox.dialog({message: 'Selected item will be deleted, would you like to continue?',buttons: {success: {label: 'Yes',className: 'btn-primary',callback: function () {$('#diagram_' + model).fadeOut(500, function () {$(this).remove();});$('#pad_' + model).fadeOut(500, function () {$(this).remove();});$('#editorModel').val(model);console.log($('#editorModel').val());form.attr('action', 'review_models_for_editor');form.on('submit', function (e) {$.ajax({url: form.attr('action'),type: form.attr('method'),data: form.serialize(),success: function (data) {},error: function (jXHR, textStatus, errorThrown) {alert(errorThrown);}});});form.submit();checkState();form.attr('action','editor_information');$('#editorModel').val(" + E.getId() + ");form.submit();}},danger: {label: 'No',className: 'btn-danger',callback: function () {}}}});}else if (action == 'newModel') {$('#editorModel').val(editor);console.log('new model');form.attr('action', 'new_diagram');form.on('submit', function (e) {$.ajax({url: $(this).attr('action'),type: $(this).attr('method'),data: $(this).serialize(),success: function (data) {},error: function (jXHR, textStatus, errorThrown) {alert(errorThrown);}});return true;});form.submit();}} "
					+ "function checkState() { "
					+ "var elements = $('#diagrams > div').length;var elements = $('#diagrams > div').length;"
					+ "var msg = \"<div class=\" + '\"' + \"hero-titles\" + '\"' + \">\" + \"<h3 class=\" + '\"' + \"marketing-header\" + '\"' + \" style=\" + '\"' + \"text-align:center; margin-top:50px\" + '\"' + \">\" + \"There's no available diagrams to display\" + \"</h3>\" + \"</div>\";"
					+ "if (elements == 3) {$('#diagrams').append(msg);}"
					+ "}"
					+ "</script>"
					+ "</body></html>";
			
			out.println(html);
		}
		catch(Exception e)
		{	
			String error = "<! DOCTYPE html><meta charset='UTF-8'><html lang='en'><link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'><meta name='viewport' content='width=device-width, initial-scale=1.0'><meta name='description' content='Index web site for WebPicture online DSL model editor'><head><title>WebPicture</title><link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'><script src='http://code.jquery.com/jquery-2.1.1.js'></script><script src='http://code.jquery.com/ui/jquery-ui-git.js'></script><script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script><link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'><script src='resources/bootbox/bootbox.js'></script><link rel='stylesheet' href='http://yui.yahooapis.com/pure//pure.css'><link rel='stylesheet' href='http://yui.yahooapis.com/pure/0.5.0/pure-min.css'><link rel='stylesheet' href='http://yui.yahooapis.com/pure//grids-responsive.css'><link rel='stylesheet' href='resources/pure-css/css/layouts/marketing.css'><link rel='stylesheet' href='http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'><link rel='stylesheet' href='resources/pure-css/css/layouts/headers.css'></head><body><div class='header'><div class='home-menu pure-menu pure-menu-open pure-menu-horizontal pure-menu-fixed' style='background-color:#181818'><a class='pure-menu-heading' href='welcome'><img src='resources/res/logo.png' class='pure-img' /></a></div></div><div class='pure-g'><div class='pure-u-1-2' style='text-align:center;border-right:1px solid #808080; height:100%; background-color: #F0F0F0 ;'><div class='hero-titles'><h3 class='hero-tagline' style='text-align:center; margin-top:50px'>Upps there has been an error </h3><img class='pure-img-responsive' src='resources/res/errorReport.png' style='width:auto;height:auto;text-align:center ' /></div></div><div class='pure-u-1-2' style='text-align:center; height:100%; overflow-y: auto'><div class='hero-titles'><h3 class='hero-tagline' style='text-align:center; margin-top:50px'>Error report</h3></div><div style='margin-top:30%'><h3 class='marketing-header'>" + e.getMessage() + "</h3><a href='new_editor' class='button-cta pure-button'>Return</a></div></div></div><div class='footer l-box is-center' style='background-color:#181818; margin-top:0px'><p>All rights reserved Uniandes 2014</p><p>Universidad de los Andes - Computer engineering department - Engineering Faculty</p></div></body></html>";
			out.println(error);
			out.close();
		}
		
	}

	/**
	 * Obtiene los parametros del request
	 * @param request - Peticion http
	 */
	private void getParameters(HttpServletRequest request, String dir) {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		String fileName = "";
		String fName = "";
		if (isMultipart) {
			try {
				List<FileItem> items = uploader.parseRequest(request);
				Iterator<FileItem> iterator = items.iterator();
				while (iterator.hasNext()) {
					FileItem item = (FileItem) iterator.next();
					if (item.isFormField()) {
						String name = item.getFieldName();
						String value = item.getString();
						if (name.equals("dName")) {
							dName = value;
						} else if (name.equals("dDescription")) {
							dDescription = value;
						} else if (name.equals("dAuthor")) {
							dAuthor = value;
						}
					}else{
						fileName = item.getName();
						fName = "->" + fileName + "<-";
						if (fileName != null && fName.equals("-><-") == false
								&& fName.equals("->null<-") == false) {
							if (fileName.endsWith(ECORE)) {
								fileManager.uploadMetamodel(dir, item);
							} else if (fileName.endsWith(PICTURE)) {
								fileManager
										.uploadGraphicalRepresentation(dir, item);
							} else {
								fileManager.uploadImage(dir, item);
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



}
