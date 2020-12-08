/**
 */
package tdt4250.project.model.cocktail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Amount Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.project.model.cocktail.CocktailPackage#getAmountType()
 * @model
 * @generated
 */
public enum AmountType implements Enumerator {
	/**
	 * The '<em><b>Oz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #OZ_VALUE
	 * @generated
	 * @ordered
	 */
	OZ(1, "oz", "oz"),
	/**
	 * The '<em><b>Tsp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TSP_VALUE
	 * @generated
	 * @ordered
	 */
	TSP(2, "tsp", "tsp"),
	/**
	 * The '<em><b>Cl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CL_VALUE
	 * @generated
	 * @ordered
	 */
	CL(3, "cl", "cl"),

	/**
	 * The '<em><b>Dash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASH_VALUE
	 * @generated
	 * @ordered
	 */
	DASH(4, "dash", "dash"),
	/**
	 * The '<em><b>Cube</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CUBE_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE(5, "cube", "cube"),
	/**
	 * The '<em><b>Splash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SPLASH_VALUE
	 * @generated
	 * @ordered
	 */
	SPLASH(6, "splash", "splash"),
	/**
	 * The '<em><b>Slice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SLICE_VALUE
	 * @generated
	 * @ordered
	 */
	SLICE(7, "slice", "slice"),
	/**
	 * The '<em><b>Twist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TWIST_VALUE
	 * @generated
	 * @ordered
	 */
	TWIST(8, "twist", "twist"),
	/**
	 * The '<em><b>Tablespoon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TABLESPOON_VALUE
	 * @generated
	 * @ordered
	 */
	TABLESPOON(9, "tablespoon", "tablespoon"),
	/**
	 * The '<em><b>Drop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DROP_VALUE
	 * @generated
	 * @ordered
	 */
	DROP(10, "drop", "drop"),
	/**
	 * The '<em><b>Wedge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	WEDGE(11, "wedge", "wedge"),
	/**
	 * The '<em><b>Whole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	WHOLE(12, "whole", "whole"),
	/**
	 * The '<em><b>Piece</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PIECE_VALUE
	 * @generated
	 * @ordered
	 */
	PIECE(13, "piece", "piece"),
	/**
	 * The '<em><b>Cup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CUP_VALUE
	 * @generated
	 * @ordered
	 */
	CUP(14, "cup", "cup"),
	/**
	 * The '<em><b>Chunk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CHUNK_VALUE
	 * @generated
	 * @ordered
	 */
	CHUNK(15, "chunk", "chunk"),
	/**
	 * The '<em><b>Part</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PART_VALUE
	 * @generated
	 * @ordered
	 */
	PART(16, "part", "part"),
	/**
	 * The '<em><b>Large</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE(17, "large", "large"),
	/**
	 * The '<em><b>Lb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LB_VALUE
	 * @generated
	 * @ordered
	 */
	LB(18, "lb", "lb"),
	/**
	 * The '<em><b>Frozen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #FROZEN_VALUE
	 * @generated
	 * @ordered
	 */
	FROZEN(19, "frozen", "frozen"),
	/**
	 * The '<em><b>Can</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CAN_VALUE
	 * @generated
	 * @ordered
	 */
	CAN(20, "can", "can"),
	/**
	 * The '<em><b>L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #L_VALUE
	 * @generated
	 * @ordered
	 */
	L(21, "l", "l"),
	/**
	 * The '<em><b>Pinch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PINCH_VALUE
	 * @generated
	 * @ordered
	 */
	PINCH(22, "pinch", "pinch"),
	/**
	 * The '<em><b>Gal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GAL_VALUE
	 * @generated
	 * @ordered
	 */
	GAL(23, "gal", "gal"),
	/**
	 * The '<em><b>Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND(24, "ground", "ground"),
	/**
	 * The '<em><b>Inch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #INCH_VALUE
	 * @generated
	 * @ordered
	 */
	INCH(25, "inch", "inch"),
	/**
	 * The '<em><b>Qt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #QT_VALUE
	 * @generated
	 * @ordered
	 */
	QT(26, "qt", "qt"),
	/**
	 * The '<em><b>Gr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GR_VALUE
	 * @generated
	 * @ordered
	 */
	GR(27, "gr", "gr"),
	/**
	 * The '<em><b>Stick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #STICK_VALUE
	 * @generated
	 * @ordered
	 */
	STICK(28, "stick", "stick"),
	/**
	 * The '<em><b>Strip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #STRIP_VALUE
	 * @generated
	 * @ordered
	 */
	STRIP(29, "strip", "strip"),
	/**
	 * The '<em><b>Beaten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BEATEN_VALUE
	 * @generated
	 * @ordered
	 */
	BEATEN(30, "beaten", "beaten"),
	/**
	 * The '<em><b>Crushed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CRUSHED_VALUE
	 * @generated
	 * @ordered
	 */
	CRUSHED(31, "crushed", "crushed"),
	/**
	 * The '<em><b>Cubes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CUBES_VALUE
	 * @generated
	 * @ordered
	 */
	CUBES(32, "cubes", "cubes"),
	/**
	 * The '<em><b>Bottle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BOTTLE_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTLE(33, "bottle", "bottle"),
	/**
	 * The '<em><b>Ml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ML_VALUE
	 * @generated
	 * @ordered
	 */
	ML(34, "ml", "ml"),
	/**
	 * The '<em><b>Cracked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CRACKED_VALUE
	 * @generated
	 * @ordered
	 */
	CRACKED(35, "cracked", "cracked"),
	/**
	 * The '<em><b>One inch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ONE_INCH_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_INCH(36, "one_inch", "one_inch"),
	/**
	 * The '<em><b>Kg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #KG_VALUE
	 * @generated
	 * @ordered
	 */
	KG(37, "kg", "kg"),
	/**
	 * The '<em><b>Pint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PINT_VALUE
	 * @generated
	 * @ordered
	 */
	PINT(38, "pint", "pint"),
	/**
	 * The '<em><b>Ripe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #RIPE_VALUE
	 * @generated
	 * @ordered
	 */
	RIPE(39, "ripe", "ripe"),
	/**
	 * The '<em><b>Dl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DL_VALUE
	 * @generated
	 * @ordered
	 */
	DL(40, "dl", "dl"),
	/**
	 * The '<em><b>Scoop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SCOOP_VALUE
	 * @generated
	 * @ordered
	 */
	SCOOP(41, "scoop", "scoop"),
	/**
	 * The '<em><b>Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE(42, "measure", "measure"),
	/**
	 * The '<em><b>Glass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	GLASS(43, "glass", "glass"),
	/**
	 * The '<em><b>Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE(44, "package", "package"),
	/**
	 * The '<em><b>Handful</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #HANDFUL_VALUE
	 * @generated
	 * @ordered
	 */
	HANDFUL(45, "handful", "handful"),
	/**
	 * The '<em><b>Jigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #JIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	JIGGER(46, "jigger", "jigger"),
	/**
	 * The '<em><b>Sprig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SPRIG_VALUE
	 * @generated
	 * @ordered
	 */
	SPRIG(47, "sprig", "sprig"),
	/**
	 * The '<em><b>Leave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LEAVE_VALUE
	 * @generated
	 * @ordered
	 */
	LEAVE(48, "leave", "leave"),
	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(49, "long", "long"),
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown");

