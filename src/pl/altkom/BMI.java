package pl.altkom;

public class BMI {
    static void findBMI(double wzrost, double waga) {
        double bmi = waga / (wzrost * wzrost);
        if(bmi < 18.5) {
            System.out.println("Masz niedowagę");
        } else if (bmi < 25) {
            System.out.println("Masz wartość prawidłową");
        } else if (bmi < 30) {
            System.out.println("Masz nadwagę");
        } else {
            System.out.println("Masz stopień otyłości");
        }
    }

    public static void main(String[] args) {
        findBMI(1.88, 86);
    }
}
