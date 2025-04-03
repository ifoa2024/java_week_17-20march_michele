import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        
       Map<RubricaKey, Person> peopleMap = new TreeMap<RubricaKey, Person>(new RubricaKeyComparable());

       Person person1 = new Person("Luigi", "Verdi", 30);
       RubricaKey key1 = new RubricaKey("MRORSS30A01H501");
       peopleMap.put(key1, person1);

       Person person2 = new Person("Luigi", "Verdi", 25);
       RubricaKey key2 = new RubricaKey("MRORGS30A01H501");
       peopleMap.put(key2, person2);

       for(RubricaKey key : peopleMap.keySet()) {
        System.out.println("Nome: " + peopleMap.get(key).name + " Cognome: " + peopleMap.get(key).surname + " Età: " + peopleMap.get(key).age + " CF: " + key.cf);   
    }
 }
}

       

