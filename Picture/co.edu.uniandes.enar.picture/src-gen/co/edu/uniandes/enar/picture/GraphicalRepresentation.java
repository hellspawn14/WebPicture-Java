/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getReferencePackage <em>Reference Package</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getRoot <em>Root</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getToolsDefinition <em>Tools Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getStyleDefinition <em>Style Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getGraphicalDefinition <em>Graphical Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getRulesDefinition <em>Rules Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getInteractionDefinition <em>Interaction Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation()
 * @model
 * @generated
 */
public interface GraphicalRepresentation extends EObject
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
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reference Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Package</em>' attribute.
   * @see #setReferencePackage(String)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_ReferencePackage()
   * @model
   * @generated
   */
  String getReferencePackage();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getReferencePackage <em>Reference Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Package</em>' attribute.
   * @see #getReferencePackage()
   * @generated
   */
  void setReferencePackage(String value);

  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(ROOT)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_Root()
   * @model containment="true"
   * @generated
   */
  ROOT getRoot();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(ROOT value);

  /**
   * Returns the value of the '<em><b>Tools Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tools Definition</em>' containment reference.
   * @see #setToolsDefinition(ToolDefinition)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_ToolsDefinition()
   * @model containment="true"
   * @generated
   */
  ToolDefinition getToolsDefinition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getToolsDefinition <em>Tools Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tools Definition</em>' containment reference.
   * @see #getToolsDefinition()
   * @generated
   */
  void setToolsDefinition(ToolDefinition value);

  /**
   * Returns the value of the '<em><b>Style Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style Definition</em>' containment reference.
   * @see #setStyleDefinition(StyleDefinition)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_StyleDefinition()
   * @model containment="true"
   * @generated
   */
  StyleDefinition getStyleDefinition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getStyleDefinition <em>Style Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style Definition</em>' containment reference.
   * @see #getStyleDefinition()
   * @generated
   */
  void setStyleDefinition(StyleDefinition value);

  /**
   * Returns the value of the '<em><b>Graphical Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graphical Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graphical Definition</em>' containment reference.
   * @see #setGraphicalDefinition(GraphicalDefinition)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_GraphicalDefinition()
   * @model containment="true"
   * @generated
   */
  GraphicalDefinition getGraphicalDefinition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getGraphicalDefinition <em>Graphical Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graphical Definition</em>' containment reference.
   * @see #getGraphicalDefinition()
   * @generated
   */
  void setGraphicalDefinition(GraphicalDefinition value);

  /**
   * Returns the value of the '<em><b>Rules Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules Definition</em>' containment reference.
   * @see #setRulesDefinition(RulesDefinition)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_RulesDefinition()
   * @model containment="true"
   * @generated
   */
  RulesDefinition getRulesDefinition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getRulesDefinition <em>Rules Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rules Definition</em>' containment reference.
   * @see #getRulesDefinition()
   * @generated
   */
  void setRulesDefinition(RulesDefinition value);

  /**
   * Returns the value of the '<em><b>Interaction Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Definition</em>' containment reference.
   * @see #setInteractionDefinition(InteractionDefinition)
   * @see co.edu.uniandes.enar.picture.PicturePackage#getGraphicalRepresentation_InteractionDefinition()
   * @model containment="true"
   * @generated
   */
  InteractionDefinition getInteractionDefinition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getInteractionDefinition <em>Interaction Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction Definition</em>' containment reference.
   * @see #getInteractionDefinition()
   * @generated
   */
  void setInteractionDefinition(InteractionDefinition value);

} // GraphicalRepresentation
