/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operatore.Operatore;

/**
 * @author Marilena Paldino
 */
public class CopiaOperazione implements Operazione<Espressione> {

	/**
	 * Istanza dell'operatore
	 */
	private final Operatore	operatore;

	public CopiaOperazione(Operatore operatore) {
		this.operatore = operatore;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Espressione elabora(Espressione operando1, Espressione operando2) {
		operatore.setLeft(operando1);
		operatore.setRight(operando2);
		return operatore;
	}
}
