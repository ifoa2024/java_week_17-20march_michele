import java.awt.Color;

public class GreenAppleColorPredicate implements ApplePredicateInterface {
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
