package P2_4_Nested.LocalInnerClass;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getRes();
    }
}


class Math{
    public void getRes(){
        class Division {
            public int getElem_1() {
                return elem_1;
            }

            public void setElem_1(int elem_1) {
                this.elem_1 = elem_1;
            }

            public int getElem_2() {
                return elem_2;
            }

            public void setElem_2(int elem_2) {
                this.elem_2 = elem_2;
            }

            private int elem_1;
            private int elem_2;

            public int divisioned(){
                return elem_1/elem_2;
            }

            public int lastOfDivision(){
                return elem_1%elem_2;
            }

        }

        Division division = new Division();
        division.setElem_1(40);
        division.setElem_2(2);
        System.out.println();

    }
}