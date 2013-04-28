package unical.is.ebnf.grammar.operando;

/**
 * @author Marilena Paldino
 * 
 */
public class OperandoBuilderImpl implements OperandoBuilder {

	private String			stringValue;
	private final String	regex;

	public OperandoBuilderImpl() {
		this.regex = "\\d+";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OperandoBuilder setValue(String value) {
		this.stringValue = value;
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Operando build() {
		Operando value;

		if (stringValue.matches(regex)) {
			value = new Costante(stringValue);
		} else {
			value = new Variabile(stringValue);
		}

		return value;
	}
}