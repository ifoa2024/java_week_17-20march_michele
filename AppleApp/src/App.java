import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
    List<Apple> apples = List.of(
        new Apple(Color.RED, 150),
        new Apple(Color.GREEN, 120),
        new Apple(Color.RED, 130),
        new Apple(Color.RED, 500)
        );
        ApplePredicateInterface greenApples = (Apple a) -> a.getColor().equals(Color.GREEN);
        ApplePredicateInterface redApples = (Apple a) -> a.getColor().equals(Color.GREEN);
        ApplePredicateInterface lightApples = (Apple a) -> a.getWeight() <= 150;
        ApplePredicateInterface heavyApples = (Apple a) -> a.getWeight() > 150;

        for(Apple apple : redApples){
            System.out.println(apple.getColor());
            }
            for(Apple apple : greenApples){
             System.out.println(apple.getColor());
             }
            for(Apple apple : lightApples){
            System.out.println(apple.getWeight());
             }
    for(Apple apple : heavyApples){
        System.out.println(apple.getWeight());
    }
    }

    
    
    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        
        
        for (Apple apple  : apples) {
            if (predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    
    public static List<Apple> PrintApplesList(){

    }
    
}

   

