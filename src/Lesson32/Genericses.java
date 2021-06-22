package Lesson32;

import java.util.ArrayList;

public class Genericses {
    public static void main(String[] args) {
        Info <String> i1 = new Info<>("Hi");
        System.out.println(i1);
        String s = i1.getValue();

        Info <Integer> i2 = new Info<>(12);
        System.out.println(i2);
        Integer i = i2.getValue();
    }

//    public void abc(Info<String> info){ ------------------------> ошибка
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
}

//Parametrized class

class Info <T>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "(" + value + ")";
    }

    public T getValue(){
        return value;
    }
}

class Paretn {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

//class Child extends Paretn { ------------------------> ошибка
//    public void abc(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
//}