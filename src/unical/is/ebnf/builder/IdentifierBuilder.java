/**
 * 
 */
package unical.is.ebnf.builder;

import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public interface IdentifierBuilder {

	IdentifierConcatBuilder addLetter(GrammarElement grammarElement);

	interface IdentifierConcatBuilder {

		IdentifierConcatBuilder addDigit(GrammarElement grammarElement);

		IdentifierConcatBuilder addLetter(GrammarElement grammarElement);

		GrammarElement build();
	}
}
