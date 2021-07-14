package P2_8_Multithreading.SleepJoin;

//Есть 3 состяния потока: NEW --> Runnable (состоит из ready & running) --> Terminated

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thread trd1 = new Thread(new NewThread());
        Thread trd2 = new Thread(new AnotherTrhread());
        trd1.setName("Поток номер 1");
        trd2.setName("Поток номер 2");
        trd2.setPriority(9);
        trd1.setPriority(Thread.MIN_PRIORITY);
        trd1.start();
        trd2.start();
        trd1.join(); //просит выполниться поток после trd1
        trd2.join(4000); //просит выполниться через 4 сек, или раньше, если trd2 закончит раньше
        System.out.println("Finish");
    }
}

class NewThread implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " " +i);
        }
    }
}

class AnotherTrhread implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +" "+ i);
        }
    }
}