/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.AttLinkDef;
import co.edu.uniandes.enar.picture.AttReference;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Att Link Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.AttLinkDefImpl#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttLinkDefImpl extends ElementDefImpl implements AttLinkDef
{
  /**
   * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceName()
   * @generated
   * @ordered
   */
  protected AttReference referenceName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttLinkDefImpl()
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
    return PicturePackage.Literals.ATT_LINK_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttReference getReferenceName()
  {
    return referenceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferenceName(AttReference newReferenceName, NotificationChain msgs)
  {
    AttReference oldReferenceName = referenceName;
    referenceName = newReferenceName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.ATT_LINK_DEF__REFERENCE_NAME, oldReferenceName, newReferenceName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceName(AttReference newReferenceName)
  {
    if (newReferenceName != referenceName)
    {
      NotificationChain msgs = null;
      if (referenceName != null)
        msgs = ((InternalEObject)referenceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.ATT_LINK_DEF__REFERENCE_NAME, null, msgs);
      if (newReferenceName != null)
        msgs = ((InternalEObject)newReferenceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.ATT_LINK_DEF__REFERENCE_NAME, null, msgs);
      msgs = basicSetReferenceName(newReferenceName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ATT_LINK_DEF__REFERENCE_NAME, newReferenceName, newReferenceName));
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
      case PicturePackage.ATT_LINK_DEF__REFERENCE_NAME:
        return basicSetReferenceName(null, msgs);
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
      case PicturePackage.ATT_LINK_DEF__REFERENCE_NAME:
        return getReferenceName();
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
      case PicturePackage.ATT_LINK_DEF__REFERENCE_NAME:
        setReferenceName((AttReference)newValue);
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
      case PicturePackage.ATT_LINK_DEF__REFERENCE_NAME:
        setReferenceName((AttReference)null);
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
      case PicturePackage.ATT_LINK_DEF__REFERENCE_NAME:
        return referenceName != null;
    }
    return super.eIsSet(featureID);
  }

} //AttLinkDefImpl
