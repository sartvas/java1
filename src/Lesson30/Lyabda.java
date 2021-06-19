package Lesson30;

import java.util.ArrayList;

public class Lyabda {
}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo{
    void printStudent(Student st){
        System.out.println("Name is "+st.name+", i am "+st.age+" years old, i am suding on "+st.course+" course, in grade " +
                st.avgGrade);
    }
    void printStudentOverGrade(ArrayList <Student> al, double avgGrade){
        for(Student s:al){
            if(s.avgGrade > avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentUnderGrade(ArrayList <Student> al, double avgGrade){
        for(Student s:al){
            if(s.avgGrade < avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentOverAge(ArrayList <Student> al, int age){
        for(Student s:al){
            if(s.age > age){
                printStudent(s);
            }
        }
    }
    void printStudentUnderOverAge(ArrayList <Student> al, int age){
        for(Student s:al){
            if(s.age < age){
                printStudent(s);
            }
        }
    }
    void printStudentSex(ArrayList <Student> al, char sex){
        for(Student s:al){
            if(s.sex == sex){
                printStudent(s);
            }
        }
    }
    void printStudentMixConditions(ArrayList <Student> al, double avgGrade, int age, char sex){
        for(Student s:al){
            if(s.avgGrade > avgGrade && s.age > age && s.sex == sex){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> array = new ArrayList<>();
        Student st1 = new Student("Artom", 'M',34,4, 4.9);
        Student st2 = new Student("Andrew", 'M',31,2, 3.9);
        Student st3 = new Student("Irina", 'W',29,3, 4.3);
        Student st4 = new Student("Anna", 'W',27,3, 2.9);
        Student st5 = new Student("Vasya", 'M',18,1, 1.9);
        array.add(st1);
        array.add(st2);
        array.add(st3);
        array.add(st4);
        array.add(st5);

        StudentInfo si = new StudentInfo();
        si.printStudentOverGrade(array, 3);
        si.printStudentSex('');
    }
}

