package pl.altkom;

public class fibo {
    static int numFibo(int n) {
        if ( n == 1) {
            return 1;
        } else if ( n == 0) {
            return 0;
        } else {
            return  numFibo(n -1) + numFibo( n -2);
        }
    }

    public static void main(String[] args) {
        int begin = 123;
        int end = 2345;

        int f;
        int n = 0;
        int counter = 0;

        do {
            f = numFibo(n);
            n++;
            if (f >= begin && f <= end) {
                counter++;
            }
        } while(f < end);
        System.out.println(counter);
    }
}
