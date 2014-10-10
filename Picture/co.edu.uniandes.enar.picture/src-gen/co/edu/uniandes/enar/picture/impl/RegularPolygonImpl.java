/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.RegularPolygon;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularPolygonImpl#getVertexCant <em>Vertex Cant</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.RegularPolygonImpl#getStartAngle <em>Start Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularPolygonImpl extends FigureStyleImpl implements RegularPolygon
{
  /**
   * The default value of the '{@link #getVertexCant() <em>Vertex Cant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVertexCant()
   * @generated
   * @ordered
   */
  protected static final int VERTEX_CANT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVertexCant() <em>Vertex Cant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVertexCant()
   * @generated
   * @ordered
   */
  protected int vertexCant = VERTEX_CANT_EDEFAULT;

  /**
   * The default value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartAngle()
   * @generated
   * @ordered
   */
  protected static final int START_ANGLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartAngle()
   * @generated
   * @ordered
   */
  protected int startAngle = START_ANGLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegularPolygonImpl()
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
    return PicturePackage.Literals.REGULAR_POLYGON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVertexCant()
  {
    return vertexCant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVertexCant(int newVertexCant)
  {
    int oldVertexCant = vertexCant;
    vertexCant = newVertexCant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_POLYGON__VERTEX_CANT, oldVertexCant, vertexCant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStartAngle()
  {
    return startAngle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartAngle(int newStartAngle)
  {
    int oldStartAngle = startAngle;
    startAngle = newStartAngle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.REGULAR_POLYGON__START_ANGLE, oldStartAngle, startAngle));
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
      case PicturePackage.REGULAR_POLYGON__VERTEX_CANT:
        return getVertexCant();
      case PicturePackage.REGULAR_POLYGON__START_ANGLE:
        return getStartAngle();
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
      case PicturePackage.REGULAR_POLYGON__VERTEX_CANT:
        setVertexCant((Integer)newValue);
        return;
      case PicturePackage.REGULAR_POLYGON__START_ANGLE:
        setStartAngle((Integer)newValue);
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
      case PicturePackage.REGULAR_POLYGON__VERTEX_CANT:
        setVertexCant(VERTEX_CANT_EDEFAULT);
        return;
      case PicturePackage.REGULAR_POLYGON__START_ANGLE:
        setStartAngle(START_ANGLE_EDEFAULT);
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
      case PicturePackage.REGULAR_POLYGON__VERTEX_CANT:
        return vertexCant != VERTEX_CANT_EDEFAULT;
      case PicturePackage.REGULAR_POLYGON__START_ANGLE:
        return startAngle != START_ANGLE_EDEFAULT;
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
    result.append(" (vertexCant: ");
    result.append(vertexCant);
    result.append(", startAngle: ");
    result.append(startAngle);
    result.append(')');
    return result.toString();
  }

} //RegularPolygonImpl
