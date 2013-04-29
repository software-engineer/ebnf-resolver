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

/**
 * @author Marilena Paldino
 * 
 */
public abstract class CopiaAstratta implements Visitatore {

	protected Espressione	espressioneCopia;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Costante costante) {
		this.espressioneCopia = new Costante(costante.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		this.espressioneCopia = new Variabile(variabile.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Divisione divisione) {
		visitaOperatore(divisione, new Divisione());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Moltiplicazione moltiplicazione) {
		visitaOperatore(moltiplicazione, new Moltiplicazione());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Somma somma) {
		visitaOperatore(somma, new Somma());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Sottrazione sottrazione) {
		visitaOperatore(sottrazione, new Sottrazione());
	}

	/**
	 * @param operatore
	 * @param operazione
	 */
	private void visitaOperatore(Operatore operatore, Operatore operatoreCopia) {
		operatore.getLeft().ricevi(this);
		Espressione espressioneLeft = this.espressioneCopia;
		operatore.getRight().ricevi(this);
		Espressione espressioneRight = this.espressioneCopia;

		operatoreCopia.setLeft(espressioneLeft);
		operatoreCopia.setRight(espressioneRight);
		this.espressioneCopia = operatoreCopia;
	}
}
