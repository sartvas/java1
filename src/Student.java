public class Student {
    int subBiltNumber;
    String name;
    String surname;
    int ageStudies;
    double avrMath;
    double avrEcon;
    double avrEngl;
}

class StudentTest {
    public static void main(String[] args) {

        Student sudent1 = new Student();
        Student sudent2 = new Student();
        Student sudent3 = new Student();

        sudent1.avrMath = 4.5;
        sudent1.avrEcon = 3.5;
        sudent1.avrEngl = 4.9;

        sudent2.avrMath = 3.5;
        sudent2.avrEcon = 2.5;
        sudent2.avrEngl = 3.9;

        sudent3.avrMath = 1.5;
        sudent3.avrEcon = 2.5;
        sudent3.avrEngl = 3.9;


        System.out.println(sudent1.avrMath);
    }
}
