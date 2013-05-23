/**
 * 
 */
package unical.is.ebnf.visitor.valuta;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.Costante;
import unical.is.ebnf.grammar.operando.Variabile;
import unical.is.ebnf.grammar.operatore.Divisione;
import unical.is.ebnf.grammar.operatore.Moltiplicazione;
import unical.is.ebnf.grammar.operatore.Somma;
import unical.is.ebnf.grammar.operatore.Sottrazione;
import unical.is.ebnf.visitor.Operazione;
import unical.is.ebnf.visitor.VisitatoreAstratto;

/**
 * @author Marilena Paldino
 */
public class Valuta extends VisitatoreAstratto<Double> {

	/**
	 * Istanza del contesto
	 */
	private Contesto	contesto;

	/**
	 * Entry point per la valutazione dell'espressione
	 * 
	 * @param espressione espressione da valutare
	 * @param contesto contesto per la valutazione dell'espressione
	 * @return risultato della valutazione dell'espressione
	 */
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
			public Double elabora(Double operando1, Double operando2) {
				return operando1 / operando2;
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
			public Double elabora(Double operando1, Double operando2) {
				return operando1 * operando2;
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
			public Double elabora(Double operando1, Double operando2) {
				return operando1 + operando2;
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
			public Double elabora(Double operando1, Double operando2) {
				return operando1 - operando2;
			}
		});
	}
}