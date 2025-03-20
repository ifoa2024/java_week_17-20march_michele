public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Dish pizza = new Dish("pizza", 561, {"dough", "tomato sauce", "cheese", "pepperoni"});
        System.out.println(pizza);

        Drink coke = new Drink("coca cola", 3);
        System.out.println(coke);
    }
}


