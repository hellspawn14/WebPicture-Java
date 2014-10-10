/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Element Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementDef#isLabelIcon <em>Label Icon</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementDef#getLabelPlacement <em>Label Placement</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementDef#getSize <em>Size</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementDef#getFigure <em>Figure</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeElementDef#isPhantomN <em>Phantom N</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementDef()
 * @model
 * @generated
 */
public interface NodeElementDef extends NodeDef
{
  /**
   * Returns the value of the '<em><b>Label Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Icon</em>' attribute.
   * @see #setLabelIcon(boolean)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementDef_LabelIcon()
   * @model
   * @generated
   */
  boolean isLabelIcon();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementDef#isLabelIcon <em>Label Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Icon</em>' attribute.
   * @see #isLabelIcon()
   * @generated
   */
  void setLabelIcon(boolean value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementDef_LabelPlacement()
   * @model containment="true"
   * @generated
   */
  LabelPosition getLabelPlacement();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementDef#getLabelPlacement <em>Label Placement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Placement</em>' containment reference.
   * @see #getLabelPlacement()
   * @generated
   */
  void setLabelPlacement(LabelPosition value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementDef_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementDef#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementDef_Figure()
   * @model containment="true"
   * @generated
   */
  Figure getFigure();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementDef#getFigure <em>Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Figure</em>' containment reference.
   * @see #getFigure()
   * @generated
   */
  void setFigure(Figure value);

  /**
   * Returns the value of the '<em><b>Phantom N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phantom N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phantom N</em>' attribute.
   * @see #setPhantomN(boolean)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeElementDef_PhantomN()
   * @model
   * @generated
   */
  boolean isPhantomN();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeElementDef#isPhantomN <em>Phantom N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phantom N</em>' attribute.
   * @see #isPhantomN()
   * @generated
   */
  void setPhantomN(boolean value);

} // NodeElementDef
