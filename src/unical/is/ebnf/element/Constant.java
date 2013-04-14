/**
 * 
 */
package unical.is.ebnf.element;

/**
 * @author Marilena Paldino
 * 
 */
public class Constant extends GrammarElement {

	private GrammarElement	grammarElement;

	@Override
	public void add(GrammarElement grammarElement) {
		this.grammarElement = grammarElement;
	}

	@Override
	public GrammarElement getResult() {
		return getGrammarElement();
	}

	/**
	 * 
	 * @return
	 */
	public GrammarElement getGrammarElement() {
		if (grammarElement == null) {
			grammarElement = new Constant();
		}

		return grammarElement;
	}
}
