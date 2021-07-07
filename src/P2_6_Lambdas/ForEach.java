package P2_6_Lambdas;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hi", "Hoe are you", "Good bye");
//        for (String s:list){
//            System.out.println(s);
//        }
        list.forEach(s -> System.out.println(s));
        list.forEach(s -> {
            s = s + "!";
            System.out.println(s);
        });
    }
}
