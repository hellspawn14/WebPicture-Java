/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.CaseReference#getCondition <em>Condition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.CaseReference#getReferenceElement <em>Reference Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getCaseReference()
 * @model
 * @generated
 */
public interface CaseReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getCaseReference_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.CaseReference#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Reference Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Element</em>' reference.
   * @see #setReferenceElement(AttLinkAlt)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getCaseReference_ReferenceElement()
   * @model
   * @generated
   */
  AttLinkAlt getReferenceElement();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.CaseReference#getReferenceElement <em>Reference Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Element</em>' reference.
   * @see #getReferenceElement()
   * @generated
   */
  void setReferenceElement(AttLinkAlt value);

} // CaseReference
