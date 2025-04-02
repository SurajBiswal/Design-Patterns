package Abstract_Factory_Pattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        String s = color.toUpperCase();
        switch (s){
            case "RED":
                return new Red();
            case "BLUE":
                return new Blue();
            default:
                System.out.println("invalid color");
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
