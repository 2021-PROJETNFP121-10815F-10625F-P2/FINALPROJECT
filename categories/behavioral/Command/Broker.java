package categories.behavioral.Command;

/**
 * A class Broker acts as an invoker object to take and place orders..
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }

        orderList.clear();
    }
}
