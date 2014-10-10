/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.GraphicalDefinition;
import co.edu.uniandes.enar.picture.GraphicalRepresentation;
import co.edu.uniandes.enar.picture.InteractionDefinition;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.ROOT;
import co.edu.uniandes.enar.picture.RulesDefinition;
import co.edu.uniandes.enar.picture.StyleDefinition;
import co.edu.uniandes.enar.picture.ToolDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getReferencePackage <em>Reference Package</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getToolsDefinition <em>Tools Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getStyleDefinition <em>Style Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getGraphicalDefinition <em>Graphical Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getRulesDefinition <em>Rules Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl#getInteractionDefinition <em>Interaction Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphicalRepresentationImpl extends MinimalEObjectImpl.Container implements GraphicalRepresentation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getReferencePackage() <em>Reference Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencePackage()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferencePackage() <em>Reference Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencePackage()
   * @generated
   * @ordered
   */
  protected String referencePackage = REFERENCE_PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected ROOT root;

  /**
   * The cached value of the '{@link #getToolsDefinition() <em>Tools Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolsDefinition()
   * @generated
   * @ordered
   */
  protected ToolDefinition toolsDefinition;

  /**
   * The cached value of the '{@link #getStyleDefinition() <em>Style Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleDefinition()
   * @generated
   * @ordered
   */
  protected StyleDefinition styleDefinition;

  /**
   * The cached value of the '{@link #getGraphicalDefinition() <em>Graphical Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphicalDefinition()
   * @generated
   * @ordered
   */
  protected GraphicalDefinition graphicalDefinition;

  /**
   * The cached value of the '{@link #getRulesDefinition() <em>Rules Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRulesDefinition()
   * @generated
   * @ordered
   */
  protected RulesDefinition rulesDefinition;

  /**
   * The cached value of the '{@link #getInteractionDefinition() <em>Interaction Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionDefinition()
   * @generated
   * @ordered
   */
  protected InteractionDefinition interactionDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphicalRepresentationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PicturePackage.Literals.GRAPHICAL_REPRESENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferencePackage()
  {
    return referencePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencePackage(String newReferencePackage)
  {
    String oldReferencePackage = referencePackage;
    referencePackage = newReferencePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE, oldReferencePackage, referencePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ROOT getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(ROOT newRoot, NotificationChain msgs)
  {
    ROOT oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__ROOT, oldRoot, newRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(ROOT newRoot)
  {
    if (newRoot != root)
    {
      NotificationChain msgs = null;
      if (root != null)
        msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__ROOT, null, msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__ROOT, null, msgs);
      msgs = basicSetRoot(newRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__ROOT, newRoot, newRoot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolDefinition getToolsDefinition()
  {
    return toolsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToolsDefinition(ToolDefinition newToolsDefinition, NotificationChain msgs)
  {
    ToolDefinition oldToolsDefinition = toolsDefinition;
    toolsDefinition = newToolsDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION, oldToolsDefinition, newToolsDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToolsDefinition(ToolDefinition newToolsDefinition)
  {
    if (newToolsDefinition != toolsDefinition)
    {
      NotificationChain msgs = null;
      if (toolsDefinition != null)
        msgs = ((InternalEObject)toolsDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION, null, msgs);
      if (newToolsDefinition != null)
        msgs = ((InternalEObject)newToolsDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION, null, msgs);
      msgs = basicSetToolsDefinition(newToolsDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION, newToolsDefinition, newToolsDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleDefinition getStyleDefinition()
  {
    return styleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyleDefinition(StyleDefinition newStyleDefinition, NotificationChain msgs)
  {
    StyleDefinition oldStyleDefinition = styleDefinition;
    styleDefinition = newStyleDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION, oldStyleDefinition, newStyleDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyleDefinition(StyleDefinition newStyleDefinition)
  {
    if (newStyleDefinition != styleDefinition)
    {
      NotificationChain msgs = null;
      if (styleDefinition != null)
        msgs = ((InternalEObject)styleDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION, null, msgs);
      if (newStyleDefinition != null)
        msgs = ((InternalEObject)newStyleDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION, null, msgs);
      msgs = basicSetStyleDefinition(newStyleDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION, newStyleDefinition, newStyleDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphicalDefinition getGraphicalDefinition()
  {
    return graphicalDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGraphicalDefinition(GraphicalDefinition newGraphicalDefinition, NotificationChain msgs)
  {
    GraphicalDefinition oldGraphicalDefinition = graphicalDefinition;
    graphicalDefinition = newGraphicalDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION, oldGraphicalDefinition, newGraphicalDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraphicalDefinition(GraphicalDefinition newGraphicalDefinition)
  {
    if (newGraphicalDefinition != graphicalDefinition)
    {
      NotificationChain msgs = null;
      if (graphicalDefinition != null)
        msgs = ((InternalEObject)graphicalDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION, null, msgs);
      if (newGraphicalDefinition != null)
        msgs = ((InternalEObject)newGraphicalDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION, null, msgs);
      msgs = basicSetGraphicalDefinition(newGraphicalDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION, newGraphicalDefinition, newGraphicalDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RulesDefinition getRulesDefinition()
  {
    return rulesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRulesDefinition(RulesDefinition newRulesDefinition, NotificationChain msgs)
  {
    RulesDefinition oldRulesDefinition = rulesDefinition;
    rulesDefinition = newRulesDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION, oldRulesDefinition, newRulesDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRulesDefinition(RulesDefinition newRulesDefinition)
  {
    if (newRulesDefinition != rulesDefinition)
    {
      NotificationChain msgs = null;
      if (rulesDefinition != null)
        msgs = ((InternalEObject)rulesDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION, null, msgs);
      if (newRulesDefinition != null)
        msgs = ((InternalEObject)newRulesDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION, null, msgs);
      msgs = basicSetRulesDefinition(newRulesDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION, newRulesDefinition, newRulesDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionDefinition getInteractionDefinition()
  {
    return interactionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteractionDefinition(InteractionDefinition newInteractionDefinition, NotificationChain msgs)
  {
    InteractionDefinition oldInteractionDefinition = interactionDefinition;
    interactionDefinition = newInteractionDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION, oldInteractionDefinition, newInteractionDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionDefinition(InteractionDefinition newInteractionDefinition)
  {
    if (newInteractionDefinition != interactionDefinition)
    {
      NotificationChain msgs = null;
      if (interactionDefinition != null)
        msgs = ((InternalEObject)interactionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION, null, msgs);
      if (newInteractionDefinition != null)
        msgs = ((InternalEObject)newInteractionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION, null, msgs);
      msgs = basicSetInteractionDefinition(newInteractionDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION, newInteractionDefinition, newInteractionDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PicturePackage.GRAPHICAL_REPRESENTATION__ROOT:
        return basicSetRoot(null, msgs);
      case PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION:
        return basicSetToolsDefinition(null, msgs);
      case PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION:
        return basicSetStyleDefinition(null, msgs);
      case PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION:
        return basicSetGraphicalDefinition(null, msgs);
      case PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION:
        return basicSetRulesDefinition(null, msgs);
      case PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION:
        return basicSetInteractionDefinition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PicturePackage.GRAPHICAL_REPRESENTATION__NAME:
        return getName();
      case PicturePackage.GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE:
        return getReferencePackage();
      case PicturePackage.GRAPHICAL_REPRESENTATION__ROOT:
        return getRoot();
      case PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION:
        return getToolsDefinition();
      case PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION:
        return getStyleDefinition();
      case PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION:
        return getGraphicalDefinition();
      case PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION:
        return getRulesDefinition();
      case PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION:
        return getInteractionDefinition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PicturePackage.GRAPHICAL_REPRESENTATION__NAME:
        setName((String)newValue);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE:
        setReferencePackage((String)newValue);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__ROOT:
        setRoot((ROOT)newValue);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION:
        setToolsDefinition((ToolDefinition)newValue);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION:
        setStyleDefinition((StyleDefinition)newValue);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION:
        setGraphicalDefinition((GraphicalDefinition)newValue);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION:
        setRulesDefinition((RulesDefinition)newValue);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION:
        setInteractionDefinition((InteractionDefinition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PicturePackage.GRAPHICAL_REPRESENTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE:
        setReferencePackage(REFERENCE_PACKAGE_EDEFAULT);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__ROOT:
        setRoot((ROOT)null);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION:
        setToolsDefinition((ToolDefinition)null);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION:
        setStyleDefinition((StyleDefinition)null);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION:
        setGraphicalDefinition((GraphicalDefinition)null);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION:
        setRulesDefinition((RulesDefinition)null);
        return;
      case PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION:
        setInteractionDefinition((InteractionDefinition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PicturePackage.GRAPHICAL_REPRESENTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PicturePackage.GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE:
        return REFERENCE_PACKAGE_EDEFAULT == null ? referencePackage != null : !REFERENCE_PACKAGE_EDEFAULT.equals(referencePackage);
      case PicturePackage.GRAPHICAL_REPRESENTATION__ROOT:
        return root != null;
      case PicturePackage.GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION:
        return toolsDefinition != null;
      case PicturePackage.GRAPHICAL_REPRESENTATION__STYLE_DEFINITION:
        return styleDefinition != null;
      case PicturePackage.GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION:
        return graphicalDefinition != null;
      case PicturePackage.GRAPHICAL_REPRESENTATION__RULES_DEFINITION:
        return rulesDefinition != null;
      case PicturePackage.GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION:
        return interactionDefinition != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", referencePackage: ");
    result.append(referencePackage);
    result.append(')');
    return result.toString();
  }

} //GraphicalRepresentationImpl
