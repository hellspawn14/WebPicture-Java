/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Link Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkDef#getStyle <em>Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkDef#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkDef#getTargetDecoration <em>Target Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkDef#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.NodeLinkDef#getTargetReference <em>Target Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkDef()
 * @model
 * @generated
 */
public interface NodeLinkDef extends NodeDef
{
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkDef_Style()
   * @model containment="true"
   * @generated
   */
  LineStyle getStyle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getStyle <em>Style</em>}' containment reference.
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkDef_SourceDecoration()
   * @model containment="true"
   * @generated
   */
  LineDecoration getSourceDecoration();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getSourceDecoration <em>Source Decoration</em>}' containment reference.
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkDef_TargetDecoration()
   * @model containment="true"
   * @generated
   */
  LineDecoration getTargetDecoration();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getTargetDecoration <em>Target Decoration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Decoration</em>' containment reference.
   * @see #getTargetDecoration()
   * @generated
   */
  void setTargetDecoration(LineDecoration value);

  /**
   * Returns the value of the '<em><b>Source Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Reference</em>' attribute.
   * @see #setSourceReference(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkDef_SourceReference()
   * @model
   * @generated
   */
  String getSourceReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getSourceReference <em>Source Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Reference</em>' attribute.
   * @see #getSourceReference()
   * @generated
   */
  void setSourceReference(String value);

  /**
   * Returns the value of the '<em><b>Target Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Reference</em>' attribute.
   * @see #setTargetReference(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getNodeLinkDef_TargetReference()
   * @model
   * @generated
   */
  String getTargetReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getTargetReference <em>Target Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Reference</em>' attribute.
   * @see #getTargetReference()
   * @generated
   */
  void setTargetReference(String value);

} // NodeLinkDef
