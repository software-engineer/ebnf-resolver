/**
 * 
 */
package unical.is.ebnf.element;


/**
 * @author Marilena Paldino
 * 
 */
public abstract class GrammarElement {

	public abstract GrammarElement getResult();

	public void add(GrammarElement grammarElement) {
		throw new UnsupportedOperationException();
	}
}
