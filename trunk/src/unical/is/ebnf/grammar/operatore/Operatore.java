/**
 * 
 */
package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.grammar.Espressione;

/**
 * @author Marilena Paldino
 * 
 */
public interface Operatore extends Espressione {

	void setLeft(Espressione element);

	void setRight(Espressione element);

	Espressione getLeft();

	Espressione getRight();
}
