/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeDef#getReferenceClass <em>Reference Class</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeDef#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeDef()
 * @model
 * @generated
 */
public interface NodeDef extends ElementDef
{
  /**
   * Returns the value of the '<em><b>Reference Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Class</em>' containment reference.
   * @see #setReferenceClass(ClassReference)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeDef_ReferenceClass()
   * @model containment="true"
   * @generated
   */
  ClassReference getReferenceClass();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeDef#getReferenceClass <em>Reference Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Class</em>' containment reference.
   * @see #getReferenceClass()
   * @generated
   */
  void setReferenceClass(ClassReference value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeDef_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeDef#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

} // NodeDef
