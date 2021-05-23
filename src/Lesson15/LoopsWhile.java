package Lesson15;

public class LoopsWhile {
    public static void main(String[] args) {
/*        int money = 10;
        while (money > 0) {
            System.out.println("Playing in casino!");
            money--;
        }*/
        boolean b = true;
        int a = 0;
        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;
            }
            a++;
        }
        int c = 1;
        while (c++ < 10){
            c++;
        }
        System.out.println(c);
    }
}
