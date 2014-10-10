/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.LineDecoration;
import co.edu.uniandes.enar.picture.LineStyle;
import co.edu.uniandes.enar.picture.NodeLineDef;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Line Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineDefImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineDefImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineDefImpl#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLineDefImpl#getTargetDecoration <em>Target Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeLineDefImpl extends AttLinkDefImpl implements NodeLineDef
{
  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

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
  protected NodeLineDefImpl()
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
    return PicturePackage.Literals.NODE_LINE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_DEF__LABEL, oldLabel, label));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.NODE_LINE_DEF__STYLE, oldStyle, style));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_DEF__STYLE, oldStyle, style));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION, oldSourceDecoration, newSourceDecoration);
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
        msgs = ((InternalEObject)sourceDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION, null, msgs);
      if (newSourceDecoration != null)
        msgs = ((InternalEObject)newSourceDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION, null, msgs);
      msgs = basicSetSourceDecoration(newSourceDecoration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION, newSourceDecoration, newSourceDecoration));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_DEF__TARGET_DECORATION, oldTargetDecoration, newTargetDecoration);
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
        msgs = ((InternalEObject)targetDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_DEF__TARGET_DECORATION, null, msgs);
      if (newTargetDecoration != null)
        msgs = ((InternalEObject)newTargetDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINE_DEF__TARGET_DECORATION, null, msgs);
      msgs = basicSetTargetDecoration(newTargetDecoration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINE_DEF__TARGET_DECORATION, newTargetDecoration, newTargetDecoration));
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
      case PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION:
        return basicSetSourceDecoration(null, msgs);
      case PicturePackage.NODE_LINE_DEF__TARGET_DECORATION:
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
      case PicturePackage.NODE_LINE_DEF__LABEL:
        return getLabel();
      case PicturePackage.NODE_LINE_DEF__STYLE:
        if (resolve) return getStyle();
        return basicGetStyle();
      case PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION:
        return getSourceDecoration();
      case PicturePackage.NODE_LINE_DEF__TARGET_DECORATION:
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
      case PicturePackage.NODE_LINE_DEF__LABEL:
        setLabel((String)newValue);
        return;
      case PicturePackage.NODE_LINE_DEF__STYLE:
        setStyle((LineStyle)newValue);
        return;
      case PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION:
        setSourceDecoration((LineDecoration)newValue);
        return;
      case PicturePackage.NODE_LINE_DEF__TARGET_DECORATION:
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
      case PicturePackage.NODE_LINE_DEF__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case PicturePackage.NODE_LINE_DEF__STYLE:
        setStyle((LineStyle)null);
        return;
      case PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION:
        setSourceDecoration((LineDecoration)null);
        return;
      case PicturePackage.NODE_LINE_DEF__TARGET_DECORATION:
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
      case PicturePackage.NODE_LINE_DEF__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case PicturePackage.NODE_LINE_DEF__STYLE:
        return style != null;
      case PicturePackage.NODE_LINE_DEF__SOURCE_DECORATION:
        return sourceDecoration != null;
      case PicturePackage.NODE_LINE_DEF__TARGET_DECORATION:
        return targetDecoration != null;
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
    result.append(" (label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //NodeLineDefImpl
