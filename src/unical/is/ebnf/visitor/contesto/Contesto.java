/**
 * 
 */
package unical.is.ebnf.visitor.contesto;

/**
 * @author Marilena Paldino
 */
public interface Contesto {

	/**
	 * Recupera il valore della variabile
	 * 
	 * @param variabile variabile di cui recuperare il valore
	 * @return il valore della variabile
	 */
	double getValore(String variabile);
}