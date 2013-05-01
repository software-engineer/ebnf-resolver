/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.operatore.Operatore;

/**
 * @author Marilena Paldino
 */
public abstract class VisitatoreAstratto<T> implements Visitatore {

	/**
	 * Valore corrente
	 */
	private T	valore;

	/**
	 * Visita di un generico operatore
	 * 
	 * @param operatore operatore da visitare
	 * @param operazione operazione da effettuare
	 */
	protected void visitaOperatore(Operatore operatore, Operazione<T> operazione) {
		operatore.getLeft().ricevi(this);
		T valore1 = this.valore;
		operatore.getRight().ricevi(this);
		T valore2 = this.valore;

		this.valore = operazione.elabora(valore1, valore2);
	}

	/**
	 * Restituisce il valore corrente
	 * 
	 * @return il valore
	 */
	public T getValore() {
		return valore;
	}

	/**
	 * Imposta il valore corrente
	 * 
	 * @param valore il valore da settare
	 */
	public void setValore(T valore) {
		this.valore = valore;
	}
}
