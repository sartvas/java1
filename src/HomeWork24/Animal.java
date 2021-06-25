package HomeWork24;

abstract class Animal {
    public String name;
    Animal(String name){
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{
    public Fish(String name){
        super(name);
    }
    public void sleep(){
        System.out.println("I`d like to see, how fish sleeping");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    public Bird(String name){
        super(name);
    }
    abstract void fly();
    public void speak(){
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable{
    public Mammal(String name){
        super(name);
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speak");
    }
}
class SwordsmanFish extends Fish{
    public SwordsmanFish(String name){
        super(name);
    }
    public void swim(){
        System.out.println("This fish is very fast");
    }
    public void eat(){
        System.out.println("This fish i not a predator, he is herbivore");
    }
}