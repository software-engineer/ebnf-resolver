/**
 * 
 */
package unical.is.ebnf.builder.impl;

import unical.is.ebnf.builder.ModIntegerBuilder;
import unical.is.ebnf.element.GrammarElement;
import unical.is.ebnf.element.ModInteger;

/**
 * @author Marilena Paldino
 * 
 */
public class ModIntegerBuilderImpl implements ModIntegerBuilder, ModIntegerBuilder.ModIntegerConcatBuilder {

	private GrammarElement	grammarElement;

	@Override
	public ModIntegerConcatBuilder addDigit(GrammarElement grammarElement) {
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
			grammarElement = new ModInteger();
		}

		return grammarElement;
	}
}
