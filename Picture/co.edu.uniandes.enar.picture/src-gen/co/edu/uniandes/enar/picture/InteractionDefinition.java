/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.InteractionDefinition#getInteractionElements <em>Interaction Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.InteractionDefinition#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getInteractionDefinition()
 * @model
 * @generated
 */
public interface InteractionDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Interaction Elements</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.InteractionElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Elements</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getInteractionDefinition_InteractionElements()
   * @model containment="true"
   * @generated
   */
  EList<InteractionElement> getInteractionElements();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getInteractionDefinition_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // InteractionDefinition
