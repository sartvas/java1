package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//LocalDate, LocalTime, LocalDateTime

public class Time1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        //LocalDate OF, создаем объект без NEW
        // Метод создания не важен
        LocalDate ld1 = LocalDate.of(2021,7,14);
        LocalDate ld2 = LocalDate.of(2021, Month.APRIL, 13);

        LocalTime lt1 = LocalTime.of(23, 32 , 0); //23:32

        LocalDateTime ldt = LocalDateTime.of(2021,Month.DECEMBER,23,21,34,0);

        LocalDateTime ldt2 = LocalDateTime.of(ld1,lt1);
        System.out.println(ldt2);

    }
}
