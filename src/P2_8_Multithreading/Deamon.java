package P2_8_Multithreading;

//Deamon нужны для фоновых задач и оказания сервисам UDER-потокам
//Его не ждут, программа завершается до его окончания

public class Deamon {
    public static void main(String[] args) {
        System.out.println("Thread is tarting");
        UserThread ut = new UserThread();
        ut.setName("User_thread");
        DeamonThread dt = new DeamonThread();
        dt.setName("Deamon_tread");
        dt.setDaemon(true);
        ut.start();
        dt.start();
        System.out.println("Thread is finish");
    }

}

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is deamon: " + isDaemon());
        for (char i = 'A'; i < 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DeamonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is deamon: " + isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
