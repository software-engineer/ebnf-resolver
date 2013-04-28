package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.parser.Simbolo;

/**
 * @author Marilena Paldino
 * 
 */
public interface OperatoreBuilder {

	OperatoreBuilder setLeftEspressione(Espressione grammarElement);

	OperatoreBuilder setRightEspressione(Espressione grammarElement);

	OperatoreBuilder setOperand(Simbolo operand);

	Operatore build();
}
