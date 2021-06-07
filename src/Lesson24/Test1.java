package Lesson24;

public class Test1 {
    public static void main(String[] args) {
        A class1 = new B(); //экземпляры наследников абстрактного класса создавать можно.

    }
}

abstract class A {
    abstract void abc();
}

class B extends A{
    public void abc(){ // дочерний класс должен перезаписать все методы абстрактного класса
        System.out.println("B");
    }
}

abstract class C extends A{ //у наследника abstract класса
    void abc(B b2){
        System.out.println("C");
    }
}