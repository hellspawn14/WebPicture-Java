/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.CustomLineDecoration;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Line Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CustomLineDecorationImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.CustomLineDecorationImpl#getReferenceImplementation <em>Reference Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomLineDecorationImpl extends LineDecorationImpl implements CustomLineDecoration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getReferenceImplementation() <em>Reference Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceImplementation()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_IMPLEMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceImplementation() <em>Reference Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceImplementation()
   * @generated
   * @ordered
   */
  protected String referenceImplementation = REFERENCE_IMPLEMENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomLineDecorationImpl()
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
    return PicturePackage.Literals.CUSTOM_LINE_DECORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CUSTOM_LINE_DECORATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferenceImplementation()
  {
    return referenceImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceImplementation(String newReferenceImplementation)
  {
    String oldReferenceImplementation = referenceImplementation;
    referenceImplementation = newReferenceImplementation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION, oldReferenceImplementation, referenceImplementation));
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
      case PicturePackage.CUSTOM_LINE_DECORATION__NAME:
        return getName();
      case PicturePackage.CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION:
        return getReferenceImplementation();
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
      case PicturePackage.CUSTOM_LINE_DECORATION__NAME:
        setName((String)newValue);
        return;
      case PicturePackage.CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION:
        setReferenceImplementation((String)newValue);
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
      case PicturePackage.CUSTOM_LINE_DECORATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PicturePackage.CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION:
        setReferenceImplementation(REFERENCE_IMPLEMENTATION_EDEFAULT);
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
      case PicturePackage.CUSTOM_LINE_DECORATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PicturePackage.CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION:
        return REFERENCE_IMPLEMENTATION_EDEFAULT == null ? referenceImplementation != null : !REFERENCE_IMPLEMENTATION_EDEFAULT.equals(referenceImplementation);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", referenceImplementation: ");
    result.append(referenceImplementation);
    result.append(')');
    return result.toString();
  }

} //CustomLineDecorationImpl
