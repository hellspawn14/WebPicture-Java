/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.ToolGroup#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ToolGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ToolGroup#getToolGroups <em>Tool Groups</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ToolGroup#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getToolGroup()
 * @model
 * @generated
 */
public interface ToolGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getToolGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ToolGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getToolGroup_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ToolGroup#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getToolGroup_ToolGroups()
   * @model containment="true"
   * @generated
   */
  EList<ToolGroup> getToolGroups();

  /**
   * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.CreationButton}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buttons</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getToolGroup_Buttons()
   * @model containment="true"
   * @generated
   */
  EList<CreationButton> getButtons();

} // ToolGroup
