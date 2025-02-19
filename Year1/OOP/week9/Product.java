public abstract class Product {
    protected String pName;
    protected String desc;

    public Product(String pName, String desc) {
        this.pName = pName;
        this.desc = desc;
    }

    public String getName() {
        return pName;
    }

    public String getDesc() {
        return desc;
    }
}
