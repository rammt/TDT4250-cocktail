/**
 */
package tdt4250.project.model.cocktail.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * The cached value of the '{@link #getInventories() <em>Inventories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventories()
	 * @generated
	 * @ordered
	 */
	protected Inventory inventories;

	/**
	 * The cached value of the '{@link #getDrinkRegister() <em>Drink Register</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrinkRegister()
	 * @generated
	 * @ordered
	 */
	protected Drink drinkRegister;

	/**
	 * The cached value of the '{@link #getCocktailProducts() <em>Cocktail Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCocktailProducts()
	 * @generated
	 * @ordered
	 */
	protected Product cocktailProducts;

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
	public Inventory getInventories() {
		return inventories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventories(Inventory newInventories, NotificationChain msgs) {
		Inventory oldInventories = inventories;
		inventories = newInventories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CocktailPackage.COCKTAIL_PARTY__INVENTORIES, oldInventories, newInventories);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventories(Inventory newInventories) {
		if (newInventories != inventories) {
			NotificationChain msgs = null;
			if (inventories != null)
				msgs = ((InternalEObject) inventories).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CocktailPackage.COCKTAIL_PARTY__INVENTORIES, null, msgs);
			if (newInventories != null)
				msgs = ((InternalEObject) newInventories).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CocktailPackage.COCKTAIL_PARTY__INVENTORIES, null, msgs);
			msgs = basicSetInventories(newInventories, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.COCKTAIL_PARTY__INVENTORIES,
					newInventories, newInventories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drink getDrinkRegister() {
		return drinkRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrinkRegister(Drink newDrinkRegister, NotificationChain msgs) {
		Drink oldDrinkRegister = drinkRegister;
		drinkRegister = newDrinkRegister;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER, oldDrinkRegister, newDrinkRegister);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrinkRegister(Drink newDrinkRegister) {
		if (newDrinkRegister != drinkRegister) {
			NotificationChain msgs = null;
			if (drinkRegister != null)
				msgs = ((InternalEObject) drinkRegister).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER, null, msgs);
			if (newDrinkRegister != null)
				msgs = ((InternalEObject) newDrinkRegister).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER, null, msgs);
			msgs = basicSetDrinkRegister(newDrinkRegister, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER,
					newDrinkRegister, newDrinkRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getCocktailProducts() {
		return cocktailProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCocktailProducts(Product newCocktailProducts, NotificationChain msgs) {
		Product oldCocktailProducts = cocktailProducts;
		cocktailProducts = newCocktailProducts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS, oldCocktailProducts, newCocktailProducts);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCocktailProducts(Product newCocktailProducts) {
		if (newCocktailProducts != cocktailProducts) {
			NotificationChain msgs = null;
			if (cocktailProducts != null)
				msgs = ((InternalEObject) cocktailProducts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS, null, msgs);
			if (newCocktailProducts != null)
				msgs = ((InternalEObject) newCocktailProducts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS, null, msgs);
			msgs = basicSetCocktailProducts(newCocktailProducts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS,
					newCocktailProducts, newCocktailProducts));
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
			return basicSetInventories(null, msgs);
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			return basicSetDrinkRegister(null, msgs);
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			return basicSetCocktailProducts(null, msgs);
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CocktailPackage.COCKTAIL_PARTY__INVENTORIES:
			setInventories((Inventory) newValue);
			return;
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			setDrinkRegister((Drink) newValue);
			return;
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			setCocktailProducts((Product) newValue);
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
			setInventories((Inventory) null);
			return;
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			setDrinkRegister((Drink) null);
			return;
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			setCocktailProducts((Product) null);
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
			return inventories != null;
		case CocktailPackage.COCKTAIL_PARTY__DRINK_REGISTER:
			return drinkRegister != null;
		case CocktailPackage.COCKTAIL_PARTY__COCKTAIL_PRODUCTS:
			return cocktailProducts != null;
		}
		return super.eIsSet(featureID);
	}

} //CocktailPartyImpl
