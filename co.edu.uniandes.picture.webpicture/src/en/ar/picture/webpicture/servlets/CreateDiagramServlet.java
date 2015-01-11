package en.ar.picture.webpicture.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
 * 
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
		Editor E = webpicture.getEditorById(editorId);
		String dName = request.getParameter("dName");
		String dAuthor = request.getParameter("dAuthor");
		String dDescription = request.getParameter("dDescription");
		Diagram toCreate = new Diagram(0, dName, dDescription, dAuthor, "", new Date(), new Date());
		toCreate = webpicture.createDiagram(toCreate, E);
		String diagramScripts = webpicture.restoreDiagram(toCreate);
		response.setContentType("text/html");
		out = response.getWriter();
		
		String html = "<! DOCTYPE html><meta charset='UTF-8'><html lang='en'><link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'><meta name='viewport' content='width=device-width, initial-scale=1.0'><meta name='description' content='Index web site for WebPicture online DSL model editor'> <head><title>WebPicture</title><link rel='icon' href='resources/res/siteIcon.png' type='image/x-icon'><script src='http://code.jquery.com/jquery-2.1.1.js'></script> <script src='http://code.jquery.com/ui/jquery-ui-git.js'></script><script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script><link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'><script src='resources/extras/bootbox/bootbox.js'></script> <link rel='stylesheet' href='http://yui.yahooapis.com/pure//pure.css'><link rel='stylesheet' href='http://yui.yahooapis.com/pure/0.5.0/pure-min.css'><link rel='stylesheet' href='http://yui.yahooapis.com/pure//grids-responsive.css'><link rel='stylesheet' href='resources/pure-css/css/layouts/marketing.css'><link rel='stylesheet' href='resources/pure-css/css/layouts/headers.css'><link rel='stylesheet' href='http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'><script src='resources/extras/canvas2image.js'></script><script src='resources/extras/html2canvas.js'></script><script src='resources/extras/FileSaver.js'></script><script src='resources/extras/Blob.js'></script><script src='http://canvg.googlecode.com/svn/trunk/canvg.js'></script><script src='resources/extras/canvas-toBlob.js'></script><script type='text/javascript' src='resources/extras/tipped/js/tipped/tipped.js'></script><link rel='stylesheet' href='resources/extras/tipped/css/tipped/tipped.css' /><script src='resources/js/lib/lodash.js'></script> <script src='resources/js/lib/backbone.js'></script><script src='resources/js/src/core.js'></script><script src='resources/js/src/vectorizer.js'></script><script src='resources/js/src/geometry.js'></script> <script src='resources/js/src/joint.dia.graph.js'></script><script src='resources/js/src/joint.dia.cell.js'></script> <script src='resources/js/src/joint.dia.element.js'></script><script src='resources/js/src/joint.dia.link.js'></script> <script src='resources/js/src/joint.dia.paper.js'></script><script src='resources/js/plugins/joint.shapes.basic.js'></script> <script src='resources/js/plugins/routers/joint.routers.orthogonal.js'></script><script src='resources/js/plugins/routers/joint.routers.manhattan.js'></script> <script src='resources/js/plugins/routers/joint.routers.metro.js'></script><script src='resources/js/plugins/connectors/joint.connectors.normal.js'></script> <script src='resources/js/plugins/connectors/joint.connectors.rounded.js'></script><script src='resources/js/plugins/connectors/joint.connectors.smooth.js'></script><script src='resources/js/dist/joint.shapes.org.js'></script><script src='resources/js/dist/joint.shapes.img.imageShape.js'></script><link rel='stylesheet' href='resources/js/joint.css'><script src='resources/extras/toolbar/jquery.toolbar.js'></script><link rel='stylesheet' href='resources/extras/toolbar/jquery.toolbars.css' /><link rel='stylesheet' href='resources/extras/toolbar/bootstrap.icons.css' /><link rel='stylesheet' href='resources/extras/rangeslider-0.3.7/rangeslider.css'><script src='resources/extras/rangeslider-0.3.7/rangeslider.js'></script><script src='resources/basic-js/range.js'></script></head><body><div class='header'><div class='home-menu pure-menu pure-menu-open pure-menu-horizontal pure-menu-fixed' style='background-color:#181818; position:fixed'><a class='pure-menu-heading' href='welcome'><img src='resources/res/logo.png' class='pure-img' /></a></div></div> <div class='pure-g'><div class='pure-u-4-24' style='text-align:center;border-right:1px solid #181818; height:100%; background-color:#181818; overflow-y: auto'><div class='hero-titles' style='background-color:#181818;margin-bottom:0'><h4 id='paletteName' class='marketing-header-canvas' style='text-align:center;color:white;'>Palette</h4></div><div id='tools' style='background-color:#181818; overflow-y: auto;'></div><div class='paper-drag'></div></div><div id='workArea' class='pure-u-20-24' style='text-align:center; height:100%; overflow-y: auto; overflow-x: auto;'><div class='pure-g' style='width:inherit;position:fixed;margin-top: 2em; text-align:center; overflow-y: auto; overflow-x: auto;'><div class='pure-u-1-12'><button id='homeBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080; ' onclick='goHomeSave()'><i class='fa fa-home'></i></button></div><div class='pure-u-1-12'><button id='saveBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='saveModel()'><i class='fa fa-floppy-o'></i></button></div><div class='pure-u-1-12'><button id='exportBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='exportCanvas()'><i class='fa fa-download'></i></button></div><div class='pure-u-1-12'><button id='clearBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='clearCanvas()'><i class='fa fa-trash-o'></i></button></div><div class='pure-u-1-12'><button id='unDoBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='unDoLastChange()'><i class='fa fa-reply'></i></button></div><div class='pure-u-1-12'><button id='reDoBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='reDoLastChange()'><i class='fa fa-share'></i> </button></div><div class='pure-u-1-12'><button id='zoomInBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='zoomIn()'><i class='fa fa-search-plus'></i></button></div><div class='pure-u-1-12'><button id='zoomOutBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='zoomOut()'><i class='fa fa-search-minus'></i></button></div><div class='pure-u-1-12'><button id='validateBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='validateModel()'><i class='fa fa-check-circle'></i></button></div><div class='pure-u-1-12'><button id='gridsBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='gridsProperties()'><i class='fa fa-th'></i></button></div><div class='pure-u-1-12'><button id='informationBtn' type='button' class='pure-button' style='width:100%;border-right:2px solid #808080' onclick='getDiagraminformation()'><i class='fa fa-info'></i> </button></div><div class='pure-u-1-12'><button id='helpBtn' type='button' class='pure-button' style='width:100%' onclick='help()'><i class='fa fa-question'></i></button></div></div><h3 style='visibility: hidden'>I bet you cant see me</h3><div id='modelCanvas' style='height:100%;width:100%; overflow-y: auto; overflow-x: auto;background-image:url(resources/res/tiny_grid.png);background-repeat:repeat;'></div></div></div><div id='user-options-small' class='toolbar-icons' style='display: none;'><a id='editElementBtn' href='' onclick='$('#hdnClickedIcon').val('edit');'><i class='icon-edit'></i></a><a id='toTopElement' href='' onclick='$('#hdnClickedIcon').val('toTop');'><i class='icon-arrow-up'></i></a><a id='toBackElement' href='' onclick='$('#hdnClickedIcon').val('toBack');'><i class='icon-arrow-down'></i></a><a id='reSizeElementBtn' href='' onclick='$('#hdnClickedIcon').val('change');'><i class='icon-list-alt'></i></a><a id='deleteElementBtn' href='' onclick='$('#hdnClickedIcon').val('delete');'><i class='icon-remove'></i></a><input id='hdnClickedIcon' type='hidden' value='none' /></div>"
				+ "<form id='save_diagram' name='save_diagram' action='save_diagram' method='post'>"
				+ "<input id='diagram' type='hidden' value='' name='diagram' />"
				+ "<input id='cnt' type='hidden' value='' name='cnt' />"
				+ "</form>"
				+ "</body>" + diagramScripts + "</html>";
		out.println(html);
		out.close();
	}

}
