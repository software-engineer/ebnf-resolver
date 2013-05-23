/**
 * 
 */
package unical.is.ebnf.visitor.stampa;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Costante;
import unical.is.ebnf.grammar.operando.Variabile;
import unical.is.ebnf.grammar.operatore.Divisione;
import unical.is.ebnf.grammar.operatore.Moltiplicazione;
import unical.is.ebnf.grammar.operatore.Somma;
import unical.is.ebnf.grammar.operatore.Sottrazione;
import unical.is.ebnf.visitor.Operazione;
import unical.is.ebnf.visitor.VisitatoreAstratto;

/**
 * @author Marilena Paldino
 */
public abstract class StampaAstratta extends VisitatoreAstratto<String> {

	/**
	 * Restituisce la giusta implementazione di operazione per la visita che si vuole ottenere, per il simbolo passatogli
	 * 
	 * @param simboloOperatore il simbolo dell'operatore che si vuole rappresentare
	 * @return implementazione concreta dell'operazione
	 */
	protected abstract Operazione<String> getRappresentazione(String simboloOperatore);

	/**
	 * Entry point per la stampa dell'espressione
	 * 
	 * @param espressione espressione da stampare
	 * @return stringa rappresentante l'erspressione
	 */
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
