package Association;
public class Main {
    public static void main(String[] args) {
        Address addr1 = new Address("123", "Suhumvit", "Bangkok");
        Employee emp1 = new Employee("Yindee", addr1);

        emp1.showInfo();
    }
}