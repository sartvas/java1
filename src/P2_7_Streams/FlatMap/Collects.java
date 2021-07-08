package P2_7_Streams.FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Collects {
    public static void main(String[] args) {
        Students st1 = new Students("Artom", 34, 5, 3);
        Students st2 = new Students("Ira", 28, 4, 1);
        Students st3 = new Students("Dron", 32, 4, 3);
        Students st4 = new Students("Vera", 29, 1, 3);
        Students st5 = new Students("Artur", 50, 2, 1);

        ArrayList<Students> als = new ArrayList<>();
        als.add(st1);
        als.add(st2);
        als.add(st3);
        als.add(st4);
        als.add(st5);

//        Map<Integer, List<Students>> map = als.stream().map(el -> {el.setName(el.getName().toUpperCase());
//        return el;}).collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for (Map.Entry<Integer, List<Students>> entry:map.entrySet()) {
//            System.out.println(entry.getKey() + ":" +entry.getValue());
//
//        }

        Map<Boolean, List<Students>> map = als.stream().collect(Collectors.partitioningBy(el -> el.getGrade() < 3));

        for (Map.Entry<Boolean, List<Students>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}
