package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.parser.Simbolo;

/**
 * @author Marilena Paldino
 */
public class OperatoreBuilderImpl implements OperatoreBuilder {

	private Espressione leftGrammarElement;
	private Espressione rightGrammarElement;
	private Simbolo simbolo;

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

		switch (simbolo) {
		case DIF:
			operand = new Sottrazione();
			break;
		case DIV:
			operand = new Divisione();
			break;
		case MUL:
			operand = new Moltiplicazione();
			break;
		case SUM:
			operand = new Somma();
			break;
		default:
			throw new IllegalArgumentException();
		}

		operand.setLeft(leftGrammarElement);
		operand.setRight(rightGrammarElement);

		return operand;
	}
}