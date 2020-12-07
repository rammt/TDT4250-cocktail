

import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;

import tdt4250.project.model.cocktail.*;


public class LoadResourceToXMI {

	public static void main(String[] args) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(CocktailPackage.eNS_URI, CocktailPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new  XMIResourceFactoryImpl());
		
		
		Resource resource = resourceSet.createResource(URI.createFileURI("resources/data.json"));
		resource.load(null);
		
		CocktailParty cp = (CocktailParty) resource.getContents().get(0);
		
		Resource xmiResource = resourceSet.createResource(URI.createFileURI("resources/CocktailParty.xmi"));
		xmiResource.getContents().add(cp);
		xmiResource.save(Collections.EMPTY_MAP);
	}
}
