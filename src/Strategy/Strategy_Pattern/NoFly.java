package Strategy.Strategy_Pattern;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("No fly !");
    }
}
