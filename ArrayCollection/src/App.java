import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pointer3d p1 = new Pointer3d(1, 2, 7);

        // System.out.println(p1);

        Set<Pointer3d> points = Set.of(
            new Pointer3d(2, 4, 123),
            new Pointer3d(213, 231, 3213),
            new Pointer3d(43, 43, 34),
            new Pointer3d(4, 5, 70),
            new Pointer3d(1, 5, 8)
        );

        for (Pointer3d pointer3d: points){
            System.out.println(pointer3d);
        }

        Set<Pointer3d> hashSet =  new HashSet<>();

        Set<Pointer3d> treeSet = new TreeSet<>();

        class Pointer3DComparator implements Comparator<Pointer3d>{
            @Override
            public int compare(Pointer3d o1, Pointer3d o2) {
                return (o1.x + o1.y + o1.z) - (o2.x + o2.y + o2.z);
            }

            Set<Pointer3d> points = new TreeSet<>(new Pointer3DComparator());

            points.add(new Pointer3d(2,5,3));
            points.add(new Pointer3d(2,4,3));
            points.add(new Pointer3d(2,6,3));

            System.out.println(points);
        }
    }
}





        
        
        
        
