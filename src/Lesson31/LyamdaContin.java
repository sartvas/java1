package Lesson31;

import java.util.function.*;
import java.util.ArrayList;

public class LyamdaContin {
}

class Car{
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine){
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    public String toString(){
        return "Our Car is "+ model + " color is " + color + " and engine "+engine;
    }
}

class Test10{
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> a1 = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> consumer){
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(()->new Car("LadaVesta", "Grey", 1.6));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car ->{
            car.color = "red";
            car.engine = 1.8;
            System.out.println(car);
        });
    }
}