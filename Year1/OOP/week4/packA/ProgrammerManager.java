package packA;
import java.util.ArrayList;
public class ProgrammerManager extends Programmer{

    
    public ProgrammerManager(String n, int exp, int sal) {
        super(n, exp, sal);
    }

    public ProgrammerManager(String n, int exp, int sal, String ...skill) {
        super(n, exp, sal, skill);
    }

    public void sayHi() {
        
        System.out.printf("From sayHi, I know %s\n",super.getSkills());
    }
    public String coding() {
        return "";

    }
    public int evaluate(Programmer p) {
        return p.salary *= (float)1.15;
    }

}
