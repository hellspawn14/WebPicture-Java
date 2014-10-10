/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.ClassReference;
import co.edu.uniandes.enar.picture.ElementWizard;
import co.edu.uniandes.enar.picture.Page;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.WizardType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Wizard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl#getClassReference <em>Class Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl#isDefaultButtons <em>Default Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementWizardImpl extends WizardImpl implements ElementWizard
{
  /**
   * The cached value of the '{@link #getClassReference() <em>Class Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassReference()
   * @generated
   * @ordered
   */
  protected ClassReference classReference;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final WizardType TYPE_EDEFAULT = WizardType.CREATE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected WizardType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected EList<Page> pages;

  /**
   * The default value of the '{@link #isDefaultButtons() <em>Default Buttons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefaultButtons()
   * @generated
   * @ordered
   */
  protected static final boolean DEFAULT_BUTTONS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDefaultButtons() <em>Default Buttons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefaultButtons()
   * @generated
   * @ordered
   */
  protected boolean defaultButtons = DEFAULT_BUTTONS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementWizardImpl()
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
    return PicturePackage.Literals.ELEMENT_WIZARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassReference getClassReference()
  {
    return classReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassReference(ClassReference newClassReference, NotificationChain msgs)
  {
    ClassReference oldClassReference = classReference;
    classReference = newClassReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE, oldClassReference, newClassReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassReference(ClassReference newClassReference)
  {
    if (newClassReference != classReference)
    {
      NotificationChain msgs = null;
      if (classReference != null)
        msgs = ((InternalEObject)classReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE, null, msgs);
      if (newClassReference != null)
        msgs = ((InternalEObject)newClassReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE, null, msgs);
      msgs = basicSetClassReference(newClassReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE, newClassReference, newClassReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_WIZARD__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_WIZARD__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WizardType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(WizardType newType)
  {
    WizardType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_WIZARD__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Page> getPages()
  {
    if (pages == null)
    {
      pages = new EObjectContainmentEList<Page>(Page.class, this, PicturePackage.ELEMENT_WIZARD__PAGES);
    }
    return pages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDefaultButtons()
  {
    return defaultButtons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultButtons(boolean newDefaultButtons)
  {
    boolean oldDefaultButtons = defaultButtons;
    defaultButtons = newDefaultButtons;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.ELEMENT_WIZARD__DEFAULT_BUTTONS, oldDefaultButtons, defaultButtons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE:
        return basicSetClassReference(null, msgs);
      case PicturePackage.ELEMENT_WIZARD__PAGES:
        return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE:
        return getClassReference();
      case PicturePackage.ELEMENT_WIZARD__TITLE:
        return getTitle();
      case PicturePackage.ELEMENT_WIZARD__DESCRIPTION:
        return getDescription();
      case PicturePackage.ELEMENT_WIZARD__TYPE:
        return getType();
      case PicturePackage.ELEMENT_WIZARD__PAGES:
        return getPages();
      case PicturePackage.ELEMENT_WIZARD__DEFAULT_BUTTONS:
        return isDefaultButtons();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE:
        setClassReference((ClassReference)newValue);
        return;
      case PicturePackage.ELEMENT_WIZARD__TITLE:
        setTitle((String)newValue);
        return;
      case PicturePackage.ELEMENT_WIZARD__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PicturePackage.ELEMENT_WIZARD__TYPE:
        setType((WizardType)newValue);
        return;
      case PicturePackage.ELEMENT_WIZARD__PAGES:
        getPages().clear();
        getPages().addAll((Collection<? extends Page>)newValue);
        return;
      case PicturePackage.ELEMENT_WIZARD__DEFAULT_BUTTONS:
        setDefaultButtons((Boolean)newValue);
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
      case PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE:
        setClassReference((ClassReference)null);
        return;
      case PicturePackage.ELEMENT_WIZARD__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case PicturePackage.ELEMENT_WIZARD__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PicturePackage.ELEMENT_WIZARD__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case PicturePackage.ELEMENT_WIZARD__PAGES:
        getPages().clear();
        return;
      case PicturePackage.ELEMENT_WIZARD__DEFAULT_BUTTONS:
        setDefaultButtons(DEFAULT_BUTTONS_EDEFAULT);
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
      case PicturePackage.ELEMENT_WIZARD__CLASS_REFERENCE:
        return classReference != null;
      case PicturePackage.ELEMENT_WIZARD__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case PicturePackage.ELEMENT_WIZARD__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PicturePackage.ELEMENT_WIZARD__TYPE:
        return type != TYPE_EDEFAULT;
      case PicturePackage.ELEMENT_WIZARD__PAGES:
        return pages != null && !pages.isEmpty();
      case PicturePackage.ELEMENT_WIZARD__DEFAULT_BUTTONS:
        return defaultButtons != DEFAULT_BUTTONS_EDEFAULT;
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
    result.append(" (title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(", type: ");
    result.append(type);
    result.append(", defaultButtons: ");
    result.append(defaultButtons);
    result.append(')');
    return result.toString();
  }

} //ElementWizardImpl
