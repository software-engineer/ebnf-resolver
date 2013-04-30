/**
 * 
 */
package unical.is.ebnf.visitor;

/**
 * @author Marilena Paldino
 */
public interface Operazione<T> {

	T elabora(T operatore1, T operatore2);

}
