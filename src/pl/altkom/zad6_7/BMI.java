package pl.altkom.zad6_7;

import java.util.Scanner;

public class BMI {

    static public double bmiCounter(double w, double h){
        double bmi = w/(h*h);
        return bmi;
    }

    public static String bmiDiagnose(double bmi){
        String result = "";
        if(bmi < 18.5){
            result = "Masz niedowagę";
            // nie ma potrzeby dawać kolejnego przedziału jako bmi >= 18.5 && bmi <= 24.99, bo to wynika z tego, że program przeszedł już do else ifa
        } else if(bmi <= 24.99){
            result = "Twój stosunek masy ciała do wzrostu jest prawidłowy";
        } else {
            result = "Masz nadwagę";
        }
        return result;
    }

    public static String bmiDiagnose2(double weight, double height){
        double bmi = bmiCounter(weight, height);
        String result = "";
        if(bmi < 18.5){
            result = "Masz niedowagę";
            // nie ma potrzeby dawać kolejnego przedziału jako bmi >= 18.5 && bmi <= 24.99, bo to wynika z tego, że program przeszedł już do else ifa
        } else if(bmi <= 24.99){
            result = "Twój stosunek masy ciała do wzrostu jest prawidłowy";
        } else {
            result = "Masz nadwagę";
        }
        return result;
    }

    // wpisujemy z przecinkiem, ale w programie trzeba używać kropki jako separatora
    // przecinek jest separatorem dla Polski
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wagę w kg: ");
        double weight = sc.nextDouble();
        System.out.println("Podaj wzrost w metrach: ");
        double height = sc.nextDouble();
        System.out.println(bmiCounter(weight, height));

        //System.out.println(bmiDiagnose(bmiCounter(weight, height)));

        System.out.println(bmiDiagnose2(weight, height));
    }
}
