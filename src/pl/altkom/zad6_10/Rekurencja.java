package pl.altkom.zad6_10;

public class Rekurencja {
    static int silnia(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }

    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
//        int m = silnia(5);
        // = 5 * silnia(4)
        // = 5 * 4 * silnia(3) =
        // = 5 * 4 * 3 * silnia(2) =
        // = 5 * 4 * 3 * 2 * silnia(1) =
        // = 5 * 4 * 3 * 2 * 1 * silnia(0) =
        // = 5 * 4 * 3 * 2 * 1 * 1

        int begin = 123;
        int end = 2345;

        int f;
        int n = 0;
        int counter = 0;

        do {
            f = fib(n);
            n++;
            if (f >= begin && f <= end) {
                counter++;
            }
        } while (f <= end);

        System.out.println(counter);













    }
}