	/**
	 * The '<em><b>Oz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OZ
	 * @model name="oz"
	 * @generated
	 * @ordered
	 */
	public static final int OZ_VALUE = 1;

	/**
	 * The '<em><b>Tsp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TSP
	 * @model name="tsp"
	 * @generated
	 * @ordered
	 */
	public static final int TSP_VALUE = 2;

	/**
	 * The '<em><b>Cl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CL
	 * @model name="cl"
	 * @generated
	 * @ordered
	 */
	public static final int CL_VALUE = 3;

	/**
	 * The '<em><b>Dash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASH
	 * @model name="dash"
	 * @generated
	 * @ordered
	 */
	public static final int DASH_VALUE = 4;

	/**
	 * The '<em><b>Cube</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE
	 * @model name="cube"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE_VALUE = 5;

	/**
	 * The '<em><b>Splash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLASH
	 * @model name="splash"
	 * @generated
	 * @ordered
	 */
	public static final int SPLASH_VALUE = 6;

	/**
	 * The '<em><b>Slice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLICE
	 * @model name="slice"
	 * @generated
	 * @ordered
	 */
	public static final int SLICE_VALUE = 7;

	/**
	 * The '<em><b>Twist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWIST
	 * @model name="twist"
	 * @generated
	 * @ordered
	 */
	public static final int TWIST_VALUE = 8;

	/**
	 * The '<em><b>Tablespoon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLESPOON
	 * @model name="tablespoon"
	 * @generated
	 * @ordered
	 */
	public static final int TABLESPOON_VALUE = 9;

	/**
	 * The '<em><b>Drop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP
	 * @model name="drop"
	 * @generated
	 * @ordered
	 */
	public static final int DROP_VALUE = 10;

	/**
	 * The '<em><b>Wedge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEDGE
	 * @model name="wedge"
	 * @generated
	 * @ordered
	 */
	public static final int WEDGE_VALUE = 11;

	/**
	 * The '<em><b>Whole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHOLE
	 * @model name="whole"
	 * @generated
	 * @ordered
	 */
	public static final int WHOLE_VALUE = 12;

