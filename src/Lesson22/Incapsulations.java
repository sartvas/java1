package Lesson22;

public class Incapsulations {
    final String pol;
    Incapsulations(String pol){
        this.pol = pol;
    }

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int z){
        if(z > 0 && z < 100){
            age = z;
        }
    }

    private boolean clever;

    public boolean isClever(){
        return clever;
    }

    private int weight;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int i){
        if(i > 0 && i < 220) {
            weight = i;
        }
    }
}

class Test {
    public static void main(String[] args) {

        Incapsulations ch1 = new Incapsulations("Man");
        ch1.setName("Sergey");
        ch1.setAge(34);
        ch1.setWeight(67);
        System.out.println(ch1.getWeight());
    }
}
