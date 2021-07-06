package P2_6_Lambdas.Lamb1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Students {
    public Students(String name, char sex, int age, int course, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    String name;
    char sex;
    int age;
    int course;
    double avrGrade;

    @Override
    public String toString() {
        return "Students{" + "name='" + name + '\'' + ", sex=" + sex + ", age=" + age + ", course=" + course + ", avrGrade=" + avrGrade + '}';
    }
}

class StudentInfo{

    void checkAllStudents(ArrayList<Students> al, StudentsChecks sch){
        for(Students s:al){
            if(sch.check(s)){
                System.out.println(s);
            }
        }
    }

//    void printStudentOverGrade(ArrayList<Students> al, double avrGrade){
//        for(Students s:al){
//            if(s.avrGrade > 4){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Students> al, int age){
//        for(Students s:al){
//            if(s.age > 3){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentMix(ArrayList<Students> al, int age, double avrGrade, char sex){
//        for(Students s:al){
//            if(s.age > 30 && s.avrGrade > 3 && s.sex == 'm'){
//                System.out.println(s);
//            }
//        }
//    }

}

class Test {
    public static void main(String[] args) {

        Students st1 = new Students("Artom", 'm', 36,5, 4.8);
        Students st2 = new Students("Igor", 'm', 31,4, 4.2);
        Students st3 = new Students("Irina", 'w', 29,3, 4.1);
        Students st4 = new Students("Ksu", 'w', 28,2, 3.8);
        Students st5 = new Students("Valera", 'm', 27,1, 3.5);

        ArrayList<Students> studList = new ArrayList<>();

        studList.add(st1);
        studList.add(st2);
        studList.add(st3);
        studList.add(st4);
        studList.add(st5);

        StudentInfo info = new StudentInfo();
//        info.checkAllStudents(studList, new CheckOverGrade());
//        info.checkAllStudents(studList, new StudentsChecks() {
//            @Override
//            public boolean check(Students s) {
//                return s.age < 30;
//            }
//        });
        info.checkAllStudents(studList,(Students s) -> {return s.age < 30;});
        info.checkAllStudents(studList, s -> s.age < 30);
        info.checkAllStudents(studList, (Students s) -> s.age < 30);
        info.checkAllStudents(studList, s -> {return s.age < 30;});
        info.checkAllStudents(studList,(Students s) -> {return s.avrGrade < 3;});
        System.out.println("_________________");
        Collections.sort(studList, (o1, o2) -> {return o1.age- o2.age;});

        System.out.println(studList);

//        info.printStudentOverGrade(studList, 3);
//        System.out.println("_________________");
//        info.printStudentUnderAge(studList,30);
//        System.out.println("_________________");
//        info.printStudentMix(studList,30, 4, 'm');

    }
}

interface StudentsChecks{
    boolean check (Students s);
}

//class CheckOverGrade implements StudentsChecks{
//    @Override
//    public boolean check(Students s) {
//        return s.avrGrade > 4;
//    }
//}