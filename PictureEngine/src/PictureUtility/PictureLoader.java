package PictureUtility;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.enar.picture.Model;

import com.google.inject.Injector;

/**
 * Servicio responsabla de hacer el parseo y validacion del archivo picture
 * @author hellspawn
 */
public class PictureLoader 
{
		
	//------------------------------------------------------------------
	//Metodos 
	//------------------------------------------------------------------
	
	/**
	 * Carga el modelo desde una ruta fija a memoria principal 
	 * @return Model - Es el modelo generado desde el archivo Picture
	 * @throws Exception - En el caso de que el archivo Picture tenga un error devuelve la lista de los errores
	 */
	public void loadPicture(String picturePath) throws Exception
	{
		//Carga el modelo de la gramatica en memoria principal 
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new co.edu.uniandes.enar.PictureStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(picturePath), true);
		Model model = (Model) resource.getContents().get(0);
		
		
		//Valida el modelo y busca errores
		EList <Diagnostic> listaErrores = resource.getErrors();
		if (listaErrores.isEmpty())
		{
			//Lee elementos del modelo 
			Iterator<EObject> iterator = model.eAllContents();
			while (iterator.hasNext()) 
			{
				EObject classObject = iterator.next();
				System.out.println(classObject.toString());
			}
			//this.loadModel(resource);
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
	
	public void loadModel(Resource resource) throws IOException
	{
		
	}
	
	public static void main (String args[])
	{
		PictureLoader Pl = new PictureLoader();
		try 
		{
			Pl.loadPicture("./data/hellspawn.picture");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
