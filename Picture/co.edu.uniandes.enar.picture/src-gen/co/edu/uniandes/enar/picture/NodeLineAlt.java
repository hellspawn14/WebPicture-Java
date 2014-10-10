/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Line Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLineAlt#getParent <em>Parent</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLineAlt#getStyle <em>Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLineAlt#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLineAlt#getTargetDecoration <em>Target Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLineAlt()
 * @model
 * @generated
 */
public interface NodeLineAlt extends AttLinkAlt
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
   * @see #setParent(NodeLineDef)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLineAlt_Parent()
   * @model
   * @generated
   */
  NodeLineDef getParent();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(NodeLineDef value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' reference.
   * @see #setStyle(LineStyle)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLineAlt_Style()
   * @model
   * @generated
   */
  LineStyle getStyle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getStyle <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' reference.
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLineAlt_SourceDecoration()
   * @model containment="true"
   * @generated
   */
  LineDecoration getSourceDecoration();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getSourceDecoration <em>Source Decoration</em>}' containment reference.
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLineAlt_TargetDecoration()
   * @model containment="true"
   * @generated
   */
  LineDecoration getTargetDecoration();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getTargetDecoration <em>Target Decoration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Decoration</em>' containment reference.
   * @see #getTargetDecoration()
   * @generated
   */
  void setTargetDecoration(LineDecoration value);

} // NodeLineAlt
