package packA;
public class Salesperson extends Employee implements SalesRoles {
    private int target;

    public Salesperson(String n, int exp, int sal, int assignedTarget) {
        this.name = n;
        this.experience = exp;
        this.salary = sal;
        this.target = assignedTarget;
    }

    public Salesperson(String n, int exp) {
        this.name = n;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getTarget() {
        return target;
    }

    public void setSalary(int increasedSalary) {
        super.salary += increasedSalary;
    }

    public void setSalary() { 
        super.salary = super.salary + (super.salary * (100 / 10));
    }

    public String makeQuotation() {
        return "Dear value customer, " + (int)(Math.random() * 1000) + " is my best offer";
    }

    public String toString() {

        return String.format("Salesperson [name=%s, salary=%d, experience=%d]", name, salary, experience);
    }

    public void sayHi() {
        System.out.println("");
    }

}
