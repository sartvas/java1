package Lesson22;

public class Nasledovanie {

    void incrSal(Employee e){
        e.salary = e.salary + 100;
    }

    public static void main(String[] args) {

    Doctor doc1 = new Doctor();
    doc1.name = "ivan";
    doc1.eat();
    doc1.sleep();
    doc1.health();
    Employee emp1 = new Doctor();
    Doctor d1 = (Doctor)emp1;
    ((Doctor) emp1).health();

        System.out.println();
    }

}

class Employee{
    String name;
    double salary = 100;
    int age;
    int exp;
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }

}

class Doctor extends Employee {
    String special;
    public void health(){
        System.out.println("health");
    }
}

class Teacher extends Employee{
    int allsudent;
    void teech(){
        System.out.println("teech");
    }
}

class Chemicals extends Teacher{
    int chemic;
    int ampuls;
    void boom() {
        System.out.println("boom");
    }
}

class Driver extends Employee{
    String modelAuto;
    void drive(){
        System.out.println("drive");
    }
}