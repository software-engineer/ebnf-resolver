/**
 * 
 */
package unical.is.ebnf.visitor.copia;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Variabile;

/**
 * @author Marilena Paldino
 */
public class Sostituisci extends CopiaAstratta {

	private Variabile	variabile;
	private Espressione	target;

	/**
	 * Entry point per il rimpiazza dell'espressione
	 * 
	 * @param espressione espressione da elaborare
	 * @param variabile nome variabile da rimpiazzare
	 * @param target espressione da sostituire alla variabile
	 * @return espressione copia con sostituita la variabile con l'espressione target
	 */
	public Espressione rimpiazza(Espressione espressione, Variabile variabile, Espressione target) {
		this.variabile = variabile;
		this.target = target;

		espressione.ricevi(this);

		return getValore();
	}

	/**
	 * Override del metodo affinche possa controllare se la variabile è quella da sosituire. Se lo è, la sostituisce con il target,
	 * altrimenti copia la variabile.
	 */
	@Override
	public void visita(Variabile variabile) {
		if (variabile.equals(this.variabile)) {
			setValore(target);
		} else {
			setValore(new Variabile(variabile.getValue()));
		}
	}
}