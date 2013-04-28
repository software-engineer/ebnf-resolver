package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.parser.Simbolo;

/**
 * @author Marilena Paldino
 * 
 */
public class OperatoreBuilderImpl implements OperatoreBuilder {

	private Espressione	leftGrammarElement;
	private Espressione	rightGrammarElement;
	private Simbolo		simbolo;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OperatoreBuilder setLeftEspressione(Espressione grammarElement) {
		this.leftGrammarElement = grammarElement;
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OperatoreBuilder setRightEspressione(Espressione grammarElement) {
		this.rightGrammarElement = grammarElement;
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OperatoreBuilder setOperand(Simbolo simbolo) {
		this.simbolo = simbolo;
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Operatore build() {
		Operatore operand;

		if (Simbolo.DIF.equals(simbolo)) {
			operand = new Sottrazione();
		} else if (Simbolo.DIV.equals(simbolo)) {
			operand = new Divisione();
		} else if (Simbolo.MUL.equals(simbolo)) {
			operand = new Moltiplicazione();
		} else if (Simbolo.SUM.equals(simbolo)) {
			operand = new Somma();
		} else {
			throw new IllegalArgumentException();
		}

		operand.setLeft(leftGrammarElement);
		operand.setRight(rightGrammarElement);

		return operand;
	}
}