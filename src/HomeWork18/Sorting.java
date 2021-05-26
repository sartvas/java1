package HomeWork18;

import java.util.Arrays;

public class Sorting {
    public static void Sortirovka(int [] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arrs = {1,4,6,8,12,43,-45,-5,65};
        Sortirovka(arrs);
    }
}
