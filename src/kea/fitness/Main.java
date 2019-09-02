package kea.fitness;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        List<Member> members = new ArrayList<>();

        employees.add(new Employee("Claus", "221175-1011", Employee.EmployeeType.ADMIN));
        employees.add(new Employee("Tove", "011080-1014", Employee.EmployeeType.INSTRUCTOR, 20));
        employees.add(new Employee("Anna", "011080-1012", Employee.EmployeeType.ADMIN));
        employees.add(new Employee("Henning", "011080-1014", Employee.EmployeeType.INSTRUCTOR, 15));
        members.add(new Member("Morten", "130195-1303", Member.MemberType.FULL));
        members.add(new Member("Martin", "221175-1011", Member.MemberType.BASIC));
        members.add(new Member("Martina", "050970-1409", Member.MemberType.FULL));
        members.add(new Member("Marcel", "221175-1011", Member.MemberType.BASIC));

        List<Person> persons = new ArrayList<>();
        persons.addAll(employees);
        persons.addAll(members);

        System.out.println("\nFITNESS EMPLOYEES");
        System.out.println("Name\tCpr\t\t\tHours\tSalary\tVacation");
        for (Employee employee : employees) {
            employee.printEmployeeInformation();
        }

        System.out.println("\nFITNESS MEMBERS");
        System.out.println("Name\tCpr\t\t\tMembership\tFee");
        for (Member member : members) {
            member.printMemberformation();
        }

        System.out.println("\nEMPLOYEES & MEMBERS");
        System.out.println("Name\tCpr");
        for (Person person : persons) {
            person.printPersonInformation();
        }

    }
}
