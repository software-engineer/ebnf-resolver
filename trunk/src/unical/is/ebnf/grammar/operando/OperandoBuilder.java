package unical.is.ebnf.grammar.operando;

/**
 * @author Marilena Paldino
 * 
 */
public interface OperandoBuilder {

	public OperandoBuilder setValue(String value);

	public Operando build();
}
