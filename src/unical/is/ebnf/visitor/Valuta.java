/**
 * 
 */
package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Costante;
import unical.is.ebnf.grammar.operando.Variabile;
import unical.is.ebnf.grammar.operatore.Divisione;
import unical.is.ebnf.grammar.operatore.Moltiplicazione;
import unical.is.ebnf.grammar.operatore.Somma;
import unical.is.ebnf.grammar.operatore.Sottrazione;
import unical.is.ebnf.visitor.contesto.Contesto;

/**
 * @author Marilena Paldino
 */
public class Valuta extends VisitatoreAstratto<Double> implements Visitatore {

	private Contesto contesto;

	public int valuta(Espressione espressione, Contesto contesto) {
		this.contesto = contesto;

		espressione.ricevi(this);

		return Double.valueOf(getValore()).intValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Costante costante) {
		setValore(Double.parseDouble(costante.getValue()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Variabile variabile) {
		setValore(contesto.getValore(variabile.getValue()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Divisione divisione) {
		visitaOperatore(divisione, new Operazione<Double>() {

			@Override
			public Double elabora(Double operatore1, Double operatore2) {
				return operatore1 / operatore2;
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Moltiplicazione moltiplicazione) {
		visitaOperatore(moltiplicazione, new Operazione<Double>() {

			@Override
			public Double elabora(Double operatore1, Double operatore2) {
				return operatore1 * operatore2;
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Somma somma) {
		visitaOperatore(somma, new Operazione<Double>() {

			@Override
			public Double elabora(Double operatore1, Double operatore2) {
				return operatore1 + operatore2;
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visita(Sottrazione sottrazione) {
		visitaOperatore(sottrazione, new Operazione<Double>() {

			@Override
			public Double elabora(Double operatore1, Double operatore2) {
				return operatore1 - operatore2;
			}
		});
	}
}