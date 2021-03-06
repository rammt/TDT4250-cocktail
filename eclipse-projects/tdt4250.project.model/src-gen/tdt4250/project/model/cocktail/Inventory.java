/**
 */
package tdt4250.project.model.cocktail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.Inventory#getAvailableIngredients <em>Available Ingredients</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.Inventory#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.Inventory#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @see tdt4250.project.model.cocktail.CocktailPackage#getInventory()
 * @model
 * @generated
 */
public interface Inventory extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.project.model.cocktail.DrinkIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Ingredients</em>' containment reference list.
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getInventory_AvailableIngredients()
	 * @model containment="true"
	 * @generated
	 */
	EList<DrinkIngredient> getAvailableIngredients();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getInventory_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Inventory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.project.model.cocktail.CocktailParty#getInventories <em>Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' container reference.
	 * @see #setParty(CocktailParty)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getInventory_Party()
	 * @see tdt4250.project.model.cocktail.CocktailParty#getInventories
	 * @model opposite="inventories" transient="false"
	 * @generated
	 */
	CocktailParty getParty();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Inventory#getParty <em>Party</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' container reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(CocktailParty value);

} // Inventory
