
public class Lab09_670200 {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();
    }

    static void demo1() {
        Catalog catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"),15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);

        catalog.add(new Noodles("mama", "duplicate"), 11); // duplicate

        catalog.showCatalog();

    }

    static void demo2() {
        Catalog catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        
        String pName;
        int quantity;
        Basket b = new Basket();
        pName = "mama";
        quantity = 1;
        b.putInBasket(new LineItem(catalog.retrieveProduct(pName), quantity, catalog.retrievePrice(pName)));
        
        pName = "lactasoy";
        quantity = 2;
        b.putInBasket(new LineItem(catalog.retrieveProduct(pName), quantity, catalog.retrievePrice(pName)));
        
        b.showItemsInBasket();

        b.printInvoice();
    
    } 

    static void demo3() {
        Shop csShop = new Shop("CS");
        Basket b1 = csShop.newCustomerArrives();
        String picked;
        int quantity;
        picked = "mama";
        quantity = 1;

        b1.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));

        picked = "lactasoy";
        quantity = 1;
        b1.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));
        b1.showItemsInBasket();
        csShop.checkOut(b1);

        Basket b2 = csShop.newCustomerArrives();
        picked = "mix veggies";
        quantity = 3;
        b2.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));
        picked = "korean";
        quantity = 4;
        
        b2.putInBasket(new LineItem(csShop.getProduct(picked), quantity, csShop.getPrice(picked)));
        b2.showItemsInBasket();
        csShop.checkOut(b2);
    }
    
}
