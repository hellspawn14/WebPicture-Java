/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.Color;
import co.edu.uniandes.enar.picture.FigureStyle;
import co.edu.uniandes.enar.picture.LineStyle;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.Point;
import co.edu.uniandes.enar.picture.RegularFigure;
import co.edu.uniandes.enar.picture.Size;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl#getFigureStyle <em>Figure Style</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl#getBacgroundColor <em>Bacground Color</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl#getPath <em>Path</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl#getSize <em>Size</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularFigureImpl extends FigureImpl implements RegularFigure
{
  /**
   * The cached value of the '{@link #getFigureStyle() <em>Figure Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigureStyle()
   * @generated
   * @ordered
   */
  protected FigureStyle figureStyle;

  /**
   * The cached value of the '{@link #getBacgroundColor() <em>Bacground Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBacgroundColor()
   * @generated
   * @ordered
   */
  protected Color bacgroundColor;

  /**
   * The cached value of the '{@link #getBorder() <em>Border</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorder()
   * @generated
   * @ordered
   */
  protected LineStyle border;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

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
   * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Point position;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegularFigureImpl()
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
    return PicturePackage.Literals.REGULAR_FIGURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureStyle getFigureStyle()
  {
    if (figureStyle != null && figureStyle.eIsProxy())
    {
      InternalEObject oldFigureStyle = (InternalEObject)figureStyle;
      figureStyle = (FigureStyle)eResolveProxy(oldFigureStyle);
      if (figureStyle != oldFigureStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.REGULAR_FIGURE__FIGURE_STYLE, oldFigureStyle, figureStyle));
      }
    }
    return figureStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureStyle basicGetFigureStyle()
  {
    return figureStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFigureStyle(FigureStyle newFigureStyle)
  {
    FigureStyle oldFigureStyle = figureStyle;
    figureStyle = newFigureStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__FIGURE_STYLE, oldFigureStyle, figureStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBacgroundColor()
  {
    if (bacgroundColor != null && bacgroundColor.eIsProxy())
    {
      InternalEObject oldBacgroundColor = (InternalEObject)bacgroundColor;
      bacgroundColor = (Color)eResolveProxy(oldBacgroundColor);
      if (bacgroundColor != oldBacgroundColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.REGULAR_FIGURE__BACGROUND_COLOR, oldBacgroundColor, bacgroundColor));
      }
    }
    return bacgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetBacgroundColor()
  {
    return bacgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBacgroundColor(Color newBacgroundColor)
  {
    Color oldBacgroundColor = bacgroundColor;
    bacgroundColor = newBacgroundColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__BACGROUND_COLOR, oldBacgroundColor, bacgroundColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle getBorder()
  {
    if (border != null && border.eIsProxy())
    {
      InternalEObject oldBorder = (InternalEObject)border;
      border = (LineStyle)eResolveProxy(oldBorder);
      if (border != oldBorder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.REGULAR_FIGURE__BORDER, oldBorder, border));
      }
    }
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle basicGetBorder()
  {
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorder(LineStyle newBorder)
  {
    LineStyle oldBorder = border;
    border = newBorder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__BORDER, oldBorder, border));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__PATH, oldPath, path));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__SIZE, oldSize, newSize);
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
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.REGULAR_FIGURE__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.REGULAR_FIGURE__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosition(Point newPosition, NotificationChain msgs)
  {
    Point oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__POSITION, oldPosition, newPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Point newPosition)
  {
    if (newPosition != position)
    {
      NotificationChain msgs = null;
      if (position != null)
        msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.REGULAR_FIGURE__POSITION, null, msgs);
      if (newPosition != null)
        msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.REGULAR_FIGURE__POSITION, null, msgs);
      msgs = basicSetPosition(newPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_FIGURE__POSITION, newPosition, newPosition));
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
      case PicturePackage.REGULAR_FIGURE__SIZE:
        return basicSetSize(null, msgs);
      case PicturePackage.REGULAR_FIGURE__POSITION:
        return basicSetPosition(null, msgs);
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
      case PicturePackage.REGULAR_FIGURE__FIGURE_STYLE:
        if (resolve) return getFigureStyle();
        return basicGetFigureStyle();
      case PicturePackage.REGULAR_FIGURE__BACGROUND_COLOR:
        if (resolve) return getBacgroundColor();
        return basicGetBacgroundColor();
      case PicturePackage.REGULAR_FIGURE__BORDER:
        if (resolve) return getBorder();
        return basicGetBorder();
      case PicturePackage.REGULAR_FIGURE__PATH:
        return getPath();
      case PicturePackage.REGULAR_FIGURE__SIZE:
        return getSize();
      case PicturePackage.REGULAR_FIGURE__POSITION:
        return getPosition();
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
      case PicturePackage.REGULAR_FIGURE__FIGURE_STYLE:
        setFigureStyle((FigureStyle)newValue);
        return;
      case PicturePackage.REGULAR_FIGURE__BACGROUND_COLOR:
        setBacgroundColor((Color)newValue);
        return;
      case PicturePackage.REGULAR_FIGURE__BORDER:
        setBorder((LineStyle)newValue);
        return;
      case PicturePackage.REGULAR_FIGURE__PATH:
        setPath((String)newValue);
        return;
      case PicturePackage.REGULAR_FIGURE__SIZE:
        setSize((Size)newValue);
        return;
      case PicturePackage.REGULAR_FIGURE__POSITION:
        setPosition((Point)newValue);
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
      case PicturePackage.REGULAR_FIGURE__FIGURE_STYLE:
        setFigureStyle((FigureStyle)null);
        return;
      case PicturePackage.REGULAR_FIGURE__BACGROUND_COLOR:
        setBacgroundColor((Color)null);
        return;
      case PicturePackage.REGULAR_FIGURE__BORDER:
        setBorder((LineStyle)null);
        return;
      case PicturePackage.REGULAR_FIGURE__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case PicturePackage.REGULAR_FIGURE__SIZE:
        setSize((Size)null);
        return;
      case PicturePackage.REGULAR_FIGURE__POSITION:
        setPosition((Point)null);
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
      case PicturePackage.REGULAR_FIGURE__FIGURE_STYLE:
        return figureStyle != null;
      case PicturePackage.REGULAR_FIGURE__BACGROUND_COLOR:
        return bacgroundColor != null;
      case PicturePackage.REGULAR_FIGURE__BORDER:
        return border != null;
      case PicturePackage.REGULAR_FIGURE__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case PicturePackage.REGULAR_FIGURE__SIZE:
        return size != null;
      case PicturePackage.REGULAR_FIGURE__POSITION:
        return position != null;
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
    result.append(" (path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //RegularFigureImpl
