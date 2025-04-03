public class AppleWightPredicate implements ApplePredicateInterface {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
