/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.ToolDefinition#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ToolDefinition#getToolGroups <em>Tool Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getToolDefinition()
 * @model
 * @generated
 */
public interface ToolDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(ROOT)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getToolDefinition_Name()
   * @model
   * @generated
   */
  ROOT getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ToolDefinition#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ROOT value);

  /**
   * Returns the value of the '<em><b>Tool Groups</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.ToolGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tool Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tool Groups</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getToolDefinition_ToolGroups()
   * @model containment="true"
   * @generated
   */
  EList<ToolGroup> getToolGroups();

} // ToolDefinition
