package cs141.landon;

public class Instructor extends Person {
    protected Job job;
    private String type = "Instructor";
    public Instructor(String name, long salary) {
        super(name);
        job = new Job(salary);
    }
    public String getName() {
        return name;
    }
    public long getSalary() {
        return job.getSalary();
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Instructor Number: " + ID);
        System.out.println("Instructor Salary: " + getSalary());
    }
}
