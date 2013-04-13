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
public class Term extends GrammarElement {

	private List<GrammarElement>	grammarElementList;

	@Override
	public void add(GrammarElement grammarElement) {
		getGrammarElementList().add(grammarElement);
	}

	@Override
	public List<GrammarElement> getGrammarElementList() {
		if (grammarElementList == null) {
			grammarElementList = new ArrayList<GrammarElement>();
		}

		return grammarElementList;
	}
}
