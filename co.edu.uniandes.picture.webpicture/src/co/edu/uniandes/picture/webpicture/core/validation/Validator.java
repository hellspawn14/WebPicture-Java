package co.edu.uniandes.picture.webpicture.core.validation;

import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.picture.webpicture.metamodel.Metamodel;

/**
 * Valida que el contenido del .ecore y el .picture correspondan 
 * @author hellspawn
 */
public class Validator 
{
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	/**
	 * Valida que el contenido del archivo .picture y el .ecore correspondan 
	 * @param model - Es el modelo generado a partir del picture
	 * @param metamodel - Es el metamodelo construido a partir del .ecore
	 * @return true/false
	 */
	public boolean validate(Model model, Metamodel metamodel, String directory)
	{
		boolean ans = false;
		
		//TODO -> Cada elemento del metamodelo tiene un nombre unico 
		//No todo lo que esta en el metamodelo debe ir en el picture
		//1. Verificar que el picture referencie el mismo archivo .ecore
		//2. Validar que las clases coincidan 
		//3. Verificar que solo exista un root
		//4. Validar que todas las relaciones tengan nombre en especial las de contenencia 
		//5. Dos relaciones de contenencia no pueden ir en doble sentido? CRC-LR-3 
		//6. Todas las clases deben tener un nombre unico 
		//7 Validar recursos de imagen
		model.getGraphicalREpresentation().getGraphicalDefinition().toString();
		return ans;
	}
		
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	
}
