/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.visitor.stampa.Infissa;
import unical.is.ebnf.visitor.stampa.Rappresentazione;

/**
 * @author Marilena Paldino
 */
public class StampaInfissa extends StampaAstratta {

	private Rappresentazione	rappresentazione;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Rappresentazione getRappresentazione() {
		if (rappresentazione == null) {
			rappresentazione = new Infissa();
		}

		return rappresentazione;
	}
}
