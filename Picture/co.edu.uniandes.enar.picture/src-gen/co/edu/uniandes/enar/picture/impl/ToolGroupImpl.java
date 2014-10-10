/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.CreationButton;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.ToolGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ToolGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ToolGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ToolGroupImpl#getToolGroups <em>Tool Groups</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ToolGroupImpl#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolGroupImpl extends MinimalEObjectImpl.Container implements ToolGroup
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getToolGroups() <em>Tool Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolGroups()
   * @generated
   * @ordered
   */
  protected EList<ToolGroup> toolGroups;

  /**
   * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtons()
   * @generated
   * @ordered
   */
  protected EList<CreationButton> buttons;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ToolGroupImpl()
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
    return PicturePackage.Literals.TOOL_GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.TOOL_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.TOOL_GROUP__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ToolGroup> getToolGroups()
  {
    if (toolGroups == null)
    {
      toolGroups = new EObjectContainmentEList<ToolGroup>(ToolGroup.class, this, PicturePackage.TOOL_GROUP__TOOL_GROUPS);
    }
    return toolGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CreationButton> getButtons()
  {
    if (buttons == null)
    {
      buttons = new EObjectContainmentEList<CreationButton>(CreationButton.class, this, PicturePackage.TOOL_GROUP__BUTTONS);
    }
    return buttons;
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
      case PicturePackage.TOOL_GROUP__TOOL_GROUPS:
        return ((InternalEList<?>)getToolGroups()).basicRemove(otherEnd, msgs);
      case PicturePackage.TOOL_GROUP__BUTTONS:
        return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
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
      case PicturePackage.TOOL_GROUP__NAME:
        return getName();
      case PicturePackage.TOOL_GROUP__DESCRIPTION:
        return getDescription();
      case PicturePackage.TOOL_GROUP__TOOL_GROUPS:
        return getToolGroups();
      case PicturePackage.TOOL_GROUP__BUTTONS:
        return getButtons();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PicturePackage.TOOL_GROUP__NAME:
        setName((String)newValue);
        return;
      case PicturePackage.TOOL_GROUP__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PicturePackage.TOOL_GROUP__TOOL_GROUPS:
        getToolGroups().clear();
        getToolGroups().addAll((Collection<? extends ToolGroup>)newValue);
        return;
      case PicturePackage.TOOL_GROUP__BUTTONS:
        getButtons().clear();
        getButtons().addAll((Collection<? extends CreationButton>)newValue);
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
      case PicturePackage.TOOL_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PicturePackage.TOOL_GROUP__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PicturePackage.TOOL_GROUP__TOOL_GROUPS:
        getToolGroups().clear();
        return;
      case PicturePackage.TOOL_GROUP__BUTTONS:
        getButtons().clear();
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
      case PicturePackage.TOOL_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PicturePackage.TOOL_GROUP__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PicturePackage.TOOL_GROUP__TOOL_GROUPS:
        return toolGroups != null && !toolGroups.isEmpty();
      case PicturePackage.TOOL_GROUP__BUTTONS:
        return buttons != null && !buttons.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ToolGroupImpl
