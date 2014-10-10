/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.enar.picture.PicturePackage
 * @generated
 */
public interface PictureFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PictureFactory eINSTANCE = co.edu.uniandes.enar.picture.impl.PictureFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Graphical Representation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graphical Representation</em>'.
   * @generated
   */
  GraphicalRepresentation createGraphicalRepresentation();

  /**
   * Returns a new object of class '<em>Meta Concept Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Concept Reference</em>'.
   * @generated
   */
  MetaConceptReference createMetaConceptReference();

  /**
   * Returns a new object of class '<em>Class Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Reference</em>'.
   * @generated
   */
  ClassReference createClassReference();

  /**
   * Returns a new object of class '<em>Att Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Reference</em>'.
   * @generated
   */
  AttReference createAttReference();

  /**
   * Returns a new object of class '<em>ROOT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ROOT</em>'.
   * @generated
   */
  ROOT createROOT();

  /**
   * Returns a new object of class '<em>Tool Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tool Definition</em>'.
   * @generated
   */
  ToolDefinition createToolDefinition();

  /**
   * Returns a new object of class '<em>Tool Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tool Group</em>'.
   * @generated
   */
  ToolGroup createToolGroup();

  /**
   * Returns a new object of class '<em>Creation Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creation Button</em>'.
   * @generated
   */
  CreationButton createCreationButton();

  /**
   * Returns a new object of class '<em>Style Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style Definition</em>'.
   * @generated
   */
  StyleDefinition createStyleDefinition();

  /**
   * Returns a new object of class '<em>Style Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style Element</em>'.
   * @generated
   */
  StyleElement createStyleElement();

  /**
   * Returns a new object of class '<em>Line Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line Style</em>'.
   * @generated
   */
  LineStyle createLineStyle();

  /**
   * Returns a new object of class '<em>Line Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line Decoration</em>'.
   * @generated
   */
  LineDecoration createLineDecoration();

  /**
   * Returns a new object of class '<em>Default Line Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Line Decoration</em>'.
   * @generated
   */
  DefaultLineDecoration createDefaultLineDecoration();

  /**
   * Returns a new object of class '<em>Custom Line Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Line Decoration</em>'.
   * @generated
   */
  CustomLineDecoration createCustomLineDecoration();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layout</em>'.
   * @generated
   */
  Layout createLayout();

  /**
   * Returns a new object of class '<em>Default Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Layout</em>'.
   * @generated
   */
  DefaultLayout createDefaultLayout();

  /**
   * Returns a new object of class '<em>Custom Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Layout</em>'.
   * @generated
   */
  CustomLayout createCustomLayout();

  /**
   * Returns a new object of class '<em>Figure Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Figure Style</em>'.
   * @generated
   */
  FigureStyle createFigureStyle();

  /**
   * Returns a new object of class '<em>Rounded</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rounded</em>'.
   * @generated
   */
  Rounded createRounded();

  /**
   * Returns a new object of class '<em>Regular Polygon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regular Polygon</em>'.
   * @generated
   */
  RegularPolygon createRegularPolygon();

  /**
   * Returns a new object of class '<em>Ellipse</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ellipse</em>'.
   * @generated
   */
  Ellipse createEllipse();

  /**
   * Returns a new object of class '<em>Custom Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Figure</em>'.
   * @generated
   */
  CustomFigure createCustomFigure();

  /**
   * Returns a new object of class '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point</em>'.
   * @generated
   */
  Point createPoint();

  /**
   * Returns a new object of class '<em>Label Position</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Position</em>'.
   * @generated
   */
  LabelPosition createLabelPosition();

  /**
   * Returns a new object of class '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size</em>'.
   * @generated
   */
  Size createSize();

  /**
   * Returns a new object of class '<em>Graphical Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graphical Definition</em>'.
   * @generated
   */
  GraphicalDefinition createGraphicalDefinition();

  /**
   * Returns a new object of class '<em>Graphical Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graphical Element</em>'.
   * @generated
   */
  GraphicalElement createGraphicalElement();

  /**
   * Returns a new object of class '<em>Element Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Def</em>'.
   * @generated
   */
  ElementDef createElementDef();

  /**
   * Returns a new object of class '<em>Node Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Def</em>'.
   * @generated
   */
  NodeDef createNodeDef();

  /**
   * Returns a new object of class '<em>Att Link Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Link Def</em>'.
   * @generated
   */
  AttLinkDef createAttLinkDef();

  /**
   * Returns a new object of class '<em>Element Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Alt</em>'.
   * @generated
   */
  ElementAlt createElementAlt();

  /**
   * Returns a new object of class '<em>Node Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Alt</em>'.
   * @generated
   */
  NodeAlt createNodeAlt();

  /**
   * Returns a new object of class '<em>Att Link Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Link Alt</em>'.
   * @generated
   */
  AttLinkAlt createAttLinkAlt();

  /**
   * Returns a new object of class '<em>Node Element Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Element Def</em>'.
   * @generated
   */
  NodeElementDef createNodeElementDef();

  /**
   * Returns a new object of class '<em>Node Element Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Element Alt</em>'.
   * @generated
   */
  NodeElementAlt createNodeElementAlt();

  /**
   * Returns a new object of class '<em>Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Figure</em>'.
   * @generated
   */
  Figure createFigure();

  /**
   * Returns a new object of class '<em>Regular Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regular Figure</em>'.
   * @generated
   */
  RegularFigure createRegularFigure();

  /**
   * Returns a new object of class '<em>Image Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Figure</em>'.
   * @generated
   */
  ImageFigure createImageFigure();

  /**
   * Returns a new object of class '<em>Complex Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Figure</em>'.
   * @generated
   */
  ComplexFigure createComplexFigure();

  /**
   * Returns a new object of class '<em>Node Link Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Link Def</em>'.
   * @generated
   */
  NodeLinkDef createNodeLinkDef();

  /**
   * Returns a new object of class '<em>Node Link Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Link Alt</em>'.
   * @generated
   */
  NodeLinkAlt createNodeLinkAlt();

  /**
   * Returns a new object of class '<em>Node Line Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Line Def</em>'.
   * @generated
   */
  NodeLineDef createNodeLineDef();

  /**
   * Returns a new object of class '<em>Node Line Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Line Alt</em>'.
   * @generated
   */
  NodeLineAlt createNodeLineAlt();

  /**
   * Returns a new object of class '<em>Inter Node Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inter Node Def</em>'.
   * @generated
   */
  InterNodeDef createInterNodeDef();

  /**
   * Returns a new object of class '<em>Inter Node Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inter Node Alt</em>'.
   * @generated
   */
  InterNodeAlt createInterNodeAlt();

  /**
   * Returns a new object of class '<em>External Node Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Node Def</em>'.
   * @generated
   */
  ExternalNodeDef createExternalNodeDef();

  /**
   * Returns a new object of class '<em>External Node Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Node Alt</em>'.
   * @generated
   */
  ExternalNodeAlt createExternalNodeAlt();

  /**
   * Returns a new object of class '<em>Rules Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rules Definition</em>'.
   * @generated
   */
  RulesDefinition createRulesDefinition();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Rule For Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule For Type</em>'.
   * @generated
   */
  RuleForType createRuleForType();

  /**
   * Returns a new object of class '<em>Rule For Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule For Reference</em>'.
   * @generated
   */
  RuleForReference createRuleForReference();

  /**
   * Returns a new object of class '<em>Case Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Type</em>'.
   * @generated
   */
  CaseType createCaseType();

  /**
   * Returns a new object of class '<em>Case Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Reference</em>'.
   * @generated
   */
  CaseReference createCaseReference();

  /**
   * Returns a new object of class '<em>Interaction Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction Definition</em>'.
   * @generated
   */
  InteractionDefinition createInteractionDefinition();

  /**
   * Returns a new object of class '<em>Interaction Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction Element</em>'.
   * @generated
   */
  InteractionElement createInteractionElement();

  /**
   * Returns a new object of class '<em>Wizard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wizard</em>'.
   * @generated
   */
  Wizard createWizard();

  /**
   * Returns a new object of class '<em>Element Wizard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Wizard</em>'.
   * @generated
   */
  ElementWizard createElementWizard();

  /**
   * Returns a new object of class '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page</em>'.
   * @generated
   */
  Page createPage();

  /**
   * Returns a new object of class '<em>Att Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Map</em>'.
   * @generated
   */
  AttMap createAttMap();

  /**
   * Returns a new object of class '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button</em>'.
   * @generated
   */
  Button createButton();

  /**
   * Returns a new object of class '<em>Personal Wizard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personal Wizard</em>'.
   * @generated
   */
  PersonalWizard createPersonalWizard();

  /**
   * Returns a new object of class '<em>View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View</em>'.
   * @generated
   */
  View createView();

  /**
   * Returns a new object of class '<em>Predefined View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predefined View</em>'.
   * @generated
   */
  PredefinedView createPredefinedView();

  /**
   * Returns a new object of class '<em>View Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Type</em>'.
   * @generated
   */
  ViewType createViewType();

  /**
   * Returns a new object of class '<em>Show Childs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Childs</em>'.
   * @generated
   */
  ShowChilds createShowChilds();

  /**
   * Returns a new object of class '<em>Show Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Selection</em>'.
   * @generated
   */
  ShowSelection createShowSelection();

  /**
   * Returns a new object of class '<em>Count Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count Types</em>'.
   * @generated
   */
  CountTypes createCountTypes();

  /**
   * Returns a new object of class '<em>View Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Style</em>'.
   * @generated
   */
  ViewStyle createViewStyle();

  /**
   * Returns a new object of class '<em>Personal View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personal View</em>'.
   * @generated
   */
  PersonalView createPersonalView();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Event Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Type</em>'.
   * @generated
   */
  EventType createEventType();

  /**
   * Returns a new object of class '<em>Mouse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mouse Event</em>'.
   * @generated
   */
  MouseEvent createMouseEvent();

  /**
   * Returns a new object of class '<em>Key Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Event</em>'.
   * @generated
   */
  KeyEvent createKeyEvent();

  /**
   * Returns a new object of class '<em>Element Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Event</em>'.
   * @generated
   */
  ElementEvent createElementEvent();

  /**
   * Returns a new object of class '<em>Menu Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menu Event</em>'.
   * @generated
   */
  MenuEvent createMenuEvent();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Wizard Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wizard Start</em>'.
   * @generated
   */
  WizardStart createWizardStart();

  /**
   * Returns a new object of class '<em>View Deploy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Deploy</em>'.
   * @generated
   */
  ViewDeploy createViewDeploy();

  /**
   * Returns a new object of class '<em>Class Execution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Execution</em>'.
   * @generated
   */
  ClassExecution createClassExecution();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PicturePackage getPicturePackage();

} //PictureFactory
