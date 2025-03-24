package Singleton;

public class Singleton_Lazy {
    private static Singleton_Lazy instance; //instance not created initially

    private Singleton_Lazy(){}  //private constructor to prevent instantiation

    public static Singleton_Lazy getInstance() {
        if(instance==null){               //create insstance when needed
            instance = new Singleton_Lazy();
        }
        return instance;
    }
}


