/**
 * 
 */
package unical.is.ebnf.visitor.stampa;

/**
 * @author Marilena Paldino
 */
public interface Rappresentazione {

	/**
	 * @param operatore1
	 * @param operatore2
	 * @param operando
	 * @return la rappresentazione in stringa
	 */
	String rappresenta(String operatore1, String operatore2, String operando);
}
