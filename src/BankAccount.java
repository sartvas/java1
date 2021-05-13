public class BankAccount {
    String name;
    int age;
    double money;

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        BankAccount ba2 = new BankAccount();
        ba.name = "Artem";
        ba.age = 45;
        double money = 10000.0;
        ba = ba2;
        ba2.name = "Ramil";

        System.out.println(ba.name);
    }
}
