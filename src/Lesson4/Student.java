package Lesson4;

public class Student {
    int subBiltNumber;
    String name;
    String surname;
    int age;
    double avrMath;
    double avrEcon;
    double avrEngl;
}

class StudentTest {
    public static void main(String[] args) {

        Student sudent1 = new Student();
        Student sudent2 = new Student();
        Student sudent3 = new Student();
        sudent1.name = "Andrey";
        sudent1.surname = "Malakhov";
        sudent1.age = 30;
        sudent1.subBiltNumber = 11;

        sudent1.avrMath = 4.5;
        sudent1.avrEcon = 3.5;
        sudent1.avrEngl = 4.9;

        sudent2.name = "Artom";
        sudent2.surname = "Savin";
        sudent2.age = 23;
        sudent2.subBiltNumber = 12;

        sudent2.avrMath = 3.5;
        sudent2.avrEcon = 2.5;
        sudent2.avrEngl = 3.9;

        sudent3.name = "Max";
        sudent3.surname = "Polib";
        sudent3.age = 34;
        sudent3.subBiltNumber = 13;

        sudent3.avrMath = 1.5;
        sudent3.avrEcon = 2.5;
        sudent3.avrEngl = 3.9;

        double avrEdu1 = (sudent1.avrMath + sudent1.avrEcon + sudent1.avrEngl) / 3;
        double avrEdu2 = (sudent2.avrMath + sudent2.avrEcon + sudent2.avrEngl) / 3;
        double avrEdu3 = (sudent3.avrMath + sudent3.avrEcon + sudent3.avrEngl) / 3;

        System.out.println("У студента "+sudent2.name+" средняя оценка "+avrEdu1);
    }
}
