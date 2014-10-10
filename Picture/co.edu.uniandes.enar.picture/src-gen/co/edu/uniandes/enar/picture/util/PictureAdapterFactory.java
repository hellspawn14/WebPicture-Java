/**
 */
package co.edu.uniandes.enar.picture.util;

import co.edu.uniandes.enar.picture.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.enar.picture.PicturePackage
 * @generated
 */
public class PictureAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PicturePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PictureAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PicturePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PictureSwitch<Adapter> modelSwitch =
    new PictureSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseGraphicalRepresentation(GraphicalRepresentation object)
      {
        return createGraphicalRepresentationAdapter();
      }
      @Override
      public Adapter caseMetaConceptReference(MetaConceptReference object)
      {
        return createMetaConceptReferenceAdapter();
      }
      @Override
      public Adapter caseClassReference(ClassReference object)
      {
        return createClassReferenceAdapter();
      }
      @Override
      public Adapter caseAttReference(AttReference object)
      {
        return createAttReferenceAdapter();
      }
      @Override
      public Adapter caseROOT(ROOT object)
      {
        return createROOTAdapter();
      }
      @Override
      public Adapter caseToolDefinition(ToolDefinition object)
      {
        return createToolDefinitionAdapter();
      }
      @Override
      public Adapter caseToolGroup(ToolGroup object)
      {
        return createToolGroupAdapter();
      }
      @Override
      public Adapter caseCreationButton(CreationButton object)
      {
        return createCreationButtonAdapter();
      }
      @Override
      public Adapter caseStyleDefinition(StyleDefinition object)
      {
        return createStyleDefinitionAdapter();
      }
      @Override
      public Adapter caseStyleElement(StyleElement object)
      {
        return createStyleElementAdapter();
      }
      @Override
      public Adapter caseLineStyle(LineStyle object)
      {
        return createLineStyleAdapter();
      }
      @Override
      public Adapter caseLineDecoration(LineDecoration object)
      {
        return createLineDecorationAdapter();
      }
      @Override
      public Adapter caseDefaultLineDecoration(DefaultLineDecoration object)
      {
        return createDefaultLineDecorationAdapter();
      }
      @Override
      public Adapter caseCustomLineDecoration(CustomLineDecoration object)
      {
        return createCustomLineDecorationAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseLayout(Layout object)
      {
        return createLayoutAdapter();
      }
      @Override
      public Adapter caseDefaultLayout(DefaultLayout object)
      {
        return createDefaultLayoutAdapter();
      }
      @Override
      public Adapter caseCustomLayout(CustomLayout object)
      {
        return createCustomLayoutAdapter();
      }
      @Override
      public Adapter caseFigureStyle(FigureStyle object)
      {
        return createFigureStyleAdapter();
      }
      @Override
      public Adapter caseRounded(Rounded object)
      {
        return createRoundedAdapter();
      }
      @Override
      public Adapter caseRegularPolygon(RegularPolygon object)
      {
        return createRegularPolygonAdapter();
      }
      @Override
      public Adapter caseEllipse(Ellipse object)
      {
        return createEllipseAdapter();
      }
      @Override
      public Adapter caseCustomFigure(CustomFigure object)
      {
        return createCustomFigureAdapter();
      }
      @Override
      public Adapter casePoint(Point object)
      {
        return createPointAdapter();
      }
      @Override
      public Adapter caseLabelPosition(LabelPosition object)
      {
        return createLabelPositionAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter caseGraphicalDefinition(GraphicalDefinition object)
      {
        return createGraphicalDefinitionAdapter();
      }
      @Override
      public Adapter caseGraphicalElement(GraphicalElement object)
      {
        return createGraphicalElementAdapter();
      }
      @Override
      public Adapter caseElementDef(ElementDef object)
      {
        return createElementDefAdapter();
      }
      @Override
      public Adapter caseNodeDef(NodeDef object)
      {
        return createNodeDefAdapter();
      }
      @Override
      public Adapter caseAttLinkDef(AttLinkDef object)
      {
        return createAttLinkDefAdapter();
      }
      @Override
      public Adapter caseElementAlt(ElementAlt object)
      {
        return createElementAltAdapter();
      }
      @Override
      public Adapter caseNodeAlt(NodeAlt object)
      {
        return createNodeAltAdapter();
      }
      @Override
      public Adapter caseAttLinkAlt(AttLinkAlt object)
      {
        return createAttLinkAltAdapter();
      }
      @Override
      public Adapter caseNodeElementDef(NodeElementDef object)
      {
        return createNodeElementDefAdapter();
      }
      @Override
      public Adapter caseNodeElementAlt(NodeElementAlt object)
      {
        return createNodeElementAltAdapter();
      }
      @Override
      public Adapter caseFigure(Figure object)
      {
        return createFigureAdapter();
      }
      @Override
      public Adapter caseRegularFigure(RegularFigure object)
      {
        return createRegularFigureAdapter();
      }
      @Override
      public Adapter caseImageFigure(ImageFigure object)
      {
        return createImageFigureAdapter();
      }
      @Override
      public Adapter caseComplexFigure(ComplexFigure object)
      {
        return createComplexFigureAdapter();
      }
      @Override
      public Adapter caseNodeLinkDef(NodeLinkDef object)
      {
        return createNodeLinkDefAdapter();
      }
      @Override
      public Adapter caseNodeLinkAlt(NodeLinkAlt object)
      {
        return createNodeLinkAltAdapter();
      }
      @Override
      public Adapter caseNodeLineDef(NodeLineDef object)
      {
        return createNodeLineDefAdapter();
      }
      @Override
      public Adapter caseNodeLineAlt(NodeLineAlt object)
      {
        return createNodeLineAltAdapter();
      }
      @Override
      public Adapter caseInterNodeDef(InterNodeDef object)
      {
        return createInterNodeDefAdapter();
      }
      @Override
      public Adapter caseInterNodeAlt(InterNodeAlt object)
      {
        return createInterNodeAltAdapter();
      }
      @Override
      public Adapter caseExternalNodeDef(ExternalNodeDef object)
      {
        return createExternalNodeDefAdapter();
      }
      @Override
      public Adapter caseExternalNodeAlt(ExternalNodeAlt object)
      {
        return createExternalNodeAltAdapter();
      }
      @Override
      public Adapter caseRulesDefinition(RulesDefinition object)
      {
        return createRulesDefinitionAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseRuleForType(RuleForType object)
      {
        return createRuleForTypeAdapter();
      }
      @Override
      public Adapter caseRuleForReference(RuleForReference object)
      {
        return createRuleForReferenceAdapter();
      }
      @Override
      public Adapter caseCaseType(CaseType object)
      {
        return createCaseTypeAdapter();
      }
      @Override
      public Adapter caseCaseReference(CaseReference object)
      {
        return createCaseReferenceAdapter();
      }
      @Override
      public Adapter caseInteractionDefinition(InteractionDefinition object)
      {
        return createInteractionDefinitionAdapter();
      }
      @Override
      public Adapter caseInteractionElement(InteractionElement object)
      {
        return createInteractionElementAdapter();
      }
      @Override
      public Adapter caseWizard(Wizard object)
      {
        return createWizardAdapter();
      }
      @Override
      public Adapter caseElementWizard(ElementWizard object)
      {
        return createElementWizardAdapter();
      }
      @Override
      public Adapter casePage(Page object)
      {
        return createPageAdapter();
      }
      @Override
      public Adapter caseAttMap(AttMap object)
      {
        return createAttMapAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter casePersonalWizard(PersonalWizard object)
      {
        return createPersonalWizardAdapter();
      }
      @Override
      public Adapter caseView(View object)
      {
        return createViewAdapter();
      }
      @Override
      public Adapter casePredefinedView(PredefinedView object)
      {
        return createPredefinedViewAdapter();
      }
      @Override
      public Adapter caseViewType(ViewType object)
      {
        return createViewTypeAdapter();
      }
      @Override
      public Adapter caseShowChilds(ShowChilds object)
      {
        return createShowChildsAdapter();
      }
      @Override
      public Adapter caseShowSelection(ShowSelection object)
      {
        return createShowSelectionAdapter();
      }
      @Override
      public Adapter caseCountTypes(CountTypes object)
      {
        return createCountTypesAdapter();
      }
      @Override
      public Adapter caseViewStyle(ViewStyle object)
      {
        return createViewStyleAdapter();
      }
      @Override
      public Adapter casePersonalView(PersonalView object)
      {
        return createPersonalViewAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseEventType(EventType object)
      {
        return createEventTypeAdapter();
      }
      @Override
      public Adapter caseMouseEvent(MouseEvent object)
      {
        return createMouseEventAdapter();
      }
      @Override
      public Adapter caseKeyEvent(KeyEvent object)
      {
        return createKeyEventAdapter();
      }
      @Override
      public Adapter caseElementEvent(ElementEvent object)
      {
        return createElementEventAdapter();
      }
      @Override
      public Adapter caseMenuEvent(MenuEvent object)
      {
        return createMenuEventAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseWizardStart(WizardStart object)
      {
        return createWizardStartAdapter();
      }
      @Override
      public Adapter caseViewDeploy(ViewDeploy object)
      {
        return createViewDeployAdapter();
      }
      @Override
      public Adapter caseClassExecution(ClassExecution object)
      {
        return createClassExecutionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation <em>Graphical Representation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation
   * @generated
   */
  public Adapter createGraphicalRepresentationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.MetaConceptReference <em>Meta Concept Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.MetaConceptReference
   * @generated
   */
  public Adapter createMetaConceptReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ClassReference <em>Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ClassReference
   * @generated
   */
  public Adapter createClassReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.AttReference <em>Att Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.AttReference
   * @generated
   */
  public Adapter createAttReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ROOT <em>ROOT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ROOT
   * @generated
   */
  public Adapter createROOTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ToolDefinition <em>Tool Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ToolDefinition
   * @generated
   */
  public Adapter createToolDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ToolGroup <em>Tool Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ToolGroup
   * @generated
   */
  public Adapter createToolGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.CreationButton <em>Creation Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.CreationButton
   * @generated
   */
  public Adapter createCreationButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.StyleDefinition <em>Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.StyleDefinition
   * @generated
   */
  public Adapter createStyleDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.StyleElement <em>Style Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.StyleElement
   * @generated
   */
  public Adapter createStyleElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.LineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.LineStyle
   * @generated
   */
  public Adapter createLineStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.LineDecoration <em>Line Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.LineDecoration
   * @generated
   */
  public Adapter createLineDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration <em>Default Line Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration
   * @generated
   */
  public Adapter createDefaultLineDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.CustomLineDecoration <em>Custom Line Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.CustomLineDecoration
   * @generated
   */
  public Adapter createCustomLineDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.DefaultLayout <em>Default Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.DefaultLayout
   * @generated
   */
  public Adapter createDefaultLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.CustomLayout <em>Custom Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.CustomLayout
   * @generated
   */
  public Adapter createCustomLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.FigureStyle <em>Figure Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.FigureStyle
   * @generated
   */
  public Adapter createFigureStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Rounded <em>Rounded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Rounded
   * @generated
   */
  public Adapter createRoundedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.RegularPolygon <em>Regular Polygon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.RegularPolygon
   * @generated
   */
  public Adapter createRegularPolygonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Ellipse
   * @generated
   */
  public Adapter createEllipseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.CustomFigure <em>Custom Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.CustomFigure
   * @generated
   */
  public Adapter createCustomFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.LabelPosition <em>Label Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.LabelPosition
   * @generated
   */
  public Adapter createLabelPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.GraphicalDefinition <em>Graphical Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.GraphicalDefinition
   * @generated
   */
  public Adapter createGraphicalDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.GraphicalElement <em>Graphical Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.GraphicalElement
   * @generated
   */
  public Adapter createGraphicalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ElementDef <em>Element Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ElementDef
   * @generated
   */
  public Adapter createElementDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeDef <em>Node Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeDef
   * @generated
   */
  public Adapter createNodeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.AttLinkDef <em>Att Link Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.AttLinkDef
   * @generated
   */
  public Adapter createAttLinkDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ElementAlt <em>Element Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ElementAlt
   * @generated
   */
  public Adapter createElementAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeAlt <em>Node Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeAlt
   * @generated
   */
  public Adapter createNodeAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.AttLinkAlt <em>Att Link Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.AttLinkAlt
   * @generated
   */
  public Adapter createAttLinkAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeElementDef <em>Node Element Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeElementDef
   * @generated
   */
  public Adapter createNodeElementDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeElementAlt <em>Node Element Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeElementAlt
   * @generated
   */
  public Adapter createNodeElementAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Figure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Figure
   * @generated
   */
  public Adapter createFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.RegularFigure <em>Regular Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.RegularFigure
   * @generated
   */
  public Adapter createRegularFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ImageFigure <em>Image Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ImageFigure
   * @generated
   */
  public Adapter createImageFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ComplexFigure <em>Complex Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ComplexFigure
   * @generated
   */
  public Adapter createComplexFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeLinkDef <em>Node Link Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeLinkDef
   * @generated
   */
  public Adapter createNodeLinkDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeLinkAlt <em>Node Link Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeLinkAlt
   * @generated
   */
  public Adapter createNodeLinkAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeLineDef <em>Node Line Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeLineDef
   * @generated
   */
  public Adapter createNodeLineDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.NodeLineAlt <em>Node Line Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.NodeLineAlt
   * @generated
   */
  public Adapter createNodeLineAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.InterNodeDef <em>Inter Node Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.InterNodeDef
   * @generated
   */
  public Adapter createInterNodeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.InterNodeAlt <em>Inter Node Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.InterNodeAlt
   * @generated
   */
  public Adapter createInterNodeAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ExternalNodeDef <em>External Node Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ExternalNodeDef
   * @generated
   */
  public Adapter createExternalNodeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ExternalNodeAlt <em>External Node Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ExternalNodeAlt
   * @generated
   */
  public Adapter createExternalNodeAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.RulesDefinition <em>Rules Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.RulesDefinition
   * @generated
   */
  public Adapter createRulesDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.RuleForType <em>Rule For Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.RuleForType
   * @generated
   */
  public Adapter createRuleForTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.RuleForReference <em>Rule For Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.RuleForReference
   * @generated
   */
  public Adapter createRuleForReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.CaseType <em>Case Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.CaseType
   * @generated
   */
  public Adapter createCaseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.CaseReference <em>Case Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.CaseReference
   * @generated
   */
  public Adapter createCaseReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.InteractionDefinition <em>Interaction Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.InteractionDefinition
   * @generated
   */
  public Adapter createInteractionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.InteractionElement <em>Interaction Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.InteractionElement
   * @generated
   */
  public Adapter createInteractionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Wizard <em>Wizard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Wizard
   * @generated
   */
  public Adapter createWizardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ElementWizard <em>Element Wizard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ElementWizard
   * @generated
   */
  public Adapter createElementWizardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Page
   * @generated
   */
  public Adapter createPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.AttMap <em>Att Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.AttMap
   * @generated
   */
  public Adapter createAttMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.PersonalWizard <em>Personal Wizard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.PersonalWizard
   * @generated
   */
  public Adapter createPersonalWizardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.View
   * @generated
   */
  public Adapter createViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.PredefinedView <em>Predefined View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.PredefinedView
   * @generated
   */
  public Adapter createPredefinedViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ViewType <em>View Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ViewType
   * @generated
   */
  public Adapter createViewTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ShowChilds <em>Show Childs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ShowChilds
   * @generated
   */
  public Adapter createShowChildsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ShowSelection <em>Show Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ShowSelection
   * @generated
   */
  public Adapter createShowSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.CountTypes <em>Count Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.CountTypes
   * @generated
   */
  public Adapter createCountTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ViewStyle <em>View Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ViewStyle
   * @generated
   */
  public Adapter createViewStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.PersonalView <em>Personal View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.PersonalView
   * @generated
   */
  public Adapter createPersonalViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.EventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.EventType
   * @generated
   */
  public Adapter createEventTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.MouseEvent <em>Mouse Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.MouseEvent
   * @generated
   */
  public Adapter createMouseEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.KeyEvent <em>Key Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.KeyEvent
   * @generated
   */
  public Adapter createKeyEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ElementEvent <em>Element Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ElementEvent
   * @generated
   */
  public Adapter createElementEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.MenuEvent <em>Menu Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.MenuEvent
   * @generated
   */
  public Adapter createMenuEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.WizardStart <em>Wizard Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.WizardStart
   * @generated
   */
  public Adapter createWizardStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ViewDeploy <em>View Deploy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ViewDeploy
   * @generated
   */
  public Adapter createViewDeployAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.enar.picture.ClassExecution <em>Class Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.enar.picture.ClassExecution
   * @generated
   */
  public Adapter createClassExecutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PictureAdapterFactory
