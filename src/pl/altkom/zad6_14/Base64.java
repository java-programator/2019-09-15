package pl.altkom.zad6_14;

import java.util.Arrays;
import java.util.Random;

public class Base64 {
    // są 2 sposoby rozwiązania
    // 1: jest array o długości 64 ze wszystkimi kolejno ułożonymi znakami Base64
    //    i randomowo przydzielam z niej wartości do tekstu wejściowego
    // 2: jest 1 tablica taka jak wyżej i jest 2 tablica - randomowa, która się tworzy z randomowo
    //    wyciągniętych znaków z tej 1 i z niej po kolei biore wartości to tekstu wejściowego


    // robię 1 metodę
    private static Random rand = new Random();
    private static char[] base64Array = new char[64];
    //private static int randNumber = rand.nextInt(64);

    private static void setBase64Array(){
        int position = 0;

        for(char a = 'a'; a<='z';a++){
            base64Array[position] = a;
            position++;
        }

        for(char a = 'A'; a<='Z'; a++){
            base64Array[position] = a;
            position++;
        }

        for(int i=0; i<10;i++){
            base64Array[position] = Character.forDigit(i,10);
            position++;
        }

        base64Array[position] = '/';
        position++;
        base64Array[position] = '+';
    }

    private static char[] shuffleArray(char[] array) {

        for(int i=0; i<array.length; i++){
            int index = random64();
            char temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }

    private static int random64(){
        int randomNumber = rand.nextInt(64);
        return randomNumber;
    }

    // metoda, która zwraca ciąg randomowych 4 znaków w postaci String wyciągniętych z base64Array
    private static String randomisation(){
        String out = "";
        for(int i=0; i<4; i++){
            char newSing = base64Array[random64()];
            out += newSing;
        }
        return out;
    }

    // metoda, która sprawdza, czy długość tekstu jest wielokrotnością 3, jeśli nie, dodaje na końcu słowa 0
    private static String stringIteration3(String text){
        int textLength = text.length();

        if(textLength % 3 == 0){
            return text;
        } else {
            return stringIteration3(text + "0");
        }
    }

    // metoda, która 3-znakowego Stringa zamienia na 4-znakowy
    public static String setGroupOf4(String str, char[] baseArray, char[] shuffledArray){

        int[] positions = new int[str.length()];

        String outGroupOf4 = "";
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<baseArray.length; j++){
                if(str.charAt(str.length()-1) == '0' || str.charAt(str.length()-2) == '0'){
                    outGroupOf4 += '=';
                } else if(str.charAt(i) == baseArray[j]){
                    //System.out.println(j + " " + baseArray[j]);
                    outGroupOf4 += shuffledArray[j];
                    positions[i] = j;
                }
            }
        }

        int last = positions[2] - positions[0];
        outGroupOf4 = outGroupOf4.substring(0,1) + shuffledArray[last] + outGroupOf4.substring(1);
        return outGroupOf4;
    }

    // metoda pobiera Stringa, tworzy nowego, którego długość jest wielokrotnością 3
    // następnie tworzy Stringa output, który każde 3 znaki starego zamienia na 4 znaki Base64
    public static String makeStringBase64(String word){
        String newString = stringIteration3(word);

        int countGroupOf3 = newString.length() / 3;

        String output = "";
        for(int i=0; i<countGroupOf3; i++){
            output += randomisation();
        }

        return output;
    }

    public static void main(String[] args) {
        setBase64Array();
        char[] shuffledArray = Arrays.copyOf(base64Array, base64Array.length);
        shuffledArray = shuffleArray(shuffledArray);
        //System.out.println(makeStringBase64("paulina"));

        System.out.println(setGroupOf4("lin", base64Array, shuffledArray));
        System.out.println(setGroupOf4("pau", base64Array, shuffledArray));
        System.out.println(setGroupOf4("lin", base64Array, shuffledArray));
        System.out.println(setGroupOf4("p00", base64Array, shuffledArray));
    }
}
