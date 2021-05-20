package Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student st1, Student st2) {
        Student st3 = st1;
        st1 = st2;
        st2 = st3;
    }

    public static void chanheNames(Student st1){
        st1.name = "Igor";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1, 4.5);
        Student st2 = new Student("Artom", 5, 5.0);
        swap(st1, st2);
        chanheNames(st2);
        System.out.println(st1.name + "," + st2.name);
    }
}
