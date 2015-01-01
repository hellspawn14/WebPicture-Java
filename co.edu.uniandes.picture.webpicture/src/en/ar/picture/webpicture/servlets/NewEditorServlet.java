package en.ar.picture.webpicture.servlets;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import en.ar.picture.webpicture.core.Webpicture;
import en.ar.picture.webpicture.core.files.FileManager;

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

	// ------------------------------------------------------------------
	// Inicialización
	// ------------------------------------------------------------------

	/**
	 * Inicializa el servlet
	 */
	public void init() throws ServletException {
		webpicture = Webpicture.getInstance();
		DiskFileItemFactory fileFactory = new DiskFileItemFactory();
		File filesDir = (File) getServletContext().getAttribute("FILES_DIR_FILE");
		fileFactory.setRepository(filesDir);
		this.uploader = new ServletFileUpload(fileFactory);
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Responde las llamadas desde el JSP
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getParameters(request);
		fileManager = webpicture.getFileManager(request.getServletContext().getRealPath("/"));
		dir = fileManager.makeDir();
		uploadFile(request, dir);
		webpicture.createEditor(dName, dDescription, dAuthor, dir);
	}

	/**
	 * Obtiene los parametros textuales del request
	 * @param request - Peticion http
	 */
	public void getParameters(HttpServletRequest request) {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
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
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Carga los archivos desde la pagina
	 * @param request - Petición HTTP
	 * @param dir - Directorio base del editor a crear
	 * @throws IOException
	 * @throws ServletException
	 */
	private void uploadFile(HttpServletRequest request, String dir) throws IOException, ServletException {
		String fileName = "";
		String fName = "";
		try {
			List<FileItem> fileItemsList = uploader.parseRequest(request);
			Iterator<FileItem> fileItemsIterator = fileItemsList.iterator();
			while (fileItemsIterator.hasNext()) {
				FileItem fileItem = fileItemsIterator.next();
				fileName = fileItem.getName();
				fName = "->" + fileName + "<-";

				if (fileName != null && fName.equals("-><-") == false
						&& fName.equals("->null<-") == false) {
					if (fileName.endsWith(ECORE)) {
						fileManager.uploadMetamodel(dir, fileItem);
					} else if (fileName.endsWith(PICTURE)) {
						fileManager
								.uploadGraphicalRepresentation(dir, fileItem);
					} else {
						fileManager.uploadImage(dir, fileItem);
					}
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
