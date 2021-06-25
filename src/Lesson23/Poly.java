package Lesson23;

public class Poly {

    void abc (Animals a) {
        System.out.println("A");
    }
    void abc (Dogs d) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Poly p1 = new Poly();
        Animals an2 = new Dogs();
        p1.abc(an2);
        an2.getName();

        Dogs dog_1 = new Dogs();
        dog_1.eat(); //overriding - когда название, аргументы и return type методов одинаковые
        Animals dog_2 = new Dogs();
        dog_2.eat(); // здесь будет overriding от Dogs, хотя вызван он через Animals

//        System.out.println(an1.paw);
//        System.out.println(an1.claws); каждая собака - это животное, но не каждое животное имеет когти.
//        an1.bite();

    }
}

class Animals{
    int tail = 1;
    int paw = 4;
    int eyes;
    void eat(){
        System.out.println("Eating");
    }
    void getName(){
        System.out.println("Name is animal");
    }
}

class Dogs extends Animals{
    Dogs(){
        eyes = 4;
    }
    int claws;
    void bite(){
        System.out.println("kus-kus");
    }
    @Override
    void eat(){
        System.out.println("Dogs eating ");
    }
    void getName(){
        System.out.println("Dog`s name");
    }
}

class Horse extends Animals{
    Horse(){
        eyes = 2;
    }
    void jumpUp(){
        System.out.println("Jum up 2 metres");
    }
}

final class T{}
//class B extends T{} - не может быть extends, потому что class T - final