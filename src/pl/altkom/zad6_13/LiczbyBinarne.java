package pl.altkom.zad6_13;

public class LiczbyBinarne {
    public static void main(String[] args) {
        byte a = 1;
        byte b = (byte) (a << 4);
        System.out.println(b);

        byte c = 27;

        for(int i=6; i>=0; i--){
            if((c & (1<<i)) != 0){
                System.out.print(1);
            } else{
                System.out.print(0);
            }
        }
    }
}
