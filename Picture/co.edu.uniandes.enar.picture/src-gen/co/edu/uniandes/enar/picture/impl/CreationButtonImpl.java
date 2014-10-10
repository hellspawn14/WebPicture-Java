/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.ClassReference;
import co.edu.uniandes.enar.picture.CreationButton;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creation Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CreationButtonImpl#getMetaConceptReference <em>Meta Concept Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CreationButtonImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CreationButtonImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CreationButtonImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreationButtonImpl extends MinimalEObjectImpl.Container implements CreationButton
{
  /**
   * The cached value of the '{@link #getMetaConceptReference() <em>Meta Concept Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaConceptReference()
   * @generated
   * @ordered
   */
  protected ClassReference metaConceptReference;

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
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreationButtonImpl()
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
    return PicturePackage.Literals.CREATION_BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassReference getMetaConceptReference()
  {
    return metaConceptReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaConceptReference(ClassReference newMetaConceptReference, NotificationChain msgs)
  {
    ClassReference oldMetaConceptReference = metaConceptReference;
    metaConceptReference = newMetaConceptReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE, oldMetaConceptReference, newMetaConceptReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaConceptReference(ClassReference newMetaConceptReference)
  {
    if (newMetaConceptReference != metaConceptReference)
    {
      NotificationChain msgs = null;
      if (metaConceptReference != null)
        msgs = ((InternalEObject)metaConceptReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE, null, msgs);
      if (newMetaConceptReference != null)
        msgs = ((InternalEObject)newMetaConceptReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE, null, msgs);
      msgs = basicSetMetaConceptReference(newMetaConceptReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE, newMetaConceptReference, newMetaConceptReference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CREATION_BUTTON__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CREATION_BUTTON__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CREATION_BUTTON__ICON, oldIcon, icon));
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
      case PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE:
        return basicSetMetaConceptReference(null, msgs);
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
      case PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE:
        return getMetaConceptReference();
      case PicturePackage.CREATION_BUTTON__NAME:
        return getName();
      case PicturePackage.CREATION_BUTTON__DESCRIPTION:
        return getDescription();
      case PicturePackage.CREATION_BUTTON__ICON:
        return getIcon();
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
      case PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE:
        setMetaConceptReference((ClassReference)newValue);
        return;
      case PicturePackage.CREATION_BUTTON__NAME:
        setName((String)newValue);
        return;
      case PicturePackage.CREATION_BUTTON__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PicturePackage.CREATION_BUTTON__ICON:
        setIcon((String)newValue);
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
      case PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE:
        setMetaConceptReference((ClassReference)null);
        return;
      case PicturePackage.CREATION_BUTTON__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PicturePackage.CREATION_BUTTON__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PicturePackage.CREATION_BUTTON__ICON:
        setIcon(ICON_EDEFAULT);
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
      case PicturePackage.CREATION_BUTTON__META_CONCEPT_REFERENCE:
        return metaConceptReference != null;
      case PicturePackage.CREATION_BUTTON__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PicturePackage.CREATION_BUTTON__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PicturePackage.CREATION_BUTTON__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
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
    result.append(", icon: ");
    result.append(icon);
    result.append(')');
    return result.toString();
  }

} //CreationButtonImpl
