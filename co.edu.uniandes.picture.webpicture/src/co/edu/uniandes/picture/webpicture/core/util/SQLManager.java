package co.edu.uniandes.picture.webpicture.core.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Clase encargada de hacer la persistencia en base de datos de los editores creados
 * @author hellspawn
 */
public class SQLManager 
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
	 * Conexión con la base de datos 
	 */
	private Connection connection;
	
	/**
	 * Medio de conexion para enviar las peticiones a la DB
	 */
	private Statement statement;
	
	/**
	 * Contenedor del resultado de la consulta SQL 
	 */
	private ResultSet resultSet;
	
	/**
	 * Prepared statement
	 */
	private PreparedStatement preparedStatement;

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	
	
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	
	
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------

}
