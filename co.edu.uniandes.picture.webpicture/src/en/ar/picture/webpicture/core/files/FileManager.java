package en.ar.picture.webpicture.core.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.fileupload.FileItem;

/**
 * Componente responsable de hacer las operaciones de manejo de archivos fisicos
 * @author hellspawn
 */
public class FileManager 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------

	/**
	 * Directorio base
	 */
	private String BASE_DIRECTORY = "/Editors";
	
	/**
	 * Directorio de imagenes
	 */
	private String IMG_DIRECTORY = "Images";
	
	/**
	 * Directorio de scripts 
	 */
	private String SCR_DIRECTORY = "Scripts";
	
	/**
	 * Directorio de metainformación 
	 */
	private String META_DIRECTORY = "Meta";
	
	/**
	 * Nombre del archivo de metainformacion 
	 */
	private String META_INF = "meta.txt";
	
	/**
	 * Directorio con el metamodelo 
	 */
	private String META_MODEL_DIRECTORY = "Model";
	
	/**
	 * Directorio con el archivo picture 
	 */
	private String PICTURE_LANG_DIRECTORY = "Picture";
	
	/**
	 * Directorio para diagramas
	 */
	private String DIAGRAM_DIR = "Diagrams";
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Directorio base en el servidor 
	 */
	private String basePath; 
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------
	
	/**
	 * Crea un nuevo manejador de archivos con un contexto dado 
	 * @param context
	 */
	public FileManager(String rootPath)
	{
		basePath = rootPath + BASE_DIRECTORY;
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Genera un directorio aleatorio para crear el directorio del editor
	 * @return - Directorio aleatorio para crear el editor
	 */
	public synchronized String getRandomPath()
	{
		UUID rand = UUID.randomUUID();
		String path = basePath + "/" + rand.toString();
		File F = new File(path);
		if (F.exists())
		{
			return getRandomPath();
		}
		else
		{
			return rand.toString(); 
		}
	}
	
	/**
	 * Crea el directorio base para el editor junto con los subdirectorios para utilizar 
	 * @return directorio base del editor -> ./WebContent/Editors/db9db42a-3b99-471f-ba97-e6a384f0e5bf
	 */
	public synchronized String makeDir()
	{
		String folder = this.getRandomPath();
		String path = basePath + "/" + folder; 
		
		//Crea el directorio principal del editor
		File F = new File(path);
		F.mkdir();
		String ans = F.getAbsolutePath();
		
		//Crea los subdirectorios del editor
		//Crea el directorio de imagenes 
		path = basePath + "/" + folder + "/" + IMG_DIRECTORY;  
		F = new File(path);
		F.mkdir();
		
		//Crea el directorio de scripts
		path = basePath + "/" + folder + "/" + SCR_DIRECTORY; 
		F = new File(path);
		F.mkdir();
		
		//Crea el directorio de metadata
		path = basePath + "/" + folder + "/" + META_DIRECTORY; 
		F = new File(path);
		F.mkdir();
		
		//Crea el directorio del metamodelo 
		path = basePath + "/" + folder + "/" + META_MODEL_DIRECTORY; 
		F = new File(path);
		F.mkdir();
		
		//Crea el directorio del archivo picture 
		path = basePath + "/" + folder + "/" + PICTURE_LANG_DIRECTORY; 
		F = new File(path);
		F.mkdir();
		
		//Crea el directorio de los diagramas 
		path = basePath + "/" + folder + "/" + DIAGRAM_DIR; 
		F = new File(path);
		F.mkdir();
		
		path = basePath + "/" + folder; 
		return ans;
	}
	
	/**
	 * Crea el archivo de metainformación del editor creado 
	 * @param path - Directorio del editor 
	 * @param name - Nombre del editor 
	 * @param author - Author del editor
	 * @param description - Descripción del editor
	 * @param date - Fecha de creación
	 */
	public synchronized void makeMeta(String path, String name, String author, String description,  Date date)
	{
		PrintWriter writer;
		try 
		{
			writer = new PrintWriter(path + "/" + META_DIRECTORY + "/" + META_INF, "UTF-8");
			writer.println("Name: " + name);
			writer.println("Author: " + author);
			writer.println("Name: " + name);
			writer.println("Description: " + description);
			writer.println("Created on: " + date.toString());
			writer.close();
			
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Borra el contenido de un folder existente en el direcctorio de archivos del servidor
	 * @param path - Es la ruta del directorio 
	 */
	public synchronized void deleteDir(String path)
	{
		File F = new File(path);
		if (F.exists())
		{
			File[] files = F.listFiles();
			for(File f: files) 
			{
	            if(f.isDirectory()) 
	            {
	            	deleteDir(f.getAbsolutePath());
	            }
	            else 
	            {
	                f.delete();
	            }
	        }
			F.delete();
		}
	}
	
	/**
	 * Crea el archivo JavaScript del editor
	 * @param path - Es el directorio del editor
	 * @param script - Es el contenido del script 
	 */
	public synchronized void createScript(String path, String script)
	{
		PrintWriter writer;
		try 
		{
			writer = new PrintWriter(path + "/" + SCR_DIRECTORY + "/" + "editor.js", "UTF-8");
			writer.println(script);
			writer.close();
			
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Guarda un modelo en el servidor 
	 * @param path - Directorio base del editor
	 * @param model - Modelo generado 
	 * @return Directorio del modelo guardado 
	 */
	public synchronized String saveDiagram(String path, FileItem model)
	{
		String modelDir = this.getRandomPath();
		File F = new File(path + "/" + DIAGRAM_DIR + "/" + modelDir + "/" + model.getName());
		try 
		{
			model.write(F);
			return F.getAbsolutePath();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return F.getAbsolutePath();
	}
	
	/**
	 * Carga una imagen desde el servlet hasta el directorio en el servidor
	 * @param path
	 * @param img
	 */
	public synchronized void uploadImage(String path, FileItem img)
	{
		File F = new File(path + "/" + IMG_DIRECTORY + "/" + img.getName());
		if (!F.isDirectory())
		{
			try 
			{
				img.write(F);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * Carga el archivo picture al directorio correspondiente 
	 * @param path - Directorio del editor 
	 * @param pic - Archivo picture
	 */
	public synchronized void uploadGraphicalRepresentation(String path, FileItem pic)
	{
		File F = new File(path + "/" + PICTURE_LANG_DIRECTORY + "/" + pic.getName());
		try 
		{
			pic.write(F);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Carga el archivo picture al directorio correspondiente 
	 * @param path - Directorio del editor 
	 * @param pic - Archivo ecore
	 */
	public synchronized void uploadMetamodel(String path, FileItem pic)
	{
		File F = new File(path + "/" + META_MODEL_DIRECTORY + "/" + pic.getName());
		try 
		{
			pic.write(F);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	/**
	 * @return the basePath
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * @param basePath the basePath to set
	 */
	public void setBasePath(String basePath) {
		this.basePath = basePath + BASE_DIRECTORY;
	}
	
	
}
