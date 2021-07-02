package P2_3.ThreeMap;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, Double> tm = new TreeMap<>();
        TreeMap<Double, Student> tm2 = new TreeMap<>();
        Student st1 = new Student("Artom", "Savin", 3);
        Student st2 = new Student("Artur", "Wowa", 5);
        Student st3 = new Student("Irina", "Soneva", 4);
        Student st4 = new Student("Alena", "Katina", 4);
        Student st5 = new Student("Andrew", "Karacul", 1);
        Student st6 = new Student("Olga", "Verdana", 5);
        Student st7 = new Student("Anna", "Arialova", 2);

        tm2.put(5.8, st1);
        tm2.put(3.8, st2);
        tm2.put(4.1, st3);
        tm2.put(2.1, st4);
        tm2.put(3.3, st5);
        tm2.put(4.9, st6);
        tm2.put(1.8, st7);

        //If key in TreeMap is obj, need to override compareTo, and implemet Comparable in obj-class

        tm.put(st1,5.8);
        tm.put(st2,3.8);
        tm.put(st3,2.3);
        tm.put(st4,4.1);
        tm.put(st5,4.2);
        tm.put(st6,1.8);
        tm.put(st7,3.4);

        System.out.println(tm);



    }
}

class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", course=" + course + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.name.compareTo(o.name);
    }
}
