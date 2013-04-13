/**
 * 
 */
package unical.is.ebnf.builder;

import unical.is.ebnf.element.GrammarElement;

/**
 * @author Marilena Paldino
 * 
 */
public interface VariableBuilder {

	VariableConcatBuilder addIdentifier(GrammarElement grammarElement);

	interface VariableConcatBuilder {

		GrammarElement build();
	}
}
