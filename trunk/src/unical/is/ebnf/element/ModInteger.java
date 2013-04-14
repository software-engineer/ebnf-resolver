/**
 * 
 */
package unical.is.ebnf.element;

/**
 * @author Marilena Paldino
 * 
 */
public class ModInteger extends GrammarElement {

	private GrammarElement	grammarElement;

	@Override
	public void add(GrammarElement grammarElement) {
		// TODO: chaining this.grammarElement with grammarElement
	}

	@Override
	public GrammarElement getResult() {
		return getGrammarElement();
	}

	private GrammarElement getGrammarElement() {
		if (grammarElement == null) {
			grammarElement = new ModInteger();
		}

		return grammarElement;
	}
}
