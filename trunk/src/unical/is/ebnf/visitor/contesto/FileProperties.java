/**
 * 
 */
package unical.is.ebnf.visitor.contesto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Marilena Paldino
 */
public class FileProperties {

	Properties properties;

	public String leggiValore(String variabile) {
		if (properties == null) {
			leggiFileProperties();
		}

		return properties.getProperty(variabile, "0");
	}

	private void leggiFileProperties() {
		properties = new Properties();

		try {

			// TODO da dove prendere il file??
			properties.load(FileProperties.class.getClassLoader().getResourceAsStream("contesto.properties"));
			properties.load(new FileInputStream("contesto.properties"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
