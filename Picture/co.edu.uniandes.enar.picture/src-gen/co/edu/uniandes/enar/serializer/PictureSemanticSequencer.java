package co.edu.uniandes.enar.serializer;

import co.edu.uniandes.enar.picture.AttMap;
import co.edu.uniandes.enar.picture.AttReference;
import co.edu.uniandes.enar.picture.Button;
import co.edu.uniandes.enar.picture.CaseReference;
import co.edu.uniandes.enar.picture.CaseType;
import co.edu.uniandes.enar.picture.ClassExecution;
import co.edu.uniandes.enar.picture.ClassReference;
import co.edu.uniandes.enar.picture.Color;
import co.edu.uniandes.enar.picture.ComplexFigure;
import co.edu.uniandes.enar.picture.CountTypes;
import co.edu.uniandes.enar.picture.CreationButton;
import co.edu.uniandes.enar.picture.CustomFigure;
import co.edu.uniandes.enar.picture.CustomLayout;
import co.edu.uniandes.enar.picture.CustomLineDecoration;
import co.edu.uniandes.enar.picture.DefaultLayout;
import co.edu.uniandes.enar.picture.DefaultLineDecoration;
import co.edu.uniandes.enar.picture.ElementEvent;
import co.edu.uniandes.enar.picture.ElementWizard;
import co.edu.uniandes.enar.picture.Ellipse;
import co.edu.uniandes.enar.picture.Event;
import co.edu.uniandes.enar.picture.ExternalNodeAlt;
import co.edu.uniandes.enar.picture.ExternalNodeDef;
import co.edu.uniandes.enar.picture.GraphicalDefinition;
import co.edu.uniandes.enar.picture.GraphicalRepresentation;
import co.edu.uniandes.enar.picture.ImageFigure;
import co.edu.uniandes.enar.picture.Import;
import co.edu.uniandes.enar.picture.InterNodeAlt;
import co.edu.uniandes.enar.picture.InterNodeDef;
import co.edu.uniandes.enar.picture.InteractionDefinition;
import co.edu.uniandes.enar.picture.KeyEvent;
import co.edu.uniandes.enar.picture.LabelPosition;
import co.edu.uniandes.enar.picture.LineStyle;
import co.edu.uniandes.enar.picture.MenuEvent;
import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.enar.picture.MouseEvent;
import co.edu.uniandes.enar.picture.NodeElementAlt;
import co.edu.uniandes.enar.picture.NodeElementDef;
import co.edu.uniandes.enar.picture.NodeLineAlt;
import co.edu.uniandes.enar.picture.NodeLineDef;
import co.edu.uniandes.enar.picture.NodeLinkAlt;
import co.edu.uniandes.enar.picture.NodeLinkDef;
import co.edu.uniandes.enar.picture.Page;
import co.edu.uniandes.enar.picture.PersonalView;
import co.edu.uniandes.enar.picture.PersonalWizard;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.Point;
import co.edu.uniandes.enar.picture.PredefinedView;
import co.edu.uniandes.enar.picture.ROOT;
import co.edu.uniandes.enar.picture.RegularFigure;
import co.edu.uniandes.enar.picture.RegularPolygon;
import co.edu.uniandes.enar.picture.Rounded;
import co.edu.uniandes.enar.picture.RuleForReference;
import co.edu.uniandes.enar.picture.RuleForType;
import co.edu.uniandes.enar.picture.RulesDefinition;
import co.edu.uniandes.enar.picture.ShowChilds;
import co.edu.uniandes.enar.picture.ShowSelection;
import co.edu.uniandes.enar.picture.Size;
import co.edu.uniandes.enar.picture.Statement;
import co.edu.uniandes.enar.picture.StyleDefinition;
import co.edu.uniandes.enar.picture.ToolDefinition;
import co.edu.uniandes.enar.picture.ToolGroup;
import co.edu.uniandes.enar.picture.ViewDeploy;
import co.edu.uniandes.enar.picture.ViewStyle;
import co.edu.uniandes.enar.picture.WizardStart;
import co.edu.uniandes.enar.services.PictureGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PictureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PictureGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PicturePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PicturePackage.ATT_MAP:
				if(context == grammarAccess.getAttMapRule()) {
					sequence_AttMap(context, (AttMap) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.ATT_REFERENCE:
				if(context == grammarAccess.getAttReferenceRule() ||
				   context == grammarAccess.getMetaConceptReferenceRule()) {
					sequence_AttReference(context, (AttReference) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.BUTTON:
				if(context == grammarAccess.getButtonRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CASE_REFERENCE:
				if(context == grammarAccess.getCaseReferenceRule()) {
					sequence_CaseReference(context, (CaseReference) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CASE_TYPE:
				if(context == grammarAccess.getCaseTypeRule()) {
					sequence_CaseType(context, (CaseType) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CLASS_EXECUTION:
				if(context == grammarAccess.getClassExecutionRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ClassExecution(context, (ClassExecution) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CLASS_REFERENCE:
				if(context == grammarAccess.getClassReferenceRule() ||
				   context == grammarAccess.getMetaConceptReferenceRule()) {
					sequence_ClassReference(context, (ClassReference) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.COLOR:
				if(context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_Color(context, (Color) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.COMPLEX_FIGURE:
				if(context == grammarAccess.getComplexFigureRule() ||
				   context == grammarAccess.getFigureRule()) {
					sequence_ComplexFigure(context, (ComplexFigure) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.COUNT_TYPES:
				if(context == grammarAccess.getCountTypesRule() ||
				   context == grammarAccess.getViewTypeRule()) {
					sequence_CountTypes(context, (CountTypes) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CREATION_BUTTON:
				if(context == grammarAccess.getCreationButtonRule()) {
					sequence_CreationButton(context, (CreationButton) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CUSTOM_FIGURE:
				if(context == grammarAccess.getCustomFigureRule() ||
				   context == grammarAccess.getFigureStyleRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_CustomFigure(context, (CustomFigure) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CUSTOM_LAYOUT:
				if(context == grammarAccess.getCustomLayoutRule() ||
				   context == grammarAccess.getLayoutRule()) {
					sequence_CustomLayout(context, (CustomLayout) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.CUSTOM_LINE_DECORATION:
				if(context == grammarAccess.getCustomLineDecorationRule() ||
				   context == grammarAccess.getLineDecorationRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_CustomLineDecoration(context, (CustomLineDecoration) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.DEFAULT_LAYOUT:
				if(context == grammarAccess.getDefaultLayoutRule() ||
				   context == grammarAccess.getLayoutRule()) {
					sequence_DefaultLayout(context, (DefaultLayout) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.DEFAULT_LINE_DECORATION:
				if(context == grammarAccess.getDefaultLineDecorationRule() ||
				   context == grammarAccess.getLineDecorationRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_DefaultLineDecoration(context, (DefaultLineDecoration) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.ELEMENT_EVENT:
				if(context == grammarAccess.getElementEventRule() ||
				   context == grammarAccess.getEventTypeRule()) {
					sequence_ElementEvent(context, (ElementEvent) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.ELEMENT_WIZARD:
				if(context == grammarAccess.getElementWizardRule() ||
				   context == grammarAccess.getInteractionElementRule() ||
				   context == grammarAccess.getWizardRule()) {
					sequence_ElementWizard(context, (ElementWizard) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.ELLIPSE:
				if(context == grammarAccess.getEllipseRule() ||
				   context == grammarAccess.getFigureStyleRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_Ellipse(context, (Ellipse) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.EXTERNAL_NODE_ALT:
				if(context == grammarAccess.getAttLinkAltRule() ||
				   context == grammarAccess.getElementAltRule() ||
				   context == grammarAccess.getExternalNodeAltRule() ||
				   context == grammarAccess.getGraphicalElementRule()) {
					sequence_ExternalNodeAlt(context, (ExternalNodeAlt) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.EXTERNAL_NODE_DEF:
				if(context == grammarAccess.getAttLinkDefRule() ||
				   context == grammarAccess.getElementDefRule() ||
				   context == grammarAccess.getExternalNodeDefRule() ||
				   context == grammarAccess.getGraphicalElementRule()) {
					sequence_ExternalNodeDef(context, (ExternalNodeDef) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.GRAPHICAL_DEFINITION:
				if(context == grammarAccess.getGraphicalDefinitionRule()) {
					sequence_GraphicalDefinition(context, (GraphicalDefinition) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.GRAPHICAL_REPRESENTATION:
				if(context == grammarAccess.getGraphicalRepresentationRule()) {
					sequence_GraphicalRepresentation(context, (GraphicalRepresentation) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.IMAGE_FIGURE:
				if(context == grammarAccess.getFigureRule() ||
				   context == grammarAccess.getImageFigureRule()) {
					sequence_ImageFigure(context, (ImageFigure) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.INTER_NODE_ALT:
				if(context == grammarAccess.getAttLinkAltRule() ||
				   context == grammarAccess.getElementAltRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getInterNodeAltRule()) {
					sequence_InterNodeAlt(context, (InterNodeAlt) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.INTER_NODE_DEF:
				if(context == grammarAccess.getAttLinkDefRule() ||
				   context == grammarAccess.getElementDefRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getInterNodeDefRule()) {
					sequence_InterNodeDef(context, (InterNodeDef) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.INTERACTION_DEFINITION:
				if(context == grammarAccess.getInteractionDefinitionRule()) {
					sequence_InteractionDefinition(context, (InteractionDefinition) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.KEY_EVENT:
				if(context == grammarAccess.getEventTypeRule() ||
				   context == grammarAccess.getKeyEventRule()) {
					sequence_KeyEvent(context, (KeyEvent) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.LABEL_POSITION:
				if(context == grammarAccess.getLabelPositionRule()) {
					sequence_LabelPosition(context, (LabelPosition) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.LINE_STYLE:
				if(context == grammarAccess.getLineStyleRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_LineStyle(context, (LineStyle) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.MENU_EVENT:
				if(context == grammarAccess.getEventTypeRule() ||
				   context == grammarAccess.getMenuEventRule()) {
					sequence_MenuEvent(context, (MenuEvent) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.MOUSE_EVENT:
				if(context == grammarAccess.getEventTypeRule() ||
				   context == grammarAccess.getMouseEventRule()) {
					sequence_MouseEvent(context, (MouseEvent) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.NODE_ELEMENT_ALT:
				if(context == grammarAccess.getElementAltRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getNodeAltRule() ||
				   context == grammarAccess.getNodeElementAltRule()) {
					sequence_NodeElementAlt(context, (NodeElementAlt) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.NODE_ELEMENT_DEF:
				if(context == grammarAccess.getElementDefRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getNodeDefRule() ||
				   context == grammarAccess.getNodeElementDefRule()) {
					sequence_NodeElementDef(context, (NodeElementDef) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.NODE_LINE_ALT:
				if(context == grammarAccess.getAttLinkAltRule() ||
				   context == grammarAccess.getElementAltRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getNodeLineAltRule()) {
					sequence_NodeLineAlt(context, (NodeLineAlt) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.NODE_LINE_DEF:
				if(context == grammarAccess.getAttLinkDefRule() ||
				   context == grammarAccess.getElementDefRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getNodeLineDefRule()) {
					sequence_NodeLineDef(context, (NodeLineDef) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.NODE_LINK_ALT:
				if(context == grammarAccess.getElementAltRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getNodeAltRule() ||
				   context == grammarAccess.getNodeLinkAltRule()) {
					sequence_NodeLinkAlt(context, (NodeLinkAlt) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.NODE_LINK_DEF:
				if(context == grammarAccess.getElementDefRule() ||
				   context == grammarAccess.getGraphicalElementRule() ||
				   context == grammarAccess.getNodeDefRule() ||
				   context == grammarAccess.getNodeLinkDefRule()) {
					sequence_NodeLinkDef(context, (NodeLinkDef) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.PERSONAL_VIEW:
				if(context == grammarAccess.getInteractionElementRule() ||
				   context == grammarAccess.getPersonalViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_PersonalView(context, (PersonalView) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.PERSONAL_WIZARD:
				if(context == grammarAccess.getInteractionElementRule() ||
				   context == grammarAccess.getPersonalWizardRule() ||
				   context == grammarAccess.getWizardRule()) {
					sequence_PersonalWizard(context, (PersonalWizard) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.PREDEFINED_VIEW:
				if(context == grammarAccess.getInteractionElementRule() ||
				   context == grammarAccess.getPredefinedViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_PredefinedView(context, (PredefinedView) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.ROOT:
				if(context == grammarAccess.getROOTRule()) {
					sequence_ROOT(context, (ROOT) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.REGULAR_FIGURE:
				if(context == grammarAccess.getFigureRule() ||
				   context == grammarAccess.getRegularFigureRule()) {
					sequence_RegularFigure(context, (RegularFigure) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.REGULAR_POLYGON:
				if(context == grammarAccess.getFigureStyleRule() ||
				   context == grammarAccess.getRegularPolygonRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_RegularPolygon(context, (RegularPolygon) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.ROUNDED:
				if(context == grammarAccess.getFigureStyleRule() ||
				   context == grammarAccess.getRoundedRule() ||
				   context == grammarAccess.getStyleElementRule()) {
					sequence_Rounded(context, (Rounded) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.RULE_FOR_REFERENCE:
				if(context == grammarAccess.getRuleRule() ||
				   context == grammarAccess.getRuleForReferenceRule()) {
					sequence_RuleForReference(context, (RuleForReference) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.RULE_FOR_TYPE:
				if(context == grammarAccess.getRuleRule() ||
				   context == grammarAccess.getRuleForTypeRule()) {
					sequence_RuleForType(context, (RuleForType) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.RULES_DEFINITION:
				if(context == grammarAccess.getRulesDefinitionRule()) {
					sequence_RulesDefinition(context, (RulesDefinition) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.SHOW_CHILDS:
				if(context == grammarAccess.getShowChildsRule() ||
				   context == grammarAccess.getViewTypeRule()) {
					sequence_ShowChilds(context, (ShowChilds) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.SHOW_SELECTION:
				if(context == grammarAccess.getShowSelectionRule() ||
				   context == grammarAccess.getViewTypeRule()) {
					sequence_ShowSelection(context, (ShowSelection) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.SIZE:
				if(context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.STYLE_DEFINITION:
				if(context == grammarAccess.getStyleDefinitionRule()) {
					sequence_StyleDefinition(context, (StyleDefinition) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.TOOL_DEFINITION:
				if(context == grammarAccess.getToolDefinitionRule()) {
					sequence_ToolDefinition(context, (ToolDefinition) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.TOOL_GROUP:
				if(context == grammarAccess.getToolGroupRule()) {
					sequence_ToolGroup(context, (ToolGroup) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.VIEW_DEPLOY:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getViewDeployRule()) {
					sequence_ViewDeploy(context, (ViewDeploy) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.VIEW_STYLE:
				if(context == grammarAccess.getViewStyleRule()) {
					sequence_ViewStyle(context, (ViewStyle) semanticObject); 
					return; 
				}
				else break;
			case PicturePackage.WIZARD_START:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getWizardStartRule()) {
					sequence_WizardStart(context, (WizardStart) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attribute=STRING label=STRING component=ComponentType defaultValue=STRING)
	 */
	protected void sequence_AttMap(EObject context, AttMap semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ATT_MAP__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ATT_MAP__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ATT_MAP__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ATT_MAP__LABEL));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ATT_MAP__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ATT_MAP__COMPONENT));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ATT_MAP__DEFAULT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ATT_MAP__DEFAULT_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttMapAccess().getAttributeSTRINGTerminalRuleCall_2_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getAttMapAccess().getLabelSTRINGTerminalRuleCall_4_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getAttMapAccess().getComponentComponentTypeEnumRuleCall_6_0(), semanticObject.getComponent());
		feeder.accept(grammarAccess.getAttMapAccess().getDefaultValueSTRINGTerminalRuleCall_8_0(), semanticObject.getDefaultValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     class=QualifiedName
	 */
	protected void sequence_AttReference(EObject context, AttReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.META_CONCEPT_REFERENCE__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.META_CONCEPT_REFERENCE__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttReferenceAccess().getClassQualifiedNameParserRuleCall_1_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=STRING methodAction=STRING)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.BUTTON__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.BUTTON__LABEL));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.BUTTON__METHOD_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.BUTTON__METHOD_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonAccess().getLabelSTRINGTerminalRuleCall_3_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getButtonAccess().getMethodActionSTRINGTerminalRuleCall_5_0(), semanticObject.getMethodAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=STRING referenceElement=[AttLinkAlt|ID]?)
	 */
	protected void sequence_CaseReference(EObject context, CaseReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=STRING nodeElement=[NodeAlt|ID]?)
	 */
	protected void sequence_CaseType(EObject context, CaseType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     inplementationReference=STRING
	 */
	protected void sequence_ClassExecution(EObject context, ClassExecution semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CLASS_EXECUTION__INPLEMENTATION_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CLASS_EXECUTION__INPLEMENTATION_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassExecutionAccess().getInplementationReferenceSTRINGTerminalRuleCall_1_0(), semanticObject.getInplementationReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     class=QualifiedName
	 */
	protected void sequence_ClassReference(EObject context, ClassReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.META_CONCEPT_REFERENCE__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.META_CONCEPT_REFERENCE__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassReferenceAccess().getClassQualifiedNameParserRuleCall_1_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID red=INT green=INT blue=INT)
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.COLOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.COLOR__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.COLOR__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.COLOR__RED));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.COLOR__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.COLOR__GREEN));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.COLOR__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.COLOR__BLUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColorAccess().getRedINTTerminalRuleCall_3_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getColorAccess().getGreenINTTerminalRuleCall_5_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getColorAccess().getBlueINTTerminalRuleCall_7_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     implementationReference=STRING
	 */
	protected void sequence_ComplexFigure(EObject context, ComplexFigure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComplexFigureAccess().getImplementationReferenceSTRINGTerminalRuleCall_4_0(), semanticObject.getImplementationReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     classReference=ClassReference
	 */
	protected void sequence_CountTypes(EObject context, CountTypes semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.VIEW_TYPE__CLASS_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.VIEW_TYPE__CLASS_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCountTypesAccess().getClassReferenceClassReferenceParserRuleCall_5_0(), semanticObject.getClassReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metaConceptReference=ClassReference name=STRING description=STRING icon=STRING)
	 */
	protected void sequence_CreationButton(EObject context, CreationButton semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CREATION_BUTTON__META_CONCEPT_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CREATION_BUTTON__META_CONCEPT_REFERENCE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CREATION_BUTTON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CREATION_BUTTON__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CREATION_BUTTON__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CREATION_BUTTON__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CREATION_BUTTON__ICON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CREATION_BUTTON__ICON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCreationButtonAccess().getMetaConceptReferenceClassReferenceParserRuleCall_2_0(), semanticObject.getMetaConceptReference());
		feeder.accept(grammarAccess.getCreationButtonAccess().getNameSTRINGTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCreationButtonAccess().getDescriptionSTRINGTerminalRuleCall_7_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getCreationButtonAccess().getIconSTRINGTerminalRuleCall_9_0(), semanticObject.getIcon());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID points+=Point)
	 */
	protected void sequence_CustomFigure(EObject context, CustomFigure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     referenceImplementation=STRING
	 */
	protected void sequence_CustomLayout(EObject context, CustomLayout semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CUSTOM_LAYOUT__REFERENCE_IMPLEMENTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CUSTOM_LAYOUT__REFERENCE_IMPLEMENTATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCustomLayoutAccess().getReferenceImplementationSTRINGTerminalRuleCall_4_0(), semanticObject.getReferenceImplementation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID referenceImplementation=STRING)
	 */
	protected void sequence_CustomLineDecoration(EObject context, CustomLineDecoration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CUSTOM_LINE_DECORATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CUSTOM_LINE_DECORATION__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCustomLineDecorationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomLineDecorationAccess().getReferenceImplementationSTRINGTerminalRuleCall_4_0(), semanticObject.getReferenceImplementation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (list='list' | default='default')
	 */
	protected void sequence_DefaultLayout(EObject context, DefaultLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         none='none' | 
	 *         arrow='arrow' | 
	 *         rhomb='rhomb' | 
	 *         filledrhomb='filled' | 
	 *         square='square' | 
	 *         filledsquare='filled' | 
	 *         closedarrow='closed' | 
	 *         filledclosedarrow='filled'
	 *     )
	 */
	protected void sequence_DefaultLineDecoration(EObject context, DefaultLineDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (create='create' | delete='delete')
	 */
	protected void sequence_ElementEvent(EObject context, ElementEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         classReference=ClassReference 
	 *         title=STRING 
	 *         description=STRING 
	 *         type=WizardType 
	 *         pages+=Page* 
	 *         defaultButtons=EBoolean
	 *     )
	 */
	protected void sequence_ElementWizard(EObject context, ElementWizard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID radiox=INT radioy=INT)
	 */
	protected void sequence_Ellipse(EObject context, Ellipse semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.FIGURE_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.FIGURE_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ELLIPSE__RADIOX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ELLIPSE__RADIOX));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ELLIPSE__RADIOY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ELLIPSE__RADIOY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEllipseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEllipseAccess().getRadioxINTTerminalRuleCall_5_0(), semanticObject.getRadiox());
		feeder.accept(grammarAccess.getEllipseAccess().getRadioyINTTerminalRuleCall_7_0(), semanticObject.getRadioy());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (eventType=EventType instructions+=Instruction*)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[ExternalNodeDef|ID] size=Size)
	 */
	protected void sequence_ExternalNodeAlt(EObject context, ExternalNodeAlt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.EXTERNAL_NODE_ALT__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.EXTERNAL_NODE_ALT__PARENT));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.EXTERNAL_NODE_ALT__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.EXTERNAL_NODE_ALT__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalNodeAltAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExternalNodeAltAccess().getParentExternalNodeDefIDTerminalRuleCall_3_0_1(), semanticObject.getParent());
		feeder.accept(grammarAccess.getExternalNodeAltAccess().getSizeSizeParserRuleCall_6_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID referenceName=AttReference size=Size)
	 */
	protected void sequence_ExternalNodeDef(EObject context, ExternalNodeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ATT_LINK_DEF__REFERENCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ATT_LINK_DEF__REFERENCE_NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.EXTERNAL_NODE_DEF__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.EXTERNAL_NODE_DEF__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalNodeDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExternalNodeDefAccess().getReferenceNameAttReferenceParserRuleCall_3_0(), semanticObject.getReferenceName());
		feeder.accept(grammarAccess.getExternalNodeDefAccess().getSizeSizeParserRuleCall_6_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=GraphicalElement+
	 */
	protected void sequence_GraphicalDefinition(EObject context, GraphicalDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         referencePackage=QualifiedName? 
	 *         root=ROOT 
	 *         toolsDefinition=ToolDefinition 
	 *         styleDefinition=StyleDefinition 
	 *         graphicalDefinition=GraphicalDefinition 
	 *         rulesDefinition=RulesDefinition 
	 *         interactionDefinition=InteractionDefinition
	 *     )
	 */
	protected void sequence_GraphicalRepresentation(EObject context, GraphicalRepresentation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     path=STRING
	 */
	protected void sequence_ImageFigure(EObject context, ImageFigure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.IMAGE_FIGURE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.IMAGE_FIGURE__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageFigureAccess().getPathSTRINGTerminalRuleCall_4_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importedNamespace=STRING name=ID)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.IMPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.IMPORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceSTRINGTerminalRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.accept(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[InterNodeDef|ID] layout=Layout)
	 */
	protected void sequence_InterNodeAlt(EObject context, InterNodeAlt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.INTER_NODE_ALT__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.INTER_NODE_ALT__PARENT));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.INTER_NODE_ALT__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.INTER_NODE_ALT__LAYOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterNodeAltAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInterNodeAltAccess().getParentInterNodeDefIDTerminalRuleCall_3_0_1(), semanticObject.getParent());
		feeder.accept(grammarAccess.getInterNodeAltAccess().getLayoutLayoutParserRuleCall_6_0(), semanticObject.getLayout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID referenceName=AttReference layout=Layout)
	 */
	protected void sequence_InterNodeDef(EObject context, InterNodeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ATT_LINK_DEF__REFERENCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ATT_LINK_DEF__REFERENCE_NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.INTER_NODE_DEF__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.INTER_NODE_DEF__LAYOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterNodeDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInterNodeDefAccess().getReferenceNameAttReferenceParserRuleCall_3_0(), semanticObject.getReferenceName());
		feeder.accept(grammarAccess.getInterNodeDefAccess().getLayoutLayoutParserRuleCall_6_0(), semanticObject.getLayout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (interactionElements+=InteractionElement* statements+=Statement*)
	 */
	protected void sequence_InteractionDefinition(EObject context, InteractionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyPress='key' | keyUp='key' | keyDown='key')
	 */
	protected void sequence_KeyEvent(EObject context, KeyEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (internal='internal' | external='external')
	 */
	protected void sequence_LabelPosition(EObject context, LabelPosition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID width=INT lineType=LineType color=[Color|ID])
	 */
	protected void sequence_LineStyle(EObject context, LineStyle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.LINE_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.LINE_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.LINE_STYLE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.LINE_STYLE__WIDTH));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.LINE_STYLE__LINE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.LINE_STYLE__LINE_TYPE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.LINE_STYLE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.LINE_STYLE__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLineStyleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLineStyleAccess().getWidthINTTerminalRuleCall_4_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getLineStyleAccess().getLineTypeLineTypeEnumRuleCall_6_0(), semanticObject.getLineType());
		feeder.accept(grammarAccess.getLineStyleAccess().getColorColorIDTerminalRuleCall_8_0_1(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_MenuEvent(EObject context, MenuEvent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.MENU_EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.MENU_EVENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMenuEventAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import graphicalREpresentation=GraphicalRepresentation)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         mouseDown='mouse' | 
	 *         mouseEnter='mouse' | 
	 *         mouseHorizontalWheel='mouse' | 
	 *         mouseUp='mouse' | 
	 *         mouseWheel='mouse' | 
	 *         mouseVerticalWheel='mouse' | 
	 *         mouseHover='mouse' | 
	 *         mouseExit='mouse' | 
	 *         mouseDoubleClick='mouse'
	 *     )
	 */
	protected void sequence_MouseEvent(EObject context, MouseEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[NodeElementDef|ID] labelPlacement=LabelPosition? figure=Figure? size=Size?)
	 */
	protected void sequence_NodeElementAlt(EObject context, NodeElementAlt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         referenceClass=ClassReference 
	 *         label=ID 
	 *         labelIcon=EBoolean 
	 *         labelPlacement=LabelPosition 
	 *         size=Size 
	 *         figure=Figure 
	 *         phantomN=EBoolean
	 *     )
	 */
	protected void sequence_NodeElementDef(EObject context, NodeElementDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_DEF__REFERENCE_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_DEF__REFERENCE_CLASS));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_DEF__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_DEF__LABEL));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__LABEL_ICON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__LABEL_ICON));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__LABEL_PLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__LABEL_PLACEMENT));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__SIZE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__FIGURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__FIGURE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__PHANTOM_N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_ELEMENT_DEF__PHANTOM_N));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeElementDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNodeElementDefAccess().getReferenceClassClassReferenceParserRuleCall_3_0(), semanticObject.getReferenceClass());
		feeder.accept(grammarAccess.getNodeElementDefAccess().getLabelIDTerminalRuleCall_6_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getNodeElementDefAccess().getLabelIconEBooleanParserRuleCall_9_0(), semanticObject.isLabelIcon());
		feeder.accept(grammarAccess.getNodeElementDefAccess().getLabelPlacementLabelPositionParserRuleCall_12_0(), semanticObject.getLabelPlacement());
		feeder.accept(grammarAccess.getNodeElementDefAccess().getSizeSizeParserRuleCall_14_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getNodeElementDefAccess().getFigureFigureParserRuleCall_15_0(), semanticObject.getFigure());
		feeder.accept(grammarAccess.getNodeElementDefAccess().getPhantomNEBooleanParserRuleCall_17_0(), semanticObject.isPhantomN());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[NodeLineDef|ID] style=[LineStyle|ID]? sourceDecoration=LineDecoration? targetDecoration=LineDecoration?)
	 */
	protected void sequence_NodeLineAlt(EObject context, NodeLineAlt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         referenceName=AttReference 
	 *         label=STRING 
	 *         style=[LineStyle|ID] 
	 *         sourceDecoration=LineDecoration 
	 *         targetDecoration=LineDecoration
	 *     )
	 */
	protected void sequence_NodeLineDef(EObject context, NodeLineDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ATT_LINK_DEF__REFERENCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ATT_LINK_DEF__REFERENCE_NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__LABEL));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__STYLE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__SOURCE_DECORATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__SOURCE_DECORATION));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__TARGET_DECORATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINE_DEF__TARGET_DECORATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeLineDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNodeLineDefAccess().getReferenceNameAttReferenceParserRuleCall_3_0(), semanticObject.getReferenceName());
		feeder.accept(grammarAccess.getNodeLineDefAccess().getLabelSTRINGTerminalRuleCall_6_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getNodeLineDefAccess().getStyleLineStyleIDTerminalRuleCall_8_0_1(), semanticObject.getStyle());
		feeder.accept(grammarAccess.getNodeLineDefAccess().getSourceDecorationLineDecorationParserRuleCall_11_0(), semanticObject.getSourceDecoration());
		feeder.accept(grammarAccess.getNodeLineDefAccess().getTargetDecorationLineDecorationParserRuleCall_14_0(), semanticObject.getTargetDecoration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[NodeLinkDef|ID] style=LineStyle? sourceDecoration=LineDecoration? targetDecoration=LineDecoration?)
	 */
	protected void sequence_NodeLinkAlt(EObject context, NodeLinkAlt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         referenceClass=ClassReference 
	 *         label=ID 
	 *         style=LineStyle 
	 *         sourceDecoration=LineDecoration 
	 *         targetDecoration=LineDecoration 
	 *         sourceReference=ID 
	 *         targetReference=ID
	 *     )
	 */
	protected void sequence_NodeLinkDef(EObject context, NodeLinkDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.GRAPHICAL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_DEF__REFERENCE_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_DEF__REFERENCE_CLASS));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_DEF__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_DEF__LABEL));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__STYLE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__SOURCE_DECORATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__SOURCE_DECORATION));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__TARGET_DECORATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__TARGET_DECORATION));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__SOURCE_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__SOURCE_REFERENCE));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__TARGET_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.NODE_LINK_DEF__TARGET_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getReferenceClassClassReferenceParserRuleCall_3_0(), semanticObject.getReferenceClass());
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getLabelIDTerminalRuleCall_6_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getStyleLineStyleParserRuleCall_8_0(), semanticObject.getStyle());
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getSourceDecorationLineDecorationParserRuleCall_11_0(), semanticObject.getSourceDecoration());
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getTargetDecorationLineDecorationParserRuleCall_14_0(), semanticObject.getTargetDecoration());
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getSourceReferenceIDTerminalRuleCall_18_0(), semanticObject.getSourceReference());
		feeder.accept(grammarAccess.getNodeLinkDefAccess().getTargetReferenceIDTerminalRuleCall_22_0(), semanticObject.getTargetReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING description=STRING attributes+=AttMap* references+=ID* buttons+=Button*)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID referenceImplementation=STRING)
	 */
	protected void sequence_PersonalView(EObject context, PersonalView semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.INTERACTION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.INTERACTION_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.VIEW__REFERENCE_IMPLEMENTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.VIEW__REFERENCE_IMPLEMENTATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPersonalViewAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPersonalViewAccess().getReferenceImplementationSTRINGTerminalRuleCall_4_0(), semanticObject.getReferenceImplementation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID referenceImplementation=STRING)
	 */
	protected void sequence_PersonalWizard(EObject context, PersonalWizard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.INTERACTION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.INTERACTION_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.PERSONAL_WIZARD__REFERENCE_IMPLEMENTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.PERSONAL_WIZARD__REFERENCE_IMPLEMENTATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPersonalWizardAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPersonalWizardAccess().getReferenceImplementationSTRINGTerminalRuleCall_5_0(), semanticObject.getReferenceImplementation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.POINT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.POINT__X));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.POINT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.POINT__Y));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointAccess().getXINTTerminalRuleCall_3_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointAccess().getYINTTerminalRuleCall_5_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=STRING 
	 *         description=STRING 
	 *         type=ViewType 
	 *         style=ViewStyle 
	 *         referenceImplementation=STRING?
	 *     )
	 */
	protected void sequence_PredefinedView(EObject context, PredefinedView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ROOT(EObject context, ROOT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ROOT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ROOT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getROOTAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (figureStyle=[FigureStyle|ID] bacgroundColor=[Color|ID] border=[LineStyle|ID] (path=STRING size=Size position=Point)?)
	 */
	protected void sequence_RegularFigure(EObject context, RegularFigure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID vertexCant=INT startAngle=INT)
	 */
	protected void sequence_RegularPolygon(EObject context, RegularPolygon semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.FIGURE_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.FIGURE_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.REGULAR_POLYGON__VERTEX_CANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.REGULAR_POLYGON__VERTEX_CANT));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.REGULAR_POLYGON__START_ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.REGULAR_POLYGON__START_ANGLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegularPolygonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRegularPolygonAccess().getVertexCantINTTerminalRuleCall_4_0(), semanticObject.getVertexCant());
		feeder.accept(grammarAccess.getRegularPolygonAccess().getStartAngleINTTerminalRuleCall_6_0(), semanticObject.getStartAngle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rx=INT ry=INT)
	 */
	protected void sequence_Rounded(EObject context, Rounded semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.FIGURE_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.FIGURE_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ROUNDED__RX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ROUNDED__RX));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.ROUNDED__RY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.ROUNDED__RY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoundedAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoundedAccess().getRxINTTerminalRuleCall_4_0(), semanticObject.getRx());
		feeder.accept(grammarAccess.getRoundedAccess().getRyINTTerminalRuleCall_6_0(), semanticObject.getRy());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=AttReference cases+=CaseReference*)
	 */
	protected void sequence_RuleForReference(EObject context, RuleForReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classReference=ClassReference cases+=CaseType*)
	 */
	protected void sequence_RuleForType(EObject context, RuleForType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ruless+=Rule*)
	 */
	protected void sequence_RulesDefinition(EObject context, RulesDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     classReference=ClassReference
	 */
	protected void sequence_ShowChilds(EObject context, ShowChilds semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.VIEW_TYPE__CLASS_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.VIEW_TYPE__CLASS_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShowChildsAccess().getClassReferenceClassReferenceParserRuleCall_5_0(), semanticObject.getClassReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classReference=ClassReference?)
	 */
	protected void sequence_ShowSelection(EObject context, ShowSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.SIZE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.SIZE__WIDTH));
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.SIZE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.SIZE__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_2_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_4_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classReference=ID events+=Event*)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (styleElements+=StyleElement*)
	 */
	protected void sequence_StyleDefinition(EObject context, StyleDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[ROOT|ID] toolGroups+=ToolGroup+)
	 */
	protected void sequence_ToolDefinition(EObject context, ToolDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING toolGroups+=ToolGroup* buttons+=CreationButton*)
	 */
	protected void sequence_ToolGroup(EObject context, ToolGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     view=[View|ID]
	 */
	protected void sequence_ViewDeploy(EObject context, ViewDeploy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.VIEW_DEPLOY__VIEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.VIEW_DEPLOY__VIEW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getViewDeployAccess().getViewViewIDTerminalRuleCall_2_0_1(), semanticObject.getView());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tree='tree' | selection='selection' | (table='table' resultGraphic='graphic'))
	 */
	protected void sequence_ViewStyle(EObject context, ViewStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wizard=[Wizard|ID]
	 */
	protected void sequence_WizardStart(EObject context, WizardStart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PicturePackage.Literals.WIZARD_START__WIZARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PicturePackage.Literals.WIZARD_START__WIZARD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWizardStartAccess().getWizardWizardIDTerminalRuleCall_2_0_1(), semanticObject.getWizard());
		feeder.finish();
	}
}
