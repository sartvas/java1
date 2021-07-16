package P2_8_Multithreading.LockReentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat{
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee emp1 = new Employee("Artom", lock);
        Employee emp2 = new Employee("Artur", lock);
        Employee emp3 = new Employee("Irina", lock);
        Employee emp4 = new Employee("Vassya", lock);
        Thread.sleep(2000);
        Employee emp5 = new Employee("Henry", lock);
        Employee emp6 = new Employee("Irina", lock);
        Employee emp7 = new Employee("Janna", lock);
        Employee emp8 = new Employee("Loky", lock);
    }
}

class Employee extends Thread{
    Lock lock;
    String name;
    Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run(){
        if(lock.tryLock()) {
            try {
                System.out.println(name + " ждёт в очереди");
                Thread.sleep(2000);
                System.out.println(name + " начал пользоваться банкоматом");
                System.out.println(name + " закончил пользоваться банокматом");
            } catch (InterruptedException e) {
                e.printStackTrace();

            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать и уходит");
        }
    }
}