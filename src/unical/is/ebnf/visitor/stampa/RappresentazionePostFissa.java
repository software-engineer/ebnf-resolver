/**
 * 
 */
package unical.is.ebnf.visitor.stampa;

import unical.is.ebnf.visitor.valuta.Operazione;

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
		StringBuilder builder = new StringBuilder();

		builder.append("(")
				.append(operando1)
				.append(", ")
				.append(operando2)
				.append(", ")
				.append(simboloOperatore)
				.append(")");

		return builder.toString();
	}

}
