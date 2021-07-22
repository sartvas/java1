package P2_8_Multithreading.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServices {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService1 = Executors.newScheduledThreadPool(1);
//        scheduledExecutorService1.schedule(new TestRunnubles(),3, TimeUnit.SECONDS);

        scheduledExecutorService1.scheduleAtFixedRate(new TestRunnubles(),3, 1, TimeUnit.SECONDS);
        Thread.sleep(7000);
    }
}


class TestRunnubles implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}

class TestRunnubles2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}