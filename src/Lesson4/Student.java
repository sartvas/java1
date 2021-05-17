package Lesson4;

public class Student {
    Student(int ids,String names, int subBiltNumbers, String surnames, int ages) {
        id = ids;
        name = names;
        surname = surnames;
        age = ages;
        subBiltNumber = subBiltNumbers;

    }
    Student(int ids, String names, String surnames, int ages) {
        this(ids,names,0,surnames,ages);
    }
    Student(){

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

        Student sudent1 = new Student();

        sudent1.avrMath = 4.5;
        sudent1.avrEcon = 3.5;
        sudent1.avrEngl = 4.9;

        sudent1.averageEducation();

    }
}
