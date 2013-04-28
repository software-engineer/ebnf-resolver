/**
 * 
 */
package unical.is.ebnf.grammar.operatore;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.visitor.Visitatore;

/**
 * @author Marilena Paldino
 * 
 */
public class Sottrazione extends OperatoreAstratto {

	protected Espressione	leftGrammarElement;
	protected Espressione	rightGrammarElement;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ricevi(Visitatore visitor) {
		visitor.visita(this);
	}
}
