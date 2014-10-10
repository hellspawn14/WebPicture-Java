/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.LineDecoration;
import co.edu.uniandes.enar.picture.LineStyle;
import co.edu.uniandes.enar.picture.NodeLinkDef;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Link Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl#getTargetDecoration <em>Target Decoration</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl#getTargetReference <em>Target Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeLinkDefImpl extends NodeDefImpl implements NodeLinkDef
{
  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
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
   * The default value of the '{@link #getSourceReference() <em>Source Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceReference()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceReference()
   * @generated
   * @ordered
   */
  protected String sourceReference = SOURCE_REFERENCE_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetReference() <em>Target Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetReference()
   * @generated
   * @ordered
   */
  protected static final String TARGET_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetReference() <em>Target Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetReference()
   * @generated
   * @ordered
   */
  protected String targetReference = TARGET_REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeLinkDefImpl()
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
    return PicturePackage.Literals.NODE_LINK_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(LineStyle newStyle, NotificationChain msgs)
  {
    LineStyle oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__STYLE, oldStyle, newStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(LineStyle newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINK_DEF__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINK_DEF__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__STYLE, newStyle, newStyle));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION, oldSourceDecoration, newSourceDecoration);
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
        msgs = ((InternalEObject)sourceDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION, null, msgs);
      if (newSourceDecoration != null)
        msgs = ((InternalEObject)newSourceDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION, null, msgs);
      msgs = basicSetSourceDecoration(newSourceDecoration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION, newSourceDecoration, newSourceDecoration));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__TARGET_DECORATION, oldTargetDecoration, newTargetDecoration);
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
        msgs = ((InternalEObject)targetDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINK_DEF__TARGET_DECORATION, null, msgs);
      if (newTargetDecoration != null)
        msgs = ((InternalEObject)newTargetDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.NODE_LINK_DEF__TARGET_DECORATION, null, msgs);
      msgs = basicSetTargetDecoration(newTargetDecoration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__TARGET_DECORATION, newTargetDecoration, newTargetDecoration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceReference()
  {
    return sourceReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceReference(String newSourceReference)
  {
    String oldSourceReference = sourceReference;
    sourceReference = newSourceReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__SOURCE_REFERENCE, oldSourceReference, sourceReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetReference()
  {
    return targetReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetReference(String newTargetReference)
  {
    String oldTargetReference = targetReference;
    targetReference = newTargetReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.NODE_LINK_DEF__TARGET_REFERENCE, oldTargetReference, targetReference));
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
      case PicturePackage.NODE_LINK_DEF__STYLE:
        return basicSetStyle(null, msgs);
      case PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION:
        return basicSetSourceDecoration(null, msgs);
      case PicturePackage.NODE_LINK_DEF__TARGET_DECORATION:
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
      case PicturePackage.NODE_LINK_DEF__STYLE:
        return getStyle();
      case PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION:
        return getSourceDecoration();
      case PicturePackage.NODE_LINK_DEF__TARGET_DECORATION:
        return getTargetDecoration();
      case PicturePackage.NODE_LINK_DEF__SOURCE_REFERENCE:
        return getSourceReference();
      case PicturePackage.NODE_LINK_DEF__TARGET_REFERENCE:
        return getTargetReference();
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
      case PicturePackage.NODE_LINK_DEF__STYLE:
        setStyle((LineStyle)newValue);
        return;
      case PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION:
        setSourceDecoration((LineDecoration)newValue);
        return;
      case PicturePackage.NODE_LINK_DEF__TARGET_DECORATION:
        setTargetDecoration((LineDecoration)newValue);
        return;
      case PicturePackage.NODE_LINK_DEF__SOURCE_REFERENCE:
        setSourceReference((String)newValue);
        return;
      case PicturePackage.NODE_LINK_DEF__TARGET_REFERENCE:
        setTargetReference((String)newValue);
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
      case PicturePackage.NODE_LINK_DEF__STYLE:
        setStyle((LineStyle)null);
        return;
      case PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION:
        setSourceDecoration((LineDecoration)null);
        return;
      case PicturePackage.NODE_LINK_DEF__TARGET_DECORATION:
        setTargetDecoration((LineDecoration)null);
        return;
      case PicturePackage.NODE_LINK_DEF__SOURCE_REFERENCE:
        setSourceReference(SOURCE_REFERENCE_EDEFAULT);
        return;
      case PicturePackage.NODE_LINK_DEF__TARGET_REFERENCE:
        setTargetReference(TARGET_REFERENCE_EDEFAULT);
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
      case PicturePackage.NODE_LINK_DEF__STYLE:
        return style != null;
      case PicturePackage.NODE_LINK_DEF__SOURCE_DECORATION:
        return sourceDecoration != null;
      case PicturePackage.NODE_LINK_DEF__TARGET_DECORATION:
        return targetDecoration != null;
      case PicturePackage.NODE_LINK_DEF__SOURCE_REFERENCE:
        return SOURCE_REFERENCE_EDEFAULT == null ? sourceReference != null : !SOURCE_REFERENCE_EDEFAULT.equals(sourceReference);
      case PicturePackage.NODE_LINK_DEF__TARGET_REFERENCE:
        return TARGET_REFERENCE_EDEFAULT == null ? targetReference != null : !TARGET_REFERENCE_EDEFAULT.equals(targetReference);
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
    result.append(" (sourceReference: ");
    result.append(sourceReference);
    result.append(", targetReference: ");
    result.append(targetReference);
    result.append(')');
    return result.toString();
  }

} //NodeLinkDefImpl
