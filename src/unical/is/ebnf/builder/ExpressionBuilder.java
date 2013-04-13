/**
 * 
 */
package unical.is.ebnf.builder;

import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public interface ExpressionBuilder {

	ExpressionConcatBuilder addTerm(GrammarElement grammarElement);

	interface ExpressionConcatBuilder {

		ExpressionBuilder addAddOperator(GrammarElement grammarElement);

		GrammarElement build();
	}
}
