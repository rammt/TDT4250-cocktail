/**
 */
package tdt4250.project.model.cocktail.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tdt4250.project.model.cocktail.CocktailPackage;
import tdt4250.project.model.cocktail.CocktailParty;
import tdt4250.project.model.cocktail.Drink;
import tdt4250.project.model.cocktail.Inventory;
import tdt4250.project.model.cocktail.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.impl.CocktailPartyImpl#getInventories <em>Inventories</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.CocktailPartyImpl#getDrinkRegister <em>Drink Register</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.CocktailPartyImpl#getCocktailProducts <em>Cocktail Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CocktailPartyImpl extends MinimalEObjectImpl.Container implements CocktailParty {
	/**
	 * The cached value of the '{@link #getInventories() <em>Inventories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventories()
	 * @generated
	 * @ordered
	 */
	protected EList<Inventory> inventories;

	/**
	 * The cached value of the '{@link #getDrinkRegister() <em>Drink Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrinkRegister()
	 * @generated
	 * @ordered
	 */
	protected EList<Drink> drinkRegister;

	/**
	 * The cached value of the '{@link #getCocktailProducts() <em>Cocktail Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCocktailProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> cocktailProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CocktailPartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CocktailPackage.Literals.COCKTAIL_PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inventory> getInventories() {
		if (inventories == null) {
			inventories = new EObjectContainmentEList<Inventory>(Inventory.class, this,
					CocktailPackage.COCKTAIL_PARTY__INVENTORIES);
		}
		return inventories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drink> getDrinkRegister() {
		if (drinkRegister == null) {
			drinkRegister = new EObjectContainmentEList<Drink>(Drink.class, this,
					CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER);
		}
		return drinkRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getCocktailProducts() {
		if (cocktailProducts == null) {
			cocktailProducts = new EObjectContainmentEList<Product>(Product.class, this,
					CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS);
		}
		return cocktailProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CocktailPackage.COCKTAIL_PARTY__INVENTORIES:
			return ((InternalEList<?>) getInventories()).basicRemove(otherEnd, msgs);
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			return ((InternalEList<?>) getDrinkRegister()).basicRemove(otherEnd, msgs);
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			return ((InternalEList<?>) getCocktailProducts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CocktailPackage.COCKTAIL_PARTY__INVENTORIES:
			return getInventories();
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			return getDrinkRegister();
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			return getCocktailProducts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CocktailPackage.COCKTAIL_PARTY__INVENTORIES:
			getInventories().clear();
			getInventories().addAll((Collection<? extends Inventory>) newValue);
			return;
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			getDrinkRegister().clear();
			getDrinkRegister().addAll((Collection<? extends Drink>) newValue);
			return;
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			getCocktailProducts().clear();
			getCocktailProducts().addAll((Collection<? extends Product>) newValue);
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
		case CocktailPackage.COCKTAIL_PARTY__INVENTORIES:
			getInventories().clear();
			return;
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			getDrinkRegister().clear();
			return;
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			getCocktailProducts().clear();
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
		case CocktailPackage.COCKTAIL_PARTY__INVENTORIES:
			return inventories != null && !inventories.isEmpty();
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			return drinkRegister != null && !drinkRegister.isEmpty();
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			return cocktailProducts != null && !cocktailProducts.isEmpty();
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
		result.append("\nDrinks: ");
		result.append(this.getDrinkRegister().size());
		result.append("\nInventory: ");
		result.append(this.getInventories().size());
		result.append("\nProducts: ");
		result.append(this.getCocktailProducts().size());
		return result.toString();
	}
} //CocktailPartyImpl
