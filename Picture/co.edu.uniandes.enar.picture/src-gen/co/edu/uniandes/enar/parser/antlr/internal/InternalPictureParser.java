package co.edu.uniandes.enar.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.enar.services.PictureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPictureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'Graphical'", "'representation'", "'{'", "'reference'", "'package'", "'}'", "'.'", "'class'", "'root'", "'Palette for'", "'Tool group'", "'description'", "'Creation button for'", "'name'", "'icon'", "'Style definition'", "'Line style'", "'width'", "'type'", "'color'", "'none'", "'arrow'", "'rhomb'", "'filled'", "'square'", "'closed'", "'Custom line decoration'", "'Color'", "'('", "', '", "')'", "'list'", "'layout'", "'default'", "'custom'", "'implementation reference'", "'Rounded'", "'radiox'", "'radioy'", "'Regular polygon'", "'vertex quantity'", "'start angle'", "'Ellipse'", "'proportion'", "'Custom figure'", "'Point'", "'internal'", "'external'", "'true'", "'false'", "'definition'", "'Node_element'", "'for'", "'label'", "'placement'", "'size'", "'phantom'", "'extends'", "'Regular figure extends'", "'background color'", "'border'", "'path'", "'position'", "'Image figure'", "'image path'", "'Complex figure'", "'Node_link'", "'style'", "'source'", "'decoration'", "'target'", "'<-'", "'Node_line'", "'Internal_node'", "'External_node'", "'Rules definition'", "'Rules for'", "'case'", "'use'", "'Interaction definition'", "'Interaction elements'", "'Statements'", "'Wizard'", "'context'", "'title'", "'pages'", "'buttons'", "'Page'", "'Attributes to show'", "'References to show'", "'Additional buttons'", "'Button'", "'Personal'", "'wizard'", "'View'", "'data'", "'provider'", "'Show'", "'childs'", "'parent element'", "'selection'", "'filter type'", "'Count'", "'types'", "'tree'", "'table'", "'graphic'", "'Personal view'", "'Actions for type'", "'on'", "'do'", "'mouse'", "'down'", "'enter'", "'horizontal'", "'wheel'", "'up'", "'vertical'", "'hover'", "'exit'", "'double'", "'click'", "'key'", "'press'", "'create'", "'delete'", "'Menu event'", "'show'", "'view'", "'execute'", "'solid'", "'dash'", "'dot'", "'dashdot'", "'dashdotdot'", "'edit'", "'info'", "'textField'", "'textArea'", "'checkBox'", "'comboBox'", "'Slider'", "'File'", "'Image'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalPictureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPictureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPictureParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g"; }



     	private PictureGrammarAccess grammarAccess;
     	
        public InternalPictureParser(TokenStream input, PictureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PictureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:77:1: ruleModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) ) ( (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_graphicalREpresentation_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:80:28: ( ( () ( (lv_imports_1_0= ruleImport ) ) ( (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:81:1: ( () ( (lv_imports_1_0= ruleImport ) ) ( (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:81:1: ( () ( (lv_imports_1_0= ruleImport ) ) ( (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:81:2: () ( (lv_imports_1_0= ruleImport ) ) ( (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:81:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:87:2: ( (lv_imports_1_0= ruleImport ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:88:1: (lv_imports_1_0= ruleImport )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:88:1: (lv_imports_1_0= ruleImport )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:89:3: lv_imports_1_0= ruleImport
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImport_in_ruleModel140);
            lv_imports_1_0=ruleImport();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"imports",
                    		lv_imports_1_0, 
                    		"Import");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:105:2: ( (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:106:1: (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:106:1: (lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:107:3: lv_graphicalREpresentation_2_0= ruleGraphicalRepresentation
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getGraphicalREpresentationGraphicalRepresentationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGraphicalRepresentation_in_ruleModel161);
            lv_graphicalREpresentation_2_0=ruleGraphicalRepresentation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"graphicalREpresentation",
                    		lv_graphicalREpresentation_2_0, 
                    		"GraphicalRepresentation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:131:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:132:2: (iv_ruleImport= ruleImport EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:133:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport197);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport207); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:140:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importedNamespace_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:143:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:144:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:144:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:144:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport244); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:148:1: ( (lv_importedNamespace_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:149:1: (lv_importedNamespace_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:149:1: (lv_importedNamespace_1_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:150:3: lv_importedNamespace_1_0= RULE_STRING
            {
            lv_importedNamespace_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport261); 

            			newLeafNode(lv_importedNamespace_1_0, grammarAccess.getImportAccess().getImportedNamespaceSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImport278); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:170:1: ( (lv_name_3_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:171:1: (lv_name_3_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:171:1: (lv_name_3_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:172:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport295); 

            			newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleGraphicalRepresentation"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:196:1: entryRuleGraphicalRepresentation returns [EObject current=null] : iv_ruleGraphicalRepresentation= ruleGraphicalRepresentation EOF ;
    public final EObject entryRuleGraphicalRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalRepresentation = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:197:2: (iv_ruleGraphicalRepresentation= ruleGraphicalRepresentation EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:198:2: iv_ruleGraphicalRepresentation= ruleGraphicalRepresentation EOF
            {
             newCompositeNode(grammarAccess.getGraphicalRepresentationRule()); 
            pushFollow(FOLLOW_ruleGraphicalRepresentation_in_entryRuleGraphicalRepresentation336);
            iv_ruleGraphicalRepresentation=ruleGraphicalRepresentation();

            state._fsp--;

             current =iv_ruleGraphicalRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphicalRepresentation346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphicalRepresentation"


    // $ANTLR start "ruleGraphicalRepresentation"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:205:1: ruleGraphicalRepresentation returns [EObject current=null] : (otherlv_0= 'Graphical' otherlv_1= 'representation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reference' otherlv_5= 'package' ( (lv_referencePackage_6_0= ruleQualifiedName ) ) )? ( (lv_root_7_0= ruleROOT ) ) ( (lv_toolsDefinition_8_0= ruleToolDefinition ) ) ( (lv_styleDefinition_9_0= ruleStyleDefinition ) ) ( (lv_graphicalDefinition_10_0= ruleGraphicalDefinition ) ) ( (lv_rulesDefinition_11_0= ruleRulesDefinition ) ) ( (lv_interactionDefinition_12_0= ruleInteractionDefinition ) ) otherlv_13= '}' ) ;
    public final EObject ruleGraphicalRepresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_referencePackage_6_0 = null;

        EObject lv_root_7_0 = null;

        EObject lv_toolsDefinition_8_0 = null;

        EObject lv_styleDefinition_9_0 = null;

        EObject lv_graphicalDefinition_10_0 = null;

        EObject lv_rulesDefinition_11_0 = null;

        EObject lv_interactionDefinition_12_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:208:28: ( (otherlv_0= 'Graphical' otherlv_1= 'representation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reference' otherlv_5= 'package' ( (lv_referencePackage_6_0= ruleQualifiedName ) ) )? ( (lv_root_7_0= ruleROOT ) ) ( (lv_toolsDefinition_8_0= ruleToolDefinition ) ) ( (lv_styleDefinition_9_0= ruleStyleDefinition ) ) ( (lv_graphicalDefinition_10_0= ruleGraphicalDefinition ) ) ( (lv_rulesDefinition_11_0= ruleRulesDefinition ) ) ( (lv_interactionDefinition_12_0= ruleInteractionDefinition ) ) otherlv_13= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:209:1: (otherlv_0= 'Graphical' otherlv_1= 'representation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reference' otherlv_5= 'package' ( (lv_referencePackage_6_0= ruleQualifiedName ) ) )? ( (lv_root_7_0= ruleROOT ) ) ( (lv_toolsDefinition_8_0= ruleToolDefinition ) ) ( (lv_styleDefinition_9_0= ruleStyleDefinition ) ) ( (lv_graphicalDefinition_10_0= ruleGraphicalDefinition ) ) ( (lv_rulesDefinition_11_0= ruleRulesDefinition ) ) ( (lv_interactionDefinition_12_0= ruleInteractionDefinition ) ) otherlv_13= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:209:1: (otherlv_0= 'Graphical' otherlv_1= 'representation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reference' otherlv_5= 'package' ( (lv_referencePackage_6_0= ruleQualifiedName ) ) )? ( (lv_root_7_0= ruleROOT ) ) ( (lv_toolsDefinition_8_0= ruleToolDefinition ) ) ( (lv_styleDefinition_9_0= ruleStyleDefinition ) ) ( (lv_graphicalDefinition_10_0= ruleGraphicalDefinition ) ) ( (lv_rulesDefinition_11_0= ruleRulesDefinition ) ) ( (lv_interactionDefinition_12_0= ruleInteractionDefinition ) ) otherlv_13= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:209:3: otherlv_0= 'Graphical' otherlv_1= 'representation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reference' otherlv_5= 'package' ( (lv_referencePackage_6_0= ruleQualifiedName ) ) )? ( (lv_root_7_0= ruleROOT ) ) ( (lv_toolsDefinition_8_0= ruleToolDefinition ) ) ( (lv_styleDefinition_9_0= ruleStyleDefinition ) ) ( (lv_graphicalDefinition_10_0= ruleGraphicalDefinition ) ) ( (lv_rulesDefinition_11_0= ruleRulesDefinition ) ) ( (lv_interactionDefinition_12_0= ruleInteractionDefinition ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGraphicalRepresentation383); 

                	newLeafNode(otherlv_0, grammarAccess.getGraphicalRepresentationAccess().getGraphicalKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleGraphicalRepresentation395); 

                	newLeafNode(otherlv_1, grammarAccess.getGraphicalRepresentationAccess().getRepresentationKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:217:1: ( (lv_name_2_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:218:1: (lv_name_2_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:218:1: (lv_name_2_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:219:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGraphicalRepresentation412); 

            			newLeafNode(lv_name_2_0, grammarAccess.getGraphicalRepresentationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGraphicalRepresentationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleGraphicalRepresentation429); 

                	newLeafNode(otherlv_3, grammarAccess.getGraphicalRepresentationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:239:1: (otherlv_4= 'reference' otherlv_5= 'package' ( (lv_referencePackage_6_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:239:3: otherlv_4= 'reference' otherlv_5= 'package' ( (lv_referencePackage_6_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleGraphicalRepresentation442); 

                        	newLeafNode(otherlv_4, grammarAccess.getGraphicalRepresentationAccess().getReferenceKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleGraphicalRepresentation454); 

                        	newLeafNode(otherlv_5, grammarAccess.getGraphicalRepresentationAccess().getPackageKeyword_4_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:247:1: ( (lv_referencePackage_6_0= ruleQualifiedName ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:248:1: (lv_referencePackage_6_0= ruleQualifiedName )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:248:1: (lv_referencePackage_6_0= ruleQualifiedName )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:249:3: lv_referencePackage_6_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getGraphicalRepresentationAccess().getReferencePackageQualifiedNameParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleGraphicalRepresentation475);
                    lv_referencePackage_6_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGraphicalRepresentationRule());
                    	        }
                           		set(
                           			current, 
                           			"referencePackage",
                            		lv_referencePackage_6_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:265:4: ( (lv_root_7_0= ruleROOT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:266:1: (lv_root_7_0= ruleROOT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:266:1: (lv_root_7_0= ruleROOT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:267:3: lv_root_7_0= ruleROOT
            {
             
            	        newCompositeNode(grammarAccess.getGraphicalRepresentationAccess().getRootROOTParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleROOT_in_ruleGraphicalRepresentation498);
            lv_root_7_0=ruleROOT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphicalRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_7_0, 
                    		"ROOT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:283:2: ( (lv_toolsDefinition_8_0= ruleToolDefinition ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:284:1: (lv_toolsDefinition_8_0= ruleToolDefinition )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:284:1: (lv_toolsDefinition_8_0= ruleToolDefinition )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:285:3: lv_toolsDefinition_8_0= ruleToolDefinition
            {
             
            	        newCompositeNode(grammarAccess.getGraphicalRepresentationAccess().getToolsDefinitionToolDefinitionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleToolDefinition_in_ruleGraphicalRepresentation519);
            lv_toolsDefinition_8_0=ruleToolDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphicalRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"toolsDefinition",
                    		lv_toolsDefinition_8_0, 
                    		"ToolDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:301:2: ( (lv_styleDefinition_9_0= ruleStyleDefinition ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:302:1: (lv_styleDefinition_9_0= ruleStyleDefinition )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:302:1: (lv_styleDefinition_9_0= ruleStyleDefinition )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:303:3: lv_styleDefinition_9_0= ruleStyleDefinition
            {
             
            	        newCompositeNode(grammarAccess.getGraphicalRepresentationAccess().getStyleDefinitionStyleDefinitionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleStyleDefinition_in_ruleGraphicalRepresentation540);
            lv_styleDefinition_9_0=ruleStyleDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphicalRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"styleDefinition",
                    		lv_styleDefinition_9_0, 
                    		"StyleDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:319:2: ( (lv_graphicalDefinition_10_0= ruleGraphicalDefinition ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:320:1: (lv_graphicalDefinition_10_0= ruleGraphicalDefinition )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:320:1: (lv_graphicalDefinition_10_0= ruleGraphicalDefinition )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:321:3: lv_graphicalDefinition_10_0= ruleGraphicalDefinition
            {
             
            	        newCompositeNode(grammarAccess.getGraphicalRepresentationAccess().getGraphicalDefinitionGraphicalDefinitionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleGraphicalDefinition_in_ruleGraphicalRepresentation561);
            lv_graphicalDefinition_10_0=ruleGraphicalDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphicalRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"graphicalDefinition",
                    		lv_graphicalDefinition_10_0, 
                    		"GraphicalDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:337:2: ( (lv_rulesDefinition_11_0= ruleRulesDefinition ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:338:1: (lv_rulesDefinition_11_0= ruleRulesDefinition )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:338:1: (lv_rulesDefinition_11_0= ruleRulesDefinition )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:339:3: lv_rulesDefinition_11_0= ruleRulesDefinition
            {
             
            	        newCompositeNode(grammarAccess.getGraphicalRepresentationAccess().getRulesDefinitionRulesDefinitionParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleRulesDefinition_in_ruleGraphicalRepresentation582);
            lv_rulesDefinition_11_0=ruleRulesDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphicalRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"rulesDefinition",
                    		lv_rulesDefinition_11_0, 
                    		"RulesDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:355:2: ( (lv_interactionDefinition_12_0= ruleInteractionDefinition ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:356:1: (lv_interactionDefinition_12_0= ruleInteractionDefinition )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:356:1: (lv_interactionDefinition_12_0= ruleInteractionDefinition )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:357:3: lv_interactionDefinition_12_0= ruleInteractionDefinition
            {
             
            	        newCompositeNode(grammarAccess.getGraphicalRepresentationAccess().getInteractionDefinitionInteractionDefinitionParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleInteractionDefinition_in_ruleGraphicalRepresentation603);
            lv_interactionDefinition_12_0=ruleInteractionDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphicalRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"interactionDefinition",
                    		lv_interactionDefinition_12_0, 
                    		"InteractionDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleGraphicalRepresentation615); 

                	newLeafNode(otherlv_13, grammarAccess.getGraphicalRepresentationAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphicalRepresentation"


    // $ANTLR start "entryRuleQualifiedName"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:385:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:386:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:387:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName652);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName663); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:394:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:397:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:398:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:398:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:398:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName703); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:405:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:406:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedName722); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName737); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleClassReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:428:1: entryRuleClassReference returns [EObject current=null] : iv_ruleClassReference= ruleClassReference EOF ;
    public final EObject entryRuleClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassReference = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:429:2: (iv_ruleClassReference= ruleClassReference EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:430:2: iv_ruleClassReference= ruleClassReference EOF
            {
             newCompositeNode(grammarAccess.getClassReferenceRule()); 
            pushFollow(FOLLOW_ruleClassReference_in_entryRuleClassReference786);
            iv_ruleClassReference=ruleClassReference();

            state._fsp--;

             current =iv_ruleClassReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassReference796); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassReference"


    // $ANTLR start "ruleClassReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:437:1: ruleClassReference returns [EObject current=null] : (otherlv_0= 'class' ( (lv_class_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleClassReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_class_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:440:28: ( (otherlv_0= 'class' ( (lv_class_1_0= ruleQualifiedName ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:441:1: (otherlv_0= 'class' ( (lv_class_1_0= ruleQualifiedName ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:441:1: (otherlv_0= 'class' ( (lv_class_1_0= ruleQualifiedName ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:441:3: otherlv_0= 'class' ( (lv_class_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleClassReference833); 

                	newLeafNode(otherlv_0, grammarAccess.getClassReferenceAccess().getClassKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:445:1: ( (lv_class_1_0= ruleQualifiedName ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:446:1: (lv_class_1_0= ruleQualifiedName )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:446:1: (lv_class_1_0= ruleQualifiedName )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:447:3: lv_class_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getClassReferenceAccess().getClassQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleClassReference854);
            lv_class_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassReference"


    // $ANTLR start "entryRuleAttReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:471:1: entryRuleAttReference returns [EObject current=null] : iv_ruleAttReference= ruleAttReference EOF ;
    public final EObject entryRuleAttReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttReference = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:472:2: (iv_ruleAttReference= ruleAttReference EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:473:2: iv_ruleAttReference= ruleAttReference EOF
            {
             newCompositeNode(grammarAccess.getAttReferenceRule()); 
            pushFollow(FOLLOW_ruleAttReference_in_entryRuleAttReference890);
            iv_ruleAttReference=ruleAttReference();

            state._fsp--;

             current =iv_ruleAttReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttReference900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttReference"


    // $ANTLR start "ruleAttReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:480:1: ruleAttReference returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_class_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleAttReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_class_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:483:28: ( (otherlv_0= 'reference' ( (lv_class_1_0= ruleQualifiedName ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:484:1: (otherlv_0= 'reference' ( (lv_class_1_0= ruleQualifiedName ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:484:1: (otherlv_0= 'reference' ( (lv_class_1_0= ruleQualifiedName ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:484:3: otherlv_0= 'reference' ( (lv_class_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAttReference937); 

                	newLeafNode(otherlv_0, grammarAccess.getAttReferenceAccess().getReferenceKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:488:1: ( (lv_class_1_0= ruleQualifiedName ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:489:1: (lv_class_1_0= ruleQualifiedName )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:489:1: (lv_class_1_0= ruleQualifiedName )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:490:3: lv_class_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAttReferenceAccess().getClassQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttReference958);
            lv_class_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttReference"


    // $ANTLR start "entryRuleROOT"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:514:1: entryRuleROOT returns [EObject current=null] : iv_ruleROOT= ruleROOT EOF ;
    public final EObject entryRuleROOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleROOT = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:515:2: (iv_ruleROOT= ruleROOT EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:516:2: iv_ruleROOT= ruleROOT EOF
            {
             newCompositeNode(grammarAccess.getROOTRule()); 
            pushFollow(FOLLOW_ruleROOT_in_entryRuleROOT994);
            iv_ruleROOT=ruleROOT();

            state._fsp--;

             current =iv_ruleROOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleROOT1004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleROOT"


    // $ANTLR start "ruleROOT"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:523:1: ruleROOT returns [EObject current=null] : (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleROOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:526:28: ( (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:527:1: (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:527:1: (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:527:3: otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleROOT1041); 

                	newLeafNode(otherlv_0, grammarAccess.getROOTAccess().getRootKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:531:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:532:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:532:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:533:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleROOT1058); 

            			newLeafNode(lv_name_1_0, grammarAccess.getROOTAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getROOTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleROOT"


    // $ANTLR start "entryRuleToolDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:557:1: entryRuleToolDefinition returns [EObject current=null] : iv_ruleToolDefinition= ruleToolDefinition EOF ;
    public final EObject entryRuleToolDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolDefinition = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:558:2: (iv_ruleToolDefinition= ruleToolDefinition EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:559:2: iv_ruleToolDefinition= ruleToolDefinition EOF
            {
             newCompositeNode(grammarAccess.getToolDefinitionRule()); 
            pushFollow(FOLLOW_ruleToolDefinition_in_entryRuleToolDefinition1099);
            iv_ruleToolDefinition=ruleToolDefinition();

            state._fsp--;

             current =iv_ruleToolDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToolDefinition1109); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToolDefinition"


    // $ANTLR start "ruleToolDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:566:1: ruleToolDefinition returns [EObject current=null] : ( () otherlv_1= 'Palette for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_toolGroups_4_0= ruleToolGroup ) )+ otherlv_5= '}' ) ;
    public final EObject ruleToolDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_toolGroups_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:569:28: ( ( () otherlv_1= 'Palette for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_toolGroups_4_0= ruleToolGroup ) )+ otherlv_5= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:570:1: ( () otherlv_1= 'Palette for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_toolGroups_4_0= ruleToolGroup ) )+ otherlv_5= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:570:1: ( () otherlv_1= 'Palette for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_toolGroups_4_0= ruleToolGroup ) )+ otherlv_5= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:570:2: () otherlv_1= 'Palette for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_toolGroups_4_0= ruleToolGroup ) )+ otherlv_5= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:570:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:571:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getToolDefinitionAccess().getToolDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleToolDefinition1155); 

                	newLeafNode(otherlv_1, grammarAccess.getToolDefinitionAccess().getPaletteForKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:580:1: ( (otherlv_2= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:581:1: (otherlv_2= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:581:1: (otherlv_2= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:582:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getToolDefinitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToolDefinition1175); 

            		newLeafNode(otherlv_2, grammarAccess.getToolDefinitionAccess().getNameROOTCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleToolDefinition1187); 

                	newLeafNode(otherlv_3, grammarAccess.getToolDefinitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:597:1: ( (lv_toolGroups_4_0= ruleToolGroup ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:598:1: (lv_toolGroups_4_0= ruleToolGroup )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:598:1: (lv_toolGroups_4_0= ruleToolGroup )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:599:3: lv_toolGroups_4_0= ruleToolGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getToolDefinitionAccess().getToolGroupsToolGroupParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleToolGroup_in_ruleToolDefinition1208);
            	    lv_toolGroups_4_0=ruleToolGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getToolDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"toolGroups",
            	            		lv_toolGroups_4_0, 
            	            		"ToolGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleToolDefinition1221); 

                	newLeafNode(otherlv_5, grammarAccess.getToolDefinitionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToolDefinition"


    // $ANTLR start "entryRuleToolGroup"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:627:1: entryRuleToolGroup returns [EObject current=null] : iv_ruleToolGroup= ruleToolGroup EOF ;
    public final EObject entryRuleToolGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolGroup = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:628:2: (iv_ruleToolGroup= ruleToolGroup EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:629:2: iv_ruleToolGroup= ruleToolGroup EOF
            {
             newCompositeNode(grammarAccess.getToolGroupRule()); 
            pushFollow(FOLLOW_ruleToolGroup_in_entryRuleToolGroup1257);
            iv_ruleToolGroup=ruleToolGroup();

            state._fsp--;

             current =iv_ruleToolGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToolGroup1267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToolGroup"


    // $ANTLR start "ruleToolGroup"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:636:1: ruleToolGroup returns [EObject current=null] : (otherlv_0= 'Tool group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_toolGroups_5_0= ruleToolGroup ) )* ( (lv_buttons_6_0= ruleCreationButton ) )* otherlv_7= '}' ) ;
    public final EObject ruleToolGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_7=null;
        EObject lv_toolGroups_5_0 = null;

        EObject lv_buttons_6_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:639:28: ( (otherlv_0= 'Tool group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_toolGroups_5_0= ruleToolGroup ) )* ( (lv_buttons_6_0= ruleCreationButton ) )* otherlv_7= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:640:1: (otherlv_0= 'Tool group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_toolGroups_5_0= ruleToolGroup ) )* ( (lv_buttons_6_0= ruleCreationButton ) )* otherlv_7= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:640:1: (otherlv_0= 'Tool group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_toolGroups_5_0= ruleToolGroup ) )* ( (lv_buttons_6_0= ruleCreationButton ) )* otherlv_7= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:640:3: otherlv_0= 'Tool group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_toolGroups_5_0= ruleToolGroup ) )* ( (lv_buttons_6_0= ruleCreationButton ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleToolGroup1304); 

                	newLeafNode(otherlv_0, grammarAccess.getToolGroupAccess().getToolGroupKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:644:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:645:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:645:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:646:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToolGroup1321); 

            			newLeafNode(lv_name_1_0, grammarAccess.getToolGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getToolGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleToolGroup1338); 

                	newLeafNode(otherlv_2, grammarAccess.getToolGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleToolGroup1350); 

                	newLeafNode(otherlv_3, grammarAccess.getToolGroupAccess().getDescriptionKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:670:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:671:1: (lv_description_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:671:1: (lv_description_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:672:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleToolGroup1367); 

            			newLeafNode(lv_description_4_0, grammarAccess.getToolGroupAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getToolGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:688:2: ( (lv_toolGroups_5_0= ruleToolGroup ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:689:1: (lv_toolGroups_5_0= ruleToolGroup )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:689:1: (lv_toolGroups_5_0= ruleToolGroup )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:690:3: lv_toolGroups_5_0= ruleToolGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getToolGroupAccess().getToolGroupsToolGroupParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleToolGroup_in_ruleToolGroup1393);
            	    lv_toolGroups_5_0=ruleToolGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getToolGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"toolGroups",
            	            		lv_toolGroups_5_0, 
            	            		"ToolGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:706:3: ( (lv_buttons_6_0= ruleCreationButton ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:707:1: (lv_buttons_6_0= ruleCreationButton )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:707:1: (lv_buttons_6_0= ruleCreationButton )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:708:3: lv_buttons_6_0= ruleCreationButton
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getToolGroupAccess().getButtonsCreationButtonParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCreationButton_in_ruleToolGroup1415);
            	    lv_buttons_6_0=ruleCreationButton();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getToolGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"buttons",
            	            		lv_buttons_6_0, 
            	            		"CreationButton");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleToolGroup1428); 

                	newLeafNode(otherlv_7, grammarAccess.getToolGroupAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToolGroup"


    // $ANTLR start "entryRuleCreationButton"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:736:1: entryRuleCreationButton returns [EObject current=null] : iv_ruleCreationButton= ruleCreationButton EOF ;
    public final EObject entryRuleCreationButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreationButton = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:737:2: (iv_ruleCreationButton= ruleCreationButton EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:738:2: iv_ruleCreationButton= ruleCreationButton EOF
            {
             newCompositeNode(grammarAccess.getCreationButtonRule()); 
            pushFollow(FOLLOW_ruleCreationButton_in_entryRuleCreationButton1464);
            iv_ruleCreationButton=ruleCreationButton();

            state._fsp--;

             current =iv_ruleCreationButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreationButton1474); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreationButton"


    // $ANTLR start "ruleCreationButton"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:745:1: ruleCreationButton returns [EObject current=null] : ( () otherlv_1= 'Creation button for' ( (lv_metaConceptReference_2_0= ruleClassReference ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'icon' ( (lv_icon_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
    public final EObject ruleCreationButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_icon_9_0=null;
        Token otherlv_10=null;
        EObject lv_metaConceptReference_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:748:28: ( ( () otherlv_1= 'Creation button for' ( (lv_metaConceptReference_2_0= ruleClassReference ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'icon' ( (lv_icon_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:749:1: ( () otherlv_1= 'Creation button for' ( (lv_metaConceptReference_2_0= ruleClassReference ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'icon' ( (lv_icon_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:749:1: ( () otherlv_1= 'Creation button for' ( (lv_metaConceptReference_2_0= ruleClassReference ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'icon' ( (lv_icon_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:749:2: () otherlv_1= 'Creation button for' ( (lv_metaConceptReference_2_0= ruleClassReference ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'icon' ( (lv_icon_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:749:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:750:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCreationButtonAccess().getCreationButtonAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCreationButton1520); 

                	newLeafNode(otherlv_1, grammarAccess.getCreationButtonAccess().getCreationButtonForKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:759:1: ( (lv_metaConceptReference_2_0= ruleClassReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:760:1: (lv_metaConceptReference_2_0= ruleClassReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:760:1: (lv_metaConceptReference_2_0= ruleClassReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:761:3: lv_metaConceptReference_2_0= ruleClassReference
            {
             
            	        newCompositeNode(grammarAccess.getCreationButtonAccess().getMetaConceptReferenceClassReferenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClassReference_in_ruleCreationButton1541);
            lv_metaConceptReference_2_0=ruleClassReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCreationButtonRule());
            	        }
                   		set(
                   			current, 
                   			"metaConceptReference",
                    		lv_metaConceptReference_2_0, 
                    		"ClassReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCreationButton1553); 

                	newLeafNode(otherlv_3, grammarAccess.getCreationButtonAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleCreationButton1565); 

                	newLeafNode(otherlv_4, grammarAccess.getCreationButtonAccess().getNameKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:785:1: ( (lv_name_5_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:786:1: (lv_name_5_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:786:1: (lv_name_5_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:787:3: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreationButton1582); 

            			newLeafNode(lv_name_5_0, grammarAccess.getCreationButtonAccess().getNameSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreationButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleCreationButton1599); 

                	newLeafNode(otherlv_6, grammarAccess.getCreationButtonAccess().getDescriptionKeyword_6());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:807:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:808:1: (lv_description_7_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:808:1: (lv_description_7_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:809:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreationButton1616); 

            			newLeafNode(lv_description_7_0, grammarAccess.getCreationButtonAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreationButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleCreationButton1633); 

                	newLeafNode(otherlv_8, grammarAccess.getCreationButtonAccess().getIconKeyword_8());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:829:1: ( (lv_icon_9_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:830:1: (lv_icon_9_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:830:1: (lv_icon_9_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:831:3: lv_icon_9_0= RULE_STRING
            {
            lv_icon_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreationButton1650); 

            			newLeafNode(lv_icon_9_0, grammarAccess.getCreationButtonAccess().getIconSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreationButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"icon",
                    		lv_icon_9_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleCreationButton1667); 

                	newLeafNode(otherlv_10, grammarAccess.getCreationButtonAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreationButton"


    // $ANTLR start "entryRuleStyleDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:859:1: entryRuleStyleDefinition returns [EObject current=null] : iv_ruleStyleDefinition= ruleStyleDefinition EOF ;
    public final EObject entryRuleStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleDefinition = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:860:2: (iv_ruleStyleDefinition= ruleStyleDefinition EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:861:2: iv_ruleStyleDefinition= ruleStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleStyleDefinition_in_entryRuleStyleDefinition1703);
            iv_ruleStyleDefinition=ruleStyleDefinition();

            state._fsp--;

             current =iv_ruleStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyleDefinition1713); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyleDefinition"


    // $ANTLR start "ruleStyleDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:868:1: ruleStyleDefinition returns [EObject current=null] : ( () otherlv_1= 'Style definition' otherlv_2= '{' ( (lv_styleElements_3_0= ruleStyleElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_styleElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:871:28: ( ( () otherlv_1= 'Style definition' otherlv_2= '{' ( (lv_styleElements_3_0= ruleStyleElement ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:872:1: ( () otherlv_1= 'Style definition' otherlv_2= '{' ( (lv_styleElements_3_0= ruleStyleElement ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:872:1: ( () otherlv_1= 'Style definition' otherlv_2= '{' ( (lv_styleElements_3_0= ruleStyleElement ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:872:2: () otherlv_1= 'Style definition' otherlv_2= '{' ( (lv_styleElements_3_0= ruleStyleElement ) )* otherlv_4= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:872:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:873:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStyleDefinitionAccess().getStyleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleStyleDefinition1759); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleDefinitionAccess().getStyleDefinitionKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStyleDefinition1771); 

                	newLeafNode(otherlv_2, grammarAccess.getStyleDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:886:1: ( (lv_styleElements_3_0= ruleStyleElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29||(LA6_0>=33 && LA6_0<=40)||LA6_0==49||LA6_0==52||LA6_0==55||LA6_0==57) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:887:1: (lv_styleElements_3_0= ruleStyleElement )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:887:1: (lv_styleElements_3_0= ruleStyleElement )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:888:3: lv_styleElements_3_0= ruleStyleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStyleDefinitionAccess().getStyleElementsStyleElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyleElement_in_ruleStyleDefinition1792);
            	    lv_styleElements_3_0=ruleStyleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStyleDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"styleElements",
            	            		lv_styleElements_3_0, 
            	            		"StyleElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStyleDefinition1805); 

                	newLeafNode(otherlv_4, grammarAccess.getStyleDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyleDefinition"


    // $ANTLR start "entryRuleStyleElement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:916:1: entryRuleStyleElement returns [EObject current=null] : iv_ruleStyleElement= ruleStyleElement EOF ;
    public final EObject entryRuleStyleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleElement = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:917:2: (iv_ruleStyleElement= ruleStyleElement EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:918:2: iv_ruleStyleElement= ruleStyleElement EOF
            {
             newCompositeNode(grammarAccess.getStyleElementRule()); 
            pushFollow(FOLLOW_ruleStyleElement_in_entryRuleStyleElement1841);
            iv_ruleStyleElement=ruleStyleElement();

            state._fsp--;

             current =iv_ruleStyleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyleElement1851); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyleElement"


    // $ANTLR start "ruleStyleElement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:925:1: ruleStyleElement returns [EObject current=null] : (this_LineStyle_0= ruleLineStyle | this_Color_1= ruleColor | this_LineDecoration_2= ruleLineDecoration | this_FigureStyle_3= ruleFigureStyle ) ;
    public final EObject ruleStyleElement() throws RecognitionException {
        EObject current = null;

        EObject this_LineStyle_0 = null;

        EObject this_Color_1 = null;

        EObject this_LineDecoration_2 = null;

        EObject this_FigureStyle_3 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:928:28: ( (this_LineStyle_0= ruleLineStyle | this_Color_1= ruleColor | this_LineDecoration_2= ruleLineDecoration | this_FigureStyle_3= ruleFigureStyle ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:929:1: (this_LineStyle_0= ruleLineStyle | this_Color_1= ruleColor | this_LineDecoration_2= ruleLineDecoration | this_FigureStyle_3= ruleFigureStyle )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:929:1: (this_LineStyle_0= ruleLineStyle | this_Color_1= ruleColor | this_LineDecoration_2= ruleLineDecoration | this_FigureStyle_3= ruleFigureStyle )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 40:
                {
                alt7=2;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt7=3;
                }
                break;
            case 49:
            case 52:
            case 55:
            case 57:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:930:5: this_LineStyle_0= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleElementAccess().getLineStyleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleStyleElement1898);
                    this_LineStyle_0=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:940:5: this_Color_1= ruleColor
                    {
                     
                            newCompositeNode(grammarAccess.getStyleElementAccess().getColorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleColor_in_ruleStyleElement1925);
                    this_Color_1=ruleColor();

                    state._fsp--;

                     
                            current = this_Color_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:950:5: this_LineDecoration_2= ruleLineDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getStyleElementAccess().getLineDecorationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLineDecoration_in_ruleStyleElement1952);
                    this_LineDecoration_2=ruleLineDecoration();

                    state._fsp--;

                     
                            current = this_LineDecoration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:960:5: this_FigureStyle_3= ruleFigureStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleElementAccess().getFigureStyleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFigureStyle_in_ruleStyleElement1979);
                    this_FigureStyle_3=ruleFigureStyle();

                    state._fsp--;

                     
                            current = this_FigureStyle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyleElement"


    // $ANTLR start "entryRuleLineStyle"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:976:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:977:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:978:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_ruleLineStyle_in_entryRuleLineStyle2014);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineStyle2024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineStyle"


    // $ANTLR start "ruleLineStyle"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:985:1: ruleLineStyle returns [EObject current=null] : (otherlv_0= 'Line style' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'type' ( (lv_lineType_6_0= ruleLineType ) ) otherlv_7= 'color' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_lineType_6_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:988:28: ( (otherlv_0= 'Line style' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'type' ( (lv_lineType_6_0= ruleLineType ) ) otherlv_7= 'color' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:989:1: (otherlv_0= 'Line style' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'type' ( (lv_lineType_6_0= ruleLineType ) ) otherlv_7= 'color' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:989:1: (otherlv_0= 'Line style' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'type' ( (lv_lineType_6_0= ruleLineType ) ) otherlv_7= 'color' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:989:3: otherlv_0= 'Line style' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'type' ( (lv_lineType_6_0= ruleLineType ) ) otherlv_7= 'color' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleLineStyle2061); 

                	newLeafNode(otherlv_0, grammarAccess.getLineStyleAccess().getLineStyleKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:993:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:994:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:994:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:995:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLineStyle2078); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLineStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLineStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLineStyle2095); 

                	newLeafNode(otherlv_2, grammarAccess.getLineStyleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleLineStyle2107); 

                	newLeafNode(otherlv_3, grammarAccess.getLineStyleAccess().getWidthKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1019:1: ( (lv_width_4_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1020:1: (lv_width_4_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1020:1: (lv_width_4_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1021:3: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLineStyle2124); 

            			newLeafNode(lv_width_4_0, grammarAccess.getLineStyleAccess().getWidthINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLineStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleLineStyle2141); 

                	newLeafNode(otherlv_5, grammarAccess.getLineStyleAccess().getTypeKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1041:1: ( (lv_lineType_6_0= ruleLineType ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1042:1: (lv_lineType_6_0= ruleLineType )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1042:1: (lv_lineType_6_0= ruleLineType )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1043:3: lv_lineType_6_0= ruleLineType
            {
             
            	        newCompositeNode(grammarAccess.getLineStyleAccess().getLineTypeLineTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLineType_in_ruleLineStyle2162);
            lv_lineType_6_0=ruleLineType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineStyleRule());
            	        }
                   		set(
                   			current, 
                   			"lineType",
                    		lv_lineType_6_0, 
                    		"LineType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleLineStyle2174); 

                	newLeafNode(otherlv_7, grammarAccess.getLineStyleAccess().getColorKeyword_7());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1063:1: ( (otherlv_8= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1064:1: (otherlv_8= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1064:1: (otherlv_8= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1065:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLineStyleRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLineStyle2194); 

            		newLeafNode(otherlv_8, grammarAccess.getLineStyleAccess().getColorColorCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleLineStyle2206); 

                	newLeafNode(otherlv_9, grammarAccess.getLineStyleAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "entryRuleLineDecoration"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1088:1: entryRuleLineDecoration returns [EObject current=null] : iv_ruleLineDecoration= ruleLineDecoration EOF ;
    public final EObject entryRuleLineDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineDecoration = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1089:2: (iv_ruleLineDecoration= ruleLineDecoration EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1090:2: iv_ruleLineDecoration= ruleLineDecoration EOF
            {
             newCompositeNode(grammarAccess.getLineDecorationRule()); 
            pushFollow(FOLLOW_ruleLineDecoration_in_entryRuleLineDecoration2242);
            iv_ruleLineDecoration=ruleLineDecoration();

            state._fsp--;

             current =iv_ruleLineDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineDecoration2252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineDecoration"


    // $ANTLR start "ruleLineDecoration"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1097:1: ruleLineDecoration returns [EObject current=null] : (this_DefaultLineDecoration_0= ruleDefaultLineDecoration | this_CustomLineDecoration_1= ruleCustomLineDecoration ) ;
    public final EObject ruleLineDecoration() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultLineDecoration_0 = null;

        EObject this_CustomLineDecoration_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1100:28: ( (this_DefaultLineDecoration_0= ruleDefaultLineDecoration | this_CustomLineDecoration_1= ruleCustomLineDecoration ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1101:1: (this_DefaultLineDecoration_0= ruleDefaultLineDecoration | this_CustomLineDecoration_1= ruleCustomLineDecoration )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1101:1: (this_DefaultLineDecoration_0= ruleDefaultLineDecoration | this_CustomLineDecoration_1= ruleCustomLineDecoration )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=33 && LA8_0<=38)) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1102:5: this_DefaultLineDecoration_0= ruleDefaultLineDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getLineDecorationAccess().getDefaultLineDecorationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultLineDecoration_in_ruleLineDecoration2299);
                    this_DefaultLineDecoration_0=ruleDefaultLineDecoration();

                    state._fsp--;

                     
                            current = this_DefaultLineDecoration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1112:5: this_CustomLineDecoration_1= ruleCustomLineDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getLineDecorationAccess().getCustomLineDecorationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCustomLineDecoration_in_ruleLineDecoration2326);
                    this_CustomLineDecoration_1=ruleCustomLineDecoration();

                    state._fsp--;

                     
                            current = this_CustomLineDecoration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineDecoration"


    // $ANTLR start "entryRuleDefaultLineDecoration"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1128:1: entryRuleDefaultLineDecoration returns [EObject current=null] : iv_ruleDefaultLineDecoration= ruleDefaultLineDecoration EOF ;
    public final EObject entryRuleDefaultLineDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultLineDecoration = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1129:2: (iv_ruleDefaultLineDecoration= ruleDefaultLineDecoration EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1130:2: iv_ruleDefaultLineDecoration= ruleDefaultLineDecoration EOF
            {
             newCompositeNode(grammarAccess.getDefaultLineDecorationRule()); 
            pushFollow(FOLLOW_ruleDefaultLineDecoration_in_entryRuleDefaultLineDecoration2361);
            iv_ruleDefaultLineDecoration=ruleDefaultLineDecoration();

            state._fsp--;

             current =iv_ruleDefaultLineDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultLineDecoration2371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultLineDecoration"


    // $ANTLR start "ruleDefaultLineDecoration"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1137:1: ruleDefaultLineDecoration returns [EObject current=null] : ( ( (lv_none_0_0= 'none' ) ) | ( (lv_arrow_1_0= 'arrow' ) ) | ( (lv_rhomb_2_0= 'rhomb' ) ) | ( ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb' ) | ( (lv_square_5_0= 'square' ) ) | ( ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square' ) | ( ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow' ) | ( ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow' ) ) ;
    public final EObject ruleDefaultLineDecoration() throws RecognitionException {
        EObject current = null;

        Token lv_none_0_0=null;
        Token lv_arrow_1_0=null;
        Token lv_rhomb_2_0=null;
        Token lv_filledrhomb_3_0=null;
        Token otherlv_4=null;
        Token lv_square_5_0=null;
        Token lv_filledsquare_6_0=null;
        Token otherlv_7=null;
        Token lv_closedarrow_8_0=null;
        Token otherlv_9=null;
        Token lv_filledclosedarrow_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1140:28: ( ( ( (lv_none_0_0= 'none' ) ) | ( (lv_arrow_1_0= 'arrow' ) ) | ( (lv_rhomb_2_0= 'rhomb' ) ) | ( ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb' ) | ( (lv_square_5_0= 'square' ) ) | ( ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square' ) | ( ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow' ) | ( ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1141:1: ( ( (lv_none_0_0= 'none' ) ) | ( (lv_arrow_1_0= 'arrow' ) ) | ( (lv_rhomb_2_0= 'rhomb' ) ) | ( ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb' ) | ( (lv_square_5_0= 'square' ) ) | ( ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square' ) | ( ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow' ) | ( ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1141:1: ( ( (lv_none_0_0= 'none' ) ) | ( (lv_arrow_1_0= 'arrow' ) ) | ( (lv_rhomb_2_0= 'rhomb' ) ) | ( ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb' ) | ( (lv_square_5_0= 'square' ) ) | ( ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square' ) | ( ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow' ) | ( ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow' ) )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1141:2: ( (lv_none_0_0= 'none' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1141:2: ( (lv_none_0_0= 'none' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1142:1: (lv_none_0_0= 'none' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1142:1: (lv_none_0_0= 'none' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1143:3: lv_none_0_0= 'none'
                    {
                    lv_none_0_0=(Token)match(input,33,FOLLOW_33_in_ruleDefaultLineDecoration2414); 

                            newLeafNode(lv_none_0_0, grammarAccess.getDefaultLineDecorationAccess().getNoneNoneKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "none", lv_none_0_0, "none");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1157:6: ( (lv_arrow_1_0= 'arrow' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1157:6: ( (lv_arrow_1_0= 'arrow' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1158:1: (lv_arrow_1_0= 'arrow' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1158:1: (lv_arrow_1_0= 'arrow' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1159:3: lv_arrow_1_0= 'arrow'
                    {
                    lv_arrow_1_0=(Token)match(input,34,FOLLOW_34_in_ruleDefaultLineDecoration2451); 

                            newLeafNode(lv_arrow_1_0, grammarAccess.getDefaultLineDecorationAccess().getArrowArrowKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "arrow", lv_arrow_1_0, "arrow");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1173:6: ( (lv_rhomb_2_0= 'rhomb' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1173:6: ( (lv_rhomb_2_0= 'rhomb' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1174:1: (lv_rhomb_2_0= 'rhomb' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1174:1: (lv_rhomb_2_0= 'rhomb' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1175:3: lv_rhomb_2_0= 'rhomb'
                    {
                    lv_rhomb_2_0=(Token)match(input,35,FOLLOW_35_in_ruleDefaultLineDecoration2488); 

                            newLeafNode(lv_rhomb_2_0, grammarAccess.getDefaultLineDecorationAccess().getRhombRhombKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "rhomb", lv_rhomb_2_0, "rhomb");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1189:6: ( ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1189:6: ( ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1189:7: ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1189:7: ( (lv_filledrhomb_3_0= 'filled' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1190:1: (lv_filledrhomb_3_0= 'filled' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1190:1: (lv_filledrhomb_3_0= 'filled' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1191:3: lv_filledrhomb_3_0= 'filled'
                    {
                    lv_filledrhomb_3_0=(Token)match(input,36,FOLLOW_36_in_ruleDefaultLineDecoration2526); 

                            newLeafNode(lv_filledrhomb_3_0, grammarAccess.getDefaultLineDecorationAccess().getFilledrhombFilledKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "filledrhomb", lv_filledrhomb_3_0, "filled");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleDefaultLineDecoration2551); 

                        	newLeafNode(otherlv_4, grammarAccess.getDefaultLineDecorationAccess().getRhombKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1209:6: ( (lv_square_5_0= 'square' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1209:6: ( (lv_square_5_0= 'square' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1210:1: (lv_square_5_0= 'square' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1210:1: (lv_square_5_0= 'square' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1211:3: lv_square_5_0= 'square'
                    {
                    lv_square_5_0=(Token)match(input,37,FOLLOW_37_in_ruleDefaultLineDecoration2576); 

                            newLeafNode(lv_square_5_0, grammarAccess.getDefaultLineDecorationAccess().getSquareSquareKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "square", lv_square_5_0, "square");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1225:6: ( ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1225:6: ( ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1225:7: ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1225:7: ( (lv_filledsquare_6_0= 'filled' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1226:1: (lv_filledsquare_6_0= 'filled' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1226:1: (lv_filledsquare_6_0= 'filled' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1227:3: lv_filledsquare_6_0= 'filled'
                    {
                    lv_filledsquare_6_0=(Token)match(input,36,FOLLOW_36_in_ruleDefaultLineDecoration2614); 

                            newLeafNode(lv_filledsquare_6_0, grammarAccess.getDefaultLineDecorationAccess().getFilledsquareFilledKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "filledsquare", lv_filledsquare_6_0, "filled");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleDefaultLineDecoration2639); 

                        	newLeafNode(otherlv_7, grammarAccess.getDefaultLineDecorationAccess().getSquareKeyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1245:6: ( ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1245:6: ( ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1245:7: ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1245:7: ( (lv_closedarrow_8_0= 'closed' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1246:1: (lv_closedarrow_8_0= 'closed' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1246:1: (lv_closedarrow_8_0= 'closed' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1247:3: lv_closedarrow_8_0= 'closed'
                    {
                    lv_closedarrow_8_0=(Token)match(input,38,FOLLOW_38_in_ruleDefaultLineDecoration2665); 

                            newLeafNode(lv_closedarrow_8_0, grammarAccess.getDefaultLineDecorationAccess().getClosedarrowClosedKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "closedarrow", lv_closedarrow_8_0, "closed");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleDefaultLineDecoration2690); 

                        	newLeafNode(otherlv_9, grammarAccess.getDefaultLineDecorationAccess().getArrowKeyword_6_1());
                        

                    }


                    }
                    break;
                case 8 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1265:6: ( ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1265:6: ( ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1265:7: ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1265:7: ( (lv_filledclosedarrow_10_0= 'filled' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1266:1: (lv_filledclosedarrow_10_0= 'filled' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1266:1: (lv_filledclosedarrow_10_0= 'filled' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1267:3: lv_filledclosedarrow_10_0= 'filled'
                    {
                    lv_filledclosedarrow_10_0=(Token)match(input,36,FOLLOW_36_in_ruleDefaultLineDecoration2716); 

                            newLeafNode(lv_filledclosedarrow_10_0, grammarAccess.getDefaultLineDecorationAccess().getFilledclosedarrowFilledKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLineDecorationRule());
                    	        }
                           		setWithLastConsumed(current, "filledclosedarrow", lv_filledclosedarrow_10_0, "filled");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleDefaultLineDecoration2741); 

                        	newLeafNode(otherlv_11, grammarAccess.getDefaultLineDecorationAccess().getClosedKeyword_7_1());
                        
                    otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleDefaultLineDecoration2753); 

                        	newLeafNode(otherlv_12, grammarAccess.getDefaultLineDecorationAccess().getArrowKeyword_7_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultLineDecoration"


    // $ANTLR start "entryRuleCustomLineDecoration"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1296:1: entryRuleCustomLineDecoration returns [EObject current=null] : iv_ruleCustomLineDecoration= ruleCustomLineDecoration EOF ;
    public final EObject entryRuleCustomLineDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomLineDecoration = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1297:2: (iv_ruleCustomLineDecoration= ruleCustomLineDecoration EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1298:2: iv_ruleCustomLineDecoration= ruleCustomLineDecoration EOF
            {
             newCompositeNode(grammarAccess.getCustomLineDecorationRule()); 
            pushFollow(FOLLOW_ruleCustomLineDecoration_in_entryRuleCustomLineDecoration2790);
            iv_ruleCustomLineDecoration=ruleCustomLineDecoration();

            state._fsp--;

             current =iv_ruleCustomLineDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomLineDecoration2800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomLineDecoration"


    // $ANTLR start "ruleCustomLineDecoration"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1305:1: ruleCustomLineDecoration returns [EObject current=null] : (otherlv_0= 'Custom line decoration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'class' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleCustomLineDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_referenceImplementation_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1308:28: ( (otherlv_0= 'Custom line decoration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'class' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1309:1: (otherlv_0= 'Custom line decoration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'class' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1309:1: (otherlv_0= 'Custom line decoration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'class' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1309:3: otherlv_0= 'Custom line decoration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'class' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleCustomLineDecoration2837); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomLineDecorationAccess().getCustomLineDecorationKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1313:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1314:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1314:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1315:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomLineDecoration2854); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomLineDecorationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomLineDecorationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCustomLineDecoration2871); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomLineDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCustomLineDecoration2883); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomLineDecorationAccess().getClassKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1339:1: ( (lv_referenceImplementation_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1340:1: (lv_referenceImplementation_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1340:1: (lv_referenceImplementation_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1341:3: lv_referenceImplementation_4_0= RULE_STRING
            {
            lv_referenceImplementation_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomLineDecoration2900); 

            			newLeafNode(lv_referenceImplementation_4_0, grammarAccess.getCustomLineDecorationAccess().getReferenceImplementationSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomLineDecorationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceImplementation",
                    		lv_referenceImplementation_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleCustomLineDecoration2917); 

                	newLeafNode(otherlv_5, grammarAccess.getCustomLineDecorationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomLineDecoration"


    // $ANTLR start "entryRuleColor"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1369:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1370:2: (iv_ruleColor= ruleColor EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1371:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor2953);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor2963); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1378:1: ruleColor returns [EObject current=null] : (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_red_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_green_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_blue_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_red_3_0=null;
        Token otherlv_4=null;
        Token lv_green_5_0=null;
        Token otherlv_6=null;
        Token lv_blue_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1381:28: ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_red_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_green_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_blue_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1382:1: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_red_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_green_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_blue_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1382:1: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_red_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_green_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_blue_7_0= RULE_INT ) ) otherlv_8= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1382:3: otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_red_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_green_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_blue_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleColor3000); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1386:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1387:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1387:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1388:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColor3017); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleColor3034); 

                	newLeafNode(otherlv_2, grammarAccess.getColorAccess().getLeftParenthesisKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1408:1: ( (lv_red_3_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1409:1: (lv_red_3_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1409:1: (lv_red_3_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1410:3: lv_red_3_0= RULE_INT
            {
            lv_red_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor3051); 

            			newLeafNode(lv_red_3_0, grammarAccess.getColorAccess().getRedINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleColor3068); 

                	newLeafNode(otherlv_4, grammarAccess.getColorAccess().getCommaSpaceKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1430:1: ( (lv_green_5_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1431:1: (lv_green_5_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1431:1: (lv_green_5_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1432:3: lv_green_5_0= RULE_INT
            {
            lv_green_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor3085); 

            			newLeafNode(lv_green_5_0, grammarAccess.getColorAccess().getGreenINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleColor3102); 

                	newLeafNode(otherlv_6, grammarAccess.getColorAccess().getCommaSpaceKeyword_6());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1452:1: ( (lv_blue_7_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1453:1: (lv_blue_7_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1453:1: (lv_blue_7_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1454:3: lv_blue_7_0= RULE_INT
            {
            lv_blue_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor3119); 

            			newLeafNode(lv_blue_7_0, grammarAccess.getColorAccess().getBlueINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleColor3136); 

                	newLeafNode(otherlv_8, grammarAccess.getColorAccess().getRightParenthesisKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleLayout"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1482:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1483:2: (iv_ruleLayout= ruleLayout EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1484:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout3172);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout3182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1491:1: ruleLayout returns [EObject current=null] : (this_DefaultLayout_0= ruleDefaultLayout | this_CustomLayout_1= ruleCustomLayout ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultLayout_0 = null;

        EObject this_CustomLayout_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1494:28: ( (this_DefaultLayout_0= ruleDefaultLayout | this_CustomLayout_1= ruleCustomLayout ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1495:1: (this_DefaultLayout_0= ruleDefaultLayout | this_CustomLayout_1= ruleCustomLayout )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1495:1: (this_DefaultLayout_0= ruleDefaultLayout | this_CustomLayout_1= ruleCustomLayout )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44||LA10_0==46) ) {
                alt10=1;
            }
            else if ( (LA10_0==47) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1496:5: this_DefaultLayout_0= ruleDefaultLayout
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutAccess().getDefaultLayoutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultLayout_in_ruleLayout3229);
                    this_DefaultLayout_0=ruleDefaultLayout();

                    state._fsp--;

                     
                            current = this_DefaultLayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1506:5: this_CustomLayout_1= ruleCustomLayout
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutAccess().getCustomLayoutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCustomLayout_in_ruleLayout3256);
                    this_CustomLayout_1=ruleCustomLayout();

                    state._fsp--;

                     
                            current = this_CustomLayout_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleDefaultLayout"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1522:1: entryRuleDefaultLayout returns [EObject current=null] : iv_ruleDefaultLayout= ruleDefaultLayout EOF ;
    public final EObject entryRuleDefaultLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultLayout = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1523:2: (iv_ruleDefaultLayout= ruleDefaultLayout EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1524:2: iv_ruleDefaultLayout= ruleDefaultLayout EOF
            {
             newCompositeNode(grammarAccess.getDefaultLayoutRule()); 
            pushFollow(FOLLOW_ruleDefaultLayout_in_entryRuleDefaultLayout3291);
            iv_ruleDefaultLayout=ruleDefaultLayout();

            state._fsp--;

             current =iv_ruleDefaultLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultLayout3301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultLayout"


    // $ANTLR start "ruleDefaultLayout"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1531:1: ruleDefaultLayout returns [EObject current=null] : ( ( ( (lv_list_0_0= 'list' ) ) otherlv_1= 'layout' ) | ( ( (lv_default_2_0= 'default' ) ) otherlv_3= 'layout' ) ) ;
    public final EObject ruleDefaultLayout() throws RecognitionException {
        EObject current = null;

        Token lv_list_0_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1534:28: ( ( ( ( (lv_list_0_0= 'list' ) ) otherlv_1= 'layout' ) | ( ( (lv_default_2_0= 'default' ) ) otherlv_3= 'layout' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1535:1: ( ( ( (lv_list_0_0= 'list' ) ) otherlv_1= 'layout' ) | ( ( (lv_default_2_0= 'default' ) ) otherlv_3= 'layout' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1535:1: ( ( ( (lv_list_0_0= 'list' ) ) otherlv_1= 'layout' ) | ( ( (lv_default_2_0= 'default' ) ) otherlv_3= 'layout' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            else if ( (LA11_0==46) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1535:2: ( ( (lv_list_0_0= 'list' ) ) otherlv_1= 'layout' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1535:2: ( ( (lv_list_0_0= 'list' ) ) otherlv_1= 'layout' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1535:3: ( (lv_list_0_0= 'list' ) ) otherlv_1= 'layout'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1535:3: ( (lv_list_0_0= 'list' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1536:1: (lv_list_0_0= 'list' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1536:1: (lv_list_0_0= 'list' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1537:3: lv_list_0_0= 'list'
                    {
                    lv_list_0_0=(Token)match(input,44,FOLLOW_44_in_ruleDefaultLayout3345); 

                            newLeafNode(lv_list_0_0, grammarAccess.getDefaultLayoutAccess().getListListKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLayoutRule());
                    	        }
                           		setWithLastConsumed(current, "list", lv_list_0_0, "list");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleDefaultLayout3370); 

                        	newLeafNode(otherlv_1, grammarAccess.getDefaultLayoutAccess().getLayoutKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1555:6: ( ( (lv_default_2_0= 'default' ) ) otherlv_3= 'layout' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1555:6: ( ( (lv_default_2_0= 'default' ) ) otherlv_3= 'layout' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1555:7: ( (lv_default_2_0= 'default' ) ) otherlv_3= 'layout'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1555:7: ( (lv_default_2_0= 'default' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1556:1: (lv_default_2_0= 'default' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1556:1: (lv_default_2_0= 'default' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1557:3: lv_default_2_0= 'default'
                    {
                    lv_default_2_0=(Token)match(input,46,FOLLOW_46_in_ruleDefaultLayout3396); 

                            newLeafNode(lv_default_2_0, grammarAccess.getDefaultLayoutAccess().getDefaultDefaultKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultLayoutRule());
                    	        }
                           		setWithLastConsumed(current, "default", lv_default_2_0, "default");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleDefaultLayout3421); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefaultLayoutAccess().getLayoutKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultLayout"


    // $ANTLR start "entryRuleCustomLayout"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1582:1: entryRuleCustomLayout returns [EObject current=null] : iv_ruleCustomLayout= ruleCustomLayout EOF ;
    public final EObject entryRuleCustomLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomLayout = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1583:2: (iv_ruleCustomLayout= ruleCustomLayout EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1584:2: iv_ruleCustomLayout= ruleCustomLayout EOF
            {
             newCompositeNode(grammarAccess.getCustomLayoutRule()); 
            pushFollow(FOLLOW_ruleCustomLayout_in_entryRuleCustomLayout3458);
            iv_ruleCustomLayout=ruleCustomLayout();

            state._fsp--;

             current =iv_ruleCustomLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomLayout3468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomLayout"


    // $ANTLR start "ruleCustomLayout"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1591:1: ruleCustomLayout returns [EObject current=null] : (otherlv_0= 'custom' otherlv_1= 'layout' otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleCustomLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_referenceImplementation_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1594:28: ( (otherlv_0= 'custom' otherlv_1= 'layout' otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1595:1: (otherlv_0= 'custom' otherlv_1= 'layout' otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1595:1: (otherlv_0= 'custom' otherlv_1= 'layout' otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1595:3: otherlv_0= 'custom' otherlv_1= 'layout' otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleCustomLayout3505); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomLayoutAccess().getCustomKeyword_0());
                
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleCustomLayout3517); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomLayoutAccess().getLayoutKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCustomLayout3529); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomLayoutAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleCustomLayout3541); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomLayoutAccess().getImplementationReferenceKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1611:1: ( (lv_referenceImplementation_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1612:1: (lv_referenceImplementation_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1612:1: (lv_referenceImplementation_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1613:3: lv_referenceImplementation_4_0= RULE_STRING
            {
            lv_referenceImplementation_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomLayout3558); 

            			newLeafNode(lv_referenceImplementation_4_0, grammarAccess.getCustomLayoutAccess().getReferenceImplementationSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomLayoutRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceImplementation",
                    		lv_referenceImplementation_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleCustomLayout3575); 

                	newLeafNode(otherlv_5, grammarAccess.getCustomLayoutAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomLayout"


    // $ANTLR start "entryRuleFigureStyle"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1641:1: entryRuleFigureStyle returns [EObject current=null] : iv_ruleFigureStyle= ruleFigureStyle EOF ;
    public final EObject entryRuleFigureStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigureStyle = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1642:2: (iv_ruleFigureStyle= ruleFigureStyle EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1643:2: iv_ruleFigureStyle= ruleFigureStyle EOF
            {
             newCompositeNode(grammarAccess.getFigureStyleRule()); 
            pushFollow(FOLLOW_ruleFigureStyle_in_entryRuleFigureStyle3611);
            iv_ruleFigureStyle=ruleFigureStyle();

            state._fsp--;

             current =iv_ruleFigureStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFigureStyle3621); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFigureStyle"


    // $ANTLR start "ruleFigureStyle"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1650:1: ruleFigureStyle returns [EObject current=null] : (this_Rounded_0= ruleRounded | this_RegularPolygon_1= ruleRegularPolygon | this_Ellipse_2= ruleEllipse | this_CustomFigure_3= ruleCustomFigure ) ;
    public final EObject ruleFigureStyle() throws RecognitionException {
        EObject current = null;

        EObject this_Rounded_0 = null;

        EObject this_RegularPolygon_1 = null;

        EObject this_Ellipse_2 = null;

        EObject this_CustomFigure_3 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1653:28: ( (this_Rounded_0= ruleRounded | this_RegularPolygon_1= ruleRegularPolygon | this_Ellipse_2= ruleEllipse | this_CustomFigure_3= ruleCustomFigure ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1654:1: (this_Rounded_0= ruleRounded | this_RegularPolygon_1= ruleRegularPolygon | this_Ellipse_2= ruleEllipse | this_CustomFigure_3= ruleCustomFigure )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1654:1: (this_Rounded_0= ruleRounded | this_RegularPolygon_1= ruleRegularPolygon | this_Ellipse_2= ruleEllipse | this_CustomFigure_3= ruleCustomFigure )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt12=1;
                }
                break;
            case 52:
                {
                alt12=2;
                }
                break;
            case 55:
                {
                alt12=3;
                }
                break;
            case 57:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1655:5: this_Rounded_0= ruleRounded
                    {
                     
                            newCompositeNode(grammarAccess.getFigureStyleAccess().getRoundedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRounded_in_ruleFigureStyle3668);
                    this_Rounded_0=ruleRounded();

                    state._fsp--;

                     
                            current = this_Rounded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1665:5: this_RegularPolygon_1= ruleRegularPolygon
                    {
                     
                            newCompositeNode(grammarAccess.getFigureStyleAccess().getRegularPolygonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRegularPolygon_in_ruleFigureStyle3695);
                    this_RegularPolygon_1=ruleRegularPolygon();

                    state._fsp--;

                     
                            current = this_RegularPolygon_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1675:5: this_Ellipse_2= ruleEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getFigureStyleAccess().getEllipseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEllipse_in_ruleFigureStyle3722);
                    this_Ellipse_2=ruleEllipse();

                    state._fsp--;

                     
                            current = this_Ellipse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1685:5: this_CustomFigure_3= ruleCustomFigure
                    {
                     
                            newCompositeNode(grammarAccess.getFigureStyleAccess().getCustomFigureParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCustomFigure_in_ruleFigureStyle3749);
                    this_CustomFigure_3=ruleCustomFigure();

                    state._fsp--;

                     
                            current = this_CustomFigure_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigureStyle"


    // $ANTLR start "entryRuleRounded"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1701:1: entryRuleRounded returns [EObject current=null] : iv_ruleRounded= ruleRounded EOF ;
    public final EObject entryRuleRounded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRounded = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1702:2: (iv_ruleRounded= ruleRounded EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1703:2: iv_ruleRounded= ruleRounded EOF
            {
             newCompositeNode(grammarAccess.getRoundedRule()); 
            pushFollow(FOLLOW_ruleRounded_in_entryRuleRounded3784);
            iv_ruleRounded=ruleRounded();

            state._fsp--;

             current =iv_ruleRounded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRounded3794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRounded"


    // $ANTLR start "ruleRounded"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1710:1: ruleRounded returns [EObject current=null] : (otherlv_0= 'Rounded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'radiox' ( (lv_rx_4_0= RULE_INT ) ) otherlv_5= 'radioy' ( (lv_ry_6_0= RULE_INT ) ) otherlv_7= '}' ) ;
    public final EObject ruleRounded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rx_4_0=null;
        Token otherlv_5=null;
        Token lv_ry_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1713:28: ( (otherlv_0= 'Rounded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'radiox' ( (lv_rx_4_0= RULE_INT ) ) otherlv_5= 'radioy' ( (lv_ry_6_0= RULE_INT ) ) otherlv_7= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1714:1: (otherlv_0= 'Rounded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'radiox' ( (lv_rx_4_0= RULE_INT ) ) otherlv_5= 'radioy' ( (lv_ry_6_0= RULE_INT ) ) otherlv_7= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1714:1: (otherlv_0= 'Rounded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'radiox' ( (lv_rx_4_0= RULE_INT ) ) otherlv_5= 'radioy' ( (lv_ry_6_0= RULE_INT ) ) otherlv_7= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1714:3: otherlv_0= 'Rounded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'radiox' ( (lv_rx_4_0= RULE_INT ) ) otherlv_5= 'radioy' ( (lv_ry_6_0= RULE_INT ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRounded3831); 

                	newLeafNode(otherlv_0, grammarAccess.getRoundedAccess().getRoundedKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1718:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1719:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1719:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1720:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRounded3848); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoundedAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoundedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRounded3865); 

                	newLeafNode(otherlv_2, grammarAccess.getRoundedAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleRounded3877); 

                	newLeafNode(otherlv_3, grammarAccess.getRoundedAccess().getRadioxKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1744:1: ( (lv_rx_4_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1745:1: (lv_rx_4_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1745:1: (lv_rx_4_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1746:3: lv_rx_4_0= RULE_INT
            {
            lv_rx_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRounded3894); 

            			newLeafNode(lv_rx_4_0, grammarAccess.getRoundedAccess().getRxINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoundedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rx",
                    		lv_rx_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleRounded3911); 

                	newLeafNode(otherlv_5, grammarAccess.getRoundedAccess().getRadioyKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1766:1: ( (lv_ry_6_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1767:1: (lv_ry_6_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1767:1: (lv_ry_6_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1768:3: lv_ry_6_0= RULE_INT
            {
            lv_ry_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRounded3928); 

            			newLeafNode(lv_ry_6_0, grammarAccess.getRoundedAccess().getRyINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoundedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ry",
                    		lv_ry_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleRounded3945); 

                	newLeafNode(otherlv_7, grammarAccess.getRoundedAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRounded"


    // $ANTLR start "entryRuleRegularPolygon"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1796:1: entryRuleRegularPolygon returns [EObject current=null] : iv_ruleRegularPolygon= ruleRegularPolygon EOF ;
    public final EObject entryRuleRegularPolygon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularPolygon = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1797:2: (iv_ruleRegularPolygon= ruleRegularPolygon EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1798:2: iv_ruleRegularPolygon= ruleRegularPolygon EOF
            {
             newCompositeNode(grammarAccess.getRegularPolygonRule()); 
            pushFollow(FOLLOW_ruleRegularPolygon_in_entryRuleRegularPolygon3981);
            iv_ruleRegularPolygon=ruleRegularPolygon();

            state._fsp--;

             current =iv_ruleRegularPolygon; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularPolygon3991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularPolygon"


    // $ANTLR start "ruleRegularPolygon"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1805:1: ruleRegularPolygon returns [EObject current=null] : (otherlv_0= 'Regular polygon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertex quantity' ( (lv_vertexCant_4_0= RULE_INT ) ) otherlv_5= 'start angle' ( (lv_startAngle_6_0= RULE_INT ) ) otherlv_7= '}' ) ;
    public final EObject ruleRegularPolygon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_vertexCant_4_0=null;
        Token otherlv_5=null;
        Token lv_startAngle_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1808:28: ( (otherlv_0= 'Regular polygon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertex quantity' ( (lv_vertexCant_4_0= RULE_INT ) ) otherlv_5= 'start angle' ( (lv_startAngle_6_0= RULE_INT ) ) otherlv_7= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1809:1: (otherlv_0= 'Regular polygon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertex quantity' ( (lv_vertexCant_4_0= RULE_INT ) ) otherlv_5= 'start angle' ( (lv_startAngle_6_0= RULE_INT ) ) otherlv_7= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1809:1: (otherlv_0= 'Regular polygon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertex quantity' ( (lv_vertexCant_4_0= RULE_INT ) ) otherlv_5= 'start angle' ( (lv_startAngle_6_0= RULE_INT ) ) otherlv_7= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1809:3: otherlv_0= 'Regular polygon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertex quantity' ( (lv_vertexCant_4_0= RULE_INT ) ) otherlv_5= 'start angle' ( (lv_startAngle_6_0= RULE_INT ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleRegularPolygon4028); 

                	newLeafNode(otherlv_0, grammarAccess.getRegularPolygonAccess().getRegularPolygonKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1813:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1814:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1814:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1815:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegularPolygon4045); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRegularPolygonAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegularPolygonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRegularPolygon4062); 

                	newLeafNode(otherlv_2, grammarAccess.getRegularPolygonAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleRegularPolygon4074); 

                	newLeafNode(otherlv_3, grammarAccess.getRegularPolygonAccess().getVertexQuantityKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1839:1: ( (lv_vertexCant_4_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1840:1: (lv_vertexCant_4_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1840:1: (lv_vertexCant_4_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1841:3: lv_vertexCant_4_0= RULE_INT
            {
            lv_vertexCant_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRegularPolygon4091); 

            			newLeafNode(lv_vertexCant_4_0, grammarAccess.getRegularPolygonAccess().getVertexCantINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegularPolygonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"vertexCant",
                    		lv_vertexCant_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleRegularPolygon4108); 

                	newLeafNode(otherlv_5, grammarAccess.getRegularPolygonAccess().getStartAngleKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1861:1: ( (lv_startAngle_6_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1862:1: (lv_startAngle_6_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1862:1: (lv_startAngle_6_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1863:3: lv_startAngle_6_0= RULE_INT
            {
            lv_startAngle_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRegularPolygon4125); 

            			newLeafNode(lv_startAngle_6_0, grammarAccess.getRegularPolygonAccess().getStartAngleINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegularPolygonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"startAngle",
                    		lv_startAngle_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleRegularPolygon4142); 

                	newLeafNode(otherlv_7, grammarAccess.getRegularPolygonAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularPolygon"


    // $ANTLR start "entryRuleEllipse"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1891:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1892:2: (iv_ruleEllipse= ruleEllipse EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1893:2: iv_ruleEllipse= ruleEllipse EOF
            {
             newCompositeNode(grammarAccess.getEllipseRule()); 
            pushFollow(FOLLOW_ruleEllipse_in_entryRuleEllipse4178);
            iv_ruleEllipse=ruleEllipse();

            state._fsp--;

             current =iv_ruleEllipse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEllipse4188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEllipse"


    // $ANTLR start "ruleEllipse"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1900:1: ruleEllipse returns [EObject current=null] : (otherlv_0= 'Ellipse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'proportion' otherlv_4= '(' ( (lv_radiox_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_radioy_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleEllipse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_radiox_5_0=null;
        Token otherlv_6=null;
        Token lv_radioy_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1903:28: ( (otherlv_0= 'Ellipse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'proportion' otherlv_4= '(' ( (lv_radiox_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_radioy_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1904:1: (otherlv_0= 'Ellipse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'proportion' otherlv_4= '(' ( (lv_radiox_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_radioy_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1904:1: (otherlv_0= 'Ellipse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'proportion' otherlv_4= '(' ( (lv_radiox_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_radioy_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1904:3: otherlv_0= 'Ellipse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'proportion' otherlv_4= '(' ( (lv_radiox_5_0= RULE_INT ) ) otherlv_6= ', ' ( (lv_radioy_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleEllipse4225); 

                	newLeafNode(otherlv_0, grammarAccess.getEllipseAccess().getEllipseKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1908:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1909:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1909:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1910:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEllipse4242); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEllipseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEllipseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEllipse4259); 

                	newLeafNode(otherlv_2, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleEllipse4271); 

                	newLeafNode(otherlv_3, grammarAccess.getEllipseAccess().getProportionKeyword_3());
                
            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleEllipse4283); 

                	newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getLeftParenthesisKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1938:1: ( (lv_radiox_5_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1939:1: (lv_radiox_5_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1939:1: (lv_radiox_5_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1940:3: lv_radiox_5_0= RULE_INT
            {
            lv_radiox_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEllipse4300); 

            			newLeafNode(lv_radiox_5_0, grammarAccess.getEllipseAccess().getRadioxINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEllipseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"radiox",
                    		lv_radiox_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleEllipse4317); 

                	newLeafNode(otherlv_6, grammarAccess.getEllipseAccess().getCommaSpaceKeyword_6());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1960:1: ( (lv_radioy_7_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1961:1: (lv_radioy_7_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1961:1: (lv_radioy_7_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1962:3: lv_radioy_7_0= RULE_INT
            {
            lv_radioy_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEllipse4334); 

            			newLeafNode(lv_radioy_7_0, grammarAccess.getEllipseAccess().getRadioyINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEllipseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"radioy",
                    		lv_radioy_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleEllipse4351); 

                	newLeafNode(otherlv_8, grammarAccess.getEllipseAccess().getRightParenthesisKeyword_8());
                
            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleEllipse4363); 

                	newLeafNode(otherlv_9, grammarAccess.getEllipseAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEllipse"


    // $ANTLR start "entryRuleCustomFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1994:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1995:2: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:1996:2: iv_ruleCustomFigure= ruleCustomFigure EOF
            {
             newCompositeNode(grammarAccess.getCustomFigureRule()); 
            pushFollow(FOLLOW_ruleCustomFigure_in_entryRuleCustomFigure4399);
            iv_ruleCustomFigure=ruleCustomFigure();

            state._fsp--;

             current =iv_ruleCustomFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomFigure4409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFigure"


    // $ANTLR start "ruleCustomFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2003:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'Custom figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_points_3_0= rulePoint ) ) otherlv_4= '}' ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_points_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2006:28: ( (otherlv_0= 'Custom figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_points_3_0= rulePoint ) ) otherlv_4= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2007:1: (otherlv_0= 'Custom figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_points_3_0= rulePoint ) ) otherlv_4= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2007:1: (otherlv_0= 'Custom figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_points_3_0= rulePoint ) ) otherlv_4= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2007:3: otherlv_0= 'Custom figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_points_3_0= rulePoint ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleCustomFigure4446); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getCustomFigureKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2011:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2012:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2012:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2013:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomFigure4463); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomFigureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomFigureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCustomFigure4480); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2033:1: ( (lv_points_3_0= rulePoint ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2034:1: (lv_points_3_0= rulePoint )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2034:1: (lv_points_3_0= rulePoint )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2035:3: lv_points_3_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getCustomFigureAccess().getPointsPointParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleCustomFigure4501);
            lv_points_3_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomFigureRule());
            	        }
                   		add(
                   			current, 
                   			"points",
                    		lv_points_3_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleCustomFigure4513); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomFigureAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFigure"


    // $ANTLR start "entryRulePoint"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2063:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2064:2: (iv_rulePoint= rulePoint EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2065:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint4549);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint4559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2072:1: rulePoint returns [EObject current=null] : ( () otherlv_1= 'Point' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2075:28: ( ( () otherlv_1= 'Point' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2076:1: ( () otherlv_1= 'Point' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2076:1: ( () otherlv_1= 'Point' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2076:2: () otherlv_1= 'Point' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ', ' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2076:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2077:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPointAccess().getPointAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_rulePoint4605); 

                	newLeafNode(otherlv_1, grammarAccess.getPointAccess().getPointKeyword_1());
                
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulePoint4617); 

                	newLeafNode(otherlv_2, grammarAccess.getPointAccess().getLeftParenthesisKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2090:1: ( (lv_x_3_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2091:1: (lv_x_3_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2091:1: (lv_x_3_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2092:3: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint4634); 

            			newLeafNode(lv_x_3_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_rulePoint4651); 

                	newLeafNode(otherlv_4, grammarAccess.getPointAccess().getCommaSpaceKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2112:1: ( (lv_y_5_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2113:1: (lv_y_5_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2113:1: (lv_y_5_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2114:3: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint4668); 

            			newLeafNode(lv_y_5_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_rulePoint4685); 

                	newLeafNode(otherlv_6, grammarAccess.getPointAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleLabelPosition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2142:1: entryRuleLabelPosition returns [EObject current=null] : iv_ruleLabelPosition= ruleLabelPosition EOF ;
    public final EObject entryRuleLabelPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelPosition = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2143:2: (iv_ruleLabelPosition= ruleLabelPosition EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2144:2: iv_ruleLabelPosition= ruleLabelPosition EOF
            {
             newCompositeNode(grammarAccess.getLabelPositionRule()); 
            pushFollow(FOLLOW_ruleLabelPosition_in_entryRuleLabelPosition4721);
            iv_ruleLabelPosition=ruleLabelPosition();

            state._fsp--;

             current =iv_ruleLabelPosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelPosition4731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelPosition"


    // $ANTLR start "ruleLabelPosition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2151:1: ruleLabelPosition returns [EObject current=null] : ( ( (lv_internal_0_0= 'internal' ) ) | ( (lv_external_1_0= 'external' ) ) ) ;
    public final EObject ruleLabelPosition() throws RecognitionException {
        EObject current = null;

        Token lv_internal_0_0=null;
        Token lv_external_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2154:28: ( ( ( (lv_internal_0_0= 'internal' ) ) | ( (lv_external_1_0= 'external' ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2155:1: ( ( (lv_internal_0_0= 'internal' ) ) | ( (lv_external_1_0= 'external' ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2155:1: ( ( (lv_internal_0_0= 'internal' ) ) | ( (lv_external_1_0= 'external' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==59) ) {
                alt13=1;
            }
            else if ( (LA13_0==60) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2155:2: ( (lv_internal_0_0= 'internal' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2155:2: ( (lv_internal_0_0= 'internal' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2156:1: (lv_internal_0_0= 'internal' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2156:1: (lv_internal_0_0= 'internal' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2157:3: lv_internal_0_0= 'internal'
                    {
                    lv_internal_0_0=(Token)match(input,59,FOLLOW_59_in_ruleLabelPosition4774); 

                            newLeafNode(lv_internal_0_0, grammarAccess.getLabelPositionAccess().getInternalInternalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelPositionRule());
                    	        }
                           		setWithLastConsumed(current, "internal", lv_internal_0_0, "internal");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2171:6: ( (lv_external_1_0= 'external' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2171:6: ( (lv_external_1_0= 'external' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2172:1: (lv_external_1_0= 'external' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2172:1: (lv_external_1_0= 'external' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2173:3: lv_external_1_0= 'external'
                    {
                    lv_external_1_0=(Token)match(input,60,FOLLOW_60_in_ruleLabelPosition4811); 

                            newLeafNode(lv_external_1_0, grammarAccess.getLabelPositionAccess().getExternalExternalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelPositionRule());
                    	        }
                           		setWithLastConsumed(current, "external", lv_external_1_0, "external");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelPosition"


    // $ANTLR start "entryRuleSize"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2194:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2195:2: (iv_ruleSize= ruleSize EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2196:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize4860);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize4870); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2203:1: ruleSize returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ', ' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_width_2_0=null;
        Token otherlv_3=null;
        Token lv_height_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2206:28: ( ( () otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ', ' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2207:1: ( () otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ', ' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2207:1: ( () otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ', ' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2207:2: () otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ', ' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2207:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2208:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSizeAccess().getSizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleSize4916); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getLeftParenthesisKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2217:1: ( (lv_width_2_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2218:1: (lv_width_2_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2218:1: (lv_width_2_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2219:3: lv_width_2_0= RULE_INT
            {
            lv_width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize4933); 

            			newLeafNode(lv_width_2_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleSize4950); 

                	newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getCommaSpaceKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2239:1: ( (lv_height_4_0= RULE_INT ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2240:1: (lv_height_4_0= RULE_INT )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2240:1: (lv_height_4_0= RULE_INT )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2241:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize4967); 

            			newLeafNode(lv_height_4_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleSize4984); 

                	newLeafNode(otherlv_5, grammarAccess.getSizeAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleEBoolean"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2269:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2270:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2271:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean5021);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean5032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2278:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2281:28: ( (kw= 'true' | kw= 'false' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2282:1: (kw= 'true' | kw= 'false' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2282:1: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==61) ) {
                alt14=1;
            }
            else if ( (LA14_0==62) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2283:2: kw= 'true'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleEBoolean5070); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2290:2: kw= 'false'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleEBoolean5089); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleGraphicalDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2303:1: entryRuleGraphicalDefinition returns [EObject current=null] : iv_ruleGraphicalDefinition= ruleGraphicalDefinition EOF ;
    public final EObject entryRuleGraphicalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalDefinition = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2304:2: (iv_ruleGraphicalDefinition= ruleGraphicalDefinition EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2305:2: iv_ruleGraphicalDefinition= ruleGraphicalDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphicalDefinitionRule()); 
            pushFollow(FOLLOW_ruleGraphicalDefinition_in_entryRuleGraphicalDefinition5129);
            iv_ruleGraphicalDefinition=ruleGraphicalDefinition();

            state._fsp--;

             current =iv_ruleGraphicalDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphicalDefinition5139); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphicalDefinition"


    // $ANTLR start "ruleGraphicalDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2312:1: ruleGraphicalDefinition returns [EObject current=null] : ( () otherlv_1= 'Graphical' otherlv_2= 'definition' otherlv_3= '{' ( (lv_elements_4_0= ruleGraphicalElement ) )+ otherlv_5= '}' ) ;
    public final EObject ruleGraphicalDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2315:28: ( ( () otherlv_1= 'Graphical' otherlv_2= 'definition' otherlv_3= '{' ( (lv_elements_4_0= ruleGraphicalElement ) )+ otherlv_5= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2316:1: ( () otherlv_1= 'Graphical' otherlv_2= 'definition' otherlv_3= '{' ( (lv_elements_4_0= ruleGraphicalElement ) )+ otherlv_5= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2316:1: ( () otherlv_1= 'Graphical' otherlv_2= 'definition' otherlv_3= '{' ( (lv_elements_4_0= ruleGraphicalElement ) )+ otherlv_5= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2316:2: () otherlv_1= 'Graphical' otherlv_2= 'definition' otherlv_3= '{' ( (lv_elements_4_0= ruleGraphicalElement ) )+ otherlv_5= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2316:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2317:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGraphicalDefinitionAccess().getGraphicalDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGraphicalDefinition5185); 

                	newLeafNode(otherlv_1, grammarAccess.getGraphicalDefinitionAccess().getGraphicalKeyword_1());
                
            otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleGraphicalDefinition5197); 

                	newLeafNode(otherlv_2, grammarAccess.getGraphicalDefinitionAccess().getDefinitionKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleGraphicalDefinition5209); 

                	newLeafNode(otherlv_3, grammarAccess.getGraphicalDefinitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2334:1: ( (lv_elements_4_0= ruleGraphicalElement ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==64||LA15_0==79||(LA15_0>=85 && LA15_0<=87)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2335:1: (lv_elements_4_0= ruleGraphicalElement )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2335:1: (lv_elements_4_0= ruleGraphicalElement )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2336:3: lv_elements_4_0= ruleGraphicalElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphicalDefinitionAccess().getElementsGraphicalElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGraphicalElement_in_ruleGraphicalDefinition5230);
            	    lv_elements_4_0=ruleGraphicalElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphicalDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"GraphicalElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGraphicalDefinition5243); 

                	newLeafNode(otherlv_5, grammarAccess.getGraphicalDefinitionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphicalDefinition"


    // $ANTLR start "entryRuleGraphicalElement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2364:1: entryRuleGraphicalElement returns [EObject current=null] : iv_ruleGraphicalElement= ruleGraphicalElement EOF ;
    public final EObject entryRuleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalElement = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2365:2: (iv_ruleGraphicalElement= ruleGraphicalElement EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2366:2: iv_ruleGraphicalElement= ruleGraphicalElement EOF
            {
             newCompositeNode(grammarAccess.getGraphicalElementRule()); 
            pushFollow(FOLLOW_ruleGraphicalElement_in_entryRuleGraphicalElement5279);
            iv_ruleGraphicalElement=ruleGraphicalElement();

            state._fsp--;

             current =iv_ruleGraphicalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphicalElement5289); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphicalElement"


    // $ANTLR start "ruleGraphicalElement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2373:1: ruleGraphicalElement returns [EObject current=null] : (this_ElementDef_0= ruleElementDef | this_ElementAlt_1= ruleElementAlt ) ;
    public final EObject ruleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_ElementDef_0 = null;

        EObject this_ElementAlt_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2376:28: ( (this_ElementDef_0= ruleElementDef | this_ElementAlt_1= ruleElementAlt ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2377:1: (this_ElementDef_0= ruleElementDef | this_ElementAlt_1= ruleElementAlt )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2377:1: (this_ElementDef_0= ruleElementDef | this_ElementAlt_1= ruleElementAlt )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2378:5: this_ElementDef_0= ruleElementDef
                    {
                     
                            newCompositeNode(grammarAccess.getGraphicalElementAccess().getElementDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementDef_in_ruleGraphicalElement5336);
                    this_ElementDef_0=ruleElementDef();

                    state._fsp--;

                     
                            current = this_ElementDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2388:5: this_ElementAlt_1= ruleElementAlt
                    {
                     
                            newCompositeNode(grammarAccess.getGraphicalElementAccess().getElementAltParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementAlt_in_ruleGraphicalElement5363);
                    this_ElementAlt_1=ruleElementAlt();

                    state._fsp--;

                     
                            current = this_ElementAlt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphicalElement"


    // $ANTLR start "entryRuleElementDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2404:1: entryRuleElementDef returns [EObject current=null] : iv_ruleElementDef= ruleElementDef EOF ;
    public final EObject entryRuleElementDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2405:2: (iv_ruleElementDef= ruleElementDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2406:2: iv_ruleElementDef= ruleElementDef EOF
            {
             newCompositeNode(grammarAccess.getElementDefRule()); 
            pushFollow(FOLLOW_ruleElementDef_in_entryRuleElementDef5398);
            iv_ruleElementDef=ruleElementDef();

            state._fsp--;

             current =iv_ruleElementDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDef5408); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDef"


    // $ANTLR start "ruleElementDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2413:1: ruleElementDef returns [EObject current=null] : (this_NodeDef_0= ruleNodeDef | this_AttLinkDef_1= ruleAttLinkDef ) ;
    public final EObject ruleElementDef() throws RecognitionException {
        EObject current = null;

        EObject this_NodeDef_0 = null;

        EObject this_AttLinkDef_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2416:28: ( (this_NodeDef_0= ruleNodeDef | this_AttLinkDef_1= ruleAttLinkDef ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2417:1: (this_NodeDef_0= ruleNodeDef | this_AttLinkDef_1= ruleAttLinkDef )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2417:1: (this_NodeDef_0= ruleNodeDef | this_AttLinkDef_1= ruleAttLinkDef )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==64||LA17_0==79) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=85 && LA17_0<=87)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2418:5: this_NodeDef_0= ruleNodeDef
                    {
                     
                            newCompositeNode(grammarAccess.getElementDefAccess().getNodeDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeDef_in_ruleElementDef5455);
                    this_NodeDef_0=ruleNodeDef();

                    state._fsp--;

                     
                            current = this_NodeDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2428:5: this_AttLinkDef_1= ruleAttLinkDef
                    {
                     
                            newCompositeNode(grammarAccess.getElementDefAccess().getAttLinkDefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttLinkDef_in_ruleElementDef5482);
                    this_AttLinkDef_1=ruleAttLinkDef();

                    state._fsp--;

                     
                            current = this_AttLinkDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementDef"


    // $ANTLR start "entryRuleNodeDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2444:1: entryRuleNodeDef returns [EObject current=null] : iv_ruleNodeDef= ruleNodeDef EOF ;
    public final EObject entryRuleNodeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2445:2: (iv_ruleNodeDef= ruleNodeDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2446:2: iv_ruleNodeDef= ruleNodeDef EOF
            {
             newCompositeNode(grammarAccess.getNodeDefRule()); 
            pushFollow(FOLLOW_ruleNodeDef_in_entryRuleNodeDef5517);
            iv_ruleNodeDef=ruleNodeDef();

            state._fsp--;

             current =iv_ruleNodeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDef5527); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeDef"


    // $ANTLR start "ruleNodeDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2453:1: ruleNodeDef returns [EObject current=null] : (this_NodeElementDef_0= ruleNodeElementDef | this_NodeLinkDef_1= ruleNodeLinkDef ) ;
    public final EObject ruleNodeDef() throws RecognitionException {
        EObject current = null;

        EObject this_NodeElementDef_0 = null;

        EObject this_NodeLinkDef_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2456:28: ( (this_NodeElementDef_0= ruleNodeElementDef | this_NodeLinkDef_1= ruleNodeLinkDef ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2457:1: (this_NodeElementDef_0= ruleNodeElementDef | this_NodeLinkDef_1= ruleNodeLinkDef )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2457:1: (this_NodeElementDef_0= ruleNodeElementDef | this_NodeLinkDef_1= ruleNodeLinkDef )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==64) ) {
                alt18=1;
            }
            else if ( (LA18_0==79) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2458:5: this_NodeElementDef_0= ruleNodeElementDef
                    {
                     
                            newCompositeNode(grammarAccess.getNodeDefAccess().getNodeElementDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeElementDef_in_ruleNodeDef5574);
                    this_NodeElementDef_0=ruleNodeElementDef();

                    state._fsp--;

                     
                            current = this_NodeElementDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2468:5: this_NodeLinkDef_1= ruleNodeLinkDef
                    {
                     
                            newCompositeNode(grammarAccess.getNodeDefAccess().getNodeLinkDefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNodeLinkDef_in_ruleNodeDef5601);
                    this_NodeLinkDef_1=ruleNodeLinkDef();

                    state._fsp--;

                     
                            current = this_NodeLinkDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeDef"


    // $ANTLR start "entryRuleAttLinkDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2484:1: entryRuleAttLinkDef returns [EObject current=null] : iv_ruleAttLinkDef= ruleAttLinkDef EOF ;
    public final EObject entryRuleAttLinkDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttLinkDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2485:2: (iv_ruleAttLinkDef= ruleAttLinkDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2486:2: iv_ruleAttLinkDef= ruleAttLinkDef EOF
            {
             newCompositeNode(grammarAccess.getAttLinkDefRule()); 
            pushFollow(FOLLOW_ruleAttLinkDef_in_entryRuleAttLinkDef5636);
            iv_ruleAttLinkDef=ruleAttLinkDef();

            state._fsp--;

             current =iv_ruleAttLinkDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttLinkDef5646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttLinkDef"


    // $ANTLR start "ruleAttLinkDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2493:1: ruleAttLinkDef returns [EObject current=null] : (this_NodeLineDef_0= ruleNodeLineDef | this_InterNodeDef_1= ruleInterNodeDef | this_ExternalNodeDef_2= ruleExternalNodeDef ) ;
    public final EObject ruleAttLinkDef() throws RecognitionException {
        EObject current = null;

        EObject this_NodeLineDef_0 = null;

        EObject this_InterNodeDef_1 = null;

        EObject this_ExternalNodeDef_2 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2496:28: ( (this_NodeLineDef_0= ruleNodeLineDef | this_InterNodeDef_1= ruleInterNodeDef | this_ExternalNodeDef_2= ruleExternalNodeDef ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2497:1: (this_NodeLineDef_0= ruleNodeLineDef | this_InterNodeDef_1= ruleInterNodeDef | this_ExternalNodeDef_2= ruleExternalNodeDef )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2497:1: (this_NodeLineDef_0= ruleNodeLineDef | this_InterNodeDef_1= ruleInterNodeDef | this_ExternalNodeDef_2= ruleExternalNodeDef )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt19=1;
                }
                break;
            case 86:
                {
                alt19=2;
                }
                break;
            case 87:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2498:5: this_NodeLineDef_0= ruleNodeLineDef
                    {
                     
                            newCompositeNode(grammarAccess.getAttLinkDefAccess().getNodeLineDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeLineDef_in_ruleAttLinkDef5693);
                    this_NodeLineDef_0=ruleNodeLineDef();

                    state._fsp--;

                     
                            current = this_NodeLineDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2508:5: this_InterNodeDef_1= ruleInterNodeDef
                    {
                     
                            newCompositeNode(grammarAccess.getAttLinkDefAccess().getInterNodeDefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterNodeDef_in_ruleAttLinkDef5720);
                    this_InterNodeDef_1=ruleInterNodeDef();

                    state._fsp--;

                     
                            current = this_InterNodeDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2518:5: this_ExternalNodeDef_2= ruleExternalNodeDef
                    {
                     
                            newCompositeNode(grammarAccess.getAttLinkDefAccess().getExternalNodeDefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternalNodeDef_in_ruleAttLinkDef5747);
                    this_ExternalNodeDef_2=ruleExternalNodeDef();

                    state._fsp--;

                     
                            current = this_ExternalNodeDef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttLinkDef"


    // $ANTLR start "entryRuleElementAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2534:1: entryRuleElementAlt returns [EObject current=null] : iv_ruleElementAlt= ruleElementAlt EOF ;
    public final EObject entryRuleElementAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2535:2: (iv_ruleElementAlt= ruleElementAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2536:2: iv_ruleElementAlt= ruleElementAlt EOF
            {
             newCompositeNode(grammarAccess.getElementAltRule()); 
            pushFollow(FOLLOW_ruleElementAlt_in_entryRuleElementAlt5782);
            iv_ruleElementAlt=ruleElementAlt();

            state._fsp--;

             current =iv_ruleElementAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementAlt5792); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementAlt"


    // $ANTLR start "ruleElementAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2543:1: ruleElementAlt returns [EObject current=null] : (this_NodeAlt_0= ruleNodeAlt | this_AttLinkAlt_1= ruleAttLinkAlt ) ;
    public final EObject ruleElementAlt() throws RecognitionException {
        EObject current = null;

        EObject this_NodeAlt_0 = null;

        EObject this_AttLinkAlt_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2546:28: ( (this_NodeAlt_0= ruleNodeAlt | this_AttLinkAlt_1= ruleAttLinkAlt ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2547:1: (this_NodeAlt_0= ruleNodeAlt | this_AttLinkAlt_1= ruleAttLinkAlt )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2547:1: (this_NodeAlt_0= ruleNodeAlt | this_AttLinkAlt_1= ruleAttLinkAlt )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==64||LA20_0==79) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=85 && LA20_0<=87)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2548:5: this_NodeAlt_0= ruleNodeAlt
                    {
                     
                            newCompositeNode(grammarAccess.getElementAltAccess().getNodeAltParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeAlt_in_ruleElementAlt5839);
                    this_NodeAlt_0=ruleNodeAlt();

                    state._fsp--;

                     
                            current = this_NodeAlt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2558:5: this_AttLinkAlt_1= ruleAttLinkAlt
                    {
                     
                            newCompositeNode(grammarAccess.getElementAltAccess().getAttLinkAltParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttLinkAlt_in_ruleElementAlt5866);
                    this_AttLinkAlt_1=ruleAttLinkAlt();

                    state._fsp--;

                     
                            current = this_AttLinkAlt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementAlt"


    // $ANTLR start "entryRuleNodeAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2574:1: entryRuleNodeAlt returns [EObject current=null] : iv_ruleNodeAlt= ruleNodeAlt EOF ;
    public final EObject entryRuleNodeAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2575:2: (iv_ruleNodeAlt= ruleNodeAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2576:2: iv_ruleNodeAlt= ruleNodeAlt EOF
            {
             newCompositeNode(grammarAccess.getNodeAltRule()); 
            pushFollow(FOLLOW_ruleNodeAlt_in_entryRuleNodeAlt5901);
            iv_ruleNodeAlt=ruleNodeAlt();

            state._fsp--;

             current =iv_ruleNodeAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAlt5911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeAlt"


    // $ANTLR start "ruleNodeAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2583:1: ruleNodeAlt returns [EObject current=null] : (this_NodeElementAlt_0= ruleNodeElementAlt | this_NodeLinkAlt_1= ruleNodeLinkAlt ) ;
    public final EObject ruleNodeAlt() throws RecognitionException {
        EObject current = null;

        EObject this_NodeElementAlt_0 = null;

        EObject this_NodeLinkAlt_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2586:28: ( (this_NodeElementAlt_0= ruleNodeElementAlt | this_NodeLinkAlt_1= ruleNodeLinkAlt ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2587:1: (this_NodeElementAlt_0= ruleNodeElementAlt | this_NodeLinkAlt_1= ruleNodeLinkAlt )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2587:1: (this_NodeElementAlt_0= ruleNodeElementAlt | this_NodeLinkAlt_1= ruleNodeLinkAlt )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==64) ) {
                alt21=1;
            }
            else if ( (LA21_0==79) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2588:5: this_NodeElementAlt_0= ruleNodeElementAlt
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAltAccess().getNodeElementAltParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeElementAlt_in_ruleNodeAlt5958);
                    this_NodeElementAlt_0=ruleNodeElementAlt();

                    state._fsp--;

                     
                            current = this_NodeElementAlt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2598:5: this_NodeLinkAlt_1= ruleNodeLinkAlt
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAltAccess().getNodeLinkAltParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNodeLinkAlt_in_ruleNodeAlt5985);
                    this_NodeLinkAlt_1=ruleNodeLinkAlt();

                    state._fsp--;

                     
                            current = this_NodeLinkAlt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeAlt"


    // $ANTLR start "entryRuleAttLinkAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2614:1: entryRuleAttLinkAlt returns [EObject current=null] : iv_ruleAttLinkAlt= ruleAttLinkAlt EOF ;
    public final EObject entryRuleAttLinkAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttLinkAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2615:2: (iv_ruleAttLinkAlt= ruleAttLinkAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2616:2: iv_ruleAttLinkAlt= ruleAttLinkAlt EOF
            {
             newCompositeNode(grammarAccess.getAttLinkAltRule()); 
            pushFollow(FOLLOW_ruleAttLinkAlt_in_entryRuleAttLinkAlt6020);
            iv_ruleAttLinkAlt=ruleAttLinkAlt();

            state._fsp--;

             current =iv_ruleAttLinkAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttLinkAlt6030); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttLinkAlt"


    // $ANTLR start "ruleAttLinkAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2623:1: ruleAttLinkAlt returns [EObject current=null] : (this_NodeLineAlt_0= ruleNodeLineAlt | this_InterNodeAlt_1= ruleInterNodeAlt | this_ExternalNodeAlt_2= ruleExternalNodeAlt ) ;
    public final EObject ruleAttLinkAlt() throws RecognitionException {
        EObject current = null;

        EObject this_NodeLineAlt_0 = null;

        EObject this_InterNodeAlt_1 = null;

        EObject this_ExternalNodeAlt_2 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2626:28: ( (this_NodeLineAlt_0= ruleNodeLineAlt | this_InterNodeAlt_1= ruleInterNodeAlt | this_ExternalNodeAlt_2= ruleExternalNodeAlt ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2627:1: (this_NodeLineAlt_0= ruleNodeLineAlt | this_InterNodeAlt_1= ruleInterNodeAlt | this_ExternalNodeAlt_2= ruleExternalNodeAlt )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2627:1: (this_NodeLineAlt_0= ruleNodeLineAlt | this_InterNodeAlt_1= ruleInterNodeAlt | this_ExternalNodeAlt_2= ruleExternalNodeAlt )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt22=1;
                }
                break;
            case 86:
                {
                alt22=2;
                }
                break;
            case 87:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2628:5: this_NodeLineAlt_0= ruleNodeLineAlt
                    {
                     
                            newCompositeNode(grammarAccess.getAttLinkAltAccess().getNodeLineAltParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeLineAlt_in_ruleAttLinkAlt6077);
                    this_NodeLineAlt_0=ruleNodeLineAlt();

                    state._fsp--;

                     
                            current = this_NodeLineAlt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2638:5: this_InterNodeAlt_1= ruleInterNodeAlt
                    {
                     
                            newCompositeNode(grammarAccess.getAttLinkAltAccess().getInterNodeAltParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterNodeAlt_in_ruleAttLinkAlt6104);
                    this_InterNodeAlt_1=ruleInterNodeAlt();

                    state._fsp--;

                     
                            current = this_InterNodeAlt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2648:5: this_ExternalNodeAlt_2= ruleExternalNodeAlt
                    {
                     
                            newCompositeNode(grammarAccess.getAttLinkAltAccess().getExternalNodeAltParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternalNodeAlt_in_ruleAttLinkAlt6131);
                    this_ExternalNodeAlt_2=ruleExternalNodeAlt();

                    state._fsp--;

                     
                            current = this_ExternalNodeAlt_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttLinkAlt"


    // $ANTLR start "entryRuleNodeElementDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2664:1: entryRuleNodeElementDef returns [EObject current=null] : iv_ruleNodeElementDef= ruleNodeElementDef EOF ;
    public final EObject entryRuleNodeElementDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeElementDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2665:2: (iv_ruleNodeElementDef= ruleNodeElementDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2666:2: iv_ruleNodeElementDef= ruleNodeElementDef EOF
            {
             newCompositeNode(grammarAccess.getNodeElementDefRule()); 
            pushFollow(FOLLOW_ruleNodeElementDef_in_entryRuleNodeElementDef6166);
            iv_ruleNodeElementDef=ruleNodeElementDef();

            state._fsp--;

             current =iv_ruleNodeElementDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeElementDef6176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeElementDef"


    // $ANTLR start "ruleNodeElementDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2673:1: ruleNodeElementDef returns [EObject current=null] : (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'label' otherlv_8= 'icon' ( (lv_labelIcon_9_0= ruleEBoolean ) ) otherlv_10= 'label' otherlv_11= 'placement' ( (lv_labelPlacement_12_0= ruleLabelPosition ) ) otherlv_13= 'size' ( (lv_size_14_0= ruleSize ) ) ( (lv_figure_15_0= ruleFigure ) ) otherlv_16= 'phantom' ( (lv_phantomN_17_0= ruleEBoolean ) ) otherlv_18= '}' ) ;
    public final EObject ruleNodeElementDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_referenceClass_3_0 = null;

        AntlrDatatypeRuleToken lv_labelIcon_9_0 = null;

        EObject lv_labelPlacement_12_0 = null;

        EObject lv_size_14_0 = null;

        EObject lv_figure_15_0 = null;

        AntlrDatatypeRuleToken lv_phantomN_17_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2676:28: ( (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'label' otherlv_8= 'icon' ( (lv_labelIcon_9_0= ruleEBoolean ) ) otherlv_10= 'label' otherlv_11= 'placement' ( (lv_labelPlacement_12_0= ruleLabelPosition ) ) otherlv_13= 'size' ( (lv_size_14_0= ruleSize ) ) ( (lv_figure_15_0= ruleFigure ) ) otherlv_16= 'phantom' ( (lv_phantomN_17_0= ruleEBoolean ) ) otherlv_18= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2677:1: (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'label' otherlv_8= 'icon' ( (lv_labelIcon_9_0= ruleEBoolean ) ) otherlv_10= 'label' otherlv_11= 'placement' ( (lv_labelPlacement_12_0= ruleLabelPosition ) ) otherlv_13= 'size' ( (lv_size_14_0= ruleSize ) ) ( (lv_figure_15_0= ruleFigure ) ) otherlv_16= 'phantom' ( (lv_phantomN_17_0= ruleEBoolean ) ) otherlv_18= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2677:1: (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'label' otherlv_8= 'icon' ( (lv_labelIcon_9_0= ruleEBoolean ) ) otherlv_10= 'label' otherlv_11= 'placement' ( (lv_labelPlacement_12_0= ruleLabelPosition ) ) otherlv_13= 'size' ( (lv_size_14_0= ruleSize ) ) ( (lv_figure_15_0= ruleFigure ) ) otherlv_16= 'phantom' ( (lv_phantomN_17_0= ruleEBoolean ) ) otherlv_18= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2677:3: otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'label' otherlv_8= 'icon' ( (lv_labelIcon_9_0= ruleEBoolean ) ) otherlv_10= 'label' otherlv_11= 'placement' ( (lv_labelPlacement_12_0= ruleLabelPosition ) ) otherlv_13= 'size' ( (lv_size_14_0= ruleSize ) ) ( (lv_figure_15_0= ruleFigure ) ) otherlv_16= 'phantom' ( (lv_phantomN_17_0= ruleEBoolean ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleNodeElementDef6213); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeElementDefAccess().getNode_elementKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2681:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2682:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2682:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2683:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeElementDef6230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeElementDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeElementDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleNodeElementDef6247); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeElementDefAccess().getForKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2703:1: ( (lv_referenceClass_3_0= ruleClassReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2704:1: (lv_referenceClass_3_0= ruleClassReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2704:1: (lv_referenceClass_3_0= ruleClassReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2705:3: lv_referenceClass_3_0= ruleClassReference
            {
             
            	        newCompositeNode(grammarAccess.getNodeElementDefAccess().getReferenceClassClassReferenceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleClassReference_in_ruleNodeElementDef6268);
            lv_referenceClass_3_0=ruleClassReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeElementDefRule());
            	        }
                   		set(
                   			current, 
                   			"referenceClass",
                    		lv_referenceClass_3_0, 
                    		"ClassReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNodeElementDef6280); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeElementDefAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleNodeElementDef6292); 

                	newLeafNode(otherlv_5, grammarAccess.getNodeElementDefAccess().getLabelKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2729:1: ( (lv_label_6_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2730:1: (lv_label_6_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2730:1: (lv_label_6_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2731:3: lv_label_6_0= RULE_ID
            {
            lv_label_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeElementDef6309); 

            			newLeafNode(lv_label_6_0, grammarAccess.getNodeElementDefAccess().getLabelIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeElementDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,66,FOLLOW_66_in_ruleNodeElementDef6326); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeElementDefAccess().getLabelKeyword_7());
                
            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleNodeElementDef6338); 

                	newLeafNode(otherlv_8, grammarAccess.getNodeElementDefAccess().getIconKeyword_8());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2755:1: ( (lv_labelIcon_9_0= ruleEBoolean ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2756:1: (lv_labelIcon_9_0= ruleEBoolean )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2756:1: (lv_labelIcon_9_0= ruleEBoolean )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2757:3: lv_labelIcon_9_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getNodeElementDefAccess().getLabelIconEBooleanParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleEBoolean_in_ruleNodeElementDef6359);
            lv_labelIcon_9_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeElementDefRule());
            	        }
                   		set(
                   			current, 
                   			"labelIcon",
                    		lv_labelIcon_9_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,66,FOLLOW_66_in_ruleNodeElementDef6371); 

                	newLeafNode(otherlv_10, grammarAccess.getNodeElementDefAccess().getLabelKeyword_10());
                
            otherlv_11=(Token)match(input,67,FOLLOW_67_in_ruleNodeElementDef6383); 

                	newLeafNode(otherlv_11, grammarAccess.getNodeElementDefAccess().getPlacementKeyword_11());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2781:1: ( (lv_labelPlacement_12_0= ruleLabelPosition ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2782:1: (lv_labelPlacement_12_0= ruleLabelPosition )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2782:1: (lv_labelPlacement_12_0= ruleLabelPosition )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2783:3: lv_labelPlacement_12_0= ruleLabelPosition
            {
             
            	        newCompositeNode(grammarAccess.getNodeElementDefAccess().getLabelPlacementLabelPositionParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleLabelPosition_in_ruleNodeElementDef6404);
            lv_labelPlacement_12_0=ruleLabelPosition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeElementDefRule());
            	        }
                   		set(
                   			current, 
                   			"labelPlacement",
                    		lv_labelPlacement_12_0, 
                    		"LabelPosition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,68,FOLLOW_68_in_ruleNodeElementDef6416); 

                	newLeafNode(otherlv_13, grammarAccess.getNodeElementDefAccess().getSizeKeyword_13());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2803:1: ( (lv_size_14_0= ruleSize ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2804:1: (lv_size_14_0= ruleSize )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2804:1: (lv_size_14_0= ruleSize )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2805:3: lv_size_14_0= ruleSize
            {
             
            	        newCompositeNode(grammarAccess.getNodeElementDefAccess().getSizeSizeParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleSize_in_ruleNodeElementDef6437);
            lv_size_14_0=ruleSize();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeElementDefRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_14_0, 
                    		"Size");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2821:2: ( (lv_figure_15_0= ruleFigure ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2822:1: (lv_figure_15_0= ruleFigure )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2822:1: (lv_figure_15_0= ruleFigure )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2823:3: lv_figure_15_0= ruleFigure
            {
             
            	        newCompositeNode(grammarAccess.getNodeElementDefAccess().getFigureFigureParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleFigure_in_ruleNodeElementDef6458);
            lv_figure_15_0=ruleFigure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeElementDefRule());
            	        }
                   		set(
                   			current, 
                   			"figure",
                    		lv_figure_15_0, 
                    		"Figure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,69,FOLLOW_69_in_ruleNodeElementDef6470); 

                	newLeafNode(otherlv_16, grammarAccess.getNodeElementDefAccess().getPhantomKeyword_16());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2843:1: ( (lv_phantomN_17_0= ruleEBoolean ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2844:1: (lv_phantomN_17_0= ruleEBoolean )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2844:1: (lv_phantomN_17_0= ruleEBoolean )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2845:3: lv_phantomN_17_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getNodeElementDefAccess().getPhantomNEBooleanParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleEBoolean_in_ruleNodeElementDef6491);
            lv_phantomN_17_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeElementDefRule());
            	        }
                   		set(
                   			current, 
                   			"phantomN",
                    		lv_phantomN_17_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleNodeElementDef6503); 

                	newLeafNode(otherlv_18, grammarAccess.getNodeElementDefAccess().getRightCurlyBracketKeyword_18());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeElementDef"


    // $ANTLR start "entryRuleNodeElementAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2873:1: entryRuleNodeElementAlt returns [EObject current=null] : iv_ruleNodeElementAlt= ruleNodeElementAlt EOF ;
    public final EObject entryRuleNodeElementAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeElementAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2874:2: (iv_ruleNodeElementAlt= ruleNodeElementAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2875:2: iv_ruleNodeElementAlt= ruleNodeElementAlt EOF
            {
             newCompositeNode(grammarAccess.getNodeElementAltRule()); 
            pushFollow(FOLLOW_ruleNodeElementAlt_in_entryRuleNodeElementAlt6539);
            iv_ruleNodeElementAlt=ruleNodeElementAlt();

            state._fsp--;

             current =iv_ruleNodeElementAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeElementAlt6549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeElementAlt"


    // $ANTLR start "ruleNodeElementAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2882:1: ruleNodeElementAlt returns [EObject current=null] : (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'label' otherlv_6= 'placement' ( (lv_labelPlacement_7_0= ruleLabelPosition ) ) )? ( (lv_figure_8_0= ruleFigure ) )? (otherlv_9= 'size' ( (lv_size_10_0= ruleSize ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleNodeElementAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_labelPlacement_7_0 = null;

        EObject lv_figure_8_0 = null;

        EObject lv_size_10_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2885:28: ( (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'label' otherlv_6= 'placement' ( (lv_labelPlacement_7_0= ruleLabelPosition ) ) )? ( (lv_figure_8_0= ruleFigure ) )? (otherlv_9= 'size' ( (lv_size_10_0= ruleSize ) ) )? otherlv_11= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2886:1: (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'label' otherlv_6= 'placement' ( (lv_labelPlacement_7_0= ruleLabelPosition ) ) )? ( (lv_figure_8_0= ruleFigure ) )? (otherlv_9= 'size' ( (lv_size_10_0= ruleSize ) ) )? otherlv_11= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2886:1: (otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'label' otherlv_6= 'placement' ( (lv_labelPlacement_7_0= ruleLabelPosition ) ) )? ( (lv_figure_8_0= ruleFigure ) )? (otherlv_9= 'size' ( (lv_size_10_0= ruleSize ) ) )? otherlv_11= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2886:3: otherlv_0= 'Node_element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'label' otherlv_6= 'placement' ( (lv_labelPlacement_7_0= ruleLabelPosition ) ) )? ( (lv_figure_8_0= ruleFigure ) )? (otherlv_9= 'size' ( (lv_size_10_0= ruleSize ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleNodeElementAlt6586); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeElementAltAccess().getNode_elementKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2890:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2891:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2891:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2892:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeElementAlt6603); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeElementAltAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeElementAltRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleNodeElementAlt6620); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeElementAltAccess().getExtendsKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2912:1: ( (otherlv_3= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2913:1: (otherlv_3= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2913:1: (otherlv_3= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2914:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeElementAltRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeElementAlt6640); 

            		newLeafNode(otherlv_3, grammarAccess.getNodeElementAltAccess().getParentNodeElementDefCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNodeElementAlt6652); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeElementAltAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2929:1: (otherlv_5= 'label' otherlv_6= 'placement' ( (lv_labelPlacement_7_0= ruleLabelPosition ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2929:3: otherlv_5= 'label' otherlv_6= 'placement' ( (lv_labelPlacement_7_0= ruleLabelPosition ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleNodeElementAlt6665); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeElementAltAccess().getLabelKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleNodeElementAlt6677); 

                        	newLeafNode(otherlv_6, grammarAccess.getNodeElementAltAccess().getPlacementKeyword_5_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2937:1: ( (lv_labelPlacement_7_0= ruleLabelPosition ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2938:1: (lv_labelPlacement_7_0= ruleLabelPosition )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2938:1: (lv_labelPlacement_7_0= ruleLabelPosition )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2939:3: lv_labelPlacement_7_0= ruleLabelPosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeElementAltAccess().getLabelPlacementLabelPositionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelPosition_in_ruleNodeElementAlt6698);
                    lv_labelPlacement_7_0=ruleLabelPosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeElementAltRule());
                    	        }
                           		set(
                           			current, 
                           			"labelPlacement",
                            		lv_labelPlacement_7_0, 
                            		"LabelPosition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2955:4: ( (lv_figure_8_0= ruleFigure ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==71||LA24_0==76||LA24_0==78) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2956:1: (lv_figure_8_0= ruleFigure )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2956:1: (lv_figure_8_0= ruleFigure )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2957:3: lv_figure_8_0= ruleFigure
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeElementAltAccess().getFigureFigureParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFigure_in_ruleNodeElementAlt6721);
                    lv_figure_8_0=ruleFigure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeElementAltRule());
                    	        }
                           		set(
                           			current, 
                           			"figure",
                            		lv_figure_8_0, 
                            		"Figure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2973:3: (otherlv_9= 'size' ( (lv_size_10_0= ruleSize ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==68) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2973:5: otherlv_9= 'size' ( (lv_size_10_0= ruleSize ) )
                    {
                    otherlv_9=(Token)match(input,68,FOLLOW_68_in_ruleNodeElementAlt6735); 

                        	newLeafNode(otherlv_9, grammarAccess.getNodeElementAltAccess().getSizeKeyword_7_0());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2977:1: ( (lv_size_10_0= ruleSize ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2978:1: (lv_size_10_0= ruleSize )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2978:1: (lv_size_10_0= ruleSize )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:2979:3: lv_size_10_0= ruleSize
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeElementAltAccess().getSizeSizeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSize_in_ruleNodeElementAlt6756);
                    lv_size_10_0=ruleSize();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeElementAltRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_10_0, 
                            		"Size");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleNodeElementAlt6770); 

                	newLeafNode(otherlv_11, grammarAccess.getNodeElementAltAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeElementAlt"


    // $ANTLR start "entryRuleFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3007:1: entryRuleFigure returns [EObject current=null] : iv_ruleFigure= ruleFigure EOF ;
    public final EObject entryRuleFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigure = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3008:2: (iv_ruleFigure= ruleFigure EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3009:2: iv_ruleFigure= ruleFigure EOF
            {
             newCompositeNode(grammarAccess.getFigureRule()); 
            pushFollow(FOLLOW_ruleFigure_in_entryRuleFigure6806);
            iv_ruleFigure=ruleFigure();

            state._fsp--;

             current =iv_ruleFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFigure6816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFigure"


    // $ANTLR start "ruleFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3016:1: ruleFigure returns [EObject current=null] : (this_RegularFigure_0= ruleRegularFigure | this_ImageFigure_1= ruleImageFigure | this_ComplexFigure_2= ruleComplexFigure ) ;
    public final EObject ruleFigure() throws RecognitionException {
        EObject current = null;

        EObject this_RegularFigure_0 = null;

        EObject this_ImageFigure_1 = null;

        EObject this_ComplexFigure_2 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3019:28: ( (this_RegularFigure_0= ruleRegularFigure | this_ImageFigure_1= ruleImageFigure | this_ComplexFigure_2= ruleComplexFigure ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3020:1: (this_RegularFigure_0= ruleRegularFigure | this_ImageFigure_1= ruleImageFigure | this_ComplexFigure_2= ruleComplexFigure )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3020:1: (this_RegularFigure_0= ruleRegularFigure | this_ImageFigure_1= ruleImageFigure | this_ComplexFigure_2= ruleComplexFigure )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt26=1;
                }
                break;
            case 76:
                {
                alt26=2;
                }
                break;
            case 78:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3021:5: this_RegularFigure_0= ruleRegularFigure
                    {
                     
                            newCompositeNode(grammarAccess.getFigureAccess().getRegularFigureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRegularFigure_in_ruleFigure6863);
                    this_RegularFigure_0=ruleRegularFigure();

                    state._fsp--;

                     
                            current = this_RegularFigure_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3031:5: this_ImageFigure_1= ruleImageFigure
                    {
                     
                            newCompositeNode(grammarAccess.getFigureAccess().getImageFigureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImageFigure_in_ruleFigure6890);
                    this_ImageFigure_1=ruleImageFigure();

                    state._fsp--;

                     
                            current = this_ImageFigure_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3041:5: this_ComplexFigure_2= ruleComplexFigure
                    {
                     
                            newCompositeNode(grammarAccess.getFigureAccess().getComplexFigureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleComplexFigure_in_ruleFigure6917);
                    this_ComplexFigure_2=ruleComplexFigure();

                    state._fsp--;

                     
                            current = this_ComplexFigure_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigure"


    // $ANTLR start "entryRuleRegularFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3057:1: entryRuleRegularFigure returns [EObject current=null] : iv_ruleRegularFigure= ruleRegularFigure EOF ;
    public final EObject entryRuleRegularFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularFigure = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3058:2: (iv_ruleRegularFigure= ruleRegularFigure EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3059:2: iv_ruleRegularFigure= ruleRegularFigure EOF
            {
             newCompositeNode(grammarAccess.getRegularFigureRule()); 
            pushFollow(FOLLOW_ruleRegularFigure_in_entryRuleRegularFigure6952);
            iv_ruleRegularFigure=ruleRegularFigure();

            state._fsp--;

             current =iv_ruleRegularFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularFigure6962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularFigure"


    // $ANTLR start "ruleRegularFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3066:1: ruleRegularFigure returns [EObject current=null] : ( () otherlv_1= 'Regular figure extends' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'background color' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'border' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'icon' otherlv_9= 'path' ( (lv_path_10_0= RULE_STRING ) ) otherlv_11= 'icon' otherlv_12= 'size' ( (lv_size_13_0= ruleSize ) ) otherlv_14= 'icon' otherlv_15= 'position' ( (lv_position_16_0= rulePoint ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleRegularFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_path_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_size_13_0 = null;

        EObject lv_position_16_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3069:28: ( ( () otherlv_1= 'Regular figure extends' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'background color' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'border' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'icon' otherlv_9= 'path' ( (lv_path_10_0= RULE_STRING ) ) otherlv_11= 'icon' otherlv_12= 'size' ( (lv_size_13_0= ruleSize ) ) otherlv_14= 'icon' otherlv_15= 'position' ( (lv_position_16_0= rulePoint ) ) )? otherlv_17= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3070:1: ( () otherlv_1= 'Regular figure extends' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'background color' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'border' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'icon' otherlv_9= 'path' ( (lv_path_10_0= RULE_STRING ) ) otherlv_11= 'icon' otherlv_12= 'size' ( (lv_size_13_0= ruleSize ) ) otherlv_14= 'icon' otherlv_15= 'position' ( (lv_position_16_0= rulePoint ) ) )? otherlv_17= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3070:1: ( () otherlv_1= 'Regular figure extends' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'background color' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'border' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'icon' otherlv_9= 'path' ( (lv_path_10_0= RULE_STRING ) ) otherlv_11= 'icon' otherlv_12= 'size' ( (lv_size_13_0= ruleSize ) ) otherlv_14= 'icon' otherlv_15= 'position' ( (lv_position_16_0= rulePoint ) ) )? otherlv_17= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3070:2: () otherlv_1= 'Regular figure extends' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'background color' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'border' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'icon' otherlv_9= 'path' ( (lv_path_10_0= RULE_STRING ) ) otherlv_11= 'icon' otherlv_12= 'size' ( (lv_size_13_0= ruleSize ) ) otherlv_14= 'icon' otherlv_15= 'position' ( (lv_position_16_0= rulePoint ) ) )? otherlv_17= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3070:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3071:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRegularFigureAccess().getRegularFigureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleRegularFigure7008); 

                	newLeafNode(otherlv_1, grammarAccess.getRegularFigureAccess().getRegularFigureExtendsKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3080:1: ( (otherlv_2= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3081:1: (otherlv_2= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3081:1: (otherlv_2= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3082:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegularFigureRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegularFigure7028); 

            		newLeafNode(otherlv_2, grammarAccess.getRegularFigureAccess().getFigureStyleFigureStyleCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRegularFigure7040); 

                	newLeafNode(otherlv_3, grammarAccess.getRegularFigureAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleRegularFigure7052); 

                	newLeafNode(otherlv_4, grammarAccess.getRegularFigureAccess().getBackgroundColorKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3101:1: ( (otherlv_5= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3102:1: (otherlv_5= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3102:1: (otherlv_5= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3103:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegularFigureRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegularFigure7072); 

            		newLeafNode(otherlv_5, grammarAccess.getRegularFigureAccess().getBacgroundColorColorCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleRegularFigure7084); 

                	newLeafNode(otherlv_6, grammarAccess.getRegularFigureAccess().getBorderKeyword_6());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3118:1: ( (otherlv_7= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3119:1: (otherlv_7= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3119:1: (otherlv_7= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3120:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegularFigureRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegularFigure7104); 

            		newLeafNode(otherlv_7, grammarAccess.getRegularFigureAccess().getBorderLineStyleCrossReference_7_0()); 
            	

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3131:2: (otherlv_8= 'icon' otherlv_9= 'path' ( (lv_path_10_0= RULE_STRING ) ) otherlv_11= 'icon' otherlv_12= 'size' ( (lv_size_13_0= ruleSize ) ) otherlv_14= 'icon' otherlv_15= 'position' ( (lv_position_16_0= rulePoint ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3131:4: otherlv_8= 'icon' otherlv_9= 'path' ( (lv_path_10_0= RULE_STRING ) ) otherlv_11= 'icon' otherlv_12= 'size' ( (lv_size_13_0= ruleSize ) ) otherlv_14= 'icon' otherlv_15= 'position' ( (lv_position_16_0= rulePoint ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleRegularFigure7117); 

                        	newLeafNode(otherlv_8, grammarAccess.getRegularFigureAccess().getIconKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleRegularFigure7129); 

                        	newLeafNode(otherlv_9, grammarAccess.getRegularFigureAccess().getPathKeyword_8_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3139:1: ( (lv_path_10_0= RULE_STRING ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3140:1: (lv_path_10_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3140:1: (lv_path_10_0= RULE_STRING )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3141:3: lv_path_10_0= RULE_STRING
                    {
                    lv_path_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegularFigure7146); 

                    			newLeafNode(lv_path_10_0, grammarAccess.getRegularFigureAccess().getPathSTRINGTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRegularFigureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"path",
                            		lv_path_10_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleRegularFigure7163); 

                        	newLeafNode(otherlv_11, grammarAccess.getRegularFigureAccess().getIconKeyword_8_3());
                        
                    otherlv_12=(Token)match(input,68,FOLLOW_68_in_ruleRegularFigure7175); 

                        	newLeafNode(otherlv_12, grammarAccess.getRegularFigureAccess().getSizeKeyword_8_4());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3165:1: ( (lv_size_13_0= ruleSize ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3166:1: (lv_size_13_0= ruleSize )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3166:1: (lv_size_13_0= ruleSize )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3167:3: lv_size_13_0= ruleSize
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularFigureAccess().getSizeSizeParserRuleCall_8_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSize_in_ruleRegularFigure7196);
                    lv_size_13_0=ruleSize();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularFigureRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_13_0, 
                            		"Size");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleRegularFigure7208); 

                        	newLeafNode(otherlv_14, grammarAccess.getRegularFigureAccess().getIconKeyword_8_6());
                        
                    otherlv_15=(Token)match(input,75,FOLLOW_75_in_ruleRegularFigure7220); 

                        	newLeafNode(otherlv_15, grammarAccess.getRegularFigureAccess().getPositionKeyword_8_7());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3191:1: ( (lv_position_16_0= rulePoint ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3192:1: (lv_position_16_0= rulePoint )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3192:1: (lv_position_16_0= rulePoint )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3193:3: lv_position_16_0= rulePoint
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularFigureAccess().getPositionPointParserRuleCall_8_8_0()); 
                    	    
                    pushFollow(FOLLOW_rulePoint_in_ruleRegularFigure7241);
                    lv_position_16_0=rulePoint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularFigureRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_16_0, 
                            		"Point");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleRegularFigure7255); 

                	newLeafNode(otherlv_17, grammarAccess.getRegularFigureAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularFigure"


    // $ANTLR start "entryRuleImageFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3221:1: entryRuleImageFigure returns [EObject current=null] : iv_ruleImageFigure= ruleImageFigure EOF ;
    public final EObject entryRuleImageFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFigure = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3222:2: (iv_ruleImageFigure= ruleImageFigure EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3223:2: iv_ruleImageFigure= ruleImageFigure EOF
            {
             newCompositeNode(grammarAccess.getImageFigureRule()); 
            pushFollow(FOLLOW_ruleImageFigure_in_entryRuleImageFigure7291);
            iv_ruleImageFigure=ruleImageFigure();

            state._fsp--;

             current =iv_ruleImageFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageFigure7301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageFigure"


    // $ANTLR start "ruleImageFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3230:1: ruleImageFigure returns [EObject current=null] : ( () otherlv_1= 'Image figure' otherlv_2= '{' otherlv_3= 'image path' ( (lv_path_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleImageFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3233:28: ( ( () otherlv_1= 'Image figure' otherlv_2= '{' otherlv_3= 'image path' ( (lv_path_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3234:1: ( () otherlv_1= 'Image figure' otherlv_2= '{' otherlv_3= 'image path' ( (lv_path_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3234:1: ( () otherlv_1= 'Image figure' otherlv_2= '{' otherlv_3= 'image path' ( (lv_path_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3234:2: () otherlv_1= 'Image figure' otherlv_2= '{' otherlv_3= 'image path' ( (lv_path_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3234:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3235:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImageFigureAccess().getImageFigureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleImageFigure7347); 

                	newLeafNode(otherlv_1, grammarAccess.getImageFigureAccess().getImageFigureKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImageFigure7359); 

                	newLeafNode(otherlv_2, grammarAccess.getImageFigureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,77,FOLLOW_77_in_ruleImageFigure7371); 

                	newLeafNode(otherlv_3, grammarAccess.getImageFigureAccess().getImagePathKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3252:1: ( (lv_path_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3253:1: (lv_path_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3253:1: (lv_path_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3254:3: lv_path_4_0= RULE_STRING
            {
            lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageFigure7388); 

            			newLeafNode(lv_path_4_0, grammarAccess.getImageFigureAccess().getPathSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageFigureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleImageFigure7405); 

                	newLeafNode(otherlv_5, grammarAccess.getImageFigureAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageFigure"


    // $ANTLR start "entryRuleComplexFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3282:1: entryRuleComplexFigure returns [EObject current=null] : iv_ruleComplexFigure= ruleComplexFigure EOF ;
    public final EObject entryRuleComplexFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexFigure = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3283:2: (iv_ruleComplexFigure= ruleComplexFigure EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3284:2: iv_ruleComplexFigure= ruleComplexFigure EOF
            {
             newCompositeNode(grammarAccess.getComplexFigureRule()); 
            pushFollow(FOLLOW_ruleComplexFigure_in_entryRuleComplexFigure7441);
            iv_ruleComplexFigure=ruleComplexFigure();

            state._fsp--;

             current =iv_ruleComplexFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexFigure7451); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexFigure"


    // $ANTLR start "ruleComplexFigure"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3291:1: ruleComplexFigure returns [EObject current=null] : ( () otherlv_1= 'Complex figure' otherlv_2= '{' otherlv_3= 'class' ( (lv_implementationReference_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleComplexFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_implementationReference_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3294:28: ( ( () otherlv_1= 'Complex figure' otherlv_2= '{' otherlv_3= 'class' ( (lv_implementationReference_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3295:1: ( () otherlv_1= 'Complex figure' otherlv_2= '{' otherlv_3= 'class' ( (lv_implementationReference_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3295:1: ( () otherlv_1= 'Complex figure' otherlv_2= '{' otherlv_3= 'class' ( (lv_implementationReference_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3295:2: () otherlv_1= 'Complex figure' otherlv_2= '{' otherlv_3= 'class' ( (lv_implementationReference_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3295:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3296:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComplexFigureAccess().getComplexFigureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleComplexFigure7497); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexFigureAccess().getComplexFigureKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleComplexFigure7509); 

                	newLeafNode(otherlv_2, grammarAccess.getComplexFigureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleComplexFigure7521); 

                	newLeafNode(otherlv_3, grammarAccess.getComplexFigureAccess().getClassKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3313:1: ( (lv_implementationReference_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3314:1: (lv_implementationReference_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3314:1: (lv_implementationReference_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3315:3: lv_implementationReference_4_0= RULE_STRING
            {
            lv_implementationReference_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComplexFigure7538); 

            			newLeafNode(lv_implementationReference_4_0, grammarAccess.getComplexFigureAccess().getImplementationReferenceSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexFigureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"implementationReference",
                    		lv_implementationReference_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleComplexFigure7555); 

                	newLeafNode(otherlv_5, grammarAccess.getComplexFigureAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexFigure"


    // $ANTLR start "entryRuleNodeLinkDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3343:1: entryRuleNodeLinkDef returns [EObject current=null] : iv_ruleNodeLinkDef= ruleNodeLinkDef EOF ;
    public final EObject entryRuleNodeLinkDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLinkDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3344:2: (iv_ruleNodeLinkDef= ruleNodeLinkDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3345:2: iv_ruleNodeLinkDef= ruleNodeLinkDef EOF
            {
             newCompositeNode(grammarAccess.getNodeLinkDefRule()); 
            pushFollow(FOLLOW_ruleNodeLinkDef_in_entryRuleNodeLinkDef7591);
            iv_ruleNodeLinkDef=ruleNodeLinkDef();

            state._fsp--;

             current =iv_ruleNodeLinkDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeLinkDef7601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeLinkDef"


    // $ANTLR start "ruleNodeLinkDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3352:1: ruleNodeLinkDef returns [EObject current=null] : (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'style' ( (lv_style_8_0= ruleLineStyle ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= 'source' otherlv_16= 'reference' otherlv_17= '<-' ( (lv_sourceReference_18_0= RULE_ID ) ) otherlv_19= 'target' otherlv_20= 'reference' otherlv_21= '<-' ( (lv_targetReference_22_0= RULE_ID ) ) otherlv_23= '}' ) ;
    public final EObject ruleNodeLinkDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_sourceReference_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_targetReference_22_0=null;
        Token otherlv_23=null;
        EObject lv_referenceClass_3_0 = null;

        EObject lv_style_8_0 = null;

        EObject lv_sourceDecoration_11_0 = null;

        EObject lv_targetDecoration_14_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3355:28: ( (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'style' ( (lv_style_8_0= ruleLineStyle ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= 'source' otherlv_16= 'reference' otherlv_17= '<-' ( (lv_sourceReference_18_0= RULE_ID ) ) otherlv_19= 'target' otherlv_20= 'reference' otherlv_21= '<-' ( (lv_targetReference_22_0= RULE_ID ) ) otherlv_23= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3356:1: (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'style' ( (lv_style_8_0= ruleLineStyle ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= 'source' otherlv_16= 'reference' otherlv_17= '<-' ( (lv_sourceReference_18_0= RULE_ID ) ) otherlv_19= 'target' otherlv_20= 'reference' otherlv_21= '<-' ( (lv_targetReference_22_0= RULE_ID ) ) otherlv_23= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3356:1: (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'style' ( (lv_style_8_0= ruleLineStyle ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= 'source' otherlv_16= 'reference' otherlv_17= '<-' ( (lv_sourceReference_18_0= RULE_ID ) ) otherlv_19= 'target' otherlv_20= 'reference' otherlv_21= '<-' ( (lv_targetReference_22_0= RULE_ID ) ) otherlv_23= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3356:3: otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceClass_3_0= ruleClassReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_ID ) ) otherlv_7= 'style' ( (lv_style_8_0= ruleLineStyle ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= 'source' otherlv_16= 'reference' otherlv_17= '<-' ( (lv_sourceReference_18_0= RULE_ID ) ) otherlv_19= 'target' otherlv_20= 'reference' otherlv_21= '<-' ( (lv_targetReference_22_0= RULE_ID ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleNodeLinkDef7638); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeLinkDefAccess().getNode_linkKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3360:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3361:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3361:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3362:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLinkDef7655); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeLinkDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLinkDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleNodeLinkDef7672); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeLinkDefAccess().getForKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3382:1: ( (lv_referenceClass_3_0= ruleClassReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3383:1: (lv_referenceClass_3_0= ruleClassReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3383:1: (lv_referenceClass_3_0= ruleClassReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3384:3: lv_referenceClass_3_0= ruleClassReference
            {
             
            	        newCompositeNode(grammarAccess.getNodeLinkDefAccess().getReferenceClassClassReferenceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleClassReference_in_ruleNodeLinkDef7693);
            lv_referenceClass_3_0=ruleClassReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeLinkDefRule());
            	        }
                   		set(
                   			current, 
                   			"referenceClass",
                    		lv_referenceClass_3_0, 
                    		"ClassReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNodeLinkDef7705); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeLinkDefAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleNodeLinkDef7717); 

                	newLeafNode(otherlv_5, grammarAccess.getNodeLinkDefAccess().getLabelKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3408:1: ( (lv_label_6_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3409:1: (lv_label_6_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3409:1: (lv_label_6_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3410:3: lv_label_6_0= RULE_ID
            {
            lv_label_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLinkDef7734); 

            			newLeafNode(lv_label_6_0, grammarAccess.getNodeLinkDefAccess().getLabelIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLinkDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleNodeLinkDef7751); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeLinkDefAccess().getStyleKeyword_7());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3430:1: ( (lv_style_8_0= ruleLineStyle ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3431:1: (lv_style_8_0= ruleLineStyle )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3431:1: (lv_style_8_0= ruleLineStyle )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3432:3: lv_style_8_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getNodeLinkDefAccess().getStyleLineStyleParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleNodeLinkDef7772);
            lv_style_8_0=ruleLineStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeLinkDefRule());
            	        }
                   		set(
                   			current, 
                   			"style",
                    		lv_style_8_0, 
                    		"LineStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,81,FOLLOW_81_in_ruleNodeLinkDef7784); 

                	newLeafNode(otherlv_9, grammarAccess.getNodeLinkDefAccess().getSourceKeyword_9());
                
            otherlv_10=(Token)match(input,82,FOLLOW_82_in_ruleNodeLinkDef7796); 

                	newLeafNode(otherlv_10, grammarAccess.getNodeLinkDefAccess().getDecorationKeyword_10());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3456:1: ( (lv_sourceDecoration_11_0= ruleLineDecoration ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3457:1: (lv_sourceDecoration_11_0= ruleLineDecoration )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3457:1: (lv_sourceDecoration_11_0= ruleLineDecoration )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3458:3: lv_sourceDecoration_11_0= ruleLineDecoration
            {
             
            	        newCompositeNode(grammarAccess.getNodeLinkDefAccess().getSourceDecorationLineDecorationParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLinkDef7817);
            lv_sourceDecoration_11_0=ruleLineDecoration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeLinkDefRule());
            	        }
                   		set(
                   			current, 
                   			"sourceDecoration",
                    		lv_sourceDecoration_11_0, 
                    		"LineDecoration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,83,FOLLOW_83_in_ruleNodeLinkDef7829); 

                	newLeafNode(otherlv_12, grammarAccess.getNodeLinkDefAccess().getTargetKeyword_12());
                
            otherlv_13=(Token)match(input,82,FOLLOW_82_in_ruleNodeLinkDef7841); 

                	newLeafNode(otherlv_13, grammarAccess.getNodeLinkDefAccess().getDecorationKeyword_13());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3482:1: ( (lv_targetDecoration_14_0= ruleLineDecoration ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3483:1: (lv_targetDecoration_14_0= ruleLineDecoration )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3483:1: (lv_targetDecoration_14_0= ruleLineDecoration )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3484:3: lv_targetDecoration_14_0= ruleLineDecoration
            {
             
            	        newCompositeNode(grammarAccess.getNodeLinkDefAccess().getTargetDecorationLineDecorationParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLinkDef7862);
            lv_targetDecoration_14_0=ruleLineDecoration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeLinkDefRule());
            	        }
                   		set(
                   			current, 
                   			"targetDecoration",
                    		lv_targetDecoration_14_0, 
                    		"LineDecoration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,81,FOLLOW_81_in_ruleNodeLinkDef7874); 

                	newLeafNode(otherlv_15, grammarAccess.getNodeLinkDefAccess().getSourceKeyword_15());
                
            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleNodeLinkDef7886); 

                	newLeafNode(otherlv_16, grammarAccess.getNodeLinkDefAccess().getReferenceKeyword_16());
                
            otherlv_17=(Token)match(input,84,FOLLOW_84_in_ruleNodeLinkDef7898); 

                	newLeafNode(otherlv_17, grammarAccess.getNodeLinkDefAccess().getLessThanSignHyphenMinusKeyword_17());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3512:1: ( (lv_sourceReference_18_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3513:1: (lv_sourceReference_18_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3513:1: (lv_sourceReference_18_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3514:3: lv_sourceReference_18_0= RULE_ID
            {
            lv_sourceReference_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLinkDef7915); 

            			newLeafNode(lv_sourceReference_18_0, grammarAccess.getNodeLinkDefAccess().getSourceReferenceIDTerminalRuleCall_18_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLinkDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourceReference",
                    		lv_sourceReference_18_0, 
                    		"ID");
            	    

            }


            }

            otherlv_19=(Token)match(input,83,FOLLOW_83_in_ruleNodeLinkDef7932); 

                	newLeafNode(otherlv_19, grammarAccess.getNodeLinkDefAccess().getTargetKeyword_19());
                
            otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleNodeLinkDef7944); 

                	newLeafNode(otherlv_20, grammarAccess.getNodeLinkDefAccess().getReferenceKeyword_20());
                
            otherlv_21=(Token)match(input,84,FOLLOW_84_in_ruleNodeLinkDef7956); 

                	newLeafNode(otherlv_21, grammarAccess.getNodeLinkDefAccess().getLessThanSignHyphenMinusKeyword_21());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3542:1: ( (lv_targetReference_22_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3543:1: (lv_targetReference_22_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3543:1: (lv_targetReference_22_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3544:3: lv_targetReference_22_0= RULE_ID
            {
            lv_targetReference_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLinkDef7973); 

            			newLeafNode(lv_targetReference_22_0, grammarAccess.getNodeLinkDefAccess().getTargetReferenceIDTerminalRuleCall_22_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLinkDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetReference",
                    		lv_targetReference_22_0, 
                    		"ID");
            	    

            }


            }

            otherlv_23=(Token)match(input,18,FOLLOW_18_in_ruleNodeLinkDef7990); 

                	newLeafNode(otherlv_23, grammarAccess.getNodeLinkDefAccess().getRightCurlyBracketKeyword_23());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeLinkDef"


    // $ANTLR start "entryRuleNodeLinkAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3572:1: entryRuleNodeLinkAlt returns [EObject current=null] : iv_ruleNodeLinkAlt= ruleNodeLinkAlt EOF ;
    public final EObject entryRuleNodeLinkAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLinkAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3573:2: (iv_ruleNodeLinkAlt= ruleNodeLinkAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3574:2: iv_ruleNodeLinkAlt= ruleNodeLinkAlt EOF
            {
             newCompositeNode(grammarAccess.getNodeLinkAltRule()); 
            pushFollow(FOLLOW_ruleNodeLinkAlt_in_entryRuleNodeLinkAlt8026);
            iv_ruleNodeLinkAlt=ruleNodeLinkAlt();

            state._fsp--;

             current =iv_ruleNodeLinkAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeLinkAlt8036); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeLinkAlt"


    // $ANTLR start "ruleNodeLinkAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3581:1: ruleNodeLinkAlt returns [EObject current=null] : (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (lv_style_6_0= ruleLineStyle ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleNodeLinkAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_style_6_0 = null;

        EObject lv_sourceDecoration_9_0 = null;

        EObject lv_targetDecoration_12_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3584:28: ( (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (lv_style_6_0= ruleLineStyle ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3585:1: (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (lv_style_6_0= ruleLineStyle ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3585:1: (otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (lv_style_6_0= ruleLineStyle ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3585:3: otherlv_0= 'Node_link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (lv_style_6_0= ruleLineStyle ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleNodeLinkAlt8073); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeLinkAltAccess().getNode_linkKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3589:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3590:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3590:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3591:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLinkAlt8090); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeLinkAltAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLinkAltRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleNodeLinkAlt8107); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeLinkAltAccess().getExtendsKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3611:1: ( (otherlv_3= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3612:1: (otherlv_3= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3612:1: (otherlv_3= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3613:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLinkAltRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLinkAlt8127); 

            		newLeafNode(otherlv_3, grammarAccess.getNodeLinkAltAccess().getParentNodeLinkDefCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNodeLinkAlt8139); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeLinkAltAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3628:1: (otherlv_5= 'style' ( (lv_style_6_0= ruleLineStyle ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==80) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3628:3: otherlv_5= 'style' ( (lv_style_6_0= ruleLineStyle ) )
                    {
                    otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleNodeLinkAlt8152); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeLinkAltAccess().getStyleKeyword_5_0());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3632:1: ( (lv_style_6_0= ruleLineStyle ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3633:1: (lv_style_6_0= ruleLineStyle )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3633:1: (lv_style_6_0= ruleLineStyle )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3634:3: lv_style_6_0= ruleLineStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLinkAltAccess().getStyleLineStyleParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleNodeLinkAlt8173);
                    lv_style_6_0=ruleLineStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLinkAltRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_6_0, 
                            		"LineStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3650:4: (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==81) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3650:6: otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) )
                    {
                    otherlv_7=(Token)match(input,81,FOLLOW_81_in_ruleNodeLinkAlt8188); 

                        	newLeafNode(otherlv_7, grammarAccess.getNodeLinkAltAccess().getSourceKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,82,FOLLOW_82_in_ruleNodeLinkAlt8200); 

                        	newLeafNode(otherlv_8, grammarAccess.getNodeLinkAltAccess().getDecorationKeyword_6_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3658:1: ( (lv_sourceDecoration_9_0= ruleLineDecoration ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3659:1: (lv_sourceDecoration_9_0= ruleLineDecoration )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3659:1: (lv_sourceDecoration_9_0= ruleLineDecoration )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3660:3: lv_sourceDecoration_9_0= ruleLineDecoration
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLinkAltAccess().getSourceDecorationLineDecorationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLinkAlt8221);
                    lv_sourceDecoration_9_0=ruleLineDecoration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLinkAltRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceDecoration",
                            		lv_sourceDecoration_9_0, 
                            		"LineDecoration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3676:4: (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==83) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3676:6: otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) )
                    {
                    otherlv_10=(Token)match(input,83,FOLLOW_83_in_ruleNodeLinkAlt8236); 

                        	newLeafNode(otherlv_10, grammarAccess.getNodeLinkAltAccess().getTargetKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,82,FOLLOW_82_in_ruleNodeLinkAlt8248); 

                        	newLeafNode(otherlv_11, grammarAccess.getNodeLinkAltAccess().getDecorationKeyword_7_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3684:1: ( (lv_targetDecoration_12_0= ruleLineDecoration ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3685:1: (lv_targetDecoration_12_0= ruleLineDecoration )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3685:1: (lv_targetDecoration_12_0= ruleLineDecoration )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3686:3: lv_targetDecoration_12_0= ruleLineDecoration
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLinkAltAccess().getTargetDecorationLineDecorationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLinkAlt8269);
                    lv_targetDecoration_12_0=ruleLineDecoration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLinkAltRule());
                    	        }
                           		set(
                           			current, 
                           			"targetDecoration",
                            		lv_targetDecoration_12_0, 
                            		"LineDecoration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleNodeLinkAlt8283); 

                	newLeafNode(otherlv_13, grammarAccess.getNodeLinkAltAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeLinkAlt"


    // $ANTLR start "entryRuleNodeLineDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3714:1: entryRuleNodeLineDef returns [EObject current=null] : iv_ruleNodeLineDef= ruleNodeLineDef EOF ;
    public final EObject entryRuleNodeLineDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLineDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3715:2: (iv_ruleNodeLineDef= ruleNodeLineDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3716:2: iv_ruleNodeLineDef= ruleNodeLineDef EOF
            {
             newCompositeNode(grammarAccess.getNodeLineDefRule()); 
            pushFollow(FOLLOW_ruleNodeLineDef_in_entryRuleNodeLineDef8319);
            iv_ruleNodeLineDef=ruleNodeLineDef();

            state._fsp--;

             current =iv_ruleNodeLineDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeLineDef8329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeLineDef"


    // $ANTLR start "ruleNodeLineDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3723:1: ruleNodeLineDef returns [EObject current=null] : (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= 'style' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= '}' ) ;
    public final EObject ruleNodeLineDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_referenceName_3_0 = null;

        EObject lv_sourceDecoration_11_0 = null;

        EObject lv_targetDecoration_14_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3726:28: ( (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= 'style' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3727:1: (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= 'style' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3727:1: (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= 'style' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3727:3: otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'label' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= 'style' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'source' otherlv_10= 'decoration' ( (lv_sourceDecoration_11_0= ruleLineDecoration ) ) otherlv_12= 'target' otherlv_13= 'decoration' ( (lv_targetDecoration_14_0= ruleLineDecoration ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleNodeLineDef8366); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeLineDefAccess().getNode_lineKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3731:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3732:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3732:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3733:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLineDef8383); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeLineDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLineDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleNodeLineDef8400); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeLineDefAccess().getForKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3753:1: ( (lv_referenceName_3_0= ruleAttReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3754:1: (lv_referenceName_3_0= ruleAttReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3754:1: (lv_referenceName_3_0= ruleAttReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3755:3: lv_referenceName_3_0= ruleAttReference
            {
             
            	        newCompositeNode(grammarAccess.getNodeLineDefAccess().getReferenceNameAttReferenceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttReference_in_ruleNodeLineDef8421);
            lv_referenceName_3_0=ruleAttReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeLineDefRule());
            	        }
                   		set(
                   			current, 
                   			"referenceName",
                    		lv_referenceName_3_0, 
                    		"AttReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNodeLineDef8433); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeLineDefAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleNodeLineDef8445); 

                	newLeafNode(otherlv_5, grammarAccess.getNodeLineDefAccess().getLabelKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3779:1: ( (lv_label_6_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3780:1: (lv_label_6_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3780:1: (lv_label_6_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3781:3: lv_label_6_0= RULE_STRING
            {
            lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNodeLineDef8462); 

            			newLeafNode(lv_label_6_0, grammarAccess.getNodeLineDefAccess().getLabelSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLineDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleNodeLineDef8479); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeLineDefAccess().getStyleKeyword_7());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3801:1: ( (otherlv_8= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3802:1: (otherlv_8= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3802:1: (otherlv_8= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3803:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLineDefRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLineDef8499); 

            		newLeafNode(otherlv_8, grammarAccess.getNodeLineDefAccess().getStyleLineStyleCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,81,FOLLOW_81_in_ruleNodeLineDef8511); 

                	newLeafNode(otherlv_9, grammarAccess.getNodeLineDefAccess().getSourceKeyword_9());
                
            otherlv_10=(Token)match(input,82,FOLLOW_82_in_ruleNodeLineDef8523); 

                	newLeafNode(otherlv_10, grammarAccess.getNodeLineDefAccess().getDecorationKeyword_10());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3822:1: ( (lv_sourceDecoration_11_0= ruleLineDecoration ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3823:1: (lv_sourceDecoration_11_0= ruleLineDecoration )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3823:1: (lv_sourceDecoration_11_0= ruleLineDecoration )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3824:3: lv_sourceDecoration_11_0= ruleLineDecoration
            {
             
            	        newCompositeNode(grammarAccess.getNodeLineDefAccess().getSourceDecorationLineDecorationParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLineDef8544);
            lv_sourceDecoration_11_0=ruleLineDecoration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeLineDefRule());
            	        }
                   		set(
                   			current, 
                   			"sourceDecoration",
                    		lv_sourceDecoration_11_0, 
                    		"LineDecoration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,83,FOLLOW_83_in_ruleNodeLineDef8556); 

                	newLeafNode(otherlv_12, grammarAccess.getNodeLineDefAccess().getTargetKeyword_12());
                
            otherlv_13=(Token)match(input,82,FOLLOW_82_in_ruleNodeLineDef8568); 

                	newLeafNode(otherlv_13, grammarAccess.getNodeLineDefAccess().getDecorationKeyword_13());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3848:1: ( (lv_targetDecoration_14_0= ruleLineDecoration ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3849:1: (lv_targetDecoration_14_0= ruleLineDecoration )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3849:1: (lv_targetDecoration_14_0= ruleLineDecoration )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3850:3: lv_targetDecoration_14_0= ruleLineDecoration
            {
             
            	        newCompositeNode(grammarAccess.getNodeLineDefAccess().getTargetDecorationLineDecorationParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLineDef8589);
            lv_targetDecoration_14_0=ruleLineDecoration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeLineDefRule());
            	        }
                   		set(
                   			current, 
                   			"targetDecoration",
                    		lv_targetDecoration_14_0, 
                    		"LineDecoration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleNodeLineDef8601); 

                	newLeafNode(otherlv_15, grammarAccess.getNodeLineDefAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeLineDef"


    // $ANTLR start "entryRuleNodeLineAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3878:1: entryRuleNodeLineAlt returns [EObject current=null] : iv_ruleNodeLineAlt= ruleNodeLineAlt EOF ;
    public final EObject entryRuleNodeLineAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLineAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3879:2: (iv_ruleNodeLineAlt= ruleNodeLineAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3880:2: iv_ruleNodeLineAlt= ruleNodeLineAlt EOF
            {
             newCompositeNode(grammarAccess.getNodeLineAltRule()); 
            pushFollow(FOLLOW_ruleNodeLineAlt_in_entryRuleNodeLineAlt8637);
            iv_ruleNodeLineAlt=ruleNodeLineAlt();

            state._fsp--;

             current =iv_ruleNodeLineAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeLineAlt8647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeLineAlt"


    // $ANTLR start "ruleNodeLineAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3887:1: ruleNodeLineAlt returns [EObject current=null] : (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleNodeLineAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_sourceDecoration_9_0 = null;

        EObject lv_targetDecoration_12_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3890:28: ( (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3891:1: (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3891:1: (otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3891:3: otherlv_0= 'Node_line' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'style' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )? (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleNodeLineAlt8684); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeLineAltAccess().getNode_lineKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3895:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3896:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3896:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3897:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLineAlt8701); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeLineAltAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLineAltRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleNodeLineAlt8718); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeLineAltAccess().getExtendsKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3917:1: ( (otherlv_3= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3918:1: (otherlv_3= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3918:1: (otherlv_3= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3919:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeLineAltRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLineAlt8738); 

            		newLeafNode(otherlv_3, grammarAccess.getNodeLineAltAccess().getParentNodeLineDefCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNodeLineAlt8750); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeLineAltAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3934:1: (otherlv_5= 'style' ( (otherlv_6= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==80) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3934:3: otherlv_5= 'style' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleNodeLineAlt8763); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeLineAltAccess().getStyleKeyword_5_0());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3938:1: ( (otherlv_6= RULE_ID ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3939:1: (otherlv_6= RULE_ID )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3939:1: (otherlv_6= RULE_ID )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3940:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeLineAltRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLineAlt8783); 

                    		newLeafNode(otherlv_6, grammarAccess.getNodeLineAltAccess().getStyleLineStyleCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3951:4: (otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==81) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3951:6: otherlv_7= 'source' otherlv_8= 'decoration' ( (lv_sourceDecoration_9_0= ruleLineDecoration ) )
                    {
                    otherlv_7=(Token)match(input,81,FOLLOW_81_in_ruleNodeLineAlt8798); 

                        	newLeafNode(otherlv_7, grammarAccess.getNodeLineAltAccess().getSourceKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,82,FOLLOW_82_in_ruleNodeLineAlt8810); 

                        	newLeafNode(otherlv_8, grammarAccess.getNodeLineAltAccess().getDecorationKeyword_6_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3959:1: ( (lv_sourceDecoration_9_0= ruleLineDecoration ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3960:1: (lv_sourceDecoration_9_0= ruleLineDecoration )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3960:1: (lv_sourceDecoration_9_0= ruleLineDecoration )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3961:3: lv_sourceDecoration_9_0= ruleLineDecoration
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLineAltAccess().getSourceDecorationLineDecorationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLineAlt8831);
                    lv_sourceDecoration_9_0=ruleLineDecoration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLineAltRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceDecoration",
                            		lv_sourceDecoration_9_0, 
                            		"LineDecoration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3977:4: (otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==83) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3977:6: otherlv_10= 'target' otherlv_11= 'decoration' ( (lv_targetDecoration_12_0= ruleLineDecoration ) )
                    {
                    otherlv_10=(Token)match(input,83,FOLLOW_83_in_ruleNodeLineAlt8846); 

                        	newLeafNode(otherlv_10, grammarAccess.getNodeLineAltAccess().getTargetKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,82,FOLLOW_82_in_ruleNodeLineAlt8858); 

                        	newLeafNode(otherlv_11, grammarAccess.getNodeLineAltAccess().getDecorationKeyword_7_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3985:1: ( (lv_targetDecoration_12_0= ruleLineDecoration ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3986:1: (lv_targetDecoration_12_0= ruleLineDecoration )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3986:1: (lv_targetDecoration_12_0= ruleLineDecoration )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:3987:3: lv_targetDecoration_12_0= ruleLineDecoration
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLineAltAccess().getTargetDecorationLineDecorationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLineDecoration_in_ruleNodeLineAlt8879);
                    lv_targetDecoration_12_0=ruleLineDecoration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLineAltRule());
                    	        }
                           		set(
                           			current, 
                           			"targetDecoration",
                            		lv_targetDecoration_12_0, 
                            		"LineDecoration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleNodeLineAlt8893); 

                	newLeafNode(otherlv_13, grammarAccess.getNodeLineAltAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeLineAlt"


    // $ANTLR start "entryRuleInterNodeDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4015:1: entryRuleInterNodeDef returns [EObject current=null] : iv_ruleInterNodeDef= ruleInterNodeDef EOF ;
    public final EObject entryRuleInterNodeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterNodeDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4016:2: (iv_ruleInterNodeDef= ruleInterNodeDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4017:2: iv_ruleInterNodeDef= ruleInterNodeDef EOF
            {
             newCompositeNode(grammarAccess.getInterNodeDefRule()); 
            pushFollow(FOLLOW_ruleInterNodeDef_in_entryRuleInterNodeDef8929);
            iv_ruleInterNodeDef=ruleInterNodeDef();

            state._fsp--;

             current =iv_ruleInterNodeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterNodeDef8939); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterNodeDef"


    // $ANTLR start "ruleInterNodeDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4024:1: ruleInterNodeDef returns [EObject current=null] : (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' ) ;
    public final EObject ruleInterNodeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_referenceName_3_0 = null;

        EObject lv_layout_6_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4027:28: ( (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4028:1: (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4028:1: (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4028:3: otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_86_in_ruleInterNodeDef8976); 

                	newLeafNode(otherlv_0, grammarAccess.getInterNodeDefAccess().getInternal_nodeKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4032:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4033:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4033:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4034:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterNodeDef8993); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterNodeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterNodeDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleInterNodeDef9010); 

                	newLeafNode(otherlv_2, grammarAccess.getInterNodeDefAccess().getForKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4054:1: ( (lv_referenceName_3_0= ruleAttReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4055:1: (lv_referenceName_3_0= ruleAttReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4055:1: (lv_referenceName_3_0= ruleAttReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4056:3: lv_referenceName_3_0= ruleAttReference
            {
             
            	        newCompositeNode(grammarAccess.getInterNodeDefAccess().getReferenceNameAttReferenceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttReference_in_ruleInterNodeDef9031);
            lv_referenceName_3_0=ruleAttReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterNodeDefRule());
            	        }
                   		set(
                   			current, 
                   			"referenceName",
                    		lv_referenceName_3_0, 
                    		"AttReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInterNodeDef9043); 

                	newLeafNode(otherlv_4, grammarAccess.getInterNodeDefAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleInterNodeDef9055); 

                	newLeafNode(otherlv_5, grammarAccess.getInterNodeDefAccess().getLayoutKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4080:1: ( (lv_layout_6_0= ruleLayout ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4081:1: (lv_layout_6_0= ruleLayout )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4081:1: (lv_layout_6_0= ruleLayout )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4082:3: lv_layout_6_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getInterNodeDefAccess().getLayoutLayoutParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLayout_in_ruleInterNodeDef9076);
            lv_layout_6_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterNodeDefRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_6_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleInterNodeDef9088); 

                	newLeafNode(otherlv_7, grammarAccess.getInterNodeDefAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterNodeDef"


    // $ANTLR start "entryRuleInterNodeAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4110:1: entryRuleInterNodeAlt returns [EObject current=null] : iv_ruleInterNodeAlt= ruleInterNodeAlt EOF ;
    public final EObject entryRuleInterNodeAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterNodeAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4111:2: (iv_ruleInterNodeAlt= ruleInterNodeAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4112:2: iv_ruleInterNodeAlt= ruleInterNodeAlt EOF
            {
             newCompositeNode(grammarAccess.getInterNodeAltRule()); 
            pushFollow(FOLLOW_ruleInterNodeAlt_in_entryRuleInterNodeAlt9124);
            iv_ruleInterNodeAlt=ruleInterNodeAlt();

            state._fsp--;

             current =iv_ruleInterNodeAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterNodeAlt9134); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterNodeAlt"


    // $ANTLR start "ruleInterNodeAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4119:1: ruleInterNodeAlt returns [EObject current=null] : (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' ) ;
    public final EObject ruleInterNodeAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_layout_6_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4122:28: ( (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4123:1: (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4123:1: (otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4123:3: otherlv_0= 'Internal_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_86_in_ruleInterNodeAlt9171); 

                	newLeafNode(otherlv_0, grammarAccess.getInterNodeAltAccess().getInternal_nodeKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4127:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4128:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4128:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4129:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterNodeAlt9188); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterNodeAltAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterNodeAltRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleInterNodeAlt9205); 

                	newLeafNode(otherlv_2, grammarAccess.getInterNodeAltAccess().getExtendsKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4149:1: ( (otherlv_3= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4150:1: (otherlv_3= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4150:1: (otherlv_3= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4151:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterNodeAltRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterNodeAlt9225); 

            		newLeafNode(otherlv_3, grammarAccess.getInterNodeAltAccess().getParentInterNodeDefCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInterNodeAlt9237); 

                	newLeafNode(otherlv_4, grammarAccess.getInterNodeAltAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleInterNodeAlt9249); 

                	newLeafNode(otherlv_5, grammarAccess.getInterNodeAltAccess().getLayoutKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4170:1: ( (lv_layout_6_0= ruleLayout ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4171:1: (lv_layout_6_0= ruleLayout )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4171:1: (lv_layout_6_0= ruleLayout )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4172:3: lv_layout_6_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getInterNodeAltAccess().getLayoutLayoutParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLayout_in_ruleInterNodeAlt9270);
            lv_layout_6_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterNodeAltRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_6_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleInterNodeAlt9282); 

                	newLeafNode(otherlv_7, grammarAccess.getInterNodeAltAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterNodeAlt"


    // $ANTLR start "entryRuleExternalNodeDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4200:1: entryRuleExternalNodeDef returns [EObject current=null] : iv_ruleExternalNodeDef= ruleExternalNodeDef EOF ;
    public final EObject entryRuleExternalNodeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalNodeDef = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4201:2: (iv_ruleExternalNodeDef= ruleExternalNodeDef EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4202:2: iv_ruleExternalNodeDef= ruleExternalNodeDef EOF
            {
             newCompositeNode(grammarAccess.getExternalNodeDefRule()); 
            pushFollow(FOLLOW_ruleExternalNodeDef_in_entryRuleExternalNodeDef9318);
            iv_ruleExternalNodeDef=ruleExternalNodeDef();

            state._fsp--;

             current =iv_ruleExternalNodeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalNodeDef9328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalNodeDef"


    // $ANTLR start "ruleExternalNodeDef"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4209:1: ruleExternalNodeDef returns [EObject current=null] : (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' ) ;
    public final EObject ruleExternalNodeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_referenceName_3_0 = null;

        EObject lv_size_6_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4212:28: ( (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4213:1: (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4213:1: (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4213:3: otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_referenceName_3_0= ruleAttReference ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleExternalNodeDef9365); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalNodeDefAccess().getExternal_nodeKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4217:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4218:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4218:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4219:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalNodeDef9382); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalNodeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalNodeDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleExternalNodeDef9399); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalNodeDefAccess().getForKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4239:1: ( (lv_referenceName_3_0= ruleAttReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4240:1: (lv_referenceName_3_0= ruleAttReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4240:1: (lv_referenceName_3_0= ruleAttReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4241:3: lv_referenceName_3_0= ruleAttReference
            {
             
            	        newCompositeNode(grammarAccess.getExternalNodeDefAccess().getReferenceNameAttReferenceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttReference_in_ruleExternalNodeDef9420);
            lv_referenceName_3_0=ruleAttReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalNodeDefRule());
            	        }
                   		set(
                   			current, 
                   			"referenceName",
                    		lv_referenceName_3_0, 
                    		"AttReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExternalNodeDef9432); 

                	newLeafNode(otherlv_4, grammarAccess.getExternalNodeDefAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleExternalNodeDef9444); 

                	newLeafNode(otherlv_5, grammarAccess.getExternalNodeDefAccess().getSizeKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4265:1: ( (lv_size_6_0= ruleSize ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4266:1: (lv_size_6_0= ruleSize )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4266:1: (lv_size_6_0= ruleSize )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4267:3: lv_size_6_0= ruleSize
            {
             
            	        newCompositeNode(grammarAccess.getExternalNodeDefAccess().getSizeSizeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSize_in_ruleExternalNodeDef9465);
            lv_size_6_0=ruleSize();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalNodeDefRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_6_0, 
                    		"Size");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleExternalNodeDef9477); 

                	newLeafNode(otherlv_7, grammarAccess.getExternalNodeDefAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalNodeDef"


    // $ANTLR start "entryRuleExternalNodeAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4295:1: entryRuleExternalNodeAlt returns [EObject current=null] : iv_ruleExternalNodeAlt= ruleExternalNodeAlt EOF ;
    public final EObject entryRuleExternalNodeAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalNodeAlt = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4296:2: (iv_ruleExternalNodeAlt= ruleExternalNodeAlt EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4297:2: iv_ruleExternalNodeAlt= ruleExternalNodeAlt EOF
            {
             newCompositeNode(grammarAccess.getExternalNodeAltRule()); 
            pushFollow(FOLLOW_ruleExternalNodeAlt_in_entryRuleExternalNodeAlt9513);
            iv_ruleExternalNodeAlt=ruleExternalNodeAlt();

            state._fsp--;

             current =iv_ruleExternalNodeAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalNodeAlt9523); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalNodeAlt"


    // $ANTLR start "ruleExternalNodeAlt"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4304:1: ruleExternalNodeAlt returns [EObject current=null] : (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' ) ;
    public final EObject ruleExternalNodeAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_size_6_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4307:28: ( (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4308:1: (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4308:1: (otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4308:3: otherlv_0= 'External_node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'size' ( (lv_size_6_0= ruleSize ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleExternalNodeAlt9560); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalNodeAltAccess().getExternal_nodeKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4312:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4313:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4313:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4314:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalNodeAlt9577); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalNodeAltAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalNodeAltRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleExternalNodeAlt9594); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalNodeAltAccess().getExtendsKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4334:1: ( (otherlv_3= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4335:1: (otherlv_3= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4335:1: (otherlv_3= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4336:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalNodeAltRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalNodeAlt9614); 

            		newLeafNode(otherlv_3, grammarAccess.getExternalNodeAltAccess().getParentExternalNodeDefCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExternalNodeAlt9626); 

                	newLeafNode(otherlv_4, grammarAccess.getExternalNodeAltAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleExternalNodeAlt9638); 

                	newLeafNode(otherlv_5, grammarAccess.getExternalNodeAltAccess().getSizeKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4355:1: ( (lv_size_6_0= ruleSize ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4356:1: (lv_size_6_0= ruleSize )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4356:1: (lv_size_6_0= ruleSize )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4357:3: lv_size_6_0= ruleSize
            {
             
            	        newCompositeNode(grammarAccess.getExternalNodeAltAccess().getSizeSizeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSize_in_ruleExternalNodeAlt9659);
            lv_size_6_0=ruleSize();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalNodeAltRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_6_0, 
                    		"Size");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleExternalNodeAlt9671); 

                	newLeafNode(otherlv_7, grammarAccess.getExternalNodeAltAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalNodeAlt"


    // $ANTLR start "entryRuleRulesDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4385:1: entryRuleRulesDefinition returns [EObject current=null] : iv_ruleRulesDefinition= ruleRulesDefinition EOF ;
    public final EObject entryRuleRulesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulesDefinition = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4386:2: (iv_ruleRulesDefinition= ruleRulesDefinition EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4387:2: iv_ruleRulesDefinition= ruleRulesDefinition EOF
            {
             newCompositeNode(grammarAccess.getRulesDefinitionRule()); 
            pushFollow(FOLLOW_ruleRulesDefinition_in_entryRuleRulesDefinition9707);
            iv_ruleRulesDefinition=ruleRulesDefinition();

            state._fsp--;

             current =iv_ruleRulesDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRulesDefinition9717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRulesDefinition"


    // $ANTLR start "ruleRulesDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4394:1: ruleRulesDefinition returns [EObject current=null] : ( () otherlv_1= 'Rules definition' otherlv_2= '{' ( (lv_ruless_3_0= ruleRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleRulesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ruless_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4397:28: ( ( () otherlv_1= 'Rules definition' otherlv_2= '{' ( (lv_ruless_3_0= ruleRule ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4398:1: ( () otherlv_1= 'Rules definition' otherlv_2= '{' ( (lv_ruless_3_0= ruleRule ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4398:1: ( () otherlv_1= 'Rules definition' otherlv_2= '{' ( (lv_ruless_3_0= ruleRule ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4398:2: () otherlv_1= 'Rules definition' otherlv_2= '{' ( (lv_ruless_3_0= ruleRule ) )* otherlv_4= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4398:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4399:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRulesDefinitionAccess().getRulesDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleRulesDefinition9763); 

                	newLeafNode(otherlv_1, grammarAccess.getRulesDefinitionAccess().getRulesDefinitionKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRulesDefinition9775); 

                	newLeafNode(otherlv_2, grammarAccess.getRulesDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4412:1: ( (lv_ruless_3_0= ruleRule ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==89) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4413:1: (lv_ruless_3_0= ruleRule )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4413:1: (lv_ruless_3_0= ruleRule )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4414:3: lv_ruless_3_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesDefinitionAccess().getRulessRuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleRulesDefinition9796);
            	    lv_ruless_3_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRulesDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ruless",
            	            		lv_ruless_3_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRulesDefinition9809); 

                	newLeafNode(otherlv_4, grammarAccess.getRulesDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRulesDefinition"


    // $ANTLR start "entryRuleRule"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4442:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4443:2: (iv_ruleRule= ruleRule EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4444:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule9845);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule9855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4451:1: ruleRule returns [EObject current=null] : (this_RuleForType_0= ruleRuleForType | this_RuleForReference_1= ruleRuleForReference ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_RuleForType_0 = null;

        EObject this_RuleForReference_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4454:28: ( (this_RuleForType_0= ruleRuleForType | this_RuleForReference_1= ruleRuleForReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4455:1: (this_RuleForType_0= ruleRuleForType | this_RuleForReference_1= ruleRuleForReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4455:1: (this_RuleForType_0= ruleRuleForType | this_RuleForReference_1= ruleRuleForReference )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==89) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==20) ) {
                    alt35=1;
                }
                else if ( (LA35_1==16) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4456:5: this_RuleForType_0= ruleRuleForType
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleForTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleForType_in_ruleRule9902);
                    this_RuleForType_0=ruleRuleForType();

                    state._fsp--;

                     
                            current = this_RuleForType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4466:5: this_RuleForReference_1= ruleRuleForReference
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleForReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRuleForReference_in_ruleRule9929);
                    this_RuleForReference_1=ruleRuleForReference();

                    state._fsp--;

                     
                            current = this_RuleForReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleForType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4482:1: entryRuleRuleForType returns [EObject current=null] : iv_ruleRuleForType= ruleRuleForType EOF ;
    public final EObject entryRuleRuleForType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleForType = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4483:2: (iv_ruleRuleForType= ruleRuleForType EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4484:2: iv_ruleRuleForType= ruleRuleForType EOF
            {
             newCompositeNode(grammarAccess.getRuleForTypeRule()); 
            pushFollow(FOLLOW_ruleRuleForType_in_entryRuleRuleForType9964);
            iv_ruleRuleForType=ruleRuleForType();

            state._fsp--;

             current =iv_ruleRuleForType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleForType9974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleForType"


    // $ANTLR start "ruleRuleForType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4491:1: ruleRuleForType returns [EObject current=null] : (otherlv_0= 'Rules for' ( (lv_classReference_1_0= ruleClassReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseType ) )* otherlv_4= '}' ) ;
    public final EObject ruleRuleForType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_classReference_1_0 = null;

        EObject lv_cases_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4494:28: ( (otherlv_0= 'Rules for' ( (lv_classReference_1_0= ruleClassReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseType ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4495:1: (otherlv_0= 'Rules for' ( (lv_classReference_1_0= ruleClassReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseType ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4495:1: (otherlv_0= 'Rules for' ( (lv_classReference_1_0= ruleClassReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseType ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4495:3: otherlv_0= 'Rules for' ( (lv_classReference_1_0= ruleClassReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseType ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleRuleForType10011); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleForTypeAccess().getRulesForKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4499:1: ( (lv_classReference_1_0= ruleClassReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4500:1: (lv_classReference_1_0= ruleClassReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4500:1: (lv_classReference_1_0= ruleClassReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4501:3: lv_classReference_1_0= ruleClassReference
            {
             
            	        newCompositeNode(grammarAccess.getRuleForTypeAccess().getClassReferenceClassReferenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassReference_in_ruleRuleForType10032);
            lv_classReference_1_0=ruleClassReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleForTypeRule());
            	        }
                   		set(
                   			current, 
                   			"classReference",
                    		lv_classReference_1_0, 
                    		"ClassReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRuleForType10044); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleForTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4521:1: ( (lv_cases_3_0= ruleCaseType ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==90) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4522:1: (lv_cases_3_0= ruleCaseType )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4522:1: (lv_cases_3_0= ruleCaseType )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4523:3: lv_cases_3_0= ruleCaseType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleForTypeAccess().getCasesCaseTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCaseType_in_ruleRuleForType10065);
            	    lv_cases_3_0=ruleCaseType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleForTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_3_0, 
            	            		"CaseType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRuleForType10078); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleForTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleForType"


    // $ANTLR start "entryRuleRuleForReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4551:1: entryRuleRuleForReference returns [EObject current=null] : iv_ruleRuleForReference= ruleRuleForReference EOF ;
    public final EObject entryRuleRuleForReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleForReference = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4552:2: (iv_ruleRuleForReference= ruleRuleForReference EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4553:2: iv_ruleRuleForReference= ruleRuleForReference EOF
            {
             newCompositeNode(grammarAccess.getRuleForReferenceRule()); 
            pushFollow(FOLLOW_ruleRuleForReference_in_entryRuleRuleForReference10114);
            iv_ruleRuleForReference=ruleRuleForReference();

            state._fsp--;

             current =iv_ruleRuleForReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleForReference10124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleForReference"


    // $ANTLR start "ruleRuleForReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4560:1: ruleRuleForReference returns [EObject current=null] : (otherlv_0= 'Rules for' ( (lv_reference_1_0= ruleAttReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseReference ) )* otherlv_4= '}' ) ;
    public final EObject ruleRuleForReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reference_1_0 = null;

        EObject lv_cases_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4563:28: ( (otherlv_0= 'Rules for' ( (lv_reference_1_0= ruleAttReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseReference ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4564:1: (otherlv_0= 'Rules for' ( (lv_reference_1_0= ruleAttReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseReference ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4564:1: (otherlv_0= 'Rules for' ( (lv_reference_1_0= ruleAttReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseReference ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4564:3: otherlv_0= 'Rules for' ( (lv_reference_1_0= ruleAttReference ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCaseReference ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleRuleForReference10161); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleForReferenceAccess().getRulesForKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4568:1: ( (lv_reference_1_0= ruleAttReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4569:1: (lv_reference_1_0= ruleAttReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4569:1: (lv_reference_1_0= ruleAttReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4570:3: lv_reference_1_0= ruleAttReference
            {
             
            	        newCompositeNode(grammarAccess.getRuleForReferenceAccess().getReferenceAttReferenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttReference_in_ruleRuleForReference10182);
            lv_reference_1_0=ruleAttReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleForReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_1_0, 
                    		"AttReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRuleForReference10194); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleForReferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4590:1: ( (lv_cases_3_0= ruleCaseReference ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==90) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4591:1: (lv_cases_3_0= ruleCaseReference )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4591:1: (lv_cases_3_0= ruleCaseReference )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4592:3: lv_cases_3_0= ruleCaseReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleForReferenceAccess().getCasesCaseReferenceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCaseReference_in_ruleRuleForReference10215);
            	    lv_cases_3_0=ruleCaseReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleForReferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_3_0, 
            	            		"CaseReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRuleForReference10228); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleForReferenceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleForReference"


    // $ANTLR start "entryRuleCaseType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4620:1: entryRuleCaseType returns [EObject current=null] : iv_ruleCaseType= ruleCaseType EOF ;
    public final EObject entryRuleCaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseType = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4621:2: (iv_ruleCaseType= ruleCaseType EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4622:2: iv_ruleCaseType= ruleCaseType EOF
            {
             newCompositeNode(grammarAccess.getCaseTypeRule()); 
            pushFollow(FOLLOW_ruleCaseType_in_entryRuleCaseType10264);
            iv_ruleCaseType=ruleCaseType();

            state._fsp--;

             current =iv_ruleCaseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseType10274); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseType"


    // $ANTLR start "ruleCaseType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4629:1: ruleCaseType returns [EObject current=null] : ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) ) ;
    public final EObject ruleCaseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4632:28: ( ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4633:1: ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4633:1: ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4633:2: () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4633:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4634:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCaseTypeAccess().getCaseTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleCaseType10320); 

                	newLeafNode(otherlv_1, grammarAccess.getCaseTypeAccess().getCaseKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4643:1: ( (lv_condition_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4644:1: (lv_condition_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4644:1: (lv_condition_2_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4645:3: lv_condition_2_0= RULE_STRING
            {
            lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCaseType10337); 

            			newLeafNode(lv_condition_2_0, grammarAccess.getCaseTypeAccess().getConditionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,91,FOLLOW_91_in_ruleCaseType10354); 

                	newLeafNode(otherlv_3, grammarAccess.getCaseTypeAccess().getUseKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4665:1: ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==46) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4665:2: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4665:2: ( (otherlv_4= RULE_ID ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4666:1: (otherlv_4= RULE_ID )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4666:1: (otherlv_4= RULE_ID )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4667:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCaseTypeRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCaseType10375); 

                    		newLeafNode(otherlv_4, grammarAccess.getCaseTypeAccess().getNodeElementNodeAltCrossReference_4_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4679:7: otherlv_5= 'default'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleCaseType10393); 

                        	newLeafNode(otherlv_5, grammarAccess.getCaseTypeAccess().getDefaultKeyword_4_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseType"


    // $ANTLR start "entryRuleCaseReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4691:1: entryRuleCaseReference returns [EObject current=null] : iv_ruleCaseReference= ruleCaseReference EOF ;
    public final EObject entryRuleCaseReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseReference = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4692:2: (iv_ruleCaseReference= ruleCaseReference EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4693:2: iv_ruleCaseReference= ruleCaseReference EOF
            {
             newCompositeNode(grammarAccess.getCaseReferenceRule()); 
            pushFollow(FOLLOW_ruleCaseReference_in_entryRuleCaseReference10430);
            iv_ruleCaseReference=ruleCaseReference();

            state._fsp--;

             current =iv_ruleCaseReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseReference10440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseReference"


    // $ANTLR start "ruleCaseReference"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4700:1: ruleCaseReference returns [EObject current=null] : ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) ) ;
    public final EObject ruleCaseReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4703:28: ( ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4704:1: ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4704:1: ( () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4704:2: () otherlv_1= 'case' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'use' ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4704:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4705:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCaseReferenceAccess().getCaseReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleCaseReference10486); 

                	newLeafNode(otherlv_1, grammarAccess.getCaseReferenceAccess().getCaseKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4714:1: ( (lv_condition_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4715:1: (lv_condition_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4715:1: (lv_condition_2_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4716:3: lv_condition_2_0= RULE_STRING
            {
            lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCaseReference10503); 

            			newLeafNode(lv_condition_2_0, grammarAccess.getCaseReferenceAccess().getConditionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,91,FOLLOW_91_in_ruleCaseReference10520); 

                	newLeafNode(otherlv_3, grammarAccess.getCaseReferenceAccess().getUseKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4736:1: ( ( (otherlv_4= RULE_ID ) ) | otherlv_5= 'default' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==46) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4736:2: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4736:2: ( (otherlv_4= RULE_ID ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4737:1: (otherlv_4= RULE_ID )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4737:1: (otherlv_4= RULE_ID )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4738:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCaseReferenceRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCaseReference10541); 

                    		newLeafNode(otherlv_4, grammarAccess.getCaseReferenceAccess().getReferenceElementAttLinkAltCrossReference_4_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4750:7: otherlv_5= 'default'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleCaseReference10559); 

                        	newLeafNode(otherlv_5, grammarAccess.getCaseReferenceAccess().getDefaultKeyword_4_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseReference"


    // $ANTLR start "entryRuleInteractionDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4762:1: entryRuleInteractionDefinition returns [EObject current=null] : iv_ruleInteractionDefinition= ruleInteractionDefinition EOF ;
    public final EObject entryRuleInteractionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionDefinition = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4763:2: (iv_ruleInteractionDefinition= ruleInteractionDefinition EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4764:2: iv_ruleInteractionDefinition= ruleInteractionDefinition EOF
            {
             newCompositeNode(grammarAccess.getInteractionDefinitionRule()); 
            pushFollow(FOLLOW_ruleInteractionDefinition_in_entryRuleInteractionDefinition10596);
            iv_ruleInteractionDefinition=ruleInteractionDefinition();

            state._fsp--;

             current =iv_ruleInteractionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractionDefinition10606); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractionDefinition"


    // $ANTLR start "ruleInteractionDefinition"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4771:1: ruleInteractionDefinition returns [EObject current=null] : ( () otherlv_1= 'Interaction definition' otherlv_2= '{' otherlv_3= 'Interaction elements' otherlv_4= '{' ( (lv_interactionElements_5_0= ruleInteractionElement ) )* otherlv_6= '}' otherlv_7= 'Statements' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleInteractionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_interactionElements_5_0 = null;

        EObject lv_statements_9_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4774:28: ( ( () otherlv_1= 'Interaction definition' otherlv_2= '{' otherlv_3= 'Interaction elements' otherlv_4= '{' ( (lv_interactionElements_5_0= ruleInteractionElement ) )* otherlv_6= '}' otherlv_7= 'Statements' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4775:1: ( () otherlv_1= 'Interaction definition' otherlv_2= '{' otherlv_3= 'Interaction elements' otherlv_4= '{' ( (lv_interactionElements_5_0= ruleInteractionElement ) )* otherlv_6= '}' otherlv_7= 'Statements' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4775:1: ( () otherlv_1= 'Interaction definition' otherlv_2= '{' otherlv_3= 'Interaction elements' otherlv_4= '{' ( (lv_interactionElements_5_0= ruleInteractionElement ) )* otherlv_6= '}' otherlv_7= 'Statements' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' otherlv_11= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4775:2: () otherlv_1= 'Interaction definition' otherlv_2= '{' otherlv_3= 'Interaction elements' otherlv_4= '{' ( (lv_interactionElements_5_0= ruleInteractionElement ) )* otherlv_6= '}' otherlv_7= 'Statements' otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* otherlv_10= '}' otherlv_11= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4775:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4776:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInteractionDefinitionAccess().getInteractionDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleInteractionDefinition10652); 

                	newLeafNode(otherlv_1, grammarAccess.getInteractionDefinitionAccess().getInteractionDefinitionKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInteractionDefinition10664); 

                	newLeafNode(otherlv_2, grammarAccess.getInteractionDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,93,FOLLOW_93_in_ruleInteractionDefinition10676); 

                	newLeafNode(otherlv_3, grammarAccess.getInteractionDefinitionAccess().getInteractionElementsKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInteractionDefinition10688); 

                	newLeafNode(otherlv_4, grammarAccess.getInteractionDefinitionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4797:1: ( (lv_interactionElements_5_0= ruleInteractionElement ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==95||LA40_0==105||LA40_0==107||LA40_0==120) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4798:1: (lv_interactionElements_5_0= ruleInteractionElement )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4798:1: (lv_interactionElements_5_0= ruleInteractionElement )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4799:3: lv_interactionElements_5_0= ruleInteractionElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionDefinitionAccess().getInteractionElementsInteractionElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInteractionElement_in_ruleInteractionDefinition10709);
            	    lv_interactionElements_5_0=ruleInteractionElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interactionElements",
            	            		lv_interactionElements_5_0, 
            	            		"InteractionElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleInteractionDefinition10722); 

                	newLeafNode(otherlv_6, grammarAccess.getInteractionDefinitionAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,94,FOLLOW_94_in_ruleInteractionDefinition10734); 

                	newLeafNode(otherlv_7, grammarAccess.getInteractionDefinitionAccess().getStatementsKeyword_7());
                
            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInteractionDefinition10746); 

                	newLeafNode(otherlv_8, grammarAccess.getInteractionDefinitionAccess().getLeftCurlyBracketKeyword_8());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4827:1: ( (lv_statements_9_0= ruleStatement ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==121) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4828:1: (lv_statements_9_0= ruleStatement )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4828:1: (lv_statements_9_0= ruleStatement )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4829:3: lv_statements_9_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionDefinitionAccess().getStatementsStatementParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleInteractionDefinition10767);
            	    lv_statements_9_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_9_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleInteractionDefinition10780); 

                	newLeafNode(otherlv_10, grammarAccess.getInteractionDefinitionAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleInteractionDefinition10792); 

                	newLeafNode(otherlv_11, grammarAccess.getInteractionDefinitionAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractionDefinition"


    // $ANTLR start "entryRuleInteractionElement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4861:1: entryRuleInteractionElement returns [EObject current=null] : iv_ruleInteractionElement= ruleInteractionElement EOF ;
    public final EObject entryRuleInteractionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionElement = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4862:2: (iv_ruleInteractionElement= ruleInteractionElement EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4863:2: iv_ruleInteractionElement= ruleInteractionElement EOF
            {
             newCompositeNode(grammarAccess.getInteractionElementRule()); 
            pushFollow(FOLLOW_ruleInteractionElement_in_entryRuleInteractionElement10828);
            iv_ruleInteractionElement=ruleInteractionElement();

            state._fsp--;

             current =iv_ruleInteractionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractionElement10838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractionElement"


    // $ANTLR start "ruleInteractionElement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4870:1: ruleInteractionElement returns [EObject current=null] : (this_Wizard_0= ruleWizard | this_View_1= ruleView ) ;
    public final EObject ruleInteractionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Wizard_0 = null;

        EObject this_View_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4873:28: ( (this_Wizard_0= ruleWizard | this_View_1= ruleView ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4874:1: (this_Wizard_0= ruleWizard | this_View_1= ruleView )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4874:1: (this_Wizard_0= ruleWizard | this_View_1= ruleView )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==95||LA42_0==105) ) {
                alt42=1;
            }
            else if ( (LA42_0==107||LA42_0==120) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4875:5: this_Wizard_0= ruleWizard
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionElementAccess().getWizardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWizard_in_ruleInteractionElement10885);
                    this_Wizard_0=ruleWizard();

                    state._fsp--;

                     
                            current = this_Wizard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4885:5: this_View_1= ruleView
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionElementAccess().getViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleInteractionElement10912);
                    this_View_1=ruleView();

                    state._fsp--;

                     
                            current = this_View_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractionElement"


    // $ANTLR start "entryRuleWizard"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4901:1: entryRuleWizard returns [EObject current=null] : iv_ruleWizard= ruleWizard EOF ;
    public final EObject entryRuleWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizard = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4902:2: (iv_ruleWizard= ruleWizard EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4903:2: iv_ruleWizard= ruleWizard EOF
            {
             newCompositeNode(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_ruleWizard_in_entryRuleWizard10947);
            iv_ruleWizard=ruleWizard();

            state._fsp--;

             current =iv_ruleWizard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWizard10957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4910:1: ruleWizard returns [EObject current=null] : (this_ElementWizard_0= ruleElementWizard | this_PersonalWizard_1= rulePersonalWizard ) ;
    public final EObject ruleWizard() throws RecognitionException {
        EObject current = null;

        EObject this_ElementWizard_0 = null;

        EObject this_PersonalWizard_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4913:28: ( (this_ElementWizard_0= ruleElementWizard | this_PersonalWizard_1= rulePersonalWizard ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4914:1: (this_ElementWizard_0= ruleElementWizard | this_PersonalWizard_1= rulePersonalWizard )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4914:1: (this_ElementWizard_0= ruleElementWizard | this_PersonalWizard_1= rulePersonalWizard )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==95) ) {
                alt43=1;
            }
            else if ( (LA43_0==105) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4915:5: this_ElementWizard_0= ruleElementWizard
                    {
                     
                            newCompositeNode(grammarAccess.getWizardAccess().getElementWizardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementWizard_in_ruleWizard11004);
                    this_ElementWizard_0=ruleElementWizard();

                    state._fsp--;

                     
                            current = this_ElementWizard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4925:5: this_PersonalWizard_1= rulePersonalWizard
                    {
                     
                            newCompositeNode(grammarAccess.getWizardAccess().getPersonalWizardParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePersonalWizard_in_ruleWizard11031);
                    this_PersonalWizard_1=rulePersonalWizard();

                    state._fsp--;

                     
                            current = this_PersonalWizard_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleElementWizard"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4941:1: entryRuleElementWizard returns [EObject current=null] : iv_ruleElementWizard= ruleElementWizard EOF ;
    public final EObject entryRuleElementWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementWizard = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4942:2: (iv_ruleElementWizard= ruleElementWizard EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4943:2: iv_ruleElementWizard= ruleElementWizard EOF
            {
             newCompositeNode(grammarAccess.getElementWizardRule()); 
            pushFollow(FOLLOW_ruleElementWizard_in_entryRuleElementWizard11066);
            iv_ruleElementWizard=ruleElementWizard();

            state._fsp--;

             current =iv_ruleElementWizard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementWizard11076); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementWizard"


    // $ANTLR start "ruleElementWizard"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4950:1: ruleElementWizard returns [EObject current=null] : (otherlv_0= 'Wizard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' otherlv_3= 'context' ( (lv_classReference_4_0= ruleClassReference ) ) otherlv_5= '{' otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleWizardType ) ) otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= rulePage ) )* otherlv_15= '}' otherlv_16= 'default' otherlv_17= 'buttons' ( (lv_defaultButtons_18_0= ruleEBoolean ) ) otherlv_19= '}' ) ;
    public final EObject ruleElementWizard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_title_7_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_classReference_4_0 = null;

        Enumerator lv_type_11_0 = null;

        EObject lv_pages_14_0 = null;

        AntlrDatatypeRuleToken lv_defaultButtons_18_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4953:28: ( (otherlv_0= 'Wizard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' otherlv_3= 'context' ( (lv_classReference_4_0= ruleClassReference ) ) otherlv_5= '{' otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleWizardType ) ) otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= rulePage ) )* otherlv_15= '}' otherlv_16= 'default' otherlv_17= 'buttons' ( (lv_defaultButtons_18_0= ruleEBoolean ) ) otherlv_19= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4954:1: (otherlv_0= 'Wizard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' otherlv_3= 'context' ( (lv_classReference_4_0= ruleClassReference ) ) otherlv_5= '{' otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleWizardType ) ) otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= rulePage ) )* otherlv_15= '}' otherlv_16= 'default' otherlv_17= 'buttons' ( (lv_defaultButtons_18_0= ruleEBoolean ) ) otherlv_19= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4954:1: (otherlv_0= 'Wizard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' otherlv_3= 'context' ( (lv_classReference_4_0= ruleClassReference ) ) otherlv_5= '{' otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleWizardType ) ) otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= rulePage ) )* otherlv_15= '}' otherlv_16= 'default' otherlv_17= 'buttons' ( (lv_defaultButtons_18_0= ruleEBoolean ) ) otherlv_19= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4954:3: otherlv_0= 'Wizard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' otherlv_3= 'context' ( (lv_classReference_4_0= ruleClassReference ) ) otherlv_5= '{' otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleWizardType ) ) otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= rulePage ) )* otherlv_15= '}' otherlv_16= 'default' otherlv_17= 'buttons' ( (lv_defaultButtons_18_0= ruleEBoolean ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleElementWizard11113); 

                	newLeafNode(otherlv_0, grammarAccess.getElementWizardAccess().getWizardKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4958:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4959:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4959:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4960:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementWizard11130); 

            			newLeafNode(lv_name_1_0, grammarAccess.getElementWizardAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementWizardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleElementWizard11147); 

                	newLeafNode(otherlv_2, grammarAccess.getElementWizardAccess().getForKeyword_2());
                
            otherlv_3=(Token)match(input,96,FOLLOW_96_in_ruleElementWizard11159); 

                	newLeafNode(otherlv_3, grammarAccess.getElementWizardAccess().getContextKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4984:1: ( (lv_classReference_4_0= ruleClassReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4985:1: (lv_classReference_4_0= ruleClassReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4985:1: (lv_classReference_4_0= ruleClassReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:4986:3: lv_classReference_4_0= ruleClassReference
            {
             
            	        newCompositeNode(grammarAccess.getElementWizardAccess().getClassReferenceClassReferenceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleClassReference_in_ruleElementWizard11180);
            lv_classReference_4_0=ruleClassReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementWizardRule());
            	        }
                   		set(
                   			current, 
                   			"classReference",
                    		lv_classReference_4_0, 
                    		"ClassReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleElementWizard11192); 

                	newLeafNode(otherlv_5, grammarAccess.getElementWizardAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,97,FOLLOW_97_in_ruleElementWizard11204); 

                	newLeafNode(otherlv_6, grammarAccess.getElementWizardAccess().getTitleKeyword_6());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5010:1: ( (lv_title_7_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5011:1: (lv_title_7_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5011:1: (lv_title_7_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5012:3: lv_title_7_0= RULE_STRING
            {
            lv_title_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementWizard11221); 

            			newLeafNode(lv_title_7_0, grammarAccess.getElementWizardAccess().getTitleSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementWizardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleElementWizard11238); 

                	newLeafNode(otherlv_8, grammarAccess.getElementWizardAccess().getDescriptionKeyword_8());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5032:1: ( (lv_description_9_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5033:1: (lv_description_9_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5033:1: (lv_description_9_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5034:3: lv_description_9_0= RULE_STRING
            {
            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementWizard11255); 

            			newLeafNode(lv_description_9_0, grammarAccess.getElementWizardAccess().getDescriptionSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementWizardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_9_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleElementWizard11272); 

                	newLeafNode(otherlv_10, grammarAccess.getElementWizardAccess().getTypeKeyword_10());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5054:1: ( (lv_type_11_0= ruleWizardType ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5055:1: (lv_type_11_0= ruleWizardType )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5055:1: (lv_type_11_0= ruleWizardType )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5056:3: lv_type_11_0= ruleWizardType
            {
             
            	        newCompositeNode(grammarAccess.getElementWizardAccess().getTypeWizardTypeEnumRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleWizardType_in_ruleElementWizard11293);
            lv_type_11_0=ruleWizardType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementWizardRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_11_0, 
                    		"WizardType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,98,FOLLOW_98_in_ruleElementWizard11305); 

                	newLeafNode(otherlv_12, grammarAccess.getElementWizardAccess().getPagesKeyword_12());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleElementWizard11317); 

                	newLeafNode(otherlv_13, grammarAccess.getElementWizardAccess().getLeftCurlyBracketKeyword_13());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5080:1: ( (lv_pages_14_0= rulePage ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==100) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5081:1: (lv_pages_14_0= rulePage )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5081:1: (lv_pages_14_0= rulePage )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5082:3: lv_pages_14_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementWizardAccess().getPagesPageParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleElementWizard11338);
            	    lv_pages_14_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getElementWizardRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_14_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleElementWizard11351); 

                	newLeafNode(otherlv_15, grammarAccess.getElementWizardAccess().getRightCurlyBracketKeyword_15());
                
            otherlv_16=(Token)match(input,46,FOLLOW_46_in_ruleElementWizard11363); 

                	newLeafNode(otherlv_16, grammarAccess.getElementWizardAccess().getDefaultKeyword_16());
                
            otherlv_17=(Token)match(input,99,FOLLOW_99_in_ruleElementWizard11375); 

                	newLeafNode(otherlv_17, grammarAccess.getElementWizardAccess().getButtonsKeyword_17());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5110:1: ( (lv_defaultButtons_18_0= ruleEBoolean ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5111:1: (lv_defaultButtons_18_0= ruleEBoolean )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5111:1: (lv_defaultButtons_18_0= ruleEBoolean )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5112:3: lv_defaultButtons_18_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getElementWizardAccess().getDefaultButtonsEBooleanParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleEBoolean_in_ruleElementWizard11396);
            lv_defaultButtons_18_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementWizardRule());
            	        }
                   		set(
                   			current, 
                   			"defaultButtons",
                    		lv_defaultButtons_18_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleElementWizard11408); 

                	newLeafNode(otherlv_19, grammarAccess.getElementWizardAccess().getRightCurlyBracketKeyword_19());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementWizard"


    // $ANTLR start "entryRulePage"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5140:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5141:2: (iv_rulePage= rulePage EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5142:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage11444);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage11454); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5149:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'Page' otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Attributes to show' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttMap ) )* otherlv_10= '}' )? (otherlv_11= 'References to show' otherlv_12= '{' ( (lv_references_13_0= RULE_ID ) )* otherlv_14= '}' )? (otherlv_15= 'Additional buttons' otherlv_16= '{' ( (lv_buttons_17_0= ruleButton ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_references_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_attributes_9_0 = null;

        EObject lv_buttons_17_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5152:28: ( ( () otherlv_1= 'Page' otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Attributes to show' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttMap ) )* otherlv_10= '}' )? (otherlv_11= 'References to show' otherlv_12= '{' ( (lv_references_13_0= RULE_ID ) )* otherlv_14= '}' )? (otherlv_15= 'Additional buttons' otherlv_16= '{' ( (lv_buttons_17_0= ruleButton ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5153:1: ( () otherlv_1= 'Page' otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Attributes to show' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttMap ) )* otherlv_10= '}' )? (otherlv_11= 'References to show' otherlv_12= '{' ( (lv_references_13_0= RULE_ID ) )* otherlv_14= '}' )? (otherlv_15= 'Additional buttons' otherlv_16= '{' ( (lv_buttons_17_0= ruleButton ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5153:1: ( () otherlv_1= 'Page' otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Attributes to show' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttMap ) )* otherlv_10= '}' )? (otherlv_11= 'References to show' otherlv_12= '{' ( (lv_references_13_0= RULE_ID ) )* otherlv_14= '}' )? (otherlv_15= 'Additional buttons' otherlv_16= '{' ( (lv_buttons_17_0= ruleButton ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5153:2: () otherlv_1= 'Page' otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Attributes to show' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttMap ) )* otherlv_10= '}' )? (otherlv_11= 'References to show' otherlv_12= '{' ( (lv_references_13_0= RULE_ID ) )* otherlv_14= '}' )? (otherlv_15= 'Additional buttons' otherlv_16= '{' ( (lv_buttons_17_0= ruleButton ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5153:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5154:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPageAccess().getPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,100,FOLLOW_100_in_rulePage11500); 

                	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePage11512); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,97,FOLLOW_97_in_rulePage11524); 

                	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getTitleKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5171:1: ( (lv_title_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5172:1: (lv_title_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5172:1: (lv_title_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5173:3: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage11541); 

            			newLeafNode(lv_title_4_0, grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulePage11558); 

                	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getDescriptionKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5193:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5194:1: (lv_description_6_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5194:1: (lv_description_6_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5195:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage11575); 

            			newLeafNode(lv_description_6_0, grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5211:2: (otherlv_7= 'Attributes to show' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttMap ) )* otherlv_10= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==101) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5211:4: otherlv_7= 'Attributes to show' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttMap ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,101,FOLLOW_101_in_rulePage11593); 

                        	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getAttributesToShowKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_rulePage11605); 

                        	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5219:1: ( (lv_attributes_9_0= ruleAttMap ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==41) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5220:1: (lv_attributes_9_0= ruleAttMap )
                    	    {
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5220:1: (lv_attributes_9_0= ruleAttMap )
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5221:3: lv_attributes_9_0= ruleAttMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageAccess().getAttributesAttMapParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttMap_in_rulePage11626);
                    	    lv_attributes_9_0=ruleAttMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_9_0, 
                    	            		"AttMap");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_rulePage11639); 

                        	newLeafNode(otherlv_10, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5241:3: (otherlv_11= 'References to show' otherlv_12= '{' ( (lv_references_13_0= RULE_ID ) )* otherlv_14= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==102) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5241:5: otherlv_11= 'References to show' otherlv_12= '{' ( (lv_references_13_0= RULE_ID ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,102,FOLLOW_102_in_rulePage11654); 

                        	newLeafNode(otherlv_11, grammarAccess.getPageAccess().getReferencesToShowKeyword_8_0());
                        
                    otherlv_12=(Token)match(input,15,FOLLOW_15_in_rulePage11666); 

                        	newLeafNode(otherlv_12, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5249:1: ( (lv_references_13_0= RULE_ID ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5250:1: (lv_references_13_0= RULE_ID )
                    	    {
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5250:1: (lv_references_13_0= RULE_ID )
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5251:3: lv_references_13_0= RULE_ID
                    	    {
                    	    lv_references_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage11683); 

                    	    			newLeafNode(lv_references_13_0, grammarAccess.getPageAccess().getReferencesIDTerminalRuleCall_8_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPageRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"references",
                    	            		lv_references_13_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_rulePage11701); 

                        	newLeafNode(otherlv_14, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5271:3: (otherlv_15= 'Additional buttons' otherlv_16= '{' ( (lv_buttons_17_0= ruleButton ) )* otherlv_18= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==103) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5271:5: otherlv_15= 'Additional buttons' otherlv_16= '{' ( (lv_buttons_17_0= ruleButton ) )* otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,103,FOLLOW_103_in_rulePage11716); 

                        	newLeafNode(otherlv_15, grammarAccess.getPageAccess().getAdditionalButtonsKeyword_9_0());
                        
                    otherlv_16=(Token)match(input,15,FOLLOW_15_in_rulePage11728); 

                        	newLeafNode(otherlv_16, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5279:1: ( (lv_buttons_17_0= ruleButton ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==104) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5280:1: (lv_buttons_17_0= ruleButton )
                    	    {
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5280:1: (lv_buttons_17_0= ruleButton )
                    	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5281:3: lv_buttons_17_0= ruleButton
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleButton_in_rulePage11749);
                    	    lv_buttons_17_0=ruleButton();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"buttons",
                    	            		lv_buttons_17_0, 
                    	            		"Button");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,18,FOLLOW_18_in_rulePage11762); 

                        	newLeafNode(otherlv_18, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,18,FOLLOW_18_in_rulePage11776); 

                	newLeafNode(otherlv_19, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleAttMap"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5313:1: entryRuleAttMap returns [EObject current=null] : iv_ruleAttMap= ruleAttMap EOF ;
    public final EObject entryRuleAttMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttMap = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5314:2: (iv_ruleAttMap= ruleAttMap EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5315:2: iv_ruleAttMap= ruleAttMap EOF
            {
             newCompositeNode(grammarAccess.getAttMapRule()); 
            pushFollow(FOLLOW_ruleAttMap_in_entryRuleAttMap11812);
            iv_ruleAttMap=ruleAttMap();

            state._fsp--;

             current =iv_ruleAttMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttMap11822); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttMap"


    // $ANTLR start "ruleAttMap"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5322:1: ruleAttMap returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_attribute_2_0= RULE_STRING ) ) otherlv_3= ', ' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= ', ' ( (lv_component_6_0= ruleComponentType ) ) otherlv_7= ', ' ( (lv_defaultValue_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleAttMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_attribute_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_defaultValue_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_component_6_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5325:28: ( ( () otherlv_1= '(' ( (lv_attribute_2_0= RULE_STRING ) ) otherlv_3= ', ' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= ', ' ( (lv_component_6_0= ruleComponentType ) ) otherlv_7= ', ' ( (lv_defaultValue_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5326:1: ( () otherlv_1= '(' ( (lv_attribute_2_0= RULE_STRING ) ) otherlv_3= ', ' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= ', ' ( (lv_component_6_0= ruleComponentType ) ) otherlv_7= ', ' ( (lv_defaultValue_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5326:1: ( () otherlv_1= '(' ( (lv_attribute_2_0= RULE_STRING ) ) otherlv_3= ', ' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= ', ' ( (lv_component_6_0= ruleComponentType ) ) otherlv_7= ', ' ( (lv_defaultValue_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5326:2: () otherlv_1= '(' ( (lv_attribute_2_0= RULE_STRING ) ) otherlv_3= ', ' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= ', ' ( (lv_component_6_0= ruleComponentType ) ) otherlv_7= ', ' ( (lv_defaultValue_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5326:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5327:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttMapAccess().getAttMapAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleAttMap11868); 

                	newLeafNode(otherlv_1, grammarAccess.getAttMapAccess().getLeftParenthesisKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5336:1: ( (lv_attribute_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5337:1: (lv_attribute_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5337:1: (lv_attribute_2_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5338:3: lv_attribute_2_0= RULE_STRING
            {
            lv_attribute_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttMap11885); 

            			newLeafNode(lv_attribute_2_0, grammarAccess.getAttMapAccess().getAttributeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttMapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attribute",
                    		lv_attribute_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleAttMap11902); 

                	newLeafNode(otherlv_3, grammarAccess.getAttMapAccess().getCommaSpaceKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5358:1: ( (lv_label_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5359:1: (lv_label_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5359:1: (lv_label_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5360:3: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttMap11919); 

            			newLeafNode(lv_label_4_0, grammarAccess.getAttMapAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttMapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleAttMap11936); 

                	newLeafNode(otherlv_5, grammarAccess.getAttMapAccess().getCommaSpaceKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5380:1: ( (lv_component_6_0= ruleComponentType ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5381:1: (lv_component_6_0= ruleComponentType )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5381:1: (lv_component_6_0= ruleComponentType )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5382:3: lv_component_6_0= ruleComponentType
            {
             
            	        newCompositeNode(grammarAccess.getAttMapAccess().getComponentComponentTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentType_in_ruleAttMap11957);
            lv_component_6_0=ruleComponentType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttMapRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_6_0, 
                    		"ComponentType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleAttMap11969); 

                	newLeafNode(otherlv_7, grammarAccess.getAttMapAccess().getCommaSpaceKeyword_7());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5402:1: ( (lv_defaultValue_8_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5403:1: (lv_defaultValue_8_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5403:1: (lv_defaultValue_8_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5404:3: lv_defaultValue_8_0= RULE_STRING
            {
            lv_defaultValue_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttMap11986); 

            			newLeafNode(lv_defaultValue_8_0, grammarAccess.getAttMapAccess().getDefaultValueSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttMapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"defaultValue",
                    		lv_defaultValue_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleAttMap12003); 

                	newLeafNode(otherlv_9, grammarAccess.getAttMapAccess().getRightParenthesisKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttMap"


    // $ANTLR start "entryRuleButton"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5432:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5433:2: (iv_ruleButton= ruleButton EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5434:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton12039);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton12049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5441:1: ruleButton returns [EObject current=null] : ( () otherlv_1= 'Button' otherlv_2= '(' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= ', ' ( (lv_methodAction_5_0= RULE_STRING ) ) otherlv_6= ')' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token lv_methodAction_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5444:28: ( ( () otherlv_1= 'Button' otherlv_2= '(' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= ', ' ( (lv_methodAction_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5445:1: ( () otherlv_1= 'Button' otherlv_2= '(' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= ', ' ( (lv_methodAction_5_0= RULE_STRING ) ) otherlv_6= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5445:1: ( () otherlv_1= 'Button' otherlv_2= '(' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= ', ' ( (lv_methodAction_5_0= RULE_STRING ) ) otherlv_6= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5445:2: () otherlv_1= 'Button' otherlv_2= '(' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= ', ' ( (lv_methodAction_5_0= RULE_STRING ) ) otherlv_6= ')'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5445:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5446:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getButtonAccess().getButtonAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,104,FOLLOW_104_in_ruleButton12095); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
                
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleButton12107); 

                	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5459:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5460:1: (lv_label_3_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5460:1: (lv_label_3_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5461:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton12124); 

            			newLeafNode(lv_label_3_0, grammarAccess.getButtonAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleButton12141); 

                	newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getCommaSpaceKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5481:1: ( (lv_methodAction_5_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5482:1: (lv_methodAction_5_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5482:1: (lv_methodAction_5_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5483:3: lv_methodAction_5_0= RULE_STRING
            {
            lv_methodAction_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton12158); 

            			newLeafNode(lv_methodAction_5_0, grammarAccess.getButtonAccess().getMethodActionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"methodAction",
                    		lv_methodAction_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleButton12175); 

                	newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRulePersonalWizard"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5511:1: entryRulePersonalWizard returns [EObject current=null] : iv_rulePersonalWizard= rulePersonalWizard EOF ;
    public final EObject entryRulePersonalWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonalWizard = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5512:2: (iv_rulePersonalWizard= rulePersonalWizard EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5513:2: iv_rulePersonalWizard= rulePersonalWizard EOF
            {
             newCompositeNode(grammarAccess.getPersonalWizardRule()); 
            pushFollow(FOLLOW_rulePersonalWizard_in_entryRulePersonalWizard12211);
            iv_rulePersonalWizard=rulePersonalWizard();

            state._fsp--;

             current =iv_rulePersonalWizard; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersonalWizard12221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonalWizard"


    // $ANTLR start "rulePersonalWizard"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5520:1: rulePersonalWizard returns [EObject current=null] : (otherlv_0= 'Personal' otherlv_1= 'wizard' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'implementation reference' ( (lv_referenceImplementation_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject rulePersonalWizard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_referenceImplementation_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5523:28: ( (otherlv_0= 'Personal' otherlv_1= 'wizard' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'implementation reference' ( (lv_referenceImplementation_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5524:1: (otherlv_0= 'Personal' otherlv_1= 'wizard' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'implementation reference' ( (lv_referenceImplementation_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5524:1: (otherlv_0= 'Personal' otherlv_1= 'wizard' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'implementation reference' ( (lv_referenceImplementation_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5524:3: otherlv_0= 'Personal' otherlv_1= 'wizard' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'implementation reference' ( (lv_referenceImplementation_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_rulePersonalWizard12258); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonalWizardAccess().getPersonalKeyword_0());
                
            otherlv_1=(Token)match(input,106,FOLLOW_106_in_rulePersonalWizard12270); 

                	newLeafNode(otherlv_1, grammarAccess.getPersonalWizardAccess().getWizardKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5532:1: ( (lv_name_2_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5533:1: (lv_name_2_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5533:1: (lv_name_2_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5534:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersonalWizard12287); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPersonalWizardAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonalWizardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePersonalWizard12304); 

                	newLeafNode(otherlv_3, grammarAccess.getPersonalWizardAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,48,FOLLOW_48_in_rulePersonalWizard12316); 

                	newLeafNode(otherlv_4, grammarAccess.getPersonalWizardAccess().getImplementationReferenceKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5558:1: ( (lv_referenceImplementation_5_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5559:1: (lv_referenceImplementation_5_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5559:1: (lv_referenceImplementation_5_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5560:3: lv_referenceImplementation_5_0= RULE_STRING
            {
            lv_referenceImplementation_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePersonalWizard12333); 

            			newLeafNode(lv_referenceImplementation_5_0, grammarAccess.getPersonalWizardAccess().getReferenceImplementationSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonalWizardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceImplementation",
                    		lv_referenceImplementation_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePersonalWizard12350); 

                	newLeafNode(otherlv_6, grammarAccess.getPersonalWizardAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonalWizard"


    // $ANTLR start "entryRuleView"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5588:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5589:2: (iv_ruleView= ruleView EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5590:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView12386);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView12396); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5597:1: ruleView returns [EObject current=null] : (this_PredefinedView_0= rulePredefinedView | this_PersonalView_1= rulePersonalView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_PredefinedView_0 = null;

        EObject this_PersonalView_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5600:28: ( (this_PredefinedView_0= rulePredefinedView | this_PersonalView_1= rulePersonalView ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5601:1: (this_PredefinedView_0= rulePredefinedView | this_PersonalView_1= rulePersonalView )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5601:1: (this_PredefinedView_0= rulePredefinedView | this_PersonalView_1= rulePersonalView )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==107) ) {
                alt51=1;
            }
            else if ( (LA51_0==120) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5602:5: this_PredefinedView_0= rulePredefinedView
                    {
                     
                            newCompositeNode(grammarAccess.getViewAccess().getPredefinedViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePredefinedView_in_ruleView12443);
                    this_PredefinedView_0=rulePredefinedView();

                    state._fsp--;

                     
                            current = this_PredefinedView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5612:5: this_PersonalView_1= rulePersonalView
                    {
                     
                            newCompositeNode(grammarAccess.getViewAccess().getPersonalViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePersonalView_in_ruleView12470);
                    this_PersonalView_1=rulePersonalView();

                    state._fsp--;

                     
                            current = this_PersonalView_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRulePredefinedView"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5628:1: entryRulePredefinedView returns [EObject current=null] : iv_rulePredefinedView= rulePredefinedView EOF ;
    public final EObject entryRulePredefinedView() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedView = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5629:2: (iv_rulePredefinedView= rulePredefinedView EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5630:2: iv_rulePredefinedView= rulePredefinedView EOF
            {
             newCompositeNode(grammarAccess.getPredefinedViewRule()); 
            pushFollow(FOLLOW_rulePredefinedView_in_entryRulePredefinedView12505);
            iv_rulePredefinedView=rulePredefinedView();

            state._fsp--;

             current =iv_rulePredefinedView; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefinedView12515); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredefinedView"


    // $ANTLR start "rulePredefinedView"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5637:1: rulePredefinedView returns [EObject current=null] : (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleViewType ) ) otherlv_9= 'style' ( (lv_style_10_0= ruleViewStyle ) ) (otherlv_11= 'class' otherlv_12= 'data' otherlv_13= 'provider' ( (lv_referenceImplementation_14_0= RULE_STRING ) ) )? otherlv_15= '}' ) ;
    public final EObject rulePredefinedView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_referenceImplementation_14_0=null;
        Token otherlv_15=null;
        EObject lv_type_8_0 = null;

        EObject lv_style_10_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5640:28: ( (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleViewType ) ) otherlv_9= 'style' ( (lv_style_10_0= ruleViewStyle ) ) (otherlv_11= 'class' otherlv_12= 'data' otherlv_13= 'provider' ( (lv_referenceImplementation_14_0= RULE_STRING ) ) )? otherlv_15= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5641:1: (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleViewType ) ) otherlv_9= 'style' ( (lv_style_10_0= ruleViewStyle ) ) (otherlv_11= 'class' otherlv_12= 'data' otherlv_13= 'provider' ( (lv_referenceImplementation_14_0= RULE_STRING ) ) )? otherlv_15= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5641:1: (otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleViewType ) ) otherlv_9= 'style' ( (lv_style_10_0= ruleViewStyle ) ) (otherlv_11= 'class' otherlv_12= 'data' otherlv_13= 'provider' ( (lv_referenceImplementation_14_0= RULE_STRING ) ) )? otherlv_15= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5641:3: otherlv_0= 'View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleViewType ) ) otherlv_9= 'style' ( (lv_style_10_0= ruleViewStyle ) ) (otherlv_11= 'class' otherlv_12= 'data' otherlv_13= 'provider' ( (lv_referenceImplementation_14_0= RULE_STRING ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_107_in_rulePredefinedView12552); 

                	newLeafNode(otherlv_0, grammarAccess.getPredefinedViewAccess().getViewKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5645:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5646:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5646:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5647:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredefinedView12569); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPredefinedViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPredefinedViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePredefinedView12586); 

                	newLeafNode(otherlv_2, grammarAccess.getPredefinedViewAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,97,FOLLOW_97_in_rulePredefinedView12598); 

                	newLeafNode(otherlv_3, grammarAccess.getPredefinedViewAccess().getTitleKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5671:1: ( (lv_title_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5672:1: (lv_title_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5672:1: (lv_title_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5673:3: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePredefinedView12615); 

            			newLeafNode(lv_title_4_0, grammarAccess.getPredefinedViewAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPredefinedViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulePredefinedView12632); 

                	newLeafNode(otherlv_5, grammarAccess.getPredefinedViewAccess().getDescriptionKeyword_5());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5693:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5694:1: (lv_description_6_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5694:1: (lv_description_6_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5695:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePredefinedView12649); 

            			newLeafNode(lv_description_6_0, grammarAccess.getPredefinedViewAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPredefinedViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_31_in_rulePredefinedView12666); 

                	newLeafNode(otherlv_7, grammarAccess.getPredefinedViewAccess().getTypeKeyword_7());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5715:1: ( (lv_type_8_0= ruleViewType ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5716:1: (lv_type_8_0= ruleViewType )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5716:1: (lv_type_8_0= ruleViewType )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5717:3: lv_type_8_0= ruleViewType
            {
             
            	        newCompositeNode(grammarAccess.getPredefinedViewAccess().getTypeViewTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleViewType_in_rulePredefinedView12687);
            lv_type_8_0=ruleViewType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredefinedViewRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"ViewType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,80,FOLLOW_80_in_rulePredefinedView12699); 

                	newLeafNode(otherlv_9, grammarAccess.getPredefinedViewAccess().getStyleKeyword_9());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5737:1: ( (lv_style_10_0= ruleViewStyle ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5738:1: (lv_style_10_0= ruleViewStyle )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5738:1: (lv_style_10_0= ruleViewStyle )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5739:3: lv_style_10_0= ruleViewStyle
            {
             
            	        newCompositeNode(grammarAccess.getPredefinedViewAccess().getStyleViewStyleParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleViewStyle_in_rulePredefinedView12720);
            lv_style_10_0=ruleViewStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredefinedViewRule());
            	        }
                   		set(
                   			current, 
                   			"style",
                    		lv_style_10_0, 
                    		"ViewStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5755:2: (otherlv_11= 'class' otherlv_12= 'data' otherlv_13= 'provider' ( (lv_referenceImplementation_14_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==20) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5755:4: otherlv_11= 'class' otherlv_12= 'data' otherlv_13= 'provider' ( (lv_referenceImplementation_14_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_rulePredefinedView12733); 

                        	newLeafNode(otherlv_11, grammarAccess.getPredefinedViewAccess().getClassKeyword_11_0());
                        
                    otherlv_12=(Token)match(input,108,FOLLOW_108_in_rulePredefinedView12745); 

                        	newLeafNode(otherlv_12, grammarAccess.getPredefinedViewAccess().getDataKeyword_11_1());
                        
                    otherlv_13=(Token)match(input,109,FOLLOW_109_in_rulePredefinedView12757); 

                        	newLeafNode(otherlv_13, grammarAccess.getPredefinedViewAccess().getProviderKeyword_11_2());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5767:1: ( (lv_referenceImplementation_14_0= RULE_STRING ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5768:1: (lv_referenceImplementation_14_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5768:1: (lv_referenceImplementation_14_0= RULE_STRING )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5769:3: lv_referenceImplementation_14_0= RULE_STRING
                    {
                    lv_referenceImplementation_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePredefinedView12774); 

                    			newLeafNode(lv_referenceImplementation_14_0, grammarAccess.getPredefinedViewAccess().getReferenceImplementationSTRINGTerminalRuleCall_11_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredefinedViewRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"referenceImplementation",
                            		lv_referenceImplementation_14_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_rulePredefinedView12793); 

                	newLeafNode(otherlv_15, grammarAccess.getPredefinedViewAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredefinedView"


    // $ANTLR start "entryRuleViewType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5797:1: entryRuleViewType returns [EObject current=null] : iv_ruleViewType= ruleViewType EOF ;
    public final EObject entryRuleViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewType = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5798:2: (iv_ruleViewType= ruleViewType EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5799:2: iv_ruleViewType= ruleViewType EOF
            {
             newCompositeNode(grammarAccess.getViewTypeRule()); 
            pushFollow(FOLLOW_ruleViewType_in_entryRuleViewType12829);
            iv_ruleViewType=ruleViewType();

            state._fsp--;

             current =iv_ruleViewType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewType12839); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewType"


    // $ANTLR start "ruleViewType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5806:1: ruleViewType returns [EObject current=null] : (this_ShowChilds_0= ruleShowChilds | this_ShowSelection_1= ruleShowSelection | this_CountTypes_2= ruleCountTypes ) ;
    public final EObject ruleViewType() throws RecognitionException {
        EObject current = null;

        EObject this_ShowChilds_0 = null;

        EObject this_ShowSelection_1 = null;

        EObject this_CountTypes_2 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5809:28: ( (this_ShowChilds_0= ruleShowChilds | this_ShowSelection_1= ruleShowSelection | this_CountTypes_2= ruleCountTypes ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5810:1: (this_ShowChilds_0= ruleShowChilds | this_ShowSelection_1= ruleShowSelection | this_CountTypes_2= ruleCountTypes )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5810:1: (this_ShowChilds_0= ruleShowChilds | this_ShowSelection_1= ruleShowSelection | this_CountTypes_2= ruleCountTypes )
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==110) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==113) ) {
                    alt53=2;
                }
                else if ( (LA53_1==111) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==115) ) {
                alt53=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5811:5: this_ShowChilds_0= ruleShowChilds
                    {
                     
                            newCompositeNode(grammarAccess.getViewTypeAccess().getShowChildsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleShowChilds_in_ruleViewType12886);
                    this_ShowChilds_0=ruleShowChilds();

                    state._fsp--;

                     
                            current = this_ShowChilds_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5821:5: this_ShowSelection_1= ruleShowSelection
                    {
                     
                            newCompositeNode(grammarAccess.getViewTypeAccess().getShowSelectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleShowSelection_in_ruleViewType12913);
                    this_ShowSelection_1=ruleShowSelection();

                    state._fsp--;

                     
                            current = this_ShowSelection_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5831:5: this_CountTypes_2= ruleCountTypes
                    {
                     
                            newCompositeNode(grammarAccess.getViewTypeAccess().getCountTypesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCountTypes_in_ruleViewType12940);
                    this_CountTypes_2=ruleCountTypes();

                    state._fsp--;

                     
                            current = this_CountTypes_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewType"


    // $ANTLR start "entryRuleShowChilds"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5847:1: entryRuleShowChilds returns [EObject current=null] : iv_ruleShowChilds= ruleShowChilds EOF ;
    public final EObject entryRuleShowChilds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowChilds = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5848:2: (iv_ruleShowChilds= ruleShowChilds EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5849:2: iv_ruleShowChilds= ruleShowChilds EOF
            {
             newCompositeNode(grammarAccess.getShowChildsRule()); 
            pushFollow(FOLLOW_ruleShowChilds_in_entryRuleShowChilds12975);
            iv_ruleShowChilds=ruleShowChilds();

            state._fsp--;

             current =iv_ruleShowChilds; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShowChilds12985); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShowChilds"


    // $ANTLR start "ruleShowChilds"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5856:1: ruleShowChilds returns [EObject current=null] : ( () otherlv_1= 'Show' otherlv_2= 'childs' otherlv_3= '(' otherlv_4= 'parent element' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' ) ;
    public final EObject ruleShowChilds() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_classReference_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5859:28: ( ( () otherlv_1= 'Show' otherlv_2= 'childs' otherlv_3= '(' otherlv_4= 'parent element' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5860:1: ( () otherlv_1= 'Show' otherlv_2= 'childs' otherlv_3= '(' otherlv_4= 'parent element' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5860:1: ( () otherlv_1= 'Show' otherlv_2= 'childs' otherlv_3= '(' otherlv_4= 'parent element' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5860:2: () otherlv_1= 'Show' otherlv_2= 'childs' otherlv_3= '(' otherlv_4= 'parent element' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5860:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5861:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShowChildsAccess().getShowChildsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,110,FOLLOW_110_in_ruleShowChilds13031); 

                	newLeafNode(otherlv_1, grammarAccess.getShowChildsAccess().getShowKeyword_1());
                
            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleShowChilds13043); 

                	newLeafNode(otherlv_2, grammarAccess.getShowChildsAccess().getChildsKeyword_2());
                
            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleShowChilds13055); 

                	newLeafNode(otherlv_3, grammarAccess.getShowChildsAccess().getLeftParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,112,FOLLOW_112_in_ruleShowChilds13067); 

                	newLeafNode(otherlv_4, grammarAccess.getShowChildsAccess().getParentElementKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5882:1: ( (lv_classReference_5_0= ruleClassReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5883:1: (lv_classReference_5_0= ruleClassReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5883:1: (lv_classReference_5_0= ruleClassReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5884:3: lv_classReference_5_0= ruleClassReference
            {
             
            	        newCompositeNode(grammarAccess.getShowChildsAccess().getClassReferenceClassReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleClassReference_in_ruleShowChilds13088);
            lv_classReference_5_0=ruleClassReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShowChildsRule());
            	        }
                   		set(
                   			current, 
                   			"classReference",
                    		lv_classReference_5_0, 
                    		"ClassReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleShowChilds13100); 

                	newLeafNode(otherlv_6, grammarAccess.getShowChildsAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShowChilds"


    // $ANTLR start "entryRuleShowSelection"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5912:1: entryRuleShowSelection returns [EObject current=null] : iv_ruleShowSelection= ruleShowSelection EOF ;
    public final EObject entryRuleShowSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowSelection = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5913:2: (iv_ruleShowSelection= ruleShowSelection EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5914:2: iv_ruleShowSelection= ruleShowSelection EOF
            {
             newCompositeNode(grammarAccess.getShowSelectionRule()); 
            pushFollow(FOLLOW_ruleShowSelection_in_entryRuleShowSelection13136);
            iv_ruleShowSelection=ruleShowSelection();

            state._fsp--;

             current =iv_ruleShowSelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShowSelection13146); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShowSelection"


    // $ANTLR start "ruleShowSelection"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5921:1: ruleShowSelection returns [EObject current=null] : ( () otherlv_1= 'Show' otherlv_2= 'selection' (otherlv_3= '(' otherlv_4= 'filter type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleShowSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_classReference_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5924:28: ( ( () otherlv_1= 'Show' otherlv_2= 'selection' (otherlv_3= '(' otherlv_4= 'filter type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )? ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5925:1: ( () otherlv_1= 'Show' otherlv_2= 'selection' (otherlv_3= '(' otherlv_4= 'filter type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )? )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5925:1: ( () otherlv_1= 'Show' otherlv_2= 'selection' (otherlv_3= '(' otherlv_4= 'filter type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )? )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5925:2: () otherlv_1= 'Show' otherlv_2= 'selection' (otherlv_3= '(' otherlv_4= 'filter type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )?
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5925:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5926:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShowSelectionAccess().getShowSelectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,110,FOLLOW_110_in_ruleShowSelection13192); 

                	newLeafNode(otherlv_1, grammarAccess.getShowSelectionAccess().getShowKeyword_1());
                
            otherlv_2=(Token)match(input,113,FOLLOW_113_in_ruleShowSelection13204); 

                	newLeafNode(otherlv_2, grammarAccess.getShowSelectionAccess().getSelectionKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5939:1: (otherlv_3= '(' otherlv_4= 'filter type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5939:3: otherlv_3= '(' otherlv_4= 'filter type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleShowSelection13217); 

                        	newLeafNode(otherlv_3, grammarAccess.getShowSelectionAccess().getLeftParenthesisKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,114,FOLLOW_114_in_ruleShowSelection13229); 

                        	newLeafNode(otherlv_4, grammarAccess.getShowSelectionAccess().getFilterTypeKeyword_3_1());
                        
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5947:1: ( (lv_classReference_5_0= ruleClassReference ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5948:1: (lv_classReference_5_0= ruleClassReference )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5948:1: (lv_classReference_5_0= ruleClassReference )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5949:3: lv_classReference_5_0= ruleClassReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getShowSelectionAccess().getClassReferenceClassReferenceParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassReference_in_ruleShowSelection13250);
                    lv_classReference_5_0=ruleClassReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShowSelectionRule());
                    	        }
                           		set(
                           			current, 
                           			"classReference",
                            		lv_classReference_5_0, 
                            		"ClassReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleShowSelection13262); 

                        	newLeafNode(otherlv_6, grammarAccess.getShowSelectionAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShowSelection"


    // $ANTLR start "entryRuleCountTypes"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5977:1: entryRuleCountTypes returns [EObject current=null] : iv_ruleCountTypes= ruleCountTypes EOF ;
    public final EObject entryRuleCountTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountTypes = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5978:2: (iv_ruleCountTypes= ruleCountTypes EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5979:2: iv_ruleCountTypes= ruleCountTypes EOF
            {
             newCompositeNode(grammarAccess.getCountTypesRule()); 
            pushFollow(FOLLOW_ruleCountTypes_in_entryRuleCountTypes13300);
            iv_ruleCountTypes=ruleCountTypes();

            state._fsp--;

             current =iv_ruleCountTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountTypes13310); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountTypes"


    // $ANTLR start "ruleCountTypes"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5986:1: ruleCountTypes returns [EObject current=null] : ( () otherlv_1= 'Count' otherlv_2= 'types' otherlv_3= '(' otherlv_4= 'type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' ) ;
    public final EObject ruleCountTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_classReference_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5989:28: ( ( () otherlv_1= 'Count' otherlv_2= 'types' otherlv_3= '(' otherlv_4= 'type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5990:1: ( () otherlv_1= 'Count' otherlv_2= 'types' otherlv_3= '(' otherlv_4= 'type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5990:1: ( () otherlv_1= 'Count' otherlv_2= 'types' otherlv_3= '(' otherlv_4= 'type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5990:2: () otherlv_1= 'Count' otherlv_2= 'types' otherlv_3= '(' otherlv_4= 'type' ( (lv_classReference_5_0= ruleClassReference ) ) otherlv_6= ')'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5990:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:5991:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCountTypesAccess().getCountTypesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleCountTypes13356); 

                	newLeafNode(otherlv_1, grammarAccess.getCountTypesAccess().getCountKeyword_1());
                
            otherlv_2=(Token)match(input,116,FOLLOW_116_in_ruleCountTypes13368); 

                	newLeafNode(otherlv_2, grammarAccess.getCountTypesAccess().getTypesKeyword_2());
                
            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleCountTypes13380); 

                	newLeafNode(otherlv_3, grammarAccess.getCountTypesAccess().getLeftParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleCountTypes13392); 

                	newLeafNode(otherlv_4, grammarAccess.getCountTypesAccess().getTypeKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6012:1: ( (lv_classReference_5_0= ruleClassReference ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6013:1: (lv_classReference_5_0= ruleClassReference )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6013:1: (lv_classReference_5_0= ruleClassReference )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6014:3: lv_classReference_5_0= ruleClassReference
            {
             
            	        newCompositeNode(grammarAccess.getCountTypesAccess().getClassReferenceClassReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleClassReference_in_ruleCountTypes13413);
            lv_classReference_5_0=ruleClassReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCountTypesRule());
            	        }
                   		set(
                   			current, 
                   			"classReference",
                    		lv_classReference_5_0, 
                    		"ClassReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleCountTypes13425); 

                	newLeafNode(otherlv_6, grammarAccess.getCountTypesAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountTypes"


    // $ANTLR start "entryRuleViewStyle"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6042:1: entryRuleViewStyle returns [EObject current=null] : iv_ruleViewStyle= ruleViewStyle EOF ;
    public final EObject entryRuleViewStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewStyle = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6043:2: (iv_ruleViewStyle= ruleViewStyle EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6044:2: iv_ruleViewStyle= ruleViewStyle EOF
            {
             newCompositeNode(grammarAccess.getViewStyleRule()); 
            pushFollow(FOLLOW_ruleViewStyle_in_entryRuleViewStyle13461);
            iv_ruleViewStyle=ruleViewStyle();

            state._fsp--;

             current =iv_ruleViewStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewStyle13471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewStyle"


    // $ANTLR start "ruleViewStyle"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6051:1: ruleViewStyle returns [EObject current=null] : ( ( (lv_tree_0_0= 'tree' ) ) | ( (lv_selection_1_0= 'selection' ) ) | ( ( (lv_table_2_0= 'table' ) ) ( (lv_resultGraphic_3_0= 'graphic' ) ) ) ) ;
    public final EObject ruleViewStyle() throws RecognitionException {
        EObject current = null;

        Token lv_tree_0_0=null;
        Token lv_selection_1_0=null;
        Token lv_table_2_0=null;
        Token lv_resultGraphic_3_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6054:28: ( ( ( (lv_tree_0_0= 'tree' ) ) | ( (lv_selection_1_0= 'selection' ) ) | ( ( (lv_table_2_0= 'table' ) ) ( (lv_resultGraphic_3_0= 'graphic' ) ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6055:1: ( ( (lv_tree_0_0= 'tree' ) ) | ( (lv_selection_1_0= 'selection' ) ) | ( ( (lv_table_2_0= 'table' ) ) ( (lv_resultGraphic_3_0= 'graphic' ) ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6055:1: ( ( (lv_tree_0_0= 'tree' ) ) | ( (lv_selection_1_0= 'selection' ) ) | ( ( (lv_table_2_0= 'table' ) ) ( (lv_resultGraphic_3_0= 'graphic' ) ) ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt55=1;
                }
                break;
            case 113:
                {
                alt55=2;
                }
                break;
            case 118:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6055:2: ( (lv_tree_0_0= 'tree' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6055:2: ( (lv_tree_0_0= 'tree' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6056:1: (lv_tree_0_0= 'tree' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6056:1: (lv_tree_0_0= 'tree' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6057:3: lv_tree_0_0= 'tree'
                    {
                    lv_tree_0_0=(Token)match(input,117,FOLLOW_117_in_ruleViewStyle13514); 

                            newLeafNode(lv_tree_0_0, grammarAccess.getViewStyleAccess().getTreeTreeKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewStyleRule());
                    	        }
                           		setWithLastConsumed(current, "tree", lv_tree_0_0, "tree");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6071:6: ( (lv_selection_1_0= 'selection' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6071:6: ( (lv_selection_1_0= 'selection' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6072:1: (lv_selection_1_0= 'selection' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6072:1: (lv_selection_1_0= 'selection' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6073:3: lv_selection_1_0= 'selection'
                    {
                    lv_selection_1_0=(Token)match(input,113,FOLLOW_113_in_ruleViewStyle13551); 

                            newLeafNode(lv_selection_1_0, grammarAccess.getViewStyleAccess().getSelectionSelectionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewStyleRule());
                    	        }
                           		setWithLastConsumed(current, "selection", lv_selection_1_0, "selection");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6087:6: ( ( (lv_table_2_0= 'table' ) ) ( (lv_resultGraphic_3_0= 'graphic' ) ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6087:6: ( ( (lv_table_2_0= 'table' ) ) ( (lv_resultGraphic_3_0= 'graphic' ) ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6087:7: ( (lv_table_2_0= 'table' ) ) ( (lv_resultGraphic_3_0= 'graphic' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6087:7: ( (lv_table_2_0= 'table' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6088:1: (lv_table_2_0= 'table' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6088:1: (lv_table_2_0= 'table' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6089:3: lv_table_2_0= 'table'
                    {
                    lv_table_2_0=(Token)match(input,118,FOLLOW_118_in_ruleViewStyle13589); 

                            newLeafNode(lv_table_2_0, grammarAccess.getViewStyleAccess().getTableTableKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewStyleRule());
                    	        }
                           		setWithLastConsumed(current, "table", lv_table_2_0, "table");
                    	    

                    }


                    }

                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6102:2: ( (lv_resultGraphic_3_0= 'graphic' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6103:1: (lv_resultGraphic_3_0= 'graphic' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6103:1: (lv_resultGraphic_3_0= 'graphic' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6104:3: lv_resultGraphic_3_0= 'graphic'
                    {
                    lv_resultGraphic_3_0=(Token)match(input,119,FOLLOW_119_in_ruleViewStyle13620); 

                            newLeafNode(lv_resultGraphic_3_0, grammarAccess.getViewStyleAccess().getResultGraphicGraphicKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewStyleRule());
                    	        }
                           		setWithLastConsumed(current, "resultGraphic", lv_resultGraphic_3_0, "graphic");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewStyle"


    // $ANTLR start "entryRulePersonalView"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6125:1: entryRulePersonalView returns [EObject current=null] : iv_rulePersonalView= rulePersonalView EOF ;
    public final EObject entryRulePersonalView() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonalView = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6126:2: (iv_rulePersonalView= rulePersonalView EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6127:2: iv_rulePersonalView= rulePersonalView EOF
            {
             newCompositeNode(grammarAccess.getPersonalViewRule()); 
            pushFollow(FOLLOW_rulePersonalView_in_entryRulePersonalView13670);
            iv_rulePersonalView=rulePersonalView();

            state._fsp--;

             current =iv_rulePersonalView; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersonalView13680); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonalView"


    // $ANTLR start "rulePersonalView"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6134:1: rulePersonalView returns [EObject current=null] : (otherlv_0= 'Personal view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject rulePersonalView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_referenceImplementation_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6137:28: ( (otherlv_0= 'Personal view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6138:1: (otherlv_0= 'Personal view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6138:1: (otherlv_0= 'Personal view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6138:3: otherlv_0= 'Personal view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'implementation reference' ( (lv_referenceImplementation_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_120_in_rulePersonalView13717); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonalViewAccess().getPersonalViewKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6143:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6143:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersonalView13734); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPersonalViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonalViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePersonalView13751); 

                	newLeafNode(otherlv_2, grammarAccess.getPersonalViewAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,48,FOLLOW_48_in_rulePersonalView13763); 

                	newLeafNode(otherlv_3, grammarAccess.getPersonalViewAccess().getImplementationReferenceKeyword_3());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6168:1: ( (lv_referenceImplementation_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6169:1: (lv_referenceImplementation_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6169:1: (lv_referenceImplementation_4_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6170:3: lv_referenceImplementation_4_0= RULE_STRING
            {
            lv_referenceImplementation_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePersonalView13780); 

            			newLeafNode(lv_referenceImplementation_4_0, grammarAccess.getPersonalViewAccess().getReferenceImplementationSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonalViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceImplementation",
                    		lv_referenceImplementation_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePersonalView13797); 

                	newLeafNode(otherlv_5, grammarAccess.getPersonalViewAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonalView"


    // $ANTLR start "entryRuleStatement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6198:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6199:2: (iv_ruleStatement= ruleStatement EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6200:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement13833);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement13843); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6207:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'Actions for type' ( (lv_classReference_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classReference_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_events_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6210:28: ( (otherlv_0= 'Actions for type' ( (lv_classReference_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6211:1: (otherlv_0= 'Actions for type' ( (lv_classReference_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6211:1: (otherlv_0= 'Actions for type' ( (lv_classReference_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6211:3: otherlv_0= 'Actions for type' ( (lv_classReference_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_121_in_ruleStatement13880); 

                	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getActionsForTypeKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6215:1: ( (lv_classReference_1_0= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6216:1: (lv_classReference_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6216:1: (lv_classReference_1_0= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6217:3: lv_classReference_1_0= RULE_ID
            {
            lv_classReference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement13897); 

            			newLeafNode(lv_classReference_1_0, grammarAccess.getStatementAccess().getClassReferenceIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classReference",
                    		lv_classReference_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStatement13914); 

                	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6237:1: ( (lv_events_3_0= ruleEvent ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==122) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6238:1: (lv_events_3_0= ruleEvent )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6238:1: (lv_events_3_0= ruleEvent )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6239:3: lv_events_3_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementAccess().getEventsEventParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleStatement13935);
            	    lv_events_3_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_3_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStatement13948); 

                	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6267:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6268:2: (iv_ruleEvent= ruleEvent EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6269:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent13984);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent13994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6276:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'on' ( (lv_eventType_2_0= ruleEventType ) ) otherlv_3= 'do' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_eventType_2_0 = null;

        EObject lv_instructions_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6279:28: ( ( () otherlv_1= 'on' ( (lv_eventType_2_0= ruleEventType ) ) otherlv_3= 'do' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= '}' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6280:1: ( () otherlv_1= 'on' ( (lv_eventType_2_0= ruleEventType ) ) otherlv_3= 'do' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= '}' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6280:1: ( () otherlv_1= 'on' ( (lv_eventType_2_0= ruleEventType ) ) otherlv_3= 'do' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= '}' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6280:2: () otherlv_1= 'on' ( (lv_eventType_2_0= ruleEventType ) ) otherlv_3= 'do' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= '}'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6280:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6281:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,122,FOLLOW_122_in_ruleEvent14040); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getOnKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6290:1: ( (lv_eventType_2_0= ruleEventType ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6291:1: (lv_eventType_2_0= ruleEventType )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6291:1: (lv_eventType_2_0= ruleEventType )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6292:3: lv_eventType_2_0= ruleEventType
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getEventTypeEventTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEventType_in_ruleEvent14061);
            lv_eventType_2_0=ruleEventType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRule());
            	        }
                   		set(
                   			current, 
                   			"eventType",
                    		lv_eventType_2_0, 
                    		"EventType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,123,FOLLOW_123_in_ruleEvent14073); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getDoKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEvent14085); 

                	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6316:1: ( (lv_instructions_5_0= ruleInstruction ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==140||LA57_0==142) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6317:1: (lv_instructions_5_0= ruleInstruction )
            	    {
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6317:1: (lv_instructions_5_0= ruleInstruction )
            	    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6318:3: lv_instructions_5_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getInstructionsInstructionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleEvent14106);
            	    lv_instructions_5_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_5_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEvent14119); 

                	newLeafNode(otherlv_6, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6346:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6347:2: (iv_ruleEventType= ruleEventType EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6348:2: iv_ruleEventType= ruleEventType EOF
            {
             newCompositeNode(grammarAccess.getEventTypeRule()); 
            pushFollow(FOLLOW_ruleEventType_in_entryRuleEventType14155);
            iv_ruleEventType=ruleEventType();

            state._fsp--;

             current =iv_ruleEventType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventType14165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventType"


    // $ANTLR start "ruleEventType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6355:1: ruleEventType returns [EObject current=null] : (this_MouseEvent_0= ruleMouseEvent | this_KeyEvent_1= ruleKeyEvent | this_ElementEvent_2= ruleElementEvent | this_MenuEvent_3= ruleMenuEvent ) ;
    public final EObject ruleEventType() throws RecognitionException {
        EObject current = null;

        EObject this_MouseEvent_0 = null;

        EObject this_KeyEvent_1 = null;

        EObject this_ElementEvent_2 = null;

        EObject this_MenuEvent_3 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6358:28: ( (this_MouseEvent_0= ruleMouseEvent | this_KeyEvent_1= ruleKeyEvent | this_ElementEvent_2= ruleElementEvent | this_MenuEvent_3= ruleMenuEvent ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6359:1: (this_MouseEvent_0= ruleMouseEvent | this_KeyEvent_1= ruleKeyEvent | this_ElementEvent_2= ruleElementEvent | this_MenuEvent_3= ruleMenuEvent )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6359:1: (this_MouseEvent_0= ruleMouseEvent | this_KeyEvent_1= ruleKeyEvent | this_ElementEvent_2= ruleElementEvent | this_MenuEvent_3= ruleMenuEvent )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt58=1;
                }
                break;
            case 135:
                {
                alt58=2;
                }
                break;
            case 137:
            case 138:
                {
                alt58=3;
                }
                break;
            case 139:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6360:5: this_MouseEvent_0= ruleMouseEvent
                    {
                     
                            newCompositeNode(grammarAccess.getEventTypeAccess().getMouseEventParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMouseEvent_in_ruleEventType14212);
                    this_MouseEvent_0=ruleMouseEvent();

                    state._fsp--;

                     
                            current = this_MouseEvent_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6370:5: this_KeyEvent_1= ruleKeyEvent
                    {
                     
                            newCompositeNode(grammarAccess.getEventTypeAccess().getKeyEventParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKeyEvent_in_ruleEventType14239);
                    this_KeyEvent_1=ruleKeyEvent();

                    state._fsp--;

                     
                            current = this_KeyEvent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6380:5: this_ElementEvent_2= ruleElementEvent
                    {
                     
                            newCompositeNode(grammarAccess.getEventTypeAccess().getElementEventParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementEvent_in_ruleEventType14266);
                    this_ElementEvent_2=ruleElementEvent();

                    state._fsp--;

                     
                            current = this_ElementEvent_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6390:5: this_MenuEvent_3= ruleMenuEvent
                    {
                     
                            newCompositeNode(grammarAccess.getEventTypeAccess().getMenuEventParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMenuEvent_in_ruleEventType14293);
                    this_MenuEvent_3=ruleMenuEvent();

                    state._fsp--;

                     
                            current = this_MenuEvent_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventType"


    // $ANTLR start "entryRuleMouseEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6406:1: entryRuleMouseEvent returns [EObject current=null] : iv_ruleMouseEvent= ruleMouseEvent EOF ;
    public final EObject entryRuleMouseEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMouseEvent = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6407:2: (iv_ruleMouseEvent= ruleMouseEvent EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6408:2: iv_ruleMouseEvent= ruleMouseEvent EOF
            {
             newCompositeNode(grammarAccess.getMouseEventRule()); 
            pushFollow(FOLLOW_ruleMouseEvent_in_entryRuleMouseEvent14328);
            iv_ruleMouseEvent=ruleMouseEvent();

            state._fsp--;

             current =iv_ruleMouseEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMouseEvent14338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMouseEvent"


    // $ANTLR start "ruleMouseEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6415:1: ruleMouseEvent returns [EObject current=null] : ( ( ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down' ) | ( ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter' ) | ( ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel' ) | ( ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up' ) | ( ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel' ) | ( ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel' ) | ( ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover' ) | ( ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit' ) | ( ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click' ) ) ;
    public final EObject ruleMouseEvent() throws RecognitionException {
        EObject current = null;

        Token lv_mouseDown_0_0=null;
        Token otherlv_1=null;
        Token lv_mouseEnter_2_0=null;
        Token otherlv_3=null;
        Token lv_mouseHorizontalWheel_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_mouseUp_7_0=null;
        Token otherlv_8=null;
        Token lv_mouseWheel_9_0=null;
        Token otherlv_10=null;
        Token lv_mouseVerticalWheel_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_mouseHover_14_0=null;
        Token otherlv_15=null;
        Token lv_mouseExit_16_0=null;
        Token otherlv_17=null;
        Token lv_mouseDoubleClick_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6418:28: ( ( ( ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down' ) | ( ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter' ) | ( ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel' ) | ( ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up' ) | ( ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel' ) | ( ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel' ) | ( ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover' ) | ( ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit' ) | ( ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6419:1: ( ( ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down' ) | ( ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter' ) | ( ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel' ) | ( ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up' ) | ( ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel' ) | ( ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel' ) | ( ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover' ) | ( ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit' ) | ( ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6419:1: ( ( ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down' ) | ( ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter' ) | ( ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel' ) | ( ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up' ) | ( ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel' ) | ( ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel' ) | ( ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover' ) | ( ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit' ) | ( ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click' ) )
            int alt59=9;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6419:2: ( ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6419:2: ( ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6419:3: ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6419:3: ( (lv_mouseDown_0_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6420:1: (lv_mouseDown_0_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6420:1: (lv_mouseDown_0_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6421:3: lv_mouseDown_0_0= 'mouse'
                    {
                    lv_mouseDown_0_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14382); 

                            newLeafNode(lv_mouseDown_0_0, grammarAccess.getMouseEventAccess().getMouseDownMouseKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseDown", lv_mouseDown_0_0, "mouse");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,125,FOLLOW_125_in_ruleMouseEvent14407); 

                        	newLeafNode(otherlv_1, grammarAccess.getMouseEventAccess().getDownKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6439:6: ( ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6439:6: ( ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6439:7: ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6439:7: ( (lv_mouseEnter_2_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6440:1: (lv_mouseEnter_2_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6440:1: (lv_mouseEnter_2_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6441:3: lv_mouseEnter_2_0= 'mouse'
                    {
                    lv_mouseEnter_2_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14433); 

                            newLeafNode(lv_mouseEnter_2_0, grammarAccess.getMouseEventAccess().getMouseEnterMouseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseEnter", lv_mouseEnter_2_0, "mouse");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,126,FOLLOW_126_in_ruleMouseEvent14458); 

                        	newLeafNode(otherlv_3, grammarAccess.getMouseEventAccess().getEnterKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6459:6: ( ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6459:6: ( ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6459:7: ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6459:7: ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6460:1: (lv_mouseHorizontalWheel_4_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6460:1: (lv_mouseHorizontalWheel_4_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6461:3: lv_mouseHorizontalWheel_4_0= 'mouse'
                    {
                    lv_mouseHorizontalWheel_4_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14484); 

                            newLeafNode(lv_mouseHorizontalWheel_4_0, grammarAccess.getMouseEventAccess().getMouseHorizontalWheelMouseKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseHorizontalWheel", lv_mouseHorizontalWheel_4_0, "mouse");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,127,FOLLOW_127_in_ruleMouseEvent14509); 

                        	newLeafNode(otherlv_5, grammarAccess.getMouseEventAccess().getHorizontalKeyword_2_1());
                        
                    otherlv_6=(Token)match(input,128,FOLLOW_128_in_ruleMouseEvent14521); 

                        	newLeafNode(otherlv_6, grammarAccess.getMouseEventAccess().getWheelKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6483:6: ( ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6483:6: ( ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6483:7: ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6483:7: ( (lv_mouseUp_7_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6484:1: (lv_mouseUp_7_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6484:1: (lv_mouseUp_7_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6485:3: lv_mouseUp_7_0= 'mouse'
                    {
                    lv_mouseUp_7_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14547); 

                            newLeafNode(lv_mouseUp_7_0, grammarAccess.getMouseEventAccess().getMouseUpMouseKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseUp", lv_mouseUp_7_0, "mouse");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,129,FOLLOW_129_in_ruleMouseEvent14572); 

                        	newLeafNode(otherlv_8, grammarAccess.getMouseEventAccess().getUpKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6503:6: ( ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6503:6: ( ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6503:7: ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6503:7: ( (lv_mouseWheel_9_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6504:1: (lv_mouseWheel_9_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6504:1: (lv_mouseWheel_9_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6505:3: lv_mouseWheel_9_0= 'mouse'
                    {
                    lv_mouseWheel_9_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14598); 

                            newLeafNode(lv_mouseWheel_9_0, grammarAccess.getMouseEventAccess().getMouseWheelMouseKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseWheel", lv_mouseWheel_9_0, "mouse");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,128,FOLLOW_128_in_ruleMouseEvent14623); 

                        	newLeafNode(otherlv_10, grammarAccess.getMouseEventAccess().getWheelKeyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6523:6: ( ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6523:6: ( ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6523:7: ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6523:7: ( (lv_mouseVerticalWheel_11_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6524:1: (lv_mouseVerticalWheel_11_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6524:1: (lv_mouseVerticalWheel_11_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6525:3: lv_mouseVerticalWheel_11_0= 'mouse'
                    {
                    lv_mouseVerticalWheel_11_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14649); 

                            newLeafNode(lv_mouseVerticalWheel_11_0, grammarAccess.getMouseEventAccess().getMouseVerticalWheelMouseKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseVerticalWheel", lv_mouseVerticalWheel_11_0, "mouse");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,130,FOLLOW_130_in_ruleMouseEvent14674); 

                        	newLeafNode(otherlv_12, grammarAccess.getMouseEventAccess().getVerticalKeyword_5_1());
                        
                    otherlv_13=(Token)match(input,128,FOLLOW_128_in_ruleMouseEvent14686); 

                        	newLeafNode(otherlv_13, grammarAccess.getMouseEventAccess().getWheelKeyword_5_2());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6547:6: ( ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6547:6: ( ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6547:7: ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6547:7: ( (lv_mouseHover_14_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6548:1: (lv_mouseHover_14_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6548:1: (lv_mouseHover_14_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6549:3: lv_mouseHover_14_0= 'mouse'
                    {
                    lv_mouseHover_14_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14712); 

                            newLeafNode(lv_mouseHover_14_0, grammarAccess.getMouseEventAccess().getMouseHoverMouseKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseHover", lv_mouseHover_14_0, "mouse");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,131,FOLLOW_131_in_ruleMouseEvent14737); 

                        	newLeafNode(otherlv_15, grammarAccess.getMouseEventAccess().getHoverKeyword_6_1());
                        

                    }


                    }
                    break;
                case 8 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6567:6: ( ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6567:6: ( ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6567:7: ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6567:7: ( (lv_mouseExit_16_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6568:1: (lv_mouseExit_16_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6568:1: (lv_mouseExit_16_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6569:3: lv_mouseExit_16_0= 'mouse'
                    {
                    lv_mouseExit_16_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14763); 

                            newLeafNode(lv_mouseExit_16_0, grammarAccess.getMouseEventAccess().getMouseExitMouseKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseExit", lv_mouseExit_16_0, "mouse");
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,132,FOLLOW_132_in_ruleMouseEvent14788); 

                        	newLeafNode(otherlv_17, grammarAccess.getMouseEventAccess().getExitKeyword_7_1());
                        

                    }


                    }
                    break;
                case 9 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6587:6: ( ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6587:6: ( ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6587:7: ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6587:7: ( (lv_mouseDoubleClick_18_0= 'mouse' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6588:1: (lv_mouseDoubleClick_18_0= 'mouse' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6588:1: (lv_mouseDoubleClick_18_0= 'mouse' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6589:3: lv_mouseDoubleClick_18_0= 'mouse'
                    {
                    lv_mouseDoubleClick_18_0=(Token)match(input,124,FOLLOW_124_in_ruleMouseEvent14814); 

                            newLeafNode(lv_mouseDoubleClick_18_0, grammarAccess.getMouseEventAccess().getMouseDoubleClickMouseKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseEventRule());
                    	        }
                           		setWithLastConsumed(current, "mouseDoubleClick", lv_mouseDoubleClick_18_0, "mouse");
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,133,FOLLOW_133_in_ruleMouseEvent14839); 

                        	newLeafNode(otherlv_19, grammarAccess.getMouseEventAccess().getDoubleKeyword_8_1());
                        
                    otherlv_20=(Token)match(input,134,FOLLOW_134_in_ruleMouseEvent14851); 

                        	newLeafNode(otherlv_20, grammarAccess.getMouseEventAccess().getClickKeyword_8_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMouseEvent"


    // $ANTLR start "entryRuleKeyEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6618:1: entryRuleKeyEvent returns [EObject current=null] : iv_ruleKeyEvent= ruleKeyEvent EOF ;
    public final EObject entryRuleKeyEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyEvent = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6619:2: (iv_ruleKeyEvent= ruleKeyEvent EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6620:2: iv_ruleKeyEvent= ruleKeyEvent EOF
            {
             newCompositeNode(grammarAccess.getKeyEventRule()); 
            pushFollow(FOLLOW_ruleKeyEvent_in_entryRuleKeyEvent14888);
            iv_ruleKeyEvent=ruleKeyEvent();

            state._fsp--;

             current =iv_ruleKeyEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyEvent14898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyEvent"


    // $ANTLR start "ruleKeyEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6627:1: ruleKeyEvent returns [EObject current=null] : ( ( ( (lv_keyPress_0_0= 'key' ) ) otherlv_1= 'press' ) | ( ( (lv_keyUp_2_0= 'key' ) ) otherlv_3= 'up' ) | ( ( (lv_keyDown_4_0= 'key' ) ) otherlv_5= 'down' ) ) ;
    public final EObject ruleKeyEvent() throws RecognitionException {
        EObject current = null;

        Token lv_keyPress_0_0=null;
        Token otherlv_1=null;
        Token lv_keyUp_2_0=null;
        Token otherlv_3=null;
        Token lv_keyDown_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6630:28: ( ( ( ( (lv_keyPress_0_0= 'key' ) ) otherlv_1= 'press' ) | ( ( (lv_keyUp_2_0= 'key' ) ) otherlv_3= 'up' ) | ( ( (lv_keyDown_4_0= 'key' ) ) otherlv_5= 'down' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6631:1: ( ( ( (lv_keyPress_0_0= 'key' ) ) otherlv_1= 'press' ) | ( ( (lv_keyUp_2_0= 'key' ) ) otherlv_3= 'up' ) | ( ( (lv_keyDown_4_0= 'key' ) ) otherlv_5= 'down' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6631:1: ( ( ( (lv_keyPress_0_0= 'key' ) ) otherlv_1= 'press' ) | ( ( (lv_keyUp_2_0= 'key' ) ) otherlv_3= 'up' ) | ( ( (lv_keyDown_4_0= 'key' ) ) otherlv_5= 'down' ) )
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==135) ) {
                switch ( input.LA(2) ) {
                case 125:
                    {
                    alt60=3;
                    }
                    break;
                case 129:
                    {
                    alt60=2;
                    }
                    break;
                case 136:
                    {
                    alt60=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6631:2: ( ( (lv_keyPress_0_0= 'key' ) ) otherlv_1= 'press' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6631:2: ( ( (lv_keyPress_0_0= 'key' ) ) otherlv_1= 'press' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6631:3: ( (lv_keyPress_0_0= 'key' ) ) otherlv_1= 'press'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6631:3: ( (lv_keyPress_0_0= 'key' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6632:1: (lv_keyPress_0_0= 'key' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6632:1: (lv_keyPress_0_0= 'key' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6633:3: lv_keyPress_0_0= 'key'
                    {
                    lv_keyPress_0_0=(Token)match(input,135,FOLLOW_135_in_ruleKeyEvent14942); 

                            newLeafNode(lv_keyPress_0_0, grammarAccess.getKeyEventAccess().getKeyPressKeyKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeyEventRule());
                    	        }
                           		setWithLastConsumed(current, "keyPress", lv_keyPress_0_0, "key");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,136,FOLLOW_136_in_ruleKeyEvent14967); 

                        	newLeafNode(otherlv_1, grammarAccess.getKeyEventAccess().getPressKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6651:6: ( ( (lv_keyUp_2_0= 'key' ) ) otherlv_3= 'up' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6651:6: ( ( (lv_keyUp_2_0= 'key' ) ) otherlv_3= 'up' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6651:7: ( (lv_keyUp_2_0= 'key' ) ) otherlv_3= 'up'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6651:7: ( (lv_keyUp_2_0= 'key' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6652:1: (lv_keyUp_2_0= 'key' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6652:1: (lv_keyUp_2_0= 'key' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6653:3: lv_keyUp_2_0= 'key'
                    {
                    lv_keyUp_2_0=(Token)match(input,135,FOLLOW_135_in_ruleKeyEvent14993); 

                            newLeafNode(lv_keyUp_2_0, grammarAccess.getKeyEventAccess().getKeyUpKeyKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeyEventRule());
                    	        }
                           		setWithLastConsumed(current, "keyUp", lv_keyUp_2_0, "key");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,129,FOLLOW_129_in_ruleKeyEvent15018); 

                        	newLeafNode(otherlv_3, grammarAccess.getKeyEventAccess().getUpKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6671:6: ( ( (lv_keyDown_4_0= 'key' ) ) otherlv_5= 'down' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6671:6: ( ( (lv_keyDown_4_0= 'key' ) ) otherlv_5= 'down' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6671:7: ( (lv_keyDown_4_0= 'key' ) ) otherlv_5= 'down'
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6671:7: ( (lv_keyDown_4_0= 'key' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6672:1: (lv_keyDown_4_0= 'key' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6672:1: (lv_keyDown_4_0= 'key' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6673:3: lv_keyDown_4_0= 'key'
                    {
                    lv_keyDown_4_0=(Token)match(input,135,FOLLOW_135_in_ruleKeyEvent15044); 

                            newLeafNode(lv_keyDown_4_0, grammarAccess.getKeyEventAccess().getKeyDownKeyKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeyEventRule());
                    	        }
                           		setWithLastConsumed(current, "keyDown", lv_keyDown_4_0, "key");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,125,FOLLOW_125_in_ruleKeyEvent15069); 

                        	newLeafNode(otherlv_5, grammarAccess.getKeyEventAccess().getDownKeyword_2_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyEvent"


    // $ANTLR start "entryRuleElementEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6698:1: entryRuleElementEvent returns [EObject current=null] : iv_ruleElementEvent= ruleElementEvent EOF ;
    public final EObject entryRuleElementEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementEvent = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6699:2: (iv_ruleElementEvent= ruleElementEvent EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6700:2: iv_ruleElementEvent= ruleElementEvent EOF
            {
             newCompositeNode(grammarAccess.getElementEventRule()); 
            pushFollow(FOLLOW_ruleElementEvent_in_entryRuleElementEvent15106);
            iv_ruleElementEvent=ruleElementEvent();

            state._fsp--;

             current =iv_ruleElementEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEvent15116); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementEvent"


    // $ANTLR start "ruleElementEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6707:1: ruleElementEvent returns [EObject current=null] : ( ( (lv_create_0_0= 'create' ) ) | ( (lv_delete_1_0= 'delete' ) ) ) ;
    public final EObject ruleElementEvent() throws RecognitionException {
        EObject current = null;

        Token lv_create_0_0=null;
        Token lv_delete_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6710:28: ( ( ( (lv_create_0_0= 'create' ) ) | ( (lv_delete_1_0= 'delete' ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6711:1: ( ( (lv_create_0_0= 'create' ) ) | ( (lv_delete_1_0= 'delete' ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6711:1: ( ( (lv_create_0_0= 'create' ) ) | ( (lv_delete_1_0= 'delete' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==137) ) {
                alt61=1;
            }
            else if ( (LA61_0==138) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6711:2: ( (lv_create_0_0= 'create' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6711:2: ( (lv_create_0_0= 'create' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6712:1: (lv_create_0_0= 'create' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6712:1: (lv_create_0_0= 'create' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6713:3: lv_create_0_0= 'create'
                    {
                    lv_create_0_0=(Token)match(input,137,FOLLOW_137_in_ruleElementEvent15159); 

                            newLeafNode(lv_create_0_0, grammarAccess.getElementEventAccess().getCreateCreateKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementEventRule());
                    	        }
                           		setWithLastConsumed(current, "create", lv_create_0_0, "create");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6727:6: ( (lv_delete_1_0= 'delete' ) )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6727:6: ( (lv_delete_1_0= 'delete' ) )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6728:1: (lv_delete_1_0= 'delete' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6728:1: (lv_delete_1_0= 'delete' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6729:3: lv_delete_1_0= 'delete'
                    {
                    lv_delete_1_0=(Token)match(input,138,FOLLOW_138_in_ruleElementEvent15196); 

                            newLeafNode(lv_delete_1_0, grammarAccess.getElementEventAccess().getDeleteDeleteKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementEventRule());
                    	        }
                           		setWithLastConsumed(current, "delete", lv_delete_1_0, "delete");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementEvent"


    // $ANTLR start "entryRuleMenuEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6750:1: entryRuleMenuEvent returns [EObject current=null] : iv_ruleMenuEvent= ruleMenuEvent EOF ;
    public final EObject entryRuleMenuEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuEvent = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6751:2: (iv_ruleMenuEvent= ruleMenuEvent EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6752:2: iv_ruleMenuEvent= ruleMenuEvent EOF
            {
             newCompositeNode(grammarAccess.getMenuEventRule()); 
            pushFollow(FOLLOW_ruleMenuEvent_in_entryRuleMenuEvent15245);
            iv_ruleMenuEvent=ruleMenuEvent();

            state._fsp--;

             current =iv_ruleMenuEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenuEvent15255); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMenuEvent"


    // $ANTLR start "ruleMenuEvent"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6759:1: ruleMenuEvent returns [EObject current=null] : ( () otherlv_1= 'Menu event' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleMenuEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6762:28: ( ( () otherlv_1= 'Menu event' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6763:1: ( () otherlv_1= 'Menu event' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6763:1: ( () otherlv_1= 'Menu event' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6763:2: () otherlv_1= 'Menu event' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6763:2: ()
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6764:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMenuEventAccess().getMenuEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,139,FOLLOW_139_in_ruleMenuEvent15301); 

                	newLeafNode(otherlv_1, grammarAccess.getMenuEventAccess().getMenuEventKeyword_1());
                
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleMenuEvent15313); 

                	newLeafNode(otherlv_2, grammarAccess.getMenuEventAccess().getLeftParenthesisKeyword_2());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6777:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6778:1: (lv_name_3_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6778:1: (lv_name_3_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6779:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMenuEvent15330); 

            			newLeafNode(lv_name_3_0, grammarAccess.getMenuEventAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMenuEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleMenuEvent15347); 

                	newLeafNode(otherlv_4, grammarAccess.getMenuEventAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMenuEvent"


    // $ANTLR start "entryRuleInstruction"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6807:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6808:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6809:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction15383);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction15393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6816:1: ruleInstruction returns [EObject current=null] : (this_WizardStart_0= ruleWizardStart | this_ViewDeploy_1= ruleViewDeploy | this_ClassExecution_2= ruleClassExecution ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_WizardStart_0 = null;

        EObject this_ViewDeploy_1 = null;

        EObject this_ClassExecution_2 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6819:28: ( (this_WizardStart_0= ruleWizardStart | this_ViewDeploy_1= ruleViewDeploy | this_ClassExecution_2= ruleClassExecution ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6820:1: (this_WizardStart_0= ruleWizardStart | this_ViewDeploy_1= ruleViewDeploy | this_ClassExecution_2= ruleClassExecution )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6820:1: (this_WizardStart_0= ruleWizardStart | this_ViewDeploy_1= ruleViewDeploy | this_ClassExecution_2= ruleClassExecution )
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==140) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==106) ) {
                    alt62=1;
                }
                else if ( (LA62_1==141) ) {
                    alt62=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA62_0==142) ) {
                alt62=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6821:5: this_WizardStart_0= ruleWizardStart
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getWizardStartParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWizardStart_in_ruleInstruction15440);
                    this_WizardStart_0=ruleWizardStart();

                    state._fsp--;

                     
                            current = this_WizardStart_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6831:5: this_ViewDeploy_1= ruleViewDeploy
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getViewDeployParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleViewDeploy_in_ruleInstruction15467);
                    this_ViewDeploy_1=ruleViewDeploy();

                    state._fsp--;

                     
                            current = this_ViewDeploy_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6841:5: this_ClassExecution_2= ruleClassExecution
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getClassExecutionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClassExecution_in_ruleInstruction15494);
                    this_ClassExecution_2=ruleClassExecution();

                    state._fsp--;

                     
                            current = this_ClassExecution_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleWizardStart"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6857:1: entryRuleWizardStart returns [EObject current=null] : iv_ruleWizardStart= ruleWizardStart EOF ;
    public final EObject entryRuleWizardStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizardStart = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6858:2: (iv_ruleWizardStart= ruleWizardStart EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6859:2: iv_ruleWizardStart= ruleWizardStart EOF
            {
             newCompositeNode(grammarAccess.getWizardStartRule()); 
            pushFollow(FOLLOW_ruleWizardStart_in_entryRuleWizardStart15529);
            iv_ruleWizardStart=ruleWizardStart();

            state._fsp--;

             current =iv_ruleWizardStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWizardStart15539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizardStart"


    // $ANTLR start "ruleWizardStart"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6866:1: ruleWizardStart returns [EObject current=null] : (otherlv_0= 'show' otherlv_1= 'wizard' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleWizardStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6869:28: ( (otherlv_0= 'show' otherlv_1= 'wizard' ( (otherlv_2= RULE_ID ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6870:1: (otherlv_0= 'show' otherlv_1= 'wizard' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6870:1: (otherlv_0= 'show' otherlv_1= 'wizard' ( (otherlv_2= RULE_ID ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6870:3: otherlv_0= 'show' otherlv_1= 'wizard' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,140,FOLLOW_140_in_ruleWizardStart15576); 

                	newLeafNode(otherlv_0, grammarAccess.getWizardStartAccess().getShowKeyword_0());
                
            otherlv_1=(Token)match(input,106,FOLLOW_106_in_ruleWizardStart15588); 

                	newLeafNode(otherlv_1, grammarAccess.getWizardStartAccess().getWizardKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6878:1: ( (otherlv_2= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6879:1: (otherlv_2= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6879:1: (otherlv_2= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6880:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWizardStartRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWizardStart15608); 

            		newLeafNode(otherlv_2, grammarAccess.getWizardStartAccess().getWizardWizardCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizardStart"


    // $ANTLR start "entryRuleViewDeploy"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6899:1: entryRuleViewDeploy returns [EObject current=null] : iv_ruleViewDeploy= ruleViewDeploy EOF ;
    public final EObject entryRuleViewDeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewDeploy = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6900:2: (iv_ruleViewDeploy= ruleViewDeploy EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6901:2: iv_ruleViewDeploy= ruleViewDeploy EOF
            {
             newCompositeNode(grammarAccess.getViewDeployRule()); 
            pushFollow(FOLLOW_ruleViewDeploy_in_entryRuleViewDeploy15644);
            iv_ruleViewDeploy=ruleViewDeploy();

            state._fsp--;

             current =iv_ruleViewDeploy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewDeploy15654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewDeploy"


    // $ANTLR start "ruleViewDeploy"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6908:1: ruleViewDeploy returns [EObject current=null] : (otherlv_0= 'show' otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleViewDeploy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6911:28: ( (otherlv_0= 'show' otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6912:1: (otherlv_0= 'show' otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6912:1: (otherlv_0= 'show' otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6912:3: otherlv_0= 'show' otherlv_1= 'view' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,140,FOLLOW_140_in_ruleViewDeploy15691); 

                	newLeafNode(otherlv_0, grammarAccess.getViewDeployAccess().getShowKeyword_0());
                
            otherlv_1=(Token)match(input,141,FOLLOW_141_in_ruleViewDeploy15703); 

                	newLeafNode(otherlv_1, grammarAccess.getViewDeployAccess().getViewKeyword_1());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6920:1: ( (otherlv_2= RULE_ID ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6921:1: (otherlv_2= RULE_ID )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6921:1: (otherlv_2= RULE_ID )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6922:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewDeployRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewDeploy15723); 

            		newLeafNode(otherlv_2, grammarAccess.getViewDeployAccess().getViewViewCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewDeploy"


    // $ANTLR start "entryRuleClassExecution"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6941:1: entryRuleClassExecution returns [EObject current=null] : iv_ruleClassExecution= ruleClassExecution EOF ;
    public final EObject entryRuleClassExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassExecution = null;


        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6942:2: (iv_ruleClassExecution= ruleClassExecution EOF )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6943:2: iv_ruleClassExecution= ruleClassExecution EOF
            {
             newCompositeNode(grammarAccess.getClassExecutionRule()); 
            pushFollow(FOLLOW_ruleClassExecution_in_entryRuleClassExecution15759);
            iv_ruleClassExecution=ruleClassExecution();

            state._fsp--;

             current =iv_ruleClassExecution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassExecution15769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassExecution"


    // $ANTLR start "ruleClassExecution"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6950:1: ruleClassExecution returns [EObject current=null] : (otherlv_0= 'execute' ( (lv_inplementationReference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClassExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inplementationReference_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6953:28: ( (otherlv_0= 'execute' ( (lv_inplementationReference_1_0= RULE_STRING ) ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6954:1: (otherlv_0= 'execute' ( (lv_inplementationReference_1_0= RULE_STRING ) ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6954:1: (otherlv_0= 'execute' ( (lv_inplementationReference_1_0= RULE_STRING ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6954:3: otherlv_0= 'execute' ( (lv_inplementationReference_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,142,FOLLOW_142_in_ruleClassExecution15806); 

                	newLeafNode(otherlv_0, grammarAccess.getClassExecutionAccess().getExecuteKeyword_0());
                
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6958:1: ( (lv_inplementationReference_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6959:1: (lv_inplementationReference_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6959:1: (lv_inplementationReference_1_0= RULE_STRING )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6960:3: lv_inplementationReference_1_0= RULE_STRING
            {
            lv_inplementationReference_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassExecution15823); 

            			newLeafNode(lv_inplementationReference_1_0, grammarAccess.getClassExecutionAccess().getInplementationReferenceSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassExecutionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"inplementationReference",
                    		lv_inplementationReference_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassExecution"


    // $ANTLR start "ruleLineType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6984:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dashdot' ) | (enumLiteral_4= 'dashdotdot' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6986:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dashdot' ) | (enumLiteral_4= 'dashdotdot' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6987:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dashdot' ) | (enumLiteral_4= 'dashdotdot' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6987:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dashdot' ) | (enumLiteral_4= 'dashdotdot' ) )
            int alt63=5;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt63=1;
                }
                break;
            case 144:
                {
                alt63=2;
                }
                break;
            case 145:
                {
                alt63=3;
                }
                break;
            case 146:
                {
                alt63=4;
                }
                break;
            case 147:
                {
                alt63=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6987:2: (enumLiteral_0= 'solid' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6987:2: (enumLiteral_0= 'solid' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6987:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,143,FOLLOW_143_in_ruleLineType15878); 

                            current = grammarAccess.getLineTypeAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSolidEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6993:6: (enumLiteral_1= 'dash' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6993:6: (enumLiteral_1= 'dash' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6993:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,144,FOLLOW_144_in_ruleLineType15895); 

                            current = grammarAccess.getLineTypeAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDashEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6999:6: (enumLiteral_2= 'dot' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6999:6: (enumLiteral_2= 'dot' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:6999:8: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,145,FOLLOW_145_in_ruleLineType15912); 

                            current = grammarAccess.getLineTypeAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineTypeAccess().getDotEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7005:6: (enumLiteral_3= 'dashdot' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7005:6: (enumLiteral_3= 'dashdot' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7005:8: enumLiteral_3= 'dashdot'
                    {
                    enumLiteral_3=(Token)match(input,146,FOLLOW_146_in_ruleLineType15929); 

                            current = grammarAccess.getLineTypeAccess().getDashdotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineTypeAccess().getDashdotEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7011:6: (enumLiteral_4= 'dashdotdot' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7011:6: (enumLiteral_4= 'dashdotdot' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7011:8: enumLiteral_4= 'dashdotdot'
                    {
                    enumLiteral_4=(Token)match(input,147,FOLLOW_147_in_ruleLineType15946); 

                            current = grammarAccess.getLineTypeAccess().getDashdotdotEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLineTypeAccess().getDashdotdotEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineType"


    // $ANTLR start "ruleWizardType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7021:1: ruleWizardType returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'info' ) ) ;
    public final Enumerator ruleWizardType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7023:28: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'info' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7024:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'info' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7024:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'info' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt64=1;
                }
                break;
            case 148:
                {
                alt64=2;
                }
                break;
            case 149:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7024:2: (enumLiteral_0= 'create' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7024:2: (enumLiteral_0= 'create' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7024:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,137,FOLLOW_137_in_ruleWizardType15991); 

                            current = grammarAccess.getWizardTypeAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWizardTypeAccess().getCreateEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7030:6: (enumLiteral_1= 'edit' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7030:6: (enumLiteral_1= 'edit' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7030:8: enumLiteral_1= 'edit'
                    {
                    enumLiteral_1=(Token)match(input,148,FOLLOW_148_in_ruleWizardType16008); 

                            current = grammarAccess.getWizardTypeAccess().getEditEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWizardTypeAccess().getEditEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7036:6: (enumLiteral_2= 'info' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7036:6: (enumLiteral_2= 'info' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7036:8: enumLiteral_2= 'info'
                    {
                    enumLiteral_2=(Token)match(input,149,FOLLOW_149_in_ruleWizardType16025); 

                            current = grammarAccess.getWizardTypeAccess().getInfoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWizardTypeAccess().getInfoEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizardType"


    // $ANTLR start "ruleComponentType"
    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7046:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'textField' ) | (enumLiteral_1= 'textArea' ) | (enumLiteral_2= 'checkBox' ) | (enumLiteral_3= 'comboBox' ) | (enumLiteral_4= 'Slider' ) | (enumLiteral_5= 'File' ) | (enumLiteral_6= 'Image' ) ) ;
    public final Enumerator ruleComponentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7048:28: ( ( (enumLiteral_0= 'textField' ) | (enumLiteral_1= 'textArea' ) | (enumLiteral_2= 'checkBox' ) | (enumLiteral_3= 'comboBox' ) | (enumLiteral_4= 'Slider' ) | (enumLiteral_5= 'File' ) | (enumLiteral_6= 'Image' ) ) )
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7049:1: ( (enumLiteral_0= 'textField' ) | (enumLiteral_1= 'textArea' ) | (enumLiteral_2= 'checkBox' ) | (enumLiteral_3= 'comboBox' ) | (enumLiteral_4= 'Slider' ) | (enumLiteral_5= 'File' ) | (enumLiteral_6= 'Image' ) )
            {
            // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7049:1: ( (enumLiteral_0= 'textField' ) | (enumLiteral_1= 'textArea' ) | (enumLiteral_2= 'checkBox' ) | (enumLiteral_3= 'comboBox' ) | (enumLiteral_4= 'Slider' ) | (enumLiteral_5= 'File' ) | (enumLiteral_6= 'Image' ) )
            int alt65=7;
            switch ( input.LA(1) ) {
            case 150:
                {
                alt65=1;
                }
                break;
            case 151:
                {
                alt65=2;
                }
                break;
            case 152:
                {
                alt65=3;
                }
                break;
            case 153:
                {
                alt65=4;
                }
                break;
            case 154:
                {
                alt65=5;
                }
                break;
            case 155:
                {
                alt65=6;
                }
                break;
            case 156:
                {
                alt65=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7049:2: (enumLiteral_0= 'textField' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7049:2: (enumLiteral_0= 'textField' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7049:4: enumLiteral_0= 'textField'
                    {
                    enumLiteral_0=(Token)match(input,150,FOLLOW_150_in_ruleComponentType16070); 

                            current = grammarAccess.getComponentTypeAccess().getTextFieldEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getTextFieldEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7055:6: (enumLiteral_1= 'textArea' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7055:6: (enumLiteral_1= 'textArea' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7055:8: enumLiteral_1= 'textArea'
                    {
                    enumLiteral_1=(Token)match(input,151,FOLLOW_151_in_ruleComponentType16087); 

                            current = grammarAccess.getComponentTypeAccess().getTextAreaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getTextAreaEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7061:6: (enumLiteral_2= 'checkBox' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7061:6: (enumLiteral_2= 'checkBox' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7061:8: enumLiteral_2= 'checkBox'
                    {
                    enumLiteral_2=(Token)match(input,152,FOLLOW_152_in_ruleComponentType16104); 

                            current = grammarAccess.getComponentTypeAccess().getCheckBoxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComponentTypeAccess().getCheckBoxEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7067:6: (enumLiteral_3= 'comboBox' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7067:6: (enumLiteral_3= 'comboBox' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7067:8: enumLiteral_3= 'comboBox'
                    {
                    enumLiteral_3=(Token)match(input,153,FOLLOW_153_in_ruleComponentType16121); 

                            current = grammarAccess.getComponentTypeAccess().getComboBoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComponentTypeAccess().getComboBoxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7073:6: (enumLiteral_4= 'Slider' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7073:6: (enumLiteral_4= 'Slider' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7073:8: enumLiteral_4= 'Slider'
                    {
                    enumLiteral_4=(Token)match(input,154,FOLLOW_154_in_ruleComponentType16138); 

                            current = grammarAccess.getComponentTypeAccess().getSliderEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComponentTypeAccess().getSliderEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7079:6: (enumLiteral_5= 'File' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7079:6: (enumLiteral_5= 'File' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7079:8: enumLiteral_5= 'File'
                    {
                    enumLiteral_5=(Token)match(input,155,FOLLOW_155_in_ruleComponentType16155); 

                            current = grammarAccess.getComponentTypeAccess().getFileReferenceEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getComponentTypeAccess().getFileReferenceEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7085:6: (enumLiteral_6= 'Image' )
                    {
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7085:6: (enumLiteral_6= 'Image' )
                    // ../co.edu.uniandes.enar.picture/src-gen/co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.g:7085:8: enumLiteral_6= 'Image'
                    {
                    enumLiteral_6=(Token)match(input,156,FOLLOW_156_in_ruleComponentType16172); 

                            current = grammarAccess.getComponentTypeAccess().getImageReferenceEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getComponentTypeAccess().getImageReferenceEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentType"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\41\3\uffff\1\43\5\uffff";
    static final String DFA9_maxS =
        "\1\46\3\uffff\1\46\5\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\4\1\10\1\6";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "",
            "",
            "",
            "\1\7\1\uffff\1\11\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1141:1: ( ( (lv_none_0_0= 'none' ) ) | ( (lv_arrow_1_0= 'arrow' ) ) | ( (lv_rhomb_2_0= 'rhomb' ) ) | ( ( (lv_filledrhomb_3_0= 'filled' ) ) otherlv_4= 'rhomb' ) | ( (lv_square_5_0= 'square' ) ) | ( ( (lv_filledsquare_6_0= 'filled' ) ) otherlv_7= 'square' ) | ( ( (lv_closedarrow_8_0= 'closed' ) ) otherlv_9= 'arrow' ) | ( ( (lv_filledclosedarrow_10_0= 'filled' ) ) otherlv_11= 'closed' otherlv_12= 'arrow' ) )";
        }
    }
    static final String DFA16_eotS =
        "\15\uffff";
    static final String DFA16_eofS =
        "\15\uffff";
    static final String DFA16_minS =
        "\1\100\5\5\5\101\2\uffff";
    static final String DFA16_maxS =
        "\1\127\5\5\5\106\2\uffff";
    static final String DFA16_acceptS =
        "\13\uffff\1\2\1\1";
    static final String DFA16_specialS =
        "\15\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\16\uffff\1\2\5\uffff\1\3\1\4\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\4\uffff\1\13",
            "\1\14\4\uffff\1\13",
            "\1\14\4\uffff\1\13",
            "\1\14\4\uffff\1\13",
            "\1\14\4\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "2377:1: (this_ElementDef_0= ruleElementDef | this_ElementAlt_1= ruleElementAlt )";
        }
    }
    static final String DFA59_eotS =
        "\13\uffff";
    static final String DFA59_eofS =
        "\13\uffff";
    static final String DFA59_minS =
        "\1\174\1\175\11\uffff";
    static final String DFA59_maxS =
        "\1\174\1\u0085\11\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\6\1\10\1\3\1\5\1\7\1\2\1\4\1\1\1\11";
    static final String DFA59_specialS =
        "\13\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\1",
            "\1\11\1\7\1\4\1\5\1\10\1\2\1\6\1\3\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "6419:1: ( ( ( (lv_mouseDown_0_0= 'mouse' ) ) otherlv_1= 'down' ) | ( ( (lv_mouseEnter_2_0= 'mouse' ) ) otherlv_3= 'enter' ) | ( ( (lv_mouseHorizontalWheel_4_0= 'mouse' ) ) otherlv_5= 'horizontal' otherlv_6= 'wheel' ) | ( ( (lv_mouseUp_7_0= 'mouse' ) ) otherlv_8= 'up' ) | ( ( (lv_mouseWheel_9_0= 'mouse' ) ) otherlv_10= 'wheel' ) | ( ( (lv_mouseVerticalWheel_11_0= 'mouse' ) ) otherlv_12= 'vertical' otherlv_13= 'wheel' ) | ( ( (lv_mouseHover_14_0= 'mouse' ) ) otherlv_15= 'hover' ) | ( ( (lv_mouseExit_16_0= 'mouse' ) ) otherlv_17= 'exit' ) | ( ( (lv_mouseDoubleClick_18_0= 'mouse' ) ) otherlv_19= 'double' otherlv_20= 'click' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel140 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleGraphicalRepresentation_in_ruleModel161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphicalRepresentation_in_entryRuleGraphicalRepresentation336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphicalRepresentation346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGraphicalRepresentation383 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGraphicalRepresentation395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGraphicalRepresentation412 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGraphicalRepresentation429 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleGraphicalRepresentation442 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGraphicalRepresentation454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGraphicalRepresentation475 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_ruleROOT_in_ruleGraphicalRepresentation498 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleToolDefinition_in_ruleGraphicalRepresentation519 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleStyleDefinition_in_ruleGraphicalRepresentation540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleGraphicalDefinition_in_ruleGraphicalRepresentation561 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleRulesDefinition_in_ruleGraphicalRepresentation582 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleInteractionDefinition_in_ruleGraphicalRepresentation603 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGraphicalRepresentation615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName703 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedName722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName737 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleClassReference_in_entryRuleClassReference786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassReference796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleClassReference833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClassReference854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttReference_in_entryRuleAttReference890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttReference900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAttReference937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttReference958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleROOT_in_entryRuleROOT994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleROOT1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleROOT1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleROOT1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToolDefinition_in_entryRuleToolDefinition1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToolDefinition1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleToolDefinition1155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToolDefinition1175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleToolDefinition1187 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleToolGroup_in_ruleToolDefinition1208 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleToolDefinition1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToolGroup_in_entryRuleToolGroup1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToolGroup1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleToolGroup1304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToolGroup1321 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleToolGroup1338 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleToolGroup1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleToolGroup1367 = new BitSet(new long[]{0x0000000002840000L});
    public static final BitSet FOLLOW_ruleToolGroup_in_ruleToolGroup1393 = new BitSet(new long[]{0x0000000002840000L});
    public static final BitSet FOLLOW_ruleCreationButton_in_ruleToolGroup1415 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_18_in_ruleToolGroup1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreationButton_in_entryRuleCreationButton1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreationButton1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCreationButton1520 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleCreationButton1541 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCreationButton1553 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCreationButton1565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreationButton1582 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCreationButton1599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreationButton1616 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCreationButton1633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreationButton1650 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCreationButton1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleDefinition_in_entryRuleStyleDefinition1703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleDefinition1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStyleDefinition1759 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStyleDefinition1771 = new BitSet(new long[]{0x029201FE20040000L});
    public static final BitSet FOLLOW_ruleStyleElement_in_ruleStyleDefinition1792 = new BitSet(new long[]{0x029201FE20040000L});
    public static final BitSet FOLLOW_18_in_ruleStyleDefinition1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleElement_in_entryRuleStyleElement1841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleElement1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleStyleElement1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_ruleStyleElement1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleStyleElement1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFigureStyle_in_ruleStyleElement1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_entryRuleLineStyle2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineStyle2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLineStyle2061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLineStyle2078 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLineStyle2095 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLineStyle2107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLineStyle2124 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLineStyle2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_ruleLineType_in_ruleLineStyle2162 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLineStyle2174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLineStyle2194 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLineStyle2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_entryRuleLineDecoration2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineDecoration2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLineDecoration_in_ruleLineDecoration2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomLineDecoration_in_ruleLineDecoration2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLineDecoration_in_entryRuleDefaultLineDecoration2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultLineDecoration2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDefaultLineDecoration2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDefaultLineDecoration2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDefaultLineDecoration2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDefaultLineDecoration2526 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDefaultLineDecoration2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDefaultLineDecoration2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDefaultLineDecoration2614 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDefaultLineDecoration2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDefaultLineDecoration2665 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDefaultLineDecoration2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDefaultLineDecoration2716 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDefaultLineDecoration2741 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDefaultLineDecoration2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomLineDecoration_in_entryRuleCustomLineDecoration2790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomLineDecoration2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCustomLineDecoration2837 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomLineDecoration2854 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCustomLineDecoration2871 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCustomLineDecoration2883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomLineDecoration2900 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCustomLineDecoration2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor2953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleColor3000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColor3017 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleColor3034 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor3051 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleColor3068 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor3085 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleColor3102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor3119 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleColor3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLayout_in_ruleLayout3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomLayout_in_ruleLayout3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLayout_in_entryRuleDefaultLayout3291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultLayout3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDefaultLayout3345 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDefaultLayout3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDefaultLayout3396 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDefaultLayout3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomLayout_in_entryRuleCustomLayout3458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomLayout3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCustomLayout3505 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCustomLayout3517 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCustomLayout3529 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleCustomLayout3541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomLayout3558 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCustomLayout3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFigureStyle_in_entryRuleFigureStyle3611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFigureStyle3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRounded_in_ruleFigureStyle3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularPolygon_in_ruleFigureStyle3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_ruleFigureStyle3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFigure_in_ruleFigureStyle3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRounded_in_entryRuleRounded3784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRounded3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRounded3831 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRounded3848 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRounded3865 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRounded3877 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRounded3894 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleRounded3911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRounded3928 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRounded3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularPolygon_in_entryRuleRegularPolygon3981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularPolygon3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleRegularPolygon4028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegularPolygon4045 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRegularPolygon4062 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleRegularPolygon4074 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRegularPolygon4091 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleRegularPolygon4108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRegularPolygon4125 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRegularPolygon4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_entryRuleEllipse4178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEllipse4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEllipse4225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEllipse4242 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEllipse4259 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleEllipse4271 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEllipse4283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEllipse4300 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEllipse4317 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEllipse4334 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEllipse4351 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEllipse4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFigure_in_entryRuleCustomFigure4399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomFigure4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCustomFigure4446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomFigure4463 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCustomFigure4480 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_ruleCustomFigure4501 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCustomFigure4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint4549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePoint4605 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePoint4617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint4634 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulePoint4651 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint4668 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePoint4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelPosition_in_entryRuleLabelPosition4721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelPosition4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLabelPosition4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLabelPosition4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize4860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSize4916 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize4933 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSize4950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize4967 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSize4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean5021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEBoolean5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEBoolean5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphicalDefinition_in_entryRuleGraphicalDefinition5129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphicalDefinition5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGraphicalDefinition5185 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleGraphicalDefinition5197 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGraphicalDefinition5209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E08001L});
    public static final BitSet FOLLOW_ruleGraphicalElement_in_ruleGraphicalDefinition5230 = new BitSet(new long[]{0x0000000000040000L,0x0000000000E08001L});
    public static final BitSet FOLLOW_18_in_ruleGraphicalDefinition5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphicalElement_in_entryRuleGraphicalElement5279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphicalElement5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDef_in_ruleGraphicalElement5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementAlt_in_ruleGraphicalElement5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDef_in_entryRuleElementDef5398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDef5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDef_in_ruleElementDef5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttLinkDef_in_ruleElementDef5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDef_in_entryRuleNodeDef5517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDef5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeElementDef_in_ruleNodeDef5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLinkDef_in_ruleNodeDef5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttLinkDef_in_entryRuleAttLinkDef5636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttLinkDef5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLineDef_in_ruleAttLinkDef5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterNodeDef_in_ruleAttLinkDef5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalNodeDef_in_ruleAttLinkDef5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementAlt_in_entryRuleElementAlt5782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementAlt5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAlt_in_ruleElementAlt5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttLinkAlt_in_ruleElementAlt5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAlt_in_entryRuleNodeAlt5901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAlt5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeElementAlt_in_ruleNodeAlt5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLinkAlt_in_ruleNodeAlt5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttLinkAlt_in_entryRuleAttLinkAlt6020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttLinkAlt6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLineAlt_in_ruleAttLinkAlt6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterNodeAlt_in_ruleAttLinkAlt6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalNodeAlt_in_ruleAttLinkAlt6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeElementDef_in_entryRuleNodeElementDef6166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeElementDef6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleNodeElementDef6213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeElementDef6230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleNodeElementDef6247 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleNodeElementDef6268 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeElementDef6280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleNodeElementDef6292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeElementDef6309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleNodeElementDef6326 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNodeElementDef6338 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleNodeElementDef6359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleNodeElementDef6371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleNodeElementDef6383 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleLabelPosition_in_ruleNodeElementDef6404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleNodeElementDef6416 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleNodeElementDef6437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005080L});
    public static final BitSet FOLLOW_ruleFigure_in_ruleNodeElementDef6458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleNodeElementDef6470 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleNodeElementDef6491 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeElementDef6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeElementAlt_in_entryRuleNodeElementAlt6539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeElementAlt6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleNodeElementAlt6586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeElementAlt6603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleNodeElementAlt6620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeElementAlt6640 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeElementAlt6652 = new BitSet(new long[]{0x0000000000040000L,0x0000000000005094L});
    public static final BitSet FOLLOW_66_in_ruleNodeElementAlt6665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleNodeElementAlt6677 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleLabelPosition_in_ruleNodeElementAlt6698 = new BitSet(new long[]{0x0000000000040000L,0x0000000000005090L});
    public static final BitSet FOLLOW_ruleFigure_in_ruleNodeElementAlt6721 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleNodeElementAlt6735 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleNodeElementAlt6756 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeElementAlt6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFigure_in_entryRuleFigure6806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFigure6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularFigure_in_ruleFigure6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageFigure_in_ruleFigure6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexFigure_in_ruleFigure6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularFigure_in_entryRuleRegularFigure6952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularFigure6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleRegularFigure7008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegularFigure7028 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRegularFigure7040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleRegularFigure7052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegularFigure7072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleRegularFigure7084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegularFigure7104 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_ruleRegularFigure7117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRegularFigure7129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegularFigure7146 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRegularFigure7163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRegularFigure7175 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleRegularFigure7196 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRegularFigure7208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRegularFigure7220 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_ruleRegularFigure7241 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRegularFigure7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageFigure_in_entryRuleImageFigure7291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageFigure7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleImageFigure7347 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImageFigure7359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleImageFigure7371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageFigure7388 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleImageFigure7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexFigure_in_entryRuleComplexFigure7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexFigure7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleComplexFigure7497 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComplexFigure7509 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleComplexFigure7521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComplexFigure7538 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleComplexFigure7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLinkDef_in_entryRuleNodeLinkDef7591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeLinkDef7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleNodeLinkDef7638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLinkDef7655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleNodeLinkDef7672 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleNodeLinkDef7693 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeLinkDef7705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleNodeLinkDef7717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLinkDef7734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleNodeLinkDef7751 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleNodeLinkDef7772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleNodeLinkDef7784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLinkDef7796 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLinkDef7817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleNodeLinkDef7829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLinkDef7841 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLinkDef7862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleNodeLinkDef7874 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNodeLinkDef7886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleNodeLinkDef7898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLinkDef7915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleNodeLinkDef7932 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNodeLinkDef7944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleNodeLinkDef7956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLinkDef7973 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeLinkDef7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLinkAlt_in_entryRuleNodeLinkAlt8026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeLinkAlt8036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleNodeLinkAlt8073 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLinkAlt8090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleNodeLinkAlt8107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLinkAlt8127 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeLinkAlt8139 = new BitSet(new long[]{0x0000000000040000L,0x00000000000B0000L});
    public static final BitSet FOLLOW_80_in_ruleNodeLinkAlt8152 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleNodeLinkAlt8173 = new BitSet(new long[]{0x0000000000040000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_81_in_ruleNodeLinkAlt8188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLinkAlt8200 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLinkAlt8221 = new BitSet(new long[]{0x0000000000040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleNodeLinkAlt8236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLinkAlt8248 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLinkAlt8269 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeLinkAlt8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLineDef_in_entryRuleNodeLineDef8319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeLineDef8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleNodeLineDef8366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLineDef8383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleNodeLineDef8400 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAttReference_in_ruleNodeLineDef8421 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeLineDef8433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleNodeLineDef8445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNodeLineDef8462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleNodeLineDef8479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLineDef8499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleNodeLineDef8511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLineDef8523 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLineDef8544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleNodeLineDef8556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLineDef8568 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLineDef8589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeLineDef8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLineAlt_in_entryRuleNodeLineAlt8637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeLineAlt8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleNodeLineAlt8684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLineAlt8701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleNodeLineAlt8718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLineAlt8738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeLineAlt8750 = new BitSet(new long[]{0x0000000000040000L,0x00000000000B0000L});
    public static final BitSet FOLLOW_80_in_ruleNodeLineAlt8763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLineAlt8783 = new BitSet(new long[]{0x0000000000040000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_81_in_ruleNodeLineAlt8798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLineAlt8810 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLineAlt8831 = new BitSet(new long[]{0x0000000000040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleNodeLineAlt8846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleNodeLineAlt8858 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleLineDecoration_in_ruleNodeLineAlt8879 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeLineAlt8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterNodeDef_in_entryRuleInterNodeDef8929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterNodeDef8939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleInterNodeDef8976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterNodeDef8993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleInterNodeDef9010 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAttReference_in_ruleInterNodeDef9031 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterNodeDef9043 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleInterNodeDef9055 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleInterNodeDef9076 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInterNodeDef9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterNodeAlt_in_entryRuleInterNodeAlt9124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterNodeAlt9134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleInterNodeAlt9171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterNodeAlt9188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleInterNodeAlt9205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterNodeAlt9225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterNodeAlt9237 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleInterNodeAlt9249 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleInterNodeAlt9270 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInterNodeAlt9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalNodeDef_in_entryRuleExternalNodeDef9318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalNodeDef9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleExternalNodeDef9365 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalNodeDef9382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleExternalNodeDef9399 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAttReference_in_ruleExternalNodeDef9420 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExternalNodeDef9432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleExternalNodeDef9444 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleExternalNodeDef9465 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalNodeDef9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalNodeAlt_in_entryRuleExternalNodeAlt9513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalNodeAlt9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleExternalNodeAlt9560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalNodeAlt9577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleExternalNodeAlt9594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalNodeAlt9614 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExternalNodeAlt9626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleExternalNodeAlt9638 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleExternalNodeAlt9659 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalNodeAlt9671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRulesDefinition_in_entryRuleRulesDefinition9707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRulesDefinition9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRulesDefinition9763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRulesDefinition9775 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRulesDefinition9796 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_18_in_ruleRulesDefinition9809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule9845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleForType_in_ruleRule9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleForReference_in_ruleRule9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleForType_in_entryRuleRuleForType9964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleForType9974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRuleForType10011 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleRuleForType10032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleForType10044 = new BitSet(new long[]{0x0000000000040000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleCaseType_in_ruleRuleForType10065 = new BitSet(new long[]{0x0000000000040000L,0x0000000004000000L});
    public static final BitSet FOLLOW_18_in_ruleRuleForType10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleForReference_in_entryRuleRuleForReference10114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleForReference10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRuleForReference10161 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAttReference_in_ruleRuleForReference10182 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleForReference10194 = new BitSet(new long[]{0x0000000000040000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleCaseReference_in_ruleRuleForReference10215 = new BitSet(new long[]{0x0000000000040000L,0x0000000004000000L});
    public static final BitSet FOLLOW_18_in_ruleRuleForReference10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseType_in_entryRuleCaseType10264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseType10274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleCaseType10320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCaseType10337 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleCaseType10354 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCaseType10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCaseType10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseReference_in_entryRuleCaseReference10430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseReference10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleCaseReference10486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCaseReference10503 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleCaseReference10520 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCaseReference10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCaseReference10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractionDefinition_in_entryRuleInteractionDefinition10596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractionDefinition10606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleInteractionDefinition10652 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInteractionDefinition10664 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleInteractionDefinition10676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInteractionDefinition10688 = new BitSet(new long[]{0x0000000000040000L,0x01000A0080000000L});
    public static final BitSet FOLLOW_ruleInteractionElement_in_ruleInteractionDefinition10709 = new BitSet(new long[]{0x0000000000040000L,0x01000A0080000000L});
    public static final BitSet FOLLOW_18_in_ruleInteractionDefinition10722 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleInteractionDefinition10734 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInteractionDefinition10746 = new BitSet(new long[]{0x0000000000040000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleInteractionDefinition10767 = new BitSet(new long[]{0x0000000000040000L,0x0200000000000000L});
    public static final BitSet FOLLOW_18_in_ruleInteractionDefinition10780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInteractionDefinition10792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractionElement_in_entryRuleInteractionElement10828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractionElement10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWizard_in_ruleInteractionElement10885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleInteractionElement10912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWizard_in_entryRuleWizard10947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWizard10957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementWizard_in_ruleWizard11004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersonalWizard_in_ruleWizard11031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementWizard_in_entryRuleElementWizard11066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementWizard11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleElementWizard11113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementWizard11130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleElementWizard11147 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleElementWizard11159 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleElementWizard11180 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleElementWizard11192 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleElementWizard11204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementWizard11221 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleElementWizard11238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementWizard11255 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleElementWizard11272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300200L});
    public static final BitSet FOLLOW_ruleWizardType_in_ruleElementWizard11293 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleElementWizard11305 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleElementWizard11317 = new BitSet(new long[]{0x0000000000040000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rulePage_in_ruleElementWizard11338 = new BitSet(new long[]{0x0000000000040000L,0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleElementWizard11351 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleElementWizard11363 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleElementWizard11375 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleElementWizard11396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleElementWizard11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage11444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rulePage11500 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage11512 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_rulePage11524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage11541 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage11558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage11575 = new BitSet(new long[]{0x0000000000040000L,0x000000E000000000L});
    public static final BitSet FOLLOW_101_in_rulePage11593 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage11605 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_ruleAttMap_in_rulePage11626 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_18_in_rulePage11639 = new BitSet(new long[]{0x0000000000040000L,0x000000C000000000L});
    public static final BitSet FOLLOW_102_in_rulePage11654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage11666 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage11683 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_rulePage11701 = new BitSet(new long[]{0x0000000000040000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_rulePage11716 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage11728 = new BitSet(new long[]{0x0000000000040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleButton_in_rulePage11749 = new BitSet(new long[]{0x0000000000040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_18_in_rulePage11762 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePage11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttMap_in_entryRuleAttMap11812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttMap11822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttMap11868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttMap11885 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAttMap11902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttMap11919 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAttMap11936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FC00000L});
    public static final BitSet FOLLOW_ruleComponentType_in_ruleAttMap11957 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAttMap11969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttMap11986 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttMap12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton12039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton12049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleButton12095 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleButton12107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton12124 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleButton12141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton12158 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleButton12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersonalWizard_in_entryRulePersonalWizard12211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersonalWizard12221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rulePersonalWizard12258 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_rulePersonalWizard12270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersonalWizard12287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePersonalWizard12304 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePersonalWizard12316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePersonalWizard12333 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePersonalWizard12350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView12386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedView_in_ruleView12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersonalView_in_ruleView12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedView_in_entryRulePredefinedView12505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefinedView12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rulePredefinedView12552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredefinedView12569 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePredefinedView12586 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_rulePredefinedView12598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePredefinedView12615 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePredefinedView12632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePredefinedView12649 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePredefinedView12666 = new BitSet(new long[]{0x0000000000000000L,0x0008400000000000L});
    public static final BitSet FOLLOW_ruleViewType_in_rulePredefinedView12687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rulePredefinedView12699 = new BitSet(new long[]{0x0000000000000000L,0x0062000000000000L});
    public static final BitSet FOLLOW_ruleViewStyle_in_rulePredefinedView12720 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_rulePredefinedView12733 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_rulePredefinedView12745 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_rulePredefinedView12757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePredefinedView12774 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePredefinedView12793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewType_in_entryRuleViewType12829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewType12839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowChilds_in_ruleViewType12886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowSelection_in_ruleViewType12913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountTypes_in_ruleViewType12940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowChilds_in_entryRuleShowChilds12975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShowChilds12985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleShowChilds13031 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleShowChilds13043 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleShowChilds13055 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleShowChilds13067 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleShowChilds13088 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleShowChilds13100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowSelection_in_entryRuleShowSelection13136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShowSelection13146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleShowSelection13192 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleShowSelection13204 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleShowSelection13217 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleShowSelection13229 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleShowSelection13250 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleShowSelection13262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountTypes_in_entryRuleCountTypes13300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountTypes13310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleCountTypes13356 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleCountTypes13368 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCountTypes13380 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCountTypes13392 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleClassReference_in_ruleCountTypes13413 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCountTypes13425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewStyle_in_entryRuleViewStyle13461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewStyle13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleViewStyle13514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleViewStyle13551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleViewStyle13589 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleViewStyle13620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersonalView_in_entryRulePersonalView13670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersonalView13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_rulePersonalView13717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersonalView13734 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePersonalView13751 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePersonalView13763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePersonalView13780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePersonalView13797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement13833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement13843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleStatement13880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement13897 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement13914 = new BitSet(new long[]{0x0000000000040000L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatement13935 = new BitSet(new long[]{0x0000000000040000L,0x0400000000000000L});
    public static final BitSet FOLLOW_18_in_ruleStatement13948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent13984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent13994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleEvent14040 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleEventType_in_ruleEvent14061 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleEvent14073 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvent14085 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleEvent14106 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_18_in_ruleEvent14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventType_in_entryRuleEventType14155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventType14165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMouseEvent_in_ruleEventType14212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyEvent_in_ruleEventType14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEvent_in_ruleEventType14266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenuEvent_in_ruleEventType14293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMouseEvent_in_entryRuleMouseEvent14328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMouseEvent14338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14382 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleMouseEvent14407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14433 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleMouseEvent14458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14484 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleMouseEvent14509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleMouseEvent14521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleMouseEvent14572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleMouseEvent14623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleMouseEvent14674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleMouseEvent14686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_ruleMouseEvent14737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_ruleMouseEvent14788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleMouseEvent14814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_ruleMouseEvent14839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleMouseEvent14851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyEvent_in_entryRuleKeyEvent14888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyEvent14898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleKeyEvent14942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_ruleKeyEvent14967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleKeyEvent14993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleKeyEvent15018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleKeyEvent15044 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleKeyEvent15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEvent_in_entryRuleElementEvent15106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEvent15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleElementEvent15159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleElementEvent15196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenuEvent_in_entryRuleMenuEvent15245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenuEvent15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleMenuEvent15301 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMenuEvent15313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMenuEvent15330 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMenuEvent15347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction15383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction15393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWizardStart_in_ruleInstruction15440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewDeploy_in_ruleInstruction15467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassExecution_in_ruleInstruction15494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWizardStart_in_entryRuleWizardStart15529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWizardStart15539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleWizardStart15576 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleWizardStart15588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWizardStart15608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewDeploy_in_entryRuleViewDeploy15644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewDeploy15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleViewDeploy15691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_ruleViewDeploy15703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewDeploy15723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassExecution_in_entryRuleClassExecution15759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassExecution15769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleClassExecution15806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassExecution15823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleLineType15878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleLineType15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleLineType15912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleLineType15929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleLineType15946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleWizardType15991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleWizardType16008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleWizardType16025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleComponentType16070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleComponentType16087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleComponentType16104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleComponentType16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleComponentType16138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleComponentType16155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleComponentType16172 = new BitSet(new long[]{0x0000000000000002L});

}