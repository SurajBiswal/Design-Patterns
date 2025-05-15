package Strategy.Strategy_Pattern;

public class SilentQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silent.");
    }
}
