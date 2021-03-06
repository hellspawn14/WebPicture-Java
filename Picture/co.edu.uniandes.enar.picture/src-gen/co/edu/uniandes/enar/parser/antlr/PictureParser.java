/*
* generated by Xtext
*/
package co.edu.uniandes.enar.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import co.edu.uniandes.enar.services.PictureGrammarAccess;

public class PictureParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private PictureGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected co.edu.uniandes.enar.parser.antlr.internal.InternalPictureParser createParser(XtextTokenStream stream) {
		return new co.edu.uniandes.enar.parser.antlr.internal.InternalPictureParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public PictureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PictureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
