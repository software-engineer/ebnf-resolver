/**
 * 
 */
package unical.is.ebnf.visitor;

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
public class Valuta implements Visitatore {

	private Contesto	contesto;
	private double		valore;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Costante costante) {
		this.valore = Double.parseDouble(costante.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		this.valore = contesto.getValore(variabile.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Divisione divisione) {
		visitaOperatore(divisione, new Operazione() {

			@Override
			public double esegui(double operatore1, double operatore2) {
				return operatore1 / operatore2;
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Moltiplicazione moltiplicazione) {
		visitaOperatore(moltiplicazione, new Operazione() {

			@Override
			public double esegui(double operatore1, double operatore2) {
				return operatore1 * operatore2;
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Somma somma) {
		visitaOperatore(somma, new Operazione() {

			@Override
			public double esegui(double operatore1, double operatore2) {
				return operatore1 + operatore2;
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Sottrazione sottrazione) {
		visitaOperatore(sottrazione, new Operazione() {

			@Override
			public double esegui(double operatore1, double operatore2) {
				return operatore1 - operatore2;
			}
		});
	}

	/**
	 * 
	 * @param operatore
	 * @param operazione
	 */
	private void visitaOperatore(Operatore operatore, Operazione operazione) {
		operatore.getLeft().ricevi(this);
		double valore1 = this.valore;
		operatore.getRight().ricevi(this);
		double valore2 = this.valore;

		this.valore = operazione.esegui(valore1, valore2);
	}

	/**
	 * @author Marilena Paldino
	 * 
	 */
	public interface Contesto {

		/**
		 * 
		 * @param variabile
		 * @return
		 */
		double getValore(String variabile);
	}

	/**
	 * @author Marilena Paldino
	 * 
	 */
	private interface Operazione {

		/**
		 * 
		 * @param operatore1
		 * @param operatore2
		 * @return
		 */
		double esegui(double operatore1, double operatore2);
	}
}
