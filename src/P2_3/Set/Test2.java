package P2_3.Set;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//В TreeSet нельзя добавить объект в виде ключа без имплиментации Comparable и
// оверрайдинга compareTo, по выбранным параметрам
// ВАЖНО также оверрайдить equals и hashCode по тем же параметрам, что и compareTo (см ниже)

public class Test2 {
    public static void main(String[] args) {
        TreeSet<Student> tset = new TreeSet<>();
        Student st1 = new Student("Artom", 4);
        Student st2 = new Student("Irina", 2);
        Student st3 = new Student("Gennady", 1);
        Student st4 = new Student("Den", 5);
        Student st5 = new Student("Djohn", 1);
        Student st6 = new Student("ivan", 5);

        tset.add(st1);
        tset.add(st2);
        tset.add(st3);
        tset.add(st4);

        System.out.println(tset);
        System.out.println("Студент на первом месте: "+tset.first());
        System.out.println("Студент на последнем месте: "+tset.last());
        System.out.println("Студент, который меньше значения 'st5': "+tset.headSet(st5));
        System.out.println("Студент, который выше значения 'st5': "+tset.tailSet(st5));
        System.out.println("Студенты, которые между значениями 'st5' и 'st6': "+tset.subSet(st5,st6));
    }
}

class Student implements Comparable <Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + '}';
    }


    @Override
    public int compareTo(@NotNull Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return course == student.course; //оставили только course, хотя был и name
    }

    @Override
    public int hashCode() {
        return Objects.hash(course); //оставили только course, хотя был и name
    }
}
