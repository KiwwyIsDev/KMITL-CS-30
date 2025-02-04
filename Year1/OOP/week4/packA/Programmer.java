package packA;

import java.util.ArrayList;

public class Programmer extends Employee {
    private ArrayList<String> skills = new ArrayList<>();


    
    public Programmer(String n, int exp, int sal) {
        
        this.name = n;
        this.experience = exp;
        this.salary =sal;

    }
    public Programmer(String n, int exp, int sal, String ... skill) {
        
        this.name = n;
        this.experience = exp;
        this.salary =sal;

        for (String e : skill) {
            skills.add(e);

        }
    }

    public Programmer (){}
    
    public void sayHi() {
        System.out.println("hi from " + super.name);

    }

    public ArrayList<String> getSkills() {
        return skills;
    }
    public String toString(){
        return String.format("MangerProgrammer [name=%s, experience=%d salary=%d]", name, experience, salary);
        
    }

    public String coding() {
        return "I am coding";

    }


}
