/**
 */
package tdt4250.project.model.cocktail;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.project.model.cocktail.CocktailFactory
 * @model kind="package"
 * @generated
 */
public interface CocktailPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cocktail";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.project.model/model/cocktail.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cocktail";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CocktailPackage eINSTANCE = tdt4250.project.model.cocktail.impl.CocktailPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.impl.ProductImpl
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VOL = 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.impl.CocktailPartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.impl.CocktailPartyImpl
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getCocktailParty()
	 * @generated
	 */
	int COCKTAIL_PARTY = 1;

	/**
	 * The feature id for the '<em><b>Inventories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCKTAIL_PARTY__INVENTORIES = 0;

	/**
	 * The feature id for the '<em><b>Drink Register</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCKTAIL_PARTY__DRINK_REGISTER = 1;

	/**
	 * The feature id for the '<em><b>Cocktail Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCKTAIL_PARTY__COCKTAIL_PRODUCTS = 2;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCKTAIL_PARTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCKTAIL_PARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.impl.DrinkIngredientImpl <em>Drink Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.impl.DrinkIngredientImpl
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getDrinkIngredient()
	 * @generated
	 */
	int DRINK_INGREDIENT = 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_INGREDIENT__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Amount Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_INGREDIENT__AMOUNT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_INGREDIENT__AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Drink Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_INGREDIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Drink Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_INGREDIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.impl.DrinkImpl <em>Drink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.impl.DrinkImpl
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getDrink()
	 * @generated
	 */
	int DRINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Required Ingredients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__REQUIRED_INGREDIENTS = 2;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__STRENGTH = 3;

	/**
	 * The feature id for the '<em><b>Price Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__PRICE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__INSTRUCTIONS = 5;

	/**
	 * The number of structural features of the '<em>Drink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Drink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.impl.InventoryImpl
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 4;

	/**
	 * The feature id for the '<em><b>Available Ingredients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__AVAILABLE_INGREDIENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ID = 2;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.AmountType <em>Amount Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.AmountType
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getAmountType()
	 * @generated
	 */
	int AMOUNT_TYPE = 5;

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.PriceGroupType <em>Price Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.PriceGroupType
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getPriceGroupType()
	 * @generated
	 */
	int PRICE_GROUP_TYPE = 6;

	/**
	 * The meta object id for the '{@link tdt4250.project.model.cocktail.StrengthType <em>Strength Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.StrengthType
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getStrengthType()
	 * @generated
	 */
	int STRENGTH_TYPE = 7;

	/**
	 * The meta object id for the '<em>Amount</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getAmount()
	 * @generated
	 */
	int AMOUNT = 8;

	/**
	 * Returns the meta object for class '{@link tdt4250.project.model.cocktail.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see tdt4250.project.model.cocktail.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.project.model.cocktail.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Product#getVol <em>Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vol</em>'.
	 * @see tdt4250.project.model.cocktail.Product#getVol()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Vol();

	/**
	 * Returns the meta object for class '{@link tdt4250.project.model.cocktail.CocktailParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see tdt4250.project.model.cocktail.CocktailParty
	 * @generated
	 */
	EClass getCocktailParty();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.project.model.cocktail.CocktailParty#getInventories <em>Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inventories</em>'.
	 * @see tdt4250.project.model.cocktail.CocktailParty#getInventories()
	 * @see #getCocktailParty()
	 * @generated
	 */
	EReference getCocktailParty_Inventories();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.project.model.cocktail.CocktailParty#getDrinkRegister <em>Drink Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drink Register</em>'.
	 * @see tdt4250.project.model.cocktail.CocktailParty#getDrinkRegister()
	 * @see #getCocktailParty()
	 * @generated
	 */
	EReference getCocktailParty_DrinkRegister();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.project.model.cocktail.CocktailParty#getCocktailProducts <em>Cocktail Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cocktail Products</em>'.
	 * @see tdt4250.project.model.cocktail.CocktailParty#getCocktailProducts()
	 * @see #getCocktailParty()
	 * @generated
	 */
	EReference getCocktailParty_CocktailProducts();

	/**
	 * Returns the meta object for class '{@link tdt4250.project.model.cocktail.DrinkIngredient <em>Drink Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drink Ingredient</em>'.
	 * @see tdt4250.project.model.cocktail.DrinkIngredient
	 * @generated
	 */
	EClass getDrinkIngredient();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.project.model.cocktail.DrinkIngredient#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see tdt4250.project.model.cocktail.DrinkIngredient#getProduct()
	 * @see #getDrinkIngredient()
	 * @generated
	 */
	EReference getDrinkIngredient_Product();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.DrinkIngredient#getAmountType <em>Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Type</em>'.
	 * @see tdt4250.project.model.cocktail.DrinkIngredient#getAmountType()
	 * @see #getDrinkIngredient()
	 * @generated
	 */
	EAttribute getDrinkIngredient_AmountType();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.DrinkIngredient#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see tdt4250.project.model.cocktail.DrinkIngredient#getAmount()
	 * @see #getDrinkIngredient()
	 * @generated
	 */
	EAttribute getDrinkIngredient_Amount();

	/**
	 * Returns the meta object for class '{@link tdt4250.project.model.cocktail.Drink <em>Drink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drink</em>'.
	 * @see tdt4250.project.model.cocktail.Drink
	 * @generated
	 */
	EClass getDrink();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Drink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.project.model.cocktail.Drink#getId()
	 * @see #getDrink()
	 * @generated
	 */
	EAttribute getDrink_Id();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Drink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.project.model.cocktail.Drink#getName()
	 * @see #getDrink()
	 * @generated
	 */
	EAttribute getDrink_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.project.model.cocktail.Drink#getRequiredIngredients <em>Required Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Ingredients</em>'.
	 * @see tdt4250.project.model.cocktail.Drink#getRequiredIngredients()
	 * @see #getDrink()
	 * @generated
	 */
	EReference getDrink_RequiredIngredients();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Drink#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see tdt4250.project.model.cocktail.Drink#getStrength()
	 * @see #getDrink()
	 * @generated
	 */
	EAttribute getDrink_Strength();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Drink#getPriceGroup <em>Price Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Group</em>'.
	 * @see tdt4250.project.model.cocktail.Drink#getPriceGroup()
	 * @see #getDrink()
	 * @generated
	 */
	EAttribute getDrink_PriceGroup();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Drink#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see tdt4250.project.model.cocktail.Drink#getInstructions()
	 * @see #getDrink()
	 * @generated
	 */
	EAttribute getDrink_Instructions();

	/**
	 * Returns the meta object for class '{@link tdt4250.project.model.cocktail.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see tdt4250.project.model.cocktail.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.project.model.cocktail.Inventory#getAvailableIngredients <em>Available Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Ingredients</em>'.
	 * @see tdt4250.project.model.cocktail.Inventory#getAvailableIngredients()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_AvailableIngredients();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Inventory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.project.model.cocktail.Inventory#getName()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.project.model.cocktail.Inventory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.project.model.cocktail.Inventory#getId()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Id();

	/**
	 * Returns the meta object for enum '{@link tdt4250.project.model.cocktail.AmountType <em>Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Amount Type</em>'.
	 * @see tdt4250.project.model.cocktail.AmountType
	 * @generated
	 */
	EEnum getAmountType();

	/**
	 * Returns the meta object for enum '{@link tdt4250.project.model.cocktail.PriceGroupType <em>Price Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Price Group Type</em>'.
	 * @see tdt4250.project.model.cocktail.PriceGroupType
	 * @generated
	 */
	EEnum getPriceGroupType();

	/**
	 * Returns the meta object for enum '{@link tdt4250.project.model.cocktail.StrengthType <em>Strength Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strength Type</em>'.
	 * @see tdt4250.project.model.cocktail.StrengthType
	 * @generated
	 */
	EEnum getStrengthType();

	/**
	 * Returns the meta object for data type '<em>Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Amount</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="minExclusive='0'"
	 * @generated
	 */
	EDataType getAmount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CocktailFactory getCocktailFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.impl.ProductImpl
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Vol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__VOL = eINSTANCE.getProduct_Vol();

		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.impl.CocktailPartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.impl.CocktailPartyImpl
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getCocktailParty()
		 * @generated
		 */
		EClass COCKTAIL_PARTY = eINSTANCE.getCocktailParty();

		/**
		 * The meta object literal for the '<em><b>Inventories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COCKTAIL_PARTY__INVENTORIES = eINSTANCE.getCocktailParty_Inventories();

		/**
		 * The meta object literal for the '<em><b>Drink Register</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COCKTAIL_PARTY__DRINK_REGISTER = eINSTANCE.getCocktailParty_DrinkRegister();

		/**
		 * The meta object literal for the '<em><b>Cocktail Products</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COCKTAIL_PARTY__COCKTAIL_PRODUCTS = eINSTANCE.getCocktailParty_CocktailProducts();

		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.impl.DrinkIngredientImpl <em>Drink Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.impl.DrinkIngredientImpl
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getDrinkIngredient()
		 * @generated
		 */
		EClass DRINK_INGREDIENT = eINSTANCE.getDrinkIngredient();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRINK_INGREDIENT__PRODUCT = eINSTANCE.getDrinkIngredient_Product();

		/**
		 * The meta object literal for the '<em><b>Amount Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK_INGREDIENT__AMOUNT_TYPE = eINSTANCE.getDrinkIngredient_AmountType();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK_INGREDIENT__AMOUNT = eINSTANCE.getDrinkIngredient_Amount();

		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.impl.DrinkImpl <em>Drink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.impl.DrinkImpl
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getDrink()
		 * @generated
		 */
		EClass DRINK = eINSTANCE.getDrink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK__ID = eINSTANCE.getDrink_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK__NAME = eINSTANCE.getDrink_Name();

		/**
		 * The meta object literal for the '<em><b>Required Ingredients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRINK__REQUIRED_INGREDIENTS = eINSTANCE.getDrink_RequiredIngredients();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK__STRENGTH = eINSTANCE.getDrink_Strength();

		/**
		 * The meta object literal for the '<em><b>Price Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK__PRICE_GROUP = eINSTANCE.getDrink_PriceGroup();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK__INSTRUCTIONS = eINSTANCE.getDrink_Instructions();

		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.impl.InventoryImpl
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Available Ingredients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__AVAILABLE_INGREDIENTS = eINSTANCE.getInventory_AvailableIngredients();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__NAME = eINSTANCE.getInventory_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__ID = eINSTANCE.getInventory_Id();

		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.AmountType <em>Amount Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.AmountType
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getAmountType()
		 * @generated
		 */
		EEnum AMOUNT_TYPE = eINSTANCE.getAmountType();

		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.PriceGroupType <em>Price Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.PriceGroupType
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getPriceGroupType()
		 * @generated
		 */
		EEnum PRICE_GROUP_TYPE = eINSTANCE.getPriceGroupType();

		/**
		 * The meta object literal for the '{@link tdt4250.project.model.cocktail.StrengthType <em>Strength Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.StrengthType
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getStrengthType()
		 * @generated
		 */
		EEnum STRENGTH_TYPE = eINSTANCE.getStrengthType();

		/**
		 * The meta object literal for the '<em>Amount</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.project.model.cocktail.impl.CocktailPackageImpl#getAmount()
		 * @generated
		 */
		EDataType AMOUNT = eINSTANCE.getAmount();

	}

} //CocktailPackage
