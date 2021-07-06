package P2_6_Lambdas;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("123456");
        al.add("12345");
        al.add("1234");
        al.add("123");
        al.add("12");
        al.add("1");
        al.removeIf(element -> element.length() < 3); //строго меньше
        System.out.println(al);
    }
}
