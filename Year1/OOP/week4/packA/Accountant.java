package packA;
public class Accountant extends Employee {
    static private String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;

    public Accountant (String name, int superExp, int experience, int sal, String talent) {
        
        this.name = name;
        this.experience = experience;
        this.salary = sal;
        this.specialty = talent;
    }

    public void setSpecialty(String newSpecialty) {
        this.specialty = newSpecialty;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setAccountExperience(int exp ){
        this.experience = exp;
    }

    public int getAccountExperience() {
        return experience;

    }

    public String tellProfit() {
        return companyName +  "'s profit is " + (int)(Math.random() * 1000) + ". My salary is " + salary;
    }

    public String toString() {

        return String.format("Accountant [experience=%d, specialty=%s]",  getAccountExperience(), getSpecialty());
    }

    public void sayHi() {
        System.out.println(name + "an accountatn, says hello");
    }

    static public String tellMyRole() {
        return "I am an accountant at" + companyName;
    }


}
