/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.AttLinkAlt;
import co.edu.uniandes.enar.picture.CaseReference;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CaseReferenceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CaseReferenceImpl#getReferenceElement <em>Reference Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseReferenceImpl extends MinimalEObjectImpl.Container implements CaseReference
{
  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getReferenceElement() <em>Reference Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceElement()
   * @generated
   * @ordered
   */
  protected AttLinkAlt referenceElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseReferenceImpl()
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
    return PicturePackage.Literals.CASE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CASE_REFERENCE__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttLinkAlt getReferenceElement()
  {
    if (referenceElement != null && referenceElement.eIsProxy())
    {
      InternalEObject oldReferenceElement = (InternalEObject)referenceElement;
      referenceElement = (AttLinkAlt)eResolveProxy(oldReferenceElement);
      if (referenceElement != oldReferenceElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.CASE_REFERENCE__REFERENCE_ELEMENT, oldReferenceElement, referenceElement));
      }
    }
    return referenceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttLinkAlt basicGetReferenceElement()
  {
    return referenceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceElement(AttLinkAlt newReferenceElement)
  {
    AttLinkAlt oldReferenceElement = referenceElement;
    referenceElement = newReferenceElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CASE_REFERENCE__REFERENCE_ELEMENT, oldReferenceElement, referenceElement));
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
      case PicturePackage.CASE_REFERENCE__CONDITION:
        return getCondition();
      case PicturePackage.CASE_REFERENCE__REFERENCE_ELEMENT:
        if (resolve) return getReferenceElement();
        return basicGetReferenceElement();
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
      case PicturePackage.CASE_REFERENCE__CONDITION:
        setCondition((String)newValue);
        return;
      case PicturePackage.CASE_REFERENCE__REFERENCE_ELEMENT:
        setReferenceElement((AttLinkAlt)newValue);
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
      case PicturePackage.CASE_REFERENCE__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case PicturePackage.CASE_REFERENCE__REFERENCE_ELEMENT:
        setReferenceElement((AttLinkAlt)null);
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
      case PicturePackage.CASE_REFERENCE__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case PicturePackage.CASE_REFERENCE__REFERENCE_ELEMENT:
        return referenceElement != null;
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
    result.append(" (condition: ");
    result.append(condition);
    result.append(')');
    return result.toString();
  }

} //CaseReferenceImpl
