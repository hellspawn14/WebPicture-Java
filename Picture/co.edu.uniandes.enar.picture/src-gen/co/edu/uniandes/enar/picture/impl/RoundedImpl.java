/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.Rounded;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rounded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RoundedImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RoundedImpl#getRy <em>Ry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoundedImpl extends FigureStyleImpl implements Rounded
{
  /**
   * The default value of the '{@link #getRx() <em>Rx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRx()
   * @generated
   * @ordered
   */
  protected static final int RX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRx() <em>Rx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRx()
   * @generated
   * @ordered
   */
  protected int rx = RX_EDEFAULT;

  /**
   * The default value of the '{@link #getRy() <em>Ry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRy()
   * @generated
   * @ordered
   */
  protected static final int RY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRy() <em>Ry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRy()
   * @generated
   * @ordered
   */
  protected int ry = RY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoundedImpl()
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
    return PicturePackage.Literals.ROUNDED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRx()
  {
    return rx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRx(int newRx)
  {
    int oldRx = rx;
    rx = newRx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ROUNDED__RX, oldRx, rx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRy()
  {
    return ry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRy(int newRy)
  {
    int oldRy = ry;
    ry = newRy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ROUNDED__RY, oldRy, ry));
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
      case PicturePackage.ROUNDED__RX:
        return getRx();
      case PicturePackage.ROUNDED__RY:
        return getRy();
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
      case PicturePackage.ROUNDED__RX:
        setRx((Integer)newValue);
        return;
      case PicturePackage.ROUNDED__RY:
        setRy((Integer)newValue);
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
      case PicturePackage.ROUNDED__RX:
        setRx(RX_EDEFAULT);
        return;
      case PicturePackage.ROUNDED__RY:
        setRy(RY_EDEFAULT);
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
      case PicturePackage.ROUNDED__RX:
        return rx != RX_EDEFAULT;
      case PicturePackage.ROUNDED__RY:
        return ry != RY_EDEFAULT;
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
    result.append(" (rx: ");
    result.append(rx);
    result.append(", ry: ");
    result.append(ry);
    result.append(')');
    return result.toString();
  }

} //RoundedImpl
