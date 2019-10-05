package pl.altkom.zad6_11;

public class PrintAsTable {

    private static void printLeft(String[] col, String[] data){
        System.out.println();

        for(int i=0; i<col.length; i++){
            System.out.printf("%-10s", col[i]);

            for(int j=i*3; j<(i+1)*3; j++){
                System.out.printf("%15s", data[j]);
            }
            System.out.println();
        }
    }

    private static void printUpper(String[] col, String[] data){

        System.out.println();
        int rowLength = data.length/col.length;

        for(String i : col){
            System.out.printf("%13s", i);
        }
        System.out.println();

        for(int i=0; i<rowLength; i++) {
            for (int j = i; j < data.length; j+=col.length - 1) {
                System.out.printf("%13s", data[j]);
            }
            System.out.println();
        }
    }

    public static void ifIteration(String[] col, String[] data){
        int colLength = col.length;
        int dataLength = data.length;

        if(dataLength % colLength == 0){
            printLeft(col, data);
            printUpper(col, data);
        } else{
            System.out.println("Tablica z danymi jest zła!!!");
        }
    }

    public static void main(String[] args) {
        String[] months = {"styczen", "luty", "marzec", "kwiecien",
                "maj", "czerwiec", "lipiec", "sierpien", "wrzesien",
                "pazdziernik", "listopad", "grudzien"};

        String[] quarter = {"[kw. I]", "[kw. II]", "[kw. III]", "[kw. IV]"};

        ifIteration(quarter, months);

        String name = "Paulina";
        System.out.println();
        System.out.printf("Cześć, jestem %-20s :)\n", name);
        System.out.printf("Cześć, jestem %20s :)", name);
    }
}
