package Lesson4;

public class Student {
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

        Student sudent1 = new Student();
        sudent1.name = "Andrey";
        sudent1.surname = "Malakhov";
        sudent1.age = 30;
        sudent1.subBiltNumber = 11;

        sudent1.avrMath = 4.5;
        sudent1.avrEcon = 3.5;
        sudent1.avrEngl = 4.9;

        sudent1.averageEducation();

    }
}
