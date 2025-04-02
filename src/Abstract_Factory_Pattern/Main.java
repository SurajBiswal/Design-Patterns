package Abstract_Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = abstractFactory.getShape("CIRCLE");
        String ans = circle.draw();
        System.out.println(ans);
    }
}
