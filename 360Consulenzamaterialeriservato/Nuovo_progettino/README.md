Extract, incapsulate, abstract:
principio della oop
keyword new chiama un nuovo costruttore.
la keyword this nel costruttore viene usata per inizializzare i parametri nella funzione construct

overload per il costruttore

memoria divisa in due parti:
stack->contiene tutto cio che non è un oggetto, quindi variabili, dichiarazioni di funzioni

heap->(lo heap) contiene solo gli oggetti 

![alt text](image-1.png)

cosa fa l'uguale? crea un rifermiento tra la ancora variabile person e oggetto      

side effect: avviene quando cambio lo stato di qualsiasi entità dall'esterno dell'entità stessa. 

equals metodo ereditato dal padre Object. Ha il comportamento di default di "=="

@override ->
si definisce annotation, che non è codice eseguibile, ma solamente una direttiva per il compilatore.

Override->
sovrascrive un comportamento di default

private, public, protected, package
sono modificatori di accesso
-public -> accesso in lettura e scrittura in qualsiasi parte del codice
-private -> accesso in lettura e scrittura solo nella class in cui vengono definiti, non vengono ereditati.
-protected -> uguale a private, ma vengono ereditati.
-package -> accessibilità di default di java, sono visibili all'interno del package, ovvero il folder in cui sono presenti tutti i file. 

-------------------


i figli vedono il content del padre, ma il padre non vede i figli. le classi sorelle non vednon i rispettivi metodi

rendendo astratta una classe, è necessario fare in modo che i metodi delle classi figlie abbiano sempre lo stesso nome di quelli della classe padre.

un metodo o classe polimorfo si comportano nello stesso modo a prescindere dal tipo di dato passato. 
pro:
-flessibilità -> aggiungere implementazioni senza dover riapplicare tutto;
-manutenibilità -> codice facilmente manutenibile;
-riutilizzabilità -> utilizzare implementazioni già esistenti.

dependency injection
un oggetto dipende dalla creazione di altri oggetti e non puo esistere se gli oggetti di cui è composto non esistono.


INTERFACCE
le interfacce non sono classi e ci danno la possibilità di accorpare funzioni a classi. 
Posseggono le firme dei metodi che descrivono il nome di un metodo, cosa restituisce e i parametri di cui ha bisogno per funzionare. void attack() ad esempio;
best practice: creare prima interfacce e poi metodi.
in java si puo estendere una sola classe ma implementare piu interfacce.

metodi e attributi statici:
-non dipendono assolutamente dall'esistenza dell'oggetto di una classe specifica ma vengono chiamati direttamente tramite le stessa classe.

hash -> in programma deve capire come gestire i dati e i duplicati, quindi bloccare in caso in cui si inseriscono dati pubblicati.
Si basa su equals e hashCode
equals vede se due oggetti sono uguali, controllando le locazioni di memoria;
hashCode invece fa un operazione su un dato restituendo un numero che indica la cella della tabella dove deve finire il dato. se gli hash del dato sono uguali, avviene una collisione e capisce che sono uguali.


compareTo viene usato per vedere a livello lessicografico se un numero è piu grande di un altro, restituisce 0 se i numeri sono uguali, 1 se il secondo è piu grande del primo o -1 se il primo e piu grande del primo

una classe generica può usare diversi tipi e non uno preimpostato

con le generics saliamo ancora di piu di astrazione.

---------------------------------------

Cosa rende java uno dei linguaggi piu usati al modo?
-il fatto che grazie alla jvm puo essere eseguito ovunque

typesystem java
-fortemente tipizzato e statico

in java tutto è un oggetto, anche stringhe e array
-stringa:concatenazione di caratteri

object oriented
-facilita il principio del don't repeat yourself

ereditarietà:
-la figlia eredita con exteds ClassePadre

polimorfismo:
-capacità di far comportare la classe in modi diversi con overloader e overriding

una classe astratta
-una classe non istanziata che viene utilizzata da altre classi. si tratta di una classe molto generica che contiene metodi astratti e concreti. 

Programmazione funzionale:
-non è il programmatore e definire i passaggi logici dell'algoritmo
-si basa principalmente sul concetto di funzioni pure
-si basa sull lambda function
-esempi: 
-lambda con type inference
num->num * 2;
-lambda no type inference
(int num) -> num * 2
-(parameter 1, parameter 2) -> {code} return something

-STREAM
in java, non possiamo agire direttamente sulla lista (programamzione funzionale), dobbiamo aprire un flusso.
Il flusso è come un nastro trasportatore, parto da una cosa

funzioni:
-pure -> utilizzano il dato senza modificarne lo stato
-impure -> cambiano lo stato di un qualsiasi dato


