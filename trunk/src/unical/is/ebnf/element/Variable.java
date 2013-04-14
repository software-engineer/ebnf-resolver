/**
 * 
 */
package unical.is.ebnf.element;

/**
 * @author Marilena Paldino
 * 
 */
public class Variable extends GrammarElement {

	private GrammarElement	grammarElement;

	@Override
	public void add(GrammarElement grammarElement) {
		this.grammarElement = grammarElement;
	}

	@Override
	public GrammarElement getResult() {
		return getGrammarElement();
	}

	private GrammarElement getGrammarElement() {
		if (grammarElement == null) {
			grammarElement = new Variable();
		}

		return grammarElement;
	}
}
