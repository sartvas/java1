package Lesson28;

public class Exceptions5 {
}

class Plane{
    String condition = "flying";

    public void planeIsFlying(){
        condition = "flying";
        System.out.println("Plane is flying");
    }

    public void planeIsWaiting(){
        if(condition.equals("flying")){
            throw new IllegalStateException("Plane is flying NOW!");
        }
        condition = "waiting";
        System.out.println("Plane is waiting");
    }

    public void flightCancellation(){
        if(condition.equals("flying")){
            throw new IllegalStateException("Plane is flying NOW!");
        }
        condition = "canceled";
        System.out.println("Plane is canceled");
    }
}
