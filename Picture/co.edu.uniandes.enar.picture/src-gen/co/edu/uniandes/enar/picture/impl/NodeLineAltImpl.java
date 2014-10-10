/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.LineDecoration;
import co.edu.uniandes.enar.picture.LineStyle;
import co.edu.uniandes.enar.picture.NodeLineAlt;
import co.edu.uniandes.enar.picture.NodeLineDef;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Line Alt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineAltImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineAltImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineAltImpl#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineAltImpl#getTargetDecoration <em>Target Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeLineAltImpl extends AttLinkAltImpl implements NodeLineAlt
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected NodeLineDef parent;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected LineStyle style;

  /**
   * The cached value of the '{@link #getSourceDecoration() <em>Source Decoration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceDecoration()
   * @generated
   * @ordered
   */
  protected LineDecoration sourceDecoration;

  /**
   * The cached value of the '{@link #getTargetDecoration() <em>Target Decoration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetDecoration()
   * @generated
   * @ordered
   */
  protected LineDecoration targetDecoration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeLineAltImpl()
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
    return PicturePackage.Literals.NODE_LINE_ALT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLineDef getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (NodeLineDef)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.NODE_LINE_ALT__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLineDef basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(NodeLineDef newParent)
  {
    NodeLineDef oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_ALT__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle getStyle()
  {
    if (style != null && style.eIsProxy())
    {
      InternalEObject oldStyle = (InternalEObject)style;
      style = (LineStyle)eResolveProxy(oldStyle);
      if (style != oldStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.NODE_LINE_ALT__STYLE, oldStyle, style));
      }
    }
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle basicGetStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(LineStyle newStyle)
  {
    LineStyle oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_ALT__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineDecoration getSourceDecoration()
  {
    return sourceDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceDecoration(LineDecoration newSourceDecoration, NotificationChain msgs)
  {
    LineDecoration oldSourceDecoration = sourceDecoration;
    sourceDecoration = newSourceDecoration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION, oldSourceDecoration, newSourceDecoration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceDecoration(LineDecoration newSourceDecoration)
  {
    if (newSourceDecoration != sourceDecoration)
    {
      NotificationChain msgs = null;
      if (sourceDecoration != null)
        msgs = ((InternalEObject)sourceDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION, null, msgs);
      if (newSourceDecoration != null)
        msgs = ((InternalEObject)newSourceDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION, null, msgs);
      msgs = basicSetSourceDecoration(newSourceDecoration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION, newSourceDecoration, newSourceDecoration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineDecoration getTargetDecoration()
  {
    return targetDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetDecoration(LineDecoration newTargetDecoration, NotificationChain msgs)
  {
    LineDecoration oldTargetDecoration = targetDecoration;
    targetDecoration = newTargetDecoration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_ALT__TARGET_DECORATION, oldTargetDecoration, newTargetDecoration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetDecoration(LineDecoration newTargetDecoration)
  {
    if (newTargetDecoration != targetDecoration)
    {
      NotificationChain msgs = null;
      if (targetDecoration != null)
        msgs = ((InternalEObject)targetDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_ALT__TARGET_DECORATION, null, msgs);
      if (newTargetDecoration != null)
        msgs = ((InternalEObject)newTargetDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_ALT__TARGET_DECORATION, null, msgs);
      msgs = basicSetTargetDecoration(newTargetDecoration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_ALT__TARGET_DECORATION, newTargetDecoration, newTargetDecoration));
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
      case PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION:
        return basicSetSourceDecoration(null, msgs);
      case PicturePackage.NODE_LINE_ALT__TARGET_DECORATION:
        return basicSetTargetDecoration(null, msgs);
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
      case PicturePackage.NODE_LINE_ALT__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case PicturePackage.NODE_LINE_ALT__STYLE:
        if (resolve) return getStyle();
        return basicGetStyle();
      case PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION:
        return getSourceDecoration();
      case PicturePackage.NODE_LINE_ALT__TARGET_DECORATION:
        return getTargetDecoration();
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
      case PicturePackage.NODE_LINE_ALT__PARENT:
        setParent((NodeLineDef)newValue);
        return;
      case PicturePackage.NODE_LINE_ALT__STYLE:
        setStyle((LineStyle)newValue);
        return;
      case PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION:
        setSourceDecoration((LineDecoration)newValue);
        return;
      case PicturePackage.NODE_LINE_ALT__TARGET_DECORATION:
        setTargetDecoration((LineDecoration)newValue);
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
      case PicturePackage.NODE_LINE_ALT__PARENT:
        setParent((NodeLineDef)null);
        return;
      case PicturePackage.NODE_LINE_ALT__STYLE:
        setStyle((LineStyle)null);
        return;
      case PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION:
        setSourceDecoration((LineDecoration)null);
        return;
      case PicturePackage.NODE_LINE_ALT__TARGET_DECORATION:
        setTargetDecoration((LineDecoration)null);
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
      case PicturePackage.NODE_LINE_ALT__PARENT:
        return parent != null;
      case PicturePackage.NODE_LINE_ALT__STYLE:
        return style != null;
      case PicturePackage.NODE_LINE_ALT__SOURCE_DECORATION:
        return sourceDecoration != null;
      case PicturePackage.NODE_LINE_ALT__TARGET_DECORATION:
        return targetDecoration != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeLineAltImpl
