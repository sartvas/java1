package P2_8_Multithreading.WakeNotify;

public class ByBread {
}

class Market {
    private int breadcount = 0;

    public synchronized void PutBread() {
        while (breadcount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadcount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Осталось " + breadcount + " хлеба");
        notify();
    }

    public synchronized void GetBread() {
        while (breadcount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadcount++;
        System.out.println();
        System.out.println("Испекли 1 хлеб");
        System.out.println("Осталось " + breadcount + " хлеба");
        notify();
    }

    public static void main(String[] args) {
        Market market = new Market();
        Seller seller = new Seller(market);
        Consumer consumer = new Consumer(market);
        Thread sellerThread = new Thread(seller);
        Thread consumerThread = new Thread(consumer);
        sellerThread.start();
        consumerThread.start();

    }
}

class Seller implements Runnable{
    Market market;
    Seller(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.PutBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;
    Consumer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.GetBread();
        }
    }
}