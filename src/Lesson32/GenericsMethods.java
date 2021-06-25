package Lesson32;

import java.util.ArrayList;

//Paramerized methods

public class GenericsMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(13);
        al.add(23);
        al.add(34);
        int a = Test1.getSecondElement(al);
        System.out.println("___Integer___");
        System.out.println(a);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Hi");
        al2.add("Bye");
        String s = Test1.getSecondElement(al2);
        System.out.println("___String___");
        System.out.println(s);
    }
}

class Test1{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
