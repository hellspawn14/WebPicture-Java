/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.StyleDefinition#getStyleElements <em>Style Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getStyleDefinition()
 * @model
 * @generated
 */
public interface StyleDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Style Elements</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.StyleElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style Elements</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getStyleDefinition_StyleElements()
   * @model containment="true"
   * @generated
   */
  EList<StyleElement> getStyleElements();

} // StyleDefinition
