package categories.behavioral.Command;

/**
 * Stock class acts as a request
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] sold");
    }
}
