package cs141.landon;

import java.util.Random;

public class Person {
    private static Random rand = new Random();
    private String name;
    private int ID = rand.nextInt(1000);
    public Person(String name) {
        this.name = name;
    }
    public void printInfo() {

    }
}
