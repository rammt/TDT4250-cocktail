/**
 */
package tdt4250.project.model.cocktail.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tdt4250.project.model.cocktail.AmountType;
import tdt4250.project.model.cocktail.CocktailFactory;
import tdt4250.project.model.cocktail.CocktailPackage;
import tdt4250.project.model.cocktail.CocktailParty;
import tdt4250.project.model.cocktail.ComplexityType;
import tdt4250.project.model.cocktail.Drink;
import tdt4250.project.model.cocktail.DrinkIngredient;
import tdt4250.project.model.cocktail.Inventory;
import tdt4250.project.model.cocktail.Product;
import tdt4250.project.model.cocktail.StrengthType;

import tdt4250.project.model.cocktail.util.CocktailValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CocktailPackageImpl extends EPackageImpl implements CocktailPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cocktailPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drinkIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum amountTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complexityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strengthTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType amountEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tdt4250.project.model.cocktail.CocktailPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CocktailPackageImpl() {
		super(eNS_URI, CocktailFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CocktailPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CocktailPackage init() {
		if (isInited)
			return (CocktailPackage) EPackage.Registry.INSTANCE.getEPackage(CocktailPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCocktailPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CocktailPackageImpl theCocktailPackage = registeredCocktailPackage instanceof CocktailPackageImpl
				? (CocktailPackageImpl) registeredCocktailPackage
				: new CocktailPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCocktailPackage.createPackageContents();

		// Initialize created meta-data
		theCocktailPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCocktailPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return CocktailValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCocktailPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CocktailPackage.eNS_URI, theCocktailPackage);
		return theCocktailPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Name() {
		return (EAttribute) productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Vol() {
		return (EAttribute) productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCocktailParty() {
		return cocktailPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCocktailParty_Inventories() {
		return (EReference) cocktailPartyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCocktailParty_DrinkRegister() {
		return (EReference) cocktailPartyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCocktailParty_CocktailProducts() {
		return (EReference) cocktailPartyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDrinkIngredient() {
		return drinkIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDrinkIngredient_Product() {
		return (EReference) drinkIngredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrinkIngredient_AmountType() {
		return (EAttribute) drinkIngredientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrinkIngredient_Amount() {
		return (EAttribute) drinkIngredientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDrink() {
		return drinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrink_Name() {
		return (EAttribute) drinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDrink_RequiredIngredients() {
		return (EReference) drinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrink_Strength() {
		return (EAttribute) drinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrink_Complexity() {
		return (EAttribute) drinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrink_Instructions() {
		return (EAttribute) drinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_AvailableIngredients() {
		return (EReference) inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Name() {
		return (EAttribute) inventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_Party() {
		return (EReference) inventoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAmountType() {
		return amountTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComplexityType() {
		return complexityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStrengthType() {
		return strengthTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAmount() {
		return amountEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CocktailFactory getCocktailFactory() {
		return (CocktailFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__VOL);

		cocktailPartyEClass = createEClass(COCKTAIL_PARTY);
		createEReference(cocktailPartyEClass, COCKTAIL_PARTY__INVENTORIES);
		createEReference(cocktailPartyEClass, COCKTAIL_PARTY__DRINK_REGISTER);
		createEReference(cocktailPartyEClass, COCKTAIL_PARTY__COCKTAIL_PRODUCTS);

		drinkIngredientEClass = createEClass(DRINK_INGREDIENT);
		createEReference(drinkIngredientEClass, DRINK_INGREDIENT__PRODUCT);
		createEAttribute(drinkIngredientEClass, DRINK_INGREDIENT__AMOUNT_TYPE);
		createEAttribute(drinkIngredientEClass, DRINK_INGREDIENT__AMOUNT);

		drinkEClass = createEClass(DRINK);
		createEAttribute(drinkEClass, DRINK__NAME);
		createEReference(drinkEClass, DRINK__REQUIRED_INGREDIENTS);
		createEAttribute(drinkEClass, DRINK__STRENGTH);
		createEAttribute(drinkEClass, DRINK__COMPLEXITY);
		createEAttribute(drinkEClass, DRINK__INSTRUCTIONS);

		inventoryEClass = createEClass(INVENTORY);
		createEReference(inventoryEClass, INVENTORY__AVAILABLE_INGREDIENTS);
		createEAttribute(inventoryEClass, INVENTORY__NAME);
		createEReference(inventoryEClass, INVENTORY__PARTY);

		// Create enums
		amountTypeEEnum = createEEnum(AMOUNT_TYPE);
		complexityTypeEEnum = createEEnum(COMPLEXITY_TYPE);
		strengthTypeEEnum = createEEnum(STRENGTH_TYPE);

		// Create data types
		amountEDataType = createEDataType(AMOUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 1, 1, Product.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Vol(), ecorePackage.getEFloat(), "vol", null, 0, 1, Product.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cocktailPartyEClass, CocktailParty.class, "CocktailParty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCocktailParty_Inventories(), this.getInventory(), this.getInventory_Party(), "inventories",
				null, 0, -1, CocktailParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCocktailParty_DrinkRegister(), this.getDrink(), null, "drinkRegister", null, 0, -1,
				CocktailParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCocktailParty_CocktailProducts(), this.getProduct(), null, "cocktailProducts", null, 0, -1,
				CocktailParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drinkIngredientEClass, DrinkIngredient.class, "DrinkIngredient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrinkIngredient_Product(), this.getProduct(), null, "product", null, 1, 1,
				DrinkIngredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrinkIngredient_AmountType(), this.getAmountType(), "amountType", null, 1, 1,
				DrinkIngredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrinkIngredient_Amount(), this.getAmount(), "amount", null, 1, 1, DrinkIngredient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drinkEClass, Drink.class, "Drink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrink_Name(), ecorePackage.getEString(), "name", null, 1, 1, Drink.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrink_RequiredIngredients(), this.getDrinkIngredient(), null, "requiredIngredients", null, 1,
				-1, Drink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrink_Strength(), this.getStrengthType(), "strength", null, 1, 1, Drink.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrink_Complexity(), this.getComplexityType(), "complexity", null, 1, 1, Drink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrink_Instructions(), ecorePackage.getEString(), "instructions", null, 0, 1, Drink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventory_AvailableIngredients(), this.getDrinkIngredient(), null, "availableIngredients",
				null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Inventory.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_Party(), this.getCocktailParty(), this.getCocktailParty_Inventories(), "party",
				null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(amountTypeEEnum, AmountType.class, "AmountType");
		addEEnumLiteral(amountTypeEEnum, AmountType.OZ);
		addEEnumLiteral(amountTypeEEnum, AmountType.TSP);
		addEEnumLiteral(amountTypeEEnum, AmountType.CL);
		addEEnumLiteral(amountTypeEEnum, AmountType.DASH);
		addEEnumLiteral(amountTypeEEnum, AmountType.CUBE);
		addEEnumLiteral(amountTypeEEnum, AmountType.SPLASH);
		addEEnumLiteral(amountTypeEEnum, AmountType.SLICE);
		addEEnumLiteral(amountTypeEEnum, AmountType.TWIST);
		addEEnumLiteral(amountTypeEEnum, AmountType.TABLESPOON);
		addEEnumLiteral(amountTypeEEnum, AmountType.DROP);
		addEEnumLiteral(amountTypeEEnum, AmountType.WEDGE);
		addEEnumLiteral(amountTypeEEnum, AmountType.WHOLE);
		addEEnumLiteral(amountTypeEEnum, AmountType.PIECE);
		addEEnumLiteral(amountTypeEEnum, AmountType.CUP);
		addEEnumLiteral(amountTypeEEnum, AmountType.CHUNK);
		addEEnumLiteral(amountTypeEEnum, AmountType.PART);
		addEEnumLiteral(amountTypeEEnum, AmountType.LARGE);
		addEEnumLiteral(amountTypeEEnum, AmountType.LB);
		addEEnumLiteral(amountTypeEEnum, AmountType.FROZEN);
		addEEnumLiteral(amountTypeEEnum, AmountType.CAN);
		addEEnumLiteral(amountTypeEEnum, AmountType.L);
		addEEnumLiteral(amountTypeEEnum, AmountType.PINCH);
		addEEnumLiteral(amountTypeEEnum, AmountType.GAL);
		addEEnumLiteral(amountTypeEEnum, AmountType.GROUND);
		addEEnumLiteral(amountTypeEEnum, AmountType.INCH);
		addEEnumLiteral(amountTypeEEnum, AmountType.QT);
		addEEnumLiteral(amountTypeEEnum, AmountType.GR);
		addEEnumLiteral(amountTypeEEnum, AmountType.STICK);
		addEEnumLiteral(amountTypeEEnum, AmountType.STRIP);
		addEEnumLiteral(amountTypeEEnum, AmountType.BEATEN);
		addEEnumLiteral(amountTypeEEnum, AmountType.CRUSHED);
		addEEnumLiteral(amountTypeEEnum, AmountType.CUBES);
		addEEnumLiteral(amountTypeEEnum, AmountType.BOTTLE);
		addEEnumLiteral(amountTypeEEnum, AmountType.ML);
		addEEnumLiteral(amountTypeEEnum, AmountType.CRACKED);
		addEEnumLiteral(amountTypeEEnum, AmountType.ONE_INCH);
		addEEnumLiteral(amountTypeEEnum, AmountType.KG);
		addEEnumLiteral(amountTypeEEnum, AmountType.PINT);
		addEEnumLiteral(amountTypeEEnum, AmountType.RIPE);
		addEEnumLiteral(amountTypeEEnum, AmountType.DL);
		addEEnumLiteral(amountTypeEEnum, AmountType.SCOOP);
		addEEnumLiteral(amountTypeEEnum, AmountType.MEASURE);
		addEEnumLiteral(amountTypeEEnum, AmountType.GLASS);
		addEEnumLiteral(amountTypeEEnum, AmountType.PACKAGE);
		addEEnumLiteral(amountTypeEEnum, AmountType.HANDFUL);
		addEEnumLiteral(amountTypeEEnum, AmountType.JIGGER);
		addEEnumLiteral(amountTypeEEnum, AmountType.SPRIG);
		addEEnumLiteral(amountTypeEEnum, AmountType.LEAVE);
		addEEnumLiteral(amountTypeEEnum, AmountType.LONG);
		addEEnumLiteral(amountTypeEEnum, AmountType.UNKNOWN);

		initEEnum(complexityTypeEEnum, ComplexityType.class, "ComplexityType");
		addEEnumLiteral(complexityTypeEEnum, ComplexityType.LOW);
		addEEnumLiteral(complexityTypeEEnum, ComplexityType.MEDIUM);
		addEEnumLiteral(complexityTypeEEnum, ComplexityType.HIGH);
		addEEnumLiteral(complexityTypeEEnum, ComplexityType.EXTRAVAGANT);

		initEEnum(strengthTypeEEnum, StrengthType.class, "StrengthType");
		addEEnumLiteral(strengthTypeEEnum, StrengthType.NON_ALCOHOLIC);
		addEEnumLiteral(strengthTypeEEnum, StrengthType.WEAK);
		addEEnumLiteral(strengthTypeEEnum, StrengthType.MEDIUM);
		addEEnumLiteral(strengthTypeEEnum, StrengthType.STRONG);
		addEEnumLiteral(strengthTypeEEnum, StrengthType.WASTED);

		// Initialize data types
		initEDataType(amountEDataType, float.class, "Amount", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(amountEDataType, source, new String[] { "minExclusive", "0" });
	}

} //CocktailPackageImpl
