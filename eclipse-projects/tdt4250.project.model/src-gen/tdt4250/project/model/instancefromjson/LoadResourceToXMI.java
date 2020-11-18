package tdt4250.project.model.instancefromjson;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;

import tdt4250.project.model.cocktail.*;
import tdt4250.project.model.cocktail.util.*;


public class LoadResourceToXMI {

	public static void main(String[] args) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("json", new JsonResourceFactory());
		
		Resource resource = resourceSet.createResource(URI.createFileURI("./../../resources/data.json"));
		resource.load(null);
		/* relate the RaPackage identifier used in XMI files to the RaPackage instance (EPackage meta-object) 
		//resSet.getPackageRegistry().put(CocktailPackage.eNS_URI, CocktailPackage.eINSTANCE);
	

		//Resource resource = resSet.getResource(URI.createURI(LoadResourceExample.class.getResource("LoadResourceExample.xmi").toString()), true);
		Department dep = (Department) resource.getContents().get(0);
		for (Course course : dep.getCourses()) {
			System.out.println(course);
		}*/
	}
}
