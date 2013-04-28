package unical.is.ebnf.visitor;

import unical.is.ebnf.grammar.operando.Costante;
import unical.is.ebnf.grammar.operando.Variabile;
import unical.is.ebnf.grammar.operatore.Divisione;
import unical.is.ebnf.grammar.operatore.Moltiplicazione;
import unical.is.ebnf.grammar.operatore.Somma;
import unical.is.ebnf.grammar.operatore.Sottrazione;

/**
 * @author Marilena Paldino
 * 
 */
public interface Visitatore {

	public void visita(Costante costante);

	public void visita(Variabile variabile);

	public void visita(Divisione divisione);

	public void visita(Moltiplicazione moltiplicazione);

	public void visita(Somma somma);

	public void visita(Sottrazione sottrazione);

}