	/**
	 * The '<em><b>Piece</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIECE
	 * @model name="piece"
	 * @generated
	 * @ordered
	 */
	public static final int PIECE_VALUE = 13;

	/**
	 * The '<em><b>Cup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUP
	 * @model name="cup"
	 * @generated
	 * @ordered
	 */
	public static final int CUP_VALUE = 14;

	/**
	 * The '<em><b>Chunk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHUNK
	 * @model name="chunk"
	 * @generated
	 * @ordered
	 */
	public static final int CHUNK_VALUE = 15;

	/**
	 * The '<em><b>Part</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART
	 * @model name="part"
	 * @generated
	 * @ordered
	 */
	public static final int PART_VALUE = 16;

	/**
	 * The '<em><b>Large</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE
	 * @model name="large"
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_VALUE = 17;

	/**
	 * The '<em><b>Lb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LB
	 * @model name="lb"
	 * @generated
	 * @ordered
	 */
	public static final int LB_VALUE = 18;

	/**
	 * The '<em><b>Frozen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROZEN
	 * @model name="frozen"
	 * @generated
	 * @ordered
	 */
	public static final int FROZEN_VALUE = 19;

	/**
	 * The '<em><b>Can</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN
	 * @model name="can"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_VALUE = 20;

	/**
	 * The '<em><b>L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L
	 * @model name="l"
	 * @generated
	 * @ordered
	 */
	public static final int L_VALUE = 21;

	/**
	 * The '<em><b>Pinch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINCH
	 * @model name="pinch"
	 * @generated
	 * @ordered
	 */
	public static final int PINCH_VALUE = 22;

	/**
	 * The '<em><b>Gal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAL
	 * @model name="gal"
	 * @generated
	 * @ordered
	 */
	public static final int GAL_VALUE = 23;

	/**
	 * The '<em><b>Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND
	 * @model name="ground"
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_VALUE = 24;

	/**
	 * The '<em><b>Inch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCH
	 * @model name="inch"
	 * @generated
	 * @ordered
	 */
	public static final int INCH_VALUE = 25;

	/**
	 * The '<em><b>Qt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QT
	 * @model name="qt"
	 * @generated
	 * @ordered
	 */
	public static final int QT_VALUE = 26;

	/**
	 * The '<em><b>Gr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GR
	 * @model name="gr"
	 * @generated
	 * @ordered
	 */
	public static final int GR_VALUE = 27;

	/**
	 * The '<em><b>Stick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STICK
	 * @model name="stick"
	 * @generated
	 * @ordered
	 */
	public static final int STICK_VALUE = 28;

	/**
	 * The '<em><b>Strip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRIP
	 * @model name="strip"
	 * @generated
	 * @ordered
	 */
	public static final int STRIP_VALUE = 29;

	/**
	 * The '<em><b>Beaten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEATEN
	 * @model name="beaten"
	 * @generated
	 * @ordered
	 */
	public static final int BEATEN_VALUE = 30;

	/**
	 * The '<em><b>Crushed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUSHED
	 * @model name="crushed"
	 * @generated
	 * @ordered
	 */
	public static final int CRUSHED_VALUE = 31;

	/**
	 * The '<em><b>Cubes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBES
	 * @model name="cubes"
	 * @generated
	 * @ordered
	 */
	public static final int CUBES_VALUE = 32;

	/**
	 * The '<em><b>Bottle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTLE
	 * @model name="bottle"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTLE_VALUE = 33;

	/**
	 * The '<em><b>Ml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ML
	 * @model name="ml"
	 * @generated
	 * @ordered
	 */
	public static final int ML_VALUE = 34;

	/**
	 * The '<em><b>Cracked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRACKED
	 * @model name="cracked"
	 * @generated
	 * @ordered
	 */
	public static final int CRACKED_VALUE = 35;

	/**
	 * The '<em><b>One inch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_INCH
	 * @model name="one_inch"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_INCH_VALUE = 36;

	/**
	 * The '<em><b>Kg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KG
	 * @model name="kg"
	 * @generated
	 * @ordered
	 */
	public static final int KG_VALUE = 37;

	/**
	 * The '<em><b>Pint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINT
	 * @model name="pint"
	 * @generated
	 * @ordered
	 */
	public static final int PINT_VALUE = 38;

	/**
	 * The '<em><b>Ripe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIPE
	 * @model name="ripe"
	 * @generated
	 * @ordered
	 */
	public static final int RIPE_VALUE = 39;

	/**
	 * The '<em><b>Dl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DL
	 * @model name="dl"
	 * @generated
	 * @ordered
	 */
	public static final int DL_VALUE = 40;

	/**
	 * The '<em><b>Scoop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCOOP
	 * @model name="scoop"
	 * @generated
	 * @ordered
	 */
	public static final int SCOOP_VALUE = 41;

