package Aggregation;
import java.util.ArrayList;

public class Manager {
    private String name;
    private ArrayList<Employee> supervises;    

    public Manager(String name) {
        this.name = name;
        this.supervises = new ArrayList<>();

    }

    public void addSupervisee(Employee emp) {
        supervises.add(emp);

    } 

    public void showTeam() {
        System.out.println("Manager: " + name);
        System.out.println("Team member: ");
        for (Employee emp : supervises) {
            System.out.println(" - " + emp.getName());
        }
    }
}
