METODI  DEL FRAMEWORK COLLECTION
add:
- public boolean add(Object o);
- aggiunge un elemento ad una collezione

add all:
- public boolean addAll(Collection c);
- aggiunge un'intera collezione, quindi vuole un insieme di dati. 

cler:
- public void clear();
- clear non restituisce niente, l'unica cosa che fa è pulire la collezione.

contains:
- public boolean contains(Object o);
- verifica se un determinato oggetto appartiene ad una collezione.

contains all:
- public boolean containsAll(Collection c);
- controlla se un'intera collezione è presente in un'altra collezione.

isempty:
- public boolean isEmpty();
- verifica se una collezione è vuota. 

remove:
- public boolean remove(Object o);
- rimuove un determinato oggetto da una collezione;

remove all:
- public boolean removeAll(Collection c);
- elimina un gruppo di oggetti da una collezione.

size:
- public int size(Object o);
- restituisce la dimensione della collezione.

toArray:
- public Object[] toArray();
- trasforma una collection in un array;


interfaccia LIST:
- è una collezione che segue le regole di una lista. 
- è una interfaccia che possiede tutti i metodi necessari 
- esistono due tipologie:
  - ARRAYLIST -> segue tutte le regole degli array, possiede quindi indici per caratterizzare gli elementi e tutti  gli elementi sono di un tipo specifico, non è a dimensione fissa, molto veloce in lettura ma meno in scrittura poichè avendo tutti i dati memorizzati in locazioni contigue se aggiungo elementi dovrò effettuare ogni volta un copia e incolla dell'intero array. é veloce in lettura perchè possiede gli indici e i dati sono in locazioni di memoria contigue;
  - LINKEDLIST -> contrario di arraylist


Linked List:
- addFirst() -> aggiunge un elemento in testa;
- addLast() -> aggiunge un elemento in coda;
- removeFirst() -> rimuove elemento in testa;
- removeLast() -> rimuove elemento in coda;
- getFirst() -> restituisce l'elemento in testa;
- getLast() -> restituisce l'elemento in coda;


Confronto di uguaglianza di set
- utilizza sia equals che hashcode come metodi per il confronto
- vero -> equals true, hashcode 0;
- falso -> equals true, hashcode valore negativo;
- falso -> equals true, hashcode valore positivo;
- falso -> equals false, hashcode 0;
- falso -> equals false, hashcode negativo;
- falso -> equals false, hashcode positivo;

di set esistono due implementazioni specifiche:
- HashSet molto veloce in scrittura, utilizza la tabella di hashing per evitare collisioni di scrittura;
- TreeSet molto veloce il lettura, ragiona seguendo una struttura ad albero. Di conseguenxs è piu veloce in lettura(ricerca); 
- DIFFERENZE: il treeSet usa un comparator per decidere se due oggetti sono uguali mentre l'hash si basa su equals e hashcode;


la map su java organizza i dati utilizzando quelli nei bucket:
- put (k key, v value);
- inserisce un nuovo dato;

- get(Object key);
- recupera il valore in base alla key;

- containsKey(Object key);
- considera l'oggetto con una determinata chiave. dato che la chiave è univoca, nelle map la chiave è fondamentale, perchè deve essere univoca. 

- clear():
- rimuove tutti gli elementi

- keySet();
- restituisce l'insieme di tutte le chiavi;

- values();
- restituisce una collezione di tutti i valori;

anche map ha le implementazioni del set (hashTree , treeMap)