/**
 */
package tdt4250.project.model.cocktail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Strength Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.project.model.cocktail.CocktailPackage#getStrengthType()
 * @model instanceClass="tdt4250.project.model.cocktail.StrengthType"
 * @generated
 */
public enum StrengthType implements Enumerator {
	/**
	 * The '<em><b>NON ALCOHOLIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_ALCOHOLIC_VALUE
	 * @generated
	 * @ordered
	 */
	NON_ALCOHOLIC(0, "NON_ALCOHOLIC", "NON_ALCOHOLIC"),

	/**
	 * The '<em><b>WEAK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_VALUE
	 * @generated
	 * @ordered
	 */
	WEAK(1, "WEAK", "WEAK"),

	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(2, "MEDIUM", "MEDIUM"),

	/**
	 * The '<em><b>STRONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG_VALUE
	 * @generated
	 * @ordered
	 */
	STRONG(3, "STRONG", "STRONG"),

	/**
	 * The '<em><b>WASTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASTED_VALUE
	 * @generated
	 * @ordered
	 */
	WASTED(4, "WASTED", "WASTED");

	/**
	 * The '<em><b>NON ALCOHOLIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_ALCOHOLIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_ALCOHOLIC_VALUE = 0;

	/**
	 * The '<em><b>WEAK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEAK_VALUE = 1;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 2;

	/**
	 * The '<em><b>STRONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRONG_VALUE = 3;

	/**
	 * The '<em><b>WASTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WASTED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Strength Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StrengthType[] VALUES_ARRAY = new StrengthType[] { NON_ALCOHOLIC, WEAK, MEDIUM, STRONG,
			WASTED, };

	/**
	 * A public read-only list of all the '<em><b>Strength Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StrengthType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Strength Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrengthType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrengthType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strength Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrengthType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrengthType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strength Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrengthType get(int value) {
		switch (value) {
		case NON_ALCOHOLIC_VALUE:
			return NON_ALCOHOLIC;
		case WEAK_VALUE:
			return WEAK;
		case MEDIUM_VALUE:
			return MEDIUM;
		case STRONG_VALUE:
			return STRONG;
		case WASTED_VALUE:
			return WASTED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StrengthType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //StrengthType
