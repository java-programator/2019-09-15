package pl.altkom.zad6_10;

public class Rekurencja {

    static int silnia(int n){
        if (n == 0){
            return 1;
        } else{
            return n * silnia(n-1);
        }
    }

    static int fibonaccie(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else{
            return fibonaccie(n-1) + fibonaccie(n-2);
        }
        /*
        n = 5
        = fib(4) + fib(3) =
        = fib(3) + fib(2) + fib(2) + 1 =
        = FIB(2) + fib(1) + fib(1) + fib(0) + 1 =
        = fib(1) + fib(0) + 1 + 0 + 1 =
        = 1 + 0 + 1 + 0 + 1
         */
    }

    public static void main(String[] args) {
        int m = silnia(5);
        /*
        = 5 * silnia(4) =
        = 5 * 4 * silnia(3) =
        = 5 * 4 * 3 * silnia(2) =
        = 5 * 4 * 3 * 2 * silnie(1) =
        = 5 * 4 * 3 * 2 * 1 * silnie(0)=
        = 5 * 4 * 3 * 2 * 1 * 1
         */
        int start = 1234;
        int end = 2345;

        int f;
        int n = 0;
        int counter = 0;

        do{
            f = fibonaccie(n);
            n++;
            if(f >= start && f <= end){
                counter++;
            }
        } while(f <= end);

        System.out.println(counter);
    }

}
