package HomeWork11;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    public int changeDoors(int a){
        doors = a;
        return doors;
    }

    public static void changeColor (Car c1, Car c2){
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }
}
