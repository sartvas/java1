package P2_6_Lambdas.Lamb1;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;

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

//    void checkAllStudents(ArrayList<Students> al, StudentsChecks sch){
//        for(Students s:al){
//            if(sch.check(s)){
//                System.out.println(s);
//            }
//        }
//    }
        void checkAllStudents(ArrayList<Students> al, Predicate<Students> sts){
            for(Students s:al){
                if(sts.test(s)){
                    System.out.println(s); //тоже самое, что верхний метод, но с Predicate
                }
            }
        }

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

        info.checkAllStudents(studList,(Students s) -> {return s.age < 30;});
        info.checkAllStudents(studList, s -> s.age < 30);
        info.checkAllStudents(studList, (Students s) -> s.age < 30);
        info.checkAllStudents(studList, s -> {return s.age < 30;});
        info.checkAllStudents(studList,(Students s) -> {return s.avrGrade < 3;});
        System.out.println("_________________");
        System.out.println("_________________");

        Predicate<Students> st = students -> students.age > 30;
        Predicate<Students> st33 = students -> students.avrGrade < 5;
        info.checkAllStudents(studList,st);
        info.checkAllStudents(studList,st33);

        System.out.println("_________________");
        System.out.println("_________________");

        info.checkAllStudents(studList,st33.and(st));
        info.checkAllStudents(studList,st33.or(st));
        info.checkAllStudents(studList,st33.negate());

//        Collections.sort(studList, (o1, o2) -> {return o1.age- o2.age;});

        System.out.println("___*Function*___");
        double res = avgSmth(studList, students -> students.avrGrade);
        System.out.println(res);

    }

    private static double avgSmth (ArrayList<Students> list, Function<Students, Double> f){
        double result = 0;
        for (Students s:list) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }
}

interface StudentsChecks{
    boolean check (Students s);
}
