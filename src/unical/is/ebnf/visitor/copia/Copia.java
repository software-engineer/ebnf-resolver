/**
 * 
 */
package unical.is.ebnf.visitor.copia;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Variabile;

/**
 * @author Marilena Paldino
 */
public class Copia extends CopiaAstratta {

	/**
	 * Entry point per la copia dell'espressione
	 * 
	 * @param espressione espressione da copiare
	 * @return espressione copia
	 */
	public Espressione copia(Espressione espressione) {
		espressione.ricevi(this);

		return getValore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		setValore(new Variabile(variabile.getValue()));
	}
}
