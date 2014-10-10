/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.ClassExecution;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ClassExecutionImpl#getInplementationReference <em>Inplementation Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassExecutionImpl extends InstructionImpl implements ClassExecution
{
  /**
   * The default value of the '{@link #getInplementationReference() <em>Inplementation Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInplementationReference()
   * @generated
   * @ordered
   */
  protected static final String INPLEMENTATION_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInplementationReference() <em>Inplementation Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInplementationReference()
   * @generated
   * @ordered
   */
  protected String inplementationReference = INPLEMENTATION_REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassExecutionImpl()
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
    return PicturePackage.Literals.CLASS_EXECUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInplementationReference()
  {
    return inplementationReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInplementationReference(String newInplementationReference)
  {
    String oldInplementationReference = inplementationReference;
    inplementationReference = newInplementationReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CLASS_EXECUTION__INPLEMENTATION_REFERENCE, oldInplementationReference, inplementationReference));
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
      case PicturePackage.CLASS_EXECUTION__INPLEMENTATION_REFERENCE:
        return getInplementationReference();
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
      case PicturePackage.CLASS_EXECUTION__INPLEMENTATION_REFERENCE:
        setInplementationReference((String)newValue);
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
      case PicturePackage.CLASS_EXECUTION__INPLEMENTATION_REFERENCE:
        setInplementationReference(INPLEMENTATION_REFERENCE_EDEFAULT);
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
      case PicturePackage.CLASS_EXECUTION__INPLEMENTATION_REFERENCE:
        return INPLEMENTATION_REFERENCE_EDEFAULT == null ? inplementationReference != null : !INPLEMENTATION_REFERENCE_EDEFAULT.equals(inplementationReference);
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
    result.append(" (inplementationReference: ");
    result.append(inplementationReference);
    result.append(')');
    return result.toString();
  }

} //ClassExecutionImpl
