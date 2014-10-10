/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.CaseType;
import co.edu.uniandes.enar.picture.ClassReference;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.RuleForType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule For Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RuleForTypeImpl#getClassReference <em>Class Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RuleForTypeImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleForTypeImpl extends RuleImpl implements RuleForType
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
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<CaseType> cases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleForTypeImpl()
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
    return PicturePackage.Literals.RULE_FOR_TYPE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE, oldClassReference, newClassReference);
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
        msgs = ((InternalEObject)classReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE, null, msgs);
      if (newClassReference != null)
        msgs = ((InternalEObject)newClassReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE, null, msgs);
      msgs = basicSetClassReference(newClassReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE, newClassReference, newClassReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseType> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<CaseType>(CaseType.class, this, PicturePackage.RULE_FOR_TYPE__CASES);
    }
    return cases;
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
      case PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE:
        return basicSetClassReference(null, msgs);
      case PicturePackage.RULE_FOR_TYPE__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
      case PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE:
        return getClassReference();
      case PicturePackage.RULE_FOR_TYPE__CASES:
        return getCases();
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
      case PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE:
        setClassReference((ClassReference)newValue);
        return;
      case PicturePackage.RULE_FOR_TYPE__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends CaseType>)newValue);
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
      case PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE:
        setClassReference((ClassReference)null);
        return;
      case PicturePackage.RULE_FOR_TYPE__CASES:
        getCases().clear();
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
      case PicturePackage.RULE_FOR_TYPE__CLASS_REFERENCE:
        return classReference != null;
      case PicturePackage.RULE_FOR_TYPE__CASES:
        return cases != null && !cases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RuleForTypeImpl
