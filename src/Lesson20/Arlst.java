package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arlst {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hi1");
        StringBuilder sb2 = new StringBuilder("Hi2");
        StringBuilder sb3 = new StringBuilder("Hi3");
        ArrayList <StringBuilder> list1 = new ArrayList<StringBuilder>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        Object [] obj1 = list1.toArray();
        for(Object a:obj1){
            System.out.print(a+" ");
        }
        System.out.println();
        StringBuilder [] arr2 = list1.toArray(new StringBuilder[5]);
        for(StringBuilder b:arr2){
            System.out.print(b+" ");
        }
        System.out.println();
        StringBuilder [] array = {sb2, sb2, sb3, sb3};
        List <StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
    }
}
