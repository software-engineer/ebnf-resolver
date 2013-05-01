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
public abstract class CopiaAstratta extends VisitatoreAstratto<Espressione> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Costante costante) {
		setValore(new Costante(costante.getValue()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		setValore(new Variabile(variabile.getValue()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Divisione divisione) {
		visitaOperatore(divisione, new CopiaOperazione(new Divisione()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Moltiplicazione moltiplicazione) {
		visitaOperatore(moltiplicazione, new CopiaOperazione(new Moltiplicazione()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Somma somma) {
		visitaOperatore(somma, new CopiaOperazione(new Somma()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Sottrazione sottrazione) {
		visitaOperatore(sottrazione, new CopiaOperazione(new Sottrazione()));
	}
}
