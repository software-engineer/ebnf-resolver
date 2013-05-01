/**
 * 
 */
package unical.is.ebnf.visitor;

/**
 * @author Marilena Paldino
 */
public class RappresentazionePostFissa implements Operazione<String> {

	/**
	 * Simbolo dell'operatore da rappresentare
	 */
	private final String	simboloOperatore;

	public RappresentazionePostFissa(String simboloOperatore) {
		this.simboloOperatore = simboloOperatore;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String elabora(String operando1, String operando2) {
		StringBuffer buffer = new StringBuffer();

		buffer.append("(")
				.append(operando1)
				.append(", ")
				.append(operando2)
				.append(", ")
				.append(simboloOperatore)
				.append(")");

		return buffer.toString();
	}

}
