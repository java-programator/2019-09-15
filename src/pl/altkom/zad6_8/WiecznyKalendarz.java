package pl.altkom.zad6_8;

public class WiecznyKalendarz {
    public static int dayOfWeek(int y, int m, int d) {
        int z = m < 3 ? y - 1 : y;
        int c = m < 3 ? 0 : 2;
        return ((23*m/9) + d + 4 + y + (z/4) - (z/100) + (z/400) -c) % 7;
    }

    public static void main(String[] args) {
        System.out.println(dayOfWeek(2019, 9, 15));
    }
}
