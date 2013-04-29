/**
 * 
 */
package unical.is.ebnf.visitor.stampa;

/**
 * @author Marilena Paldino
 */
public class Infissa implements Rappresentazione {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String rappresenta(String operatore1, String operatore2, String operando) {
		StringBuffer buffer = new StringBuffer();

		buffer.append("(")
				.append(operatore1)
				.append(operando)
				.append(operatore2)
				.append(")");

		return buffer.toString();
	}
}
