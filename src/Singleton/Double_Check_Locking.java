package Singleton;

public class Double_Check_Locking {
    private static volatile Double_Check_Locking instance;
    private Double_Check_Locking(){};

    public static Double_Check_Locking getInstance() {
        if(instance==null){
            synchronized (Double_Check_Locking.class){
                if (instance==null){
                    instance = new Double_Check_Locking();
                }
            }
        }
        return instance;
    }
}
