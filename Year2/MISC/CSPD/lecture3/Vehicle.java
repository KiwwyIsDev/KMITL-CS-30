public class Vehicle {
    protected String name;
    private String keyword;

    public Vehicle(String name, String keyword) {
        this.name = name;
        this.keyword = keyword;
    }

    public void move() {
        System.out.println(name + " is MOVING"); // [name] is Moving
    }

    public void sayKeyword() {
        System.out.println("My keyword is: " + getKeyword()); // My keyword is: [getKeyword()]
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}