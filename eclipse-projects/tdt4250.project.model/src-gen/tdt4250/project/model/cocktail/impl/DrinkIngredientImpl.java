/**
 */
package tdt4250.project.model.cocktail.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.project.model.cocktail.AmountType;
import tdt4250.project.model.cocktail.CocktailPackage;
import tdt4250.project.model.cocktail.DrinkIngredient;
import tdt4250.project.model.cocktail.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drink Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkIngredientImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkIngredientImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkIngredientImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrinkIngredientImpl extends MinimalEObjectImpl.Container implements DrinkIngredient {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * The default value of the '{@link #getAmountType() <em>Amount Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected static final AmountType AMOUNT_TYPE_EDEFAULT = AmountType.OZ;

	/**
	 * The cached value of the '{@link #getAmountType() <em>Amount Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected AmountType amountType = AMOUNT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrinkIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CocktailPackage.Literals.DRINK_INGREDIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject) product;
			product = (Product) eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CocktailPackage.DRINK_INGREDIENT__PRODUCT,
							oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK_INGREDIENT__PRODUCT, oldProduct,
					product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmountType getAmountType() {
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountType(AmountType newAmountType) {
		AmountType oldAmountType = amountType;
		amountType = newAmountType == null ? AMOUNT_TYPE_EDEFAULT : newAmountType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK_INGREDIENT__AMOUNT_TYPE,
					oldAmountType, amountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK_INGREDIENT__AMOUNT, oldAmount,
					amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CocktailPackage.DRINK_INGREDIENT__PRODUCT:
			if (resolve)
				return getProduct();
			return basicGetProduct();
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT_TYPE:
			return getAmountType();
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT:
			return getAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CocktailPackage.DRINK_INGREDIENT__PRODUCT:
			setProduct((Product) newValue);
			return;
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT_TYPE:
			setAmountType((AmountType) newValue);
			return;
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT:
			setAmount((Float) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CocktailPackage.DRINK_INGREDIENT__PRODUCT:
			setProduct((Product) null);
			return;
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT_TYPE:
			setAmountType(AMOUNT_TYPE_EDEFAULT);
			return;
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT:
			setAmount(AMOUNT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CocktailPackage.DRINK_INGREDIENT__PRODUCT:
			return product != null;
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT_TYPE:
			return amountType != AMOUNT_TYPE_EDEFAULT;
		case CocktailPackage.DRINK_INGREDIENT__AMOUNT:
			return amount != AMOUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder("");
		result.append("(product: ");
		result.append(this.getProduct().getName());
		result.append(", amountType: ");
		result.append(amountType);
		result.append(", amount: ");
		result.append(amount);
		result.append(")\n");
		return result.toString();
	}

} //DrinkIngredientImpl
