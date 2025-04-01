package Composition;
public class Manager {
    private String name;
    private Project project; // Composition – strongly owned

    public Manager(String name, String projectName, int projectBudget) {
        this.name = name;
        this.project = new Project(projectName, projectBudget); // Create inside
    }

    public void showInfo() {
        System.out.println("Manager: " + name);
        project.showInfo();
        }
    }
