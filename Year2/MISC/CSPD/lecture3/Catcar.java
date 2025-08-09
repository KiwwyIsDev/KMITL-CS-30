public class Catcar extends Vehicle {
    public Catcar(String name, String keyword) {
        super(name, keyword);
    }

    @Override
    public void move() {
        System.out.println("meow!");
    }

    public void eat() {
        System.out.println("Yum Yum Yum");
    }
}
