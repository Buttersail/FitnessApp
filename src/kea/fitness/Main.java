package kea.fitness;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> data = new ArrayList<>();

        data.add(new Employee("Claus", "221175-1011", Employee.EmployeeType.ADMIN));
        data.add(new Employee("Tove", "011080-1014", Employee.EmployeeType.INSTRUCTOR, 20));
        data.add(new Employee("Anna", "011080-1012", Employee.EmployeeType.ADMIN));
        data.add(new Employee("Henning", "011080-1014", Employee.EmployeeType.INSTRUCTOR, 15));
        data.add(new Member("Morten", "130195-1303", Member.MemberType.FULL));
        data.add(new Member("Martin", "221175-1011", Member.MemberType.BASIC));
        data.add(new Member("Martina", "050970-1409", Member.MemberType.FULL));
        data.add(new Member("Marcel", "221175-1011", Member.MemberType.BASIC));

        System.out.println("\nFITNESS EMPLOYEES");
        System.out.println("Name\tCpr\t\t\tHours\tSalary\tVacation");
        for (Person employee : data){
            if (employee instanceof Employee) {
                ((Employee)employee).printEmployeeInformation();
            }
        }

        System.out.println("\nFITNESS MEMBERS");
        System.out.println("Name\tCpr\t\t\tMembership\tFee");
        for (Person member : data) {
            if (member instanceof Member) {
                ((Member) member).printMemberInformation();
            }
        }

        System.out.println("\nEMPLOYEES & MEMBERS");
        System.out.println("Name\tCpr");
        for (Person person : data) {
            person.printPersonInformation();
        }

    }
}
