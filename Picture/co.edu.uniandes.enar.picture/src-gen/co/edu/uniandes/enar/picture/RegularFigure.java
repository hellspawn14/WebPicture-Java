/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularFigure#getFigureStyle <em>Figure Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularFigure#getBacgroundColor <em>Bacground Color</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularFigure#getBorder <em>Border</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularFigure#getPath <em>Path</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularFigure#getSize <em>Size</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularFigure#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularFigure()
 * @model
 * @generated
 */
public interface RegularFigure extends Figure
{
  /**
   * Returns the value of the '<em><b>Figure Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figure Style</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figure Style</em>' reference.
   * @see #setFigureStyle(FigureStyle)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularFigure_FigureStyle()
   * @model
   * @generated
   */
  FigureStyle getFigureStyle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularFigure#getFigureStyle <em>Figure Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Figure Style</em>' reference.
   * @see #getFigureStyle()
   * @generated
   */
  void setFigureStyle(FigureStyle value);

  /**
   * Returns the value of the '<em><b>Bacground Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bacground Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bacground Color</em>' reference.
   * @see #setBacgroundColor(Color)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularFigure_BacgroundColor()
   * @model
   * @generated
   */
  Color getBacgroundColor();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularFigure#getBacgroundColor <em>Bacground Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bacground Color</em>' reference.
   * @see #getBacgroundColor()
   * @generated
   */
  void setBacgroundColor(Color value);

  /**
   * Returns the value of the '<em><b>Border</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border</em>' reference.
   * @see #setBorder(LineStyle)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularFigure_Border()
   * @model
   * @generated
   */
  LineStyle getBorder();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularFigure#getBorder <em>Border</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border</em>' reference.
   * @see #getBorder()
   * @generated
   */
  void setBorder(LineStyle value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularFigure_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularFigure#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Size)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularFigure_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularFigure#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Point)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularFigure_Position()
   * @model containment="true"
   * @generated
   */
  Point getPosition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularFigure#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Point value);

} // RegularFigure
