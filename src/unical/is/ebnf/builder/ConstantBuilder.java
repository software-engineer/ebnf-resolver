/**
 * 
 */
package unical.is.ebnf.builder;

import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public interface ConstantBuilder {

	ConstantConcatBuilder addModInteger(GrammarElement grammarElement);

	interface ConstantConcatBuilder {

		GrammarElement build();
	}
}
