package P2_8_Multithreading.SetGetNameAndPriority;

public class Test1 {
    public static void main(String[] args) {
        Thread tr1 = new Thread(new MyThread1());
        Thread tr2 = new Thread(new MyThread2());

        tr1.setName("First thread");
        tr1.setPriority(7);
        tr2.setPriority(Thread.NORM_PRIORITY);

        System.out.println("Name of tr1 = " + tr1.getName() + "priority of tr1 = "+ tr1.getPriority());
        System.out.println("Name of tr2 = " + tr2.getName() + "priority of tr2 = "+ tr2.getPriority());

    }
}

class MyThread1 implements Runnable{
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for(int i = 100; i >= 0; i--){
            System.out.println(i);
        }
    }
}