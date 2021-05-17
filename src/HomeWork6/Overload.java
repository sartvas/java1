package HomeWork6;

public class Overload {
    public void summ(){
        System.out.println("Нет элементов, сумма равна 0");
    }
    public void summ(int a, int b){
        System.out.println("Сумма элементов равна "+(a+b));
    }
    public void summ(int a, int b, int c){
        System.out.println("Сумма элементов равна "+(a+b+c));
    }
}
