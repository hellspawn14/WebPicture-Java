/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyPress <em>Key Press</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyUp <em>Key Up</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyDown <em>Key Down</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getKeyEvent()
 * @model
 * @generated
 */
public interface KeyEvent extends EventType
{
  /**
   * Returns the value of the '<em><b>Key Press</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Press</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Press</em>' attribute.
   * @see #setKeyPress(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getKeyEvent_KeyPress()
   * @model
   * @generated
   */
  String getKeyPress();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyPress <em>Key Press</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Press</em>' attribute.
   * @see #getKeyPress()
   * @generated
   */
  void setKeyPress(String value);

  /**
   * Returns the value of the '<em><b>Key Up</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Up</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Up</em>' attribute.
   * @see #setKeyUp(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getKeyEvent_KeyUp()
   * @model
   * @generated
   */
  String getKeyUp();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyUp <em>Key Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Up</em>' attribute.
   * @see #getKeyUp()
   * @generated
   */
  void setKeyUp(String value);

  /**
   * Returns the value of the '<em><b>Key Down</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Down</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Down</em>' attribute.
   * @see #setKeyDown(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getKeyEvent_KeyDown()
   * @model
   * @generated
   */
  String getKeyDown();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyDown <em>Key Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Down</em>' attribute.
   * @see #getKeyDown()
   * @generated
   */
  void setKeyDown(String value);

} // KeyEvent
