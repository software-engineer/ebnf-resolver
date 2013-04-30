/**
 * 
 */
package unical.is.ebnf.visitor;

/**
 * @author Marilena Paldino
 */
public class RappresentazionePostFissa implements Operazione<String> {

	private final String simboloOperatore;

	public RappresentazionePostFissa(String simboloOperatore) {
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
				.append(operatore2)
				.append(", ")
				.append(simboloOperatore)
				.append(")");

		return buffer.toString();
	}

}
