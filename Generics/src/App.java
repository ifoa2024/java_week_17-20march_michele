public class App {
    public static void main(String[] args) throws Exception {
        
        GenericClass<String> generico = new GenericClass<String>("molto più generico");
        System.out.println(generico.getData());

        GenericClass<Integer> generico2 = new GenericClass<Integer>(10);
        System.out.println(generico2.getData());

        GenClass generico3 = new GenClass();
        generico3.<String, Integer, Float>printGeneric("ancora più generico", 10, 10.5f);
    }
}
