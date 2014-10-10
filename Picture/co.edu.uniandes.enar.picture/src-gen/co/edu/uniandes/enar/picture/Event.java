/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.Event#getEventType <em>Event Type</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Event#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Type</em>' containment reference.
   * @see #setEventType(EventType)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getEvent_EventType()
   * @model containment="true"
   * @generated
   */
  EventType getEventType();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Event#getEventType <em>Event Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Type</em>' containment reference.
   * @see #getEventType()
   * @generated
   */
  void setEventType(EventType value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getEvent_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // Event
