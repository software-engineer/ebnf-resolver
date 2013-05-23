/**
 * 
 */
package unical.is.ebnf.visitor.valuta;

/**
 * @author Marilena Paldino
 */
public class OperazioneSomma implements Operazione<Double> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Double elabora(Double operando1, Double operando2) {
		return operando1 + operando2;
	}

}
