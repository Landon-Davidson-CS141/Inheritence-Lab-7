package cs141.landon;

import java.util.Random;

public class Person {
    protected static Random rand = new Random();
    protected String name;
    protected int ID = rand.nextInt(1000);
    protected String type = "Person";
    public Person(String name) {
        this.name = name;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}
