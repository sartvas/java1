package Lesson29;

import java.time.*;
import java.time.LocalTime;
import java.time.format.*;

//getDayOf.....week, month, yeras
//getSeconds, Hours, Nano, Minutes
//DateTimeFormatter - редактор вывода даты
//ofPattern - свой формат даты

public class Time5 {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        LocalDate anotherDate = LocalDate.of(2201,3,2);
        LocalDateTime ldt = LocalDateTime.of(2201,3,2, 23, 3, 56);
        System.out.println(anotherDate.getDayOfWeek());

        LocalTime lt = LocalTime.now();
        System.out.println(lt.getHour());

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); //нормальная дата
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM, yyyy года, hh:mm"); //нормальная дата
        System.out.println(nowDate);
        System.out.println(nowDate.format(dtf2));
    }
}


