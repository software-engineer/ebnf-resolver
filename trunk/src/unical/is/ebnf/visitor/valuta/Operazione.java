/**
 * 
 */
package unical.is.ebnf.visitor.valuta;

/**
 * @author Marilena Paldino
 */
public interface Operazione<T> {

	/**
	 * Core dell'operazione
	 * 
	 * @param operatore1 operando left
	 * @param operatore2 operando right
	 * @return il risultato dell'operazione
	 */
	T elabora(T operando1, T operando2);

}
