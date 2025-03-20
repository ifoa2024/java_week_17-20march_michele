public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Person persona1 = new Person("mike", null, 0);
        persona1.name = "Mario";
        persona1.surname = "Rossi";
        persona1.age = 30;

        persona1.sayHello();
        System.err.println(persona1);

        Person persona2 = new Person("Luca", "Bianchi", 25);
        persona2.sayHello();

        System.out.println(persona1.equals(persona2));
        
    }
    
    public static void Person(Person persona){}
}
    
    
    
