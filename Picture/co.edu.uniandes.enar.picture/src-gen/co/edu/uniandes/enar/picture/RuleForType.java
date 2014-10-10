/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule For Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.RuleForType#getClassReference <em>Class Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RuleForType#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getRuleForType()
 * @model
 * @generated
 */
public interface RuleForType extends Rule
{
  /**
   * Returns the value of the '<em><b>Class Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Reference</em>' containment reference.
   * @see #setClassReference(ClassReference)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRuleForType_ClassReference()
   * @model containment="true"
   * @generated
   */
  ClassReference getClassReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RuleForType#getClassReference <em>Class Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Reference</em>' containment reference.
   * @see #getClassReference()
   * @generated
   */
  void setClassReference(ClassReference value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.CaseType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRuleForType_Cases()
   * @model containment="true"
   * @generated
   */
  EList<CaseType> getCases();

} // RuleForType
