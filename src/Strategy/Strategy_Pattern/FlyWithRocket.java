package Strategy.Strategy_Pattern;

public class FlyWithRocket implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with rockets.");
    }
}
