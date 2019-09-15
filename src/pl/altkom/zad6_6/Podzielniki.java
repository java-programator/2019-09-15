package pl.altkom.zad6_6;

public class Podzielniki {

    public static int liczbaPodzielnikow(int begin, int end, int dzielna) {
        int result = 0;
        for (int i = begin; i <= end; i++) {
            if (i % dzielna == 0) {
                result++;
            }
        }
        return result;
    }

    public static int[] rozwiazanieZadania(int begin, int end, int ... podzielniki) {
        int result[] = new int[podzielniki.length];
        for (int i = 0; i < podzielniki.length; i++) {
            result[i] = liczbaPodzielnikow(begin, end, podzielniki[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int r1[] = rozwiazanieZadania(123, 2345, new int[]{7, 23, 29});
        int r2[] = rozwiazanieZadania(123, 2345, 7, 39, 57);
    }
}
