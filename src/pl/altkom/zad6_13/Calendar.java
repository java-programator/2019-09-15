package pl.altkom.zad6_13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar {
    public static void main(String[] args) {
        //LocalDate today = LocalDate.now();
        //Month m = today.getMonth();
        //System.out.println(m.toString() + " " + today.getYear());
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

    }
}
