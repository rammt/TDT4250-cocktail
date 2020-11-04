/**
 */
package tdt4250.project.model.cocktail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.Product#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.Product#getVol <em>Vol</em>}</li>
 * </ul>
 *
 * @see tdt4250.project.model.cocktail.CocktailPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getProduct_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol</em>' attribute.
	 * @see #setVol(float)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getProduct_Vol()
	 * @model
	 * @generated
	 */
	float getVol();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Product#getVol <em>Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol</em>' attribute.
	 * @see #getVol()
	 * @generated
	 */
	void setVol(float value);

} // Product
