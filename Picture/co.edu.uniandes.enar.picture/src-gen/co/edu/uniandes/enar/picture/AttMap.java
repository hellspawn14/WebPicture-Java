/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Att Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.AttMap#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.AttMap#getLabel <em>Label</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.AttMap#getComponent <em>Component</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.AttMap#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getAttMap()
 * @model
 * @generated
 */
public interface AttMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getAttMap_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.AttMap#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getAttMap_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.AttMap#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' attribute.
   * The literals are from the enumeration {@link co.edu.uniandes.enar.picture.ComponentType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' attribute.
   * @see co.edu.uniandes.enar.picture.ComponentType
   * @see #setComponent(ComponentType)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getAttMap_Component()
   * @model
   * @generated
   */
  ComponentType getComponent();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.AttMap#getComponent <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' attribute.
   * @see co.edu.uniandes.enar.picture.ComponentType
   * @see #getComponent()
   * @generated
   */
  void setComponent(ComponentType value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getAttMap_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.AttMap#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

} // AttMap
