/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.CustomFigure#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getCustomFigure()
 * @model
 * @generated
 */
public interface CustomFigure extends FigureStyle
{
  /**
   * Returns the value of the '<em><b>Points</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.Point}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getCustomFigure_Points()
   * @model containment="true"
   * @generated
   */
  EList<Point> getPoints();

} // CustomFigure
