/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.ViewType#getClassReference <em>Class Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getViewType()
 * @model
 * @generated
 */
public interface ViewType extends EObject
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getViewType_ClassReference()
   * @model containment="true"
   * @generated
   */
  ClassReference getClassReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ViewType#getClassReference <em>Class Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Reference</em>' containment reference.
   * @see #getClassReference()
   * @generated
   */
  void setClassReference(ClassReference value);

} // ViewType
