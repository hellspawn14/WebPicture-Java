/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.KeyEvent;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.KeyEventImpl#getKeyPress <em>Key Press</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.KeyEventImpl#getKeyUp <em>Key Up</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.KeyEventImpl#getKeyDown <em>Key Down</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyEventImpl extends EventTypeImpl implements KeyEvent
{
  /**
   * The default value of the '{@link #getKeyPress() <em>Key Press</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyPress()
   * @generated
   * @ordered
   */
  protected static final String KEY_PRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyPress() <em>Key Press</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyPress()
   * @generated
   * @ordered
   */
  protected String keyPress = KEY_PRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getKeyUp() <em>Key Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyUp()
   * @generated
   * @ordered
   */
  protected static final String KEY_UP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyUp() <em>Key Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyUp()
   * @generated
   * @ordered
   */
  protected String keyUp = KEY_UP_EDEFAULT;

  /**
   * The default value of the '{@link #getKeyDown() <em>Key Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyDown()
   * @generated
   * @ordered
   */
  protected static final String KEY_DOWN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyDown() <em>Key Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyDown()
   * @generated
   * @ordered
   */
  protected String keyDown = KEY_DOWN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyEventImpl()
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
    return PicturePackage.Literals.KEY_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyPress()
  {
    return keyPress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyPress(String newKeyPress)
  {
    String oldKeyPress = keyPress;
    keyPress = newKeyPress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.KEY_EVENT__KEY_PRESS, oldKeyPress, keyPress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyUp()
  {
    return keyUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyUp(String newKeyUp)
  {
    String oldKeyUp = keyUp;
    keyUp = newKeyUp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.KEY_EVENT__KEY_UP, oldKeyUp, keyUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyDown()
  {
    return keyDown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyDown(String newKeyDown)
  {
    String oldKeyDown = keyDown;
    keyDown = newKeyDown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.KEY_EVENT__KEY_DOWN, oldKeyDown, keyDown));
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
      case PicturePackage.KEY_EVENT__KEY_PRESS:
        return getKeyPress();
      case PicturePackage.KEY_EVENT__KEY_UP:
        return getKeyUp();
      case PicturePackage.KEY_EVENT__KEY_DOWN:
        return getKeyDown();
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
      case PicturePackage.KEY_EVENT__KEY_PRESS:
        setKeyPress((String)newValue);
        return;
      case PicturePackage.KEY_EVENT__KEY_UP:
        setKeyUp((String)newValue);
        return;
      case PicturePackage.KEY_EVENT__KEY_DOWN:
        setKeyDown((String)newValue);
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
      case PicturePackage.KEY_EVENT__KEY_PRESS:
        setKeyPress(KEY_PRESS_EDEFAULT);
        return;
      case PicturePackage.KEY_EVENT__KEY_UP:
        setKeyUp(KEY_UP_EDEFAULT);
        return;
      case PicturePackage.KEY_EVENT__KEY_DOWN:
        setKeyDown(KEY_DOWN_EDEFAULT);
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
      case PicturePackage.KEY_EVENT__KEY_PRESS:
        return KEY_PRESS_EDEFAULT == null ? keyPress != null : !KEY_PRESS_EDEFAULT.equals(keyPress);
      case PicturePackage.KEY_EVENT__KEY_UP:
        return KEY_UP_EDEFAULT == null ? keyUp != null : !KEY_UP_EDEFAULT.equals(keyUp);
      case PicturePackage.KEY_EVENT__KEY_DOWN:
        return KEY_DOWN_EDEFAULT == null ? keyDown != null : !KEY_DOWN_EDEFAULT.equals(keyDown);
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
    result.append(" (keyPress: ");
    result.append(keyPress);
    result.append(", keyUp: ");
    result.append(keyUp);
    result.append(", keyDown: ");
    result.append(keyDown);
    result.append(')');
    return result.toString();
  }

} //KeyEventImpl
