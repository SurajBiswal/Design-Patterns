package Abstract_Factory_Pattern;

public abstract class AbstractFactory {
    //Defines methods for creating objects

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
