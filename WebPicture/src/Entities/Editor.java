package Entities;

import java.util.ArrayList;

import Picture.GraphicalRepresentation;
import Picture.GraphicalResource;

/**
 * Representa el editor
 * @author hellspawn
 */
public class Editor 
{
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------
	
	
	
	//------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------
	
	/**
	 * Metamodelo del diagrama
	 */
	private Metamodel metamodel;
	
	/**
	 * Representacion grafica del modelo
	 */
	private GraphicalRepresentation representation;
	
	/**
	 * Recursos graficos del modelo
	 */
	private GraphicalResource recursos;
	
	/**
	 * Paleta de elementos
	 */
	private Palette paleta;
	
	/**
	 * Diagramas creados con el editor
	 */
	private ArrayList <Diagram> diagramas;

	
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