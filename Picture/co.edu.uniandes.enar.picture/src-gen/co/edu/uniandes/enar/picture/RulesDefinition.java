/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.RulesDefinition#getRuless <em>Ruless</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getRulesDefinition()
 * @model
 * @generated
 */
public interface RulesDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Ruless</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.enar.picture.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ruless</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ruless</em>' containment reference list.
   * @see co.edu.uniandes.enar.picture.PicturePackage#getRulesDefinition_Ruless()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRuless();

} // RulesDefinition
