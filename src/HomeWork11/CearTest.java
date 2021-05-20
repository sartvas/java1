package HomeWork11;

public class CearTest {

    void changeDoors(Car c, int doors){
        c.doors = doors;
    }

    void changeColor (Car c1, Car c2){
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }
    public static void main(String[] args) {
        CearTest car3 = new CearTest();
        Car c1 = new  Car("White", "1.6", 4);
        Car c2 = new  Car("Black", "1.8", 5);
        car3.changeDoors(c1, 5);
        car3.changeColor(c1, c2);
        System.out.println();
    }
}
