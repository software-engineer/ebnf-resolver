/**
 * 
 */
package unical.is.ebnf.grammar.constant;

import unical.is.ebnf.visitor.Visitor;

/**
 * @author Marilena Paldino
 * 
 */
class ConstantImpl implements Constant {

	private final String	value;

	ConstantImpl(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
