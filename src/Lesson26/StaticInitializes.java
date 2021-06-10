package Lesson26;

//Static & non-static inizialized blocks
//Static inizialized blocks - вызывается 1 раз за класс
//non-static inizialized blocks - вызывается каждый раз за класс при создании объекта
//Если в package несколько классов, вызываются все inizialized blocks согласно правилу

public class StaticInitializes {
    int a = 0; //Первый по вызову
    StaticInitializes(){
        a = 2; //Третий по вызову
        System.out.println("New object created");
    }
    {
        System.out.println("New inizialized block"); // срабатывает, когда создается объект, всегда  первей конструктора
        a = 3; //второй по вызову
    }
     static {
        System.out.println("New static inizialized block1"); // срабатывает 1 раз
    }

    public static void main(String[] args) {
        StaticInitializes obj1 = new StaticInitializes();
        StaticInitializes obj2 = new StaticInitializes();
        System.out.println(obj2.a); //2
    }
}
