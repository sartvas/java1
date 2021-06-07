package HomeWork22;

public class Animal {
    Animal(){
        System.out.println("I`am an animal!");
    }
    int eyes;

    public void eat(){
        System.out.println("Eat");
    }
    public void drink(){
        System.out.println("Drinks");
    }

}

class Pet extends Animal{
    Pet(){
        System.out.println("I`am a new pat");
        eyes = 2;
    }
    String name;
    int tale = 1;
    int paw = 4;
    public void run(){
        System.out.println("Run");
    }
}

class Dog extends Pet {
    Dog(String name){
        this.name = name;
        System.out.println("I am a dog, and my name is "+name);
    }
    public static void play(){
        System.out.println("Playing");
    }
}

class Cat extends Pet {
    protected Cat(String name){
        this.name = name;
        System.out.println("Hi, i am a cat, and my name is "+name);
    }
    public void sleep(){
        System.out.println("Sleeps");
    }
}


