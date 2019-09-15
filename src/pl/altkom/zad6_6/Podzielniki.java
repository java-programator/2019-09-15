package pl.altkom.zad6_6;

import java.util.Arrays;

public class Podzielniki {

    public static int count(int start, int end){
        int count7 = 0;
        int count13 = 0;
        int count29 = 0;
        int count43 = 0;

        for(int i=start; i<end+1; i++){
            // if(i % 7 == 0){
            //        count7++;
            //   }


            //   if(i % 13 == 0){
            //      count13++;
            //   }

            // if(i % 29 == 0){
            //      count29++;
            //  }

            if(i % 43 == 0){
                count43++;
            }
        }
        //return count7;
        // return count13;
        // return count29;
        return count43;

    }

    public static int[] countIt(int start, int end, int[] count){
        int[] result = new int[count.length];

        for(int i=0; i<count.length; i++){
            for(int j=start; j<end+1; j++){
                if(j % count[i] == 0){
                    result[i] = result[i] + 1;
                }
            }
        }
        return result;
    }

    // rozwiązanie prowadzącego
    /*
    public static int liczbaPodzielników(int start, int end){



    }

    public static int[] rozwiazanieZadania(int begin, int end, int ... podzielniki){
        int result[] = new int[podzielniki.length];
        for(int i=0; i<podzielniki.length; i++){
            result[i] = liczbaPodzielników(begin, end, )
        }
    }

     */

    public static void main(String[] args) {
        int start = 1234;
        int end = 2345;
        int[] tab = {7, 13, 29, 43};

        System.out.println(count(start, end));
        System.out.println(Arrays.toString(countIt(start, end, tab)));
    }

}
