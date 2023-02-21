package cs141.landon;

public class Grad extends Student {
    protected String degree;
    private String type = "Graduate";
    public Grad(String name, String major, String degree) {
        super(name, major);
        this.degree = degree;
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Student Number: " + ID);
        System.out.println("Student Major: " + major);
        System.out.println("Student Degree: " + degree);
    }
}
