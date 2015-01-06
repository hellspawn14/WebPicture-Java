package en.ar.picture.webpicture.core.build.dsl.style;

/**
 * Representa la especificación de una forma basica descrita en la especificacion del picture 
 * @author hellspawn
 */
public class BasicShape {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	// ------------------------------------------------------------------
	// Atributos 
	// ------------------------------------------------------------------

	/**
	 * Nombre 
	 */
	private String name; 
	
	/**
	 * Tipo de forma 
	 */
	private String type; 
	
	/**
	 * Declaracion de la forma 
	 */
	private String statement;

	
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea una definición de forma basica 
	 * @param name - Nombre de la forma 
	 * @param type - Tipo de la forma 
	 * @param statement - Declaración 
	 */
	public BasicShape(String name, String type, String statement) {
		this.name = name;
		this.type = type;
		this.statement = statement;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the statement
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * @param statement the statement to set
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}
}
