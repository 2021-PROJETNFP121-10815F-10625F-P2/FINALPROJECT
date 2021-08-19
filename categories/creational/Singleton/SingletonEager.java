package categories.creational.Singleton;

/**
 * the object of SingletonEager should be created in advance and should be ready to use.
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();
    public static int counter;

    private SingletonEager() {
        System.out.println("SingletonEager ==> in the constructor"); // this will print first
        counter++;
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
    
    public void print() {
        System.out.println("SingletonEager ==> hello from eager");
    }
    
    public static void main(String[] args) {
        System.out.println("SingletonEager ==> main method start");
        
        SingletonEager.getInstance().print();;
        
        System.out.println("SingletonEager ==> main end");
    }

}