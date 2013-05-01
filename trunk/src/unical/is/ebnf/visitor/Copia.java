/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.Espressione;

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
}
