/**
 * 
 */
package unical.is.ebnf.element;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marilena Paldino
 * 
 */
public class Expression extends GrammarElement {

	private List<GrammarElement>	grammarElementList;

	@Override
	public void add(GrammarElement grammarElement) {
		getGrammarElementList().add(grammarElement);
	}

	@Override
	public GrammarElement getResult() {
		GrammarElement result = new Expression();

		for (GrammarElement grammarElement : getGrammarElementList()) {
			// TODO: chaining result with each grammarElement
		}

		return result;
	}

	private List<GrammarElement> getGrammarElementList() {
		if (grammarElementList == null) {
			grammarElementList = new ArrayList<GrammarElement>();
		}

		return grammarElementList;
	}
}
