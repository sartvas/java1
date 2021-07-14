package P2_8_Multithreading;

import java.util.concurrent.TransferQueue;

public class qqqq {
    public static void main(String[] args) {
        Thread tread2 = new Thread(new MyThread2());
        Thread tread1 = new Thread(new MyThread1());
        tread1.start();
        tread2.start();

    }
}

class MyThread1 implements Runnable{
    public void run(){// переопределяем RUN
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for(int i = 100; i > 0; i--){
            System.out.println(i);
        }
    }
}
