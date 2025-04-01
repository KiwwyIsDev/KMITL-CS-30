package Aggregation;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Yindee");
        Employee e2 = new Employee("Preeda");

        Manager m1 = new Manager("Bossman");
        m1.addSupervisee(e1);
        m1.addSupervisee(e2);

        m1.showTeam();
        m1 = null;

        System.out.println(e1.getName());
    }
}
