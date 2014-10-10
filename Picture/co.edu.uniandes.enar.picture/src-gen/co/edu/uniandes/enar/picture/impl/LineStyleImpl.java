/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.Color;
import co.edu.uniandes.enar.picture.LineStyle;
import co.edu.uniandes.enar.picture.LineType;
import co.edu.uniandes.enar.picture.PicturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.LineStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.LineStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.LineStyleImpl#getLineType <em>Line Type</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.LineStyleImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineStyleImpl extends StyleElementImpl implements LineStyle
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
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineType()
   * @generated
   * @ordered
   */
  protected static final LineType LINE_TYPE_EDEFAULT = LineType.SOLID;

  /**
   * The cached value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineType()
   * @generated
   * @ordered
   */
  protected LineType lineType = LINE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LineStyleImpl()
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
    return PicturePackage.Literals.LINE_STYLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.LINE_STYLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.LINE_STYLE__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineType getLineType()
  {
    return lineType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineType(LineType newLineType)
  {
    LineType oldLineType = lineType;
    lineType = newLineType == null ? LINE_TYPE_EDEFAULT : newLineType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.LINE_STYLE__LINE_TYPE, oldLineType, lineType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    if (color != null && color.eIsProxy())
    {
      InternalEObject oldColor = (InternalEObject)color;
      color = (Color)eResolveProxy(oldColor);
      if (color != oldColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicturePackage.LINE_STYLE__COLOR, oldColor, color));
      }
    }
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.LINE_STYLE__COLOR, oldColor, color));
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
      case PicturePackage.LINE_STYLE__NAME:
        return getName();
      case PicturePackage.LINE_STYLE__WIDTH:
        return getWidth();
      case PicturePackage.LINE_STYLE__LINE_TYPE:
        return getLineType();
      case PicturePackage.LINE_STYLE__COLOR:
        if (resolve) return getColor();
        return basicGetColor();
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
      case PicturePackage.LINE_STYLE__NAME:
        setName((String)newValue);
        return;
      case PicturePackage.LINE_STYLE__WIDTH:
        setWidth((Integer)newValue);
        return;
      case PicturePackage.LINE_STYLE__LINE_TYPE:
        setLineType((LineType)newValue);
        return;
      case PicturePackage.LINE_STYLE__COLOR:
        setColor((Color)newValue);
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
      case PicturePackage.LINE_STYLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PicturePackage.LINE_STYLE__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case PicturePackage.LINE_STYLE__LINE_TYPE:
        setLineType(LINE_TYPE_EDEFAULT);
        return;
      case PicturePackage.LINE_STYLE__COLOR:
        setColor((Color)null);
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
      case PicturePackage.LINE_STYLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PicturePackage.LINE_STYLE__WIDTH:
        return width != WIDTH_EDEFAULT;
      case PicturePackage.LINE_STYLE__LINE_TYPE:
        return lineType != LINE_TYPE_EDEFAULT;
      case PicturePackage.LINE_STYLE__COLOR:
        return color != null;
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
    result.append(", width: ");
    result.append(width);
    result.append(", lineType: ");
    result.append(lineType);
    result.append(')');
    return result.toString();
  }

} //LineStyleImpl
