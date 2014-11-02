package co.edu.uniandes.picture.webpicture.util.picture;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.enar.picture.GraphicalRepresentation;
import co.edu.uniandes.enar.picture.Import;
import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.impl.ModelImpl;

import com.google.inject.Injector;

/**
 * Carga un modelo de Picture basado en la gramatica implementada 
 * @author hellspawn
 */
public class DSLLoader 
{
	//------------------------------------------------------------------
	//Metodos 
	//------------------------------------------------------------------
	

	/**
	 * Carga el modelo desde una ruta fija a memoria principal 
	 * @return Model - Es el modelo generado desde el archivo Picture
	 * @throws Exception - En el caso de que el archivo Picture tenga un error devuelve la lista de los errores
	 */
	public Model loadPicture(String path) throws Exception
	{
		//Carga el modelo de la gramatica en memoria principal 
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new co.edu.uniandes.enar.PictureStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(path), true);
		Model model = (ModelImpl) resource.getContents().get(0);
				
		//Valida el modelo y busca errores
		EList <Diagnostic> listaErrores = resource.getErrors();
		if (listaErrores.isEmpty())
		{
			return model;
		}
		else
		{
			String mensajeException = "Your Picture file has some errors fix them and try again" + "\n";
			for (Iterator<Diagnostic> iter = listaErrores.iterator(); iter.hasNext(); ) 
			{
				Diagnostic element = iter.next();
				mensajeException += element.toString() + "\n";
			}
			throw new Exception (mensajeException);
		}
	}
	
	public static void main (String args[])
	{
		DSLLoader loader = new DSLLoader();
		try 
		{
			Model M = loader.loadPicture("./WebContent/samples/bpmnTest2.picture");
			GraphicalRepresentation G = M.getGraphicalREpresentation();
			System.out.println(G.getRoot().getName());
			EList<Import> classFiles = M.getImports();
			for (Import classFile : classFiles) 
			{
				System.out.println(classFile.getImportedNamespace());
				System.out.println(classFile.getName());
				
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
