import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Product> productList = new HashMap<>();
    private Map<String, Integer> priceList = new HashMap<>();

    public void addItem(Product item, int price) {
        productList.put(item.getName(), item);
        priceList.put(item.getName(), price);
    }

    public Product retrieveProduct(String pName) {
        return productList.get(pName);
    }

    public int retrievePrice(String pName) {
        return priceList.getOrDefault(pName, 0);
    }

    public void showCatalog() {
        for (String name : productList.keySet()) {
            System.out.println(name + " - " + priceList.get(name));
        }
    }

    public void add (Product item, int p ) {
        if (productList.containsKey(item.getName())) {
            return;
        }
        productList.put(item.getName(), item);
        priceList.put(item.getName(), p);
        
    }
}
