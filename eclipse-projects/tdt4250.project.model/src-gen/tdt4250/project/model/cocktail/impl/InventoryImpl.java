/**
 */
package tdt4250.project.model.cocktail.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import tdt4250.project.model.cocktail.CocktailPackage;
import tdt4250.project.model.cocktail.CocktailParty;
import tdt4250.project.model.cocktail.DrinkIngredient;
import tdt4250.project.model.cocktail.Inventory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.impl.InventoryImpl#getAvailableIngredients <em>Available Ingredients</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.InventoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.InventoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.InventoryImpl#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryImpl extends MinimalEObjectImpl.Container implements Inventory {
	/**
	 * The cached value of the '{@link #getAvailableIngredients() <em>Available Ingredients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<DrinkIngredient> availableIngredients;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CocktailPackage.Literals.INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DrinkIngredient> getAvailableIngredients() {
		if (availableIngredients == null) {
			availableIngredients = new EObjectContainmentEList<DrinkIngredient>(DrinkIngredient.class, this,
					CocktailPackage.INVENTORY__AVAILABLE_INGREDIENTS);
		}
		return availableIngredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.INVENTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.INVENTORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CocktailParty getParty() {
		if (eContainerFeatureID() != CocktailPackage.INVENTORY__PARTY)
			return null;
		return (CocktailParty) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParty(CocktailParty newParty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParty, CocktailPackage.INVENTORY__PARTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParty(CocktailParty newParty) {
		if (newParty != eInternalContainer()
				|| (eContainerFeatureID() != CocktailPackage.INVENTORY__PARTY && newParty != null)) {
			if (EcoreUtil.isAncestor(this, newParty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParty != null)
				msgs = ((InternalEObject) newParty).eInverseAdd(this, CocktailPackage.COCKTAIL_PARTY__INVENTORIES,
						CocktailParty.class, msgs);
			msgs = basicSetParty(newParty, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.INVENTORY__PARTY, newParty,
					newParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CocktailPackage.INVENTORY__PARTY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParty((CocktailParty) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CocktailPackage.INVENTORY__AVAILABLE_INGREDIENTS:
			return ((InternalEList<?>) getAvailableIngredients()).basicRemove(otherEnd, msgs);
		case CocktailPackage.INVENTORY__PARTY:
			return basicSetParty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CocktailPackage.INVENTORY__PARTY:
			return eInternalContainer().eInverseRemove(this, CocktailPackage.COCKTAIL_PARTY__INVENTORIES,
					CocktailParty.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CocktailPackage.INVENTORY__AVAILABLE_INGREDIENTS:
			return getAvailableIngredients();
		case CocktailPackage.INVENTORY__NAME:
			return getName();
		case CocktailPackage.INVENTORY__ID:
			return getId();
		case CocktailPackage.INVENTORY__PARTY:
			return getParty();
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
		case CocktailPackage.INVENTORY__AVAILABLE_INGREDIENTS:
			getAvailableIngredients().clear();
			getAvailableIngredients().addAll((Collection<? extends DrinkIngredient>) newValue);
			return;
		case CocktailPackage.INVENTORY__NAME:
			setName((String) newValue);
			return;
		case CocktailPackage.INVENTORY__ID:
			setId((Integer) newValue);
			return;
		case CocktailPackage.INVENTORY__PARTY:
			setParty((CocktailParty) newValue);
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
		case CocktailPackage.INVENTORY__AVAILABLE_INGREDIENTS:
			getAvailableIngredients().clear();
			return;
		case CocktailPackage.INVENTORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CocktailPackage.INVENTORY__ID:
			setId(ID_EDEFAULT);
			return;
		case CocktailPackage.INVENTORY__PARTY:
			setParty((CocktailParty) null);
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
		case CocktailPackage.INVENTORY__AVAILABLE_INGREDIENTS:
			return availableIngredients != null && !availableIngredients.isEmpty();
		case CocktailPackage.INVENTORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CocktailPackage.INVENTORY__ID:
			return id != ID_EDEFAULT;
		case CocktailPackage.INVENTORY__PARTY:
			return getParty() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InventoryImpl
