package P2_7_Streams.Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//помогает разделять списки или объединять по опредленному сегменту в MAP<Key:Value>

public class Collect {
    public static void main(String[] args) {
    Stream <Integer> s = Stream.of(23,56,32,2,32,12,67);

        Map<Boolean, List<Integer>> map = s.collect(Collectors.partitioningBy(e -> e>30));
        System.out.println(map);

        Car c1 = new Car("Toyota", 2.3);
        Car c2 = new Car("Lada", 1.8);
        Car c3 = new Car("Kia", 2.0);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(c1);
        carList.add(c2);
        carList.add(c3);

        Map<Double, List<Car>> mapCar = carList.stream().collect(Collectors.groupingBy(e -> e.getEngine()));
        for (Map.Entry<Double, List<Car>> entry:mapCar.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }




    }
}


class Car{
    String name;
    private double engine;

    public Car(String name, double engine) {
        this.name = name;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", engine=" + engine + '}';
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}