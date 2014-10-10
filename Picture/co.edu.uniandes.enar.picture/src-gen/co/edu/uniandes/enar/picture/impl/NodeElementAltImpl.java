/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.Figure;
import co.edu.uniandes.enar.picture.LabelPosition;
import co.edu.uniandes.enar.picture.NodeElementAlt;
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
 * An implementation of the model object '<em><b>Node Element Alt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementAltImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementAltImpl#getLabelPlacement <em>Label Placement</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementAltImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeElementAltImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeElementAltImpl extends NodeAltImpl implements NodeElementAlt
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected NodeElementDef parent;

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
   * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigure()
   * @generated
   * @ordered
   */
  protected Figure figure;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeElementAltImpl()
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
    return PicturePackage.Literals.NODE_ELEMENT_ALT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeElementDef getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (NodeElementDef)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.NODE_ELEMENT_ALT__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeElementDef basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(NodeElementDef newParent)
  {
    NodeElementDef oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_ALT__PARENT, oldParent, parent));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT, oldLabelPlacement, newLabelPlacement);
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
        msgs = ((InternalEObject)labelPlacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT, null, msgs);
      if (newLabelPlacement != null)
        msgs = ((InternalEObject)newLabelPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT, null, msgs);
      msgs = basicSetLabelPlacement(newLabelPlacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT, newLabelPlacement, newLabelPlacement));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_ALT__FIGURE, oldFigure, newFigure);
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
        msgs = ((InternalEObject)figure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_ALT__FIGURE, null, msgs);
      if (newFigure != null)
        msgs = ((InternalEObject)newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_ALT__FIGURE, null, msgs);
      msgs = basicSetFigure(newFigure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_ALT__FIGURE, newFigure, newFigure));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_ALT__SIZE, oldSize, newSize);
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
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_ALT__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_ELEMENT_ALT__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_ELEMENT_ALT__SIZE, newSize, newSize));
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
      case PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT:
        return basicSetLabelPlacement(null, msgs);
      case PicturePackage.NODE_ELEMENT_ALT__FIGURE:
        return basicSetFigure(null, msgs);
      case PicturePackage.NODE_ELEMENT_ALT__SIZE:
        return basicSetSize(null, msgs);
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
      case PicturePackage.NODE_ELEMENT_ALT__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT:
        return getLabelPlacement();
      case PicturePackage.NODE_ELEMENT_ALT__FIGURE:
        return getFigure();
      case PicturePackage.NODE_ELEMENT_ALT__SIZE:
        return getSize();
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
      case PicturePackage.NODE_ELEMENT_ALT__PARENT:
        setParent((NodeElementDef)newValue);
        return;
      case PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT:
        setLabelPlacement((LabelPosition)newValue);
        return;
      case PicturePackage.NODE_ELEMENT_ALT__FIGURE:
        setFigure((Figure)newValue);
        return;
      case PicturePackage.NODE_ELEMENT_ALT__SIZE:
        setSize((Size)newValue);
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
      case PicturePackage.NODE_ELEMENT_ALT__PARENT:
        setParent((NodeElementDef)null);
        return;
      case PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT:
        setLabelPlacement((LabelPosition)null);
        return;
      case PicturePackage.NODE_ELEMENT_ALT__FIGURE:
        setFigure((Figure)null);
        return;
      case PicturePackage.NODE_ELEMENT_ALT__SIZE:
        setSize((Size)null);
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
      case PicturePackage.NODE_ELEMENT_ALT__PARENT:
        return parent != null;
      case PicturePackage.NODE_ELEMENT_ALT__LABEL_PLACEMENT:
        return labelPlacement != null;
      case PicturePackage.NODE_ELEMENT_ALT__FIGURE:
        return figure != null;
      case PicturePackage.NODE_ELEMENT_ALT__SIZE:
        return size != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeElementAltImpl
