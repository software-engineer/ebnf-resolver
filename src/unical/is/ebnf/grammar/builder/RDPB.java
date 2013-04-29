package unical.is.ebnf.grammar.builder;

import java.io.IOException;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.grammar.operando.OperandoBuilder;
import unical.is.ebnf.grammar.operando.OperandoBuilderImpl;
import unical.is.ebnf.grammar.operatore.OperatoreBuilder;
import unical.is.ebnf.grammar.operatore.OperatoreBuilderImpl;
import unical.is.ebnf.parser.AnalizzatoreLessicale;
import unical.is.ebnf.parser.Simbolo;

/**
 * @author Marilena Paldino
 * 
 */
public class RDPB {

	private final AnalizzatoreLessicale	analizzatoreLessicale;
	private Simbolo						simbolo;
	private Espressione					root	= null;

	public RDPB(AnalizzatoreLessicale analizzatoreLessicale) {
		this.analizzatoreLessicale = analizzatoreLessicale;
	}

	public Espressione build() throws IOException {
		espressione();
		return root;
	}

	private void espressione() throws IOException {
		termine();
		while (simbolo.equals(Simbolo.SUM) || simbolo.equals(Simbolo.DIF)) {
			OperatoreBuilder operandBuilder = new OperatoreBuilderImpl();
			operandBuilder.setOperand(simbolo);
			operandBuilder.setLeftEspressione(root);
			termine();
			operandBuilder.setRightEspressione(root);
			root = operandBuilder.build();
		}
	}

	private void termine() throws IOException {
		fattore();
		while (simbolo.equals(Simbolo.MUL) || simbolo.equals(Simbolo.DIV)) {
			OperatoreBuilder operandBuilder = new OperatoreBuilderImpl();
			operandBuilder.setOperand(simbolo);
			operandBuilder.setLeftEspressione(root);
			fattore();
			operandBuilder.setRightEspressione(root);
			root = operandBuilder.build();
		}
	}

	private void fattore() throws IOException {
		simbolo = analizzatoreLessicale.prossimoSimbolo();
		if (simbolo.equals(Simbolo.VALUE)) {
			OperandoBuilder valueBuilder = new OperandoBuilderImpl();
			valueBuilder.setValue(analizzatoreLessicale.getString());
			root = valueBuilder.build();
			simbolo = analizzatoreLessicale.prossimoSimbolo();
		} else if (simbolo.equals(Simbolo.TONDA_APERTA)) {
			espressione();
			simbolo = analizzatoreLessicale.prossimoSimbolo(); // salta ")"
		} else {
			throw new IllegalArgumentException();
		}
	}
}