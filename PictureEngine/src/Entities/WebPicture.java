package Entities;

import java.util.ArrayList;

/**
 * Representa el conjunto global de herramientas del editor
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
	 * Lista con los editores del sistema 
	 */
	private ArrayList <Editor> editores;
	
	/**
	 * Instancia singleton 
	 */
	private WebPicture instancia;
	
	//------------------------------------------------------------------
	//Constructores
	//------------------------------------------------------------------

	/**
	 * Crea una nueva instancia de WebPicture
	 */
	public WebPicture()
	{
		editores = new ArrayList <Editor>();
		instancia = this;
	}

	//------------------------------------------------------------------
	//Metodos
	//------------------------------------------------------------------
	
	
	//------------------------------------------------------------------
	//Getters & Setters
	//------------------------------------------------------------------
	
	public ArrayList<Editor> getEditores() 
	{
		return editores;
	}

	public WebPicture getInstancia() 
	{
		return instancia;
	}
}