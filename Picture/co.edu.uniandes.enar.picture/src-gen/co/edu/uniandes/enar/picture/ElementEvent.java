/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementEvent#getCreate <em>Create</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementEvent#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getElementEvent()
 * @model
 * @generated
 */
public interface ElementEvent extends EventType
{
  /**
   * Returns the value of the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create</em>' attribute.
   * @see #setCreate(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementEvent_Create()
   * @model
   * @generated
   */
  String getCreate();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ElementEvent#getCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create</em>' attribute.
   * @see #getCreate()
   * @generated
   */
  void setCreate(String value);

  /**
   * Returns the value of the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete</em>' attribute.
   * @see #setDelete(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementEvent_Delete()
   * @model
   * @generated
   */
  String getDelete();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ElementEvent#getDelete <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' attribute.
   * @see #getDelete()
   * @generated
   */
  void setDelete(String value);

} // ElementEvent
