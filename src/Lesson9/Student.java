package Lesson9;

public class Student {
    public int id = 3;
    public static String name  = "NewStudent";
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        // st1 = null; теряет связь
        // st1 = new Student(); новый адрес, значит опять теряет связь

    }
}
