/**
 */
package co.edu.uniandes.enar.picture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.enar.picture.PictureFactory
 * @model kind="package"
 * @generated
 */
public interface PicturePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "picture";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edu.co/uniandes/enar/Picture";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "picture";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PicturePackage eINSTANCE = co.edu.uniandes.enar.picture.impl.PicturePackageImpl.init();

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ModelImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Graphical REpresentation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GRAPHICAL_REPRESENTATION = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ImportImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl <em>Graphical Representation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getGraphicalRepresentation()
   * @generated
   */
  int GRAPHICAL_REPRESENTATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Reference Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__ROOT = 2;

  /**
   * The feature id for the '<em><b>Tools Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Style Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__STYLE_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Graphical Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Rules Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__RULES_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Interaction Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION = 7;

  /**
   * The number of structural features of the '<em>Graphical Representation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_REPRESENTATION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.MetaConceptReferenceImpl <em>Meta Concept Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.MetaConceptReferenceImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getMetaConceptReference()
   * @generated
   */
  int META_CONCEPT_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CONCEPT_REFERENCE__CLASS = 0;

  /**
   * The number of structural features of the '<em>Meta Concept Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CONCEPT_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ClassReferenceImpl <em>Class Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ClassReferenceImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getClassReference()
   * @generated
   */
  int CLASS_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_REFERENCE__CLASS = META_CONCEPT_REFERENCE__CLASS;

  /**
   * The number of structural features of the '<em>Class Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_REFERENCE_FEATURE_COUNT = META_CONCEPT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.AttReferenceImpl <em>Att Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.AttReferenceImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttReference()
   * @generated
   */
  int ATT_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_REFERENCE__CLASS = META_CONCEPT_REFERENCE__CLASS;

  /**
   * The number of structural features of the '<em>Att Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_REFERENCE_FEATURE_COUNT = META_CONCEPT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ROOTImpl <em>ROOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ROOTImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getROOT()
   * @generated
   */
  int ROOT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__NAME = 0;

  /**
   * The number of structural features of the '<em>ROOT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ToolDefinitionImpl <em>Tool Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ToolDefinitionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getToolDefinition()
   * @generated
   */
  int TOOL_DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Tool Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_DEFINITION__TOOL_GROUPS = 1;

  /**
   * The number of structural features of the '<em>Tool Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ToolGroupImpl <em>Tool Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ToolGroupImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getToolGroup()
   * @generated
   */
  int TOOL_GROUP = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_GROUP__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Tool Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_GROUP__TOOL_GROUPS = 2;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_GROUP__BUTTONS = 3;

  /**
   * The number of structural features of the '<em>Tool Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_GROUP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.CreationButtonImpl <em>Creation Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.CreationButtonImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCreationButton()
   * @generated
   */
  int CREATION_BUTTON = 9;

  /**
   * The feature id for the '<em><b>Meta Concept Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATION_BUTTON__META_CONCEPT_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATION_BUTTON__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATION_BUTTON__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATION_BUTTON__ICON = 3;

  /**
   * The number of structural features of the '<em>Creation Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATION_BUTTON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.StyleDefinitionImpl <em>Style Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.StyleDefinitionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getStyleDefinition()
   * @generated
   */
  int STYLE_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Style Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_DEFINITION__STYLE_ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Style Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.StyleElementImpl <em>Style Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.StyleElementImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getStyleElement()
   * @generated
   */
  int STYLE_ELEMENT = 11;

  /**
   * The number of structural features of the '<em>Style Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.LineStyleImpl <em>Line Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.LineStyleImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLineStyle()
   * @generated
   */
  int LINE_STYLE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__NAME = STYLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__WIDTH = STYLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Line Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__LINE_TYPE = STYLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__COLOR = STYLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Line Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.LineDecorationImpl <em>Line Decoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.LineDecorationImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLineDecoration()
   * @generated
   */
  int LINE_DECORATION = 13;

  /**
   * The number of structural features of the '<em>Line Decoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_DECORATION_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl <em>Default Line Decoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getDefaultLineDecoration()
   * @generated
   */
  int DEFAULT_LINE_DECORATION = 14;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__NONE = LINE_DECORATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__ARROW = LINE_DECORATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhomb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__RHOMB = LINE_DECORATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Filledrhomb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__FILLEDRHOMB = LINE_DECORATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Square</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__SQUARE = LINE_DECORATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Filledsquare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__FILLEDSQUARE = LINE_DECORATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Closedarrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__CLOSEDARROW = LINE_DECORATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Filledclosedarrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW = LINE_DECORATION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Default Line Decoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LINE_DECORATION_FEATURE_COUNT = LINE_DECORATION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.CustomLineDecorationImpl <em>Custom Line Decoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.CustomLineDecorationImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCustomLineDecoration()
   * @generated
   */
  int CUSTOM_LINE_DECORATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_LINE_DECORATION__NAME = LINE_DECORATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reference Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION = LINE_DECORATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Custom Line Decoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_LINE_DECORATION_FEATURE_COUNT = LINE_DECORATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ColorImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getColor()
   * @generated
   */
  int COLOR = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__NAME = STYLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Red</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__RED = STYLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Green</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__GREEN = STYLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Blue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__BLUE = STYLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.LayoutImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 17;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.DefaultLayoutImpl <em>Default Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.DefaultLayoutImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getDefaultLayout()
   * @generated
   */
  int DEFAULT_LAYOUT = 18;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LAYOUT__LIST = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LAYOUT__DEFAULT = LAYOUT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Default Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.CustomLayoutImpl <em>Custom Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.CustomLayoutImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCustomLayout()
   * @generated
   */
  int CUSTOM_LAYOUT = 19;

  /**
   * The feature id for the '<em><b>Reference Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_LAYOUT__REFERENCE_IMPLEMENTATION = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.FigureStyleImpl <em>Figure Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.FigureStyleImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getFigureStyle()
   * @generated
   */
  int FIGURE_STYLE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_STYLE__NAME = STYLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Figure Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_STYLE_FEATURE_COUNT = STYLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.RoundedImpl <em>Rounded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.RoundedImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRounded()
   * @generated
   */
  int ROUNDED = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED__NAME = FIGURE_STYLE__NAME;

  /**
   * The feature id for the '<em><b>Rx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED__RX = FIGURE_STYLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED__RY = FIGURE_STYLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rounded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_FEATURE_COUNT = FIGURE_STYLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.RegularPolygonImpl <em>Regular Polygon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.RegularPolygonImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRegularPolygon()
   * @generated
   */
  int REGULAR_POLYGON = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_POLYGON__NAME = FIGURE_STYLE__NAME;

  /**
   * The feature id for the '<em><b>Vertex Cant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_POLYGON__VERTEX_CANT = FIGURE_STYLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_POLYGON__START_ANGLE = FIGURE_STYLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Regular Polygon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_POLYGON_FEATURE_COUNT = FIGURE_STYLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.EllipseImpl <em>Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.EllipseImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getEllipse()
   * @generated
   */
  int ELLIPSE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__NAME = FIGURE_STYLE__NAME;

  /**
   * The feature id for the '<em><b>Radiox</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__RADIOX = FIGURE_STYLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Radioy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__RADIOY = FIGURE_STYLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ellipse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE_FEATURE_COUNT = FIGURE_STYLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.CustomFigureImpl <em>Custom Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.CustomFigureImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCustomFigure()
   * @generated
   */
  int CUSTOM_FIGURE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIGURE__NAME = FIGURE_STYLE__NAME;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIGURE__POINTS = FIGURE_STYLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIGURE_FEATURE_COUNT = FIGURE_STYLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.PointImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPoint()
   * @generated
   */
  int POINT = 25;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Y = 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.LabelPositionImpl <em>Label Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.LabelPositionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLabelPosition()
   * @generated
   */
  int LABEL_POSITION = 26;

  /**
   * The feature id for the '<em><b>Internal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_POSITION__INTERNAL = 0;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_POSITION__EXTERNAL = 1;

  /**
   * The number of structural features of the '<em>Label Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_POSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.SizeImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getSize()
   * @generated
   */
  int SIZE = 27;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__WIDTH = 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__HEIGHT = 1;

  /**
   * The number of structural features of the '<em>Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.GraphicalDefinitionImpl <em>Graphical Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.GraphicalDefinitionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getGraphicalDefinition()
   * @generated
   */
  int GRAPHICAL_DEFINITION = 28;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_DEFINITION__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Graphical Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.GraphicalElementImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getGraphicalElement()
   * @generated
   */
  int GRAPHICAL_ELEMENT = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Graphical Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHICAL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ElementDefImpl <em>Element Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ElementDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementDef()
   * @generated
   */
  int ELEMENT_DEF = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEF__NAME = GRAPHICAL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Element Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEF_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeDefImpl <em>Node Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeDef()
   * @generated
   */
  int NODE_DEF = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEF__NAME = ELEMENT_DEF__NAME;

  /**
   * The feature id for the '<em><b>Reference Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEF__REFERENCE_CLASS = ELEMENT_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEF__LABEL = ELEMENT_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEF_FEATURE_COUNT = ELEMENT_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.AttLinkDefImpl <em>Att Link Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.AttLinkDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttLinkDef()
   * @generated
   */
  int ATT_LINK_DEF = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_LINK_DEF__NAME = ELEMENT_DEF__NAME;

  /**
   * The feature id for the '<em><b>Reference Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_LINK_DEF__REFERENCE_NAME = ELEMENT_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Att Link Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_LINK_DEF_FEATURE_COUNT = ELEMENT_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ElementAltImpl <em>Element Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ElementAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementAlt()
   * @generated
   */
  int ELEMENT_ALT = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_ALT__NAME = GRAPHICAL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Element Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_ALT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeAltImpl <em>Node Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeAlt()
   * @generated
   */
  int NODE_ALT = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ALT__NAME = ELEMENT_ALT__NAME;

  /**
   * The number of structural features of the '<em>Node Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ALT_FEATURE_COUNT = ELEMENT_ALT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.AttLinkAltImpl <em>Att Link Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.AttLinkAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttLinkAlt()
   * @generated
   */
  int ATT_LINK_ALT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_LINK_ALT__NAME = ELEMENT_ALT__NAME;

  /**
   * The number of structural features of the '<em>Att Link Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_LINK_ALT_FEATURE_COUNT = ELEMENT_ALT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeElementDefImpl <em>Node Element Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeElementDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeElementDef()
   * @generated
   */
  int NODE_ELEMENT_DEF = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__NAME = NODE_DEF__NAME;

  /**
   * The feature id for the '<em><b>Reference Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__REFERENCE_CLASS = NODE_DEF__REFERENCE_CLASS;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__LABEL = NODE_DEF__LABEL;

  /**
   * The feature id for the '<em><b>Label Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__LABEL_ICON = NODE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label Placement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__LABEL_PLACEMENT = NODE_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__SIZE = NODE_DEF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__FIGURE = NODE_DEF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Phantom N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF__PHANTOM_N = NODE_DEF_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Node Element Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_DEF_FEATURE_COUNT = NODE_DEF_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeElementAltImpl <em>Node Element Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeElementAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeElementAlt()
   * @generated
   */
  int NODE_ELEMENT_ALT = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_ALT__NAME = NODE_ALT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_ALT__PARENT = NODE_ALT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label Placement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_ALT__LABEL_PLACEMENT = NODE_ALT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_ALT__FIGURE = NODE_ALT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_ALT__SIZE = NODE_ALT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Node Element Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_ALT_FEATURE_COUNT = NODE_ALT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.FigureImpl <em>Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.FigureImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getFigure()
   * @generated
   */
  int FIGURE = 38;

  /**
   * The number of structural features of the '<em>Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl <em>Regular Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.RegularFigureImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRegularFigure()
   * @generated
   */
  int REGULAR_FIGURE = 39;

  /**
   * The feature id for the '<em><b>Figure Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_FIGURE__FIGURE_STYLE = FIGURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bacground Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_FIGURE__BACGROUND_COLOR = FIGURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Border</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_FIGURE__BORDER = FIGURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_FIGURE__PATH = FIGURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_FIGURE__SIZE = FIGURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_FIGURE__POSITION = FIGURE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Regular Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ImageFigureImpl <em>Image Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ImageFigureImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getImageFigure()
   * @generated
   */
  int IMAGE_FIGURE = 40;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FIGURE__PATH = FIGURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ComplexFigureImpl <em>Complex Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ComplexFigureImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getComplexFigure()
   * @generated
   */
  int COMPLEX_FIGURE = 41;

  /**
   * The feature id for the '<em><b>Implementation Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE = FIGURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl <em>Node Link Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLinkDef()
   * @generated
   */
  int NODE_LINK_DEF = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__NAME = NODE_DEF__NAME;

  /**
   * The feature id for the '<em><b>Reference Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__REFERENCE_CLASS = NODE_DEF__REFERENCE_CLASS;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__LABEL = NODE_DEF__LABEL;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__STYLE = NODE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__SOURCE_DECORATION = NODE_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__TARGET_DECORATION = NODE_DEF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__SOURCE_REFERENCE = NODE_DEF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF__TARGET_REFERENCE = NODE_DEF_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Node Link Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_DEF_FEATURE_COUNT = NODE_DEF_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeLinkAltImpl <em>Node Link Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeLinkAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLinkAlt()
   * @generated
   */
  int NODE_LINK_ALT = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_ALT__NAME = NODE_ALT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_ALT__PARENT = NODE_ALT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_ALT__STYLE = NODE_ALT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_ALT__SOURCE_DECORATION = NODE_ALT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_ALT__TARGET_DECORATION = NODE_ALT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Node Link Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINK_ALT_FEATURE_COUNT = NODE_ALT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeLineDefImpl <em>Node Line Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeLineDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLineDef()
   * @generated
   */
  int NODE_LINE_DEF = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_DEF__NAME = ATT_LINK_DEF__NAME;

  /**
   * The feature id for the '<em><b>Reference Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_DEF__REFERENCE_NAME = ATT_LINK_DEF__REFERENCE_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_DEF__LABEL = ATT_LINK_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_DEF__STYLE = ATT_LINK_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_DEF__SOURCE_DECORATION = ATT_LINK_DEF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_DEF__TARGET_DECORATION = ATT_LINK_DEF_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Node Line Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_DEF_FEATURE_COUNT = ATT_LINK_DEF_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.NodeLineAltImpl <em>Node Line Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.NodeLineAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLineAlt()
   * @generated
   */
  int NODE_LINE_ALT = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_ALT__NAME = ATT_LINK_ALT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_ALT__PARENT = ATT_LINK_ALT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_ALT__STYLE = ATT_LINK_ALT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_ALT__SOURCE_DECORATION = ATT_LINK_ALT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target Decoration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_ALT__TARGET_DECORATION = ATT_LINK_ALT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Node Line Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LINE_ALT_FEATURE_COUNT = ATT_LINK_ALT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.InterNodeDefImpl <em>Inter Node Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.InterNodeDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInterNodeDef()
   * @generated
   */
  int INTER_NODE_DEF = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_DEF__NAME = ATT_LINK_DEF__NAME;

  /**
   * The feature id for the '<em><b>Reference Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_DEF__REFERENCE_NAME = ATT_LINK_DEF__REFERENCE_NAME;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_DEF__LAYOUT = ATT_LINK_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inter Node Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_DEF_FEATURE_COUNT = ATT_LINK_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.InterNodeAltImpl <em>Inter Node Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.InterNodeAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInterNodeAlt()
   * @generated
   */
  int INTER_NODE_ALT = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_ALT__NAME = ATT_LINK_ALT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_ALT__PARENT = ATT_LINK_ALT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_ALT__LAYOUT = ATT_LINK_ALT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inter Node Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_NODE_ALT_FEATURE_COUNT = ATT_LINK_ALT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ExternalNodeDefImpl <em>External Node Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ExternalNodeDefImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getExternalNodeDef()
   * @generated
   */
  int EXTERNAL_NODE_DEF = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_DEF__NAME = ATT_LINK_DEF__NAME;

  /**
   * The feature id for the '<em><b>Reference Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_DEF__REFERENCE_NAME = ATT_LINK_DEF__REFERENCE_NAME;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_DEF__SIZE = ATT_LINK_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Node Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_DEF_FEATURE_COUNT = ATT_LINK_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ExternalNodeAltImpl <em>External Node Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ExternalNodeAltImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getExternalNodeAlt()
   * @generated
   */
  int EXTERNAL_NODE_ALT = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_ALT__NAME = ATT_LINK_ALT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_ALT__PARENT = ATT_LINK_ALT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_ALT__SIZE = ATT_LINK_ALT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Node Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NODE_ALT_FEATURE_COUNT = ATT_LINK_ALT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.RulesDefinitionImpl <em>Rules Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.RulesDefinitionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRulesDefinition()
   * @generated
   */
  int RULES_DEFINITION = 50;

  /**
   * The feature id for the '<em><b>Ruless</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_DEFINITION__RULESS = 0;

  /**
   * The number of structural features of the '<em>Rules Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.RuleImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRule()
   * @generated
   */
  int RULE = 51;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.RuleForTypeImpl <em>Rule For Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.RuleForTypeImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRuleForType()
   * @generated
   */
  int RULE_FOR_TYPE = 52;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FOR_TYPE__CLASS_REFERENCE = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FOR_TYPE__CASES = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule For Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FOR_TYPE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.RuleForReferenceImpl <em>Rule For Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.RuleForReferenceImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRuleForReference()
   * @generated
   */
  int RULE_FOR_REFERENCE = 53;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FOR_REFERENCE__REFERENCE = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FOR_REFERENCE__CASES = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule For Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FOR_REFERENCE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.CaseTypeImpl <em>Case Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.CaseTypeImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCaseType()
   * @generated
   */
  int CASE_TYPE = 54;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_TYPE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Node Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_TYPE__NODE_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Case Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.CaseReferenceImpl <em>Case Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.CaseReferenceImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCaseReference()
   * @generated
   */
  int CASE_REFERENCE = 55;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_REFERENCE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Reference Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_REFERENCE__REFERENCE_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Case Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.InteractionDefinitionImpl <em>Interaction Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.InteractionDefinitionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInteractionDefinition()
   * @generated
   */
  int INTERACTION_DEFINITION = 56;

  /**
   * The feature id for the '<em><b>Interaction Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DEFINITION__INTERACTION_ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DEFINITION__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Interaction Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.InteractionElementImpl <em>Interaction Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.InteractionElementImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInteractionElement()
   * @generated
   */
  int INTERACTION_ELEMENT = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Interaction Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.WizardImpl <em>Wizard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.WizardImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getWizard()
   * @generated
   */
  int WIZARD = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIZARD__NAME = INTERACTION_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Wizard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIZARD_FEATURE_COUNT = INTERACTION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl <em>Element Wizard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ElementWizardImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementWizard()
   * @generated
   */
  int ELEMENT_WIZARD = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD__NAME = WIZARD__NAME;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD__CLASS_REFERENCE = WIZARD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD__TITLE = WIZARD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD__DESCRIPTION = WIZARD_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD__TYPE = WIZARD_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD__PAGES = WIZARD_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Default Buttons</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD__DEFAULT_BUTTONS = WIZARD_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Element Wizard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WIZARD_FEATURE_COUNT = WIZARD_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.PageImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPage()
   * @generated
   */
  int PAGE = 60;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__TITLE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__ATTRIBUTES = 2;

  /**
   * The feature id for the '<em><b>References</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__REFERENCES = 3;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__BUTTONS = 4;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.AttMapImpl <em>Att Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.AttMapImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttMap()
   * @generated
   */
  int ATT_MAP = 61;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_MAP__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_MAP__LABEL = 1;

  /**
   * The feature id for the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_MAP__COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_MAP__DEFAULT_VALUE = 3;

  /**
   * The number of structural features of the '<em>Att Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_MAP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ButtonImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getButton()
   * @generated
   */
  int BUTTON = 62;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LABEL = 0;

  /**
   * The feature id for the '<em><b>Method Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__METHOD_ACTION = 1;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.PersonalWizardImpl <em>Personal Wizard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.PersonalWizardImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPersonalWizard()
   * @generated
   */
  int PERSONAL_WIZARD = 63;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_WIZARD__NAME = WIZARD__NAME;

  /**
   * The feature id for the '<em><b>Reference Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_WIZARD__REFERENCE_IMPLEMENTATION = WIZARD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Personal Wizard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_WIZARD_FEATURE_COUNT = WIZARD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ViewImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getView()
   * @generated
   */
  int VIEW = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = INTERACTION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Reference Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__REFERENCE_IMPLEMENTATION = INTERACTION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = INTERACTION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.PredefinedViewImpl <em>Predefined View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.PredefinedViewImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPredefinedView()
   * @generated
   */
  int PREDEFINED_VIEW = 65;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Reference Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_VIEW__REFERENCE_IMPLEMENTATION = VIEW__REFERENCE_IMPLEMENTATION;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_VIEW__TITLE = VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_VIEW__DESCRIPTION = VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_VIEW__TYPE = VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_VIEW__STYLE = VIEW_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Predefined View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ViewTypeImpl <em>View Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ViewTypeImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getViewType()
   * @generated
   */
  int VIEW_TYPE = 66;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_TYPE__CLASS_REFERENCE = 0;

  /**
   * The number of structural features of the '<em>View Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ShowChildsImpl <em>Show Childs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ShowChildsImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getShowChilds()
   * @generated
   */
  int SHOW_CHILDS = 67;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_CHILDS__CLASS_REFERENCE = VIEW_TYPE__CLASS_REFERENCE;

  /**
   * The number of structural features of the '<em>Show Childs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_CHILDS_FEATURE_COUNT = VIEW_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ShowSelectionImpl <em>Show Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ShowSelectionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getShowSelection()
   * @generated
   */
  int SHOW_SELECTION = 68;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_SELECTION__CLASS_REFERENCE = VIEW_TYPE__CLASS_REFERENCE;

  /**
   * The number of structural features of the '<em>Show Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_SELECTION_FEATURE_COUNT = VIEW_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.CountTypesImpl <em>Count Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.CountTypesImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCountTypes()
   * @generated
   */
  int COUNT_TYPES = 69;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_TYPES__CLASS_REFERENCE = VIEW_TYPE__CLASS_REFERENCE;

  /**
   * The number of structural features of the '<em>Count Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_TYPES_FEATURE_COUNT = VIEW_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ViewStyleImpl <em>View Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ViewStyleImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getViewStyle()
   * @generated
   */
  int VIEW_STYLE = 70;

  /**
   * The feature id for the '<em><b>Tree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_STYLE__TREE = 0;

  /**
   * The feature id for the '<em><b>Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_STYLE__SELECTION = 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_STYLE__TABLE = 2;

  /**
   * The feature id for the '<em><b>Result Graphic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_STYLE__RESULT_GRAPHIC = 3;

  /**
   * The number of structural features of the '<em>View Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_STYLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.PersonalViewImpl <em>Personal View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.PersonalViewImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPersonalView()
   * @generated
   */
  int PERSONAL_VIEW = 71;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Reference Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_VIEW__REFERENCE_IMPLEMENTATION = VIEW__REFERENCE_IMPLEMENTATION;

  /**
   * The number of structural features of the '<em>Personal View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.StatementImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 72;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CLASS_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EVENTS = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.EventImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getEvent()
   * @generated
   */
  int EVENT = 73;

  /**
   * The feature id for the '<em><b>Event Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__INSTRUCTIONS = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.EventTypeImpl <em>Event Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.EventTypeImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getEventType()
   * @generated
   */
  int EVENT_TYPE = 74;

  /**
   * The number of structural features of the '<em>Event Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl <em>Mouse Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.MouseEventImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getMouseEvent()
   * @generated
   */
  int MOUSE_EVENT = 75;

  /**
   * The feature id for the '<em><b>Mouse Down</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_DOWN = EVENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mouse Enter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_ENTER = EVENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mouse Horizontal Wheel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL = EVENT_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mouse Up</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_UP = EVENT_TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Mouse Wheel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_WHEEL = EVENT_TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mouse Vertical Wheel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_VERTICAL_WHEEL = EVENT_TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Mouse Hover</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_HOVER = EVENT_TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Mouse Exit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_EXIT = EVENT_TYPE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Mouse Double Click</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT__MOUSE_DOUBLE_CLICK = EVENT_TYPE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Mouse Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_EVENT_FEATURE_COUNT = EVENT_TYPE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.KeyEventImpl <em>Key Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.KeyEventImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getKeyEvent()
   * @generated
   */
  int KEY_EVENT = 76;

  /**
   * The feature id for the '<em><b>Key Press</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_EVENT__KEY_PRESS = EVENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key Up</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_EVENT__KEY_UP = EVENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Key Down</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_EVENT__KEY_DOWN = EVENT_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Key Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_EVENT_FEATURE_COUNT = EVENT_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ElementEventImpl <em>Element Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ElementEventImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementEvent()
   * @generated
   */
  int ELEMENT_EVENT = 77;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_EVENT__CREATE = EVENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_EVENT__DELETE = EVENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Element Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_EVENT_FEATURE_COUNT = EVENT_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.MenuEventImpl <em>Menu Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.MenuEventImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getMenuEvent()
   * @generated
   */
  int MENU_EVENT = 78;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_EVENT__NAME = EVENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Menu Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_EVENT_FEATURE_COUNT = EVENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.InstructionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 79;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.WizardStartImpl <em>Wizard Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.WizardStartImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getWizardStart()
   * @generated
   */
  int WIZARD_START = 80;

  /**
   * The feature id for the '<em><b>Wizard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIZARD_START__WIZARD = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Wizard Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIZARD_START_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ViewDeployImpl <em>View Deploy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ViewDeployImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getViewDeploy()
   * @generated
   */
  int VIEW_DEPLOY = 81;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DEPLOY__VIEW = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View Deploy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DEPLOY_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.impl.ClassExecutionImpl <em>Class Execution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.impl.ClassExecutionImpl
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getClassExecution()
   * @generated
   */
  int CLASS_EXECUTION = 82;

  /**
   * The feature id for the '<em><b>Inplementation Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXECUTION__INPLEMENTATION_REFERENCE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Execution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXECUTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.LineType <em>Line Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.LineType
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLineType()
   * @generated
   */
  int LINE_TYPE = 83;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.WizardType <em>Wizard Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.WizardType
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getWizardType()
   * @generated
   */
  int WIZARD_TYPE = 84;

  /**
   * The meta object id for the '{@link co.edu.uniandes.enar.picture.ComponentType <em>Component Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.enar.picture.ComponentType
   * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getComponentType()
   * @generated
   */
  int COMPONENT_TYPE = 85;


  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see co.edu.uniandes.enar.picture.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see co.edu.uniandes.enar.picture.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.Model#getGraphicalREpresentation <em>Graphical REpresentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Graphical REpresentation</em>'.
   * @see co.edu.uniandes.enar.picture.Model#getGraphicalREpresentation()
   * @see #getModel()
   * @generated
   */
  EReference getModel_GraphicalREpresentation();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see co.edu.uniandes.enar.picture.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see co.edu.uniandes.enar.picture.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation <em>Graphical Representation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graphical Representation</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation
   * @generated
   */
  EClass getGraphicalRepresentation();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getName()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EAttribute getGraphicalRepresentation_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getReferencePackage <em>Reference Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Package</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getReferencePackage()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EAttribute getGraphicalRepresentation_ReferencePackage();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getRoot()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EReference getGraphicalRepresentation_Root();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getToolsDefinition <em>Tools Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tools Definition</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getToolsDefinition()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EReference getGraphicalRepresentation_ToolsDefinition();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getStyleDefinition <em>Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style Definition</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getStyleDefinition()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EReference getGraphicalRepresentation_StyleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getGraphicalDefinition <em>Graphical Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Graphical Definition</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getGraphicalDefinition()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EReference getGraphicalRepresentation_GraphicalDefinition();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getRulesDefinition <em>Rules Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rules Definition</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getRulesDefinition()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EReference getGraphicalRepresentation_RulesDefinition();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.GraphicalRepresentation#getInteractionDefinition <em>Interaction Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interaction Definition</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalRepresentation#getInteractionDefinition()
   * @see #getGraphicalRepresentation()
   * @generated
   */
  EReference getGraphicalRepresentation_InteractionDefinition();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.MetaConceptReference <em>Meta Concept Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Concept Reference</em>'.
   * @see co.edu.uniandes.enar.picture.MetaConceptReference
   * @generated
   */
  EClass getMetaConceptReference();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MetaConceptReference#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see co.edu.uniandes.enar.picture.MetaConceptReference#getClass_()
   * @see #getMetaConceptReference()
   * @generated
   */
  EAttribute getMetaConceptReference_Class();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ClassReference <em>Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Reference</em>'.
   * @see co.edu.uniandes.enar.picture.ClassReference
   * @generated
   */
  EClass getClassReference();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.AttReference <em>Att Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Reference</em>'.
   * @see co.edu.uniandes.enar.picture.AttReference
   * @generated
   */
  EClass getAttReference();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ROOT <em>ROOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ROOT</em>'.
   * @see co.edu.uniandes.enar.picture.ROOT
   * @generated
   */
  EClass getROOT();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ROOT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.ROOT#getName()
   * @see #getROOT()
   * @generated
   */
  EAttribute getROOT_Name();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ToolDefinition <em>Tool Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tool Definition</em>'.
   * @see co.edu.uniandes.enar.picture.ToolDefinition
   * @generated
   */
  EClass getToolDefinition();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.ToolDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.ToolDefinition#getName()
   * @see #getToolDefinition()
   * @generated
   */
  EReference getToolDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.ToolDefinition#getToolGroups <em>Tool Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tool Groups</em>'.
   * @see co.edu.uniandes.enar.picture.ToolDefinition#getToolGroups()
   * @see #getToolDefinition()
   * @generated
   */
  EReference getToolDefinition_ToolGroups();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ToolGroup <em>Tool Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tool Group</em>'.
   * @see co.edu.uniandes.enar.picture.ToolGroup
   * @generated
   */
  EClass getToolGroup();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ToolGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.ToolGroup#getName()
   * @see #getToolGroup()
   * @generated
   */
  EAttribute getToolGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ToolGroup#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see co.edu.uniandes.enar.picture.ToolGroup#getDescription()
   * @see #getToolGroup()
   * @generated
   */
  EAttribute getToolGroup_Description();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.ToolGroup#getToolGroups <em>Tool Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tool Groups</em>'.
   * @see co.edu.uniandes.enar.picture.ToolGroup#getToolGroups()
   * @see #getToolGroup()
   * @generated
   */
  EReference getToolGroup_ToolGroups();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.ToolGroup#getButtons <em>Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Buttons</em>'.
   * @see co.edu.uniandes.enar.picture.ToolGroup#getButtons()
   * @see #getToolGroup()
   * @generated
   */
  EReference getToolGroup_Buttons();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.CreationButton <em>Creation Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Creation Button</em>'.
   * @see co.edu.uniandes.enar.picture.CreationButton
   * @generated
   */
  EClass getCreationButton();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.CreationButton#getMetaConceptReference <em>Meta Concept Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Concept Reference</em>'.
   * @see co.edu.uniandes.enar.picture.CreationButton#getMetaConceptReference()
   * @see #getCreationButton()
   * @generated
   */
  EReference getCreationButton_MetaConceptReference();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CreationButton#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.CreationButton#getName()
   * @see #getCreationButton()
   * @generated
   */
  EAttribute getCreationButton_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CreationButton#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see co.edu.uniandes.enar.picture.CreationButton#getDescription()
   * @see #getCreationButton()
   * @generated
   */
  EAttribute getCreationButton_Description();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CreationButton#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see co.edu.uniandes.enar.picture.CreationButton#getIcon()
   * @see #getCreationButton()
   * @generated
   */
  EAttribute getCreationButton_Icon();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.StyleDefinition <em>Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Definition</em>'.
   * @see co.edu.uniandes.enar.picture.StyleDefinition
   * @generated
   */
  EClass getStyleDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.StyleDefinition#getStyleElements <em>Style Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Style Elements</em>'.
   * @see co.edu.uniandes.enar.picture.StyleDefinition#getStyleElements()
   * @see #getStyleDefinition()
   * @generated
   */
  EReference getStyleDefinition_StyleElements();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.StyleElement <em>Style Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Element</em>'.
   * @see co.edu.uniandes.enar.picture.StyleElement
   * @generated
   */
  EClass getStyleElement();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.LineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Style</em>'.
   * @see co.edu.uniandes.enar.picture.LineStyle
   * @generated
   */
  EClass getLineStyle();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.LineStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.LineStyle#getName()
   * @see #getLineStyle()
   * @generated
   */
  EAttribute getLineStyle_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.LineStyle#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see co.edu.uniandes.enar.picture.LineStyle#getWidth()
   * @see #getLineStyle()
   * @generated
   */
  EAttribute getLineStyle_Width();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.LineStyle#getLineType <em>Line Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Type</em>'.
   * @see co.edu.uniandes.enar.picture.LineStyle#getLineType()
   * @see #getLineStyle()
   * @generated
   */
  EAttribute getLineStyle_LineType();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.LineStyle#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Color</em>'.
   * @see co.edu.uniandes.enar.picture.LineStyle#getColor()
   * @see #getLineStyle()
   * @generated
   */
  EReference getLineStyle_Color();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.LineDecoration <em>Line Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.LineDecoration
   * @generated
   */
  EClass getLineDecoration();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration <em>Default Line Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Line Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration
   * @generated
   */
  EClass getDefaultLineDecoration();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getNone()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_None();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getArrow <em>Arrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arrow</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getArrow()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_Arrow();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getRhomb <em>Rhomb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rhomb</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getRhomb()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_Rhomb();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getFilledrhomb <em>Filledrhomb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filledrhomb</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getFilledrhomb()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_Filledrhomb();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getSquare <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Square</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getSquare()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_Square();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getFilledsquare <em>Filledsquare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filledsquare</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getFilledsquare()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_Filledsquare();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getClosedarrow <em>Closedarrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Closedarrow</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getClosedarrow()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_Closedarrow();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLineDecoration#getFilledclosedarrow <em>Filledclosedarrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filledclosedarrow</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLineDecoration#getFilledclosedarrow()
   * @see #getDefaultLineDecoration()
   * @generated
   */
  EAttribute getDefaultLineDecoration_Filledclosedarrow();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.CustomLineDecoration <em>Custom Line Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Line Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.CustomLineDecoration
   * @generated
   */
  EClass getCustomLineDecoration();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CustomLineDecoration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.CustomLineDecoration#getName()
   * @see #getCustomLineDecoration()
   * @generated
   */
  EAttribute getCustomLineDecoration_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CustomLineDecoration#getReferenceImplementation <em>Reference Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Implementation</em>'.
   * @see co.edu.uniandes.enar.picture.CustomLineDecoration#getReferenceImplementation()
   * @see #getCustomLineDecoration()
   * @generated
   */
  EAttribute getCustomLineDecoration_ReferenceImplementation();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see co.edu.uniandes.enar.picture.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Color#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.Color#getName()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Color#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Red</em>'.
   * @see co.edu.uniandes.enar.picture.Color#getRed()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Red();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Color#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Green</em>'.
   * @see co.edu.uniandes.enar.picture.Color#getGreen()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Green();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Color#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blue</em>'.
   * @see co.edu.uniandes.enar.picture.Color#getBlue()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Blue();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see co.edu.uniandes.enar.picture.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.DefaultLayout <em>Default Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Layout</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLayout
   * @generated
   */
  EClass getDefaultLayout();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLayout#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLayout#getList()
   * @see #getDefaultLayout()
   * @generated
   */
  EAttribute getDefaultLayout_List();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.DefaultLayout#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see co.edu.uniandes.enar.picture.DefaultLayout#getDefault()
   * @see #getDefaultLayout()
   * @generated
   */
  EAttribute getDefaultLayout_Default();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.CustomLayout <em>Custom Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Layout</em>'.
   * @see co.edu.uniandes.enar.picture.CustomLayout
   * @generated
   */
  EClass getCustomLayout();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CustomLayout#getReferenceImplementation <em>Reference Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Implementation</em>'.
   * @see co.edu.uniandes.enar.picture.CustomLayout#getReferenceImplementation()
   * @see #getCustomLayout()
   * @generated
   */
  EAttribute getCustomLayout_ReferenceImplementation();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.FigureStyle <em>Figure Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Figure Style</em>'.
   * @see co.edu.uniandes.enar.picture.FigureStyle
   * @generated
   */
  EClass getFigureStyle();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.FigureStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.FigureStyle#getName()
   * @see #getFigureStyle()
   * @generated
   */
  EAttribute getFigureStyle_Name();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Rounded <em>Rounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rounded</em>'.
   * @see co.edu.uniandes.enar.picture.Rounded
   * @generated
   */
  EClass getRounded();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Rounded#getRx <em>Rx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rx</em>'.
   * @see co.edu.uniandes.enar.picture.Rounded#getRx()
   * @see #getRounded()
   * @generated
   */
  EAttribute getRounded_Rx();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Rounded#getRy <em>Ry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ry</em>'.
   * @see co.edu.uniandes.enar.picture.Rounded#getRy()
   * @see #getRounded()
   * @generated
   */
  EAttribute getRounded_Ry();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.RegularPolygon <em>Regular Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regular Polygon</em>'.
   * @see co.edu.uniandes.enar.picture.RegularPolygon
   * @generated
   */
  EClass getRegularPolygon();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.RegularPolygon#getVertexCant <em>Vertex Cant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vertex Cant</em>'.
   * @see co.edu.uniandes.enar.picture.RegularPolygon#getVertexCant()
   * @see #getRegularPolygon()
   * @generated
   */
  EAttribute getRegularPolygon_VertexCant();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.RegularPolygon#getStartAngle <em>Start Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Angle</em>'.
   * @see co.edu.uniandes.enar.picture.RegularPolygon#getStartAngle()
   * @see #getRegularPolygon()
   * @generated
   */
  EAttribute getRegularPolygon_StartAngle();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ellipse</em>'.
   * @see co.edu.uniandes.enar.picture.Ellipse
   * @generated
   */
  EClass getEllipse();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Ellipse#getRadiox <em>Radiox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radiox</em>'.
   * @see co.edu.uniandes.enar.picture.Ellipse#getRadiox()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Radiox();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Ellipse#getRadioy <em>Radioy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radioy</em>'.
   * @see co.edu.uniandes.enar.picture.Ellipse#getRadioy()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Radioy();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.CustomFigure <em>Custom Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Figure</em>'.
   * @see co.edu.uniandes.enar.picture.CustomFigure
   * @generated
   */
  EClass getCustomFigure();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.CustomFigure#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see co.edu.uniandes.enar.picture.CustomFigure#getPoints()
   * @see #getCustomFigure()
   * @generated
   */
  EReference getCustomFigure_Points();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see co.edu.uniandes.enar.picture.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see co.edu.uniandes.enar.picture.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see co.edu.uniandes.enar.picture.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.LabelPosition <em>Label Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Position</em>'.
   * @see co.edu.uniandes.enar.picture.LabelPosition
   * @generated
   */
  EClass getLabelPosition();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.LabelPosition#getInternal <em>Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Internal</em>'.
   * @see co.edu.uniandes.enar.picture.LabelPosition#getInternal()
   * @see #getLabelPosition()
   * @generated
   */
  EAttribute getLabelPosition_Internal();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.LabelPosition#getExternal <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External</em>'.
   * @see co.edu.uniandes.enar.picture.LabelPosition#getExternal()
   * @see #getLabelPosition()
   * @generated
   */
  EAttribute getLabelPosition_External();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see co.edu.uniandes.enar.picture.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Size#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see co.edu.uniandes.enar.picture.Size#getWidth()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Width();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Size#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see co.edu.uniandes.enar.picture.Size#getHeight()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Height();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.GraphicalDefinition <em>Graphical Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graphical Definition</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalDefinition
   * @generated
   */
  EClass getGraphicalDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.GraphicalDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalDefinition#getElements()
   * @see #getGraphicalDefinition()
   * @generated
   */
  EReference getGraphicalDefinition_Elements();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.GraphicalElement <em>Graphical Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graphical Element</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalElement
   * @generated
   */
  EClass getGraphicalElement();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.GraphicalElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.GraphicalElement#getName()
   * @see #getGraphicalElement()
   * @generated
   */
  EAttribute getGraphicalElement_Name();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ElementDef <em>Element Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Def</em>'.
   * @see co.edu.uniandes.enar.picture.ElementDef
   * @generated
   */
  EClass getElementDef();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeDef <em>Node Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Def</em>'.
   * @see co.edu.uniandes.enar.picture.NodeDef
   * @generated
   */
  EClass getNodeDef();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeDef#getReferenceClass <em>Reference Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference Class</em>'.
   * @see co.edu.uniandes.enar.picture.NodeDef#getReferenceClass()
   * @see #getNodeDef()
   * @generated
   */
  EReference getNodeDef_ReferenceClass();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.NodeDef#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see co.edu.uniandes.enar.picture.NodeDef#getLabel()
   * @see #getNodeDef()
   * @generated
   */
  EAttribute getNodeDef_Label();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.AttLinkDef <em>Att Link Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Link Def</em>'.
   * @see co.edu.uniandes.enar.picture.AttLinkDef
   * @generated
   */
  EClass getAttLinkDef();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.AttLinkDef#getReferenceName <em>Reference Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference Name</em>'.
   * @see co.edu.uniandes.enar.picture.AttLinkDef#getReferenceName()
   * @see #getAttLinkDef()
   * @generated
   */
  EReference getAttLinkDef_ReferenceName();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ElementAlt <em>Element Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Alt</em>'.
   * @see co.edu.uniandes.enar.picture.ElementAlt
   * @generated
   */
  EClass getElementAlt();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeAlt <em>Node Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Alt</em>'.
   * @see co.edu.uniandes.enar.picture.NodeAlt
   * @generated
   */
  EClass getNodeAlt();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.AttLinkAlt <em>Att Link Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Link Alt</em>'.
   * @see co.edu.uniandes.enar.picture.AttLinkAlt
   * @generated
   */
  EClass getAttLinkAlt();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeElementDef <em>Node Element Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Element Def</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementDef
   * @generated
   */
  EClass getNodeElementDef();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.NodeElementDef#isLabelIcon <em>Label Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Icon</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementDef#isLabelIcon()
   * @see #getNodeElementDef()
   * @generated
   */
  EAttribute getNodeElementDef_LabelIcon();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeElementDef#getLabelPlacement <em>Label Placement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label Placement</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementDef#getLabelPlacement()
   * @see #getNodeElementDef()
   * @generated
   */
  EReference getNodeElementDef_LabelPlacement();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeElementDef#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementDef#getSize()
   * @see #getNodeElementDef()
   * @generated
   */
  EReference getNodeElementDef_Size();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeElementDef#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Figure</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementDef#getFigure()
   * @see #getNodeElementDef()
   * @generated
   */
  EReference getNodeElementDef_Figure();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.NodeElementDef#isPhantomN <em>Phantom N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Phantom N</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementDef#isPhantomN()
   * @see #getNodeElementDef()
   * @generated
   */
  EAttribute getNodeElementDef_PhantomN();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeElementAlt <em>Node Element Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Element Alt</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementAlt
   * @generated
   */
  EClass getNodeElementAlt();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementAlt#getParent()
   * @see #getNodeElementAlt()
   * @generated
   */
  EReference getNodeElementAlt_Parent();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getLabelPlacement <em>Label Placement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label Placement</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementAlt#getLabelPlacement()
   * @see #getNodeElementAlt()
   * @generated
   */
  EReference getNodeElementAlt_LabelPlacement();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Figure</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementAlt#getFigure()
   * @see #getNodeElementAlt()
   * @generated
   */
  EReference getNodeElementAlt_Figure();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeElementAlt#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see co.edu.uniandes.enar.picture.NodeElementAlt#getSize()
   * @see #getNodeElementAlt()
   * @generated
   */
  EReference getNodeElementAlt_Size();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Figure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Figure</em>'.
   * @see co.edu.uniandes.enar.picture.Figure
   * @generated
   */
  EClass getFigure();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.RegularFigure <em>Regular Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regular Figure</em>'.
   * @see co.edu.uniandes.enar.picture.RegularFigure
   * @generated
   */
  EClass getRegularFigure();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.RegularFigure#getFigureStyle <em>Figure Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Figure Style</em>'.
   * @see co.edu.uniandes.enar.picture.RegularFigure#getFigureStyle()
   * @see #getRegularFigure()
   * @generated
   */
  EReference getRegularFigure_FigureStyle();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.RegularFigure#getBacgroundColor <em>Bacground Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bacground Color</em>'.
   * @see co.edu.uniandes.enar.picture.RegularFigure#getBacgroundColor()
   * @see #getRegularFigure()
   * @generated
   */
  EReference getRegularFigure_BacgroundColor();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.RegularFigure#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Border</em>'.
   * @see co.edu.uniandes.enar.picture.RegularFigure#getBorder()
   * @see #getRegularFigure()
   * @generated
   */
  EReference getRegularFigure_Border();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.RegularFigure#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see co.edu.uniandes.enar.picture.RegularFigure#getPath()
   * @see #getRegularFigure()
   * @generated
   */
  EAttribute getRegularFigure_Path();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.RegularFigure#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see co.edu.uniandes.enar.picture.RegularFigure#getSize()
   * @see #getRegularFigure()
   * @generated
   */
  EReference getRegularFigure_Size();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.RegularFigure#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Position</em>'.
   * @see co.edu.uniandes.enar.picture.RegularFigure#getPosition()
   * @see #getRegularFigure()
   * @generated
   */
  EReference getRegularFigure_Position();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ImageFigure <em>Image Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Figure</em>'.
   * @see co.edu.uniandes.enar.picture.ImageFigure
   * @generated
   */
  EClass getImageFigure();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ImageFigure#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see co.edu.uniandes.enar.picture.ImageFigure#getPath()
   * @see #getImageFigure()
   * @generated
   */
  EAttribute getImageFigure_Path();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ComplexFigure <em>Complex Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Figure</em>'.
   * @see co.edu.uniandes.enar.picture.ComplexFigure
   * @generated
   */
  EClass getComplexFigure();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ComplexFigure#getImplementationReference <em>Implementation Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implementation Reference</em>'.
   * @see co.edu.uniandes.enar.picture.ComplexFigure#getImplementationReference()
   * @see #getComplexFigure()
   * @generated
   */
  EAttribute getComplexFigure_ImplementationReference();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeLinkDef <em>Node Link Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Link Def</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkDef
   * @generated
   */
  EClass getNodeLinkDef();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkDef#getStyle()
   * @see #getNodeLinkDef()
   * @generated
   */
  EReference getNodeLinkDef_Style();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getSourceDecoration <em>Source Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkDef#getSourceDecoration()
   * @see #getNodeLinkDef()
   * @generated
   */
  EReference getNodeLinkDef_SourceDecoration();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getTargetDecoration <em>Target Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkDef#getTargetDecoration()
   * @see #getNodeLinkDef()
   * @generated
   */
  EReference getNodeLinkDef_TargetDecoration();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getSourceReference <em>Source Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Reference</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkDef#getSourceReference()
   * @see #getNodeLinkDef()
   * @generated
   */
  EAttribute getNodeLinkDef_SourceReference();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.NodeLinkDef#getTargetReference <em>Target Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Reference</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkDef#getTargetReference()
   * @see #getNodeLinkDef()
   * @generated
   */
  EAttribute getNodeLinkDef_TargetReference();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeLinkAlt <em>Node Link Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Link Alt</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkAlt
   * @generated
   */
  EClass getNodeLinkAlt();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkAlt#getParent()
   * @see #getNodeLinkAlt()
   * @generated
   */
  EReference getNodeLinkAlt_Parent();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkAlt#getStyle()
   * @see #getNodeLinkAlt()
   * @generated
   */
  EReference getNodeLinkAlt_Style();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getSourceDecoration <em>Source Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkAlt#getSourceDecoration()
   * @see #getNodeLinkAlt()
   * @generated
   */
  EReference getNodeLinkAlt_SourceDecoration();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLinkAlt#getTargetDecoration <em>Target Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLinkAlt#getTargetDecoration()
   * @see #getNodeLinkAlt()
   * @generated
   */
  EReference getNodeLinkAlt_TargetDecoration();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeLineDef <em>Node Line Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Line Def</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineDef
   * @generated
   */
  EClass getNodeLineDef();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.NodeLineDef#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineDef#getLabel()
   * @see #getNodeLineDef()
   * @generated
   */
  EAttribute getNodeLineDef_Label();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.NodeLineDef#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineDef#getStyle()
   * @see #getNodeLineDef()
   * @generated
   */
  EReference getNodeLineDef_Style();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLineDef#getSourceDecoration <em>Source Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineDef#getSourceDecoration()
   * @see #getNodeLineDef()
   * @generated
   */
  EReference getNodeLineDef_SourceDecoration();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLineDef#getTargetDecoration <em>Target Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineDef#getTargetDecoration()
   * @see #getNodeLineDef()
   * @generated
   */
  EReference getNodeLineDef_TargetDecoration();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.NodeLineAlt <em>Node Line Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Line Alt</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineAlt
   * @generated
   */
  EClass getNodeLineAlt();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineAlt#getParent()
   * @see #getNodeLineAlt()
   * @generated
   */
  EReference getNodeLineAlt_Parent();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineAlt#getStyle()
   * @see #getNodeLineAlt()
   * @generated
   */
  EReference getNodeLineAlt_Style();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getSourceDecoration <em>Source Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineAlt#getSourceDecoration()
   * @see #getNodeLineAlt()
   * @generated
   */
  EReference getNodeLineAlt_SourceDecoration();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.NodeLineAlt#getTargetDecoration <em>Target Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Decoration</em>'.
   * @see co.edu.uniandes.enar.picture.NodeLineAlt#getTargetDecoration()
   * @see #getNodeLineAlt()
   * @generated
   */
  EReference getNodeLineAlt_TargetDecoration();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.InterNodeDef <em>Inter Node Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inter Node Def</em>'.
   * @see co.edu.uniandes.enar.picture.InterNodeDef
   * @generated
   */
  EClass getInterNodeDef();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.InterNodeDef#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see co.edu.uniandes.enar.picture.InterNodeDef#getLayout()
   * @see #getInterNodeDef()
   * @generated
   */
  EReference getInterNodeDef_Layout();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.InterNodeAlt <em>Inter Node Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inter Node Alt</em>'.
   * @see co.edu.uniandes.enar.picture.InterNodeAlt
   * @generated
   */
  EClass getInterNodeAlt();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.InterNodeAlt#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see co.edu.uniandes.enar.picture.InterNodeAlt#getParent()
   * @see #getInterNodeAlt()
   * @generated
   */
  EReference getInterNodeAlt_Parent();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.InterNodeAlt#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see co.edu.uniandes.enar.picture.InterNodeAlt#getLayout()
   * @see #getInterNodeAlt()
   * @generated
   */
  EReference getInterNodeAlt_Layout();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ExternalNodeDef <em>External Node Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Node Def</em>'.
   * @see co.edu.uniandes.enar.picture.ExternalNodeDef
   * @generated
   */
  EClass getExternalNodeDef();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.ExternalNodeDef#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see co.edu.uniandes.enar.picture.ExternalNodeDef#getSize()
   * @see #getExternalNodeDef()
   * @generated
   */
  EReference getExternalNodeDef_Size();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ExternalNodeAlt <em>External Node Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Node Alt</em>'.
   * @see co.edu.uniandes.enar.picture.ExternalNodeAlt
   * @generated
   */
  EClass getExternalNodeAlt();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.ExternalNodeAlt#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see co.edu.uniandes.enar.picture.ExternalNodeAlt#getParent()
   * @see #getExternalNodeAlt()
   * @generated
   */
  EReference getExternalNodeAlt_Parent();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.ExternalNodeAlt#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see co.edu.uniandes.enar.picture.ExternalNodeAlt#getSize()
   * @see #getExternalNodeAlt()
   * @generated
   */
  EReference getExternalNodeAlt_Size();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.RulesDefinition <em>Rules Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rules Definition</em>'.
   * @see co.edu.uniandes.enar.picture.RulesDefinition
   * @generated
   */
  EClass getRulesDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.RulesDefinition#getRuless <em>Ruless</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ruless</em>'.
   * @see co.edu.uniandes.enar.picture.RulesDefinition#getRuless()
   * @see #getRulesDefinition()
   * @generated
   */
  EReference getRulesDefinition_Ruless();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see co.edu.uniandes.enar.picture.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.RuleForType <em>Rule For Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule For Type</em>'.
   * @see co.edu.uniandes.enar.picture.RuleForType
   * @generated
   */
  EClass getRuleForType();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.RuleForType#getClassReference <em>Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Reference</em>'.
   * @see co.edu.uniandes.enar.picture.RuleForType#getClassReference()
   * @see #getRuleForType()
   * @generated
   */
  EReference getRuleForType_ClassReference();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.RuleForType#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see co.edu.uniandes.enar.picture.RuleForType#getCases()
   * @see #getRuleForType()
   * @generated
   */
  EReference getRuleForType_Cases();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.RuleForReference <em>Rule For Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule For Reference</em>'.
   * @see co.edu.uniandes.enar.picture.RuleForReference
   * @generated
   */
  EClass getRuleForReference();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.RuleForReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see co.edu.uniandes.enar.picture.RuleForReference#getReference()
   * @see #getRuleForReference()
   * @generated
   */
  EReference getRuleForReference_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.RuleForReference#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see co.edu.uniandes.enar.picture.RuleForReference#getCases()
   * @see #getRuleForReference()
   * @generated
   */
  EReference getRuleForReference_Cases();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.CaseType <em>Case Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Type</em>'.
   * @see co.edu.uniandes.enar.picture.CaseType
   * @generated
   */
  EClass getCaseType();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CaseType#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see co.edu.uniandes.enar.picture.CaseType#getCondition()
   * @see #getCaseType()
   * @generated
   */
  EAttribute getCaseType_Condition();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.CaseType#getNodeElement <em>Node Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node Element</em>'.
   * @see co.edu.uniandes.enar.picture.CaseType#getNodeElement()
   * @see #getCaseType()
   * @generated
   */
  EReference getCaseType_NodeElement();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.CaseReference <em>Case Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Reference</em>'.
   * @see co.edu.uniandes.enar.picture.CaseReference
   * @generated
   */
  EClass getCaseReference();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.CaseReference#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see co.edu.uniandes.enar.picture.CaseReference#getCondition()
   * @see #getCaseReference()
   * @generated
   */
  EAttribute getCaseReference_Condition();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.CaseReference#getReferenceElement <em>Reference Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference Element</em>'.
   * @see co.edu.uniandes.enar.picture.CaseReference#getReferenceElement()
   * @see #getCaseReference()
   * @generated
   */
  EReference getCaseReference_ReferenceElement();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.InteractionDefinition <em>Interaction Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Definition</em>'.
   * @see co.edu.uniandes.enar.picture.InteractionDefinition
   * @generated
   */
  EClass getInteractionDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.InteractionDefinition#getInteractionElements <em>Interaction Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Elements</em>'.
   * @see co.edu.uniandes.enar.picture.InteractionDefinition#getInteractionElements()
   * @see #getInteractionDefinition()
   * @generated
   */
  EReference getInteractionDefinition_InteractionElements();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.InteractionDefinition#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see co.edu.uniandes.enar.picture.InteractionDefinition#getStatements()
   * @see #getInteractionDefinition()
   * @generated
   */
  EReference getInteractionDefinition_Statements();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.InteractionElement <em>Interaction Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Element</em>'.
   * @see co.edu.uniandes.enar.picture.InteractionElement
   * @generated
   */
  EClass getInteractionElement();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.InteractionElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.InteractionElement#getName()
   * @see #getInteractionElement()
   * @generated
   */
  EAttribute getInteractionElement_Name();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Wizard <em>Wizard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wizard</em>'.
   * @see co.edu.uniandes.enar.picture.Wizard
   * @generated
   */
  EClass getWizard();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ElementWizard <em>Element Wizard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Wizard</em>'.
   * @see co.edu.uniandes.enar.picture.ElementWizard
   * @generated
   */
  EClass getElementWizard();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.ElementWizard#getClassReference <em>Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Reference</em>'.
   * @see co.edu.uniandes.enar.picture.ElementWizard#getClassReference()
   * @see #getElementWizard()
   * @generated
   */
  EReference getElementWizard_ClassReference();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ElementWizard#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see co.edu.uniandes.enar.picture.ElementWizard#getTitle()
   * @see #getElementWizard()
   * @generated
   */
  EAttribute getElementWizard_Title();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ElementWizard#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see co.edu.uniandes.enar.picture.ElementWizard#getDescription()
   * @see #getElementWizard()
   * @generated
   */
  EAttribute getElementWizard_Description();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ElementWizard#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see co.edu.uniandes.enar.picture.ElementWizard#getType()
   * @see #getElementWizard()
   * @generated
   */
  EAttribute getElementWizard_Type();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.ElementWizard#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see co.edu.uniandes.enar.picture.ElementWizard#getPages()
   * @see #getElementWizard()
   * @generated
   */
  EReference getElementWizard_Pages();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ElementWizard#isDefaultButtons <em>Default Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Buttons</em>'.
   * @see co.edu.uniandes.enar.picture.ElementWizard#isDefaultButtons()
   * @see #getElementWizard()
   * @generated
   */
  EAttribute getElementWizard_DefaultButtons();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see co.edu.uniandes.enar.picture.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Page#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see co.edu.uniandes.enar.picture.Page#getTitle()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Title();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Page#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see co.edu.uniandes.enar.picture.Page#getDescription()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Description();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.Page#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see co.edu.uniandes.enar.picture.Page#getAttributes()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Attributes();

  /**
   * Returns the meta object for the attribute list '{@link co.edu.uniandes.enar.picture.Page#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>References</em>'.
   * @see co.edu.uniandes.enar.picture.Page#getReferences()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_References();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.Page#getButtons <em>Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Buttons</em>'.
   * @see co.edu.uniandes.enar.picture.Page#getButtons()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Buttons();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.AttMap <em>Att Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Map</em>'.
   * @see co.edu.uniandes.enar.picture.AttMap
   * @generated
   */
  EClass getAttMap();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.AttMap#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see co.edu.uniandes.enar.picture.AttMap#getAttribute()
   * @see #getAttMap()
   * @generated
   */
  EAttribute getAttMap_Attribute();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.AttMap#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see co.edu.uniandes.enar.picture.AttMap#getLabel()
   * @see #getAttMap()
   * @generated
   */
  EAttribute getAttMap_Label();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.AttMap#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component</em>'.
   * @see co.edu.uniandes.enar.picture.AttMap#getComponent()
   * @see #getAttMap()
   * @generated
   */
  EAttribute getAttMap_Component();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.AttMap#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see co.edu.uniandes.enar.picture.AttMap#getDefaultValue()
   * @see #getAttMap()
   * @generated
   */
  EAttribute getAttMap_DefaultValue();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see co.edu.uniandes.enar.picture.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Button#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see co.edu.uniandes.enar.picture.Button#getLabel()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Label();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Button#getMethodAction <em>Method Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Action</em>'.
   * @see co.edu.uniandes.enar.picture.Button#getMethodAction()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_MethodAction();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.PersonalWizard <em>Personal Wizard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Personal Wizard</em>'.
   * @see co.edu.uniandes.enar.picture.PersonalWizard
   * @generated
   */
  EClass getPersonalWizard();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.PersonalWizard#getReferenceImplementation <em>Reference Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Implementation</em>'.
   * @see co.edu.uniandes.enar.picture.PersonalWizard#getReferenceImplementation()
   * @see #getPersonalWizard()
   * @generated
   */
  EAttribute getPersonalWizard_ReferenceImplementation();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see co.edu.uniandes.enar.picture.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.View#getReferenceImplementation <em>Reference Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Implementation</em>'.
   * @see co.edu.uniandes.enar.picture.View#getReferenceImplementation()
   * @see #getView()
   * @generated
   */
  EAttribute getView_ReferenceImplementation();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.PredefinedView <em>Predefined View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predefined View</em>'.
   * @see co.edu.uniandes.enar.picture.PredefinedView
   * @generated
   */
  EClass getPredefinedView();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.PredefinedView#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see co.edu.uniandes.enar.picture.PredefinedView#getTitle()
   * @see #getPredefinedView()
   * @generated
   */
  EAttribute getPredefinedView_Title();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.PredefinedView#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see co.edu.uniandes.enar.picture.PredefinedView#getDescription()
   * @see #getPredefinedView()
   * @generated
   */
  EAttribute getPredefinedView_Description();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.PredefinedView#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see co.edu.uniandes.enar.picture.PredefinedView#getType()
   * @see #getPredefinedView()
   * @generated
   */
  EReference getPredefinedView_Type();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.PredefinedView#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see co.edu.uniandes.enar.picture.PredefinedView#getStyle()
   * @see #getPredefinedView()
   * @generated
   */
  EReference getPredefinedView_Style();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ViewType <em>View Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Type</em>'.
   * @see co.edu.uniandes.enar.picture.ViewType
   * @generated
   */
  EClass getViewType();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.ViewType#getClassReference <em>Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Reference</em>'.
   * @see co.edu.uniandes.enar.picture.ViewType#getClassReference()
   * @see #getViewType()
   * @generated
   */
  EReference getViewType_ClassReference();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ShowChilds <em>Show Childs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Childs</em>'.
   * @see co.edu.uniandes.enar.picture.ShowChilds
   * @generated
   */
  EClass getShowChilds();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ShowSelection <em>Show Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Selection</em>'.
   * @see co.edu.uniandes.enar.picture.ShowSelection
   * @generated
   */
  EClass getShowSelection();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.CountTypes <em>Count Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count Types</em>'.
   * @see co.edu.uniandes.enar.picture.CountTypes
   * @generated
   */
  EClass getCountTypes();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ViewStyle <em>View Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Style</em>'.
   * @see co.edu.uniandes.enar.picture.ViewStyle
   * @generated
   */
  EClass getViewStyle();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ViewStyle#getTree <em>Tree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tree</em>'.
   * @see co.edu.uniandes.enar.picture.ViewStyle#getTree()
   * @see #getViewStyle()
   * @generated
   */
  EAttribute getViewStyle_Tree();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ViewStyle#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selection</em>'.
   * @see co.edu.uniandes.enar.picture.ViewStyle#getSelection()
   * @see #getViewStyle()
   * @generated
   */
  EAttribute getViewStyle_Selection();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ViewStyle#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see co.edu.uniandes.enar.picture.ViewStyle#getTable()
   * @see #getViewStyle()
   * @generated
   */
  EAttribute getViewStyle_Table();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ViewStyle#getResultGraphic <em>Result Graphic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result Graphic</em>'.
   * @see co.edu.uniandes.enar.picture.ViewStyle#getResultGraphic()
   * @see #getViewStyle()
   * @generated
   */
  EAttribute getViewStyle_ResultGraphic();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.PersonalView <em>Personal View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Personal View</em>'.
   * @see co.edu.uniandes.enar.picture.PersonalView
   * @generated
   */
  EClass getPersonalView();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see co.edu.uniandes.enar.picture.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.Statement#getClassReference <em>Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Reference</em>'.
   * @see co.edu.uniandes.enar.picture.Statement#getClassReference()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_ClassReference();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.Statement#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see co.edu.uniandes.enar.picture.Statement#getEvents()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Events();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see co.edu.uniandes.enar.picture.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.enar.picture.Event#getEventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event Type</em>'.
   * @see co.edu.uniandes.enar.picture.Event#getEventType()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_EventType();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.enar.picture.Event#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see co.edu.uniandes.enar.picture.Event#getInstructions()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Instructions();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.EventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Type</em>'.
   * @see co.edu.uniandes.enar.picture.EventType
   * @generated
   */
  EClass getEventType();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.MouseEvent <em>Mouse Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mouse Event</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent
   * @generated
   */
  EClass getMouseEvent();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseDown <em>Mouse Down</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Down</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseDown()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseDown();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseEnter <em>Mouse Enter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Enter</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseEnter()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseEnter();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseHorizontalWheel <em>Mouse Horizontal Wheel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Horizontal Wheel</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseHorizontalWheel()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseHorizontalWheel();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseUp <em>Mouse Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Up</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseUp()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseUp();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseWheel <em>Mouse Wheel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Wheel</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseWheel()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseWheel();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseVerticalWheel <em>Mouse Vertical Wheel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Vertical Wheel</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseVerticalWheel()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseVerticalWheel();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseHover <em>Mouse Hover</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Hover</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseHover()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseHover();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseExit <em>Mouse Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Exit</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseExit()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseExit();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MouseEvent#getMouseDoubleClick <em>Mouse Double Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mouse Double Click</em>'.
   * @see co.edu.uniandes.enar.picture.MouseEvent#getMouseDoubleClick()
   * @see #getMouseEvent()
   * @generated
   */
  EAttribute getMouseEvent_MouseDoubleClick();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.KeyEvent <em>Key Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Event</em>'.
   * @see co.edu.uniandes.enar.picture.KeyEvent
   * @generated
   */
  EClass getKeyEvent();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyPress <em>Key Press</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Press</em>'.
   * @see co.edu.uniandes.enar.picture.KeyEvent#getKeyPress()
   * @see #getKeyEvent()
   * @generated
   */
  EAttribute getKeyEvent_KeyPress();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyUp <em>Key Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Up</em>'.
   * @see co.edu.uniandes.enar.picture.KeyEvent#getKeyUp()
   * @see #getKeyEvent()
   * @generated
   */
  EAttribute getKeyEvent_KeyUp();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.KeyEvent#getKeyDown <em>Key Down</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Down</em>'.
   * @see co.edu.uniandes.enar.picture.KeyEvent#getKeyDown()
   * @see #getKeyEvent()
   * @generated
   */
  EAttribute getKeyEvent_KeyDown();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ElementEvent <em>Element Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Event</em>'.
   * @see co.edu.uniandes.enar.picture.ElementEvent
   * @generated
   */
  EClass getElementEvent();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ElementEvent#getCreate <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create</em>'.
   * @see co.edu.uniandes.enar.picture.ElementEvent#getCreate()
   * @see #getElementEvent()
   * @generated
   */
  EAttribute getElementEvent_Create();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ElementEvent#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delete</em>'.
   * @see co.edu.uniandes.enar.picture.ElementEvent#getDelete()
   * @see #getElementEvent()
   * @generated
   */
  EAttribute getElementEvent_Delete();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.MenuEvent <em>Menu Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu Event</em>'.
   * @see co.edu.uniandes.enar.picture.MenuEvent
   * @generated
   */
  EClass getMenuEvent();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.MenuEvent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.enar.picture.MenuEvent#getName()
   * @see #getMenuEvent()
   * @generated
   */
  EAttribute getMenuEvent_Name();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see co.edu.uniandes.enar.picture.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.WizardStart <em>Wizard Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wizard Start</em>'.
   * @see co.edu.uniandes.enar.picture.WizardStart
   * @generated
   */
  EClass getWizardStart();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.WizardStart#getWizard <em>Wizard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Wizard</em>'.
   * @see co.edu.uniandes.enar.picture.WizardStart#getWizard()
   * @see #getWizardStart()
   * @generated
   */
  EReference getWizardStart_Wizard();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ViewDeploy <em>View Deploy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Deploy</em>'.
   * @see co.edu.uniandes.enar.picture.ViewDeploy
   * @generated
   */
  EClass getViewDeploy();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.enar.picture.ViewDeploy#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see co.edu.uniandes.enar.picture.ViewDeploy#getView()
   * @see #getViewDeploy()
   * @generated
   */
  EReference getViewDeploy_View();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.enar.picture.ClassExecution <em>Class Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Execution</em>'.
   * @see co.edu.uniandes.enar.picture.ClassExecution
   * @generated
   */
  EClass getClassExecution();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.enar.picture.ClassExecution#getInplementationReference <em>Inplementation Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inplementation Reference</em>'.
   * @see co.edu.uniandes.enar.picture.ClassExecution#getInplementationReference()
   * @see #getClassExecution()
   * @generated
   */
  EAttribute getClassExecution_InplementationReference();

  /**
   * Returns the meta object for enum '{@link co.edu.uniandes.enar.picture.LineType <em>Line Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Line Type</em>'.
   * @see co.edu.uniandes.enar.picture.LineType
   * @generated
   */
  EEnum getLineType();

  /**
   * Returns the meta object for enum '{@link co.edu.uniandes.enar.picture.WizardType <em>Wizard Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Wizard Type</em>'.
   * @see co.edu.uniandes.enar.picture.WizardType
   * @generated
   */
  EEnum getWizardType();

  /**
   * Returns the meta object for enum '{@link co.edu.uniandes.enar.picture.ComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Component Type</em>'.
   * @see co.edu.uniandes.enar.picture.ComponentType
   * @generated
   */
  EEnum getComponentType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PictureFactory getPictureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ModelImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Graphical REpresentation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GRAPHICAL_REPRESENTATION = eINSTANCE.getModel_GraphicalREpresentation();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ImportImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl <em>Graphical Representation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.GraphicalRepresentationImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getGraphicalRepresentation()
     * @generated
     */
    EClass GRAPHICAL_REPRESENTATION = eINSTANCE.getGraphicalRepresentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPHICAL_REPRESENTATION__NAME = eINSTANCE.getGraphicalRepresentation_Name();

    /**
     * The meta object literal for the '<em><b>Reference Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPHICAL_REPRESENTATION__REFERENCE_PACKAGE = eINSTANCE.getGraphicalRepresentation_ReferencePackage();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHICAL_REPRESENTATION__ROOT = eINSTANCE.getGraphicalRepresentation_Root();

    /**
     * The meta object literal for the '<em><b>Tools Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHICAL_REPRESENTATION__TOOLS_DEFINITION = eINSTANCE.getGraphicalRepresentation_ToolsDefinition();

    /**
     * The meta object literal for the '<em><b>Style Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHICAL_REPRESENTATION__STYLE_DEFINITION = eINSTANCE.getGraphicalRepresentation_StyleDefinition();

    /**
     * The meta object literal for the '<em><b>Graphical Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHICAL_REPRESENTATION__GRAPHICAL_DEFINITION = eINSTANCE.getGraphicalRepresentation_GraphicalDefinition();

    /**
     * The meta object literal for the '<em><b>Rules Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHICAL_REPRESENTATION__RULES_DEFINITION = eINSTANCE.getGraphicalRepresentation_RulesDefinition();

    /**
     * The meta object literal for the '<em><b>Interaction Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHICAL_REPRESENTATION__INTERACTION_DEFINITION = eINSTANCE.getGraphicalRepresentation_InteractionDefinition();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.MetaConceptReferenceImpl <em>Meta Concept Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.MetaConceptReferenceImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getMetaConceptReference()
     * @generated
     */
    EClass META_CONCEPT_REFERENCE = eINSTANCE.getMetaConceptReference();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_CONCEPT_REFERENCE__CLASS = eINSTANCE.getMetaConceptReference_Class();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ClassReferenceImpl <em>Class Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ClassReferenceImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getClassReference()
     * @generated
     */
    EClass CLASS_REFERENCE = eINSTANCE.getClassReference();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.AttReferenceImpl <em>Att Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.AttReferenceImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttReference()
     * @generated
     */
    EClass ATT_REFERENCE = eINSTANCE.getAttReference();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ROOTImpl <em>ROOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ROOTImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getROOT()
     * @generated
     */
    EClass ROOT = eINSTANCE.getROOT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT__NAME = eINSTANCE.getROOT_Name();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ToolDefinitionImpl <em>Tool Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ToolDefinitionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getToolDefinition()
     * @generated
     */
    EClass TOOL_DEFINITION = eINSTANCE.getToolDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOOL_DEFINITION__NAME = eINSTANCE.getToolDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Tool Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOOL_DEFINITION__TOOL_GROUPS = eINSTANCE.getToolDefinition_ToolGroups();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ToolGroupImpl <em>Tool Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ToolGroupImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getToolGroup()
     * @generated
     */
    EClass TOOL_GROUP = eINSTANCE.getToolGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOOL_GROUP__NAME = eINSTANCE.getToolGroup_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOOL_GROUP__DESCRIPTION = eINSTANCE.getToolGroup_Description();

    /**
     * The meta object literal for the '<em><b>Tool Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOOL_GROUP__TOOL_GROUPS = eINSTANCE.getToolGroup_ToolGroups();

    /**
     * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOOL_GROUP__BUTTONS = eINSTANCE.getToolGroup_Buttons();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.CreationButtonImpl <em>Creation Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.CreationButtonImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCreationButton()
     * @generated
     */
    EClass CREATION_BUTTON = eINSTANCE.getCreationButton();

    /**
     * The meta object literal for the '<em><b>Meta Concept Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATION_BUTTON__META_CONCEPT_REFERENCE = eINSTANCE.getCreationButton_MetaConceptReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATION_BUTTON__NAME = eINSTANCE.getCreationButton_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATION_BUTTON__DESCRIPTION = eINSTANCE.getCreationButton_Description();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATION_BUTTON__ICON = eINSTANCE.getCreationButton_Icon();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.StyleDefinitionImpl <em>Style Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.StyleDefinitionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getStyleDefinition()
     * @generated
     */
    EClass STYLE_DEFINITION = eINSTANCE.getStyleDefinition();

    /**
     * The meta object literal for the '<em><b>Style Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_DEFINITION__STYLE_ELEMENTS = eINSTANCE.getStyleDefinition_StyleElements();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.StyleElementImpl <em>Style Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.StyleElementImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getStyleElement()
     * @generated
     */
    EClass STYLE_ELEMENT = eINSTANCE.getStyleElement();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.LineStyleImpl <em>Line Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.LineStyleImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLineStyle()
     * @generated
     */
    EClass LINE_STYLE = eINSTANCE.getLineStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_STYLE__NAME = eINSTANCE.getLineStyle_Name();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_STYLE__WIDTH = eINSTANCE.getLineStyle_Width();

    /**
     * The meta object literal for the '<em><b>Line Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_STYLE__LINE_TYPE = eINSTANCE.getLineStyle_LineType();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE_STYLE__COLOR = eINSTANCE.getLineStyle_Color();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.LineDecorationImpl <em>Line Decoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.LineDecorationImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLineDecoration()
     * @generated
     */
    EClass LINE_DECORATION = eINSTANCE.getLineDecoration();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl <em>Default Line Decoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.DefaultLineDecorationImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getDefaultLineDecoration()
     * @generated
     */
    EClass DEFAULT_LINE_DECORATION = eINSTANCE.getDefaultLineDecoration();

    /**
     * The meta object literal for the '<em><b>None</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__NONE = eINSTANCE.getDefaultLineDecoration_None();

    /**
     * The meta object literal for the '<em><b>Arrow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__ARROW = eINSTANCE.getDefaultLineDecoration_Arrow();

    /**
     * The meta object literal for the '<em><b>Rhomb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__RHOMB = eINSTANCE.getDefaultLineDecoration_Rhomb();

    /**
     * The meta object literal for the '<em><b>Filledrhomb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__FILLEDRHOMB = eINSTANCE.getDefaultLineDecoration_Filledrhomb();

    /**
     * The meta object literal for the '<em><b>Square</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__SQUARE = eINSTANCE.getDefaultLineDecoration_Square();

    /**
     * The meta object literal for the '<em><b>Filledsquare</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__FILLEDSQUARE = eINSTANCE.getDefaultLineDecoration_Filledsquare();

    /**
     * The meta object literal for the '<em><b>Closedarrow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__CLOSEDARROW = eINSTANCE.getDefaultLineDecoration_Closedarrow();

    /**
     * The meta object literal for the '<em><b>Filledclosedarrow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LINE_DECORATION__FILLEDCLOSEDARROW = eINSTANCE.getDefaultLineDecoration_Filledclosedarrow();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.CustomLineDecorationImpl <em>Custom Line Decoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.CustomLineDecorationImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCustomLineDecoration()
     * @generated
     */
    EClass CUSTOM_LINE_DECORATION = eINSTANCE.getCustomLineDecoration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_LINE_DECORATION__NAME = eINSTANCE.getCustomLineDecoration_Name();

    /**
     * The meta object literal for the '<em><b>Reference Implementation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_LINE_DECORATION__REFERENCE_IMPLEMENTATION = eINSTANCE.getCustomLineDecoration_ReferenceImplementation();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ColorImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__NAME = eINSTANCE.getColor_Name();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__RED = eINSTANCE.getColor_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.LayoutImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.DefaultLayoutImpl <em>Default Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.DefaultLayoutImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getDefaultLayout()
     * @generated
     */
    EClass DEFAULT_LAYOUT = eINSTANCE.getDefaultLayout();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LAYOUT__LIST = eINSTANCE.getDefaultLayout_List();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_LAYOUT__DEFAULT = eINSTANCE.getDefaultLayout_Default();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.CustomLayoutImpl <em>Custom Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.CustomLayoutImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCustomLayout()
     * @generated
     */
    EClass CUSTOM_LAYOUT = eINSTANCE.getCustomLayout();

    /**
     * The meta object literal for the '<em><b>Reference Implementation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_LAYOUT__REFERENCE_IMPLEMENTATION = eINSTANCE.getCustomLayout_ReferenceImplementation();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.FigureStyleImpl <em>Figure Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.FigureStyleImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getFigureStyle()
     * @generated
     */
    EClass FIGURE_STYLE = eINSTANCE.getFigureStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIGURE_STYLE__NAME = eINSTANCE.getFigureStyle_Name();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.RoundedImpl <em>Rounded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.RoundedImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRounded()
     * @generated
     */
    EClass ROUNDED = eINSTANCE.getRounded();

    /**
     * The meta object literal for the '<em><b>Rx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUNDED__RX = eINSTANCE.getRounded_Rx();

    /**
     * The meta object literal for the '<em><b>Ry</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUNDED__RY = eINSTANCE.getRounded_Ry();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.RegularPolygonImpl <em>Regular Polygon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.RegularPolygonImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRegularPolygon()
     * @generated
     */
    EClass REGULAR_POLYGON = eINSTANCE.getRegularPolygon();

    /**
     * The meta object literal for the '<em><b>Vertex Cant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_POLYGON__VERTEX_CANT = eINSTANCE.getRegularPolygon_VertexCant();

    /**
     * The meta object literal for the '<em><b>Start Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_POLYGON__START_ANGLE = eINSTANCE.getRegularPolygon_StartAngle();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.EllipseImpl <em>Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.EllipseImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getEllipse()
     * @generated
     */
    EClass ELLIPSE = eINSTANCE.getEllipse();

    /**
     * The meta object literal for the '<em><b>Radiox</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPSE__RADIOX = eINSTANCE.getEllipse_Radiox();

    /**
     * The meta object literal for the '<em><b>Radioy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPSE__RADIOY = eINSTANCE.getEllipse_Radioy();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.CustomFigureImpl <em>Custom Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.CustomFigureImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCustomFigure()
     * @generated
     */
    EClass CUSTOM_FIGURE = eINSTANCE.getCustomFigure();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FIGURE__POINTS = eINSTANCE.getCustomFigure_Points();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.PointImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__X = eINSTANCE.getPoint_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.LabelPositionImpl <em>Label Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.LabelPositionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLabelPosition()
     * @generated
     */
    EClass LABEL_POSITION = eINSTANCE.getLabelPosition();

    /**
     * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_POSITION__INTERNAL = eINSTANCE.getLabelPosition_Internal();

    /**
     * The meta object literal for the '<em><b>External</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_POSITION__EXTERNAL = eINSTANCE.getLabelPosition_External();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.SizeImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getSize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getSize();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.GraphicalDefinitionImpl <em>Graphical Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.GraphicalDefinitionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getGraphicalDefinition()
     * @generated
     */
    EClass GRAPHICAL_DEFINITION = eINSTANCE.getGraphicalDefinition();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHICAL_DEFINITION__ELEMENTS = eINSTANCE.getGraphicalDefinition_Elements();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.GraphicalElementImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getGraphicalElement()
     * @generated
     */
    EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPHICAL_ELEMENT__NAME = eINSTANCE.getGraphicalElement_Name();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ElementDefImpl <em>Element Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ElementDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementDef()
     * @generated
     */
    EClass ELEMENT_DEF = eINSTANCE.getElementDef();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeDefImpl <em>Node Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeDef()
     * @generated
     */
    EClass NODE_DEF = eINSTANCE.getNodeDef();

    /**
     * The meta object literal for the '<em><b>Reference Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_DEF__REFERENCE_CLASS = eINSTANCE.getNodeDef_ReferenceClass();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_DEF__LABEL = eINSTANCE.getNodeDef_Label();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.AttLinkDefImpl <em>Att Link Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.AttLinkDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttLinkDef()
     * @generated
     */
    EClass ATT_LINK_DEF = eINSTANCE.getAttLinkDef();

    /**
     * The meta object literal for the '<em><b>Reference Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATT_LINK_DEF__REFERENCE_NAME = eINSTANCE.getAttLinkDef_ReferenceName();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ElementAltImpl <em>Element Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ElementAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementAlt()
     * @generated
     */
    EClass ELEMENT_ALT = eINSTANCE.getElementAlt();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeAltImpl <em>Node Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeAlt()
     * @generated
     */
    EClass NODE_ALT = eINSTANCE.getNodeAlt();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.AttLinkAltImpl <em>Att Link Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.AttLinkAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttLinkAlt()
     * @generated
     */
    EClass ATT_LINK_ALT = eINSTANCE.getAttLinkAlt();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeElementDefImpl <em>Node Element Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeElementDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeElementDef()
     * @generated
     */
    EClass NODE_ELEMENT_DEF = eINSTANCE.getNodeElementDef();

    /**
     * The meta object literal for the '<em><b>Label Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ELEMENT_DEF__LABEL_ICON = eINSTANCE.getNodeElementDef_LabelIcon();

    /**
     * The meta object literal for the '<em><b>Label Placement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT_DEF__LABEL_PLACEMENT = eINSTANCE.getNodeElementDef_LabelPlacement();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT_DEF__SIZE = eINSTANCE.getNodeElementDef_Size();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT_DEF__FIGURE = eINSTANCE.getNodeElementDef_Figure();

    /**
     * The meta object literal for the '<em><b>Phantom N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ELEMENT_DEF__PHANTOM_N = eINSTANCE.getNodeElementDef_PhantomN();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeElementAltImpl <em>Node Element Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeElementAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeElementAlt()
     * @generated
     */
    EClass NODE_ELEMENT_ALT = eINSTANCE.getNodeElementAlt();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT_ALT__PARENT = eINSTANCE.getNodeElementAlt_Parent();

    /**
     * The meta object literal for the '<em><b>Label Placement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT_ALT__LABEL_PLACEMENT = eINSTANCE.getNodeElementAlt_LabelPlacement();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT_ALT__FIGURE = eINSTANCE.getNodeElementAlt_Figure();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT_ALT__SIZE = eINSTANCE.getNodeElementAlt_Size();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.FigureImpl <em>Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.FigureImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getFigure()
     * @generated
     */
    EClass FIGURE = eINSTANCE.getFigure();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.RegularFigureImpl <em>Regular Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.RegularFigureImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRegularFigure()
     * @generated
     */
    EClass REGULAR_FIGURE = eINSTANCE.getRegularFigure();

    /**
     * The meta object literal for the '<em><b>Figure Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGULAR_FIGURE__FIGURE_STYLE = eINSTANCE.getRegularFigure_FigureStyle();

    /**
     * The meta object literal for the '<em><b>Bacground Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGULAR_FIGURE__BACGROUND_COLOR = eINSTANCE.getRegularFigure_BacgroundColor();

    /**
     * The meta object literal for the '<em><b>Border</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGULAR_FIGURE__BORDER = eINSTANCE.getRegularFigure_Border();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_FIGURE__PATH = eINSTANCE.getRegularFigure_Path();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGULAR_FIGURE__SIZE = eINSTANCE.getRegularFigure_Size();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGULAR_FIGURE__POSITION = eINSTANCE.getRegularFigure_Position();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ImageFigureImpl <em>Image Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ImageFigureImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getImageFigure()
     * @generated
     */
    EClass IMAGE_FIGURE = eINSTANCE.getImageFigure();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_FIGURE__PATH = eINSTANCE.getImageFigure_Path();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ComplexFigureImpl <em>Complex Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ComplexFigureImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getComplexFigure()
     * @generated
     */
    EClass COMPLEX_FIGURE = eINSTANCE.getComplexFigure();

    /**
     * The meta object literal for the '<em><b>Implementation Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_FIGURE__IMPLEMENTATION_REFERENCE = eINSTANCE.getComplexFigure_ImplementationReference();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl <em>Node Link Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeLinkDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLinkDef()
     * @generated
     */
    EClass NODE_LINK_DEF = eINSTANCE.getNodeLinkDef();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINK_DEF__STYLE = eINSTANCE.getNodeLinkDef_Style();

    /**
     * The meta object literal for the '<em><b>Source Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINK_DEF__SOURCE_DECORATION = eINSTANCE.getNodeLinkDef_SourceDecoration();

    /**
     * The meta object literal for the '<em><b>Target Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINK_DEF__TARGET_DECORATION = eINSTANCE.getNodeLinkDef_TargetDecoration();

    /**
     * The meta object literal for the '<em><b>Source Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_LINK_DEF__SOURCE_REFERENCE = eINSTANCE.getNodeLinkDef_SourceReference();

    /**
     * The meta object literal for the '<em><b>Target Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_LINK_DEF__TARGET_REFERENCE = eINSTANCE.getNodeLinkDef_TargetReference();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeLinkAltImpl <em>Node Link Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeLinkAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLinkAlt()
     * @generated
     */
    EClass NODE_LINK_ALT = eINSTANCE.getNodeLinkAlt();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINK_ALT__PARENT = eINSTANCE.getNodeLinkAlt_Parent();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINK_ALT__STYLE = eINSTANCE.getNodeLinkAlt_Style();

    /**
     * The meta object literal for the '<em><b>Source Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINK_ALT__SOURCE_DECORATION = eINSTANCE.getNodeLinkAlt_SourceDecoration();

    /**
     * The meta object literal for the '<em><b>Target Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINK_ALT__TARGET_DECORATION = eINSTANCE.getNodeLinkAlt_TargetDecoration();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeLineDefImpl <em>Node Line Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeLineDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLineDef()
     * @generated
     */
    EClass NODE_LINE_DEF = eINSTANCE.getNodeLineDef();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_LINE_DEF__LABEL = eINSTANCE.getNodeLineDef_Label();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINE_DEF__STYLE = eINSTANCE.getNodeLineDef_Style();

    /**
     * The meta object literal for the '<em><b>Source Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINE_DEF__SOURCE_DECORATION = eINSTANCE.getNodeLineDef_SourceDecoration();

    /**
     * The meta object literal for the '<em><b>Target Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINE_DEF__TARGET_DECORATION = eINSTANCE.getNodeLineDef_TargetDecoration();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.NodeLineAltImpl <em>Node Line Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.NodeLineAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getNodeLineAlt()
     * @generated
     */
    EClass NODE_LINE_ALT = eINSTANCE.getNodeLineAlt();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINE_ALT__PARENT = eINSTANCE.getNodeLineAlt_Parent();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINE_ALT__STYLE = eINSTANCE.getNodeLineAlt_Style();

    /**
     * The meta object literal for the '<em><b>Source Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINE_ALT__SOURCE_DECORATION = eINSTANCE.getNodeLineAlt_SourceDecoration();

    /**
     * The meta object literal for the '<em><b>Target Decoration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LINE_ALT__TARGET_DECORATION = eINSTANCE.getNodeLineAlt_TargetDecoration();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.InterNodeDefImpl <em>Inter Node Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.InterNodeDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInterNodeDef()
     * @generated
     */
    EClass INTER_NODE_DEF = eINSTANCE.getInterNodeDef();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTER_NODE_DEF__LAYOUT = eINSTANCE.getInterNodeDef_Layout();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.InterNodeAltImpl <em>Inter Node Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.InterNodeAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInterNodeAlt()
     * @generated
     */
    EClass INTER_NODE_ALT = eINSTANCE.getInterNodeAlt();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTER_NODE_ALT__PARENT = eINSTANCE.getInterNodeAlt_Parent();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTER_NODE_ALT__LAYOUT = eINSTANCE.getInterNodeAlt_Layout();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ExternalNodeDefImpl <em>External Node Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ExternalNodeDefImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getExternalNodeDef()
     * @generated
     */
    EClass EXTERNAL_NODE_DEF = eINSTANCE.getExternalNodeDef();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_NODE_DEF__SIZE = eINSTANCE.getExternalNodeDef_Size();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ExternalNodeAltImpl <em>External Node Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ExternalNodeAltImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getExternalNodeAlt()
     * @generated
     */
    EClass EXTERNAL_NODE_ALT = eINSTANCE.getExternalNodeAlt();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_NODE_ALT__PARENT = eINSTANCE.getExternalNodeAlt_Parent();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_NODE_ALT__SIZE = eINSTANCE.getExternalNodeAlt_Size();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.RulesDefinitionImpl <em>Rules Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.RulesDefinitionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRulesDefinition()
     * @generated
     */
    EClass RULES_DEFINITION = eINSTANCE.getRulesDefinition();

    /**
     * The meta object literal for the '<em><b>Ruless</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULES_DEFINITION__RULESS = eINSTANCE.getRulesDefinition_Ruless();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.RuleImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.RuleForTypeImpl <em>Rule For Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.RuleForTypeImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRuleForType()
     * @generated
     */
    EClass RULE_FOR_TYPE = eINSTANCE.getRuleForType();

    /**
     * The meta object literal for the '<em><b>Class Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_FOR_TYPE__CLASS_REFERENCE = eINSTANCE.getRuleForType_ClassReference();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_FOR_TYPE__CASES = eINSTANCE.getRuleForType_Cases();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.RuleForReferenceImpl <em>Rule For Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.RuleForReferenceImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getRuleForReference()
     * @generated
     */
    EClass RULE_FOR_REFERENCE = eINSTANCE.getRuleForReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_FOR_REFERENCE__REFERENCE = eINSTANCE.getRuleForReference_Reference();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_FOR_REFERENCE__CASES = eINSTANCE.getRuleForReference_Cases();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.CaseTypeImpl <em>Case Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.CaseTypeImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCaseType()
     * @generated
     */
    EClass CASE_TYPE = eINSTANCE.getCaseType();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_TYPE__CONDITION = eINSTANCE.getCaseType_Condition();

    /**
     * The meta object literal for the '<em><b>Node Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_TYPE__NODE_ELEMENT = eINSTANCE.getCaseType_NodeElement();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.CaseReferenceImpl <em>Case Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.CaseReferenceImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCaseReference()
     * @generated
     */
    EClass CASE_REFERENCE = eINSTANCE.getCaseReference();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_REFERENCE__CONDITION = eINSTANCE.getCaseReference_Condition();

    /**
     * The meta object literal for the '<em><b>Reference Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_REFERENCE__REFERENCE_ELEMENT = eINSTANCE.getCaseReference_ReferenceElement();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.InteractionDefinitionImpl <em>Interaction Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.InteractionDefinitionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInteractionDefinition()
     * @generated
     */
    EClass INTERACTION_DEFINITION = eINSTANCE.getInteractionDefinition();

    /**
     * The meta object literal for the '<em><b>Interaction Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_DEFINITION__INTERACTION_ELEMENTS = eINSTANCE.getInteractionDefinition_InteractionElements();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_DEFINITION__STATEMENTS = eINSTANCE.getInteractionDefinition_Statements();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.InteractionElementImpl <em>Interaction Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.InteractionElementImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInteractionElement()
     * @generated
     */
    EClass INTERACTION_ELEMENT = eINSTANCE.getInteractionElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_ELEMENT__NAME = eINSTANCE.getInteractionElement_Name();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.WizardImpl <em>Wizard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.WizardImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getWizard()
     * @generated
     */
    EClass WIZARD = eINSTANCE.getWizard();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ElementWizardImpl <em>Element Wizard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ElementWizardImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementWizard()
     * @generated
     */
    EClass ELEMENT_WIZARD = eINSTANCE.getElementWizard();

    /**
     * The meta object literal for the '<em><b>Class Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_WIZARD__CLASS_REFERENCE = eINSTANCE.getElementWizard_ClassReference();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_WIZARD__TITLE = eINSTANCE.getElementWizard_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_WIZARD__DESCRIPTION = eINSTANCE.getElementWizard_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_WIZARD__TYPE = eINSTANCE.getElementWizard_Type();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_WIZARD__PAGES = eINSTANCE.getElementWizard_Pages();

    /**
     * The meta object literal for the '<em><b>Default Buttons</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_WIZARD__DEFAULT_BUTTONS = eINSTANCE.getElementWizard_DefaultButtons();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.PageImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__DESCRIPTION = eINSTANCE.getPage_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__ATTRIBUTES = eINSTANCE.getPage_Attributes();

    /**
     * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__REFERENCES = eINSTANCE.getPage_References();

    /**
     * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__BUTTONS = eINSTANCE.getPage_Buttons();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.AttMapImpl <em>Att Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.AttMapImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getAttMap()
     * @generated
     */
    EClass ATT_MAP = eINSTANCE.getAttMap();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_MAP__ATTRIBUTE = eINSTANCE.getAttMap_Attribute();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_MAP__LABEL = eINSTANCE.getAttMap_Label();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_MAP__COMPONENT = eINSTANCE.getAttMap_Component();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_MAP__DEFAULT_VALUE = eINSTANCE.getAttMap_DefaultValue();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ButtonImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

    /**
     * The meta object literal for the '<em><b>Method Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__METHOD_ACTION = eINSTANCE.getButton_MethodAction();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.PersonalWizardImpl <em>Personal Wizard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.PersonalWizardImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPersonalWizard()
     * @generated
     */
    EClass PERSONAL_WIZARD = eINSTANCE.getPersonalWizard();

    /**
     * The meta object literal for the '<em><b>Reference Implementation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSONAL_WIZARD__REFERENCE_IMPLEMENTATION = eINSTANCE.getPersonalWizard_ReferenceImplementation();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ViewImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Reference Implementation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__REFERENCE_IMPLEMENTATION = eINSTANCE.getView_ReferenceImplementation();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.PredefinedViewImpl <em>Predefined View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.PredefinedViewImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPredefinedView()
     * @generated
     */
    EClass PREDEFINED_VIEW = eINSTANCE.getPredefinedView();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDEFINED_VIEW__TITLE = eINSTANCE.getPredefinedView_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDEFINED_VIEW__DESCRIPTION = eINSTANCE.getPredefinedView_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDEFINED_VIEW__TYPE = eINSTANCE.getPredefinedView_Type();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDEFINED_VIEW__STYLE = eINSTANCE.getPredefinedView_Style();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ViewTypeImpl <em>View Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ViewTypeImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getViewType()
     * @generated
     */
    EClass VIEW_TYPE = eINSTANCE.getViewType();

    /**
     * The meta object literal for the '<em><b>Class Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_TYPE__CLASS_REFERENCE = eINSTANCE.getViewType_ClassReference();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ShowChildsImpl <em>Show Childs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ShowChildsImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getShowChilds()
     * @generated
     */
    EClass SHOW_CHILDS = eINSTANCE.getShowChilds();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ShowSelectionImpl <em>Show Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ShowSelectionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getShowSelection()
     * @generated
     */
    EClass SHOW_SELECTION = eINSTANCE.getShowSelection();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.CountTypesImpl <em>Count Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.CountTypesImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getCountTypes()
     * @generated
     */
    EClass COUNT_TYPES = eINSTANCE.getCountTypes();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ViewStyleImpl <em>View Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ViewStyleImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getViewStyle()
     * @generated
     */
    EClass VIEW_STYLE = eINSTANCE.getViewStyle();

    /**
     * The meta object literal for the '<em><b>Tree</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_STYLE__TREE = eINSTANCE.getViewStyle_Tree();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_STYLE__SELECTION = eINSTANCE.getViewStyle_Selection();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_STYLE__TABLE = eINSTANCE.getViewStyle_Table();

    /**
     * The meta object literal for the '<em><b>Result Graphic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_STYLE__RESULT_GRAPHIC = eINSTANCE.getViewStyle_ResultGraphic();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.PersonalViewImpl <em>Personal View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.PersonalViewImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getPersonalView()
     * @generated
     */
    EClass PERSONAL_VIEW = eINSTANCE.getPersonalView();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.StatementImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Class Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__CLASS_REFERENCE = eINSTANCE.getStatement_ClassReference();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EVENTS = eINSTANCE.getStatement_Events();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.EventImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Event Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__EVENT_TYPE = eINSTANCE.getEvent_EventType();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__INSTRUCTIONS = eINSTANCE.getEvent_Instructions();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.EventTypeImpl <em>Event Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.EventTypeImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getEventType()
     * @generated
     */
    EClass EVENT_TYPE = eINSTANCE.getEventType();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.MouseEventImpl <em>Mouse Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.MouseEventImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getMouseEvent()
     * @generated
     */
    EClass MOUSE_EVENT = eINSTANCE.getMouseEvent();

    /**
     * The meta object literal for the '<em><b>Mouse Down</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_DOWN = eINSTANCE.getMouseEvent_MouseDown();

    /**
     * The meta object literal for the '<em><b>Mouse Enter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_ENTER = eINSTANCE.getMouseEvent_MouseEnter();

    /**
     * The meta object literal for the '<em><b>Mouse Horizontal Wheel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_HORIZONTAL_WHEEL = eINSTANCE.getMouseEvent_MouseHorizontalWheel();

    /**
     * The meta object literal for the '<em><b>Mouse Up</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_UP = eINSTANCE.getMouseEvent_MouseUp();

    /**
     * The meta object literal for the '<em><b>Mouse Wheel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_WHEEL = eINSTANCE.getMouseEvent_MouseWheel();

    /**
     * The meta object literal for the '<em><b>Mouse Vertical Wheel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_VERTICAL_WHEEL = eINSTANCE.getMouseEvent_MouseVerticalWheel();

    /**
     * The meta object literal for the '<em><b>Mouse Hover</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_HOVER = eINSTANCE.getMouseEvent_MouseHover();

    /**
     * The meta object literal for the '<em><b>Mouse Exit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_EXIT = eINSTANCE.getMouseEvent_MouseExit();

    /**
     * The meta object literal for the '<em><b>Mouse Double Click</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_EVENT__MOUSE_DOUBLE_CLICK = eINSTANCE.getMouseEvent_MouseDoubleClick();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.KeyEventImpl <em>Key Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.KeyEventImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getKeyEvent()
     * @generated
     */
    EClass KEY_EVENT = eINSTANCE.getKeyEvent();

    /**
     * The meta object literal for the '<em><b>Key Press</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_EVENT__KEY_PRESS = eINSTANCE.getKeyEvent_KeyPress();

    /**
     * The meta object literal for the '<em><b>Key Up</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_EVENT__KEY_UP = eINSTANCE.getKeyEvent_KeyUp();

    /**
     * The meta object literal for the '<em><b>Key Down</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_EVENT__KEY_DOWN = eINSTANCE.getKeyEvent_KeyDown();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ElementEventImpl <em>Element Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ElementEventImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getElementEvent()
     * @generated
     */
    EClass ELEMENT_EVENT = eINSTANCE.getElementEvent();

    /**
     * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_EVENT__CREATE = eINSTANCE.getElementEvent_Create();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_EVENT__DELETE = eINSTANCE.getElementEvent_Delete();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.MenuEventImpl <em>Menu Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.MenuEventImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getMenuEvent()
     * @generated
     */
    EClass MENU_EVENT = eINSTANCE.getMenuEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_EVENT__NAME = eINSTANCE.getMenuEvent_Name();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.InstructionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.WizardStartImpl <em>Wizard Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.WizardStartImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getWizardStart()
     * @generated
     */
    EClass WIZARD_START = eINSTANCE.getWizardStart();

    /**
     * The meta object literal for the '<em><b>Wizard</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIZARD_START__WIZARD = eINSTANCE.getWizardStart_Wizard();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ViewDeployImpl <em>View Deploy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ViewDeployImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getViewDeploy()
     * @generated
     */
    EClass VIEW_DEPLOY = eINSTANCE.getViewDeploy();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_DEPLOY__VIEW = eINSTANCE.getViewDeploy_View();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.impl.ClassExecutionImpl <em>Class Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.impl.ClassExecutionImpl
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getClassExecution()
     * @generated
     */
    EClass CLASS_EXECUTION = eINSTANCE.getClassExecution();

    /**
     * The meta object literal for the '<em><b>Inplementation Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_EXECUTION__INPLEMENTATION_REFERENCE = eINSTANCE.getClassExecution_InplementationReference();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.LineType <em>Line Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.LineType
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getLineType()
     * @generated
     */
    EEnum LINE_TYPE = eINSTANCE.getLineType();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.WizardType <em>Wizard Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.WizardType
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getWizardType()
     * @generated
     */
    EEnum WIZARD_TYPE = eINSTANCE.getWizardType();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.enar.picture.ComponentType <em>Component Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.enar.picture.ComponentType
     * @see co.edu.uniandes.enar.picture.impl.PicturePackageImpl#getComponentType()
     * @generated
     */
    EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

  }

} //PicturePackage
