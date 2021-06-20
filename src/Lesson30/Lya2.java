//package Lesson30;
//
//import java.util.ArrayList;
//
//public class Lya2 {
//}
//
//
//class Students{
//    String name;
//    char sex;
//    int age;
//    int course;
//    public double avgGrade;
//    Students(String name, char sex, int age, int course, double avgGrade){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfos {
//    void printStudent(Student st) {
//        System.out.println("Name is " + st.name + ", i am " + st.age + " years old, i am suding on " + st.course + " course, in grade " + st.avgGrade);
//    }
//
//    void testStudentss(ArrayList <Student> array, ChecksStudents sc){
//        for(Student s: array){
//            if(sc.testStudents(s)){
//                printStudent(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> array = new ArrayList<>();
//        Student st1 = new Student("Artom", 'M', 34, 4, 4.9);
//        Student st2 = new Student("Andrew", 'M', 31, 2, 3.9);
//        Student st3 = new Student("Irina", 'W', 29, 3, 4.3);
//        Student st4 = new Student("Anna", 'W', 27, 3, 2.9);
//        Student st5 = new Student("Vasya", 'M', 18, 1, 1.9);
//        array.add(st1);
//        array.add(st2);
//        array.add(st3);
//        array.add(st4);
//        array.add(st5);
//
//        StudentInfos si = new StudentInfos();
//        CheckStudentsOverGrade fs = new CheckStudentsOverGrade();
//        si.testStudentss(array,fs);
//    }
//}
//
//interface ChecksStudents {
//    boolean testStudents(Student s);
//}
//
//
//class CheckStudentsOverGrade implements ChecksStudents{
//    public boolean testStudents(Student s){
//        return s.avgGrade > 3;
//    }
//}