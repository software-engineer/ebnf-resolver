/**
 * 
 */
package unical.is.ebnf.builder;

import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public interface ModIntegerBuilder {

	ModIntegerConcatBuilder addDigit(GrammarElement grammarElement);

	interface ModIntegerConcatBuilder {

		ModIntegerConcatBuilder addDigit(GrammarElement grammarElement);

		GrammarElement build();
	}
}
