/**
 * 
 */
package unical.is.ebnf.visitor.valuta;

import java.util.Properties;

/**
 * @author Marilena Paldino
 */
public class PropertiesContesto implements Contesto {

	/**
	 * Istanza concreta della classe Properties
	 */
	private final Properties properties;

	/**
	 * @param properties
	 */
	public PropertiesContesto(Properties properties) {
		this.properties = properties;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getValore(String variabile) {
		return Double.parseDouble(properties.getProperty(variabile, "0"));
	}
}
