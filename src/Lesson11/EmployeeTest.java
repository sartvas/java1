package Lesson11;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee men1 = new Employee("Ivan", 446.00);
        double d = men1.getSalary(men1.salary);
        double c = men1.getSalary2();
        System.out.println(d);
        System.out.println(c);
        System.out.println(men1.salary);
    }
}