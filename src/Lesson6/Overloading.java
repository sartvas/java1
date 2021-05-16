package Lesson6;

public class Overloading {
    public void show(int a){
        System.out.println(a+3);
    }
    void show(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    void show(boolean a){
        System.out.println(a);
    }
}

class OverloadingTest {
    public static void main(String[] args) {
        Overloading tst = new Overloading();
        tst.show(1);
        tst.show(3,4);
    }
}
