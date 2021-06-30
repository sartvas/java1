package P2_3.HashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Artom", 32, 5);
        Student st2 = new Student("Andrew", 18, 1);
        Student st3 = new Student("Ira", 25, 4);
        map.put(st1, 4.5);
        map.put(st2, 3.5);
        map.put(st3, 4.8);

        System.out.println(st1.hashCode());
        Student st4 = new Student("Igor", 33, 4);

    }
}

class Student{
    String name;
    int age;
    int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", course=" + course + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }
}