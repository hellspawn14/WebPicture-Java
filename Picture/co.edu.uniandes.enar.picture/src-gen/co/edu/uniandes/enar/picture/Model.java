/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.Model#getGraphicalREpresentation <em>Graphical REpresentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Graphical REpresentation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graphical REpresentation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graphical REpresentation</em>' containment reference.
   * @see #setGraphicalREpresentation(GraphicalRepresentation)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getModel_GraphicalREpresentation()
   * @model containment="true"
   * @generated
   */
  GraphicalRepresentation getGraphicalREpresentation();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.Model#getGraphicalREpresentation <em>Graphical REpresentation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graphical REpresentation</em>' containment reference.
   * @see #getGraphicalREpresentation()
   * @generated
   */
  void setGraphicalREpresentation(GraphicalRepresentation value);

} // Model
