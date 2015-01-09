package en.ar.picture.webpicture.core.build.dsl.util;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.enar.picture.impl.ModelImpl;

import com.google.inject.Injector;

/**
 * Componente para cargar un modelo de Picture basado en la gramatica
 * implementada
 * @author hellspawn
 */
public class DSLLoader {
	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Injector del metamodelo 
	 */
	private Injector injector; 
	
	/**
	 * Conjunto de recursos de XText 
	 */
	private XtextResourceSet resourceSet;
	
	/**
	 * Recursos del modelo 
	 */
	private Resource resource;
	
	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo cargador del lenguaje
	 * Soluciona el problema de multiples threads cada vez que se carga un recurso del lenguaje
	 */
	public DSLLoader()
	{
		injector = new co.edu.uniandes.enar.PictureStandaloneSetup().createInjectorAndDoEMFRegistration();
		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,Boolean.TRUE);
	}
	
	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Carga el modelo desde una ruta fija a memoria principal
	 * @return Model - Es el modelo generado desde el archivo Picture
	 * @throws Exception - En el caso de que el archivo Picture tenga un error
	 * devuelve la lista de los errores
	 */
	public Model loadPicture(String path) throws Exception {
		resource = resourceSet.getResource(URI.createURI(path), true);
		Model model = (ModelImpl) resource.getContents().get(0);

		// Valida el modelo y busca errores
		EList<Diagnostic> listaErrores = resource.getErrors();
		if (listaErrores.isEmpty()) {
			return model;
		} else {
			String mensajeException = "Your Picture file has some errors fix them and try again";
			throw new Exception(mensajeException);
		}
	}
}
