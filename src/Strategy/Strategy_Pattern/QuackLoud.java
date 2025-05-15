package Strategy.Strategy_Pattern;

public class QuackLoud implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" Quack Loud.");
    }
}
