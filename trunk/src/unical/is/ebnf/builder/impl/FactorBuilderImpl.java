/**
 * 
 */
package unical.is.ebnf.builder.impl;

import unical.is.ebnf.builder.FactorBuilder;
import unical.is.ebnf.element.Factor;
import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public class FactorBuilderImpl implements FactorBuilder, FactorBuilder.FactorConcatBuilder {

	private GrammarElement	grammarElement;

	@Override
	public FactorConcatBuilder addConstant(GrammarElement grammarElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FactorConcatBuilder addVariable(GrammarElement grammarElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FactorConcatBuilder addExpression(GrammarElement grammarElement) {
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
			grammarElement = new Factor();
		}

		return grammarElement;
	}
}
