package P2_3.LinkedHashMap;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class LinkedHasMap11 {
        public static void main(String[] args) {
            LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f, true);
            Student st1 = new Student("Artom", "Savin", 3);
            Student st2 = new Student("Artur", "Wowa", 5);
            Student st3 = new Student("Irina", "Soneva", 4);
            Student st4 = new Student("Alena", "Katina", 4);
            Student st5 = new Student("Andrew", "Karacul", 1);
            Student st6 = new Student("Olga", "Verdana", 5);
            Student st7 = new Student("Anna", "Arialova", 2);

            lhm.put(1.8, st7);
            lhm.put(5.8, st1);
            lhm.put(3.8, st2);
            lhm.put(3.9, st3);

            chekEvryElements(lhm);
            System.out.println(lhm.get(1.8));
            System.out.println(lhm.get(3.8));
            chekEvryElements(lhm);


        }

    private static void chekEvryElements(LinkedHashMap<Double, Student> lhm) {
        for (Map.Entry<Double, Student> entry:lhm.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
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
