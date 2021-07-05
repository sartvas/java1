package P2_4_Nested.Anonimus;

public class Anonimus {
    public static void main(String[] args) {
        OtherCase other = new OtherCase() {
            @Override
            public int doSomethig(int a, int g) {
                return a*g;
            }
        };

        System.out.println(other.doSomethig(4,5));

    }

}

interface OtherCase{
    int doSomethig(int a, int g);
}