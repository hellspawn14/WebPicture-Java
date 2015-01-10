package en.ar.picture.webpicture.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import en.ar.picture.webpicture.core.Editor;
import en.ar.picture.webpicture.core.util.DateParser;


/**
 * Data access object para las operaciones del objeto Editor
 * @author hellspawn
 */
public class EditorDAO 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------

	/**
	 * Datos de la conexion con el servidor de base de datos 
	 */
	private final static String SERVER_ADDRESS = "jdbc:mysql://127.0.0.1:3306/?user=root";

	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Conexion con la base de datos 
	 */
	private Connection DBConnection;
	
	/**
	 * Componente para manejo de fechas
	 */
	private DateParser dateParser;


	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea un nuevo acceso para las operaciones del objeto Editor
	 * @throws ClassNotFoundException - En el caso de que no encuentre el driver 
	 * @throws SQLException - En el caso de encontrar errores a nivel de SQL 
	 */
	public EditorDAO(DateParser dateParser) 
	{
		this.dateParser = dateParser;
	}

	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Inicia la conexion con la base de datos 
	 * @throws ClassNotFoundException - En el caso de que el driver no exista
	 * @throws SQLException - En el caso de que existan errores a nivel de SQL 
	 */
	public void connectToDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		DBConnection = DriverManager.getConnection(SERVER_ADDRESS);
	}

	/**
	 * Inserta un editor en el registro de la tabla WebPicture.Editors
	 * @param E - Editor a insertar
	 */
	public void insertEditor(Editor E)
	{
		String query = "INSERT INTO `WebPicture`.`Editors` (`Name`, `Description`, `Author`, `Path`, `Created`) VALUES ('" + E.getName() + "', '" + E.getDescription() + "', '" + E.getAuthor() + "', '" + E.getPath() + "', '" + dateParser.dateToString(E.getCreated()) + "');";
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			S = DBConnection.createStatement();
			S.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
	}
	
	/**
	 * Actualiza el registro de un editor en la tabla 
	 * @param E - Editor a modificar
	 */
	public void updateEditor(Editor E)
	{
		String query = "UPDATE `WebPicture`.`Editors` SET `Name`='" + E.getName() + "', `Description`='" + E.getDescription() + "', `Path`='" + E.getPath() + "' WHERE `idEditor`='" + E.getId() + "';";
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			S = DBConnection.createStatement();
			S.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
	}
	
	/**
	 * Borra un editor dado  
	 * @param E - Editor a borrar
	 */
	public void deleteEditor(Editor E)
	{	
		Statement S = null;
		ResultSet RS = null;
		try
		{
			//1. Borrar los diagramas del editor
			deleteDiagramsFromEditor(E);
			//2. Borrar el editor
			String query = "DELETE FROM `WebPicture`.`Editors` WHERE `idEditor`='" + E.getId() + "';";
			connectToDB();
			S = DBConnection.createStatement();
			S.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
	}
	
	/**
	 * Borra todos los diagramas de un editor dado
	 * @param E - Editor a eliminar 
	 */
	public void deleteDiagramsFromEditor(Editor E)
	{
		String query = "DELETE FROM `WebPicture`.`Diagrams` WHERE `idEditor`='" + E.getId() + "';";
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			S = DBConnection.createStatement();
			S.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}		
	}
	
	/**
	 * Retorna la información del editor con el identificador dado 
	 * @param nId - Identificador del editor
	 * @return Editor o null
	 */
	public Editor getEditorById(int nId)
	{
		Editor E = null;
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Editors WHERE WebPicture.Editors.idEditor = " + nId + ";";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Verificar que el RS tenga información 
			if (!RS.next()) 
			{
				//Retorna null no hay información de un diagrama con identificador idDiagram
				return E;
			} 
			else 
			{
				//Solo hay una entrada en el RS 
				int id = RS.getInt("idEditor");
				String name = RS.getString("Name");
				String description = RS.getString("Description");
				String author = RS.getString("Author");
				String path = RS.getString("Path");
				Date created = dateParser.stringToDate(RS.getString("Created"));
				E = new Editor(id, name, description, author, path, created);
				return E;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
		return null;

	}
	

	/**
	 * Retorna la información del editores(s) creado por un autor dado 
	 * @param nAuthor - Autor del diagrama
	 * @return lista con los editores encontrados
	 */
	public ArrayList <Editor> getEditorByAuthor(String nAuthor)
	{
		ArrayList <Editor> ans = new ArrayList <Editor>();
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Editors WHERE WebPicture.Editors.Author = '" + nAuthor + "';";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Atributos del editor
			int id = 0;
			String name = "TO - SET";
			String description = "TO - SET";
			String author = "TO - SET";
			String path = "TO - SET";
			Date created = null;
			Editor E = null;		
			
			//Hay multiples entradas en el RS
			while (RS.next()) 
			{
				id = RS.getInt("idEditor");
				name = RS.getString("Name");
				description = RS.getString("Description");
				author = RS.getString("Author");
				path = RS.getString("Path");
				created = dateParser.stringToDate(RS.getString("Created")); 
				E = new Editor(id, name, description, author, path, created);
				ans.add(E);
			}
			return ans;			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
		return null;
	}
	
	/**
	 * Retorna la información del editor(s) con un nombre dado
	 * @param nName - Nombre del editor
	 * @return lista con los editores encontrados
	 */
	public ArrayList <Editor> getEditorByName (String nName)
	{
		ArrayList <Editor> ans = new ArrayList <Editor>();
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Editors WHERE WebPicture.Editors.Name = '" + nName + "';";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Atributos del editor
			int id = 0;
			String name = "TO - SET";
			String description = "TO - SET";
			String author = "TO - SET";
			String path = "TO - SET";
			Date created = null;
			Editor E = null;		
			
			//Hay multiples entradas en el RS
			while (RS.next()) 
			{
				id = RS.getInt("idEditor");
				name = RS.getString("Name");
				description = RS.getString("Description");
				author = RS.getString("Author");
				path = RS.getString("Path");
				created = dateParser.stringToDate(RS.getString("Created"));
				E = new Editor(id, name, description, author, path, created);
				ans.add(E);
			}
			return ans;			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
		return null;
	}
	
	/**
	 * Retorna una lista con todos los editores disponibles 
	 * @return - Lista con todos los editores disponibles
	 */
	public ArrayList <Editor> getAllEditors()
	{
		ArrayList <Editor> ans = new ArrayList <Editor>();
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Editors;";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Atributos del editor
			int id = 0;
			String name = "TO - SET";
			String description = "TO - SET";
			String author = "TO - SET";
			String path = "TO - SET";
			Date created = null;
			Editor E = null;		
			
			//Hay multiples entradas en el RS
			while (RS.next()) 
			{
				id = RS.getInt("idEditor");
				name = RS.getString("Name");
				description = RS.getString("Description");
				author = RS.getString("Author");
				path = RS.getString("Path");
				created = dateParser.stringToDate(RS.getString("Created"));
				E = new Editor(id, name, description, author, path, created);
				ans.add(E);
			}
			return ans;			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
		return null;
	}
	
	public Editor getLastInsertedEditor()
	{
		Editor E = null;
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "select * from WebPicture.Editors where idEditor = (select MAX(idEditor) from WebPicture.Editors);";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Verificar que el RS tenga información 
			if (!RS.next()) 
			{
				//Retorna null no hay información de un diagrama con identificador idDiagram
				return E;
			} 
			else 
			{
				//Solo hay una entrada en el RS 
				int id = RS.getInt("idEditor");
				String name = RS.getString("Name");
				String description = RS.getString("Description");
				String author = RS.getString("Author");
				String path = RS.getString("Path");
				Date created = dateParser.stringToDate(RS.getString("Created"));
				E = new Editor(id, name, description, author, path, created);
				return E;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			close(S, RS, DBConnection);
		}
		return null;
	}

	
	/**
	 * Cierra las conexiones con la base de datos
	 * @param S - Statement
	 * @param RS - ResultSet 
	 * @param C - Connection
	 */
	private void close(Statement S, ResultSet RS, Connection C) 
	{
		try 
		{
			if (S != null)
			{
				S.close();
			}
			if (RS != null)
			{
				RS.close();
			}
			if (C != null)
			{
				C.close();
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------

}
