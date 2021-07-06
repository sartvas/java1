package P2_6_Lambdas.Lamb1;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Suplier {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for(int i = 0; i <= 3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Vesta", "Silver", 1.7));
        System.out.println(ourCars);
     }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", color='" + color + '\'' + ", engine=" + engine + '}';
    }
}
