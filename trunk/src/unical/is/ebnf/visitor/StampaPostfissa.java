/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.visitor.stampa.Postfissa;
import unical.is.ebnf.visitor.stampa.Rappresentazione;

/**
 * @author Marilena Paldino
 */
public class StampaPostfissa extends StampaAstratta {

	private Rappresentazione	rappresentazione;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Rappresentazione getRappresentazione() {
		if (rappresentazione == null) {
			rappresentazione = new Postfissa();
		}

		return rappresentazione;
	}
}
