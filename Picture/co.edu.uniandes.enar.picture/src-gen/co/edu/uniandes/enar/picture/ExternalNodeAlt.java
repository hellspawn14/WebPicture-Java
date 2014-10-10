/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Node Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.ExternalNodeAlt#getParent <em>Parent</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ExternalNodeAlt#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getExternalNodeAlt()
 * @model
 * @generated
 */
public interface ExternalNodeAlt extends AttLinkAlt
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(ExternalNodeDef)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getExternalNodeAlt_Parent()
   * @model
   * @generated
   */
  ExternalNodeDef getParent();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ExternalNodeAlt#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ExternalNodeDef value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Size)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getExternalNodeAlt_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ExternalNodeAlt#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

} // ExternalNodeAlt
