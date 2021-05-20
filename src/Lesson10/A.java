package Lesson10;

//import Lesson9.Car;
//import Lesson9.Student;

/*import Lesson9.Student;
import Lesson4.Student;*/// нельзя импортировать Package с одинаковыми названиями отдельных классов

import Lesson9.*; //импортирует все классы
import Lesson5.*; //Если в Package со "*" есть одинаковые классы, нужно прописывать полный путь Lesson5.Car

import Lesson9.New.AnotherClass; //Чтобы имортировать sub package нужно приписать полный путь до вложенного пакета

public class A {
    public static void main(String[] args) {
        Lesson9.Car c2 = new Lesson9.Car("Red", "V8");
        Lesson5.Car c4 = new Lesson5.Car("Honda", "34", 0);
        AnotherClass other = new AnotherClass();
        Student st3 = new Student();
        System.out.println(st3.id);
        System.out.println(Student.name); //static переменная принадлежит калссу, нужно указывать класс

    }
}

class B {
    public static void main(String[] args) {
        Student st4 = new Student(); // import statment действует на весь package
    }
}
