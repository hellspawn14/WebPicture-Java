/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.MouseEvent;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mouse Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseDown <em>Mouse Down</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseEnter <em>Mouse Enter</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseHorizontalWheel <em>Mouse Horizontal Wheel</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseUp <em>Mouse Up</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseWheel <em>Mouse Wheel</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseVerticalWheel <em>Mouse Vertical Wheel</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseHover <em>Mouse Hover</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseExit <em>Mouse Exit</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl#getMouseDoubleClick <em>Mouse Double Click</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MouseEventImpl extends EventTypeImpl implements MouseEvent
{
  /**
   * The default value of the '{@link #getMouseDown() <em>Mouse Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseDown()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_DOWN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseDown() <em>Mouse Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseDown()
   * @generated
   * @ordered
   */
  protected String mouseDown = MOUSE_DOWN_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseEnter() <em>Mouse Enter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseEnter()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_ENTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseEnter() <em>Mouse Enter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseEnter()
   * @generated
   * @ordered
   */
  protected String mouseEnter = MOUSE_ENTER_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseHorizontalWheel() <em>Mouse Horizontal Wheel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseHorizontalWheel()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_HORIZONTAL_WHEEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseHorizontalWheel() <em>Mouse Horizontal Wheel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseHorizontalWheel()
   * @generated
   * @ordered
   */
  protected String mouseHorizontalWheel = MOUSE_HORIZONTAL_WHEEL_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseUp() <em>Mouse Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseUp()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_UP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseUp() <em>Mouse Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseUp()
   * @generated
   * @ordered
   */
  protected String mouseUp = MOUSE_UP_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseWheel() <em>Mouse Wheel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseWheel()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_WHEEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseWheel() <em>Mouse Wheel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseWheel()
   * @generated
   * @ordered
   */
  protected String mouseWheel = MOUSE_WHEEL_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseVerticalWheel() <em>Mouse Vertical Wheel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseVerticalWheel()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_VERTICAL_WHEEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseVerticalWheel() <em>Mouse Vertical Wheel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseVerticalWheel()
   * @generated
   * @ordered
   */
  protected String mouseVerticalWheel = MOUSE_VERTICAL_WHEEL_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseHover() <em>Mouse Hover</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseHover()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_HOVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseHover() <em>Mouse Hover</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseHover()
   * @generated
   * @ordered
   */
  protected String mouseHover = MOUSE_HOVER_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseExit() <em>Mouse Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseExit()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_EXIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseExit() <em>Mouse Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseExit()
   * @generated
   * @ordered
   */
  protected String mouseExit = MOUSE_EXIT_EDEFAULT;

  /**
   * The default value of the '{@link #getMouseDoubleClick() <em>Mouse Double Click</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseDoubleClick()
   * @generated
   * @ordered
   */
  protected static final String MOUSE_DOUBLE_CLICK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMouseDoubleClick() <em>Mouse Double Click</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMouseDoubleClick()
   * @generated
   * @ordered
   */
  protected String mouseDoubleClick = MOUSE_DOUBLE_CLICK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MouseEventImpl()
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
    return PicturePackage.Literals.MOUSE_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseDown()
  {
    return mouseDown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseDown(String newMouseDown)
  {
    String oldMouseDown = mouseDown;
    mouseDown = newMouseDown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_DOWN, oldMouseDown, mouseDown));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseEnter()
  {
    return mouseEnter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseEnter(String newMouseEnter)
  {
    String oldMouseEnter = mouseEnter;
    mouseEnter = newMouseEnter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_ENTER, oldMouseEnter, mouseEnter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseHorizontalWheel()
  {
    return mouseHorizontalWheel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseHorizontalWheel(String newMouseHorizontalWheel)
  {
    String oldMouseHorizontalWheel = mouseHorizontalWheel;
    mouseHorizontalWheel = newMouseHorizontalWheel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL, oldMouseHorizontalWheel, mouseHorizontalWheel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseUp()
  {
    return mouseUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseUp(String newMouseUp)
  {
    String oldMouseUp = mouseUp;
    mouseUp = newMouseUp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_UP, oldMouseUp, mouseUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseWheel()
  {
    return mouseWheel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseWheel(String newMouseWheel)
  {
    String oldMouseWheel = mouseWheel;
    mouseWheel = newMouseWheel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_WHEEL, oldMouseWheel, mouseWheel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseVerticalWheel()
  {
    return mouseVerticalWheel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseVerticalWheel(String newMouseVerticalWheel)
  {
    String oldMouseVerticalWheel = mouseVerticalWheel;
    mouseVerticalWheel = newMouseVerticalWheel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_VERTICAL_WHEEL, oldMouseVerticalWheel, mouseVerticalWheel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseHover()
  {
    return mouseHover;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseHover(String newMouseHover)
  {
    String oldMouseHover = mouseHover;
    mouseHover = newMouseHover;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_HOVER, oldMouseHover, mouseHover));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseExit()
  {
    return mouseExit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseExit(String newMouseExit)
  {
    String oldMouseExit = mouseExit;
    mouseExit = newMouseExit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_EXIT, oldMouseExit, mouseExit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMouseDoubleClick()
  {
    return mouseDoubleClick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMouseDoubleClick(String newMouseDoubleClick)
  {
    String oldMouseDoubleClick = mouseDoubleClick;
    mouseDoubleClick = newMouseDoubleClick;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MOUSE_EVENT__MOUSE_DOUBLE_CLICK, oldMouseDoubleClick, mouseDoubleClick));
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
      case PicturePackage.MOUSE_EVENT__MOUSE_DOWN:
        return getMouseDown();
      case PicturePackage.MOUSE_EVENT__MOUSE_ENTER:
        return getMouseEnter();
      case PicturePackage.MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL:
        return getMouseHorizontalWheel();
      case PicturePackage.MOUSE_EVENT__MOUSE_UP:
        return getMouseUp();
      case PicturePackage.MOUSE_EVENT__MOUSE_WHEEL:
        return getMouseWheel();
      case PicturePackage.MOUSE_EVENT__MOUSE_VERTICAL_WHEEL:
        return getMouseVerticalWheel();
      case PicturePackage.MOUSE_EVENT__MOUSE_HOVER:
        return getMouseHover();
      case PicturePackage.MOUSE_EVENT__MOUSE_EXIT:
        return getMouseExit();
      case PicturePackage.MOUSE_EVENT__MOUSE_DOUBLE_CLICK:
        return getMouseDoubleClick();
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
      case PicturePackage.MOUSE_EVENT__MOUSE_DOWN:
        setMouseDown((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_ENTER:
        setMouseEnter((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL:
        setMouseHorizontalWheel((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_UP:
        setMouseUp((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_WHEEL:
        setMouseWheel((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_VERTICAL_WHEEL:
        setMouseVerticalWheel((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_HOVER:
        setMouseHover((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_EXIT:
        setMouseExit((String)newValue);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_DOUBLE_CLICK:
        setMouseDoubleClick((String)newValue);
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
      case PicturePackage.MOUSE_EVENT__MOUSE_DOWN:
        setMouseDown(MOUSE_DOWN_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_ENTER:
        setMouseEnter(MOUSE_ENTER_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL:
        setMouseHorizontalWheel(MOUSE_HORIZONTAL_WHEEL_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_UP:
        setMouseUp(MOUSE_UP_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_WHEEL:
        setMouseWheel(MOUSE_WHEEL_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_VERTICAL_WHEEL:
        setMouseVerticalWheel(MOUSE_VERTICAL_WHEEL_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_HOVER:
        setMouseHover(MOUSE_HOVER_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_EXIT:
        setMouseExit(MOUSE_EXIT_EDEFAULT);
        return;
      case PicturePackage.MOUSE_EVENT__MOUSE_DOUBLE_CLICK:
        setMouseDoubleClick(MOUSE_DOUBLE_CLICK_EDEFAULT);
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
      case PicturePackage.MOUSE_EVENT__MOUSE_DOWN:
        return MOUSE_DOWN_EDEFAULT == null ? mouseDown != null : !MOUSE_DOWN_EDEFAULT.equals(mouseDown);
      case PicturePackage.MOUSE_EVENT__MOUSE_ENTER:
        return MOUSE_ENTER_EDEFAULT == null ? mouseEnter != null : !MOUSE_ENTER_EDEFAULT.equals(mouseEnter);
      case PicturePackage.MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL:
        return MOUSE_HORIZONTAL_WHEEL_EDEFAULT == null ? mouseHorizontalWheel != null : !MOUSE_HORIZONTAL_WHEEL_EDEFAULT.equals(mouseHorizontalWheel);
      case PicturePackage.MOUSE_EVENT__MOUSE_UP:
        return MOUSE_UP_EDEFAULT == null ? mouseUp != null : !MOUSE_UP_EDEFAULT.equals(mouseUp);
      case PicturePackage.MOUSE_EVENT__MOUSE_WHEEL:
        return MOUSE_WHEEL_EDEFAULT == null ? mouseWheel != null : !MOUSE_WHEEL_EDEFAULT.equals(mouseWheel);
      case PicturePackage.MOUSE_EVENT__MOUSE_VERTICAL_WHEEL:
        return MOUSE_VERTICAL_WHEEL_EDEFAULT == null ? mouseVerticalWheel != null : !MOUSE_VERTICAL_WHEEL_EDEFAULT.equals(mouseVerticalWheel);
      case PicturePackage.MOUSE_EVENT__MOUSE_HOVER:
        return MOUSE_HOVER_EDEFAULT == null ? mouseHover != null : !MOUSE_HOVER_EDEFAULT.equals(mouseHover);
      case PicturePackage.MOUSE_EVENT__MOUSE_EXIT:
        return MOUSE_EXIT_EDEFAULT == null ? mouseExit != null : !MOUSE_EXIT_EDEFAULT.equals(mouseExit);
      case PicturePackage.MOUSE_EVENT__MOUSE_DOUBLE_CLICK:
        return MOUSE_DOUBLE_CLICK_EDEFAULT == null ? mouseDoubleClick != null : !MOUSE_DOUBLE_CLICK_EDEFAULT.equals(mouseDoubleClick);
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
    result.append(" (mouseDown: ");
    result.append(mouseDown);
    result.append(", mouseEnter: ");
    result.append(mouseEnter);
    result.append(", mouseHorizontalWheel: ");
    result.append(mouseHorizontalWheel);
    result.append(", mouseUp: ");
    result.append(mouseUp);
    result.append(", mouseWheel: ");
    result.append(mouseWheel);
    result.append(", mouseVerticalWheel: ");
    result.append(mouseVerticalWheel);
    result.append(", mouseHover: ");
    result.append(mouseHover);
    result.append(", mouseExit: ");
    result.append(mouseExit);
    result.append(", mouseDoubleClick: ");
    result.append(mouseDoubleClick);
    result.append(')');
    return result.toString();
  }

} //MouseEventImpl
