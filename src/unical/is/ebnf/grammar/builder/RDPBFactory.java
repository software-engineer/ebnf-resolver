package unical.is.ebnf.grammar.builder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import unical.is.ebnf.grammar.Espressione;
import unical.is.ebnf.parser.AnalizzatoreLessicale;

/**
 * @author Marilena Paldino
 */
public class RDPBFactory {

	public static Espressione parse(String espressione) throws IOException {
		InputStream inputStream = new ByteArrayInputStream(espressione.getBytes());
		return parse(inputStream);
	}

	public static Espressione parse(InputStream inputStream) throws IOException {
		Espressione espressione = null;

		AnalizzatoreLessicale analizzatoreLessicale = new AnalizzatoreLessicale(inputStream);
		RDPB rdpb = new RDPB(analizzatoreLessicale);

		espressione = rdpb.build();

		return espressione;
	}
}
