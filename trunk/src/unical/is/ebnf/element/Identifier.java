/**
 * 
 */
package unical.is.ebnf.element;

/**
 * @author Marilena Paldino
 * 
 */
public class Identifier extends GrammarElement {

	private GrammarElement	grammarElement;

	@Override
	public void add(GrammarElement grammarElement) {
		// TODO: chaining this.grammarElement with grammarElement
	}

	@Override
	public GrammarElement getGrammarElement() {
		if (grammarElement == null) {
			grammarElement = new ModInteger();
		}

		return grammarElement;
	}
}