package Lesson29;

import java.time.*;

//LocalDate* all is immutable
// plusDays, minusDays, plusWeeks, minusWeeks, plusMonth, minusMonth, plusYears, minusYears
//plusHours, minusHours, plusMinutes, minusMinutes, plusNanos, minusNanos

public class Time2 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2021,6,16);
        ld.plusDays(5);
        System.out.println(ld); // immutable
        ld = ld.plusDays(15);
        System.out.println(ld); //+5
    }
}
