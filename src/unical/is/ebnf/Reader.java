/**
 * 
 */
package unical.is.ebnf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Marilena Paldino
 * 
 */
public class Reader {

	private static final String		EOS	= "-1";

	private final BufferedReader	bufferedReader;
	private final String			line;
	private int						index;

	public Reader() throws IOException {
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		line = bufferedReader.readLine();
		index = 0;
	}

	public String getNextChar() {
		StringBuffer buffer = new StringBuffer();

		if (line != null && index < line.length()) {
			while (index < line.length() && line.charAt(index) == ' ') {
				index++;
			}
			while (index < line.length() && (isAlfaNumeric("" + line.charAt(index)) || buffer.length() == 0)) {
				buffer.append(line.charAt(index));

				if (!isAlfaNumeric("" + line.charAt(index))) {
					break;
				}
			}
		}

		if (buffer.length() == 0) {
			buffer.append(EOS);
		}

		return buffer.toString();
	}

	/**
	 * @param charAt
	 * @return
	 */
	private boolean isAlfaNumeric(String text) {
		Pattern pattern = Pattern.compile("\\w");
		Matcher matcher = pattern.matcher(text);

		return matcher.matches();
	}
}
