package co.edu.uniandes.picture.webpicture.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import co.edu.uniandes.picture.webpicture.core.Diagram;
import co.edu.uniandes.picture.webpicture.core.Editor;
import co.edu.uniandes.picture.webpicture.core.util.DateParser;

/**
 * Data access object para las operaciones del objeto Diagram
 * @author hellspawn
 */
public class DiagramDAO 
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
	 * Crea un nuevo acceso para las operaciones del objeto Diagram
	 * @throws ClassNotFoundException - En el caso de que no encuentre el driver 
	 * @throws SQLException - En el caso de encontrar errores a nivel de SQL 
	 */
	public DiagramDAO(DateParser dateParser) 
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
	 * Inserta un nuevo registro en la tabla de WebPicture.Diagrams
	 * @param D - Diagrama a registrar
	 */
	public void insertDiagram(Diagram D, Editor E)
	{
		String query = "INSERT INTO `WebPicture`.`Diagrams` (`idEditor`, `Name`, `Description`, `Author`, `Path`, `Created`, `LastModified`) VALUES ('" + E.getId() + "', '" + D.getName() +  "', '" + D.getDescription() + "', '" + D.getAuthor() + "', '" + D.getPath() + "', '" + dateParser.dateToString(D.getCreated())  + "', '" + dateParser.dateToString(D.getLastModified()) + "');";
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
	 * Actualiza el registro de un diagrama en la tabla 
	 * @param D - Diagrama a actualizar 
	 */
	public void updateDiagram(Diagram D)
	{
		String query = "UPDATE `WebPicture`.`Diagrams` SET `Name`='" + D.getName() + "', `Description`='" + D.getDescription() + "', `Author`='" + D.getAuthor() + "', `Path`='" + D.getPath() + "', `LastModified`='" + dateParser.dateToString(D.getLastModified()) + "' WHERE `idDiagram` = " + D.getId() + ";";
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
	 * Elimina un diagrama del registro de la base de datos
	 * @param D - Diagrama a eliminar
	 */
	public void deleteDiagram(Diagram D)
	{
		String query = "DELETE FROM `WebPicture`.`Diagrams` WHERE `idDiagram`='" + D.getId() + "';";
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
	 * Retorna la información del diagrama con el identificador dado 
	 * @param diagramId - Identificador del diagrama 
	 * @return Diagrama si lo encontro o null de lo contrario 
	 */
	public Diagram getDiagramById(int idDiagram)
	{
		Diagram D = null;
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Diagrams WHERE WebPicture.Diagrams.idDiagram = " + idDiagram + ";";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Verificar que el RS tenga información 
			if (!RS.next()) 
			{
				//Retorna null no hay información de un diagrama con identificador idDiagram
				return D;
			} 
			else 
			{
				//Solo hay una entrada en el RS 
				int id = RS.getInt("idDiagram");
				String name = RS.getString("Name");
				String description = RS.getString("Description");
				String author = RS.getString("Author");
				String path = RS.getString("Path");
				Date created = dateParser.stringToDate(RS.getString("Created"));
				Date modified = dateParser.stringToDate(RS.getString("LastModified")); 
				D = new Diagram(id, name, description, author, path, created, modified);
				return D;
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
	 * Retorna la información del diagrama(s) creado por un autor dado 
	 * @param diagramAuthor - Autor del diagrama
	 * @return lista con los diagramas encontrados
	 */
	public ArrayList <Diagram> getDiagramByAuthor(String diagramAuthor)
	{
		ArrayList <Diagram> ans = new ArrayList <Diagram>();
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Diagrams WHERE WebPicture.Diagrams.Author = '" + diagramAuthor + "';";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Atributos del diagrama
			int id = 0;
			String name = "TO - SET";
			String description = "TO - SET";
			String author = "TO - SET";
			String path = "TO - SET";
			Date created = null;
			Date modified = null; 
			Diagram D = null;		
			
			//Hay multiples entradas en el RS
			while (RS.next()) 
			{
				id = RS.getInt("idDiagram");
				name = RS.getString("Name");
				description = RS.getString("Description");
				author = RS.getString("Author");
				path = RS.getString("Path");
				created = dateParser.stringToDate(RS.getString("Created"));
				modified = dateParser.stringToDate(RS.getString("LastModified")); 
				D = new Diagram(id, name, description, author, path, created, modified);
				ans.add(D);
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
	 * Retorna la información del diagrama(s) con un nombre dado
	 * @param diagramName - Nombre del diagrama
	 * @return lista con los diagramas encontrados
	 */
	public ArrayList <Diagram> getDiagramByName(String diagramName)
	{
		ArrayList <Diagram> ans = new ArrayList <Diagram>();
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Diagrams WHERE WebPicture.Diagrams.Name = '" + diagramName + "';";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			//Atributos del diagrama
			int id = 0;
			String name = "TO - SET";
			String description = "TO - SET";
			String author = "TO - SET";
			String path = "TO - SET";
			Date created = null;
			Date modified = null; 
			Diagram D = null;		
			
			//Hay multiples entradas en el RS
			while (RS.next()) 
			{
				id = RS.getInt("idDiagram");
				name = RS.getString("Name");
				description = RS.getString("Description");
				author = RS.getString("Author");
				path = RS.getString("Path");
				created = dateParser.stringToDate(RS.getString("Created"));
				modified = dateParser.stringToDate(RS.getString("LastModified")); 
				D = new Diagram(id, name, description, author, path, created, modified);
				ans.add(D);
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
	 * Retorna todos los diagramas creados a partir de un editor
	 * @param E - Editor 
	 * @return Lista con diagramas generados por el editor 
	 */
	public ArrayList <Diagram> getDiagramByEditor(Editor E)
	{
		ArrayList <Diagram> ans = new ArrayList <Diagram>();
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Diagrams WHERE WebPicture.Diagrams.idEditor = " + E.getId() + ";";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			
			//Atributos del diagrama
			int id = 0;
			String name = "TO - SET";
			String description = "TO - SET";
			String author = "TO - SET";
			String path = "TO - SET";
			Date created = null;
			Date modified = null; 
			Diagram D = null;		
			
			//Hay multiples entradas en el RS
			while (RS.next()) 
			{
				id = RS.getInt("idDiagram");
				name = RS.getString("Name");
				description = RS.getString("Description");
				author = RS.getString("Author");
				path = RS.getString("Path");
				created = dateParser.stringToDate(RS.getString("Created"));
				modified = dateParser.stringToDate(RS.getString("LastModified")); 
				D = new Diagram(id, name, description, author, path, created, modified);
				ans.add(D);
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
	 * Retorna la lista de todos los diagramas disponibles en el servidor 
	 * @return - Lista de diagramas en el servidor 
	 */
	public ArrayList <Diagram> getAllDiagrams()
	{
		ArrayList <Diagram> ans = new ArrayList <Diagram>();
		Statement S = null;
		ResultSet RS = null;
		try
		{
			connectToDB();
			String query = "SELECT * FROM WebPicture.Diagrams;";
			S = DBConnection.createStatement();
			RS = S.executeQuery(query);
			//Verificar que el RS tenga información 
			//Atributos del diagrama
			int id = 0;
			String name = "TO - SET";
			String description = "TO - SET";
			String author = "TO - SET";
			String path = "TO - SET";
			Date created = null;
			Date modified = null; 
			Diagram D = null;		
			
			//Hay multiples entradas en el RS
			while (RS.next()) 
			{
				id = RS.getInt("idDiagram");
				name = RS.getString("Name");
				description = RS.getString("Description");
				author = RS.getString("Author");
				path = RS.getString("Path");
				created = dateParser.stringToDate(RS.getString("Created"));
				modified = dateParser.stringToDate(RS.getString("LastModified")); 
				D = new Diagram(id, name, description, author, path, created, modified);
				ans.add(D);
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

	public static void main (String args[])
	{
		DateParser Dp = new DateParser();
		try
		{
			DiagramDAO dia = new DiagramDAO(Dp);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
