package pl.altkom.zad6_7;

import java.util.Scanner;

public class BMICounter {
    static double bmi(double weight, double height) {
        return weight/(height*height);
    }

    static void printClassification(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi < 25) {
            System.out.println("Waga w normie");
        } else {
            System.out.println("Nadwaga");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wage: ");
        double weight = scanner.nextDouble();
        System.out.println("Podaj wzrost");
        double height = scanner.nextDouble();

        double bmi = bmi(weight, height);
        printClassification(bmi);
    }
}
