/**
 * 
 */
package unical.is.ebnf.builder.impl;

import unical.is.ebnf.builder.VariableBuilder;
import unical.is.ebnf.element.GrammarElement;
import unical.is.ebnf.element.Variable;

/**
 * @author Marilena Paldino
 * 
 */
public class VariableBuilderImpl implements VariableBuilder, VariableBuilder.VariableConcatBuilder {

	private GrammarElement	grammarElement;

	@Override
	public VariableConcatBuilder addIdentifier(GrammarElement grammarElement) {
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
			grammarElement = new Variable();
		}

		return grammarElement;
	}
}
