package Singleton;

public class Lazy_ThreadSafe_Slower {
    private static Lazy_ThreadSafe_Slower instance;
    private Lazy_ThreadSafe_Slower(){};

    public static synchronized Lazy_ThreadSafe_Slower getInstance() {
        if(instance==null){
            instance = new Lazy_ThreadSafe_Slower();
        }
        return instance;
    }
}
