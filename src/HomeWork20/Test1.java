package HomeWork20;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test1 {
    public static String[] abc (String[]... array1){
        int legth = 0;
        for (String[] array2:array1){
            legth += array2.length;
        }
        String[] target = new String[legth];
        int count = 0;
        for (String[] array2 : array1){
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        } return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"Ok", "Hi", "Goodbye"}, new String[]{"Ok2", "Hi2", "Goodbye2"});
    }
}
