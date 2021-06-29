package P2_3.BinarySearch;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int [] arr = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int search = Arrays.binarySearch(arr, 5);
        System.out.println(search);

}
}
