package Lesson20;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<String>();

        students.add("Ivanov");
        students.add("Petrov");
        students.add("Sidiorov");

        students.remove(2);

        for (String s:students){
            System.out.println(s+" ");
        }
    }
}
