package P2_3.ThreeMap;

import java.util.Objects;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Double, Student> tm = new TreeMap<>();
        Student st1 = new Student("Artom", "Savin", 3);
        Student st2 = new Student("Artur", "Wowa", 5);
        Student st3 = new Student("Irina", "Soneva", 4);
        Student st4 = new Student("Alena", "Katina", 4);
        Student st5 = new Student("Andrew", "Karacul", 1);
        Student st6 = new Student("Olga", "Verdana", 5);
        Student st7 = new Student("Anna", "Arialova", 2);

        tm.put(5.8, st1);
        tm.put(3.8, st2);
        tm.put(4.1, st3);
        tm.put(2.1, st4);
        tm.put(3.3, st5);
        tm.put(4.9, st6);
        tm.put(1.8, st7);

        System.out.println(tm);



    }
}

class Student{
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
}
