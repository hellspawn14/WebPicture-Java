/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.ClassReference;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.ViewType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ViewTypeImpl#getClassReference <em>Class Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewTypeImpl extends MinimalEObjectImpl.Container implements ViewType
{
  /**
   * The cached value of the '{@link #getClassReference() <em>Class Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassReference()
   * @generated
   * @ordered
   */
  protected ClassReference classReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewTypeImpl()
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
    return PicturePackage.Literals.VIEW_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassReference getClassReference()
  {
    return classReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassReference(ClassReference newClassReference, NotificationChain msgs)
  {
    ClassReference oldClassReference = classReference;
    classReference = newClassReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.VIEW_TYPE__CLASS_REFERENCE, oldClassReference, newClassReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassReference(ClassReference newClassReference)
  {
    if (newClassReference != classReference)
    {
      NotificationChain msgs = null;
      if (classReference != null)
        msgs = ((InternalEObject)classReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.VIEW_TYPE__CLASS_REFERENCE, null, msgs);
      if (newClassReference != null)
        msgs = ((InternalEObject)newClassReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.VIEW_TYPE__CLASS_REFERENCE, null, msgs);
      msgs = basicSetClassReference(newClassReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.VIEW_TYPE__CLASS_REFERENCE, newClassReference, newClassReference));
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
      case PicturePackage.VIEW_TYPE__CLASS_REFERENCE:
        return basicSetClassReference(null, msgs);
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
      case PicturePackage.VIEW_TYPE__CLASS_REFERENCE:
        return getClassReference();
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
      case PicturePackage.VIEW_TYPE__CLASS_REFERENCE:
        setClassReference((ClassReference)newValue);
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
      case PicturePackage.VIEW_TYPE__CLASS_REFERENCE:
        setClassReference((ClassReference)null);
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
      case PicturePackage.VIEW_TYPE__CLASS_REFERENCE:
        return classReference != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewTypeImpl
