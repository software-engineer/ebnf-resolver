/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.Espressione;

/**
 * @author Marilena Paldino
 */
public class Copia extends CopiaAstratta {

	public Espressione copia(Espressione espressione) {
		espressione.ricevi(this);

		return getValore();
	}
}
