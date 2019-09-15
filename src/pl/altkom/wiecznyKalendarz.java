package pl.altkom;

import java.time.LocalDate;
import java.time.Month;

public class wiecznyKalendarz {
    static void dayOfTheWeek(int d, int m, int y) {
        String[] dniTygodnia = {"Niedziela", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota"};
        int z = m < 3 ? y - 1 : y;
        int c = m < 3 ? 0 : 2;
        d = ((23*m/9) + d + 4 + y + (z/4) - (z/100) + (z/400) - c) % 7;
        System.out.println("the day is: " + dniTygodnia[d]);
    }

    public static void main(String[] args) {
        LocalDate d = LocalDate.of(1969, Month.JULY, 20);
        System.out.println(d.getDayOfWeek());

        dayOfTheWeek(20, 7, 1969);
    }
}
