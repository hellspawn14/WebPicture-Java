/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.ViewStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ViewStyleImpl#getTree <em>Tree</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ViewStyleImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ViewStyleImpl#getTable <em>Table</em>}</li>
 *   <li>{@link co.edu.uniandes.enar.picture.impl.ViewStyleImpl#getResultGraphic <em>Result Graphic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewStyleImpl extends MinimalEObjectImpl.Container implements ViewStyle
{
  /**
   * The default value of the '{@link #getTree() <em>Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTree()
   * @generated
   * @ordered
   */
  protected static final String TREE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTree() <em>Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTree()
   * @generated
   * @ordered
   */
  protected String tree = TREE_EDEFAULT;

  /**
   * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelection()
   * @generated
   * @ordered
   */
  protected static final String SELECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelection()
   * @generated
   * @ordered
   */
  protected String selection = SELECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected static final String TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected String table = TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getResultGraphic() <em>Result Graphic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultGraphic()
   * @generated
   * @ordered
   */
  protected static final String RESULT_GRAPHIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResultGraphic() <em>Result Graphic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultGraphic()
   * @generated
   * @ordered
   */
  protected String resultGraphic = RESULT_GRAPHIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewStyleImpl()
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
    return PicturePackage.Literals.VIEW_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTree()
  {
    return tree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTree(String newTree)
  {
    String oldTree = tree;
    tree = newTree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.VIEW_STYLE__TREE, oldTree, tree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelection()
  {
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(String newSelection)
  {
    String oldSelection = selection;
    selection = newSelection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.VIEW_STYLE__SELECTION, oldSelection, selection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(String newTable)
  {
    String oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.VIEW_STYLE__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResultGraphic()
  {
    return resultGraphic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultGraphic(String newResultGraphic)
  {
    String oldResultGraphic = resultGraphic;
    resultGraphic = newResultGraphic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PicturePackage.VIEW_STYLE__RESULT_GRAPHIC, oldResultGraphic, resultGraphic));
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
      case PicturePackage.VIEW_STYLE__TREE:
        return getTree();
      case PicturePackage.VIEW_STYLE__SELECTION:
        return getSelection();
      case PicturePackage.VIEW_STYLE__TABLE:
        return getTable();
      case PicturePackage.VIEW_STYLE__RESULT_GRAPHIC:
        return getResultGraphic();
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
      case PicturePackage.VIEW_STYLE__TREE:
        setTree((String)newValue);
        return;
      case PicturePackage.VIEW_STYLE__SELECTION:
        setSelection((String)newValue);
        return;
      case PicturePackage.VIEW_STYLE__TABLE:
        setTable((String)newValue);
        return;
      case PicturePackage.VIEW_STYLE__RESULT_GRAPHIC:
        setResultGraphic((String)newValue);
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
      case PicturePackage.VIEW_STYLE__TREE:
        setTree(TREE_EDEFAULT);
        return;
      case PicturePackage.VIEW_STYLE__SELECTION:
        setSelection(SELECTION_EDEFAULT);
        return;
      case PicturePackage.VIEW_STYLE__TABLE:
        setTable(TABLE_EDEFAULT);
        return;
      case PicturePackage.VIEW_STYLE__RESULT_GRAPHIC:
        setResultGraphic(RESULT_GRAPHIC_EDEFAULT);
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
      case PicturePackage.VIEW_STYLE__TREE:
        return TREE_EDEFAULT == null ? tree != null : !TREE_EDEFAULT.equals(tree);
      case PicturePackage.VIEW_STYLE__SELECTION:
        return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
      case PicturePackage.VIEW_STYLE__TABLE:
        return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
      case PicturePackage.VIEW_STYLE__RESULT_GRAPHIC:
        return RESULT_GRAPHIC_EDEFAULT == null ? resultGraphic != null : !RESULT_GRAPHIC_EDEFAULT.equals(resultGraphic);
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
    result.append(" (tree: ");
    result.append(tree);
    result.append(", selection: ");
    result.append(selection);
    result.append(", table: ");
    result.append(table);
    result.append(", resultGraphic: ");
    result.append(resultGraphic);
    result.append(')');
    return result.toString();
  }

} //ViewStyleImpl
