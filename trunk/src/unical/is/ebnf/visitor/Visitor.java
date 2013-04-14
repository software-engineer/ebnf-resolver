package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.addoperand.Operand;
import unical.is.ebnf.grammar.constant.Constant;

public interface Visitor {

	void visit(Constant constant);

	void visit(Operand operand);

}
