package Lesson22;

public class Nas3 {

}

class Human2 {
//    Human2(String n){
//    this(n, null);
//    }
//
//    Human2(String n, String s){
//        name = n;
//        surname = s;
//    }
    String name;
    String surname;

}

class Student2 extends Human2{
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Kolya";
    }
}
