package Lesson5;

public class Newm {
    int summ(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }
}

class summ1 {
    public static void main(String[] args) {
        Newm i = new Newm();
        int result = i.summ(2,4,5);
        System.out.println(result);
    }
}