package pl.altkom.zad6_11;


public class QuartersTable {

    private static String quarters[] = {"Q1", "Q2", "Q3", "Q4"};
    private static String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    static String[][] quarterRow(){
        int rows = 4;
        int columns = 4;
        String qRow[][] = new String[rows][columns];
        for(int i = 0; i < rows; i++){
            qRow[i][0] = quarters[i];
            qRow[i][1] = months[i*3];
            qRow[i][2] = months[i*3+1];
            qRow[i][3] = months[i*3+2];
        }
        return qRow;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
