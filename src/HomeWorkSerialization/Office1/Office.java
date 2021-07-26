package HomeWorkSerialization.Office1;

import Streams.Serializations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Office {
    public static void main(String[] args) throws IOException {


        ObjectOutputStream allEmployee = new ObjectOutputStream(new FileOutputStream("AllEmployee.bin"));
        ObjectOutputStream oldestEmployee = new ObjectOutputStream(new FileOutputStream("OldestEmployee.bin"));
        ObjectOutputStream prize = new ObjectOutputStream(new FileOutputStream("Prize.bin"));

        List<String> allEmployeeList = new ArrayList<>();
        List<String> oldestEmployeeList = new ArrayList<>();
        List<String> prizeEmployeeList = new ArrayList<>();

    }
}
class Employee implements Serializable {
    String name;
    int age;
    String department;
    int salary;

    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

}
