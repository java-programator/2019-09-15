package pl.altkom.zad6_8;

import java.time.LocalDate;
import java.time.Month;

public class PerpetualCalendar {

    public static int Day(int dayOfMonth, int month, int year){
        int z = month < 3 ? year - 1 : year;
        int c = month < 3 ? 0 : 2;

        int d = ((23*month/9) + dayOfMonth + 4 + year + (z/4) - (z/100) + (z/400) - c) % 7;

        return d;
    }

    public static String DayString(int d){
        String[] weekDay = {"Niedziela", "Poniedziałek", "Wtorek", "Sroda", "Czwartek", "Piątek", "Sobota"};
        return weekDay[d];
    }


    public static void main(String[] args) {
        System.out.println(DayString(Day(10, 11, 1990)));

        LocalDate d = LocalDate.of(1969, Month.JULY, 20);
        //System.out.println(d.);

        System.out.println(DayString(Day(15, 9, 2019)));
    }

}
