/**
 * 
 */
package unical.is.ebnf.grammar.operando;

import unical.is.ebnf.visitor.Visitatore;

/**
 * @author Marilena Paldino
 * 
 */
public class Costante implements Operando {

	private final String	value;

	public Costante(String value) {
		this.value = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ricevi(Visitatore visitor) {
		visitor.visita(this);
	}
}
