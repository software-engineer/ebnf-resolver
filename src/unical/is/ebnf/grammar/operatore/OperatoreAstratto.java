/**
 * 
 */
package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.visitor.Visitatore;

/**
 * @author Marilena Paldino
 * 
 */
public abstract class OperatoreAstratto implements Operatore {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract void ricevi(Visitatore visitatore);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setLeft(Espressione element) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setRight(Espressione element) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Espressione getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Espressione getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
