/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.InteractionDefinition;
import co.edu.uniandes.enar.picture.InteractionElement;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.InteractionDefinitionImpl#getInteractionElements <em>Interaction Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.InteractionDefinitionImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionDefinitionImpl extends MinimalEObjectImpl.Container implements InteractionDefinition
{
  /**
   * The cached value of the '{@link #getInteractionElements() <em>Interaction Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionElements()
   * @generated
   * @ordered
   */
  protected EList<InteractionElement> interactionElements;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionDefinitionImpl()
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
    return PicturePackage.Literals.INTERACTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionElement> getInteractionElements()
  {
    if (interactionElements == null)
    {
      interactionElements = new EObjectContainmentEList<InteractionElement>(InteractionElement.class, this, PicturePackage.INTERACTION_DEFINITION__INTERACTION_ELEMENTS);
    }
    return interactionElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, PicturePackage.INTERACTION_DEFINITION__STATEMENTS);
    }
    return statements;
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
      case PicturePackage.INTERACTION_DEFINITION__INTERACTION_ELEMENTS:
        return ((InternalEList<?>)getInteractionElements()).basicRemove(otherEnd, msgs);
      case PicturePackage.INTERACTION_DEFINITION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case PicturePackage.INTERACTION_DEFINITION__INTERACTION_ELEMENTS:
        return getInteractionElements();
      case PicturePackage.INTERACTION_DEFINITION__STATEMENTS:
        return getStatements();
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
      case PicturePackage.INTERACTION_DEFINITION__INTERACTION_ELEMENTS:
        getInteractionElements().clear();
        getInteractionElements().addAll((Collection<? extends InteractionElement>)newValue);
        return;
      case PicturePackage.INTERACTION_DEFINITION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
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
      case PicturePackage.INTERACTION_DEFINITION__INTERACTION_ELEMENTS:
        getInteractionElements().clear();
        return;
      case PicturePackage.INTERACTION_DEFINITION__STATEMENTS:
        getStatements().clear();
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
      case PicturePackage.INTERACTION_DEFINITION__INTERACTION_ELEMENTS:
        return interactionElements != null && !interactionElements.isEmpty();
      case PicturePackage.INTERACTION_DEFINITION__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InteractionDefinitionImpl
