/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularPolygon#getVertexCant <em>Vertex Cant</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.RegularPolygon#getStartAngle <em>Start Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularPolygon()
 * @model
 * @generated
 */
public interface RegularPolygon extends FigureStyle
{
  /**
   * Returns the value of the '<em><b>Vertex Cant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertex Cant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertex Cant</em>' attribute.
   * @see #setVertexCant(int)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularPolygon_VertexCant()
   * @model
   * @generated
   */
  int getVertexCant();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularPolygon#getVertexCant <em>Vertex Cant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertex Cant</em>' attribute.
   * @see #getVertexCant()
   * @generated
   */
  void setVertexCant(int value);

  /**
   * Returns the value of the '<em><b>Start Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Angle</em>' attribute.
   * @see #setStartAngle(int)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRegularPolygon_StartAngle()
   * @model
   * @generated
   */
  int getStartAngle();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.RegularPolygon#getStartAngle <em>Start Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Angle</em>' attribute.
   * @see #getStartAngle()
   * @generated
   */
  void setStartAngle(int value);

} // RegularPolygon
