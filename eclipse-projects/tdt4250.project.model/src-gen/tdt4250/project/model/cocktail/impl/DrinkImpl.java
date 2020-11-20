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
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.project.model.cocktail.CocktailPackage;
import tdt4250.project.model.cocktail.Drink;
import tdt4250.project.model.cocktail.DrinkIngredient;
import tdt4250.project.model.cocktail.PriceGroupType;
import tdt4250.project.model.cocktail.StrengthType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkImpl#getRequiredIngredients <em>Required Ingredients</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkImpl#getPriceGroup <em>Price Group</em>}</li>
 *   <li>{@link tdt4250.project.model.cocktail.impl.DrinkImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrinkImpl extends MinimalEObjectImpl.Container implements Drink {
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
	 * The cached value of the '{@link #getRequiredIngredients() <em>Required Ingredients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<DrinkIngredient> requiredIngredients;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected StrengthType strength;

	/**
	 * The default value of the '{@link #getPriceGroup() <em>Price Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceGroup()
	 * @generated
	 * @ordered
	 */
	protected static final PriceGroupType PRICE_GROUP_EDEFAULT = PriceGroupType.LOW;

	/**
	 * The cached value of the '{@link #getPriceGroup() <em>Price Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceGroup()
	 * @generated
	 * @ordered
	 */
	protected PriceGroupType priceGroup = PRICE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected String instructions = INSTRUCTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CocktailPackage.Literals.DRINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DrinkIngredient> getRequiredIngredients() {
		if (requiredIngredients == null) {
			requiredIngredients = new EObjectContainmentEList<DrinkIngredient>(DrinkIngredient.class, this,
					CocktailPackage.DRINK__REQUIRED_INGREDIENTS);
		}
		return requiredIngredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrengthType getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(StrengthType newStrength) {
		StrengthType oldStrength = strength;
		strength = newStrength == null ? null : newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK__STRENGTH, oldStrength,
					strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceGroupType getPriceGroup() {
		return priceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceGroup(PriceGroupType newPriceGroup) {
		PriceGroupType oldPriceGroup = priceGroup;
		priceGroup = newPriceGroup == null ? PRICE_GROUP_EDEFAULT : newPriceGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK__PRICE_GROUP, oldPriceGroup,
					priceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructions(String newInstructions) {
		String oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocktailPackage.DRINK__INSTRUCTIONS, oldInstructions,
					instructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CocktailPackage.DRINK__REQUIRED_INGREDIENTS:
			return ((InternalEList<?>) getRequiredIngredients()).basicRemove(otherEnd, msgs);
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
		case CocktailPackage.DRINK__ID:
			return getId();
		case CocktailPackage.DRINK__NAME:
			return getName();
		case CocktailPackage.DRINK__REQUIRED_INGREDIENTS:
			return getRequiredIngredients();
		case CocktailPackage.DRINK__STRENGTH:
			return getStrength();
		case CocktailPackage.DRINK__PRICE_GROUP:
			return getPriceGroup();
		case CocktailPackage.DRINK__INSTRUCTIONS:
			return getInstructions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CocktailPackage.DRINK__ID:
			setId((Integer) newValue);
			return;
		case CocktailPackage.DRINK__NAME:
			setName((String) newValue);
			return;
		case CocktailPackage.DRINK__REQUIRED_INGREDIENTS:
			getRequiredIngredients().clear();
			getRequiredIngredients().addAll((Collection<? extends DrinkIngredient>) newValue);
			return;
		case CocktailPackage.DRINK__STRENGTH:
			setStrength((StrengthType) newValue);
			return;
		case CocktailPackage.DRINK__PRICE_GROUP:
			setPriceGroup((PriceGroupType) newValue);
			return;
		case CocktailPackage.DRINK__INSTRUCTIONS:
			setInstructions((String) newValue);
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
		case CocktailPackage.DRINK__ID:
			setId(ID_EDEFAULT);
			return;
		case CocktailPackage.DRINK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CocktailPackage.DRINK__REQUIRED_INGREDIENTS:
			getRequiredIngredients().clear();
			return;
		case CocktailPackage.DRINK__STRENGTH:
			setStrength((StrengthType) null);
			return;
		case CocktailPackage.DRINK__PRICE_GROUP:
			setPriceGroup(PRICE_GROUP_EDEFAULT);
			return;
		case CocktailPackage.DRINK__INSTRUCTIONS:
			setInstructions(INSTRUCTIONS_EDEFAULT);
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
		case CocktailPackage.DRINK__ID:
			return id != ID_EDEFAULT;
		case CocktailPackage.DRINK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CocktailPackage.DRINK__REQUIRED_INGREDIENTS:
			return requiredIngredients != null && !requiredIngredients.isEmpty();
		case CocktailPackage.DRINK__STRENGTH:
			return strength != null;
		case CocktailPackage.DRINK__PRICE_GROUP:
			return priceGroup != PRICE_GROUP_EDEFAULT;
		case CocktailPackage.DRINK__INSTRUCTIONS:
			return INSTRUCTIONS_EDEFAULT == null ? instructions != null : !INSTRUCTIONS_EDEFAULT.equals(instructions);
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
		result.append("\nDrink: (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", strength: ");
		result.append(strength);
		result.append(", priceGroup: ");
		result.append(priceGroup);
		result.append(", instructions: ");
		result.append(instructions);
		result.append(")\n");
		for (int i = 0; i < this.getRequiredIngredients().size(); i++) {
			result.append("Ingredient ");
			result.append(i + 1);
			result.append(": ");
			result.append(this.getRequiredIngredients().get(i));
		}
		return result.toString();
	}

} //DrinkImpl
