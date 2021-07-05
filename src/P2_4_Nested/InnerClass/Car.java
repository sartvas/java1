package P2_4_Nested.InnerClass;

//Каждый объект InnerClass всегда ассоциируется с объектом внешнего класса;
//Создавая объект InnerClass, нужно пере этим создать объект внешнего класса;
//InnerClass может содержать только non-static элементы;
//InnerClass может обращаться к private элементам внешнего класса;
//Внешний класс может обращаться даже private элементам InnerClass, но только создав его объект;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a; //стаик элемент

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "My car {" + "color='" + color + '\'' + ", doorCount=" + doorCount + ", engine=" + engine + '}';
    }

    public class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine{" + "horsePower=" + horsePower + '}';
        }
    }

}

class Test{
    public static void main(String[] args) {
        Car car = new Car("White", 2, 180);
    }
}