/**
 */
package tdt4250.project.model.cocktail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.CocktailParty#getInventories <em>Inventories</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.CocktailParty#getDrinkRegister <em>Drink Register</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.CocktailParty#getCocktailProducts <em>Cocktail Products</em>}</li>
 * </ul>
 *
 * @see tdt4250.project.model.cocktail.CocktailPackage#getCocktailParty()
 * @model
 * @generated
 */
public interface CocktailParty extends EObject {
	/**
	 * Returns the value of the '<em><b>Inventories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventories</em>' containment reference.
	 * @see #setInventories(Inventory)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getCocktailParty_Inventories()
	 * @model containment="true"
	 * @generated
	 */
	Inventory getInventories();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.CocktailParty#getInventories <em>Inventories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventories</em>' containment reference.
	 * @see #getInventories()
	 * @generated
	 */
	void setInventories(Inventory value);

	/**
	 * Returns the value of the '<em><b>Drink Register</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drink Register</em>' containment reference.
	 * @see #setDrinkRegister(Drink)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getCocktailParty_DrinkRegister()
	 * @model containment="true"
	 * @generated
	 */
	Drink getDrinkRegister();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.CocktailParty#getDrinkRegister <em>Drink Register</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drink Register</em>' containment reference.
	 * @see #getDrinkRegister()
	 * @generated
	 */
	void setDrinkRegister(Drink value);

	/**
	 * Returns the value of the '<em><b>Cocktail Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cocktail Products</em>' containment reference.
	 * @see #setCocktailProducts(Product)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getCocktailParty_CocktailProducts()
	 * @model containment="true"
	 * @generated
	 */
	Product getCocktailProducts();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.CocktailParty#getCocktailProducts <em>Cocktail Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cocktail Products</em>' containment reference.
	 * @see #getCocktailProducts()
	 * @generated
	 */
	void setCocktailProducts(Product value);

} // CocktailParty
