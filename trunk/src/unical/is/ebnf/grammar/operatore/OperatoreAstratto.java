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

	private Espressione	leftGrammarElement;
	private Espressione	rightGrammarElement;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract void ricevi(Visitatore visitatore);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setLeft(Espressione espressione) {
		this.leftGrammarElement = espressione;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setRight(Espressione espressione) {
		this.rightGrammarElement = espressione;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Espressione getLeft() {
		return leftGrammarElement;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Espressione getRight() {
		return rightGrammarElement;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getValue() {
		// TODO
		return null;
	}
}
