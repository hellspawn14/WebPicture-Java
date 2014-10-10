package Entities;

/**
 * Representa una referencia
 * @author hellspawn
 */
public class Reference
{
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Entidad origen
	 */
	private Entity source;
	
	/**
	 * Entidad objetivo (puede ser null)
	 */
	private Entity target;
		
	/**
	 * Maximo 
	 */
	private int upperBound;
	
	/**
	 * Minimo
	 */
	private int lowerBound;
	
	/**
	 * Nombre de la referencia
	 */
	private String refName;
	
	/**
	 * Indica si es contenencia 
	 */
	private boolean isContainment;

	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------
	
	/**
	 * Crea una nueva referencia
	 * @param source
	 * @param upperBound
	 * @param lowerBound
	 * @param refName
	 * @param isContainment
	 */
	public Reference(Entity source, int upperBound, int lowerBound, String refName, boolean isContainment)
	{
		this.source = source;
		this.upperBound = upperBound;
		this.lowerBound = lowerBound;
		this.refName = refName;
		this.isContainment = isContainment;
	}

	
	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------

	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	public Entity getSource() 
	{
		return source;
	}

	public void setSource(Entity source) 
	{
		this.source = source;
	}

	public Entity getTarget() 
	{
		return target;
	}

	public void setTarget(Entity target) 
	{
		this.target = target;
	}

	public int getUpperBound() 
	{
		return upperBound;
	}

	public void setUpperBound(int upperBound) 
	{
		this.upperBound = upperBound;
	}

	public int getLowerBound() 
	{
		return lowerBound;
	}

	public void setLowerBound(int lowerBound) 
	{
		this.lowerBound = lowerBound;
	}

	public String getRefName() 
	{
		return refName;
	}

	public void setRefName(String refName) 
	{
		this.refName = refName;
	}

	public boolean isContainment() 
	{
		return isContainment;
	}

	public void setContainment(boolean isContainment) 
	{
		this.isContainment = isContainment;
	}
	
}
