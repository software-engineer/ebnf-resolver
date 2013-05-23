/**
 * 
 */
package unical.is.ebnf.visitor.stampa;

import unical.is.ebnf.visitor.valuta.Operazione;

/**
 * @author Marilena Paldino
 */
public class RappresentazioneInFissa implements Operazione<String> {

	/**
	 * Simbolo dell'operatore da rappresentare
	 */
	private final String	simboloOperatore;

	public RappresentazioneInFissa(String simboloOperatore) {
		this.simboloOperatore = simboloOperatore;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String elabora(String operando1, String operando2) {
		StringBuilder builder = new StringBuilder();

		builder.append("(")
				.append(operando1)
				.append(", ")
				.append(simboloOperatore)
				.append(", ")
				.append(operando2)
				.append(")");

		return builder.toString();
	}

}
