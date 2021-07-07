package P2_7_Streams.Reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceIt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        int sum2 = list.stream().reduce((accum, elem) -> accum * elem).get();
        System.out.println(sum2);

        //Проверка при сортировке на пустой лист (без get())
        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> o = list2.stream().reduce((accum, elem) -> accum * elem);
        if(o.isPresent()){
            System.out.println(o.get());
        } else {
            System.out.println("Не представлен");
        }

    }
}
