public class Drone implements Flyable, Recordable {
    @Override
    public void fly() {
        System.out.println("drone flying");
    }
    
    @Override
    public void record() {
        System.out.println("I'm recording");
    }
}
