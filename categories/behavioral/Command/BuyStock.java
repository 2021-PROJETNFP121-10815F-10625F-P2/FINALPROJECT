package categories.behavioral.Command;

/**
 * BuyStock implementing Order interface which will do actual command processing.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
