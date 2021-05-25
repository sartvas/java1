package Ashildt;

public class Ch1 {
    public static void main(String[] args) {
        double metres = 0, inches;
        int foot = 0;
        for(inches = 1; inches < 144; inches++){
            metres = inches * 0.025;
            System.out.println(metres);
            foot++;
            if(foot == 12){
                System.out.println("А вот и фут");
                foot = 0;
            }
        }
    }
}
