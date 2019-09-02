package kea.fitness;

public class Employee extends Person {

    private int hours;
    private int salary;
    private int vacation;
    private EmployeeType employeeType;
    enum EmployeeType {
        ADMIN, INSTRUCTOR
    }

    Employee(String name, String cpr, EmployeeType employeeType) {
        super(name, cpr);
        if (employeeType == EmployeeType.ADMIN) {
            this.hours = 37;
            this.salary = 33000;
            this.vacation = 5;
        } else if (employeeType == EmployeeType.INSTRUCTOR) {
            throw new Error("Wah");
        }
    }

    Employee(String name, String cpr, EmployeeType employeeType, int hours) {
        super(name, cpr);
        if (employeeType == EmployeeType.ADMIN) {
            throw new Error("Wah");
        } else if (employeeType == EmployeeType.INSTRUCTOR) {
            this.hours = hours;
            this.salary = hours * 199;
            this.vacation = 0;
        }
    }

    public void printEmployeeInformation() {
        System.out.println(name + "\t" + cpr + "\t" + hours + "\t\t" + salary + "\t" + (vacation > 0 ? vacation : ""));
    }

}
