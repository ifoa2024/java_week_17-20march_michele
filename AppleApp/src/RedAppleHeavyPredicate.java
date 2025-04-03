public class RedAppleHeavyPredicate implements ApplePredicateInterface {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor() == Color.RED && apple.getWeight() > 150;
    }
}
