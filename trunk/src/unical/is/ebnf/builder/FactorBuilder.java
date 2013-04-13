/**
 * 
 */
package unical.is.ebnf.builder;

import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public interface FactorBuilder {

	FactorConcatBuilder addConstant(GrammarElement grammarElement);

	FactorConcatBuilder addVariable(GrammarElement grammarElement);

	FactorConcatBuilder addExpression(GrammarElement grammarElement);

	interface FactorConcatBuilder {

		GrammarElement build();

	}
}
