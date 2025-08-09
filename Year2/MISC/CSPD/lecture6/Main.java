public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new BasicCalculator();

        System.out.println("Basic add: " + calc1.add(5, 3));
        System.out.println("Basic sub " + calc1.sub(10, 1));
        calc1.printPI();
    }
}
