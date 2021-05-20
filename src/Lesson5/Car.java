package Lesson5;

public class Car {
    public  Car (String names, String numbers, int speeds) {
        name=names;
        number=numbers;
        speed=speeds;
    }
    String name;
    String number;
    int speed;

    int speedUp(int a) {
        speed+=a;
        return speed;
    }

    int speedDown(int b){
        speed-=b;
        return speed;
    }

    void shoeInfo(){
        System.out.println("Car label "+name+" with number "+number+" speed is "+speed);
    }
}

class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","12",0);
        car1.name = "Toyota";
        car1.number = "12";
        car1.speed = 0;

        car1.shoeInfo();
        car1.speedUp(34);
        car1.shoeInfo();
    }
}
