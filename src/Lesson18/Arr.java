package Lesson18;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {

        String[] arr = {"Hi", "Hello", "Bonjorno"};

        int[][] mass = {{2,4,5}, {4,5,6}, {5,6,7}}; //двумерные массивы

        // System.out.println(mass[2][2]); // 7

        int [] arr1 = {1, 9, 4, -9, 34, 2};
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
