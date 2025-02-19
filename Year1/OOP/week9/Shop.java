import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private Catalog catalog;
    private List<Basket> ordersToday = new ArrayList<>();

    public Shop(String name, Catalog catalog) {
        this.name = name;
        this.catalog = catalog;
    }

    public Shop(String name) {
        this.name = name;
        this.catalog = new Catalog();

        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        showCatalog();
    }

    public void showCatalog() {
        catalog.showCatalog();
    }

    public Product getProduct(String productName) {
        return catalog.retrieveProduct(productName);
    }

    public int getPrice(String productName) {
        return catalog.retrievePrice(productName);
    }

    public Basket newCustomerArrives() {
        return new Basket();
    }

    public void checkOut(Basket b) {
        System.out.println("Checking out...");
        b.printInvoice();
        ordersToday.add(b);
    }

    public void checkOut(Basket b, String pName) {
        System.out.println("Buying now: " + pName);
    }

    public void dailySalesReport() {
        System.out.println("Daily Sales Report:");
        for (Basket b : ordersToday) {
            b.printInvoice();
        }
    }
}
