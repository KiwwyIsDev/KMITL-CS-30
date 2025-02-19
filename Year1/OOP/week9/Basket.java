import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<LineItem> items = new ArrayList<>();

    public void putInBasket(LineItem line) {
        items.add(line);
    }

    public void showItemsInBasket() {
        for (LineItem item : items) {
            System.out.println(item.getProduct().getName() + " x" + item.getQuantity() + " @=" + item.calculateAmount());
        }
    }

    public void printInvoice() {
        showItemsInBasket();
        System.out.println("Total: " + getTotal());
    }

    public void loopLineItem() {
        for (LineItem item : items) {
            System.out.println("Processing item: " + item.getProduct().getName());
        }
    }

    private int getTotal() {
        int total = 0;
        for (LineItem item : items) {
            total += item.calculateAmount();
        }
        return total;
    }
}
