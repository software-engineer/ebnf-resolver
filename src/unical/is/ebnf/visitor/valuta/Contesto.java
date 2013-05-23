/**
 * 
 */
package unical.is.ebnf.visitor.valuta;

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