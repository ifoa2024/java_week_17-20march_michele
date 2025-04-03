import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) throws Exception {
        List<Person> people = new ArrayList<Person>(
            List.of(
                new Person ("qwerty", Gender.MALE),
                new Person ("fghr", Gender.MALE),
                new Person ("giovanna", Gender.FEMALE)
                )
            );

            //approccio imperativo
            List<Person> females = new ArrayList<>();

            for(Person person : people) {
                if(Gender.FEMALE.equals(person.gender)) {
                    females.add(person);
                }
            }

            for (Person person : females) {
                System.out.print(person.name + "\n");
            }

            for (Person person: people){
                System.out.println("dopo la filter:" + "\n" + person.name);
            }

            //approccio funzionale e dichiarativo

            List<Person> males = people.stream().filter(person->person.gender.equals(Gender.MALE)).toList();

            for (Person person : males) {
                System.out.print("\n" + "maschi:" + person.name);
            }

            List<Integer> numbers = new ArrayList<>(
                List.of(
                    2,5,7,8,9,0,12
                )
            );

            Integer sum = numbers.stream().filter(number->number % 2 == 0).map(number->number*number).reduce(0, Integer::sum);

            System.out.print("\n" + "somma dei quadrati dei numeri pari:" + sum);

            //possiamo assegnare le lambda ad una variabile
            Predicate<Integer> check = (Integer num) -> num % 2 == 0;

            //posso poi assegnare questa variabile ad una funzione
            List<Integer> evenNumbers = numbers.stream().filter(check).collect(Collectors.toList());

            System.out.print("\n" + "numeri pari:" + evenNumbers.size());
        }
    
    }




