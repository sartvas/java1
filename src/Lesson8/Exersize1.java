package Lesson8;

public class Exersize1 {
    static double multpl(double a, double b, double c){
        return a * b * c;
    }
    static void dvsn(double a, double b){
        System.out.println("Devision is "+a / b+";"+" rest of the devision is "+a % b);
    }
}

class Exersize11 {
    public static void main(String[] args) {
        System.out.println(Exersize1.multpl(4,6,7.8));
        Exersize1.dvsn(10, 4);
    }
}
