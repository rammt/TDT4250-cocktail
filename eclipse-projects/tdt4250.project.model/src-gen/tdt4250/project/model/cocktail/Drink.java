/**
 */
package tdt4250.project.model.cocktail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.Drink#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.Drink#getRequiredIngredients <em>Required Ingredients</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.Drink#getStrength <em>Strength</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.Drink#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.Drink#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrink()
 * @model
 * @generated
 */
public interface Drink extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrink_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Drink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.project.model.cocktail.DrinkIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Ingredients</em>' containment reference list.
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrink_RequiredIngredients()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DrinkIngredient> getRequiredIngredients();

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.project.model.cocktail.StrengthType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see tdt4250.project.model.cocktail.StrengthType
	 * @see #setStrength(StrengthType)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrink_Strength()
	 * @model dataType="tdt4250.project.model.cocktail.StrengthType" required="true" derived="true"
	 * @generated
	 */
	StrengthType getStrength();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Drink#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see tdt4250.project.model.cocktail.StrengthType
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(StrengthType value);

	/**
	 * Returns the value of the '<em><b>Complexity</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.project.model.cocktail.ComplexityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complexity</em>' attribute.
	 * @see tdt4250.project.model.cocktail.ComplexityType
	 * @see #setComplexity(ComplexityType)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrink_Complexity()
	 * @model required="true" derived="true"
	 * @generated
	 */
	ComplexityType getComplexity();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Drink#getComplexity <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complexity</em>' attribute.
	 * @see tdt4250.project.model.cocktail.ComplexityType
	 * @see #getComplexity()
	 * @generated
	 */
	void setComplexity(ComplexityType value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute.
	 * @see #setInstructions(String)
	 * @see tdt4250.project.model.cocktail.CocktailPackage#getDrink_Instructions()
	 * @model
	 * @generated
	 */
	String getInstructions();

	/**
	 * Sets the value of the '{@link tdt4250.project.model.cocktail.Drink#getInstructions <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' attribute.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(String value);

} // Drink