	/**
	 * The '<em><b>Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE
	 * @model name="measure"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_VALUE = 42;

	/**
	 * The '<em><b>Glass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLASS
	 * @model name="glass"
	 * @generated
	 * @ordered
	 */
	public static final int GLASS_VALUE = 43;

	/**
	 * The '<em><b>Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @model name="package"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_VALUE = 44;

	/**
	 * The '<em><b>Handful</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDFUL
	 * @model name="handful"
	 * @generated
	 * @ordered
	 */
	public static final int HANDFUL_VALUE = 45;

	/**
	 * The '<em><b>Jigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JIGGER
	 * @model name="jigger"
	 * @generated
	 * @ordered
	 */
	public static final int JIGGER_VALUE = 46;

	/**
	 * The '<em><b>Sprig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRIG
	 * @model name="sprig"
	 * @generated
	 * @ordered
	 */
	public static final int SPRIG_VALUE = 47;

	/**
	 * The '<em><b>Leave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAVE
	 * @model name="leave"
	 * @generated
	 * @ordered
	 */
	public static final int LEAVE_VALUE = 48;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 49;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Amount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AmountType[] VALUES_ARRAY = new AmountType[] { OZ, TSP, CL, DASH, CUBE, SPLASH, SLICE, TWIST,
			TABLESPOON, DROP, WEDGE, WHOLE, PIECE, CUP, CHUNK, PART, LARGE, LB, FROZEN, CAN, L, PINCH, GAL, GROUND,
			INCH, QT, GR, STICK, STRIP, BEATEN, CRUSHED, CUBES, BOTTLE, ML, CRACKED, ONE_INCH, KG, PINT, RIPE, DL,
			SCOOP, MEASURE, GLASS, PACKAGE, HANDFUL, JIGGER, SPRIG, LEAVE, LONG, UNKNOWN, };

	/**
	 * A public read-only list of all the '<em><b>Amount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AmountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Amount Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmountType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmountType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmountType get(int value) {
		switch (value) {
		case OZ_VALUE:
			return OZ;
		case TSP_VALUE:
			return TSP;
		case CL_VALUE:
			return CL;
		case DASH_VALUE:
			return DASH;
		case CUBE_VALUE:
			return CUBE;
		case SPLASH_VALUE:
			return SPLASH;
		case SLICE_VALUE:
			return SLICE;
		case TWIST_VALUE:
			return TWIST;
		case TABLESPOON_VALUE:
			return TABLESPOON;
		case DROP_VALUE:
			return DROP;
		case WEDGE_VALUE:
			return WEDGE;
		case WHOLE_VALUE:
			return WHOLE;
		case PIECE_VALUE:
			return PIECE;
		case CUP_VALUE:
			return CUP;
		case CHUNK_VALUE:
			return CHUNK;
		case PART_VALUE:
			return PART;
		case LARGE_VALUE:
			return LARGE;
		case LB_VALUE:
			return LB;
		case FROZEN_VALUE:
			return FROZEN;
		case CAN_VALUE:
			return CAN;
		case L_VALUE:
			return L;
		case PINCH_VALUE:
			return PINCH;
		case GAL_VALUE:
			return GAL;
		case GROUND_VALUE:
			return GROUND;
		case INCH_VALUE:
			return INCH;
		case QT_VALUE:
			return QT;
		case GR_VALUE:
			return GR;
		case STICK_VALUE:
			return STICK;
		case STRIP_VALUE:
			return STRIP;
		case BEATEN_VALUE:
			return BEATEN;
		case CRUSHED_VALUE:
			return CRUSHED;
		case CUBES_VALUE:
			return CUBES;
		case BOTTLE_VALUE:
			return BOTTLE;
		case ML_VALUE:
			return ML;
		case CRACKED_VALUE:
			return CRACKED;
		case ONE_INCH_VALUE:
			return ONE_INCH;
		case KG_VALUE:
			return KG;
		case PINT_VALUE:
			return PINT;
		case RIPE_VALUE:
			return RIPE;
		case DL_VALUE:
			return DL;
		case SCOOP_VALUE:
			return SCOOP;
		case MEASURE_VALUE:
			return MEASURE;
		case GLASS_VALUE:
			return GLASS;
		case PACKAGE_VALUE:
			return PACKAGE;
		case HANDFUL_VALUE:
			return HANDFUL;
		case JIGGER_VALUE:
			return JIGGER;
		case SPRIG_VALUE:
			return SPRIG;
		case LEAVE_VALUE:
			return LEAVE;
		case LONG_VALUE:
			return LONG;
		case UNKNOWN_VALUE:
			return UNKNOWN;
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
	private AmountType(int value, String name, String literal) {
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

} //AmountType
