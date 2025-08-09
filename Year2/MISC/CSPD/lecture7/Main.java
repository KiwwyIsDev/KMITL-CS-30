public class Main {
    public static void main(String[] args) {
        Flyable f1 = new Bird();
        Flyable f2 = new Airplane();

        f1.fly(); // Bird is flying
        f2.fly(); // Airplane is flying

        Drone f3 = new Drone();
        f3.fly();
        f3.record();
    }
}
