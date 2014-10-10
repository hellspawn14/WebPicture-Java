/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predefined View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.PredefinedView#getTitle <em>Title</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.PredefinedView#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.PredefinedView#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.PredefinedView#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getPredefinedView()
 * @model
 * @generated
 */
public interface PredefinedView extends View
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPredefinedView_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.PredefinedView#getTitle <em>Title</em>}' attribute.
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPredefinedView_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.PredefinedView#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ViewType)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPredefinedView_Type()
   * @model containment="true"
   * @generated
   */
  ViewType getType();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.PredefinedView#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ViewType value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(ViewStyle)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPredefinedView_Style()
   * @model containment="true"
   * @generated
   */
  ViewStyle getStyle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.PredefinedView#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(ViewStyle value);

} // PredefinedView
