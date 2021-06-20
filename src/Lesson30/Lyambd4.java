package Lesson30;

public class Lyambd4 {
    static void def(Test5 t){
        System.out.println(t.abc("Privet"));
    }

    public static void main(String[] args) {
        def(x -> x.length());
    }
}

interface Test5{
    int abc(String s);
}