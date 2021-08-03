package P2_7_Streams.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        Students st1 = new Students("Artom",34,5,3);
        Students st2 = new Students("Ira",28,3,1);
        Students st3 = new Students("Dron",32,4,3);
        Students st4 = new Students("Vera",29,2,3);
        Students st5 = new Students("Artur",50,5,1);
        ArrayList<Students> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        List <Students> list2 = list.stream().filter(e -> e.getAge() >30).collect(Collectors.toList());
        list2 = list.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());

        System.out.println(list2);

        Students findMin = list.stream().min((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println("findMin is --> "+findMin);

        Students findMax = list.stream().max((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println("findMax is --> "+findMax);

        List<Integer> mapToInt = list.stream().mapToInt(el -> el.getCourse()).boxed().collect(Collectors.toList());
        System.out.println("mapToInt is "+mapToInt);

        double averageAll = list.stream().mapToDouble(el -> el.getGrade()).average().getAsDouble();
        System.out.println("averageAll is "+averageAll );
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