/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.Point#getX <em>X</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Point#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPoint_X()
   * @model
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Point#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getPoint_Y()
   * @model
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Point#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

} // Point
