/**
 * 
 */
package unical.is.ebnf.visitor.stampa;



/**
 * @author Marilena Paldino
 */
public class StampaInFissa extends StampaAstratta {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected RappresentazioneInFissa getRappresentazione(String simboloOperazione) {
		return new RappresentazioneInFissa(simboloOperazione);
	}
}
