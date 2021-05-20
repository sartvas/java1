package Lesson11;

public class Employee {

    String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double getSalary(double a) {
        a = a*5;
        return a;
    }

    public double getSalary2() {
        salary*=2;
        return salary;
    }
}




