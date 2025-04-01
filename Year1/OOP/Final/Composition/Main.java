package Composition;
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Bossman", "NextGen AI", 500_000);
        m.showInfo();

        System.out.println("--- Now manager resigns ---");
        m = null;

       
        System.out.println("cant access project");
    }
}
