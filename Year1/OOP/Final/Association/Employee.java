package Association;
public class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.toString());
    }




}
