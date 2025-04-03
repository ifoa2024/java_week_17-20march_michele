import java.util.Comparator;   

public class RubricaKeyComparable implements Comparator<RubricaKey>  {
    public int compare(RubricaKey key1, RubricaKey key2) {
        // Compare the two keys based on their cf values
        return key1.cf.compareTo(key2.cf);
    }
}
