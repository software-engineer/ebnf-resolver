/**
 * 
 */
package unical.is.ebnf.grammar.constant;

/**
 * @author Marilena Paldino
 * 
 */
public interface ConstantBuilder {

	ConstantBuilder setConstantValue(String value);

	Constant build();
}
