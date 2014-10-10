/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.Wizard;
import co.edu.uniandes.enar.picture.WizardStart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.WizardStartImpl#getWizard <em>Wizard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WizardStartImpl extends InstructionImpl implements WizardStart
{
  /**
   * The cached value of the '{@link #getWizard() <em>Wizard</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWizard()
   * @generated
   * @ordered
   */
  protected Wizard wizard;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WizardStartImpl()
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
    return PicturePackage.Literals.WIZARD_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wizard getWizard()
  {
    if (wizard != null && wizard.eIsProxy())
    {
      InternalEObject oldWizard = (InternalEObject)wizard;
      wizard = (Wizard)eResolveProxy(oldWizard);
      if (wizard != oldWizard)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.WIZARD_START__WIZARD, oldWizard, wizard));
      }
    }
    return wizard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wizard basicGetWizard()
  {
    return wizard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWizard(Wizard newWizard)
  {
    Wizard oldWizard = wizard;
    wizard = newWizard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.WIZARD_START__WIZARD, oldWizard, wizard));
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
      case PicturePackage.WIZARD_START__WIZARD:
        if (resolve) return getWizard();
        return basicGetWizard();
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
      case PicturePackage.WIZARD_START__WIZARD:
        setWizard((Wizard)newValue);
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
      case PicturePackage.WIZARD_START__WIZARD:
        setWizard((Wizard)null);
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
      case PicturePackage.WIZARD_START__WIZARD:
        return wizard != null;
    }
    return super.eIsSet(featureID);
  }

} //WizardStartImpl
