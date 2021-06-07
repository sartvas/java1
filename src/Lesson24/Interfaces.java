package Lesson24;

public class Interfaces {
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

class Teacher extends Employee implements HelpAble{
    int allsudent;
    void teech(){
        System.out.println("teech");
    }
    public void helps() {
        System.out.println("To do help");
    }
    public void closeFire(){
        System.out.println("To close the fire");
    }
}

class Driver extends Employee implements HelpAble, SwimAble{
    String modelAuto;
    void drive(){
        System.out.println("drive");
    }
    public void helps() {
        System.out.println("To do help");
    }
    public void closeFire(){
        System.out.println("To close the fire");
    }
    public void swim(){
        System.out.println("Swim able");
    }
}

interface HelpAble{
    void helps(); // interface содержит только абстрактные методы
    void closeFire();
}

interface SwimAble{
    void swim();
}

