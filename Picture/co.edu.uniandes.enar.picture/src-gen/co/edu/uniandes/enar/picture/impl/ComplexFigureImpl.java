/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.ComplexFigure;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ComplexFigureImpl#getImplementationReference <em>Implementation Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexFigureImpl extends FigureImpl implements ComplexFigure
{
  /**
   * The default value of the '{@link #getImplementationReference() <em>Implementation Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementationReference()
   * @generated
   * @ordered
   */
  protected static final String IMPLEMENTATION_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplementationReference() <em>Implementation Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementationReference()
   * @generated
   * @ordered
   */
  protected String implementationReference = IMPLEMENTATION_REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexFigureImpl()
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
    return PicturePackage.Literals.COMPLEX_FIGURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplementationReference()
  {
    return implementationReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplementationReference(String newImplementationReference)
  {
    String oldImplementationReference = implementationReference;
    implementationReference = newImplementationReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE, oldImplementationReference, implementationReference));
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
      case PicturePackage.COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE:
        return getImplementationReference();
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
      case PicturePackage.COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE:
        setImplementationReference((String)newValue);
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
      case PicturePackage.COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE:
        setImplementationReference(IMPLEMENTATION_REFERENCE_EDEFAULT);
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
      case PicturePackage.COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE:
        return IMPLEMENTATION_REFERENCE_EDEFAULT == null ? implementationReference != null : !IMPLEMENTATION_REFERENCE_EDEFAULT.equals(implementationReference);
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
    result.append(" (implementationReference: ");
    result.append(implementationReference);
    result.append(')');
    return result.toString();
  }

} //ComplexFigureImpl
