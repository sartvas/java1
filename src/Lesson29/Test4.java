package Lesson29;

import java.time.LocalDate;
import java.time.Period;

//methods Period.ofWeeks, Period.ofMonth, Period.ofYears, Period.ofDays

public class Test4 {
    static void duty(LocalDate start, LocalDate end, Period p){
        LocalDate date = start;
        while(date.isBefore(end)){
            System.out.println("Duty call! Now "+date+" We need next man!");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2021,9,01);
        LocalDate end = LocalDate.of(2022, 5, 30);
        Period p = Period.ofWeeks(3);
        //duty(start, end, p);
    }
}
