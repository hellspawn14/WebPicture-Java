/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementWizard#getClassReference <em>Class Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementWizard#getTitle <em>Title</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementWizard#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementWizard#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementWizard#getPages <em>Pages</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.ElementWizard#isDefaultButtons <em>Default Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getElementWizard()
 * @model
 * @generated
 */
public interface ElementWizard extends Wizard
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementWizard_ClassReference()
   * @model containment="true"
   * @generated
   */
  ClassReference getClassReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ElementWizard#getClassReference <em>Class Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Reference</em>' containment reference.
   * @see #getClassReference()
   * @generated
   */
  void setClassReference(ClassReference value);

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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementWizard_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ElementWizard#getTitle <em>Title</em>}' attribute.
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementWizard_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ElementWizard#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link co.edu.uniandes.enar.picture.WizardType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see co.edu.uniandes.enar.picture.WizardType
   * @see #setType(WizardType)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementWizard_Type()
   * @model
   * @generated
   */
  WizardType getType();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ElementWizard#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see co.edu.uniandes.enar.picture.WizardType
   * @see #getType()
   * @generated
   */
  void setType(WizardType value);

  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.Page}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementWizard_Pages()
   * @model containment="true"
   * @generated
   */
  EList<Page> getPages();

  /**
   * Returns the value of the '<em><b>Default Buttons</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Buttons</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Buttons</em>' attribute.
   * @see #setDefaultButtons(boolean)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getElementWizard_DefaultButtons()
   * @model
   * @generated
   */
  boolean isDefaultButtons();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ElementWizard#isDefaultButtons <em>Default Buttons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Buttons</em>' attribute.
   * @see #isDefaultButtons()
   * @generated
   */
  void setDefaultButtons(boolean value);

} // ElementWizard
