/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Element Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementAlt#getParent <em>Parent</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementAlt#getLabelPlacement <em>Label Placement</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementAlt#getFigure <em>Figure</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementAlt#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementAlt()
 * @model
 * @generated
 */
public interface NodeElementAlt extends NodeAlt
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
   * @see #setParent(NodeElementDef)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementAlt_Parent()
   * @model
   * @generated
   */
  NodeElementDef getParent();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(NodeElementDef value);

  /**
   * Returns the value of the '<em><b>Label Placement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Placement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Placement</em>' containment reference.
   * @see #setLabelPlacement(LabelPosition)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementAlt_LabelPlacement()
   * @model containment="true"
   * @generated
   */
  LabelPosition getLabelPlacement();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getLabelPlacement <em>Label Placement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Placement</em>' containment reference.
   * @see #getLabelPlacement()
   * @generated
   */
  void setLabelPlacement(LabelPosition value);

  /**
   * Returns the value of the '<em><b>Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figure</em>' containment reference.
   * @see #setFigure(Figure)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementAlt_Figure()
   * @model containment="true"
   * @generated
   */
  Figure getFigure();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getFigure <em>Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Figure</em>' containment reference.
   * @see #getFigure()
   * @generated
   */
  void setFigure(Figure value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementAlt_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

} // NodeElementAlt
