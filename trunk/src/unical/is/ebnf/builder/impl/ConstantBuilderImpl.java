/**
 * 
 */
package unical.is.ebnf.builder.impl;

import unical.is.ebnf.builder.ConstantBuilder;
import unical.is.ebnf.element.GrammarElement;
import unical.is.ebnf.element.Term;

/**
 * @author Marilena Paldino
 * 
 */
public class ConstantBuilderImpl implements ConstantBuilder, ConstantBuilder.ConstantConcatBuilder {

	private GrammarElement	grammarElement;

	@Override
	public ConstantConcatBuilder addModInteger(GrammarElement grammarElement) {
		getGrammarElement().add(grammarElement);
		return this;
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
			grammarElement = new Term();
		}

		return grammarElement;
	}
}
