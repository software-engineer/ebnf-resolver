/**
 * 
 */
package unical.is.ebnf.builder.impl;

import unical.is.ebnf.builder.TermBuilder;
import unical.is.ebnf.element.GrammarElement;
import unical.is.ebnf.element.Term;

/**
 * @author Marilena Paldino
 * 
 */
public class TermBuilderImpl implements TermBuilder, TermBuilder.TermConcatBuilder {

	private GrammarElement	grammarElement;

	@Override
	public TermBuilder addMulOperator(GrammarElement grammarElement) {
		getGrammarElement().add(grammarElement);
		return this;
	}

	@Override
	public TermConcatBuilder addFactor(GrammarElement grammarElement) {
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
