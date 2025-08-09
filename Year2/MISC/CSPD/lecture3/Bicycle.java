public class Bicycle extends Vehicle {
    Bicycle(String name, String keyword){
        super(name, keyword);
    }

    @Override
    public void move() {
        System.out.println("ding ding ding");
    }

    public void ding() {
        System.out.println("I just ting a ling");
    }
}
