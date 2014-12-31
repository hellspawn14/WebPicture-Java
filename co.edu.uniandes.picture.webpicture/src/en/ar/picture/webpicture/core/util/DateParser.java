package en.ar.picture.webpicture.core.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Componente responsable de convertir fechas 
 * @author hellspawn 
 */
public class DateParser 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------

	/**
	 * Formato de conversión
	 */
	private final static String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	/**
	 * Formatter
	 */
	private DateFormat dateFormat;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------
	
	/**
	 * Crea un nuevo parser 
	 */
	public DateParser()
	{
		dateFormat = new SimpleDateFormat(DATE_FORMAT);
	}
	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Retorna un string con el formato yyyy/MM/dd HH:mm:ss apartir de un Date
	 * @param d - Fecha 
	 * @return String con formato yyyy/MM/dd HH:mm:ss
	 */
	public String dateToString(Date d)
	{
		return dateFormat.format(d);
	}
	
	/**
	 * Retorna una fecha apartir de su representación en String 
	 * @param s - Fecha en string con formato yyyy/MM/dd HH:mm:ss
	 * @return Fecha 
	 */
	public Date stringToDate(String s)
	{
		try 
		{
			return dateFormat.parse(s);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------

}
