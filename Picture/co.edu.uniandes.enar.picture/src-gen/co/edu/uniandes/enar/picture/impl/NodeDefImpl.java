/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.ClassReference;
import co.edu.uniandes.enar.picture.NodeDef;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeDefImpl#getReferenceClass <em>Reference Class</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeDefImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeDefImpl extends ElementDefImpl implements NodeDef
{
  /**
   * The cached value of the '{@link #getReferenceClass() <em>Reference Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceClass()
   * @generated
   * @ordered
   */
  protected ClassReference referenceClass;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeDefImpl()
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
    return PicturePackage.Literals.NODE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassReference getReferenceClass()
  {
    return referenceClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferenceClass(ClassReference newReferenceClass, NotificationChain msgs)
  {
    ClassReference oldReferenceClass = referenceClass;
    referenceClass = newReferenceClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_DEF__REFERENCE_CLASS, oldReferenceClass, newReferenceClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceClass(ClassReference newReferenceClass)
  {
    if (newReferenceClass != referenceClass)
    {
      NotificationChain msgs = null;
      if (referenceClass != null)
        msgs = ((InternalEObject)referenceClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_DEF__REFERENCE_CLASS, null, msgs);
      if (newReferenceClass != null)
        msgs = ((InternalEObject)newReferenceClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_DEF__REFERENCE_CLASS, null, msgs);
      msgs = basicSetReferenceClass(newReferenceClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_DEF__REFERENCE_CLASS, newReferenceClass, newReferenceClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_DEF__LABEL, oldLabel, label));
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
      case PicturePackage.NODE_DEF__REFERENCE_CLASS:
        return basicSetReferenceClass(null, msgs);
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
      case PicturePackage.NODE_DEF__REFERENCE_CLASS:
        return getReferenceClass();
      case PicturePackage.NODE_DEF__LABEL:
        return getLabel();
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
      case PicturePackage.NODE_DEF__REFERENCE_CLASS:
        setReferenceClass((ClassReference)newValue);
        return;
      case PicturePackage.NODE_DEF__LABEL:
        setLabel((String)newValue);
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
      case PicturePackage.NODE_DEF__REFERENCE_CLASS:
        setReferenceClass((ClassReference)null);
        return;
      case PicturePackage.NODE_DEF__LABEL:
        setLabel(LABEL_EDEFAULT);
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
      case PicturePackage.NODE_DEF__REFERENCE_CLASS:
        return referenceClass != null;
      case PicturePackage.NODE_DEF__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
    result.append(" (label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //NodeDefImpl
