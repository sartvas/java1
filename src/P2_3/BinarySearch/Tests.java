package P2_3.BinarySearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tests {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(-5);
        al.add(-2);
        al.add(-15);
        al.add(1);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(7);
        al.add(6);
        al.add(9);
        System.out.println(al);
        Collections.sort(al);
        int result = Collections.binarySearch(al, 5);
        System.out.println(result);
    }
}
