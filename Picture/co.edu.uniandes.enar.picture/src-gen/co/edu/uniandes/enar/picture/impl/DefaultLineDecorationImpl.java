/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.DefaultLineDecoration;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Line Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getNone <em>None</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getArrow <em>Arrow</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getRhomb <em>Rhomb</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getFilledrhomb <em>Filledrhomb</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getSquare <em>Square</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getFilledsquare <em>Filledsquare</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getClosedarrow <em>Closedarrow</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl#getFilledclosedarrow <em>Filledclosedarrow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultLineDecorationImpl extends LineDecorationImpl implements DefaultLineDecoration
{
  /**
   * The default value of the '{@link #getNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNone()
   * @generated
   * @ordered
   */
  protected static final String NONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNone()
   * @generated
   * @ordered
   */
  protected String none = NONE_EDEFAULT;

  /**
   * The default value of the '{@link #getArrow() <em>Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrow()
   * @generated
   * @ordered
   */
  protected static final String ARROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArrow() <em>Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrow()
   * @generated
   * @ordered
   */
  protected String arrow = ARROW_EDEFAULT;

  /**
   * The default value of the '{@link #getRhomb() <em>Rhomb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhomb()
   * @generated
   * @ordered
   */
  protected static final String RHOMB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRhomb() <em>Rhomb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhomb()
   * @generated
   * @ordered
   */
  protected String rhomb = RHOMB_EDEFAULT;

  /**
   * The default value of the '{@link #getFilledrhomb() <em>Filledrhomb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilledrhomb()
   * @generated
   * @ordered
   */
  protected static final String FILLEDRHOMB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilledrhomb() <em>Filledrhomb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilledrhomb()
   * @generated
   * @ordered
   */
  protected String filledrhomb = FILLEDRHOMB_EDEFAULT;

  /**
   * The default value of the '{@link #getSquare() <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquare()
   * @generated
   * @ordered
   */
  protected static final String SQUARE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSquare() <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquare()
   * @generated
   * @ordered
   */
  protected String square = SQUARE_EDEFAULT;

  /**
   * The default value of the '{@link #getFilledsquare() <em>Filledsquare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilledsquare()
   * @generated
   * @ordered
   */
  protected static final String FILLEDSQUARE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilledsquare() <em>Filledsquare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilledsquare()
   * @generated
   * @ordered
   */
  protected String filledsquare = FILLEDSQUARE_EDEFAULT;

  /**
   * The default value of the '{@link #getClosedarrow() <em>Closedarrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosedarrow()
   * @generated
   * @ordered
   */
  protected static final String CLOSEDARROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClosedarrow() <em>Closedarrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosedarrow()
   * @generated
   * @ordered
   */
  protected String closedarrow = CLOSEDARROW_EDEFAULT;

  /**
   * The default value of the '{@link #getFilledclosedarrow() <em>Filledclosedarrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilledclosedarrow()
   * @generated
   * @ordered
   */
  protected static final String FILLEDCLOSEDARROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilledclosedarrow() <em>Filledclosedarrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilledclosedarrow()
   * @generated
   * @ordered
   */
  protected String filledclosedarrow = FILLEDCLOSEDARROW_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultLineDecorationImpl()
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
    return PicturePackage.Literals.DEFAULT_LINE_DECORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNone()
  {
    return none;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNone(String newNone)
  {
    String oldNone = none;
    none = newNone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__NONE, oldNone, none));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArrow()
  {
    return arrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrow(String newArrow)
  {
    String oldArrow = arrow;
    arrow = newArrow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__ARROW, oldArrow, arrow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRhomb()
  {
    return rhomb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhomb(String newRhomb)
  {
    String oldRhomb = rhomb;
    rhomb = newRhomb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__RHOMB, oldRhomb, rhomb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilledrhomb()
  {
    return filledrhomb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilledrhomb(String newFilledrhomb)
  {
    String oldFilledrhomb = filledrhomb;
    filledrhomb = newFilledrhomb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__FILLEDRHOMB, oldFilledrhomb, filledrhomb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSquare()
  {
    return square;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSquare(String newSquare)
  {
    String oldSquare = square;
    square = newSquare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__SQUARE, oldSquare, square));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilledsquare()
  {
    return filledsquare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilledsquare(String newFilledsquare)
  {
    String oldFilledsquare = filledsquare;
    filledsquare = newFilledsquare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__FILLEDSQUARE, oldFilledsquare, filledsquare));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClosedarrow()
  {
    return closedarrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClosedarrow(String newClosedarrow)
  {
    String oldClosedarrow = closedarrow;
    closedarrow = newClosedarrow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__CLOSEDARROW, oldClosedarrow, closedarrow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilledclosedarrow()
  {
    return filledclosedarrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilledclosedarrow(String newFilledclosedarrow)
  {
    String oldFilledclosedarrow = filledclosedarrow;
    filledclosedarrow = newFilledclosedarrow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW, oldFilledclosedarrow, filledclosedarrow));
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
      case PicturePackage.DEFAULT_LINE_DECORATION__NONE:
        return getNone();
      case PicturePackage.DEFAULT_LINE_DECORATION__ARROW:
        return getArrow();
      case PicturePackage.DEFAULT_LINE_DECORATION__RHOMB:
        return getRhomb();
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDRHOMB:
        return getFilledrhomb();
      case PicturePackage.DEFAULT_LINE_DECORATION__SQUARE:
        return getSquare();
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDSQUARE:
        return getFilledsquare();
      case PicturePackage.DEFAULT_LINE_DECORATION__CLOSEDARROW:
        return getClosedarrow();
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW:
        return getFilledclosedarrow();
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
      case PicturePackage.DEFAULT_LINE_DECORATION__NONE:
        setNone((String)newValue);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__ARROW:
        setArrow((String)newValue);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__RHOMB:
        setRhomb((String)newValue);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDRHOMB:
        setFilledrhomb((String)newValue);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__SQUARE:
        setSquare((String)newValue);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDSQUARE:
        setFilledsquare((String)newValue);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__CLOSEDARROW:
        setClosedarrow((String)newValue);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW:
        setFilledclosedarrow((String)newValue);
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
      case PicturePackage.DEFAULT_LINE_DECORATION__NONE:
        setNone(NONE_EDEFAULT);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__ARROW:
        setArrow(ARROW_EDEFAULT);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__RHOMB:
        setRhomb(RHOMB_EDEFAULT);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDRHOMB:
        setFilledrhomb(FILLEDRHOMB_EDEFAULT);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__SQUARE:
        setSquare(SQUARE_EDEFAULT);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDSQUARE:
        setFilledsquare(FILLEDSQUARE_EDEFAULT);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__CLOSEDARROW:
        setClosedarrow(CLOSEDARROW_EDEFAULT);
        return;
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW:
        setFilledclosedarrow(FILLEDCLOSEDARROW_EDEFAULT);
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
      case PicturePackage.DEFAULT_LINE_DECORATION__NONE:
        return NONE_EDEFAULT == null ? none != null : !NONE_EDEFAULT.equals(none);
      case PicturePackage.DEFAULT_LINE_DECORATION__ARROW:
        return ARROW_EDEFAULT == null ? arrow != null : !ARROW_EDEFAULT.equals(arrow);
      case PicturePackage.DEFAULT_LINE_DECORATION__RHOMB:
        return RHOMB_EDEFAULT == null ? rhomb != null : !RHOMB_EDEFAULT.equals(rhomb);
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDRHOMB:
        return FILLEDRHOMB_EDEFAULT == null ? filledrhomb != null : !FILLEDRHOMB_EDEFAULT.equals(filledrhomb);
      case PicturePackage.DEFAULT_LINE_DECORATION__SQUARE:
        return SQUARE_EDEFAULT == null ? square != null : !SQUARE_EDEFAULT.equals(square);
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDSQUARE:
        return FILLEDSQUARE_EDEFAULT == null ? filledsquare != null : !FILLEDSQUARE_EDEFAULT.equals(filledsquare);
      case PicturePackage.DEFAULT_LINE_DECORATION__CLOSEDARROW:
        return CLOSEDARROW_EDEFAULT == null ? closedarrow != null : !CLOSEDARROW_EDEFAULT.equals(closedarrow);
      case PicturePackage.DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW:
        return FILLEDCLOSEDARROW_EDEFAULT == null ? filledclosedarrow != null : !FILLEDCLOSEDARROW_EDEFAULT.equals(filledclosedarrow);
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
    result.append(" (none: ");
    result.append(none);
    result.append(", arrow: ");
    result.append(arrow);
    result.append(", rhomb: ");
    result.append(rhomb);
    result.append(", filledrhomb: ");
    result.append(filledrhomb);
    result.append(", square: ");
    result.append(square);
    result.append(", filledsquare: ");
    result.append(filledsquare);
    result.append(", closedarrow: ");
    result.append(closedarrow);
    result.append(", filledclosedarrow: ");
    result.append(filledclosedarrow);
    result.append(')');
    return result.toString();
  }

} //DefaultLineDecorationImpl
