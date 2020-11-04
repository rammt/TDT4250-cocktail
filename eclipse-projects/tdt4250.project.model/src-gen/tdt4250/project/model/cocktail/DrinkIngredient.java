/**
 */
package tdt4250.project.model.cocktail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drink Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.DrinkIngredient#getProduct <em>Product</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.DrinkIngredient#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.DrinkIngredient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrinkIngredient()
 * @model
 * @generated
 */
public interface DrinkIngredient extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrinkIngredient_Product()
	 * @model required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.DrinkIngredient#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.project.model.cocktail.AmountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Type</em>' attribute.
	 * @see tdt4250.project.model.cocktail.AmountType
	 * @see #setAmountType(AmountType)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrinkIngredient_AmountType()
	 * @model required="true"
	 * @generated
	 */
	AmountType getAmountType();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.DrinkIngredient#getAmountType <em>Amount Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' attribute.
	 * @see tdt4250.project.model.cocktail.AmountType
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(AmountType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrinkIngredient_Amount()
	 * @model dataType="tdt4250.project.model.cocktail.Amount" required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.DrinkIngredient#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

} // DrinkIngredient
