/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Costante;
import unical.is.ebnf.grammar.operando.Variabile;
import unical.is.ebnf.grammar.operatore.Divisione;
import unical.is.ebnf.grammar.operatore.Moltiplicazione;
import unical.is.ebnf.grammar.operatore.Operatore;
import unical.is.ebnf.grammar.operatore.Somma;
import unical.is.ebnf.grammar.operatore.Sottrazione;
import unical.is.ebnf.visitor.stampa.Postfissa;
import unical.is.ebnf.visitor.stampa.Rappresentazione;

/**
 * @author Marilena Paldino
 */
public class StampaPostfissa implements Visitatore {

	private Rappresentazione rappresentazione;

	private String valore;

	public String stampaPostfissa(Espressione espressione) {
		this.rappresentazione = new Postfissa();
		espressione.ricevi(this);

		return valore;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Costante costante) {
		this.valore = costante.getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		this.valore = variabile.getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Divisione divisione) {
		visitaOperatore(divisione, "/");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Moltiplicazione moltiplicazione) {
		visitaOperatore(moltiplicazione, "*");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Somma somma) {
		visitaOperatore(somma, "+");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Sottrazione sottrazione) {
		visitaOperatore(sottrazione, "-");
	}

	/**
	 * @param operatore
	 * @param simboloOperatore
	 */
	private void visitaOperatore(Operatore operatore, String simboloOperatore) {
		operatore.getLeft().ricevi(this);
		String valore1 = this.valore;
		operatore.getRight().ricevi(this);
		String valore2 = this.valore;

		this.valore = rappresentazione.rappresenta(valore1, valore2, simboloOperatore);
	}
}
