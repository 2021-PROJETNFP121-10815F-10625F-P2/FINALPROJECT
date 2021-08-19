package categories.creational.Singleton;

/**
 * SingletonLazy  will only get instantiated when someone invoke the getInstance() method.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SingletonLazy {

    private static SingletonLazy instance = null;
    public static int counter;

    private SingletonLazy() {
        System.out.println("SingletonLazy ==> in the constructor");
        counter++;
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            // synchronized block to remove overhead
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    // if instance is null, initialize
                    instance = new SingletonLazy();
                }

            }
        }
        return instance;
    }
    
    public void print() {
        System.out.println("SingletonLazy ==> hello from lazy");
    }
    
    public static void main(String[] args) {
        System.out.println("SingletonLazy ==> main method start");
        
        SingletonLazy.getInstance().print();
        
        System.out.println("SingletonLazy ==> main end");
    }

}