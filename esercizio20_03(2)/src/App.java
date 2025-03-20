import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
       
        List<Person> users = new ArrayList<>(List.of(
        new Person("mike", "fort", 99),
        new Person("john", "doe", 22),
        new Person("katrine", "doe", 33),
        new Person("alessio", "donacci", 33)
        ));

        System.out.println("Ecco la lista degli utenti: ");
        for (Person person : users) {
            person.printPerson();
        }

        System.out.print("inserisci il nome della persona che vuoi modificare: ");
        String name = scanner.nextLine();

        Person personToModify = null;

        for(Person person : users) {
            if(person.name.equalsIgnoreCase(name)){
                personToModify = person;
                break;
            }
        }

        if (personToModify != null) {
            System.out.print("inserisci il nuovo nome, lascia invariato per non modificarlo ");
            String newName = scanner.nextLine();
            if(!newName.isEmpty()){
                personToModify.name = newName;
            }

            System.out.print("Inserisci anche il nuovo cognome, lascia invariato se non vuoi modificarlo ");
            String newSurname = scanner.nextLine();
            if (!newSurname.isEmpty()) {
                personToModify.surname = newSurname;
            }

            System.out.print("Inserisci la nuova età, altrimenti lascia vuoto: ");
            int newAge = scanner.nextInt();
            if (newAge != -1) {
                personToModify.age = newAge;
            }
            System.out.println("Dati aggiornati con successo!");
        } else {
            System.out.println("Spiacenti, ma non è stata trovata nessuna corrispondenza per l'utente con nome:" + personToModify.name + "con cognome: " + personToModify.surname + "e età: " + personToModify.age);
        }

        scanner.close();
        System.out.println("Ecco la lista degli utenti aggiornata!" + "\n" + "***********************");
        for (Person person : users) {
            person.printPerson();
        }
    }
}

       




        

