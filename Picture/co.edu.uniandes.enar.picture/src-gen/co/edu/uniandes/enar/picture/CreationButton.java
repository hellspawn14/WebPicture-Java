/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.CreationButton#getMetaConceptReference <em>Meta Concept Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.CreationButton#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.CreationButton#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.CreationButton#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getCreationButton()
 * @model
 * @generated
 */
public interface CreationButton extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Concept Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Concept Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Concept Reference</em>' containment reference.
   * @see #setMetaConceptReference(ClassReference)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getCreationButton_MetaConceptReference()
   * @model containment="true"
   * @generated
   */
  ClassReference getMetaConceptReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.CreationButton#getMetaConceptReference <em>Meta Concept Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Concept Reference</em>' containment reference.
   * @see #getMetaConceptReference()
   * @generated
   */
  void setMetaConceptReference(ClassReference value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getCreationButton_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.CreationButton#getName <em>Name</em>}' attribute.
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getCreationButton_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.CreationButton#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getCreationButton_Icon()
   * @model
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.CreationButton#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

} // CreationButton
