package Lesson32;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(34);
        li.add(56);
        li.add(234);
        li.add(12);

        int res = GenClass.getMethods(li);
        System.out.println(res);

        ArrayList<String> st = new ArrayList<>();
        st.add("Artem");
        st.add("Denis");
        st.add("Eugeniy");
        st.add("Gennadiy");

        String res1 = GenClass.getMethods(st);
        System.out.println(res1);
    }
}

class GenClass{
    public static <T> T getMethods(ArrayList<T> li){
        return li.get(0);
    }
}