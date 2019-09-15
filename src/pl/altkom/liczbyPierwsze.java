package pl.altkom;

public class liczbyPierwsze {

    static int numOf (int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    result++;
                    System.out.print(i + " ");
                    break;
                } else if (i % j == 0) {
                    break;
                } else if (i % j != 0){
                    continue;
                }
            }
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numOf(2, 100));
    }

}
