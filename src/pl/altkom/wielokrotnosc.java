package pl.altkom;

import java.util.Arrays;

public class wielokrotnosc {

    public static int[] countNum(int start, int end, int[] dzielniki) {
        int[] result = new int[dzielniki.length];
        for(int j = 0; j < dzielniki.length; j++) {
            int num = 0;
            for (int i = start; i <= end; i++) {
                if (i % dzielniki[j] == 0) {
                    num++;
                }
            }
            result[j] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {7, 13, 29, 43};
        System.out.println(Arrays.toString(countNum(1234, 2345, a)));
    }
}
