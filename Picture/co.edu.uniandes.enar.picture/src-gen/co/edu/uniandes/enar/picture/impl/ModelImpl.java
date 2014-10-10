/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.GraphicalRepresentation;
import co.edu.uniandes.enar.picture.Import;
import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.enar.picture.PicturePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ModelImpl#getGraphicalREpresentation <em>Graphical REpresentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getGraphicalREpresentation() <em>Graphical REpresentation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphicalREpresentation()
   * @generated
   * @ordered
   */
  protected GraphicalRepresentation graphicalREpresentation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return PicturePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, PicturePackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphicalRepresentation getGraphicalREpresentation()
  {
    return graphicalREpresentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGraphicalREpresentation(GraphicalRepresentation newGraphicalREpresentation, NotificationChain msgs)
  {
    GraphicalRepresentation oldGraphicalREpresentation = graphicalREpresentation;
    graphicalREpresentation = newGraphicalREpresentation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicturePackage.MODEL__GRAPHICAL_REPRESENTATION, oldGraphicalREpresentation, newGraphicalREpresentation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraphicalREpresentation(GraphicalRepresentation newGraphicalREpresentation)
  {
    if (newGraphicalREpresentation != graphicalREpresentation)
    {
      NotificationChain msgs = null;
      if (graphicalREpresentation != null)
        msgs = ((InternalEObject)graphicalREpresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicturePackage.MODEL__GRAPHICAL_REPRESENTATION, null, msgs);
      if (newGraphicalREpresentation != null)
        msgs = ((InternalEObject)newGraphicalREpresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicturePackage.MODEL__GRAPHICAL_REPRESENTATION, null, msgs);
      msgs = basicSetGraphicalREpresentation(newGraphicalREpresentation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.MODEL__GRAPHICAL_REPRESENTATION, newGraphicalREpresentation, newGraphicalREpresentation));
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
      case PicturePackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case PicturePackage.MODEL__GRAPHICAL_REPRESENTATION:
        return basicSetGraphicalREpresentation(null, msgs);
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
      case PicturePackage.MODEL__IMPORTS:
        return getImports();
      case PicturePackage.MODEL__GRAPHICAL_REPRESENTATION:
        return getGraphicalREpresentation();
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
      case PicturePackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case PicturePackage.MODEL__GRAPHICAL_REPRESENTATION:
        setGraphicalREpresentation((GraphicalRepresentation)newValue);
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
      case PicturePackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case PicturePackage.MODEL__GRAPHICAL_REPRESENTATION:
        setGraphicalREpresentation((GraphicalRepresentation)null);
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
      case PicturePackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case PicturePackage.MODEL__GRAPHICAL_REPRESENTATION:
        return graphicalREpresentation != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
