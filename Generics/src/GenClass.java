public class GenClass {
    public <T, k, s> void printGeneric(T  data, k data2, s data3) {
        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);
    }

    public <T, K> K print(T  t) {
        return (K)t;
    }
}
