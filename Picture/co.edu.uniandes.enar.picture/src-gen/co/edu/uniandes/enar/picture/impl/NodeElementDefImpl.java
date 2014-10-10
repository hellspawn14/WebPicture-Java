/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.Figure;
import co.edu.uniandes.enar.picture.LabelPosition;
import co.edu.uniandes.enar.picture.NodeElementDef;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.Size;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Element Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementDefImpl#isLabelIcon <em>Label Icon</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementDefImpl#getLabelPlacement <em>Label Placement</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementDefImpl#getSize <em>Size</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementDefImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementDefImpl#isPhantomN <em>Phantom N</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeElementDefImpl extends NodeDefImpl implements NodeElementDef
{
  /**
   * The default value of the '{@link #isLabelIcon() <em>Label Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLabelIcon()
   * @generated
   * @ordered
   */
  protected static final boolean LABEL_ICON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLabelIcon() <em>Label Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLabelIcon()
   * @generated
   * @ordered
   */
  protected boolean labelIcon = LABEL_ICON_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabelPlacement() <em>Label Placement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelPlacement()
   * @generated
   * @ordered
   */
  protected LabelPosition labelPlacement;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected Size size;

  /**
   * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigure()
   * @generated
   * @ordered
   */
  protected Figure figure;

  /**
   * The default value of the '{@link #isPhantomN() <em>Phantom N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPhantomN()
   * @generated
   * @ordered
   */
  protected static final boolean PHANTOM_N_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPhantomN() <em>Phantom N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPhantomN()
   * @generated
   * @ordered
   */
  protected boolean phantomN = PHANTOM_N_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeElementDefImpl()
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
    return PicturePackage.Literals.NODE_ELEMENT_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLabelIcon()
  {
    return labelIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelIcon(boolean newLabelIcon)
  {
    boolean oldLabelIcon = labelIcon;
    labelIcon = newLabelIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__LABEL_ICON, oldLabelIcon, labelIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelPosition getLabelPlacement()
  {
    return labelPlacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabelPlacement(LabelPosition newLabelPlacement, NotificationChain msgs)
  {
    LabelPosition oldLabelPlacement = labelPlacement;
    labelPlacement = newLabelPlacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT, oldLabelPlacement, newLabelPlacement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelPlacement(LabelPosition newLabelPlacement)
  {
    if (newLabelPlacement != labelPlacement)
    {
      NotificationChain msgs = null;
      if (labelPlacement != null)
        msgs = ((InternalEObject)labelPlacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT, null, msgs);
      if (newLabelPlacement != null)
        msgs = ((InternalEObject)newLabelPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT, null, msgs);
      msgs = basicSetLabelPlacement(newLabelPlacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT, newLabelPlacement, newLabelPlacement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(Size newSize, NotificationChain msgs)
  {
    Size oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(Size newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_DEF__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_DEF__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Figure getFigure()
  {
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFigure(Figure newFigure, NotificationChain msgs)
  {
    Figure oldFigure = figure;
    figure = newFigure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__FIGURE, oldFigure, newFigure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFigure(Figure newFigure)
  {
    if (newFigure != figure)
    {
      NotificationChain msgs = null;
      if (figure != null)
        msgs = ((InternalEObject)figure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_DEF__FIGURE, null, msgs);
      if (newFigure != null)
        msgs = ((InternalEObject)newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_DEF__FIGURE, null, msgs);
      msgs = basicSetFigure(newFigure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__FIGURE, newFigure, newFigure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPhantomN()
  {
    return phantomN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPhantomN(boolean newPhantomN)
  {
    boolean oldPhantomN = phantomN;
    phantomN = newPhantomN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_DEF__PHANTOM_N, oldPhantomN, phantomN));
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
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT:
        return basicSetLabelPlacement(null, msgs);
      case PicturePackage.NODE_ELEMENT_DEF__SIZE:
        return basicSetSize(null, msgs);
      case PicturePackage.NODE_ELEMENT_DEF__FIGURE:
        return basicSetFigure(null, msgs);
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
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_ICON:
        return isLabelIcon();
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT:
        return getLabelPlacement();
      case PicturePackage.NODE_ELEMENT_DEF__SIZE:
        return getSize();
      case PicturePackage.NODE_ELEMENT_DEF__FIGURE:
        return getFigure();
      case PicturePackage.NODE_ELEMENT_DEF__PHANTOM_N:
        return isPhantomN();
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
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_ICON:
        setLabelIcon((Boolean)newValue);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT:
        setLabelPlacement((LabelPosition)newValue);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__SIZE:
        setSize((Size)newValue);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__FIGURE:
        setFigure((Figure)newValue);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__PHANTOM_N:
        setPhantomN((Boolean)newValue);
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
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_ICON:
        setLabelIcon(LABEL_ICON_EDEFAULT);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT:
        setLabelPlacement((LabelPosition)null);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__SIZE:
        setSize((Size)null);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__FIGURE:
        setFigure((Figure)null);
        return;
      case PicturePackage.NODE_ELEMENT_DEF__PHANTOM_N:
        setPhantomN(PHANTOM_N_EDEFAULT);
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
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_ICON:
        return labelIcon != LABEL_ICON_EDEFAULT;
      case PicturePackage.NODE_ELEMENT_DEF__LABEL_PLACEMENT:
        return labelPlacement != null;
      case PicturePackage.NODE_ELEMENT_DEF__SIZE:
        return size != null;
      case PicturePackage.NODE_ELEMENT_DEF__FIGURE:
        return figure != null;
      case PicturePackage.NODE_ELEMENT_DEF__PHANTOM_N:
        return phantomN != PHANTOM_N_EDEFAULT;
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
    result.append(" (labelIcon: ");
    result.append(labelIcon);
    result.append(", phantomN: ");
    result.append(phantomN);
    result.append(')');
    return result.toString();
  }

} //NodeElementDefImpl
