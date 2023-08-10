package LamdaTask;

public class AppleHavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWight()>200;
    }
}
