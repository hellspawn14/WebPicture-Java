/*
* generated by Xtext
*/
package co.edu.uniandes.enar.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PictureAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("co/edu/uniandes/enar/parser/antlr/internal/InternalPicture.tokens");
	}
}
