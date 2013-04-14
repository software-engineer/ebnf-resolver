/**
 * 
 */
package unical.is.ebnf.grammar;

/**
 * @author Marilena Paldino
 * 
 */
public interface GrammarElementComposite extends GrammarElement {

	void setLeft(GrammarElement element);

	void setRight(GrammarElement element);

}
