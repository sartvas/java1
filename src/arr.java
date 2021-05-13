public class arr {
    public static void main(String[] args) {
        int[] mass = new int[900];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i +100;
        }
        int[] mass2 = new int[mass.length];
        for (int i = 0, j = mass2.length - 1; i < mass2.length; i++, j--) {
            mass2[j] = mass[i];
            System.out.println(mass2[i]);
        }
    }
}
