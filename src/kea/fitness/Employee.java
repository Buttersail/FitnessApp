package kea.fitness;

public class Employees {

    private String name;
    private String cpr;
    private int hours;
    private int salary;
    private int vacation;

    Employees(String name, String cpr, int hours, int salary, int vacation) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return name + cpr + hours + salary + vacation;
    }
}
