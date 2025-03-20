public class Person {
    //attributi o proprietà(fields) -> attributi di classe
    //costruttore
    //metodi
    //la classe è la descrizione di come deve essere costituito un oggetto
    //l'oggetto è l'istanza della classe
    //il metodo è una funzione che fa qualcosa
    //java ha un costruttore di default
    // nome del costruttore scritto esattamente come nome della classe, riceve parametri formali
    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    public void sayHello(){
        System.out.println("Ciao, sono "+name+" "+surname+" e ho "+age+" anni");
    }
}








    
    
    
    
