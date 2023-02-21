package cs141.landon;

public class Student extends Person {
    protected String major;
    private String type = "Student";
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }
    public void reset(String major) {
        this.major = major;
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Student Number: " + ID);
        System.out.println("Student Major: " + major);
    }
}
