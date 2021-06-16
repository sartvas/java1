package Lesson29;

import java.time.Duration; // Duration class
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Time4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021,3,4);
        LocalTime lt = LocalTime.of(12,4);
        Duration d = Duration.ofHours(3);
        Duration d2 = Duration.ofDays(3);
        Period p = Period.ofDays(3);
        System.out.println(lt.plus(d));
        System.out.println();

    }
}
