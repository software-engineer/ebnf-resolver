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

	/**
	 * Properties recuperate dal file di contesto
	 */
	Properties	properties;

	/**
	 * Valore della proprieta con nome nomeProprieta
	 * 
	 * @param nomeProprieta nome della proprieta della quale recuperare il valore
	 * @return il valore della proprieta con nome nomeProprieta, 0 nel caso in cui la proprieta con tale nome non è presente nella struttura
	 */
	public String leggiProprieta(String nomeProprieta) {
		if (properties == null) {
			leggiFileProperties();
		}

		return properties.getProperty(nomeProprieta, "0");
	}

	/**
	 * Lettura del file di properties
	 */
	private void leggiFileProperties() {
		properties = new Properties();

		try {

			// TODO da dove prendere il file??
			// properties.load(FileProperties.class.getClassLoader().getResourceAsStream("contesto.properties"));
			properties.load(new FileInputStream("contesto.properties"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
