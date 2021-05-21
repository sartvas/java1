package Lesson14;

public class Test2 {
    public void time() {
        OUTER: for (int h = 0; h <= 23; h++){

            INNER: for (int m = 0; m <= 59; m++) {

                System.out.println(h + ":" + m);
                if(m == 30) {
                    break OUTER;
                }

            }

        }
    }

    public static void main(String[] args) {
        Test2 tst = new Test2();
        tst.time();
    }
}

