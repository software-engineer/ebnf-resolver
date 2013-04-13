/**
 * 
 */
package unical.is.ebnf.builder;

import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public interface TermBuilder {

	TermConcatBuilder addFactor(GrammarElement grammarElement);

	interface TermConcatBuilder {

		TermBuilder addMulOperator(GrammarElement grammarElement);

		GrammarElement build();
	}
}
