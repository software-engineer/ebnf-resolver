/**
 * 
 */
package unical.is.ebnf.builder.impl;

import unical.is.ebnf.builder.IdentifierBuilder;
import unical.is.ebnf.element.GrammarElement;
import unical.is.ebnf.element.Identifier;

/**
 * @author Marilena Paldino
 * 
 */
public class IdentifierBuilderImpl implements IdentifierBuilder, IdentifierBuilder.IdentifierConcatBuilder {

	private GrammarElement	grammarElement;

	@Override
	public IdentifierConcatBuilder addLetter(GrammarElement grammarElement) {
		getGrammarElement().add(grammarElement);
		return this;
	}

	@Override
	public IdentifierConcatBuilder addDigit(GrammarElement grammarElement) {
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
			grammarElement = new Identifier();
		}

		return grammarElement;
	}
}