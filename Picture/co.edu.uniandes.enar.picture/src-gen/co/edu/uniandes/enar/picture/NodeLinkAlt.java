/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Link Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getParent <em>Parent</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getStyle <em>Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getTargetDecoration <em>Target Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkAlt()
 * @model
 * @generated
 */
public interface NodeLinkAlt extends NodeAlt
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
   * @see #setParent(NodeLinkDef)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkAlt_Parent()
   * @model
   * @generated
   */
  NodeLinkDef getParent();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(NodeLinkDef value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(LineStyle)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkAlt_Style()
   * @model containment="true"
   * @generated
   */
  LineStyle getStyle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(LineStyle value);

  /**
   * Returns the value of the '<em><b>Source Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Decoration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Decoration</em>' containment reference.
   * @see #setSourceDecoration(LineDecoration)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkAlt_SourceDecoration()
   * @model containment="true"
   * @generated
   */
  LineDecoration getSourceDecoration();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getSourceDecoration <em>Source Decoration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Decoration</em>' containment reference.
   * @see #getSourceDecoration()
   * @generated
   */
  void setSourceDecoration(LineDecoration value);

  /**
   * Returns the value of the '<em><b>Target Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Decoration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Decoration</em>' containment reference.
   * @see #setTargetDecoration(LineDecoration)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkAlt_TargetDecoration()
   * @model containment="true"
   * @generated
   */
  LineDecoration getTargetDecoration();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getTargetDecoration <em>Target Decoration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Decoration</em>' containment reference.
   * @see #getTargetDecoration()
   * @generated
   */
  void setTargetDecoration(LineDecoration value);

} // NodeLinkAlt
