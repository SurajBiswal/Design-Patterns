package Strategy.Strategy_Pattern;

public class RocketDuck extends Duck{
    public RocketDuck(){
        flyBehaviour = new FlyWithRocket();
        quackBehavior = new QuackLoud();
    }
    @Override
    void display() {
        System.out.println("displaying RocketDuck.");
    }
}
