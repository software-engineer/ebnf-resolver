/**
 * 
 */
package unical.is.ebnf.visitor.contesto;

/**
 * @author Marilena Paldino
 */
public class PropertiesContesto implements Contesto {

	/**
	 * Istanza concreta della classe fileProperties
	 */
	FileProperties	fileProperties	= new FileProperties();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getValore(String variabile) {
		return Double.parseDouble(fileProperties.leggiProprieta(variabile));
	}
}
