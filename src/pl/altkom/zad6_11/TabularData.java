package pl.altkom.zad6_11;

public class TabularData {

    public static void formatTable(String h[], String d[]) {
        int rowLength = d.length/h.length;
        for (int i = 0; i < h.length; i++) {
            System.out.printf("%10s", h[i]);
            for (int j = i*rowLength; j < (i+1)*rowLength; j++) {
                System.out.printf("%13s", d[j]);
            }
            System.out.println();
        }
    }

    public static void formatTable2(String[] h, String d[]) {
        int rowLength = d.length/h.length;
        for (int i = 0; i < h.length; i++) {
            System.out.printf("%-13s", h[i]);
        }
        System.out.println();
        for (int i = 0; i < rowLength; i++) {
            for (int j = i; j < d.length; j+=h.length-1) {
                System.out.printf("%-13s", d[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String [] headers = {"kw I", "kw II", "kw III", "kw IV"};
        String data[] = {"styczeń", "luty", "marzec",
        "kwiecień", "maj", "czerwiec", "lipiec", "sierpień",
        "wrzesień", "październik", "listopad", "grudzień"};
        formatTable2(headers, data);
//        String name = "Paweł";
//        int age = 30;
//        System.out.printf("Cześć, jestem %-20s, mam %d lat", name, age);
    }
}
