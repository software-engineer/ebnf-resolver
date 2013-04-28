package unical.is.ebnf.grammar.operando;

/**
 * @author Marilena Paldino
 * 
 */
public interface OperandoBuilder {

	OperandoBuilder setValue(String value);

	Operando build();
}
