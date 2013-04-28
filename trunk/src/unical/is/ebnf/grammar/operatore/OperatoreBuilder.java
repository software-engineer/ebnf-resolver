package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.parser.Simbolo;

/**
 * @author Marilena Paldino
 * 
 */
public interface OperatoreBuilder {

	public OperatoreBuilder setLeftEspressione(Espressione grammarElement);

	public OperatoreBuilder setRightEspressione(Espressione grammarElement);

	public OperatoreBuilder setOperand(Simbolo operand);

	public Operatore build();
}
