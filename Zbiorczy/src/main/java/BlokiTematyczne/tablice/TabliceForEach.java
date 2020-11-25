package BlokiTematyczne.tablice;

class TabliceForEach {
    public static void main(String[] args) {
        int[][] tablica = {{1, 2, 3}, {3, 5, 6}, {3, 6, 7}, {7, 7, 8}};
        System.out.println(tablica[3][2]); // [y][x] w dól, potem w bok tj 8


        System.out.println();
        System.out.println("Tablica z tablic");
        int[] tbl1 = new int[]{1, 1, 1, 1};
        int[] tbl2 = new int[]{2, 2, 2, 2};
        int[] tbl3 = new int[]{3, 3, 3, 3};
        int[][] tblzb = {tbl1, tbl2, tbl3};
        System.out.println(tblzb[2][2]); //wynik 3

        System.out.println("pfor each test");
        for (int forEachtest : tbl2) { //tak jakby od zera do długosci talicy
            System.out.println(forEachtest + ", ");
        }

        System.out.println();
        System.out.println("for each");
        // ponieważ tablica dwuwymiarowa jest zbiorem tablic jednowymiarowych
        // pętla foreach pobiera tablice jednowymiarowe
        for (int[] dupa : tblzb) { //licznikdupa odpowiednikiem int i
            // dopiero pętla wewnętrzna pobiera liczby
            for (int licznikDupa : dupa) {
                // dla liczb < 10 dodajemy 0 przed cyfrą
                if (licznikDupa < (tblzb.length))
                    System.out.print(licznikDupa + ",");
                else
                    System.out.print(licznikDupa + ",");
            }
            // nowa linia dla każdej 10-tki liczb
            System.out.println("");


        }

        for (int testdupa : tbl2) {
            testdupa = 4;
            System.out.println(testdupa);
        }

        int sum = 0;
        System.out.println("suma tablicy za pomoca for each");
        for (int sumatbl : tbl3) {
            sum=sum+sumatbl;

        }
        System.out.println(sum);

    }
}
