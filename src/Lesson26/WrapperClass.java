package Lesson26;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        // boxing & unboxing
        ArrayList <Integer> arr1 = new ArrayList<>();
        arr1.add(5); // boxing
        int a = arr1.get(0); //unboxing
        System.out.println(a); //5


        // method parse
        String s1 = "50";
        int i1 = Integer.parseInt(s1); // 50 можно парсить любые примитивные данные
        System.out.println(i1);

        //valueOf

        Integer i3 = Integer.valueOf(10);
        System.out.println(i3); //10

        Double d2 = Double.valueOf(23.3);
        System.out.println(d2); //23.3

//        Byte b1 = new Byte((byte)5);
//        System.out.println(b1);


    }
}
