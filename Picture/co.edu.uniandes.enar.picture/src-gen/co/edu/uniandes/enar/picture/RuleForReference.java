/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule For Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.RuleForReference#getReference <em>Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RuleForReference#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getRuleForReference()
 * @model
 * @generated
 */
public interface RuleForReference extends Rule
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(AttReference)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRuleForReference_Reference()
   * @model containment="true"
   * @generated
   */
  AttReference getReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RuleForReference#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(AttReference value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.CaseReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRuleForReference_Cases()
   * @model containment="true"
   * @generated
   */
  EList<CaseReference> getCases();

} // RuleForReference
