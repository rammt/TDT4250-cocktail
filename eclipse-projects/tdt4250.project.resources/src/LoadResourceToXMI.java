

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
		
		resourceSet.getPackageRegistry().put(CocktailPackage.eNS_URI, CocktailPackage.eINSTANCE);

		resourceSet.getResourceFactoryRegistry()
		.getExtensionToFactoryMap()
		.put("*", new JsonResourceFactory());
		
		
		Resource resource = resourceSet.createResource(URI.createFileURI("resources/data.json"));
		resource.load(null);
		
		CocktailParty cp = (CocktailParty) resource.getContents().get(0);
		
		System.out.println("CocktailParty: " + cp);
		
		for (Drink drink : cp.getDrinkRegister()) {
			System.out.println(drink);
		}
	}
}
