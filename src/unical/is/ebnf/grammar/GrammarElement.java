/**
 * 
 */
package unical.is.ebnf.grammar;

import unical.is.ebnf.visitor.Visitable;

/**
 * @author Marilena Paldino
 * 
 */
public interface GrammarElement extends Visitable {

	String getValue();

}
