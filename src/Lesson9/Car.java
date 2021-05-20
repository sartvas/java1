package Lesson9;

public class Car {

    String color;
    int a = 10;
    String engine;
    static int count;

    public Car(String color, String engine) {
        int x = 1; // локальные переменные конструктора видны только в нём
        int y = x +10; // обязательно должны быть инициализированы
        count++;
        this.color = color;
        this.engine = engine;
    }
     public void showColor(){
         System.out.println("The auto`s color is "+color);
     }

     public void changeColor(String colors){
         System.out.println("The auto`s color is changed, now color is "+colors);
         int price = 5000;
         color = colors;
         price += 1000;

     }

    public static void main(String[] args) {
        Car c = new Car("Red","v6");
        System.out.println(c.color);
        c.changeColor("Black");
        System.out.println(c.color);
    }
}
