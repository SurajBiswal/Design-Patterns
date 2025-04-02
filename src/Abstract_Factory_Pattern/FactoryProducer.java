package Abstract_Factory_Pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice==null)return null;
        String s = choice.toUpperCase();
        switch(s){
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                return null;
        }
    }
}
