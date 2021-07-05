package P2_4_Nested.StaticNested;

//static nested класс очень похож на обычный, но находится внутри другого;
// создавая static nested класс, нужно указывать класс, содержащий его (см.ниже);
//может быть abstract;
//может быть extended;
//может содержать static и non-static элементы;
//может обращаться к элемертам внешнего класса, но только ststic, даже если они private;
//interface тоже может быть nested;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a; //стаик элемент

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car {" + "color='" + color + '\'' + ", doorCount=" + doorCount + ", engine=" + engine + '}';
    }

    public static class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(a); //обращаемся к статик
        }

        @Override
        public String toString() {
            return "My engine{" + "horsePower=" + horsePower + '}';
        }
    }

}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        Car car1 = new Car("White", 4, engine);
        System.out.println(car1);
    }
}