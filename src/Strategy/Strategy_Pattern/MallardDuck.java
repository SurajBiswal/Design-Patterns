package Strategy.Strategy_Pattern;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehavior = new QuackLoud();
    }
    @Override
    void display() {
        System.out.println("displaying MallardDuck");
    }
}
