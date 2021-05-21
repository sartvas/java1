public class HomeWork14 {
    static void times(){
        hour:
        for (int h = 0; h <= 6; h++){
            minutes:
            for (int m = 0; m < 60; m++) {
                if (h > 1 && m % 10 == 0){
                    break hour;
                }
                seconds:
                for (int s = 0; s < 60; s++) {
                    if (s * h > m) {
                        continue minutes;
                        }
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }
    }


    public static void main(String[] args) {
        HomeWork14 test1 = new HomeWork14();
        times();
    }
}