package Lesson24;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.jumble();
    }
}

class Human implements movable, newJava8{
    public void jumble(){
        System.out.println("Not more 1,5 metres");
    }
    public void squat(){
        System.out.println("all fours");
    }
}

class Animal implements newJava8{
    public static void main(String[] args) {
        newJava8.staticMethods();// к static методу можно обращаться только через имя interface

    }
}

interface movable{
    void jumble();
    void squat();
}

interface newJava8{
    default void swag(){ // You can no overriding default methods
        System.out.println("I do that wihout overriding");
    }
    static void staticMethods(){
        System.out.println("Look at this methods");
    }
    static void newstaticMethods(){
        System.out.println("Look at this methods");
    }
}