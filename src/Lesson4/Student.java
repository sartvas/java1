package Lesson4;

public class Student {
    Student(int id,String name, String surname, int age, int subBiltNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subBiltNumber = subBiltNumber;

    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    int id;
    int subBiltNumber;
    String name;
    String surname;
    int age;
    double avrMath;
    double avrEcon;
    double avrEngl;

    void averageEducation(){
        System.out.println((avrMath+avrEcon+avrEngl)/3);
    }
}

class StudentTest {
    public static void main(String[] args) {

        Student sudent1 = new Student(12,"Artem");

        sudent1.avrMath = 4.5;
        sudent1.avrEcon = 3.5;
        sudent1.avrEngl = 4.9;

        sudent1.averageEducation();

    }
}
