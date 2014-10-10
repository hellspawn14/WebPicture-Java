/**
 */
package co.edu.uniandes.enar.picture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.ComplexFigure#getImplementationReference <em>Implementation Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getComplexFigure()
 * @model
 * @generated
 */
public interface ComplexFigure extends Figure
{
  /**
   * Returns the value of the '<em><b>Implementation Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementation Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation Reference</em>' attribute.
   * @see #setImplementationReference(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getComplexFigure_ImplementationReference()
   * @model
   * @generated
   */
  String getImplementationReference();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.ComplexFigure#getImplementationReference <em>Implementation Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation Reference</em>' attribute.
   * @see #getImplementationReference()
   * @generated
   */
  void setImplementationReference(String value);

} // ComplexFigure
