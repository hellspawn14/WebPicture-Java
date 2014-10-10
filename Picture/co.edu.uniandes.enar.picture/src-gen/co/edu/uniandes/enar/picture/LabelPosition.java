/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.LabelPosition#getInternal <em>Internal</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.LabelPosition#getExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getLabelPosition()
 * @model
 * @generated
 */
public interface LabelPosition extends EObject
{
  /**
   * Returns the value of the '<em><b>Internal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internal</em>' attribute.
   * @see #setInternal(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getLabelPosition_Internal()
   * @model
   * @generated
   */
  String getInternal();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.LabelPosition#getInternal <em>Internal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Internal</em>' attribute.
   * @see #getInternal()
   * @generated
   */
  void setInternal(String value);

  /**
   * Returns the value of the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External</em>' attribute.
   * @see #setExternal(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getLabelPosition_External()
   * @model
   * @generated
   */
  String getExternal();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.LabelPosition#getExternal <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External</em>' attribute.
   * @see #getExternal()
   * @generated
   */
  void setExternal(String value);

} // LabelPosition
