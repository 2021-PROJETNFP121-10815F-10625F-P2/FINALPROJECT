package categories.behavioral.Command;

/**
 * SellStock implementing Order interface which will do actual command processing.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
