/**
 * 
 */
package unical.is.ebnf.visitor.stampa;



/**
 * @author Marilena Paldino
 */
public class StampaPostFissa extends StampaAstratta {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected RappresentazionePostFissa getRappresentazione(String simboloOperazione) {
		return new RappresentazionePostFissa(simboloOperazione);
	}
}
