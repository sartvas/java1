package Lesson19;

public class Test {
    static void summa(int ... a){ //varargs
        int summ = 0;
        for(int i = 0; i < a.length; i++){
            summ+=a[i];
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        summa(4,6);
    }
}
