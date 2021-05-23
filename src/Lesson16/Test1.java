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
        System.out.println(ee.replace("q", "Q"));

    }
}
