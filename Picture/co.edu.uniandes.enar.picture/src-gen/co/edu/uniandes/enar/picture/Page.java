/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Page#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Page#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Page#getReferences <em>References</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Page#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPage_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Page#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPage_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Page#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.AttMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPage_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttMap> getAttributes();

  /**
   * Returns the value of the '<em><b>References</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' attribute list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPage_References()
   * @model unique="false"
   * @generated
   */
  EList<String> getReferences();

  /**
   * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.Button}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buttons</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPage_Buttons()
   * @model containment="true"
   * @generated
   */
  EList<Button> getButtons();

} // Page
