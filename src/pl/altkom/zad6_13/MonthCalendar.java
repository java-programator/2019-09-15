package pl.altkom.zad6_13;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MonthCalendar {

    private static Scanner scan = new Scanner(System.in);

    private static String[] weekDays = {"PN", "WT", "ŚR", "CZ", "PT", "SB", "ND"};

    public static int getUserChoice(){
        int num = scan.nextInt();
        return num;
    }

    public static boolean isInRange(int number, int year){
        if(number >= 0 && number <= 12){
            if(year > 0){
                return true;
            }
        }
        return false;
    }

    public static void showCalendar(int month, int year){

        // tworzy obiekt z dniem 1 miesiąca i roku podanego przez użytkownika
        LocalDate localDate = LocalDate.of(year, month, 1);
        //nazwa dnia tygodnia
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        // numer dnia tygodnia (1-poniedziałek, -niedziela)
        int valueDayOfWeek = localDate.getDayOfWeek().getValue();
        // oblicza długość miesiąca - czyli ilość dni w danym miesiącu
        int monthLength = localDate.lengthOfMonth();
        // String ma 2 puste spacje, któe równają się liczbie dwucyfrowej
        String empty = "  ";

        System.out.println(localDate.getMonth() + " " + localDate.getYear());
        //System.out.println("Długość miesiąca: " + monthLength);

        // tworzy tablicę int z wszystkimi dniami miesiąca od 1 do monthLength
        int[] monthDays = new int[monthLength];

        for(int i=0; i<monthLength; i++){
            monthDays[i] = i+1;
        }

        // tworzy tablicę Stringów, na początku uzupełnia ją o tyle obiektów empty ile jest dni
        // tygodnia przed dniem wybranym przez użytkownika
        String[] array = new String[monthLength + valueDayOfWeek - 1];

        for(int i=0; i<array.length; i++) {
            if (i < valueDayOfWeek - 1) {
                array[i] = empty;
            }
        }

        for(int j=0; j<monthDays.length; j++){
            if(monthDays[j]<10){
                array[j+valueDayOfWeek-1] = " " + String.valueOf(monthDays[j]);
            } else{
                array[j+valueDayOfWeek-1] = String.valueOf(monthDays[j]);
            }
        }

        // wypisuje nazwy dni tygodnia
        for(String day : weekDays){
            System.out.print(day + " ");
        }

        // wypisuje dni tygodnia z tablicy Stringów
        for(int i=0; i<array.length; i++){
            if(i % 7 == 0){
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        /*
        boolean check = false;
        while(!check){
            System.out.println("Kalendarz dla którego miesiąca chcesz obejrzeć?");
            System.out.println("Podaj cyfrę od 1 do 12");
            int userInputMonth = getUserChoice();
            System.out.println("Podaj rok:");
            int userInputYear = getUserChoice();
            check = isInRange(userInputMonth, userInputYear);
            // podać userInput do metody, która wyświetli kalendarz
            showCalendar(userInputMonth, userInputYear);
        }
         */
        /*
        LocalDate today = LocalDate.now();

        //Locale locale = Locale.getDefault();
        //System.out.println(locale);
        Locale.setDefault(Locale.GERMAN);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
        System.out.println(formatter.format(today));
        System.out.println(NumberFormat.getCurrencyInstance().format(99999.99));
         */


    }
}
