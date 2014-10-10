/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.Ellipse;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.EllipseImpl#getRadiox <em>Radiox</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.EllipseImpl#getRadioy <em>Radioy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EllipseImpl extends FigureStyleImpl implements Ellipse
{
  /**
   * The default value of the '{@link #getRadiox() <em>Radiox</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadiox()
   * @generated
   * @ordered
   */
  protected static final int RADIOX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRadiox() <em>Radiox</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadiox()
   * @generated
   * @ordered
   */
  protected int radiox = RADIOX_EDEFAULT;

  /**
   * The default value of the '{@link #getRadioy() <em>Radioy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadioy()
   * @generated
   * @ordered
   */
  protected static final int RADIOY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRadioy() <em>Radioy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadioy()
   * @generated
   * @ordered
   */
  protected int radioy = RADIOY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EllipseImpl()
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
    return PicturePackage.Literals.ELLIPSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRadiox()
  {
    return radiox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadiox(int newRadiox)
  {
    int oldRadiox = radiox;
    radiox = newRadiox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELLIPSE__RADIOX, oldRadiox, radiox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRadioy()
  {
    return radioy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadioy(int newRadioy)
  {
    int oldRadioy = radioy;
    radioy = newRadioy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELLIPSE__RADIOY, oldRadioy, radioy));
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
      case PicturePackage.ELLIPSE__RADIOX:
        return getRadiox();
      case PicturePackage.ELLIPSE__RADIOY:
        return getRadioy();
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
      case PicturePackage.ELLIPSE__RADIOX:
        setRadiox((Integer)newValue);
        return;
      case PicturePackage.ELLIPSE__RADIOY:
        setRadioy((Integer)newValue);
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
      case PicturePackage.ELLIPSE__RADIOX:
        setRadiox(RADIOX_EDEFAULT);
        return;
      case PicturePackage.ELLIPSE__RADIOY:
        setRadioy(RADIOY_EDEFAULT);
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
      case PicturePackage.ELLIPSE__RADIOX:
        return radiox != RADIOX_EDEFAULT;
      case PicturePackage.ELLIPSE__RADIOY:
        return radioy != RADIOY_EDEFAULT;
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
    result.append(" (radiox: ");
    result.append(radiox);
    result.append(", radioy: ");
    result.append(radioy);
    result.append(')');
    return result.toString();
  }

} //EllipseImpl
