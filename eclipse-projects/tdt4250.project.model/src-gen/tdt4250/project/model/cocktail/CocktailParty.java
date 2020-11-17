/**
 */
package tdt4250.project.model.cocktail;

import org.eclipse.emf.common.util.EList;
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
	 * Returns the value of the '<em><b>Inventories</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.project.model.cocktail.Inventory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventories</em>' containment reference list.
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getCocktailParty_Inventories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inventory> getInventories();

	/**
	 * Returns the value of the '<em><b>Drink Register</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.project.model.cocktail.Drink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drink Register</em>' containment reference list.
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getCocktailParty_DrinkRegister()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drink> getDrinkRegister();

	/**
	 * Returns the value of the '<em><b>Cocktail Products</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.project.model.cocktail.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cocktail Products</em>' containment reference list.
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getCocktailParty_CocktailProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getCocktailProducts();

} // CocktailParty
