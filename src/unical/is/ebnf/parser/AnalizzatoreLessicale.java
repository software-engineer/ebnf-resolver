package unical.is.ebnf.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;

/**
 * @author Marilena Paldino
 */
public class AnalizzatoreLessicale {

	private final StreamTokenizer input;
	private Simbolo simbolo;

	public AnalizzatoreLessicale(InputStream in) {
		Reader reader = new BufferedReader(new InputStreamReader(in));
		input = new StreamTokenizer(reader);
		input.resetSyntax();
		input.eolIsSignificant(false);
		input.wordChars('a', 'z');
		input.wordChars('A', 'Z');
		input.wordChars('0', '9');
		input.whitespaceChars('\u0000', ' ');
		input.ordinaryChar('(');
		input.ordinaryChar(')');
		input.ordinaryChar('+');
		input.ordinaryChar('-');
		input.ordinaryChar('*');
		input.ordinaryChar('/');
	}

	public String getString() {
		return input.sval;
	}

	public Simbolo prossimoSimbolo() {
		try {
			switch (input.nextToken()) {
			case StreamTokenizer.TT_EOF:
				simbolo = Simbolo.EOF;
				break;
			case StreamTokenizer.TT_WORD:
				simbolo = Simbolo.VALUE;
				break;
			case '(':
				simbolo = Simbolo.TONDA_APERTA;
				break;
			case ')':
				simbolo = Simbolo.TONDA_CHIUSA;
				break;
			case '+':
				simbolo = Simbolo.SUM;
				break;
			case '-':
				simbolo = Simbolo.DIF;
				break;
			case '*':
				simbolo = Simbolo.MUL;
				break;
			case '/':
				simbolo = Simbolo.DIV;
				break;
			default:
				simbolo = Simbolo.CHAR_INVALIDO;
			}
		} catch (IOException e) {
			simbolo = Simbolo.EOF;
		}

		return simbolo;
	}
}