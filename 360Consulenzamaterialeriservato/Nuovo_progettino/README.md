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



