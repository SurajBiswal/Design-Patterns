package Factory_Pattern_Color;

public class Shape_factory {
    public static Shape create(String shape){

        if(shape==null){
            return null;
        }
        String s = shape.toUpperCase();

        switch (s){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                System.out.println("invalid shape "+ s);
                return null;
        }
    }
}
