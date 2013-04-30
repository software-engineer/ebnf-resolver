/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.operatore.Operatore;

/**
 * @author Marilena Paldino
 */
public abstract class VisitatoreAstratto<T> implements Visitatore {

	private T valore;

	/**
	 * @param operatore
	 * @param operazione
	 */
	protected void visitaOperatore(Operatore operatore, Operazione<T> operazione) {
		operatore.getLeft().ricevi(this);
		T valore1 = this.valore;
		operatore.getRight().ricevi(this);
		T valore2 = this.valore;

		this.valore = operazione.elabora(valore1, valore2);
	}

	/**
	 * @return the valore
	 */
	public T getValore() {
		return valore;
	}

	/**
	 * @param valore the valore to set
	 */
	public void setValore(T valore) {
		this.valore = valore;
	}
}
