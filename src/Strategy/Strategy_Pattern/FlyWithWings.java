package Strategy.Strategy_Pattern;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Can fly with wings.");
    }
}
