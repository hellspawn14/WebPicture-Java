/**
 */
package co.edu.uniandes.enar.picture.impl;

import co.edu.uniandes.enar.picture.AttLinkAlt;
import co.edu.uniandes.enar.picture.AttLinkDef;
import co.edu.uniandes.enar.picture.AttMap;
import co.edu.uniandes.enar.picture.AttReference;
import co.edu.uniandes.enar.picture.Button;
import co.edu.uniandes.enar.picture.CaseReference;
import co.edu.uniandes.enar.picture.CaseType;
import co.edu.uniandes.enar.picture.ClassExecution;
import co.edu.uniandes.enar.picture.ClassReference;
import co.edu.uniandes.enar.picture.Color;
import co.edu.uniandes.enar.picture.ComplexFigure;
import co.edu.uniandes.enar.picture.ComponentType;
import co.edu.uniandes.enar.picture.CountTypes;
import co.edu.uniandes.enar.picture.CreationButton;
import co.edu.uniandes.enar.picture.CustomFigure;
import co.edu.uniandes.enar.picture.CustomLayout;
import co.edu.uniandes.enar.picture.CustomLineDecoration;
import co.edu.uniandes.enar.picture.DefaultLayout;
import co.edu.uniandes.enar.picture.DefaultLineDecoration;
import co.edu.uniandes.enar.picture.ElementAlt;
import co.edu.uniandes.enar.picture.ElementDef;
import co.edu.uniandes.enar.picture.ElementEvent;
import co.edu.uniandes.enar.picture.ElementWizard;
import co.edu.uniandes.enar.picture.Ellipse;
import co.edu.uniandes.enar.picture.Event;
import co.edu.uniandes.enar.picture.EventType;
import co.edu.uniandes.enar.picture.ExternalNodeAlt;
import co.edu.uniandes.enar.picture.ExternalNodeDef;
import co.edu.uniandes.enar.picture.Figure;
import co.edu.uniandes.enar.picture.FigureStyle;
import co.edu.uniandes.enar.picture.GraphicalDefinition;
import co.edu.uniandes.enar.picture.GraphicalElement;
import co.edu.uniandes.enar.picture.GraphicalRepresentation;
import co.edu.uniandes.enar.picture.ImageFigure;
import co.edu.uniandes.enar.picture.Import;
import co.edu.uniandes.enar.picture.Instruction;
import co.edu.uniandes.enar.picture.InterNodeAlt;
import co.edu.uniandes.enar.picture.InterNodeDef;
import co.edu.uniandes.enar.picture.InteractionDefinition;
import co.edu.uniandes.enar.picture.InteractionElement;
import co.edu.uniandes.enar.picture.KeyEvent;
import co.edu.uniandes.enar.picture.LabelPosition;
import co.edu.uniandes.enar.picture.Layout;
import co.edu.uniandes.enar.picture.LineDecoration;
import co.edu.uniandes.enar.picture.LineStyle;
import co.edu.uniandes.enar.picture.LineType;
import co.edu.uniandes.enar.picture.MenuEvent;
import co.edu.uniandes.enar.picture.MetaConceptReference;
import co.edu.uniandes.enar.picture.Model;
import co.edu.uniandes.enar.picture.MouseEvent;
import co.edu.uniandes.enar.picture.NodeAlt;
import co.edu.uniandes.enar.picture.NodeDef;
import co.edu.uniandes.enar.picture.NodeElementAlt;
import co.edu.uniandes.enar.picture.NodeElementDef;
import co.edu.uniandes.enar.picture.NodeLineAlt;
import co.edu.uniandes.enar.picture.NodeLineDef;
import co.edu.uniandes.enar.picture.NodeLinkAlt;
import co.edu.uniandes.enar.picture.NodeLinkDef;
import co.edu.uniandes.enar.picture.Page;
import co.edu.uniandes.enar.picture.PersonalView;
import co.edu.uniandes.enar.picture.PersonalWizard;
import co.edu.uniandes.enar.picture.PictureFactory;
import co.edu.uniandes.enar.picture.PicturePackage;
import co.edu.uniandes.enar.picture.Point;
import co.edu.uniandes.enar.picture.PredefinedView;
import co.edu.uniandes.enar.picture.RegularFigure;
import co.edu.uniandes.enar.picture.RegularPolygon;
import co.edu.uniandes.enar.picture.Rounded;
import co.edu.uniandes.enar.picture.Rule;
import co.edu.uniandes.enar.picture.RuleForReference;
import co.edu.uniandes.enar.picture.RuleForType;
import co.edu.uniandes.enar.picture.RulesDefinition;
import co.edu.uniandes.enar.picture.ShowChilds;
import co.edu.uniandes.enar.picture.ShowSelection;
import co.edu.uniandes.enar.picture.Size;
import co.edu.uniandes.enar.picture.Statement;
import co.edu.uniandes.enar.picture.StyleDefinition;
import co.edu.uniandes.enar.picture.StyleElement;
import co.edu.uniandes.enar.picture.ToolDefinition;
import co.edu.uniandes.enar.picture.ToolGroup;
import co.edu.uniandes.enar.picture.View;
import co.edu.uniandes.enar.picture.ViewDeploy;
import co.edu.uniandes.enar.picture.ViewStyle;
import co.edu.uniandes.enar.picture.ViewType;
import co.edu.uniandes.enar.picture.Wizard;
import co.edu.uniandes.enar.picture.WizardStart;
import co.edu.uniandes.enar.picture.WizardType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PicturePackageImpl extends EPackageImpl implements PicturePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphicalRepresentationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaConceptReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toolDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toolGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creationButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultLineDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customLineDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass figureStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roundedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regularPolygonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ellipseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customFigureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelPositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphicalDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphicalElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attLinkDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attLinkAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeElementDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeElementAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass figureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regularFigureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageFigureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexFigureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeLinkDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeLinkAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeLineDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeLineAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interNodeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interNodeAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalNodeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalNodeAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulesDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleForTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleForReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wizardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementWizardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personalWizardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predefinedViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showChildsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showSelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personalViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mouseEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wizardStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewDeployEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classExecutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lineTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum wizardTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum componentTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see co.edu.uniandes.enar.picture.PicturePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PicturePackageImpl()
  {
    super(eNS_URI, PictureFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PicturePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PicturePackage init()
  {
    if (isInited) return (PicturePackage)EPackage.Registry.INSTANCE.getEPackage(PicturePackage.eNS_URI);

    // Obtain or create and register package
    PicturePackageImpl thePicturePackage = (PicturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PicturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PicturePackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePicturePackage.createPackageContents();

    // Initialize created meta-data
    thePicturePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePicturePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PicturePackage.eNS_URI, thePicturePackage);
    return thePicturePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Imports()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_GraphicalREpresentation()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_Name()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraphicalRepresentation()
  {
    return graphicalRepresentationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGraphicalRepresentation_Name()
  {
    return (EAttribute)graphicalRepresentationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGraphicalRepresentation_ReferencePackage()
  {
    return (EAttribute)graphicalRepresentationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphicalRepresentation_Root()
  {
    return (EReference)graphicalRepresentationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphicalRepresentation_ToolsDefinition()
  {
    return (EReference)graphicalRepresentationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphicalRepresentation_StyleDefinition()
  {
    return (EReference)graphicalRepresentationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphicalRepresentation_GraphicalDefinition()
  {
    return (EReference)graphicalRepresentationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphicalRepresentation_RulesDefinition()
  {
    return (EReference)graphicalRepresentationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphicalRepresentation_InteractionDefinition()
  {
    return (EReference)graphicalRepresentationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaConceptReference()
  {
    return metaConceptReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaConceptReference_Class()
  {
    return (EAttribute)metaConceptReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassReference()
  {
    return classReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttReference()
  {
    return attReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getROOT()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getROOT_Name()
  {
    return (EAttribute)rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToolDefinition()
  {
    return toolDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToolDefinition_Name()
  {
    return (EReference)toolDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToolDefinition_ToolGroups()
  {
    return (EReference)toolDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToolGroup()
  {
    return toolGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToolGroup_Name()
  {
    return (EAttribute)toolGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToolGroup_Description()
  {
    return (EAttribute)toolGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToolGroup_ToolGroups()
  {
    return (EReference)toolGroupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToolGroup_Buttons()
  {
    return (EReference)toolGroupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreationButton()
  {
    return creationButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreationButton_MetaConceptReference()
  {
    return (EReference)creationButtonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreationButton_Name()
  {
    return (EAttribute)creationButtonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreationButton_Description()
  {
    return (EAttribute)creationButtonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreationButton_Icon()
  {
    return (EAttribute)creationButtonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyleDefinition()
  {
    return styleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyleDefinition_StyleElements()
  {
    return (EReference)styleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyleElement()
  {
    return styleElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineStyle()
  {
    return lineStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineStyle_Name()
  {
    return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineStyle_Width()
  {
    return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineStyle_LineType()
  {
    return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLineStyle_Color()
  {
    return (EReference)lineStyleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineDecoration()
  {
    return lineDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultLineDecoration()
  {
    return defaultLineDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_None()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_Arrow()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_Rhomb()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_Filledrhomb()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_Square()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_Filledsquare()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_Closedarrow()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLineDecoration_Filledclosedarrow()
  {
    return (EAttribute)defaultLineDecorationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomLineDecoration()
  {
    return customLineDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomLineDecoration_Name()
  {
    return (EAttribute)customLineDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomLineDecoration_ReferenceImplementation()
  {
    return (EAttribute)customLineDecorationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Name()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Red()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Green()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Blue()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayout()
  {
    return layoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultLayout()
  {
    return defaultLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLayout_List()
  {
    return (EAttribute)defaultLayoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultLayout_Default()
  {
    return (EAttribute)defaultLayoutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomLayout()
  {
    return customLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomLayout_ReferenceImplementation()
  {
    return (EAttribute)customLayoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFigureStyle()
  {
    return figureStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFigureStyle_Name()
  {
    return (EAttribute)figureStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRounded()
  {
    return roundedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRounded_Rx()
  {
    return (EAttribute)roundedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRounded_Ry()
  {
    return (EAttribute)roundedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegularPolygon()
  {
    return regularPolygonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularPolygon_VertexCant()
  {
    return (EAttribute)regularPolygonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularPolygon_StartAngle()
  {
    return (EAttribute)regularPolygonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEllipse()
  {
    return ellipseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Radiox()
  {
    return (EAttribute)ellipseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Radioy()
  {
    return (EAttribute)ellipseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomFigure()
  {
    return customFigureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFigure_Points()
  {
    return (EReference)customFigureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_X()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Y()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelPosition()
  {
    return labelPositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelPosition_Internal()
  {
    return (EAttribute)labelPositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelPosition_External()
  {
    return (EAttribute)labelPositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSize()
  {
    return sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Width()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Height()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraphicalDefinition()
  {
    return graphicalDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphicalDefinition_Elements()
  {
    return (EReference)graphicalDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraphicalElement()
  {
    return graphicalElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGraphicalElement_Name()
  {
    return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementDef()
  {
    return elementDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeDef()
  {
    return nodeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeDef_ReferenceClass()
  {
    return (EReference)nodeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDef_Label()
  {
    return (EAttribute)nodeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttLinkDef()
  {
    return attLinkDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttLinkDef_ReferenceName()
  {
    return (EReference)attLinkDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementAlt()
  {
    return elementAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeAlt()
  {
    return nodeAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttLinkAlt()
  {
    return attLinkAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeElementDef()
  {
    return nodeElementDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeElementDef_LabelIcon()
  {
    return (EAttribute)nodeElementDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElementDef_LabelPlacement()
  {
    return (EReference)nodeElementDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElementDef_Size()
  {
    return (EReference)nodeElementDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElementDef_Figure()
  {
    return (EReference)nodeElementDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeElementDef_PhantomN()
  {
    return (EAttribute)nodeElementDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeElementAlt()
  {
    return nodeElementAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElementAlt_Parent()
  {
    return (EReference)nodeElementAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElementAlt_LabelPlacement()
  {
    return (EReference)nodeElementAltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElementAlt_Figure()
  {
    return (EReference)nodeElementAltEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElementAlt_Size()
  {
    return (EReference)nodeElementAltEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFigure()
  {
    return figureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegularFigure()
  {
    return regularFigureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularFigure_FigureStyle()
  {
    return (EReference)regularFigureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularFigure_BacgroundColor()
  {
    return (EReference)regularFigureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularFigure_Border()
  {
    return (EReference)regularFigureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularFigure_Path()
  {
    return (EAttribute)regularFigureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularFigure_Size()
  {
    return (EReference)regularFigureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularFigure_Position()
  {
    return (EReference)regularFigureEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageFigure()
  {
    return imageFigureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageFigure_Path()
  {
    return (EAttribute)imageFigureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexFigure()
  {
    return complexFigureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexFigure_ImplementationReference()
  {
    return (EAttribute)complexFigureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeLinkDef()
  {
    return nodeLinkDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLinkDef_Style()
  {
    return (EReference)nodeLinkDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLinkDef_SourceDecoration()
  {
    return (EReference)nodeLinkDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLinkDef_TargetDecoration()
  {
    return (EReference)nodeLinkDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeLinkDef_SourceReference()
  {
    return (EAttribute)nodeLinkDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeLinkDef_TargetReference()
  {
    return (EAttribute)nodeLinkDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeLinkAlt()
  {
    return nodeLinkAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLinkAlt_Parent()
  {
    return (EReference)nodeLinkAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLinkAlt_Style()
  {
    return (EReference)nodeLinkAltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLinkAlt_SourceDecoration()
  {
    return (EReference)nodeLinkAltEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLinkAlt_TargetDecoration()
  {
    return (EReference)nodeLinkAltEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeLineDef()
  {
    return nodeLineDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeLineDef_Label()
  {
    return (EAttribute)nodeLineDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLineDef_Style()
  {
    return (EReference)nodeLineDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLineDef_SourceDecoration()
  {
    return (EReference)nodeLineDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLineDef_TargetDecoration()
  {
    return (EReference)nodeLineDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeLineAlt()
  {
    return nodeLineAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLineAlt_Parent()
  {
    return (EReference)nodeLineAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLineAlt_Style()
  {
    return (EReference)nodeLineAltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLineAlt_SourceDecoration()
  {
    return (EReference)nodeLineAltEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLineAlt_TargetDecoration()
  {
    return (EReference)nodeLineAltEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterNodeDef()
  {
    return interNodeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterNodeDef_Layout()
  {
    return (EReference)interNodeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterNodeAlt()
  {
    return interNodeAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterNodeAlt_Parent()
  {
    return (EReference)interNodeAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterNodeAlt_Layout()
  {
    return (EReference)interNodeAltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalNodeDef()
  {
    return externalNodeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalNodeDef_Size()
  {
    return (EReference)externalNodeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalNodeAlt()
  {
    return externalNodeAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalNodeAlt_Parent()
  {
    return (EReference)externalNodeAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalNodeAlt_Size()
  {
    return (EReference)externalNodeAltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRulesDefinition()
  {
    return rulesDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRulesDefinition_Ruless()
  {
    return (EReference)rulesDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleForType()
  {
    return ruleForTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleForType_ClassReference()
  {
    return (EReference)ruleForTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleForType_Cases()
  {
    return (EReference)ruleForTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleForReference()
  {
    return ruleForReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleForReference_Reference()
  {
    return (EReference)ruleForReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleForReference_Cases()
  {
    return (EReference)ruleForReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseType()
  {
    return caseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaseType_Condition()
  {
    return (EAttribute)caseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseType_NodeElement()
  {
    return (EReference)caseTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseReference()
  {
    return caseReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaseReference_Condition()
  {
    return (EAttribute)caseReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseReference_ReferenceElement()
  {
    return (EReference)caseReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionDefinition()
  {
    return interactionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionDefinition_InteractionElements()
  {
    return (EReference)interactionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionDefinition_Statements()
  {
    return (EReference)interactionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionElement()
  {
    return interactionElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractionElement_Name()
  {
    return (EAttribute)interactionElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWizard()
  {
    return wizardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementWizard()
  {
    return elementWizardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementWizard_ClassReference()
  {
    return (EReference)elementWizardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementWizard_Title()
  {
    return (EAttribute)elementWizardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementWizard_Description()
  {
    return (EAttribute)elementWizardEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementWizard_Type()
  {
    return (EAttribute)elementWizardEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementWizard_Pages()
  {
    return (EReference)elementWizardEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementWizard_DefaultButtons()
  {
    return (EAttribute)elementWizardEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPage()
  {
    return pageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPage_Title()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPage_Description()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPage_Attributes()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPage_References()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPage_Buttons()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttMap()
  {
    return attMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttMap_Attribute()
  {
    return (EAttribute)attMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttMap_Label()
  {
    return (EAttribute)attMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttMap_Component()
  {
    return (EAttribute)attMapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttMap_DefaultValue()
  {
    return (EAttribute)attMapEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_Label()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_MethodAction()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPersonalWizard()
  {
    return personalWizardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPersonalWizard_ReferenceImplementation()
  {
    return (EAttribute)personalWizardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getView()
  {
    return viewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getView_ReferenceImplementation()
  {
    return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredefinedView()
  {
    return predefinedViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredefinedView_Title()
  {
    return (EAttribute)predefinedViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredefinedView_Description()
  {
    return (EAttribute)predefinedViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredefinedView_Type()
  {
    return (EReference)predefinedViewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredefinedView_Style()
  {
    return (EReference)predefinedViewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewType()
  {
    return viewTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewType_ClassReference()
  {
    return (EReference)viewTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowChilds()
  {
    return showChildsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowSelection()
  {
    return showSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountTypes()
  {
    return countTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewStyle()
  {
    return viewStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewStyle_Tree()
  {
    return (EAttribute)viewStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewStyle_Selection()
  {
    return (EAttribute)viewStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewStyle_Table()
  {
    return (EAttribute)viewStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewStyle_ResultGraphic()
  {
    return (EAttribute)viewStyleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPersonalView()
  {
    return personalViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_ClassReference()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Events()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_EventType()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Instructions()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventType()
  {
    return eventTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMouseEvent()
  {
    return mouseEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseDown()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseEnter()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseHorizontalWheel()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseUp()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseWheel()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseVerticalWheel()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseHover()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseExit()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMouseEvent_MouseDoubleClick()
  {
    return (EAttribute)mouseEventEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyEvent()
  {
    return keyEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyEvent_KeyPress()
  {
    return (EAttribute)keyEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyEvent_KeyUp()
  {
    return (EAttribute)keyEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyEvent_KeyDown()
  {
    return (EAttribute)keyEventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementEvent()
  {
    return elementEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementEvent_Create()
  {
    return (EAttribute)elementEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementEvent_Delete()
  {
    return (EAttribute)elementEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuEvent()
  {
    return menuEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuEvent_Name()
  {
    return (EAttribute)menuEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWizardStart()
  {
    return wizardStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWizardStart_Wizard()
  {
    return (EReference)wizardStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewDeploy()
  {
    return viewDeployEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewDeploy_View()
  {
    return (EReference)viewDeployEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassExecution()
  {
    return classExecutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassExecution_InplementationReference()
  {
    return (EAttribute)classExecutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLineType()
  {
    return lineTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWizardType()
  {
    return wizardTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getComponentType()
  {
    return componentTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PictureFactory getPictureFactory()
  {
    return (PictureFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__IMPORTS);
    createEReference(modelEClass, MODEL__GRAPHICAL_REPRESENTATION);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);
    createEAttribute(importEClass, IMPORT__NAME);

    graphicalRepresentationEClass = createEClass(GRAPHICAL_REPRESENTATION);
    createEAttribute(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__NAME);
    createEAttribute(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE);
    createEReference(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__ROOT);
    createEReference(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION);
    createEReference(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__STYLE_DEFINITION);
    createEReference(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION);
    createEReference(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__RULES_DEFINITION);
    createEReference(graphicalRepresentationEClass, GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION);

    metaConceptReferenceEClass = createEClass(META_CONCEPT_REFERENCE);
    createEAttribute(metaConceptReferenceEClass, META_CONCEPT_REFERENCE__CLASS);

    classReferenceEClass = createEClass(CLASS_REFERENCE);

    attReferenceEClass = createEClass(ATT_REFERENCE);

    rootEClass = createEClass(ROOT);
    createEAttribute(rootEClass, ROOT__NAME);

    toolDefinitionEClass = createEClass(TOOL_DEFINITION);
    createEReference(toolDefinitionEClass, TOOL_DEFINITION__NAME);
    createEReference(toolDefinitionEClass, TOOL_DEFINITION__TOOL_GROUPS);

    toolGroupEClass = createEClass(TOOL_GROUP);
    createEAttribute(toolGroupEClass, TOOL_GROUP__NAME);
    createEAttribute(toolGroupEClass, TOOL_GROUP__DESCRIPTION);
    createEReference(toolGroupEClass, TOOL_GROUP__TOOL_GROUPS);
    createEReference(toolGroupEClass, TOOL_GROUP__BUTTONS);

    creationButtonEClass = createEClass(CREATION_BUTTON);
    createEReference(creationButtonEClass, CREATION_BUTTON__META_CONCEPT_REFERENCE);
    createEAttribute(creationButtonEClass, CREATION_BUTTON__NAME);
    createEAttribute(creationButtonEClass, CREATION_BUTTON__DESCRIPTION);
    createEAttribute(creationButtonEClass, CREATION_BUTTON__ICON);

    styleDefinitionEClass = createEClass(STYLE_DEFINITION);
    createEReference(styleDefinitionEClass, STYLE_DEFINITION__STYLE_ELEMENTS);

    styleElementEClass = createEClass(STYLE_ELEMENT);

    lineStyleEClass = createEClass(LINE_STYLE);
    createEAttribute(lineStyleEClass, LINE_STYLE__NAME);
    createEAttribute(lineStyleEClass, LINE_STYLE__WIDTH);
    createEAttribute(lineStyleEClass, LINE_STYLE__LINE_TYPE);
    createEReference(lineStyleEClass, LINE_STYLE__COLOR);

    lineDecorationEClass = createEClass(LINE_DECORATION);

    defaultLineDecorationEClass = createEClass(DEFAULT_LINE_DECORATION);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__NONE);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__ARROW);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__RHOMB);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__FILLEDRHOMB);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__SQUARE);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__FILLEDSQUARE);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__CLOSEDARROW);
    createEAttribute(defaultLineDecorationEClass, DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW);

    customLineDecorationEClass = createEClass(CUSTOM_LINE_DECORATION);
    createEAttribute(customLineDecorationEClass, CUSTOM_LINE_DECORATION__NAME);
    createEAttribute(customLineDecorationEClass, CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION);

    colorEClass = createEClass(COLOR);
    createEAttribute(colorEClass, COLOR__NAME);
    createEAttribute(colorEClass, COLOR__RED);
    createEAttribute(colorEClass, COLOR__GREEN);
    createEAttribute(colorEClass, COLOR__BLUE);

    layoutEClass = createEClass(LAYOUT);

    defaultLayoutEClass = createEClass(DEFAULT_LAYOUT);
    createEAttribute(defaultLayoutEClass, DEFAULT_LAYOUT__LIST);
    createEAttribute(defaultLayoutEClass, DEFAULT_LAYOUT__DEFAULT);

    customLayoutEClass = createEClass(CUSTOM_LAYOUT);
    createEAttribute(customLayoutEClass, CUSTOM_LAYOUT__REFERENCE_IMPLEMENTATION);

    figureStyleEClass = createEClass(FIGURE_STYLE);
    createEAttribute(figureStyleEClass, FIGURE_STYLE__NAME);

    roundedEClass = createEClass(ROUNDED);
    createEAttribute(roundedEClass, ROUNDED__RX);
    createEAttribute(roundedEClass, ROUNDED__RY);

    regularPolygonEClass = createEClass(REGULAR_POLYGON);
    createEAttribute(regularPolygonEClass, REGULAR_POLYGON__VERTEX_CANT);
    createEAttribute(regularPolygonEClass, REGULAR_POLYGON__START_ANGLE);

    ellipseEClass = createEClass(ELLIPSE);
    createEAttribute(ellipseEClass, ELLIPSE__RADIOX);
    createEAttribute(ellipseEClass, ELLIPSE__RADIOY);

    customFigureEClass = createEClass(CUSTOM_FIGURE);
    createEReference(customFigureEClass, CUSTOM_FIGURE__POINTS);

    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__X);
    createEAttribute(pointEClass, POINT__Y);

    labelPositionEClass = createEClass(LABEL_POSITION);
    createEAttribute(labelPositionEClass, LABEL_POSITION__INTERNAL);
    createEAttribute(labelPositionEClass, LABEL_POSITION__EXTERNAL);

    sizeEClass = createEClass(SIZE);
    createEAttribute(sizeEClass, SIZE__WIDTH);
    createEAttribute(sizeEClass, SIZE__HEIGHT);

    graphicalDefinitionEClass = createEClass(GRAPHICAL_DEFINITION);
    createEReference(graphicalDefinitionEClass, GRAPHICAL_DEFINITION__ELEMENTS);

    graphicalElementEClass = createEClass(GRAPHICAL_ELEMENT);
    createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__NAME);

    elementDefEClass = createEClass(ELEMENT_DEF);

    nodeDefEClass = createEClass(NODE_DEF);
    createEReference(nodeDefEClass, NODE_DEF__REFERENCE_CLASS);
    createEAttribute(nodeDefEClass, NODE_DEF__LABEL);

    attLinkDefEClass = createEClass(ATT_LINK_DEF);
    createEReference(attLinkDefEClass, ATT_LINK_DEF__REFERENCE_NAME);

    elementAltEClass = createEClass(ELEMENT_ALT);

    nodeAltEClass = createEClass(NODE_ALT);

    attLinkAltEClass = createEClass(ATT_LINK_ALT);

    nodeElementDefEClass = createEClass(NODE_ELEMENT_DEF);
    createEAttribute(nodeElementDefEClass, NODE_ELEMENT_DEF__LABEL_ICON);
    createEReference(nodeElementDefEClass, NODE_ELEMENT_DEF__LABEL_PLACEMENT);
    createEReference(nodeElementDefEClass, NODE_ELEMENT_DEF__SIZE);
    createEReference(nodeElementDefEClass, NODE_ELEMENT_DEF__FIGURE);
    createEAttribute(nodeElementDefEClass, NODE_ELEMENT_DEF__PHANTOM_N);

    nodeElementAltEClass = createEClass(NODE_ELEMENT_ALT);
    createEReference(nodeElementAltEClass, NODE_ELEMENT_ALT__PARENT);
    createEReference(nodeElementAltEClass, NODE_ELEMENT_ALT__LABEL_PLACEMENT);
    createEReference(nodeElementAltEClass, NODE_ELEMENT_ALT__FIGURE);
    createEReference(nodeElementAltEClass, NODE_ELEMENT_ALT__SIZE);

    figureEClass = createEClass(FIGURE);

    regularFigureEClass = createEClass(REGULAR_FIGURE);
    createEReference(regularFigureEClass, REGULAR_FIGURE__FIGURE_STYLE);
    createEReference(regularFigureEClass, REGULAR_FIGURE__BACGROUND_COLOR);
    createEReference(regularFigureEClass, REGULAR_FIGURE__BORDER);
    createEAttribute(regularFigureEClass, REGULAR_FIGURE__PATH);
    createEReference(regularFigureEClass, REGULAR_FIGURE__SIZE);
    createEReference(regularFigureEClass, REGULAR_FIGURE__POSITION);

    imageFigureEClass = createEClass(IMAGE_FIGURE);
    createEAttribute(imageFigureEClass, IMAGE_FIGURE__PATH);

    complexFigureEClass = createEClass(COMPLEX_FIGURE);
    createEAttribute(complexFigureEClass, COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE);

    nodeLinkDefEClass = createEClass(NODE_LINK_DEF);
    createEReference(nodeLinkDefEClass, NODE_LINK_DEF__STYLE);
    createEReference(nodeLinkDefEClass, NODE_LINK_DEF__SOURCE_DECORATION);
    createEReference(nodeLinkDefEClass, NODE_LINK_DEF__TARGET_DECORATION);
    createEAttribute(nodeLinkDefEClass, NODE_LINK_DEF__SOURCE_REFERENCE);
    createEAttribute(nodeLinkDefEClass, NODE_LINK_DEF__TARGET_REFERENCE);

    nodeLinkAltEClass = createEClass(NODE_LINK_ALT);
    createEReference(nodeLinkAltEClass, NODE_LINK_ALT__PARENT);
    createEReference(nodeLinkAltEClass, NODE_LINK_ALT__STYLE);
    createEReference(nodeLinkAltEClass, NODE_LINK_ALT__SOURCE_DECORATION);
    createEReference(nodeLinkAltEClass, NODE_LINK_ALT__TARGET_DECORATION);

    nodeLineDefEClass = createEClass(NODE_LINE_DEF);
    createEAttribute(nodeLineDefEClass, NODE_LINE_DEF__LABEL);
    createEReference(nodeLineDefEClass, NODE_LINE_DEF__STYLE);
    createEReference(nodeLineDefEClass, NODE_LINE_DEF__SOURCE_DECORATION);
    createEReference(nodeLineDefEClass, NODE_LINE_DEF__TARGET_DECORATION);

    nodeLineAltEClass = createEClass(NODE_LINE_ALT);
    createEReference(nodeLineAltEClass, NODE_LINE_ALT__PARENT);
    createEReference(nodeLineAltEClass, NODE_LINE_ALT__STYLE);
    createEReference(nodeLineAltEClass, NODE_LINE_ALT__SOURCE_DECORATION);
    createEReference(nodeLineAltEClass, NODE_LINE_ALT__TARGET_DECORATION);

    interNodeDefEClass = createEClass(INTER_NODE_DEF);
    createEReference(interNodeDefEClass, INTER_NODE_DEF__LAYOUT);

    interNodeAltEClass = createEClass(INTER_NODE_ALT);
    createEReference(interNodeAltEClass, INTER_NODE_ALT__PARENT);
    createEReference(interNodeAltEClass, INTER_NODE_ALT__LAYOUT);

    externalNodeDefEClass = createEClass(EXTERNAL_NODE_DEF);
    createEReference(externalNodeDefEClass, EXTERNAL_NODE_DEF__SIZE);

    externalNodeAltEClass = createEClass(EXTERNAL_NODE_ALT);
    createEReference(externalNodeAltEClass, EXTERNAL_NODE_ALT__PARENT);
    createEReference(externalNodeAltEClass, EXTERNAL_NODE_ALT__SIZE);

    rulesDefinitionEClass = createEClass(RULES_DEFINITION);
    createEReference(rulesDefinitionEClass, RULES_DEFINITION__RULESS);

    ruleEClass = createEClass(RULE);

    ruleForTypeEClass = createEClass(RULE_FOR_TYPE);
    createEReference(ruleForTypeEClass, RULE_FOR_TYPE__CLASS_REFERENCE);
    createEReference(ruleForTypeEClass, RULE_FOR_TYPE__CASES);

    ruleForReferenceEClass = createEClass(RULE_FOR_REFERENCE);
    createEReference(ruleForReferenceEClass, RULE_FOR_REFERENCE__REFERENCE);
    createEReference(ruleForReferenceEClass, RULE_FOR_REFERENCE__CASES);

    caseTypeEClass = createEClass(CASE_TYPE);
    createEAttribute(caseTypeEClass, CASE_TYPE__CONDITION);
    createEReference(caseTypeEClass, CASE_TYPE__NODE_ELEMENT);

    caseReferenceEClass = createEClass(CASE_REFERENCE);
    createEAttribute(caseReferenceEClass, CASE_REFERENCE__CONDITION);
    createEReference(caseReferenceEClass, CASE_REFERENCE__REFERENCE_ELEMENT);

    interactionDefinitionEClass = createEClass(INTERACTION_DEFINITION);
    createEReference(interactionDefinitionEClass, INTERACTION_DEFINITION__INTERACTION_ELEMENTS);
    createEReference(interactionDefinitionEClass, INTERACTION_DEFINITION__STATEMENTS);

    interactionElementEClass = createEClass(INTERACTION_ELEMENT);
    createEAttribute(interactionElementEClass, INTERACTION_ELEMENT__NAME);

    wizardEClass = createEClass(WIZARD);

    elementWizardEClass = createEClass(ELEMENT_WIZARD);
    createEReference(elementWizardEClass, ELEMENT_WIZARD__CLASS_REFERENCE);
    createEAttribute(elementWizardEClass, ELEMENT_WIZARD__TITLE);
    createEAttribute(elementWizardEClass, ELEMENT_WIZARD__DESCRIPTION);
    createEAttribute(elementWizardEClass, ELEMENT_WIZARD__TYPE);
    createEReference(elementWizardEClass, ELEMENT_WIZARD__PAGES);
    createEAttribute(elementWizardEClass, ELEMENT_WIZARD__DEFAULT_BUTTONS);

    pageEClass = createEClass(PAGE);
    createEAttribute(pageEClass, PAGE__TITLE);
    createEAttribute(pageEClass, PAGE__DESCRIPTION);
    createEReference(pageEClass, PAGE__ATTRIBUTES);
    createEAttribute(pageEClass, PAGE__REFERENCES);
    createEReference(pageEClass, PAGE__BUTTONS);

    attMapEClass = createEClass(ATT_MAP);
    createEAttribute(attMapEClass, ATT_MAP__ATTRIBUTE);
    createEAttribute(attMapEClass, ATT_MAP__LABEL);
    createEAttribute(attMapEClass, ATT_MAP__COMPONENT);
    createEAttribute(attMapEClass, ATT_MAP__DEFAULT_VALUE);

    buttonEClass = createEClass(BUTTON);
    createEAttribute(buttonEClass, BUTTON__LABEL);
    createEAttribute(buttonEClass, BUTTON__METHOD_ACTION);

    personalWizardEClass = createEClass(PERSONAL_WIZARD);
    createEAttribute(personalWizardEClass, PERSONAL_WIZARD__REFERENCE_IMPLEMENTATION);

    viewEClass = createEClass(VIEW);
    createEAttribute(viewEClass, VIEW__REFERENCE_IMPLEMENTATION);

    predefinedViewEClass = createEClass(PREDEFINED_VIEW);
    createEAttribute(predefinedViewEClass, PREDEFINED_VIEW__TITLE);
    createEAttribute(predefinedViewEClass, PREDEFINED_VIEW__DESCRIPTION);
    createEReference(predefinedViewEClass, PREDEFINED_VIEW__TYPE);
    createEReference(predefinedViewEClass, PREDEFINED_VIEW__STYLE);

    viewTypeEClass = createEClass(VIEW_TYPE);
    createEReference(viewTypeEClass, VIEW_TYPE__CLASS_REFERENCE);

    showChildsEClass = createEClass(SHOW_CHILDS);

    showSelectionEClass = createEClass(SHOW_SELECTION);

    countTypesEClass = createEClass(COUNT_TYPES);

    viewStyleEClass = createEClass(VIEW_STYLE);
    createEAttribute(viewStyleEClass, VIEW_STYLE__TREE);
    createEAttribute(viewStyleEClass, VIEW_STYLE__SELECTION);
    createEAttribute(viewStyleEClass, VIEW_STYLE__TABLE);
    createEAttribute(viewStyleEClass, VIEW_STYLE__RESULT_GRAPHIC);

    personalViewEClass = createEClass(PERSONAL_VIEW);

    statementEClass = createEClass(STATEMENT);
    createEAttribute(statementEClass, STATEMENT__CLASS_REFERENCE);
    createEReference(statementEClass, STATEMENT__EVENTS);

    eventEClass = createEClass(EVENT);
    createEReference(eventEClass, EVENT__EVENT_TYPE);
    createEReference(eventEClass, EVENT__INSTRUCTIONS);

    eventTypeEClass = createEClass(EVENT_TYPE);

    mouseEventEClass = createEClass(MOUSE_EVENT);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_DOWN);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_ENTER);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_UP);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_WHEEL);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_VERTICAL_WHEEL);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_HOVER);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_EXIT);
    createEAttribute(mouseEventEClass, MOUSE_EVENT__MOUSE_DOUBLE_CLICK);

    keyEventEClass = createEClass(KEY_EVENT);
    createEAttribute(keyEventEClass, KEY_EVENT__KEY_PRESS);
    createEAttribute(keyEventEClass, KEY_EVENT__KEY_UP);
    createEAttribute(keyEventEClass, KEY_EVENT__KEY_DOWN);

    elementEventEClass = createEClass(ELEMENT_EVENT);
    createEAttribute(elementEventEClass, ELEMENT_EVENT__CREATE);
    createEAttribute(elementEventEClass, ELEMENT_EVENT__DELETE);

    menuEventEClass = createEClass(MENU_EVENT);
    createEAttribute(menuEventEClass, MENU_EVENT__NAME);

    instructionEClass = createEClass(INSTRUCTION);

    wizardStartEClass = createEClass(WIZARD_START);
    createEReference(wizardStartEClass, WIZARD_START__WIZARD);

    viewDeployEClass = createEClass(VIEW_DEPLOY);
    createEReference(viewDeployEClass, VIEW_DEPLOY__VIEW);

    classExecutionEClass = createEClass(CLASS_EXECUTION);
    createEAttribute(classExecutionEClass, CLASS_EXECUTION__INPLEMENTATION_REFERENCE);

    // Create enums
    lineTypeEEnum = createEEnum(LINE_TYPE);
    wizardTypeEEnum = createEEnum(WIZARD_TYPE);
    componentTypeEEnum = createEEnum(COMPONENT_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    classReferenceEClass.getESuperTypes().add(this.getMetaConceptReference());
    attReferenceEClass.getESuperTypes().add(this.getMetaConceptReference());
    lineStyleEClass.getESuperTypes().add(this.getStyleElement());
    lineDecorationEClass.getESuperTypes().add(this.getStyleElement());
    defaultLineDecorationEClass.getESuperTypes().add(this.getLineDecoration());
    customLineDecorationEClass.getESuperTypes().add(this.getLineDecoration());
    colorEClass.getESuperTypes().add(this.getStyleElement());
    defaultLayoutEClass.getESuperTypes().add(this.getLayout());
    customLayoutEClass.getESuperTypes().add(this.getLayout());
    figureStyleEClass.getESuperTypes().add(this.getStyleElement());
    roundedEClass.getESuperTypes().add(this.getFigureStyle());
    regularPolygonEClass.getESuperTypes().add(this.getFigureStyle());
    ellipseEClass.getESuperTypes().add(this.getFigureStyle());
    customFigureEClass.getESuperTypes().add(this.getFigureStyle());
    elementDefEClass.getESuperTypes().add(this.getGraphicalElement());
    nodeDefEClass.getESuperTypes().add(this.getElementDef());
    attLinkDefEClass.getESuperTypes().add(this.getElementDef());
    elementAltEClass.getESuperTypes().add(this.getGraphicalElement());
    nodeAltEClass.getESuperTypes().add(this.getElementAlt());
    attLinkAltEClass.getESuperTypes().add(this.getElementAlt());
    nodeElementDefEClass.getESuperTypes().add(this.getNodeDef());
    nodeElementAltEClass.getESuperTypes().add(this.getNodeAlt());
    regularFigureEClass.getESuperTypes().add(this.getFigure());
    imageFigureEClass.getESuperTypes().add(this.getFigure());
    complexFigureEClass.getESuperTypes().add(this.getFigure());
    nodeLinkDefEClass.getESuperTypes().add(this.getNodeDef());
    nodeLinkAltEClass.getESuperTypes().add(this.getNodeAlt());
    nodeLineDefEClass.getESuperTypes().add(this.getAttLinkDef());
    nodeLineAltEClass.getESuperTypes().add(this.getAttLinkAlt());
    interNodeDefEClass.getESuperTypes().add(this.getAttLinkDef());
    interNodeAltEClass.getESuperTypes().add(this.getAttLinkAlt());
    externalNodeDefEClass.getESuperTypes().add(this.getAttLinkDef());
    externalNodeAltEClass.getESuperTypes().add(this.getAttLinkAlt());
    ruleForTypeEClass.getESuperTypes().add(this.getRule());
    ruleForReferenceEClass.getESuperTypes().add(this.getRule());
    wizardEClass.getESuperTypes().add(this.getInteractionElement());
    elementWizardEClass.getESuperTypes().add(this.getWizard());
    personalWizardEClass.getESuperTypes().add(this.getWizard());
    viewEClass.getESuperTypes().add(this.getInteractionElement());
    predefinedViewEClass.getESuperTypes().add(this.getView());
    showChildsEClass.getESuperTypes().add(this.getViewType());
    showSelectionEClass.getESuperTypes().add(this.getViewType());
    countTypesEClass.getESuperTypes().add(this.getViewType());
    personalViewEClass.getESuperTypes().add(this.getView());
    mouseEventEClass.getESuperTypes().add(this.getEventType());
    keyEventEClass.getESuperTypes().add(this.getEventType());
    elementEventEClass.getESuperTypes().add(this.getEventType());
    menuEventEClass.getESuperTypes().add(this.getEventType());
    wizardStartEClass.getESuperTypes().add(this.getInstruction());
    viewDeployEClass.getESuperTypes().add(this.getInstruction());
    classExecutionEClass.getESuperTypes().add(this.getInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Imports(), this.getImport(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_GraphicalREpresentation(), this.getGraphicalRepresentation(), null, "graphicalREpresentation", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphicalRepresentationEClass, GraphicalRepresentation.class, "GraphicalRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGraphicalRepresentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGraphicalRepresentation_ReferencePackage(), ecorePackage.getEString(), "referencePackage", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraphicalRepresentation_Root(), this.getROOT(), null, "root", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraphicalRepresentation_ToolsDefinition(), this.getToolDefinition(), null, "toolsDefinition", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraphicalRepresentation_StyleDefinition(), this.getStyleDefinition(), null, "styleDefinition", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraphicalRepresentation_GraphicalDefinition(), this.getGraphicalDefinition(), null, "graphicalDefinition", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraphicalRepresentation_RulesDefinition(), this.getRulesDefinition(), null, "rulesDefinition", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraphicalRepresentation_InteractionDefinition(), this.getInteractionDefinition(), null, "interactionDefinition", null, 0, 1, GraphicalRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaConceptReferenceEClass, MetaConceptReference.class, "MetaConceptReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaConceptReference_Class(), ecorePackage.getEString(), "class", null, 0, 1, MetaConceptReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classReferenceEClass, ClassReference.class, "ClassReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attReferenceEClass, AttReference.class, "AttReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rootEClass, co.edu.uniandes.enar.picture.ROOT.class, "ROOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getROOT_Name(), ecorePackage.getEString(), "name", null, 0, 1, co.edu.uniandes.enar.picture.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toolDefinitionEClass, ToolDefinition.class, "ToolDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getToolDefinition_Name(), this.getROOT(), null, "name", null, 0, 1, ToolDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getToolDefinition_ToolGroups(), this.getToolGroup(), null, "toolGroups", null, 0, -1, ToolDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toolGroupEClass, ToolGroup.class, "ToolGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getToolGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getToolGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getToolGroup_ToolGroups(), this.getToolGroup(), null, "toolGroups", null, 0, -1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getToolGroup_Buttons(), this.getCreationButton(), null, "buttons", null, 0, -1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creationButtonEClass, CreationButton.class, "CreationButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreationButton_MetaConceptReference(), this.getClassReference(), null, "metaConceptReference", null, 0, 1, CreationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreationButton_Name(), ecorePackage.getEString(), "name", null, 0, 1, CreationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreationButton_Description(), ecorePackage.getEString(), "description", null, 0, 1, CreationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreationButton_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, CreationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleDefinitionEClass, StyleDefinition.class, "StyleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStyleDefinition_StyleElements(), this.getStyleElement(), null, "styleElements", null, 0, -1, StyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleElementEClass, StyleElement.class, "StyleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineStyle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineStyle_LineType(), this.getLineType(), "lineType", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLineStyle_Color(), this.getColor(), null, "color", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineDecorationEClass, LineDecoration.class, "LineDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defaultLineDecorationEClass, DefaultLineDecoration.class, "DefaultLineDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefaultLineDecoration_None(), ecorePackage.getEString(), "none", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLineDecoration_Arrow(), ecorePackage.getEString(), "arrow", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLineDecoration_Rhomb(), ecorePackage.getEString(), "rhomb", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLineDecoration_Filledrhomb(), ecorePackage.getEString(), "filledrhomb", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLineDecoration_Square(), ecorePackage.getEString(), "square", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLineDecoration_Filledsquare(), ecorePackage.getEString(), "filledsquare", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLineDecoration_Closedarrow(), ecorePackage.getEString(), "closedarrow", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLineDecoration_Filledclosedarrow(), ecorePackage.getEString(), "filledclosedarrow", null, 0, 1, DefaultLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customLineDecorationEClass, CustomLineDecoration.class, "CustomLineDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomLineDecoration_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomLineDecoration_ReferenceImplementation(), ecorePackage.getEString(), "referenceImplementation", null, 0, 1, CustomLineDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColor_Red(), ecorePackage.getEInt(), "red", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColor_Green(), ecorePackage.getEInt(), "green", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColor_Blue(), ecorePackage.getEInt(), "blue", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defaultLayoutEClass, DefaultLayout.class, "DefaultLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefaultLayout_List(), ecorePackage.getEString(), "list", null, 0, 1, DefaultLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultLayout_Default(), ecorePackage.getEString(), "default", null, 0, 1, DefaultLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customLayoutEClass, CustomLayout.class, "CustomLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomLayout_ReferenceImplementation(), ecorePackage.getEString(), "referenceImplementation", null, 0, 1, CustomLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(figureStyleEClass, FigureStyle.class, "FigureStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFigureStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, FigureStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roundedEClass, Rounded.class, "Rounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRounded_Rx(), ecorePackage.getEInt(), "rx", null, 0, 1, Rounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRounded_Ry(), ecorePackage.getEInt(), "ry", null, 0, 1, Rounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regularPolygonEClass, RegularPolygon.class, "RegularPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegularPolygon_VertexCant(), ecorePackage.getEInt(), "vertexCant", null, 0, 1, RegularPolygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularPolygon_StartAngle(), ecorePackage.getEInt(), "startAngle", null, 0, 1, RegularPolygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEllipse_Radiox(), ecorePackage.getEInt(), "radiox", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEllipse_Radioy(), ecorePackage.getEInt(), "radioy", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customFigureEClass, CustomFigure.class, "CustomFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomFigure_Points(), this.getPoint(), null, "points", null, 0, -1, CustomFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelPositionEClass, LabelPosition.class, "LabelPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabelPosition_Internal(), ecorePackage.getEString(), "internal", null, 0, 1, LabelPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabelPosition_External(), ecorePackage.getEString(), "external", null, 0, 1, LabelPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSize_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSize_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphicalDefinitionEClass, GraphicalDefinition.class, "GraphicalDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGraphicalDefinition_Elements(), this.getGraphicalElement(), null, "elements", null, 0, -1, GraphicalDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphicalElementEClass, GraphicalElement.class, "GraphicalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGraphicalElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementDefEClass, ElementDef.class, "ElementDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeDefEClass, NodeDef.class, "NodeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeDef_ReferenceClass(), this.getClassReference(), null, "referenceClass", null, 0, 1, NodeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDef_Label(), ecorePackage.getEString(), "label", null, 0, 1, NodeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attLinkDefEClass, AttLinkDef.class, "AttLinkDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttLinkDef_ReferenceName(), this.getAttReference(), null, "referenceName", null, 0, 1, AttLinkDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementAltEClass, ElementAlt.class, "ElementAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeAltEClass, NodeAlt.class, "NodeAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attLinkAltEClass, AttLinkAlt.class, "AttLinkAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeElementDefEClass, NodeElementDef.class, "NodeElementDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeElementDef_LabelIcon(), ecorePackage.getEBoolean(), "labelIcon", null, 0, 1, NodeElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeElementDef_LabelPlacement(), this.getLabelPosition(), null, "labelPlacement", null, 0, 1, NodeElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeElementDef_Size(), this.getSize(), null, "size", null, 0, 1, NodeElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeElementDef_Figure(), this.getFigure(), null, "figure", null, 0, 1, NodeElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeElementDef_PhantomN(), ecorePackage.getEBoolean(), "phantomN", null, 0, 1, NodeElementDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeElementAltEClass, NodeElementAlt.class, "NodeElementAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeElementAlt_Parent(), this.getNodeElementDef(), null, "parent", null, 0, 1, NodeElementAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeElementAlt_LabelPlacement(), this.getLabelPosition(), null, "labelPlacement", null, 0, 1, NodeElementAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeElementAlt_Figure(), this.getFigure(), null, "figure", null, 0, 1, NodeElementAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeElementAlt_Size(), this.getSize(), null, "size", null, 0, 1, NodeElementAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(figureEClass, Figure.class, "Figure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(regularFigureEClass, RegularFigure.class, "RegularFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegularFigure_FigureStyle(), this.getFigureStyle(), null, "figureStyle", null, 0, 1, RegularFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegularFigure_BacgroundColor(), this.getColor(), null, "bacgroundColor", null, 0, 1, RegularFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegularFigure_Border(), this.getLineStyle(), null, "border", null, 0, 1, RegularFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularFigure_Path(), ecorePackage.getEString(), "path", null, 0, 1, RegularFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegularFigure_Size(), this.getSize(), null, "size", null, 0, 1, RegularFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegularFigure_Position(), this.getPoint(), null, "position", null, 0, 1, RegularFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageFigureEClass, ImageFigure.class, "ImageFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageFigure_Path(), ecorePackage.getEString(), "path", null, 0, 1, ImageFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexFigureEClass, ComplexFigure.class, "ComplexFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexFigure_ImplementationReference(), ecorePackage.getEString(), "implementationReference", null, 0, 1, ComplexFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeLinkDefEClass, NodeLinkDef.class, "NodeLinkDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeLinkDef_Style(), this.getLineStyle(), null, "style", null, 0, 1, NodeLinkDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLinkDef_SourceDecoration(), this.getLineDecoration(), null, "sourceDecoration", null, 0, 1, NodeLinkDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLinkDef_TargetDecoration(), this.getLineDecoration(), null, "targetDecoration", null, 0, 1, NodeLinkDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeLinkDef_SourceReference(), ecorePackage.getEString(), "sourceReference", null, 0, 1, NodeLinkDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeLinkDef_TargetReference(), ecorePackage.getEString(), "targetReference", null, 0, 1, NodeLinkDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeLinkAltEClass, NodeLinkAlt.class, "NodeLinkAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeLinkAlt_Parent(), this.getNodeLinkDef(), null, "parent", null, 0, 1, NodeLinkAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLinkAlt_Style(), this.getLineStyle(), null, "style", null, 0, 1, NodeLinkAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLinkAlt_SourceDecoration(), this.getLineDecoration(), null, "sourceDecoration", null, 0, 1, NodeLinkAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLinkAlt_TargetDecoration(), this.getLineDecoration(), null, "targetDecoration", null, 0, 1, NodeLinkAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeLineDefEClass, NodeLineDef.class, "NodeLineDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeLineDef_Label(), ecorePackage.getEString(), "label", null, 0, 1, NodeLineDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLineDef_Style(), this.getLineStyle(), null, "style", null, 0, 1, NodeLineDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLineDef_SourceDecoration(), this.getLineDecoration(), null, "sourceDecoration", null, 0, 1, NodeLineDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLineDef_TargetDecoration(), this.getLineDecoration(), null, "targetDecoration", null, 0, 1, NodeLineDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeLineAltEClass, NodeLineAlt.class, "NodeLineAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeLineAlt_Parent(), this.getNodeLineDef(), null, "parent", null, 0, 1, NodeLineAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLineAlt_Style(), this.getLineStyle(), null, "style", null, 0, 1, NodeLineAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLineAlt_SourceDecoration(), this.getLineDecoration(), null, "sourceDecoration", null, 0, 1, NodeLineAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLineAlt_TargetDecoration(), this.getLineDecoration(), null, "targetDecoration", null, 0, 1, NodeLineAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interNodeDefEClass, InterNodeDef.class, "InterNodeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterNodeDef_Layout(), this.getLayout(), null, "layout", null, 0, 1, InterNodeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interNodeAltEClass, InterNodeAlt.class, "InterNodeAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterNodeAlt_Parent(), this.getInterNodeDef(), null, "parent", null, 0, 1, InterNodeAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterNodeAlt_Layout(), this.getLayout(), null, "layout", null, 0, 1, InterNodeAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalNodeDefEClass, ExternalNodeDef.class, "ExternalNodeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalNodeDef_Size(), this.getSize(), null, "size", null, 0, 1, ExternalNodeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalNodeAltEClass, ExternalNodeAlt.class, "ExternalNodeAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalNodeAlt_Parent(), this.getExternalNodeDef(), null, "parent", null, 0, 1, ExternalNodeAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalNodeAlt_Size(), this.getSize(), null, "size", null, 0, 1, ExternalNodeAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rulesDefinitionEClass, RulesDefinition.class, "RulesDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRulesDefinition_Ruless(), this.getRule(), null, "ruless", null, 0, -1, RulesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ruleForTypeEClass, RuleForType.class, "RuleForType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleForType_ClassReference(), this.getClassReference(), null, "classReference", null, 0, 1, RuleForType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleForType_Cases(), this.getCaseType(), null, "cases", null, 0, -1, RuleForType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleForReferenceEClass, RuleForReference.class, "RuleForReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleForReference_Reference(), this.getAttReference(), null, "reference", null, 0, 1, RuleForReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleForReference_Cases(), this.getCaseReference(), null, "cases", null, 0, -1, RuleForReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseTypeEClass, CaseType.class, "CaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCaseType_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, CaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseType_NodeElement(), this.getNodeAlt(), null, "nodeElement", null, 0, 1, CaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseReferenceEClass, CaseReference.class, "CaseReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCaseReference_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, CaseReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseReference_ReferenceElement(), this.getAttLinkAlt(), null, "referenceElement", null, 0, 1, CaseReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionDefinitionEClass, InteractionDefinition.class, "InteractionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractionDefinition_InteractionElements(), this.getInteractionElement(), null, "interactionElements", null, 0, -1, InteractionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractionDefinition_Statements(), this.getStatement(), null, "statements", null, 0, -1, InteractionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionElementEClass, InteractionElement.class, "InteractionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractionElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementWizardEClass, ElementWizard.class, "ElementWizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementWizard_ClassReference(), this.getClassReference(), null, "classReference", null, 0, 1, ElementWizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementWizard_Title(), ecorePackage.getEString(), "title", null, 0, 1, ElementWizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementWizard_Description(), ecorePackage.getEString(), "description", null, 0, 1, ElementWizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementWizard_Type(), this.getWizardType(), "type", null, 0, 1, ElementWizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementWizard_Pages(), this.getPage(), null, "pages", null, 0, -1, ElementWizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementWizard_DefaultButtons(), ecorePackage.getEBoolean(), "defaultButtons", null, 0, 1, ElementWizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPage_Description(), ecorePackage.getEString(), "description", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPage_Attributes(), this.getAttMap(), null, "attributes", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPage_References(), ecorePackage.getEString(), "references", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPage_Buttons(), this.getButton(), null, "buttons", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attMapEClass, AttMap.class, "AttMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttMap_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, AttMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttMap_Label(), ecorePackage.getEString(), "label", null, 0, 1, AttMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttMap_Component(), this.getComponentType(), "component", null, 0, 1, AttMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttMap_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, AttMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButton_Label(), ecorePackage.getEString(), "label", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_MethodAction(), ecorePackage.getEString(), "methodAction", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personalWizardEClass, PersonalWizard.class, "PersonalWizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPersonalWizard_ReferenceImplementation(), ecorePackage.getEString(), "referenceImplementation", null, 0, 1, PersonalWizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getView_ReferenceImplementation(), ecorePackage.getEString(), "referenceImplementation", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predefinedViewEClass, PredefinedView.class, "PredefinedView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPredefinedView_Title(), ecorePackage.getEString(), "title", null, 0, 1, PredefinedView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPredefinedView_Description(), ecorePackage.getEString(), "description", null, 0, 1, PredefinedView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredefinedView_Type(), this.getViewType(), null, "type", null, 0, 1, PredefinedView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredefinedView_Style(), this.getViewStyle(), null, "style", null, 0, 1, PredefinedView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewTypeEClass, ViewType.class, "ViewType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewType_ClassReference(), this.getClassReference(), null, "classReference", null, 0, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showChildsEClass, ShowChilds.class, "ShowChilds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(showSelectionEClass, ShowSelection.class, "ShowSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(countTypesEClass, CountTypes.class, "CountTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(viewStyleEClass, ViewStyle.class, "ViewStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewStyle_Tree(), ecorePackage.getEString(), "tree", null, 0, 1, ViewStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewStyle_Selection(), ecorePackage.getEString(), "selection", null, 0, 1, ViewStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewStyle_Table(), ecorePackage.getEString(), "table", null, 0, 1, ViewStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewStyle_ResultGraphic(), ecorePackage.getEString(), "resultGraphic", null, 0, 1, ViewStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personalViewEClass, PersonalView.class, "PersonalView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatement_ClassReference(), ecorePackage.getEString(), "classReference", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Events(), this.getEvent(), null, "events", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvent_EventType(), this.getEventType(), null, "eventType", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mouseEventEClass, MouseEvent.class, "MouseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMouseEvent_MouseDown(), ecorePackage.getEString(), "mouseDown", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseEnter(), ecorePackage.getEString(), "mouseEnter", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseHorizontalWheel(), ecorePackage.getEString(), "mouseHorizontalWheel", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseUp(), ecorePackage.getEString(), "mouseUp", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseWheel(), ecorePackage.getEString(), "mouseWheel", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseVerticalWheel(), ecorePackage.getEString(), "mouseVerticalWheel", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseHover(), ecorePackage.getEString(), "mouseHover", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseExit(), ecorePackage.getEString(), "mouseExit", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMouseEvent_MouseDoubleClick(), ecorePackage.getEString(), "mouseDoubleClick", null, 0, 1, MouseEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyEventEClass, KeyEvent.class, "KeyEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeyEvent_KeyPress(), ecorePackage.getEString(), "keyPress", null, 0, 1, KeyEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeyEvent_KeyUp(), ecorePackage.getEString(), "keyUp", null, 0, 1, KeyEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeyEvent_KeyDown(), ecorePackage.getEString(), "keyDown", null, 0, 1, KeyEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEventEClass, ElementEvent.class, "ElementEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementEvent_Create(), ecorePackage.getEString(), "create", null, 0, 1, ElementEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementEvent_Delete(), ecorePackage.getEString(), "delete", null, 0, 1, ElementEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(menuEventEClass, MenuEvent.class, "MenuEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMenuEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wizardStartEClass, WizardStart.class, "WizardStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWizardStart_Wizard(), this.getWizard(), null, "wizard", null, 0, 1, WizardStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewDeployEClass, ViewDeploy.class, "ViewDeploy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewDeploy_View(), this.getView(), null, "view", null, 0, 1, ViewDeploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classExecutionEClass, ClassExecution.class, "ClassExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassExecution_InplementationReference(), ecorePackage.getEString(), "inplementationReference", null, 0, 1, ClassExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(lineTypeEEnum, LineType.class, "LineType");
    addEEnumLiteral(lineTypeEEnum, LineType.SOLID);
    addEEnumLiteral(lineTypeEEnum, LineType.DASH);
    addEEnumLiteral(lineTypeEEnum, LineType.DOT);
    addEEnumLiteral(lineTypeEEnum, LineType.DASHDOT);
    addEEnumLiteral(lineTypeEEnum, LineType.DASHDOTDOT);

    initEEnum(wizardTypeEEnum, WizardType.class, "WizardType");
    addEEnumLiteral(wizardTypeEEnum, WizardType.CREATE);
    addEEnumLiteral(wizardTypeEEnum, WizardType.EDIT);
    addEEnumLiteral(wizardTypeEEnum, WizardType.INFO);

    initEEnum(componentTypeEEnum, ComponentType.class, "ComponentType");
    addEEnumLiteral(componentTypeEEnum, ComponentType.TEXT_FIELD);
    addEEnumLiteral(componentTypeEEnum, ComponentType.TEXT_AREA);
    addEEnumLiteral(componentTypeEEnum, ComponentType.CHECK_BOX);
    addEEnumLiteral(componentTypeEEnum, ComponentType.COMBO_BOX);
    addEEnumLiteral(componentTypeEEnum, ComponentType.SLIDER);
    addEEnumLiteral(componentTypeEEnum, ComponentType.FILE_REFERENCE);
    addEEnumLiteral(componentTypeEEnum, ComponentType.IMAGE_REFERENCE);

    // Create resource
    createResource(eNS_URI);
  }

} //PicturePackageImpl
