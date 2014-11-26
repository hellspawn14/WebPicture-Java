package co.edu.uniandes.picture.webpicture.core;

import co.edu.uniandes.picture.webpicture.core.build.ModelBuilder;
import co.edu.uniandes.picture.webpicture.core.util.DateParser;
import co.edu.uniandes.picture.webpicture.util.metamodel.XMIMetamodelLoader;
import co.edu.uniandes.picture.webpicture.util.picture.DSLLoader;

/**
 * Representa la clase principal de la herramienta
 * @author hellspawn
 */
public class WebPicture 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	
	/**
	 * Transforma el input de la gramatica en un modelo 
	 */
	private DSLLoader dslLoader;
	
	/**
	 * Transforma un metamodelo ecore en un modelo intermedio 
	 */
	private XMIMetamodelLoader metamodelLoader;
	
	/**
	 * Valida el metamodelo y el modelo del lenguaje  
	 */
	private ModelBuilder modelValidator;
	
	/**
	 * Transformación de fechas 
	 */
	private DateParser dateParser;
	
	
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
