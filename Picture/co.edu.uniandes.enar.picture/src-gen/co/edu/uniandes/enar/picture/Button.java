/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.Button#getLabel <em>Label</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Button#getMethodAction <em>Method Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getButton()
 * @model
 * @generated
 */
public interface Button extends EObject
{
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getButton_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Button#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Method Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Action</em>' attribute.
   * @see #setMethodAction(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getButton_MethodAction()
   * @model
   * @generated
   */
  String getMethodAction();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Button#getMethodAction <em>Method Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Action</em>' attribute.
   * @see #getMethodAction()
   * @generated
   */
  void setMethodAction(String value);

} // Button
