package pl.altkom.zad6_9;

public class Primes {
    static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int begin = 123;
        int end = 2345;
        int counter = 0;
        for (int a = begin; a <= end; a++) {
            if (isPrime(a)) {
                counter++;
            }
        }
        System.out.println(counter);


        counter = 0;

        for (int liczba = begin; liczba < end; liczba++) {
            boolean isPrime = true;
            for (int podzielnik = 2; podzielnik*podzielnik <= liczba; podzielnik++) {
                if (liczba % podzielnik == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
            }
        }

        counter = 0;

        outer:
        for (int liczba = begin; liczba < end; liczba++) {
            for (int podzielnik = 2; podzielnik*podzielnik <= liczba; podzielnik++) {
                if (liczba % podzielnik == 0) {
                    continue outer;
                }
            }
            counter++;
        }

















    }
}
