package Singleton;

public class Main {
    public static void main(String[] args) {
        //Eager Initialization - singleton pattern
//        Singleton_Eager s1 = Singleton_Eager.getInstance();
//        Singleton_Eager s2 = Singleton_Eager.getInstance();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);

//  --------------------------------------------------------------------------------------------------------------------------------------

        //Lazy Initialization - singleton pattern

        //not - using thread
//        Singleton_Lazy s1 = Singleton_Lazy.getInstance();
//        Singleton_Lazy s2 = Singleton_Lazy.getInstance();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2); // true
//        //But in case of mutiple thread it will fail and multiple instace will be created

////        Use Thread now
////        Here, you are initializing Thread objects and passing a lambda expression as the Runnable task, which calls Singleton.getInstance().
////          Means- Created thread -> inside it create a Lambda expression -> call getInstance inside it
//
//        Thread thread1 = new Thread(()->{
//        System.out.println(Singleton_Lazy.getInstance());
//        });
//        Thread thread2 = new Thread(()->{
//        System.out.println(Singleton_Lazy.getInstance());
//        });
//        thread1.start();
//        thread2.start();

//-----------------------------------------------------------------------------------------------------------------------------


        //Fixing Thread Safety Issues in Lazy Initialization
        //Synchronized Method (Thread-Safe but Slower)

//        Thread thread1 = new Thread(()->{
//        System.out.println(Lazy_ThreadSafe_Slower.getInstance());
//        });
//        Thread thread2 = new Thread(()->{
//        System.out.println(Lazy_ThreadSafe_Slower.getInstance());
//        });
//        thread1.start();
//        thread2.start();

//---------------------------------------------------------------------------------------------------------------------------------------------

        //Fixing Thread Safety Issues in Lazy Initialization
        //Double-Checked Locking (Best Performance)

        Thread thread1 = new Thread(()->{
            System.out.println(Double_Check_Locking.getInstance());
        });
        Thread thread2 = new Thread(()->{
            System.out.println(Double_Check_Locking.getInstance());
        });
        thread1.start();
        thread2.start();

    }
}

