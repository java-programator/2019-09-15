package pl.altkom.zad6_11;

import java.util.Arrays;

public class QuartersTable {

    public static void kwartalyWiersze(String[] headers, String[] columns){
        String tab1[][] = new String[4][4];
        int q = 0;
        int m = 0;
        for (int i = 0; i < tab1.length; i++){
            for (int j = 0; j < tab1[i].length; j++){
                if (j == 0){
                    tab1[i][j] = headers[q];
                    q++;
                }
                else {
                    tab1[i][j] = columns[m];
                    m++;
                }
            }
            System.out.println(Arrays.toString(tab1[i]));
        }
    }

//    public static void kwartalyKolumny(String[] headers, String[] columns){
//        String tab1[][] = new String[4][4];
//        int q = 0;
//        int m = 0;
//        for (int i = 0; i < tab1.length; i++){
//            for (int j = 0; j < tab1[i].length; j++){
//                if (i == 0){
//                    tab1[i][j] = headers[q];
//                    q++;
//                }
//                else {
//                    tab1[i][j] = columns[];
//                }
//            }
//            System.out.println(Arrays.toString(tab1[i]));
//        }
//    }


    public static void main(String[] args) {
        String quarters[] = {"[Q1]", "[Q2]", "[Q3]", "[Q4]"};
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        kwartalyWiersze(quarters, months);


    }
}
