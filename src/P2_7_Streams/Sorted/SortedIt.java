package P2_7_Streams.Sorted;

import java.util.Arrays;

public class SortedIt {
    public static void main(String[] args) {
        int [] array = {23, 455, 34, 56, -34, 565};
        array = Arrays.stream(array).sorted().toArray(); //не забыть toArray(); не забыть присвоить чему-то
        System.out.println(Arrays.toString(array));
    }
}

//смотри продолжение в Filter