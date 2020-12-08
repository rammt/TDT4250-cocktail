/**
 */
package tdt4250.project.model.cocktail.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.project.model.cocktail.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CocktailFactoryImpl extends EFactoryImpl implements CocktailFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CocktailFactory init() {
		try {
			CocktailFactory theCocktailFactory = (CocktailFactory) EPackage.Registry.INSTANCE
					.getEFactory(CocktailPackage.eNS_URI);
			if (theCocktailFactory != null) {
				return theCocktailFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CocktailFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CocktailFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CocktailPackage.PRODUCT:
			return createProduct();
		case CocktailPackage.COCKTAIL_PARTY:
			return createCocktailParty();
		case CocktailPackage.DRINK_INGREDIENT:
			return createDrinkIngredient();
		case CocktailPackage.DRINK:
			return createDrink();
		case CocktailPackage.INVENTORY:
			return createInventory();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CocktailPackage.AMOUNT_TYPE:
			return createAmountTypeFromString(eDataType, initialValue);
		case CocktailPackage.COMPLEXITY_TYPE:
			return createComplexityTypeFromString(eDataType, initialValue);
		case CocktailPackage.STRENGTH_TYPE:
			return createStrengthTypeFromString(eDataType, initialValue);
		case CocktailPackage.AMOUNT:
			return createAmountFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CocktailPackage.AMOUNT_TYPE:
			return convertAmountTypeToString(eDataType, instanceValue);
		case CocktailPackage.COMPLEXITY_TYPE:
			return convertComplexityTypeToString(eDataType, instanceValue);
		case CocktailPackage.STRENGTH_TYPE:
			return convertStrengthTypeToString(eDataType, instanceValue);
		case CocktailPackage.AMOUNT:
			return convertAmountToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CocktailParty createCocktailParty() {
		CocktailPartyImpl cocktailParty = new CocktailPartyImpl();
		return cocktailParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrinkIngredient createDrinkIngredient() {
		DrinkIngredientImpl drinkIngredient = new DrinkIngredientImpl();
		return drinkIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Drink createDrink() {
		DrinkImpl drink = new DrinkImpl();
		return drink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory createInventory() {
		InventoryImpl inventory = new InventoryImpl();
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType createAmountTypeFromString(EDataType eDataType, String initialValue) {
		AmountType result = AmountType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmountTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexityType createComplexityTypeFromString(EDataType eDataType, String initialValue) {
		ComplexityType result = ComplexityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplexityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrengthType createStrengthTypeFromString(EDataType eDataType, String initialValue) {
		StrengthType result = StrengthType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrengthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createAmountFromString(EDataType eDataType, String initialValue) {
		return (Float) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmountToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CocktailPackage getCocktailPackage() {
		return (CocktailPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CocktailPackage getPackage() {
		return CocktailPackage.eINSTANCE;
	}

} //CocktailFactoryImpl
