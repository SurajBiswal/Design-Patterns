package Strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("*******************************");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("*******************************");
        Duck rocket = new RocketDuck();
        rocket.display();
        rocket.performFly();
        rocket.performQuack();

        System.out.println("rocket after modification______________________________________");
        rocket.setPerformFly(new NoFly());
        rocket.setQuackBehavior(new SilentQuack());
        rocket.performFly();
        rocket.performQuack();
    }
}
