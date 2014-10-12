package Parser;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import Entities.Attribute;
import Entities.Entity;
import Entities.Metamodel;
import Entities.Reference;
import co.edu.uniandes.enar.picture.Model;

import com.google.inject.Injector;

/**
 * Servicio responsabla de hacer el parseo y validacion del archivo picture
 * @author hellspawn
 */
public class PictureParser 
{
	
	//------------------------------------------------------------------
	//Constantes
	//------------------------------------------------------------------
	
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
	 * Carga el modelo desde una ruta fija 
	 * @return Model - Es el modelo generado desde el archivo Picture
	 * @throws IOException
	 */
	public static Model parse(String picturePath) throws IOException
	{
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		 Injector injector = new co.edu.uniandes.enar.PictureStandaloneSetup().createInjectorAndDoEMFRegistration();
		 XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		 resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		 Resource resource = resourceSet.createResource(URI.createURI("platform:/resource/co.edu.uniandes.enar.picture./src/example.picture"));
		 InputStream in = new FileInputStream(picturePath);
		 resource.load(in, resourceSet.getLoadOptions());
		 Model model = (Model) resource.getContents().get(0);
		 Iterator<EObject> iterator = model.eAllContents();	
		 
		 //Lee elementos del modelo 
		 while (iterator.hasNext()) 
		 {
			 EObject classObject = iterator.next();
			 System.out.println(classObject.toString());
		 }		
		 return model;
	}
	
	public static void main (String args[])
	{
		try 
		{
			parse("./data/hellspawn.picture");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//------------------------------------------------------------------
	//Getters & Setters 
	//------------------------------------------------------------------
}
