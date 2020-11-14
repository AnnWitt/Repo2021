package Zadania.Zadaniad1;

public class Zadanie07 {
    public static void main(String[] args) {

        int dlugosc=4;
        int pierwszyElement=2;
        int roznica=4;

        int[] tbl=new int[dlugosc];
        tbl[0]=pierwszyElement;

        for (int i=1;i<dlugosc;i++) {
            tbl[i]=tbl[i-1] + roznica;
        }

        for (int X: tbl) {
            System.out.print(X + " ");
        }


    }
}
