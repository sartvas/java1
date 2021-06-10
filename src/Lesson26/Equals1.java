package Lesson26;

import java.util.ArrayList;

public class Equals1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v4");
        Car c2 = new Car("yellow", "v6");
        Car c3 = new Car("black", "v12");
        Car c4 = new Car("white", "v8");

        ArrayList <Car> arr = new ArrayList<>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);

         System.out.println(c1);

    }
}


class Car {
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object o){
        if (o instanceof Car) {
            Car c = (Car)o;
            return (color.equals(c.color) && engine.equals(c.engine));
        } else {
            return false;
        }
    }

    public String toString(){
        return "Color of car is "+ color +"; Engine of car is "+engine; //переписываем toString
    }
}