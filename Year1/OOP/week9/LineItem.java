public class LineItem {
    private Product product;
    private int quantity;
    private int buyPrice;

    public LineItem(Product product, int quantity, int buyPrice) {
        this.product = product;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
    }

    public int calculateAmount() {
        return quantity * buyPrice;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getBuyPrice() {
        return buyPrice;
    }
}
