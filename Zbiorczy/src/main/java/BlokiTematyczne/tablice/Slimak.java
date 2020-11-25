package BlokiTematyczne.tablice;

public class Slimak {

    public static void main(String[] args) {

        int x = 4;

        int[][] tbl = new int[x][x]; //wszystkie są zerami

//tbl[1][3]=7; //rzad nr 1 kol nr 3
        int licznikZer = 0;

/*        for (int z=0; z<x;z++) {
            if (tbl[0][z]==0) {
                licznikZer=licznikZer+1;
            }
        }*/


        //złapac t wszystko w while

        tbl[0][0] = 1;
        licznikZer = (x * x) - 1;

        //poziom
        for (int i = 1; i < x; i++) {
            if (tbl[0][i] == 0) {
                tbl[0][i] = tbl[0][i - 1] + 1;
                licznikZer--;
            }
        }
        //pion
        for (int i2 = 1; i2 < x; i2++) {
            if (tbl[i2][3] == 0) {
                tbl[i2][3] = tbl[i2 - 1][3] + 1;
                licznikZer--;
            }
        }

        //  tbl[3][1]=1;

        for (int i = (x - 2); i >= 0; i--) {
            if (tbl[3][i] == 0) {
                tbl[3][i] = tbl[3][i + 1] + 1;
                licznikZer--;
            }
        }

        System.out.println("licznik zer po uzupelnieniu " + licznikZer);

        //zliczenie zer i na pdstawie tego "wielkosc"
        //for (int i=)


        //wyswietlenie tablicy
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(tbl[i][j]);
            }
            System.out.println();
        }


    }
}
