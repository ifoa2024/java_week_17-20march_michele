import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la tipologia: ");
        String input = scanner.nextLine();
        scanner.close();
        Animal lion = new Animal("Lion", "Mammal", "Savannah");
        Animal cat = new Animal("Cat", "Mammal", "House");
        Animal bird = new Animal("Bird", "Bird", "Sky");
        Animal tiger = new Animal("Tiger", "Mammal", "Jungle");     
        Animal dog = new Animal("Dog", "Mammal", "House");

        List<Animal> zoo = new ArrayList<>(List.of(lion, cat, bird, tiger, dog));

        List<Animal> zooFilter = new ArrayList<>();

        //todo scanner che restituisce la specie

         for (Animal animal : zoo){
            if (animal.typology.equalsIgnoreCase(input)){
                zooFilter.add(animal);
                System.out.println(animal);
            }
         }
         
         for (Animal animal : zooFilter){
            animal.printAnimal();
         }
    }
}
