package cs141.landon;

public class UnderGrad extends Student {
    private String level;
    private String type = "Undergrad";
    public UnderGrad(String name, String major, String level) {
        super(name, major);
        this.level = level;
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Student Number: " + ID);
        System.out.println("Student Major: " + major);
        System.out.println("Student Level: " + level);
    }
}
