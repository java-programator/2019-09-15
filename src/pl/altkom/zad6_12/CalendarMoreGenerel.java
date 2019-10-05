package pl.altkom.zad6_12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarMoreGenerel {

    public static void printCalendar(LocalDate today) {
        LocalDate begin = LocalDate.of(today.getYear(), today.getMonth(), 1);
        LocalDate end = begin.plusMonths(1);
        Month m = today.getMonth();
        System.out.println(m.toString() + " " + today.getYear());
        for (DayOfWeek dow: DayOfWeek.values()) {
            System.out.printf("%3s", dow.getDisplayName(TextStyle.NARROW_STANDALONE, new Locale("pl", "PL")));
        }
        System.out.println();
        while (begin.isBefore(end)) {
            for (DayOfWeek dow : DayOfWeek.values()) {
                if (begin.getDayOfWeek() == dow && begin.isBefore(end)) {
                    System.out.printf("%3s", begin.getDayOfMonth());
                    begin = begin.plusDays(1);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2020, Month.DECEMBER, 24);
        printCalendar(today);



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
