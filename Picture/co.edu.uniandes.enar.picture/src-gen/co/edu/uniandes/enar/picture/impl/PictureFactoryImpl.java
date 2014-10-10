/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PictureFactoryImpl extends EFactoryImpl implements PictureFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PictureFactory init()
  {
    try
    {
      PictureFactory thePictureFactory = (PictureFactory)EPackage.Registry.INSTANCE.getEFactory(PicturePackage.eNS_URI);
      if (thePictureFactory != null)
      {
        return thePictureFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PictureFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PictureFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PicturePackage.MODEL: return createModel();
      case PicturePackage.IMPORT: return createImport();
      case PicturePackage.GRAPHICAL_REPRESENTATION: return createGraphicalRepresentation();
      case PicturePackage.META_CONCEPT_REFERENCE: return createMetaConceptReference();
      case PicturePackage.CLASS_REFERENCE: return createClassReference();
      case PicturePackage.ATT_REFERENCE: return createAttReference();
      case PicturePackage.ROOT: return createROOT();
      case PicturePackage.TOOL_DEFINITION: return createToolDefinition();
      case PicturePackage.TOOL_GROUP: return createToolGroup();
      case PicturePackage.CREATION_BUTTON: return createCreationButton();
      case PicturePackage.STYLE_DEFINITION: return createStyleDefinition();
      case PicturePackage.STYLE_ELEMENT: return createStyleElement();
      case PicturePackage.LINE_STYLE: return createLineStyle();
      case PicturePackage.LINE_DECORATION: return createLineDecoration();
      case PicturePackage.DEFAULT_LINE_DECORATION: return createDefaultLineDecoration();
      case PicturePackage.CUSTOM_LINE_DECORATION: return createCustomLineDecoration();
      case PicturePackage.COLOR: return createColor();
      case PicturePackage.LAYOUT: return createLayout();
      case PicturePackage.DEFAULT_LAYOUT: return createDefaultLayout();
      case PicturePackage.CUSTOM_LAYOUT: return createCustomLayout();
      case PicturePackage.FIGURE_STYLE: return createFigureStyle();
      case PicturePackage.ROUNDED: return createRounded();
      case PicturePackage.REGULAR_POLYGON: return createRegularPolygon();
      case PicturePackage.ELLIPSE: return createEllipse();
      case PicturePackage.CUSTOM_FIGURE: return createCustomFigure();
      case PicturePackage.POINT: return createPoint();
      case PicturePackage.LABEL_POSITION: return createLabelPosition();
      case PicturePackage.SIZE: return createSize();
      case PicturePackage.GRAPHICAL_DEFINITION: return createGraphicalDefinition();
      case PicturePackage.GRAPHICAL_ELEMENT: return createGraphicalElement();
      case PicturePackage.ELEMENT_DEF: return createElementDef();
      case PicturePackage.NODE_DEF: return createNodeDef();
      case PicturePackage.ATT_LINK_DEF: return createAttLinkDef();
      case PicturePackage.ELEMENT_ALT: return createElementAlt();
      case PicturePackage.NODE_ALT: return createNodeAlt();
      case PicturePackage.ATT_LINK_ALT: return createAttLinkAlt();
      case PicturePackage.NODE_ELEMENT_DEF: return createNodeElementDef();
      case PicturePackage.NODE_ELEMENT_ALT: return createNodeElementAlt();
      case PicturePackage.FIGURE: return createFigure();
      case PicturePackage.REGULAR_FIGURE: return createRegularFigure();
      case PicturePackage.IMAGE_FIGURE: return createImageFigure();
      case PicturePackage.COMPLEX_FIGURE: return createComplexFigure();
      case PicturePackage.NODE_LINK_DEF: return createNodeLinkDef();
      case PicturePackage.NODE_LINK_ALT: return createNodeLinkAlt();
      case PicturePackage.NODE_LINE_DEF: return createNodeLineDef();
      case PicturePackage.NODE_LINE_ALT: return createNodeLineAlt();
      case PicturePackage.INTER_NODE_DEF: return createInterNodeDef();
      case PicturePackage.INTER_NODE_ALT: return createInterNodeAlt();
      case PicturePackage.EXTERNAL_NODE_DEF: return createExternalNodeDef();
      case PicturePackage.EXTERNAL_NODE_ALT: return createExternalNodeAlt();
      case PicturePackage.RULES_DEFINITION: return createRulesDefinition();
      case PicturePackage.RULE: return createRule();
      case PicturePackage.RULE_FOR_TYPE: return createRuleForType();
      case PicturePackage.RULE_FOR_REFERENCE: return createRuleForReference();
      case PicturePackage.CASE_TYPE: return createCaseType();
      case PicturePackage.CASE_REFERENCE: return createCaseReference();
      case PicturePackage.INTERACTION_DEFINITION: return createInteractionDefinition();
      case PicturePackage.INTERACTION_ELEMENT: return createInteractionElement();
      case PicturePackage.WIZARD: return createWizard();
      case PicturePackage.ELEMENT_WIZARD: return createElementWizard();
      case PicturePackage.PAGE: return createPage();
      case PicturePackage.ATT_MAP: return createAttMap();
      case PicturePackage.BUTTON: return createButton();
      case PicturePackage.PERSONAL_WIZARD: return createPersonalWizard();
      case PicturePackage.VIEW: return createView();
      case PicturePackage.PREDEFINED_VIEW: return createPredefinedView();
      case PicturePackage.VIEW_TYPE: return createViewType();
      case PicturePackage.SHOW_CHILDS: return createShowChilds();
      case PicturePackage.SHOW_SELECTION: return createShowSelection();
      case PicturePackage.COUNT_TYPES: return createCountTypes();
      case PicturePackage.VIEW_STYLE: return createViewStyle();
      case PicturePackage.PERSONAL_VIEW: return createPersonalView();
      case PicturePackage.STATEMENT: return createStatement();
      case PicturePackage.EVENT: return createEvent();
      case PicturePackage.EVENT_TYPE: return createEventType();
      case PicturePackage.MOUSE_EVENT: return createMouseEvent();
      case PicturePackage.KEY_EVENT: return createKeyEvent();
      case PicturePackage.ELEMENT_EVENT: return createElementEvent();
      case PicturePackage.MENU_EVENT: return createMenuEvent();
      case PicturePackage.INSTRUCTION: return createInstruction();
      case PicturePackage.WIZARD_START: return createWizardStart();
      case PicturePackage.VIEW_DEPLOY: return createViewDeploy();
      case PicturePackage.CLASS_EXECUTION: return createClassExecution();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PicturePackage.LINE_TYPE:
        return createLineTypeFromString(eDataType, initialValue);
      case PicturePackage.WIZARD_TYPE:
        return createWizardTypeFromString(eDataType, initialValue);
      case PicturePackage.COMPONENT_TYPE:
        return createComponentTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PicturePackage.LINE_TYPE:
        return convertLineTypeToString(eDataType, instanceValue);
      case PicturePackage.WIZARD_TYPE:
        return convertWizardTypeToString(eDataType, instanceValue);
      case PicturePackage.COMPONENT_TYPE:
        return convertComponentTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphicalRepresentation createGraphicalRepresentation()
  {
    GraphicalRepresentationImpl graphicalRepresentation = new GraphicalRepresentationImpl();
    return graphicalRepresentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaConceptReference createMetaConceptReference()
  {
    MetaConceptReferenceImpl metaConceptReference = new MetaConceptReferenceImpl();
    return metaConceptReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassReference createClassReference()
  {
    ClassReferenceImpl classReference = new ClassReferenceImpl();
    return classReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttReference createAttReference()
  {
    AttReferenceImpl attReference = new AttReferenceImpl();
    return attReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ROOT createROOT()
  {
    ROOTImpl root = new ROOTImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolDefinition createToolDefinition()
  {
    ToolDefinitionImpl toolDefinition = new ToolDefinitionImpl();
    return toolDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolGroup createToolGroup()
  {
    ToolGroupImpl toolGroup = new ToolGroupImpl();
    return toolGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreationButton createCreationButton()
  {
    CreationButtonImpl creationButton = new CreationButtonImpl();
    return creationButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleDefinition createStyleDefinition()
  {
    StyleDefinitionImpl styleDefinition = new StyleDefinitionImpl();
    return styleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleElement createStyleElement()
  {
    StyleElementImpl styleElement = new StyleElementImpl();
    return styleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle createLineStyle()
  {
    LineStyleImpl lineStyle = new LineStyleImpl();
    return lineStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineDecoration createLineDecoration()
  {
    LineDecorationImpl lineDecoration = new LineDecorationImpl();
    return lineDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultLineDecoration createDefaultLineDecoration()
  {
    DefaultLineDecorationImpl defaultLineDecoration = new DefaultLineDecorationImpl();
    return defaultLineDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomLineDecoration createCustomLineDecoration()
  {
    CustomLineDecorationImpl customLineDecoration = new CustomLineDecorationImpl();
    return customLineDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultLayout createDefaultLayout()
  {
    DefaultLayoutImpl defaultLayout = new DefaultLayoutImpl();
    return defaultLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomLayout createCustomLayout()
  {
    CustomLayoutImpl customLayout = new CustomLayoutImpl();
    return customLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureStyle createFigureStyle()
  {
    FigureStyleImpl figureStyle = new FigureStyleImpl();
    return figureStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rounded createRounded()
  {
    RoundedImpl rounded = new RoundedImpl();
    return rounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegularPolygon createRegularPolygon()
  {
    RegularPolygonImpl regularPolygon = new RegularPolygonImpl();
    return regularPolygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ellipse createEllipse()
  {
    EllipseImpl ellipse = new EllipseImpl();
    return ellipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomFigure createCustomFigure()
  {
    CustomFigureImpl customFigure = new CustomFigureImpl();
    return customFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelPosition createLabelPosition()
  {
    LabelPositionImpl labelPosition = new LabelPositionImpl();
    return labelPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphicalDefinition createGraphicalDefinition()
  {
    GraphicalDefinitionImpl graphicalDefinition = new GraphicalDefinitionImpl();
    return graphicalDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphicalElement createGraphicalElement()
  {
    GraphicalElementImpl graphicalElement = new GraphicalElementImpl();
    return graphicalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDef createElementDef()
  {
    ElementDefImpl elementDef = new ElementDefImpl();
    return elementDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeDef createNodeDef()
  {
    NodeDefImpl nodeDef = new NodeDefImpl();
    return nodeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttLinkDef createAttLinkDef()
  {
    AttLinkDefImpl attLinkDef = new AttLinkDefImpl();
    return attLinkDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementAlt createElementAlt()
  {
    ElementAltImpl elementAlt = new ElementAltImpl();
    return elementAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeAlt createNodeAlt()
  {
    NodeAltImpl nodeAlt = new NodeAltImpl();
    return nodeAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttLinkAlt createAttLinkAlt()
  {
    AttLinkAltImpl attLinkAlt = new AttLinkAltImpl();
    return attLinkAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeElementDef createNodeElementDef()
  {
    NodeElementDefImpl nodeElementDef = new NodeElementDefImpl();
    return nodeElementDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeElementAlt createNodeElementAlt()
  {
    NodeElementAltImpl nodeElementAlt = new NodeElementAltImpl();
    return nodeElementAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Figure createFigure()
  {
    FigureImpl figure = new FigureImpl();
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegularFigure createRegularFigure()
  {
    RegularFigureImpl regularFigure = new RegularFigureImpl();
    return regularFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageFigure createImageFigure()
  {
    ImageFigureImpl imageFigure = new ImageFigureImpl();
    return imageFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexFigure createComplexFigure()
  {
    ComplexFigureImpl complexFigure = new ComplexFigureImpl();
    return complexFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLinkDef createNodeLinkDef()
  {
    NodeLinkDefImpl nodeLinkDef = new NodeLinkDefImpl();
    return nodeLinkDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLinkAlt createNodeLinkAlt()
  {
    NodeLinkAltImpl nodeLinkAlt = new NodeLinkAltImpl();
    return nodeLinkAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLineDef createNodeLineDef()
  {
    NodeLineDefImpl nodeLineDef = new NodeLineDefImpl();
    return nodeLineDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLineAlt createNodeLineAlt()
  {
    NodeLineAltImpl nodeLineAlt = new NodeLineAltImpl();
    return nodeLineAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterNodeDef createInterNodeDef()
  {
    InterNodeDefImpl interNodeDef = new InterNodeDefImpl();
    return interNodeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterNodeAlt createInterNodeAlt()
  {
    InterNodeAltImpl interNodeAlt = new InterNodeAltImpl();
    return interNodeAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalNodeDef createExternalNodeDef()
  {
    ExternalNodeDefImpl externalNodeDef = new ExternalNodeDefImpl();
    return externalNodeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalNodeAlt createExternalNodeAlt()
  {
    ExternalNodeAltImpl externalNodeAlt = new ExternalNodeAltImpl();
    return externalNodeAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RulesDefinition createRulesDefinition()
  {
    RulesDefinitionImpl rulesDefinition = new RulesDefinitionImpl();
    return rulesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleForType createRuleForType()
  {
    RuleForTypeImpl ruleForType = new RuleForTypeImpl();
    return ruleForType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleForReference createRuleForReference()
  {
    RuleForReferenceImpl ruleForReference = new RuleForReferenceImpl();
    return ruleForReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseType createCaseType()
  {
    CaseTypeImpl caseType = new CaseTypeImpl();
    return caseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseReference createCaseReference()
  {
    CaseReferenceImpl caseReference = new CaseReferenceImpl();
    return caseReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionDefinition createInteractionDefinition()
  {
    InteractionDefinitionImpl interactionDefinition = new InteractionDefinitionImpl();
    return interactionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionElement createInteractionElement()
  {
    InteractionElementImpl interactionElement = new InteractionElementImpl();
    return interactionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wizard createWizard()
  {
    WizardImpl wizard = new WizardImpl();
    return wizard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementWizard createElementWizard()
  {
    ElementWizardImpl elementWizard = new ElementWizardImpl();
    return elementWizard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttMap createAttMap()
  {
    AttMapImpl attMap = new AttMapImpl();
    return attMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonalWizard createPersonalWizard()
  {
    PersonalWizardImpl personalWizard = new PersonalWizardImpl();
    return personalWizard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredefinedView createPredefinedView()
  {
    PredefinedViewImpl predefinedView = new PredefinedViewImpl();
    return predefinedView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType createViewType()
  {
    ViewTypeImpl viewType = new ViewTypeImpl();
    return viewType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowChilds createShowChilds()
  {
    ShowChildsImpl showChilds = new ShowChildsImpl();
    return showChilds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowSelection createShowSelection()
  {
    ShowSelectionImpl showSelection = new ShowSelectionImpl();
    return showSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountTypes createCountTypes()
  {
    CountTypesImpl countTypes = new CountTypesImpl();
    return countTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewStyle createViewStyle()
  {
    ViewStyleImpl viewStyle = new ViewStyleImpl();
    return viewStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonalView createPersonalView()
  {
    PersonalViewImpl personalView = new PersonalViewImpl();
    return personalView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventType createEventType()
  {
    EventTypeImpl eventType = new EventTypeImpl();
    return eventType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MouseEvent createMouseEvent()
  {
    MouseEventImpl mouseEvent = new MouseEventImpl();
    return mouseEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyEvent createKeyEvent()
  {
    KeyEventImpl keyEvent = new KeyEventImpl();
    return keyEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementEvent createElementEvent()
  {
    ElementEventImpl elementEvent = new ElementEventImpl();
    return elementEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuEvent createMenuEvent()
  {
    MenuEventImpl menuEvent = new MenuEventImpl();
    return menuEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WizardStart createWizardStart()
  {
    WizardStartImpl wizardStart = new WizardStartImpl();
    return wizardStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewDeploy createViewDeploy()
  {
    ViewDeployImpl viewDeploy = new ViewDeployImpl();
    return viewDeploy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassExecution createClassExecution()
  {
    ClassExecutionImpl classExecution = new ClassExecutionImpl();
    return classExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineType createLineTypeFromString(EDataType eDataType, String initialValue)
  {
    LineType result = LineType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLineTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WizardType createWizardTypeFromString(EDataType eDataType, String initialValue)
  {
    WizardType result = WizardType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWizardTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentType createComponentTypeFromString(EDataType eDataType, String initialValue)
  {
    ComponentType result = ComponentType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComponentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PicturePackage getPicturePackage()
  {
    return (PicturePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PicturePackage getPackage()
  {
    return PicturePackage.eINSTANCE;
  }

} //PictureFactoryImpl
