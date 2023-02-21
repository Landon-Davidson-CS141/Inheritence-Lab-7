package cs141.landon;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Sally Person"));
        people.add(new Student("James Student", "English"));
        people.add(new UnderGrad("Derek Undergrad", "Engineering", "Junior"));
        people.add(new Grad("Jake Graduate", "Math", "Master"));
        people.add(new Instructor("Jim Instructor", 60000L));
        for (Person person : people) {
            person.printInfo();
            System.out.println("--------------------\n");
        }
    }
}
