package Strategy.Strategy_Pattern;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehaviour = new NoFly();
        quackBehavior = new SilentQuack();
    }
    @Override
    void display() {
        System.out.println("displaying RubberDuck");
    }
}
