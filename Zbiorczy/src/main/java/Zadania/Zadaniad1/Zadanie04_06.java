package Zadania.Zadaniad1;

public class Zadanie04_06 {
    public static void main(String[] args) {

        int[] tbl = new int[]{-4, 2, 7, -5, 8, 0, -6};

        for (int i : tbl) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = (tbl.length - 1); i >= 0; i--) {
            System.out.print(tbl[i] + " ");
        }

/*        int[] liczby = { 0,1,2,3,4,5,6,7,8,9 };
        foreach (int i in liczby.Reverse())
        {
            Console.Write("{0} ", i);
        }*/
        System.out.println();
        int minimum = tbl[0];
        int maksimum=0;
        System.out.println();
        for (int i = 1; i < tbl.length; i++) {
            if (tbl[i] < tbl[i - 1]) {
                minimum = tbl[i];
            }
            if (tbl[i] > tbl[i - 1]) {
                maksimum = tbl[i];
            }

        }

        System.out.println("Najmniejsza liczba " + minimum + " największa liczba " + maksimum);


        System.out.println();

        int temp = 0;

        for (int i = 0; i < tbl.length; i++) {
            if (tbl[i] < 0) {
                temp = temp + 1;
            }
        }
        System.out.println("Liczb ujemnych " + temp);

        int[] ujemne=new int[temp];

        for (int i=0; i<ujemne.length;i++) {
            for (int j=0;j< tbl.length;j++) {
                if (tbl[j]<0) {
                    ujemne[i]=tbl[j];
                    i=i+1;
                }
            }
        }

        System.out.println("forem");
        for (int i=0;i< ujemne.length;i++) {
            System.out.print(ujemne[i] + " ");
        }
        System.out.println();
        System.out.println("for each");
        for (int i: ujemne) {
            System.out.print(i + " ");
        }

    }
}
