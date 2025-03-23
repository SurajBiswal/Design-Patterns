package Singleton;

public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1(); // Instance created at class loading

    private Singleton1() {} // Private constructor prevents instantiation

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

}
