package pl.altkom.zad6_12;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        System.out.println(today.getDayOfWeek());
        Month m = today.getMonth();
        System.out.println(m.toString() + " " + today.getYear());
        LocalDate firstOctober = LocalDate.of(2019, Month.OCTOBER, 1);
        System.out.println(firstOctober.getDayOfWeek());

        for (DayOfWeek dow: DayOfWeek.values()) {
            System.out.printf("%3s", dow.getDisplayName(TextStyle.NARROW_STANDALONE, new Locale("pl", "PL")));
        }
        System.out.println();
        while (firstOctober.isBefore(LocalDate.of(2019, Month.NOVEMBER, 1))) {
            for (DayOfWeek dow : DayOfWeek.values()) {
                if (firstOctober.getDayOfWeek() == dow && firstOctober.isBefore(LocalDate.of(2019, Month.NOVEMBER, 1))) {
                    System.out.printf("%3s", firstOctober.getDayOfMonth());
                    firstOctober = firstOctober.plusDays(1);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
        System.out.println();


//        Locale.setDefault(Locale.CHINA);
//        DateTimeFormatter formatter
//                = DateTimeFormatter.ofPattern("dd MMMM YYYY");
//        System.out.println(formatter.format(today));
//
//        Locale locale = Locale.getDefault();
//        System.out.println(locale);
//        System.out.println(
//                NumberFormat.getCurrencyInstance()
//                        .format(99999.99));
    }
}
