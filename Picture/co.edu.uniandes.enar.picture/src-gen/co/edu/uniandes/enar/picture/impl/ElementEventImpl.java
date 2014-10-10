/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.ElementEvent;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementEventImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementEventImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementEventImpl extends EventTypeImpl implements ElementEvent
{
  /**
   * The default value of the '{@link #getCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate()
   * @generated
   * @ordered
   */
  protected static final String CREATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate()
   * @generated
   * @ordered
   */
  protected String create = CREATE_EDEFAULT;

  /**
   * The default value of the '{@link #getDelete() <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelete()
   * @generated
   * @ordered
   */
  protected static final String DELETE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelete() <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelete()
   * @generated
   * @ordered
   */
  protected String delete = DELETE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementEventImpl()
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
    return PicturePackage.Literals.ELEMENT_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCreate()
  {
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreate(String newCreate)
  {
    String oldCreate = create;
    create = newCreate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_EVENT__CREATE, oldCreate, create));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelete()
  {
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelete(String newDelete)
  {
    String oldDelete = delete;
    delete = newDelete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_EVENT__DELETE, oldDelete, delete));
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
      case PicturePackage.ELEMENT_EVENT__CREATE:
        return getCreate();
      case PicturePackage.ELEMENT_EVENT__DELETE:
        return getDelete();
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
      case PicturePackage.ELEMENT_EVENT__CREATE:
        setCreate((String)newValue);
        return;
      case PicturePackage.ELEMENT_EVENT__DELETE:
        setDelete((String)newValue);
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
      case PicturePackage.ELEMENT_EVENT__CREATE:
        setCreate(CREATE_EDEFAULT);
        return;
      case PicturePackage.ELEMENT_EVENT__DELETE:
        setDelete(DELETE_EDEFAULT);
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
      case PicturePackage.ELEMENT_EVENT__CREATE:
        return CREATE_EDEFAULT == null ? create != null : !CREATE_EDEFAULT.equals(create);
      case PicturePackage.ELEMENT_EVENT__DELETE:
        return DELETE_EDEFAULT == null ? delete != null : !DELETE_EDEFAULT.equals(delete);
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
    result.append(" (create: ");
    result.append(create);
    result.append(", delete: ");
    result.append(delete);
    result.append(')');
    return result.toString();
  }

} //ElementEventImpl
