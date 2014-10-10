/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Att Link Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.AttLinkDef#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getAttLinkDef()
 * @model
 * @generated
 */
public interface AttLinkDef extends ElementDef
{
  /**
   * Returns the value of the '<em><b>Reference Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Name</em>' containment reference.
   * @see #setReferenceName(AttReference)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getAttLinkDef_ReferenceName()
   * @model containment="true"
   * @generated
   */
  AttReference getReferenceName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.AttLinkDef#getReferenceName <em>Reference Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Name</em>' containment reference.
   * @see #getReferenceName()
   * @generated
   */
  void setReferenceName(AttReference value);

} // AttLinkDef
