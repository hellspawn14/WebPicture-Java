/**
 */
package co.edu.uniandes.enar.picture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.enar.picture.PicturePackage#getComponentType()
 * @model
 * @generated
 */
public enum ComponentType implements Enumerator
{
  /**
   * The '<em><b>Text Field</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_FIELD_VALUE
   * @generated
   * @ordered
   */
  TEXT_FIELD(0, "textField", "textField"),

  /**
   * The '<em><b>Text Area</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_AREA_VALUE
   * @generated
   * @ordered
   */
  TEXT_AREA(1, "textArea", "textArea"),

  /**
   * The '<em><b>Check Box</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHECK_BOX_VALUE
   * @generated
   * @ordered
   */
  CHECK_BOX(2, "checkBox", "checkBox"),

  /**
   * The '<em><b>Combo Box</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMBO_BOX_VALUE
   * @generated
   * @ordered
   */
  COMBO_BOX(3, "comboBox", "comboBox"),

  /**
   * The '<em><b>Slider</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SLIDER_VALUE
   * @generated
   * @ordered
   */
  SLIDER(4, "slider", "Slider"),

  /**
   * The '<em><b>File Reference</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FILE_REFERENCE_VALUE
   * @generated
   * @ordered
   */
  FILE_REFERENCE(5, "fileReference", "File"),

  /**
   * The '<em><b>Image Reference</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAGE_REFERENCE_VALUE
   * @generated
   * @ordered
   */
  IMAGE_REFERENCE(6, "imageReference", "Image");

  /**
   * The '<em><b>Text Field</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text Field</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT_FIELD
   * @model name="textField"
   * @generated
   * @ordered
   */
  public static final int TEXT_FIELD_VALUE = 0;

  /**
   * The '<em><b>Text Area</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text Area</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT_AREA
   * @model name="textArea"
   * @generated
   * @ordered
   */
  public static final int TEXT_AREA_VALUE = 1;

  /**
   * The '<em><b>Check Box</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Check Box</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHECK_BOX
   * @model name="checkBox"
   * @generated
   * @ordered
   */
  public static final int CHECK_BOX_VALUE = 2;

  /**
   * The '<em><b>Combo Box</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Combo Box</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMBO_BOX
   * @model name="comboBox"
   * @generated
   * @ordered
   */
  public static final int COMBO_BOX_VALUE = 3;

  /**
   * The '<em><b>Slider</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Slider</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SLIDER
   * @model name="slider" literal="Slider"
   * @generated
   * @ordered
   */
  public static final int SLIDER_VALUE = 4;

  /**
   * The '<em><b>File Reference</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>File Reference</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FILE_REFERENCE
   * @model name="fileReference" literal="File"
   * @generated
   * @ordered
   */
  public static final int FILE_REFERENCE_VALUE = 5;

  /**
   * The '<em><b>Image Reference</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Image Reference</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMAGE_REFERENCE
   * @model name="imageReference" literal="Image"
   * @generated
   * @ordered
   */
  public static final int IMAGE_REFERENCE_VALUE = 6;

  /**
   * An array of all the '<em><b>Component Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ComponentType[] VALUES_ARRAY =
    new ComponentType[]
    {
      TEXT_FIELD,
      TEXT_AREA,
      CHECK_BOX,
      COMBO_BOX,
      SLIDER,
      FILE_REFERENCE,
      IMAGE_REFERENCE,
    };

  /**
   * A public read-only list of all the '<em><b>Component Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ComponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Component Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComponentType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ComponentType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Component Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComponentType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ComponentType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Component Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComponentType get(int value)
  {
    switch (value)
    {
      case TEXT_FIELD_VALUE: return TEXT_FIELD;
      case TEXT_AREA_VALUE: return TEXT_AREA;
      case CHECK_BOX_VALUE: return CHECK_BOX;
      case COMBO_BOX_VALUE: return COMBO_BOX;
      case SLIDER_VALUE: return SLIDER;
      case FILE_REFERENCE_VALUE: return FILE_REFERENCE;
      case IMAGE_REFERENCE_VALUE: return IMAGE_REFERENCE;
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
  private ComponentType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ComponentType
