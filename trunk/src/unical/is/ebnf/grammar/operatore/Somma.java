/**
 * 
 */
package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.visitor.Visitatore;

/**
 * @author Marilena Paldino
 * 
 */
public class Somma extends OperatoreAstratto {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ricevi(Visitatore visitor) {
		visitor.visita(this);
	}
}