/**
 * 
 */
package unical.is.ebnf.visitor.contesto;

/**
 * @author Marilena Paldino
 */
public class PropertiesContesto implements Contesto {

	FileProperties fileProperties = new FileProperties();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getValore(String variabile) {
		return Double.parseDouble(fileProperties.leggiValore(variabile));
	}
}
