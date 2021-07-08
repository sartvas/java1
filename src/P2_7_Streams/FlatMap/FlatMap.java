package P2_7_Streams.FlatMap;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Students st1 = new Students("Artom",34,5,3);
        Students st2 = new Students("Ira",28,3,1);
        Students st3 = new Students("Dron",32,4,3);
        Students st4 = new Students("Vera",29,2,3);
        Students st5 = new Students("Artur",50,5,1);

        Faculty f1 = new Faculty("Economic");
        Faculty f2 = new Faculty("Pharmacy");

        f1.addStudentOnFac(st1);
        f1.addStudentOnFac(st2);
        f1.addStudentOnFac(st3);
        f2.addStudentOnFac(st4);
        f2.addStudentOnFac(st5);

        List<Faculty> fl = new ArrayList<>();
        fl.add(f1);
        fl.add(f2);

        fl.stream().flatMap(k -> k.getStudentsOnFaculty().stream()).forEach(s -> System.out.println(s.getName()));

    }

}


class Students{
    private String name;
    private int age;
    private int course;
    private int grade;

    public Students(String name, int age, int course, int grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students{" + "name='" + name + '\'' + ", age=" + age + ", course=" + course + ", grade=" + grade + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class Faculty {
    String name;
    List<Students> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Students> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentOnFac(Students st){
        studentsOnFaculty.add(st);
    }
}