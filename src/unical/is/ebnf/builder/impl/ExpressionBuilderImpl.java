/**
 * 
 */
package unical.is.ebnf.builder.impl;

import unical.is.ebnf.builder.ExpressionBuilder;
import unical.is.ebnf.element.Expression;
import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public class ExpressionBuilderImpl implements ExpressionBuilder, ExpressionBuilder.ExpressionConcatBuilder {

	private GrammarElement	grammarElement;

	@Override
	public ExpressionConcatBuilder addTerm(GrammarElement gr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpressionBuilder addAddOperator(GrammarElement gr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GrammarElement build() {
		return getGrammarElement();
	}

	/**
	 * @return the grammarElement
	 */
	private GrammarElement getGrammarElement() {
		if (grammarElement == null) {
			grammarElement = new Expression();
		}

		return grammarElement;
	}
}
