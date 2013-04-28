package unical.is.ebnf.grammar.builder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import unical.is.ebnf.grammar.Espressione;

/**
 * @author Marilena Paldino
 * 
 */
public class RDPBFactory {

	public static Espressione parse(String espressione) {
		InputStream inputStream = new ByteArrayInputStream(espressione.getBytes());
		return parse(inputStream);
	}

	public static Espressione parse(InputStream espressione) {
		return null;
	}
}
