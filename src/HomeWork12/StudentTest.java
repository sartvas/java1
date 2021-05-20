package HomeWork12;

import Lesson11.Student;

public class StudentTest {

public static void compare(Student st1, Student st2) {
    if (st1.name.equals(st2.name) && st1.course == st1.course && st1.grade == st2.grade){
        System.out.println("Студенты одинаковые");
    } else {
        System.out.println("Студенты разные");
    }
}

public static void compareTwo(Student st1, Student st2){
    if (st1.name.equals(st2.name)){
        if (st1.course == st2.course) {
            if (st1.grade == st2.grade) {
                System.out.println("Видимо, у нас в универе клон!");
            } else {
                System.out.println("Имена и курсы одинаковые, но оценки разные!");
            }
        } else {
            System.out.println("Имена одинаковые, но оценки разные!");
        }
    } else {
        System.out.println("Разные!");
    }
}

    public static void main(String[] args) {
        Student st1 = new Student("Artem", 3, 4.6);
        Student st2 = new Student("Artem", 3, 4.2);
        Student st3 = new Student("Max", 3, 4.8);
        compareTwo(st1,st2);


    }
}
