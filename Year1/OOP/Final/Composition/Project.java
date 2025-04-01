package Composition;
public class Project {
    private String name;
    private int budget;

    public Project(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public void showInfo() {
        System.out.println("Project: " + name + ", Budget: $" + budget);
    }
}
    