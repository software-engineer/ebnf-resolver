/**
 * 
 */
package unical.is.ebnf.visitor;

/**
 * @author Marilena Paldino
 */
public class RappresentazioneInFissa implements Operazione<String> {

	private final String simboloOperatore;

	public RappresentazioneInFissa(String simboloOperatore) {
		this.simboloOperatore = simboloOperatore;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String elabora(String operatore1, String operatore2) {
		StringBuffer buffer = new StringBuffer();

		buffer.append("(")
				.append(operatore1)
				.append(", ")
				.append(simboloOperatore)
				.append(", ")
				.append(operatore2)
				.append(")");

		return buffer.toString();
	}

}
