package Breaking_Singleton;

import java.lang.reflect.Constructor;

public class Reflection_Singleton {
    private static final Reflection_Singleton instance = new Reflection_Singleton();
    private Reflection_Singleton(){
        if(instance!=null){
            throw new RuntimeException("use getInstance() method to create");
        }
    }
    public static Reflection_Singleton getInstance(){
        return instance;
    }


    public static void main(String[] args) throws Exception{
        Reflection_Singleton instance1 = Reflection_Singleton.getInstance();
        System.out.println(instance1.hashCode());

        Constructor<Reflection_Singleton> constructor = Reflection_Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            Reflection_Singleton instance2 = constructor.newInstance();
            System.out.println(instance2.hashCode());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

