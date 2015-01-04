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
	// Metodos
	// ------------------------------------------------------------------

	/**
	 * Carga el modelo desde una ruta fija a memoria principal
	 * @return Model - Es el modelo generado desde el archivo Picture
	 * @throws Exception - En el caso de que el archivo Picture tenga un error
	 * devuelve la lista de los errores
	 */
	public Model loadPicture(String path) throws Exception {
		Injector injector = new co.edu.uniandes.enar.PictureStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(path), true);
		Model model = (ModelImpl) resource.getContents().get(0);

		// Valida el modelo y busca errores
		EList<Diagnostic> listaErrores = resource.getErrors();
		if (listaErrores.isEmpty()) {
			return model;
		} else {
			String mensajeException = "Your Picture file has some errors fix them and try again"
					+ "\n";
			/*for (Iterator<Diagnostic> iter = listaErrores.iterator(); iter
					.hasNext();) {
				Diagnostic element = iter.next();
				mensajeException += element.toString() + "\n";
			}*/
			throw new Exception(mensajeException);
		}
	}
}
