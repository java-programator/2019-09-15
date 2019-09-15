package pl.altkom.zad6_9;

public class LiczbyPierwsze {

    // optymalizacje
    // można szukać podzielników z przedziału <= a/2
    // a jeszcze lepszy z  przedziału <= Math.sqrt(a)

    public static int countPrimes(int start, int end) {
        int countPodzielniki = 0;
        int countPrimes = 0;

        for (int i = start; i < end + 1; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    countPodzielniki++;
                }
            }
            if (countPodzielniki > 0) {
                countPrimes++;
            }
        }
/*
        if(countPrimes == 0){
            return true;
        }
        return false;
    }
 */
        return countPrimes;
    }

    // rozwiązanie prowadzącego

    public static void main(String[] args) {
        int start = 1234;
        int end = 2345;

        System.out.println(countPrimes(start, end));

        // break - przerywa całą pętle
        // continue wychodzi z obliczeń do pierwszej pętli
    }
}
