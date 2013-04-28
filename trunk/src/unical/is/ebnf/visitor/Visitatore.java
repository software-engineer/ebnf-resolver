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

	void visita(Costante costante);

	void visita(Variabile variabile);

	void visita(Divisione divisione);

	void visita(Moltiplicazione moltiplicazione);

	void visita(Somma somma);

	void visita(Sottrazione sottrazione);

}
