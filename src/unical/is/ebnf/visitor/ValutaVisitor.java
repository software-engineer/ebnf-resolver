/**
 * 
 */
package unical.is.ebnf.visitor;

import java.util.Stack;

import unical.is.ebnf.grammar.addoperand.Operand;
import unical.is.ebnf.grammar.constant.Constant;
import unical.is.ebnf.grammar.espressione.Espressione;

/**
 * @author Marilena Paldino
 * 
 */
public class ValutaVisitor implements Visitor {

	private Stack<Double>	partialResults;
	private Contesto		contesto;
	private double			result;

	@Override
	public void visit(Constant constant) {
		partialResults.add(Double.valueOf(constant.getValue()));

	}

	@Override
	public void visit(Operand operand) {
		// TODO Auto-generated method stub

	}

	public double valuta(Espressione e, Contesto contesto) {
		this.contesto = contesto;
		e.accept(this);

		return result;
	}

	public interface Contesto {

	}
}
