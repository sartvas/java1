package P2_8_Multithreading.DataRaceSynchronized;

//DataRace - проблема, при которой некскольо потоко обращ. к 1 переменной и как минимум 1 поток ее меняет.
//synchronized лочит метод для первого шустрого потока

public class Test {
    static int count = 0;
    public synchronized static void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thr1 = new Thread(new FastThread());
        Thread thr2 = new Thread(new FastThread());
        Thread thr3 = new Thread(new FastThread());
        thr1.start();
        thr2.start();
        thr1.join();
        thr2.join();
        System.out.println(count);

    }
}


class FastThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<1000; i++){
            Test.increment();
        }
    }
}