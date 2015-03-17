Espressione aritmetica intera con contesto

È assegnata la seguente grammatica EBNF di un “linguaggetto” per espressioni aritmetiche intere, in presenza delle usuali regole di precedenza degli operatori.

```
<espressione>::=<termine>{<addop><termine>}
<termine>::=<fattore>{<mulop><fattore>}
<fattore>::=<costante>|<variabile>|(<espressione>)
<costante>::=<interosenzasegno>
<variabile>::=<identificatore>
<interosenzasegno>::=<cifra>{<cifra>}
<identificatore>::=<lettera>{<lettera>|<cifra>}
<cifra>::=0|…|9
<lettera>::=a|…|z|A|…|Z
<addop>::=+|-
<mulop>::=*|/
```

Si devono utilizzare i pattern Composite, Builder (a discesa ricorsiva) e Visitor. Detta Espressione la classe base del composite, occorre prevedere almeno i seguenti visitor (con riportati i corrispettivi metodi d'innesco):

  1. per la valutazione dell’espressione: **int valuta( Espression e, Contesto c );**
  1. per la sostituzione di una variabile con un’assegnata espressione: **Espressione rimpiazza( Espressione e, Variabile v, Espressione target );**
  1. per la copia dell’espressione: **Espressione copia( Espressione e ).**

Il metodo di innesco del visitor è responsabile di far partire il processo sull’espressione e ricevuta parametricamente.
Il metodo **valuta(…)** calcola il valore dell’albero composita risolvendo le variabili nel contesto c. Il valore dell’espressione è quindi ritornato. Il contesto mantiene coppie **<nome\_variabile,valore>** in cui il nome di una variabile è associato al suo valore. Una variabile non presente nel contesto si valuta a 0. Il contenuto di un oggetto contesto deve basarsi su un file di proprietà di nome **contesto.properties**, da preparare con un comune editor e rendere disponibile in una directory del file system.

Il metodo **rimpiazza(…)** costruisce una copia dell’espressione e nella quale la variabile indicata da **v** è rimpiazzata dall’espressione **target** fornita parametricamente.

Il metodo **copia(…)** restituisce una copia dell’espressione **e**.

Altri visitor devono consentire la stampa in formato **infisso** e **postfisso** dell’espressione.

**Testare le classi ottenute con JUnit**.