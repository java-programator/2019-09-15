package pl.altkom.zad6_12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar {

    public static void getMonthCalendar(int year, int month){
        LocalDate firstDay = LocalDate.of(year, month, 1);
        int nextMonth = month == 12 ? 1 : month+1;
        int nextYear = nextMonth == 1 ? year+1 : year;
        LocalDate secondMonthDay = LocalDate.of(nextYear, nextMonth, 1);

        System.out.println(firstDay.getMonth() + " " + firstDay.getYear());
        System.out.println(firstDay.getDayOfWeek());

        for(DayOfWeek day : DayOfWeek.values()){
            System.out.printf("%3s", day.getDisplayName(TextStyle.NARROW_STANDALONE, new Locale("pl", "PL")));
        }

        System.out.println();

        while(firstDay.isBefore(secondMonthDay)){
            for(DayOfWeek day : DayOfWeek.values()){
                if(firstDay.getDayOfWeek() == day && firstDay.isBefore(secondMonthDay)){
                    System.out.printf("%3s", firstDay.getDayOfMonth());
                    firstDay = firstDay.plusDays(1);
                } else{
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //LocalDate today = LocalDate.now();
        //Month m = today.getMonth();
        //System.out.println(m.toString() + " " + today.getYear());
        /*
        LocalDate firstOctober = LocalDate.of(2019, Month.DECEMBER, 1);
        System.out.println(firstOctober.getMonth() + " " + firstOctober.getYear());
        System.out.println(firstOctober.getDayOfWeek());

        for (DayOfWeek dow: DayOfWeek.values()) {
            System.out.printf("%3s", dow.getDisplayName(TextStyle.NARROW_STANDALONE, new Locale("pl", "PL")));
        }
        System.out.println();
        while (firstOctober.isBefore(LocalDate.of(2020, Month.JANUARY, 1))) {
            for (DayOfWeek dow : DayOfWeek.values()) {
                if (firstOctober.getDayOfWeek() == dow && firstOctober.isBefore(LocalDate.of(2020, Month.JANUARY, 1))) {
                    System.out.printf("%3s", firstOctober.getDayOfMonth());
                    firstOctober = firstOctober.plusDays(1);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
         */

        getMonthCalendar(2020,12);
        getMonthCalendar(1990, 11);

    }
}
