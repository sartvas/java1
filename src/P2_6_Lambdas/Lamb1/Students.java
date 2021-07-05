package P2_6_Lambdas.Lamb1;

import java.util.ArrayList;

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

    }

    public void prinStudentsOverGrade(ArrayList<Students> al, double grade){
        for (Students s:al) {
            if(s.avrGrade > grade){
                System.out.println(s);
            }

        }

    }
    public void prinStudentsOverAge(ArrayList<Students> al, int age){
        for (Students s:al) {
            if(s.age > age){
                System.out.println(s);
            }

        }

    }
    public void prinStudentsMix(ArrayList<Students> al, int age, double grade){
        for (Students s:al) {
            if(s.age > age && s.avrGrade > grade){
                System.out.println(s);
            }

        }

    }
}