package Lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class La3 {
}

class Students{
    String name;
    char sex;
    int age;
    int course;
    public double avgGrade;
    Students(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfos {
    void printStudent(Student st) {
        System.out.println("Name is " + st.name + ", i am " + st.age + " years old, i am suding on " + st.course + " course, in grade " + st.avgGrade);
    }

    //void testStudentss(ArrayList<Student> array, ChecksStudents sc){
    void testStudentss(ArrayList<Student> array, Predicate <Student> t){ //Predicate - интерфейс с 1-м методом
        for(Student s: array){
            if(t.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Student st1 = new Student("Artom", 'M', 34, 4, 4.9);
        Student st2 = new Student("Andrew", 'M', 31, 2, 3.9);
        Student st3 = new Student("Irina", 'W', 29, 3, 4.3);
        Student st4 = new Student("Anna", 'W', 27, 3, 2.9);
        Student st5 = new Student("Vasya", 'M', 18, 1, 1.9);
        array.add(st1);
        array.add(st2);
        array.add(st3);
        array.add(st4);
        array.add(st5);

        StudentInfos si = new StudentInfos();

        for(Student s: array){
            System.out.println(s.name);
        }
        System.out.println("________________________");
        array.removeIf(x -> x.name.endsWith("a")); //единственный класс с предустановленным Predicate
        for(Student s: array){
            System.out.println(s.name);
        }


//        si.testStudentss(array, st -> st.avgGrade > 4); //(array, (Student st) -> {return st.avgGrade > 4;});
//        System.out.println("____________________");
//        si.testStudentss(array, st -> st.avgGrade < 4);
//        System.out.println("____________________");
//        si.testStudentss(array, st -> st.age > 30);
//        System.out.println("____________________");
//        si.testStudentss(array, (Student st) -> {return st.age < 30;});
//        System.out.println("____________________");
//        si.testStudentss(array, (Student st) -> {return st.sex == 'M';});
//        System.out.println("____________________");
//        si.testStudentss(array, (Student st) -> {return st.sex == 'W';});

    }
}

//interface ChecksStudents {
//    boolean test(Student s);
//}


