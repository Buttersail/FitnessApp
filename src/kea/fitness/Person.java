package kea.fitness;

public class Person {

    public String name;
    public String cpr;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public void printPersonInformation() {
        System.out.println(name + "\t" + cpr);
    }
}
