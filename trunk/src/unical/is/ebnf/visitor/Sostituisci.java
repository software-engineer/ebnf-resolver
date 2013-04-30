/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Variabile;

/**
 * @author Marilena Paldino
 */
public class Sostituisci extends CopiaAstratta {

	private Variabile variabile;
	private Espressione target;

	public Espressione rimpiazza(Espressione espressione, Variabile variabile, Espressione target) {
		this.variabile = variabile;
		this.target = target;

		espressione.ricevi(this);

		return getValore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		if (variabile.equals(this.variabile)) {
			setValore(target);
		} else {
			setValore(new Variabile(variabile.getValue()));
		}
	}
}