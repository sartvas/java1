package Lesson4;

public class BankAccount {
    String name;
    int age;
    double money;

    double increaseBalance (double increaseMeaning) {
        money+=increaseMeaning;
        return money;
    }

    double reduceBalance (double reduceMeaning) {
        money-=reduceMeaning;
        return money;
    }
}

class Operations {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.name = "Artem";
        ba.age = 45;
        ba.money = 10000.0;
        ba.reduceBalance(654);
        ba.increaseBalance(789);
        System.out.println(ba.money);
    }
}