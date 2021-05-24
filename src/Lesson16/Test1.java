package Lesson16;

import Lesson14.Test;

public class Test1 {
    static void compare(){
        String a = "Privet";
        String b = "Privet";

        if(a == b){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Test1 tst1 = new Test1();
        String a = new String("Privet");
        String b = "Privet";
        String c = "Privet";
//        System.out.println("Privet" == a);
//        System.out.println(a == b);
//        System.out.println(c == b);
        String ee = "qwertyuiop";
//        System.out.println(ee.substring(1,ee.length()));
        String tst22 = ee.replace('q', 'q');
        String tst23 = ee.replace("q", "q");
        String tst24 = ee.replace("q", "q");
        System.out.println(tst22 == tst23);
        System.out.println(tst23 == tst24);
//        System.out.println(ee.replace('q', 'Q'));

    }
}
