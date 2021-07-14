package P2_8_Multithreading.Volatile;

//Ключевое слово Volatile используется для пометки переменной, как хранящейся
//в основной помяти "main memory"
//Volatile справляется с задачей ТОЛЬКО, когда 1 поток меняет значение переменной

public class Test extends Thread{
    volatile boolean b = true;
    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Counter is "+counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Test thrd = new Test();
        thrd.start();
        Thread.sleep(2000);
        System.out.println("After 2 sec wake up!");
        thrd.b = false;
        thrd.join();
        System.out.println("Ends of programm");

    }
}
