package Lesson20;

//compare - возвращает "-1", когда длина одгого [] меньше другого, "1" - , ....больше, "0" - равны;
//mismatch - возвращает "-1" когда длины [] =; если разные, возвращает индекс расхождения

import java.util.Arrays;

public class Tsts {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {1, 2, 3, 5};
        int [] array31 = {1, 2, 3, 5};

        char [] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char [] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k'};

        System.out.println(Arrays.compare(array2,array31));
        System.out.println(Arrays.mismatch(array1,array31));

    }
}
