package P2_7_Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("12345");
        list.add("1234");
        list.add("123");
        list.add("12");

        List<Integer> list2 = list.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(list2);

        int [] array = {5,9,3,8};
        array = Arrays.stream(array).map(e ->{
            if(e%3 == 0){
                e = e/3;
            }
            return e;
        }).toArray();

        System.out.println(Arrays.toString(array));

    }
}
