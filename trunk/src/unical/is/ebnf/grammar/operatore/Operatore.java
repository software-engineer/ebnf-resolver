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

	public void setLeft(Espressione element);

	public void setRight(Espressione element);

	public Espressione getLeft();

	public Espressione getRight();
}
