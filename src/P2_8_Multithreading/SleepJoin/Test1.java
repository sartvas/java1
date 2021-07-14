package P2_8_Multithreading.SleepJoin;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--){
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("Поехали!");
        Thread.sleep(500);
        for (int i = 3; i > 0; i--){
            System.out.println("Пыщь");
            Thread.sleep(300);
        }
        Thread.sleep(1000);
        System.out.println("Приехали!");
    }
}
