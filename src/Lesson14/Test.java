package Lesson14;

public class Test {

    public static void forTest(int i){
        for (; i < 10; i++){
            System.out.println("Look at i times "+i);
        }
    }

    public static void twins(){
        for (int i = 1; i <= 30; i++) {
            if (i == 7){
                break;
            }
            System.out.println("Look at i times "+i);
        }
    }

    public static void twinsSec(){
        for (int i = 1; i <= 20; i++) {
            if (i == 7) {
                continue;
            }
            if (i % 10 == 0) {
                break;
            }
            System.out.println("Look at i times "+i);
        }
    }

    public static void main(String[] args) {
        Test aaa = new Test();
        twinsSec();
    }
}
