/**
 * 
 */
package unical.is.ebnf.element;

import java.util.List;

/**
 * @author Marilena Paldino
 * 
 */
public abstract class GrammarElement {

	public void add(GrammarElement grammarElement) {
		throw new UnsupportedOperationException();
	}

	public GrammarElement getGrammarElement() {
		throw new UnsupportedOperationException();
	}

	public List<GrammarElement> getGrammarElementList() {
		throw new UnsupportedOperationException();
	}
}
