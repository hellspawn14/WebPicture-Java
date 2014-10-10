/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.LineStyle#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.LineStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.LineStyle#getLineType <em>Line Type</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.LineStyle#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getLineStyle()
 * @model
 * @generated
 */
public interface LineStyle extends StyleElement
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getLineStyle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.LineStyle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getLineStyle_Width()
   * @model
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.LineStyle#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Line Type</b></em>' attribute.
   * The literals are from the enumeration {@link co.edu.uniandes.enar.picture.LineType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Type</em>' attribute.
   * @see co.edu.uniandes.enar.picture.LineType
   * @see #setLineType(LineType)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getLineStyle_LineType()
   * @model
   * @generated
   */
  LineType getLineType();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.LineStyle#getLineType <em>Line Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Type</em>' attribute.
   * @see co.edu.uniandes.enar.picture.LineType
   * @see #getLineType()
   * @generated
   */
  void setLineType(LineType value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' reference.
   * @see #setColor(Color)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getLineStyle_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.LineStyle#getColor <em>Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // LineStyle
