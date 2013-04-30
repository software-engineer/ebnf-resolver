/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Costante;
import unical.is.ebnf.grammar.operando.Variabile;
import unical.is.ebnf.grammar.operatore.Divisione;
import unical.is.ebnf.grammar.operatore.Moltiplicazione;
import unical.is.ebnf.grammar.operatore.Somma;
import unical.is.ebnf.grammar.operatore.Sottrazione;

/**
 * @author Marilena Paldino
 */
public abstract class StampaAstratta extends VisitatoreAstratto<String> implements Visitatore {

	/**
	 * @param string
	 * @return
	 */
	protected abstract Operazione<String> getRappresentazione(String string);

	public String stampa(Espressione espressione) {
		espressione.ricevi(this);

		return getValore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Costante costante) {
		setValore(costante.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		setValore(variabile.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Divisione divisione) {
		visitaOperatore(divisione, getRappresentazione("/"));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Moltiplicazione moltiplicazione) {
		visitaOperatore(moltiplicazione, getRappresentazione("*"));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Somma somma) {
		visitaOperatore(somma, getRappresentazione("+"));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Sottrazione sottrazione) {
		visitaOperatore(sottrazione, getRappresentazione("-"));
	}
}
