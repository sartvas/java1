package Lesson29;

import java.time.LocalDate;

//isAfer & isBefore

public class Time3 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021,3,3);
        LocalDate ld2 = LocalDate.of(2021,5,3);

        System.out.println(ld.isAfter(ld2));
        System.out.println(ld.isBefore(ld2));
    }
}
