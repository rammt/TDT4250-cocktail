/**
 */
package tdt4250.project.model.cocktail.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.emfjson.jackson.resource.JsonResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see tdt4250.project.model.cocktail.util.CocktailResourceFactoryImpl
 * @generated NOT
 */
/*
 * bytte ut extends med JSON her
 */
public class CocktailResourceImpl extends JsonResource {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated NOT
	 */
	

	public CocktailResourceImpl(URI uri) {
		super(uri);
		
		Resource resource = resourceSet.createResource(URI.createFileURI(""));
		//resource.load(null);
	}

} //CocktailResourceImpl
