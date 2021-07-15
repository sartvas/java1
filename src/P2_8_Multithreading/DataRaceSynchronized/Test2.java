package P2_8_Multithreading.DataRaceSynchronized;

public class Test2 {

    static final Object lock = new Object();

    void MobileCall() {
        synchronized (lock) {
            System.out.println("Start mobile call");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End mobile call");
        }
    }
    void SkypeCall() {
        synchronized (lock) {
            System.out.println("Start Skype call");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End Skype call");
        }
    }
    void WatsAppCall() {
        synchronized (lock) {
            System.out.println("Start WatsApp call");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End WatsApp call");
        }
    }

    public static void main(String[] args) {
        Thread tr1 = new Thread(new RunnubleImpMobile());
        Thread tr2 = new Thread(new RunnubleImpSkype());
        Thread tr3 = new Thread(new RunnubleImpWatsApp());
        tr1.start();
        tr2.start();
        tr3.start();
    }
}

class RunnubleImpMobile implements Runnable{

    @Override
    public void run() {
        new Test2().MobileCall();
    }
}

class RunnubleImpSkype implements Runnable{

    @Override
    public void run() {
        new Test2().SkypeCall();
    }
}

class RunnubleImpWatsApp implements Runnable{

    @Override
    public void run() {
        new Test2().WatsAppCall();
    }
}
