/**
 */
package co.edu.uniandes.enar.picture.util;

import co.edu.uniandes.enar.picture.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.enar.picture.PicturePackage
 * @generated
 */
public class PictureSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PicturePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PictureSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PicturePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PicturePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.GRAPHICAL_REPRESENTATION:
      {
        GraphicalRepresentation graphicalRepresentation = (GraphicalRepresentation)theEObject;
        T result = caseGraphicalRepresentation(graphicalRepresentation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.META_CONCEPT_REFERENCE:
      {
        MetaConceptReference metaConceptReference = (MetaConceptReference)theEObject;
        T result = caseMetaConceptReference(metaConceptReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CLASS_REFERENCE:
      {
        ClassReference classReference = (ClassReference)theEObject;
        T result = caseClassReference(classReference);
        if (result == null) result = caseMetaConceptReference(classReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ATT_REFERENCE:
      {
        AttReference attReference = (AttReference)theEObject;
        T result = caseAttReference(attReference);
        if (result == null) result = caseMetaConceptReference(attReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ROOT:
      {
        ROOT root = (ROOT)theEObject;
        T result = caseROOT(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.TOOL_DEFINITION:
      {
        ToolDefinition toolDefinition = (ToolDefinition)theEObject;
        T result = caseToolDefinition(toolDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.TOOL_GROUP:
      {
        ToolGroup toolGroup = (ToolGroup)theEObject;
        T result = caseToolGroup(toolGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CREATION_BUTTON:
      {
        CreationButton creationButton = (CreationButton)theEObject;
        T result = caseCreationButton(creationButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.STYLE_DEFINITION:
      {
        StyleDefinition styleDefinition = (StyleDefinition)theEObject;
        T result = caseStyleDefinition(styleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.STYLE_ELEMENT:
      {
        StyleElement styleElement = (StyleElement)theEObject;
        T result = caseStyleElement(styleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.LINE_STYLE:
      {
        LineStyle lineStyle = (LineStyle)theEObject;
        T result = caseLineStyle(lineStyle);
        if (result == null) result = caseStyleElement(lineStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.LINE_DECORATION:
      {
        LineDecoration lineDecoration = (LineDecoration)theEObject;
        T result = caseLineDecoration(lineDecoration);
        if (result == null) result = caseStyleElement(lineDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.DEFAULT_LINE_DECORATION:
      {
        DefaultLineDecoration defaultLineDecoration = (DefaultLineDecoration)theEObject;
        T result = caseDefaultLineDecoration(defaultLineDecoration);
        if (result == null) result = caseLineDecoration(defaultLineDecoration);
        if (result == null) result = caseStyleElement(defaultLineDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CUSTOM_LINE_DECORATION:
      {
        CustomLineDecoration customLineDecoration = (CustomLineDecoration)theEObject;
        T result = caseCustomLineDecoration(customLineDecoration);
        if (result == null) result = caseLineDecoration(customLineDecoration);
        if (result == null) result = caseStyleElement(customLineDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = caseStyleElement(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.DEFAULT_LAYOUT:
      {
        DefaultLayout defaultLayout = (DefaultLayout)theEObject;
        T result = caseDefaultLayout(defaultLayout);
        if (result == null) result = caseLayout(defaultLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CUSTOM_LAYOUT:
      {
        CustomLayout customLayout = (CustomLayout)theEObject;
        T result = caseCustomLayout(customLayout);
        if (result == null) result = caseLayout(customLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.FIGURE_STYLE:
      {
        FigureStyle figureStyle = (FigureStyle)theEObject;
        T result = caseFigureStyle(figureStyle);
        if (result == null) result = caseStyleElement(figureStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ROUNDED:
      {
        Rounded rounded = (Rounded)theEObject;
        T result = caseRounded(rounded);
        if (result == null) result = caseFigureStyle(rounded);
        if (result == null) result = caseStyleElement(rounded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.REGULAR_POLYGON:
      {
        RegularPolygon regularPolygon = (RegularPolygon)theEObject;
        T result = caseRegularPolygon(regularPolygon);
        if (result == null) result = caseFigureStyle(regularPolygon);
        if (result == null) result = caseStyleElement(regularPolygon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ELLIPSE:
      {
        Ellipse ellipse = (Ellipse)theEObject;
        T result = caseEllipse(ellipse);
        if (result == null) result = caseFigureStyle(ellipse);
        if (result == null) result = caseStyleElement(ellipse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CUSTOM_FIGURE:
      {
        CustomFigure customFigure = (CustomFigure)theEObject;
        T result = caseCustomFigure(customFigure);
        if (result == null) result = caseFigureStyle(customFigure);
        if (result == null) result = caseStyleElement(customFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.LABEL_POSITION:
      {
        LabelPosition labelPosition = (LabelPosition)theEObject;
        T result = caseLabelPosition(labelPosition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.SIZE:
      {
        Size size = (Size)theEObject;
        T result = caseSize(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.GRAPHICAL_DEFINITION:
      {
        GraphicalDefinition graphicalDefinition = (GraphicalDefinition)theEObject;
        T result = caseGraphicalDefinition(graphicalDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.GRAPHICAL_ELEMENT:
      {
        GraphicalElement graphicalElement = (GraphicalElement)theEObject;
        T result = caseGraphicalElement(graphicalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ELEMENT_DEF:
      {
        ElementDef elementDef = (ElementDef)theEObject;
        T result = caseElementDef(elementDef);
        if (result == null) result = caseGraphicalElement(elementDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_DEF:
      {
        NodeDef nodeDef = (NodeDef)theEObject;
        T result = caseNodeDef(nodeDef);
        if (result == null) result = caseElementDef(nodeDef);
        if (result == null) result = caseGraphicalElement(nodeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ATT_LINK_DEF:
      {
        AttLinkDef attLinkDef = (AttLinkDef)theEObject;
        T result = caseAttLinkDef(attLinkDef);
        if (result == null) result = caseElementDef(attLinkDef);
        if (result == null) result = caseGraphicalElement(attLinkDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ELEMENT_ALT:
      {
        ElementAlt elementAlt = (ElementAlt)theEObject;
        T result = caseElementAlt(elementAlt);
        if (result == null) result = caseGraphicalElement(elementAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_ALT:
      {
        NodeAlt nodeAlt = (NodeAlt)theEObject;
        T result = caseNodeAlt(nodeAlt);
        if (result == null) result = caseElementAlt(nodeAlt);
        if (result == null) result = caseGraphicalElement(nodeAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ATT_LINK_ALT:
      {
        AttLinkAlt attLinkAlt = (AttLinkAlt)theEObject;
        T result = caseAttLinkAlt(attLinkAlt);
        if (result == null) result = caseElementAlt(attLinkAlt);
        if (result == null) result = caseGraphicalElement(attLinkAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_ELEMENT_DEF:
      {
        NodeElementDef nodeElementDef = (NodeElementDef)theEObject;
        T result = caseNodeElementDef(nodeElementDef);
        if (result == null) result = caseNodeDef(nodeElementDef);
        if (result == null) result = caseElementDef(nodeElementDef);
        if (result == null) result = caseGraphicalElement(nodeElementDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_ELEMENT_ALT:
      {
        NodeElementAlt nodeElementAlt = (NodeElementAlt)theEObject;
        T result = caseNodeElementAlt(nodeElementAlt);
        if (result == null) result = caseNodeAlt(nodeElementAlt);
        if (result == null) result = caseElementAlt(nodeElementAlt);
        if (result == null) result = caseGraphicalElement(nodeElementAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.FIGURE:
      {
        Figure figure = (Figure)theEObject;
        T result = caseFigure(figure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.REGULAR_FIGURE:
      {
        RegularFigure regularFigure = (RegularFigure)theEObject;
        T result = caseRegularFigure(regularFigure);
        if (result == null) result = caseFigure(regularFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.IMAGE_FIGURE:
      {
        ImageFigure imageFigure = (ImageFigure)theEObject;
        T result = caseImageFigure(imageFigure);
        if (result == null) result = caseFigure(imageFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.COMPLEX_FIGURE:
      {
        ComplexFigure complexFigure = (ComplexFigure)theEObject;
        T result = caseComplexFigure(complexFigure);
        if (result == null) result = caseFigure(complexFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_LINK_DEF:
      {
        NodeLinkDef nodeLinkDef = (NodeLinkDef)theEObject;
        T result = caseNodeLinkDef(nodeLinkDef);
        if (result == null) result = caseNodeDef(nodeLinkDef);
        if (result == null) result = caseElementDef(nodeLinkDef);
        if (result == null) result = caseGraphicalElement(nodeLinkDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_LINK_ALT:
      {
        NodeLinkAlt nodeLinkAlt = (NodeLinkAlt)theEObject;
        T result = caseNodeLinkAlt(nodeLinkAlt);
        if (result == null) result = caseNodeAlt(nodeLinkAlt);
        if (result == null) result = caseElementAlt(nodeLinkAlt);
        if (result == null) result = caseGraphicalElement(nodeLinkAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_LINE_DEF:
      {
        NodeLineDef nodeLineDef = (NodeLineDef)theEObject;
        T result = caseNodeLineDef(nodeLineDef);
        if (result == null) result = caseAttLinkDef(nodeLineDef);
        if (result == null) result = caseElementDef(nodeLineDef);
        if (result == null) result = caseGraphicalElement(nodeLineDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.NODE_LINE_ALT:
      {
        NodeLineAlt nodeLineAlt = (NodeLineAlt)theEObject;
        T result = caseNodeLineAlt(nodeLineAlt);
        if (result == null) result = caseAttLinkAlt(nodeLineAlt);
        if (result == null) result = caseElementAlt(nodeLineAlt);
        if (result == null) result = caseGraphicalElement(nodeLineAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.INTER_NODE_DEF:
      {
        InterNodeDef interNodeDef = (InterNodeDef)theEObject;
        T result = caseInterNodeDef(interNodeDef);
        if (result == null) result = caseAttLinkDef(interNodeDef);
        if (result == null) result = caseElementDef(interNodeDef);
        if (result == null) result = caseGraphicalElement(interNodeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.INTER_NODE_ALT:
      {
        InterNodeAlt interNodeAlt = (InterNodeAlt)theEObject;
        T result = caseInterNodeAlt(interNodeAlt);
        if (result == null) result = caseAttLinkAlt(interNodeAlt);
        if (result == null) result = caseElementAlt(interNodeAlt);
        if (result == null) result = caseGraphicalElement(interNodeAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.EXTERNAL_NODE_DEF:
      {
        ExternalNodeDef externalNodeDef = (ExternalNodeDef)theEObject;
        T result = caseExternalNodeDef(externalNodeDef);
        if (result == null) result = caseAttLinkDef(externalNodeDef);
        if (result == null) result = caseElementDef(externalNodeDef);
        if (result == null) result = caseGraphicalElement(externalNodeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.EXTERNAL_NODE_ALT:
      {
        ExternalNodeAlt externalNodeAlt = (ExternalNodeAlt)theEObject;
        T result = caseExternalNodeAlt(externalNodeAlt);
        if (result == null) result = caseAttLinkAlt(externalNodeAlt);
        if (result == null) result = caseElementAlt(externalNodeAlt);
        if (result == null) result = caseGraphicalElement(externalNodeAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.RULES_DEFINITION:
      {
        RulesDefinition rulesDefinition = (RulesDefinition)theEObject;
        T result = caseRulesDefinition(rulesDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.RULE_FOR_TYPE:
      {
        RuleForType ruleForType = (RuleForType)theEObject;
        T result = caseRuleForType(ruleForType);
        if (result == null) result = caseRule(ruleForType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.RULE_FOR_REFERENCE:
      {
        RuleForReference ruleForReference = (RuleForReference)theEObject;
        T result = caseRuleForReference(ruleForReference);
        if (result == null) result = caseRule(ruleForReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CASE_TYPE:
      {
        CaseType caseType = (CaseType)theEObject;
        T result = caseCaseType(caseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CASE_REFERENCE:
      {
        CaseReference caseReference = (CaseReference)theEObject;
        T result = caseCaseReference(caseReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.INTERACTION_DEFINITION:
      {
        InteractionDefinition interactionDefinition = (InteractionDefinition)theEObject;
        T result = caseInteractionDefinition(interactionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.INTERACTION_ELEMENT:
      {
        InteractionElement interactionElement = (InteractionElement)theEObject;
        T result = caseInteractionElement(interactionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.WIZARD:
      {
        Wizard wizard = (Wizard)theEObject;
        T result = caseWizard(wizard);
        if (result == null) result = caseInteractionElement(wizard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ELEMENT_WIZARD:
      {
        ElementWizard elementWizard = (ElementWizard)theEObject;
        T result = caseElementWizard(elementWizard);
        if (result == null) result = caseWizard(elementWizard);
        if (result == null) result = caseInteractionElement(elementWizard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.PAGE:
      {
        Page page = (Page)theEObject;
        T result = casePage(page);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ATT_MAP:
      {
        AttMap attMap = (AttMap)theEObject;
        T result = caseAttMap(attMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.PERSONAL_WIZARD:
      {
        PersonalWizard personalWizard = (PersonalWizard)theEObject;
        T result = casePersonalWizard(personalWizard);
        if (result == null) result = caseWizard(personalWizard);
        if (result == null) result = caseInteractionElement(personalWizard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.VIEW:
      {
        View view = (View)theEObject;
        T result = caseView(view);
        if (result == null) result = caseInteractionElement(view);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.PREDEFINED_VIEW:
      {
        PredefinedView predefinedView = (PredefinedView)theEObject;
        T result = casePredefinedView(predefinedView);
        if (result == null) result = caseView(predefinedView);
        if (result == null) result = caseInteractionElement(predefinedView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.VIEW_TYPE:
      {
        ViewType viewType = (ViewType)theEObject;
        T result = caseViewType(viewType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.SHOW_CHILDS:
      {
        ShowChilds showChilds = (ShowChilds)theEObject;
        T result = caseShowChilds(showChilds);
        if (result == null) result = caseViewType(showChilds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.SHOW_SELECTION:
      {
        ShowSelection showSelection = (ShowSelection)theEObject;
        T result = caseShowSelection(showSelection);
        if (result == null) result = caseViewType(showSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.COUNT_TYPES:
      {
        CountTypes countTypes = (CountTypes)theEObject;
        T result = caseCountTypes(countTypes);
        if (result == null) result = caseViewType(countTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.VIEW_STYLE:
      {
        ViewStyle viewStyle = (ViewStyle)theEObject;
        T result = caseViewStyle(viewStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.PERSONAL_VIEW:
      {
        PersonalView personalView = (PersonalView)theEObject;
        T result = casePersonalView(personalView);
        if (result == null) result = caseView(personalView);
        if (result == null) result = caseInteractionElement(personalView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.EVENT_TYPE:
      {
        EventType eventType = (EventType)theEObject;
        T result = caseEventType(eventType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.MOUSE_EVENT:
      {
        MouseEvent mouseEvent = (MouseEvent)theEObject;
        T result = caseMouseEvent(mouseEvent);
        if (result == null) result = caseEventType(mouseEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.KEY_EVENT:
      {
        KeyEvent keyEvent = (KeyEvent)theEObject;
        T result = caseKeyEvent(keyEvent);
        if (result == null) result = caseEventType(keyEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.ELEMENT_EVENT:
      {
        ElementEvent elementEvent = (ElementEvent)theEObject;
        T result = caseElementEvent(elementEvent);
        if (result == null) result = caseEventType(elementEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.MENU_EVENT:
      {
        MenuEvent menuEvent = (MenuEvent)theEObject;
        T result = caseMenuEvent(menuEvent);
        if (result == null) result = caseEventType(menuEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.WIZARD_START:
      {
        WizardStart wizardStart = (WizardStart)theEObject;
        T result = caseWizardStart(wizardStart);
        if (result == null) result = caseInstruction(wizardStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.VIEW_DEPLOY:
      {
        ViewDeploy viewDeploy = (ViewDeploy)theEObject;
        T result = caseViewDeploy(viewDeploy);
        if (result == null) result = caseInstruction(viewDeploy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PicturePackage.CLASS_EXECUTION:
      {
        ClassExecution classExecution = (ClassExecution)theEObject;
        T result = caseClassExecution(classExecution);
        if (result == null) result = caseInstruction(classExecution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphical Representation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphical Representation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphicalRepresentation(GraphicalRepresentation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Concept Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Concept Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaConceptReference(MetaConceptReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassReference(ClassReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttReference(AttReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ROOT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ROOT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseROOT(ROOT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToolDefinition(ToolDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tool Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tool Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToolGroup(ToolGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Creation Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Creation Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreationButton(CreationButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleDefinition(StyleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleElement(StyleElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineStyle(LineStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineDecoration(LineDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Line Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Line Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultLineDecoration(DefaultLineDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Line Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Line Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomLineDecoration(CustomLineDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultLayout(DefaultLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomLayout(CustomLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Figure Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Figure Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFigureStyle(FigureStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rounded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rounded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRounded(Rounded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regular Polygon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regular Polygon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegularPolygon(RegularPolygon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEllipse(Ellipse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomFigure(CustomFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Position</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelPosition(LabelPosition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSize(Size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphical Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphical Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphicalDefinition(GraphicalDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphicalElement(GraphicalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementDef(ElementDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeDef(NodeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Link Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Link Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttLinkDef(AttLinkDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementAlt(ElementAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeAlt(NodeAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Link Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Link Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttLinkAlt(AttLinkAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Element Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Element Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeElementDef(NodeElementDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Element Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Element Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeElementAlt(NodeElementAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFigure(Figure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regular Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regular Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegularFigure(RegularFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageFigure(ImageFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexFigure(ComplexFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Link Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Link Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeLinkDef(NodeLinkDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Link Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Link Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeLinkAlt(NodeLinkAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Line Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Line Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeLineDef(NodeLineDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Line Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Line Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeLineAlt(NodeLineAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inter Node Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inter Node Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterNodeDef(InterNodeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inter Node Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inter Node Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterNodeAlt(InterNodeAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Node Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Node Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalNodeDef(ExternalNodeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Node Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Node Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalNodeAlt(ExternalNodeAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rules Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rules Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRulesDefinition(RulesDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule For Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule For Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleForType(RuleForType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule For Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule For Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleForReference(RuleForReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseType(CaseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseReference(CaseReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionDefinition(InteractionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionElement(InteractionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wizard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wizard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWizard(Wizard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Wizard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Wizard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementWizard(ElementWizard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePage(Page object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttMap(AttMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personal Wizard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personal Wizard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonalWizard(PersonalWizard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseView(View object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predefined View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predefined View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredefinedView(PredefinedView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewType(ViewType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Childs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Childs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowChilds(ShowChilds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowSelection(ShowSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCountTypes(CountTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewStyle(ViewStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personal View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personal View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonalView(PersonalView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventType(EventType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mouse Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mouse Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMouseEvent(MouseEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyEvent(KeyEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementEvent(ElementEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuEvent(MenuEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wizard Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wizard Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWizardStart(WizardStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Deploy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Deploy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewDeploy(ViewDeploy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Execution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Execution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassExecution(ClassExecution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PictureSwitch
